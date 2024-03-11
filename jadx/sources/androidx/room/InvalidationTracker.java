package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import o.C8576dqs;
import o.C8608drx;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.dpR;
import o.dqE;
import o.dqN;
import o.dqP;

/* loaded from: classes.dex */
public class InvalidationTracker {
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"UPDATE", "DELETE", "INSERT"};
    private AutoCloser autoCloser;
    private volatile SupportSQLiteStatement cleanupStatement;
    private final RoomDatabase database;
    private volatile boolean initialized;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private final ObservedTableTracker observedTableTracker;
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;
    private final AtomicBoolean pendingRefresh;
    public final Runnable refreshRunnable;
    private final Map<String, String> shadowTablesMap;
    private final Object syncTriggersLock;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;

    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        Object e;
        String str;
        C8632dsu.c((Object) roomDatabase, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) strArr, "");
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(strArr.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            C8632dsu.a(locale, "");
            String lowerCase = str2.toLowerCase(locale);
            C8632dsu.a(lowerCase, "");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i));
            String str3 = this.shadowTablesMap.get(strArr[i]);
            if (str3 != null) {
                C8632dsu.a(locale, "");
                str = str3.toLowerCase(locale);
                C8632dsu.a(str, "");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            Locale locale2 = Locale.US;
            C8632dsu.a(locale2, "");
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            C8632dsu.a(lowerCase2, "");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                C8632dsu.a(locale2, "");
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                C8632dsu.a(lowerCase3, "");
                Map<String, Integer> map3 = this.tableIdLookup;
                e = dqE.e(map3, lowerCase2);
                map3.put(lowerCase3, e);
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
                if (r0 != null) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
                if (r0 == null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
                if (r0 == null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
                if ((!r3.isEmpty()) == false) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
                r0 = r5.this$0.getObserverMap$room_runtime_release();
                r1 = r5.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
                if (r1.hasNext() == false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
                r1 = o.dpR.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }

            private final Set<Integer> checkUpdatedTable() {
                Set c;
                Set<Integer> c2;
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                c = dqP.c();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
                while (query$default.moveToNext()) {
                    try {
                        c.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                    }
                }
                dpR dpr = dpR.c;
                C8608drx.a(query$default, null);
                c2 = dqP.c(c);
                if (!c2.isEmpty()) {
                    if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                    if (cleanupStatement$room_runtime_release == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    cleanupStatement$room_runtime_release.executeUpdateDelete();
                }
                return c2;
            }
        };
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        C8632dsu.c((Object) autoCloser, "");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.InvalidationTracker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InvalidationTracker.this.onAutoCloseCallback();
            }
        });
    }

    public final void internalInit$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            syncTriggers$room_runtime_release(supportSQLiteDatabase);
            this.cleanupStatement = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.initialized = true;
            dpR dpr = dpR.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            SupportSQLiteStatement supportSQLiteStatement = this.cleanupStatement;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                dpR dpr = dpR.c;
            }
        }
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(Context context, String str, Intent intent) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) intent, "");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, intent, this, this.database.getQueryExecutor());
    }

    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            C8632dsu.a(str3, "");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.tablesNames[i];
        for (String str2 : TRIGGERS) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            C8632dsu.a(str3, "");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void addObserver(Observer observer) {
        int[] m;
        ObserverWrapper putIfAbsent;
        C8632dsu.c((Object) observer, "");
        String[] resolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(resolveViews.length);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale locale = Locale.US;
            C8632dsu.a(locale, "");
            String lowerCase = str.toLowerCase(locale);
            C8632dsu.a(lowerCase, "");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        m = C8576dqs.m(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, m, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(m, m.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    private final String[] resolveViews(String[] strArr) {
        Set c;
        Set c2;
        c = dqP.c();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale locale = Locale.US;
            C8632dsu.a(locale, "");
            String lowerCase = str.toLowerCase(locale);
            C8632dsu.a(lowerCase, "");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                C8632dsu.a(locale, "");
                String lowerCase2 = str.toLowerCase(locale);
                C8632dsu.a(lowerCase2, "");
                Set<String> set = map2.get(lowerCase2);
                C8632dsu.d(set);
                c.addAll(set);
            } else {
                c.add(str);
            }
        }
        c2 = dqP.c(c);
        return (String[]) c2.toArray(new String[0]);
    }

    @SuppressLint({"RestrictedApi"})
    public void removeObserver(Observer observer) {
        ObserverWrapper remove;
        C8632dsu.c((Object) observer, "");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = remove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            if (!this.initialized) {
                this.database.getOpenHelper().getWritableDatabase();
            }
            if (this.initialized) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    public final void notifyObserversByTableNames(String... strArr) {
        C8632dsu.c((Object) strArr, "");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C8632dsu.a(entry, "");
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!((Observer) entry.getKey()).isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(strArr);
                }
            }
            dpR dpr = dpR.c;
        }
    }

    public final void syncTriggers$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(supportSQLiteDatabase);
                    int length = tablesToSync.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = tablesToSync[i];
                        if (i3 == 1) {
                            startTrackingTable(supportSQLiteDatabase, i2);
                        } else if (i3 == 2) {
                            stopTrackingTable(supportSQLiteDatabase, i2);
                        }
                        i++;
                        i2++;
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    dpR dpr = dpR.c;
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObserverWrapper {
        private final Observer observer;
        private final Set<String> singleTableSet;
        private final int[] tableIds;
        private final String[] tableNames;

        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            Set<String> e;
            C8632dsu.c((Object) observer, "");
            C8632dsu.c((Object) iArr, "");
            C8632dsu.c((Object) strArr, "");
            this.observer = observer;
            this.tableIds = iArr;
            this.tableNames = strArr;
            if (!(strArr.length == 0)) {
                e = dqP.a(strArr[0]);
            } else {
                e = dqN.e();
            }
            this.singleTableSet = e;
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(Set<Integer> set) {
            Set<String> e;
            Set c;
            C8632dsu.c((Object) set, "");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length == 1) {
                    e = set.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : dqN.e();
                } else {
                    c = dqP.c();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        if (set.contains(Integer.valueOf(iArr2[i]))) {
                            c.add(this.tableNames[i2]);
                        }
                        i++;
                        i2++;
                    }
                    e = dqP.c(c);
                }
            } else {
                e = dqN.e();
            }
            if (!e.isEmpty()) {
                this.observer.onInvalidated(e);
            }
        }

        public final void notifyByTableNames$room_runtime_release(String[] strArr) {
            Set<String> e;
            boolean a;
            Set c;
            String[] strArr2;
            boolean a2;
            C8632dsu.c((Object) strArr, "");
            int length = this.tableNames.length;
            if (length != 0) {
                if (length != 1) {
                    c = dqP.c();
                    for (String str : strArr) {
                        for (String str2 : this.tableNames) {
                            a2 = C8691duz.a(str2, str, true);
                            if (a2) {
                                c.add(str2);
                            }
                        }
                    }
                    e = dqP.c(c);
                } else {
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            a = C8691duz.a(strArr[i], this.tableNames[0], true);
                            if (a) {
                                e = this.singleTableSet;
                                break;
                            }
                            i++;
                        } else {
                            e = dqN.e();
                            break;
                        }
                    }
                }
            } else {
                e = dqN.e();
            }
            if (!e.isEmpty()) {
                this.observer.onInvalidated(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Observer {
        private final String[] tables;

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);

        public Observer(String[] strArr) {
            C8632dsu.c((Object) strArr, "");
            this.tables = strArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObservedTableTracker {
        public static final Companion Companion = new Companion(null);
        private boolean needsSync;
        private final long[] tableObservers;
        private final int[] triggerStateChanges;
        private final boolean[] triggerStates;

        public ObservedTableTracker(int i) {
            this.tableObservers = new long[i];
            this.triggerStates = new boolean[i];
            this.triggerStateChanges = new int[i];
        }

        public final boolean onAdded(int... iArr) {
            boolean z;
            C8632dsu.c((Object) iArr, "");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                dpR dpr = dpR.c;
            }
            return z;
        }

        public final boolean onRemoved(int... iArr) {
            boolean z;
            C8632dsu.c((Object) iArr, "");
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.tableObservers;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.needsSync = true;
                    }
                }
                dpR dpr = dpR.c;
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                dpR dpr = dpR.c;
            }
        }

        public final int[] getTablesToSync() {
            synchronized (this) {
                if (this.needsSync) {
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = 1;
                        boolean z = jArr[i] > 0;
                        boolean[] zArr = this.triggerStates;
                        if (z != zArr[i2]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.triggerStateChanges[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2++;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                }
                return null;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final String getTriggerName$room_runtime_release(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        public final void beginTransactionInternal$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            if (supportSQLiteDatabase.isWriteAheadLoggingEnabled()) {
                supportSQLiteDatabase.beginTransactionNonExclusive();
            } else {
                supportSQLiteDatabase.beginTransaction();
            }
        }
    }
}
