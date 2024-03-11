package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.dqE;
import o.dqN;
import o.drM;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    public List<? extends Callback> mCallbacks;
    public volatile SupportSQLiteDatabase mDatabase;
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();
    private Map<Class<? extends Object>, Object> autoMigrationSpecs = new LinkedHashMap();
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static abstract class Callback {
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }
    }

    /* loaded from: classes.dex */
    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    protected abstract InvalidationTracker createInvalidationTracker();

    protected abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration);

    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C8632dsu.a(synchronizedMap, "");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            C8632dsu.d("");
            return null;
        }
        return executor;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            C8632dsu.d("");
            return null;
        }
        return executor;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper == null) {
            C8632dsu.d("");
            return null;
        }
        return supportSQLiteOpenHelper;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        C8632dsu.a(readLock, "");
        return readLock;
    }

    public void init(DatabaseConfiguration databaseConfiguration) {
        C8632dsu.c((Object) databaseConfiguration, "");
        this.internalOpenHelper = createOpenHelper(databaseConfiguration);
        Set<Class<? extends Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends Object>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                Class<? extends Object> next = it.next();
                int size = databaseConfiguration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (next.isAssignableFrom(databaseConfiguration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, databaseConfiguration.autoMigrationSpecs.get(i));
            } else {
                int size2 = databaseConfiguration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size2 = i3;
                    }
                }
                for (Migration migration : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!databaseConfiguration.migrationContainer.contains(migration.startVersion, migration.endVersion)) {
                        databaseConfiguration.migrationContainer.addMigrations(migration);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(databaseConfiguration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                boolean z = databaseConfiguration.journalMode == JournalMode.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z);
                this.mCallbacks = databaseConfiguration.callbacks;
                this.internalQueryExecutor = databaseConfiguration.queryExecutor;
                this.internalTransactionExecutor = new TransactionExecutor(databaseConfiguration.transactionExecutor);
                this.allowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z;
                if (databaseConfiguration.multiInstanceInvalidationServiceIntent != null) {
                    if (databaseConfiguration.name == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(databaseConfiguration.context, databaseConfiguration.name, databaseConfiguration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = databaseConfiguration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                if (cls.isAssignableFrom(databaseConfiguration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, databaseConfiguration.typeConverters.get(size3));
                    }
                }
                int size4 = databaseConfiguration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i5 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + databaseConfiguration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    } else if (i5 < 0) {
                        return;
                    } else {
                        size4 = i5;
                    }
                }
            }
        }
    }

    public List<Migration> getAutoMigrations(Map<Class<? extends Object>, Object> map) {
        List<Migration> i;
        C8632dsu.c((Object) map, "");
        i = C8569dql.i();
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        Map<Class<?>, List<Class<?>>> d;
        d = dqE.d();
        return d;
    }

    public Set<Class<? extends Object>> getRequiredAutoMigrationSpecs() {
        Set<Class<? extends Object>> e;
        e = dqN.e();
        return e;
    }

    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        C8632dsu.c((Object) supportSQLiteQuery, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(supportSQLiteQuery, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(supportSQLiteQuery);
    }

    public SupportSQLiteStatement compileStatement(String str) {
        C8632dsu.c((Object) str, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(str);
    }

    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new drM<SupportSQLiteDatabase, Object>() { // from class: androidx.room.RoomDatabase$beginTransaction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                    C8632dsu.c((Object) supportSQLiteDatabase, "");
                    RoomDatabase.this.internalBeginTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new drM<SupportSQLiteDatabase, Object>() { // from class: androidx.room.RoomDatabase$endTransaction$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public final Object invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
                    C8632dsu.c((Object) supportSQLiteDatabase, "");
                    RoomDatabase.this.internalEndTransaction();
                    return null;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public void runInTransaction(Runnable runnable) {
        C8632dsu.c((Object) runnable, "");
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        getInvalidationTracker().internalInit$room_runtime_release(supportSQLiteDatabase);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* loaded from: classes.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public final JournalMode resolve$room_runtime_release(Context context) {
            C8632dsu.c((Object) context, "");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }
    }

    /* loaded from: classes.dex */
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private List<Object> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SupportSQLiteOpenHelper.Factory factory;
        private JournalMode journalMode;
        private final Class<T> klass;
        private final MigrationContainer migrationContainer;
        private Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private Executor queryCallbackExecutor;
        private Executor queryExecutor;
        private boolean requireMigration;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            C8632dsu.c((Object) executor, "");
            this.queryExecutor = executor;
            return this;
        }

        public Builder(Context context, Class<T> cls, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) cls, "");
            this.context = context;
            this.klass = cls;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        public Builder<T> addMigrations(Migration... migrationArr) {
            C8632dsu.c((Object) migrationArr, "");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Migration migration : migrationArr) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                C8632dsu.d(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                C8632dsu.d(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            C8632dsu.c((Object) callback, "");
            this.callbacks.add(callback);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T build() {
            /*
                Method dump skipped, instructions count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.Builder.build():androidx.room.RoomDatabase");
        }
    }

    /* loaded from: classes.dex */
    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        private final void addMigration(Migration migration) {
            int i = migration.startVersion;
            int i2 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i2), migration);
        }

        public List<Migration> findMigrationPath(int i, int i2) {
            List<Migration> i3;
            if (i == i2) {
                i3 = C8569dql.i();
                return i3;
            }
            return findUpMigrationPath(new ArrayList(), i2 > i, i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r6.migrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = ""
                if (r8 == 0) goto L44
                o.C8632dsu.a(r3, r4)
                int r4 = r3.intValue()
                int r5 = r9 + 1
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                o.C8632dsu.a(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                o.C8632dsu.d(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public final boolean contains(int i, int i2) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (migrations.containsKey(Integer.valueOf(i))) {
                Map<Integer, Migration> map = migrations.get(Integer.valueOf(i));
                if (map == null) {
                    map = dqE.d();
                }
                return map.containsKey(Integer.valueOf(i2));
            }
            return false;
        }

        public void addMigrations(Migration... migrationArr) {
            C8632dsu.c((Object) migrationArr, "");
            for (Migration migration : migrationArr) {
                addMigration(migration);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
