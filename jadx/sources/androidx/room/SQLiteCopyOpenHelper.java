package androidx.room;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import o.C8608drx;
import o.C8632dsu;
import o.C8657dts;
import o.C9571sB;
import o.dpR;

/* loaded from: classes.dex */
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private static int a = 0;
    private static int d = 1;
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;
    public static final byte[] e = {68, 48, 110, -56, 5, 8, 6, -56, 62, 20, 9, 17, -68, 67, 5, 15, 12, -3, 21};
    public static final int c = 236;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = androidx.room.SQLiteCopyOpenHelper.e
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 114 - r7
            int r8 = r8 * 2
            int r1 = 16 - r8
            byte[] r1 = new byte[r1]
            int r8 = 15 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.SQLiteCopyOpenHelper.b(byte, int, byte, java.lang.Object[]):void");
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        C8632dsu.c((Object) databaseConfiguration, "");
        this.databaseConfiguration = databaseConfiguration;
    }

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) supportSQLiteOpenHelper, "");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = supportSQLiteOpenHelper;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            getDelegate().close();
            this.verified = false;
        }
    }

    private final void verifyDatabaseFile(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            C8632dsu.d("");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    C8632dsu.a(databasePath, "");
                    copyDatabaseFile(databasePath, z);
                    processLock.unlock();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            try {
                C8632dsu.a(databasePath, "");
                int readVersion = DBUtil.readVersion(databasePath);
                if (readVersion == this.databaseVersion) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    C8632dsu.d("");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(readVersion, this.databaseVersion)) {
                    processLock.unlock();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                processLock.unlock();
                return;
            }
        } catch (Throwable th) {
            processLock.unlock();
            throw th;
        }
        processLock.unlock();
        throw th;
    }

    private final void copyDatabaseFile(File file, boolean z) {
        ReadableByteChannel newChannel;
        int i = 2 % 2;
        if (this.copyFromAssetPath != null) {
            try {
                Object[] objArr = {this.context.getAssets(), this.copyFromAssetPath};
                Object obj = C9571sB.s.get(-59237389);
                if (obj == null) {
                    obj = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                    C9571sB.s.put(-59237389, obj);
                }
                newChannel = Channels.newChannel((InputStream) ((Method) obj).invoke(null, objArr));
                C8632dsu.a(newChannel, "");
                int i2 = d + 83;
                a = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
            C8632dsu.a(newChannel, "");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            int i4 = a + 93;
            d = i4 % 128;
            int i5 = i4 % 2;
            try {
                newChannel = Channels.newChannel(callable.call());
                C8632dsu.a(newChannel, "");
            } catch (Exception e2) {
                throw new IOException("inputStreamCallable exception on call", e2);
            }
        }
        File cacheDir = this.context.getCacheDir();
        byte b = (byte) 0;
        byte b2 = b;
        Object[] objArr2 = new Object[1];
        b(b, b2, b2, objArr2);
        File createTempFile = File.createTempFile((String) objArr2[0], ".tmp", cacheDir);
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        C8632dsu.a(channel, "");
        FileUtil.copy(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            if (!parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            int i6 = d + 83;
            a = i6 % 128;
            int i7 = i6 % 2;
        }
        C8632dsu.a(createTempFile, "");
        dispatchOnOpenPrepackagedDatabase(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z) {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            C8632dsu.d("");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            SupportSQLiteDatabase writableDatabase = z ? createFrameworkOpenHelper.getWritableDatabase() : createFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                C8632dsu.d("");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            C8632dsu.d(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            dpR dpr = dpR.c;
            C8608drx.a(createFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        final int b;
        try {
            final int readVersion = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder name = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            b = C8657dts.b(readVersion, 1);
            return frameworkSQLiteOpenHelperFactory.create(name.callback(new SupportSQLiteOpenHelper.Callback(b) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                    C8632dsu.c((Object) supportSQLiteDatabase, "");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
                    C8632dsu.c((Object) supportSQLiteDatabase, "");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                    C8632dsu.c((Object) supportSQLiteDatabase, "");
                    int i = readVersion;
                    if (i < 1) {
                        supportSQLiteDatabase.setVersion(i);
                    }
                }
            }).build());
        } catch (IOException e2) {
            throw new RuntimeException("Malformed database file, unable to read version.", e2);
        }
    }
}
