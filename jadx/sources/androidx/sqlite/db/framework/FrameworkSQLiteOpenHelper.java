package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.util.UUID;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public static final Companion Companion = new Companion(null);
    private final boolean allowDataLossOnRecovery;
    private final SupportSQLiteOpenHelper.Callback callback;
    private final Context context;
    private final InterfaceC8554dpx<OpenHelper> lazyDelegate;
    private final String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.name;
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        InterfaceC8554dpx<OpenHelper> b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) callback, "");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z;
        this.allowDataLossOnRecovery = z2;
        b = dpB.b(new drO<OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                String str2;
                Context context2;
                String str3;
                SupportSQLiteOpenHelper.Callback callback2;
                boolean z3;
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                boolean z4;
                boolean z5;
                Context context3;
                String str4;
                Context context4;
                SupportSQLiteOpenHelper.Callback callback3;
                boolean z6;
                str2 = FrameworkSQLiteOpenHelper.this.name;
                if (str2 != null) {
                    z5 = FrameworkSQLiteOpenHelper.this.useNoBackupDirectory;
                    if (z5) {
                        context3 = FrameworkSQLiteOpenHelper.this.context;
                        File noBackupFilesDir = SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(context3);
                        str4 = FrameworkSQLiteOpenHelper.this.name;
                        File file = new File(noBackupFilesDir, str4);
                        context4 = FrameworkSQLiteOpenHelper.this.context;
                        String absolutePath = file.getAbsolutePath();
                        FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
                        callback3 = FrameworkSQLiteOpenHelper.this.callback;
                        z6 = FrameworkSQLiteOpenHelper.this.allowDataLossOnRecovery;
                        openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context4, absolutePath, dBRefHolder, callback3, z6);
                        z4 = FrameworkSQLiteOpenHelper.this.writeAheadLoggingEnabled;
                        SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z4);
                        return openHelper;
                    }
                }
                context2 = FrameworkSQLiteOpenHelper.this.context;
                str3 = FrameworkSQLiteOpenHelper.this.name;
                FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
                callback2 = FrameworkSQLiteOpenHelper.this.callback;
                z3 = FrameworkSQLiteOpenHelper.this.allowDataLossOnRecovery;
                openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, str3, dBRefHolder2, callback2, z3);
                z4 = FrameworkSQLiteOpenHelper.this.writeAheadLoggingEnabled;
                SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z4);
                return openHelper;
            }
        });
        this.lazyDelegate = b;
    }

    private final OpenHelper getDelegate() {
        return this.lazyDelegate.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        if (this.lazyDelegate.isInitialized()) {
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(getDelegate(), z);
        }
        this.writeAheadLoggingEnabled = z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final Companion Companion = new Companion(null);
        private final boolean allowDataLossOnRecovery;
        private final SupportSQLiteOpenHelper.Callback callback;
        private final Context context;
        private final DBRefHolder dbRef;
        private final ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* loaded from: classes2.dex */
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* loaded from: classes2.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$$ExternalSyntheticLambda0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(SupportSQLiteOpenHelper.Callback.this, dBRefHolder, sQLiteDatabase);
                }
            });
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dBRefHolder, "");
            C8632dsu.c((Object) callback, "");
            this.context = context;
            this.dbRef = dBRefHolder;
            this.callback = callback;
            this.allowDataLossOnRecovery = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                C8632dsu.a(str, "");
            }
            this.lock = new ProcessLock(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SupportSQLiteOpenHelper.Callback callback, DBRefHolder dBRefHolder, SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) callback, "");
            C8632dsu.c((Object) dBRefHolder, "");
            Companion companion = Companion;
            C8632dsu.a(sQLiteDatabase, "");
            callback.onCorruption(companion.getWrappedDb(dBRefHolder, sQLiteDatabase));
        }

        public final SupportSQLiteDatabase getSupportDatabase(boolean z) {
            SupportSQLiteDatabase wrappedDb;
            ProcessLock processLock;
            try {
                this.lock.lock((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase innerGetDatabase = innerGetDatabase(z);
                if (this.migrated) {
                    close();
                    wrappedDb = getSupportDatabase(z);
                    processLock = this.lock;
                } else {
                    wrappedDb = getWrappedDb(innerGetDatabase);
                    processLock = this.lock;
                }
                processLock.unlock();
                return wrappedDb;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }

        private final SQLiteDatabase innerGetDatabase(boolean z) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.opened;
            if (databaseName != null && !z2 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = th;
                        Throwable cause = callbackException.getCause();
                        int i = WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
                        if (i == 1 || i == 2 || i == 3 || i == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException)) {
                        throw th;
                    } else {
                        if (databaseName == null || !this.allowDataLossOnRecovery) {
                            throw th;
                        }
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(z);
                    } catch (CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        private final SQLiteDatabase getWritableOrReadableDatabase(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                C8632dsu.a(writableDatabase, "");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            C8632dsu.a(readableDatabase, "");
            return readableDatabase;
        }

        public final FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            return Companion.getWrappedDb(this.dbRef, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            try {
                this.callback.onCreate(getWrappedDb(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            if (!this.migrated && this.callback.version != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.onConfigure(getWrappedDb(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                C8632dsu.c((Object) callbackName, "");
                C8632dsu.c((Object) th, "");
                this.callbackName = callbackName;
                this.cause = th;
            }
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final FrameworkSQLiteDatabase getWrappedDb(DBRefHolder dBRefHolder, SQLiteDatabase sQLiteDatabase) {
                C8632dsu.c((Object) dBRefHolder, "");
                C8632dsu.c((Object) sQLiteDatabase, "");
                FrameworkSQLiteDatabase db = dBRefHolder.getDb();
                if (db == null || !db.isDelegate(sQLiteDatabase)) {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                    dBRefHolder.setDb(frameworkSQLiteDatabase);
                    return frameworkSQLiteDatabase;
                }
                return db;
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DBRefHolder {
        private FrameworkSQLiteDatabase db;

        public final FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        public final void setDb(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        public DBRefHolder(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }
}
