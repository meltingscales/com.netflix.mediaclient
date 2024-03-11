package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* loaded from: classes2.dex */
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public static final Companion Companion = new Companion(null);
        public final int version;

        public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public Callback(int i) {
            this.version = i;
        }

        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onCorruption(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + supportSQLiteDatabase + ".path");
            if (!supportSQLiteDatabase.isOpen()) {
                String path = supportSQLiteDatabase.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = supportSQLiteDatabase.getAttachedDbs();
                } finally {
                    if (list == null) {
                        String path2 = supportSQLiteDatabase.getPath();
                        if (path2 != null) {
                            deleteDatabaseFile(path2);
                        }
                    } else {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            C8632dsu.a(obj, "");
                            deleteDatabaseFile((String) obj);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                supportSQLiteDatabase.close();
            } catch (IOException unused2) {
                if (list != null) {
                    return;
                }
            }
        }

        private final void deleteDatabaseFile(String str) {
            boolean a;
            a = C8691duz.a(str, ":memory:", true);
            if (a) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = C8632dsu.d(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
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
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final Callback callback;
        public final Context context;
        public final String name;
        public final boolean useNoBackupDirectory;

        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }

        public Configuration(Context context, String str, Callback callback, boolean z, boolean z2) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) callback, "");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        /* loaded from: classes2.dex */
        public static class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder callback(Callback callback) {
                C8632dsu.c((Object) callback, "");
                this.callback = callback;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder noBackupDirectory(boolean z) {
                this.useNoBackupDirectory = z;
                return this;
            }

            public Builder(Context context) {
                C8632dsu.c((Object) context, "");
                this.context = context;
            }

            public Configuration build() {
                String str;
                Callback callback = this.callback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.useNoBackupDirectory && ((str = this.name) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final Builder builder(Context context) {
                C8632dsu.c((Object) context, "");
                return new Builder(context);
            }
        }
    }
}
