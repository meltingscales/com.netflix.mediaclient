package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SupportSQLiteCompat {

    /* loaded from: classes2.dex */
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        public static final void cancel(CancellationSignal cancellationSignal) {
            C8632dsu.c((Object) cancellationSignal, "");
            cancellationSignal.cancel();
        }

        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        public static final boolean deleteDatabase(File file) {
            C8632dsu.c((Object) file, "");
            return SQLiteDatabase.deleteDatabase(file);
        }

        public static final Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) strArr, "");
            C8632dsu.c((Object) cancellationSignal, "");
            C8632dsu.c((Object) cursorFactory, "");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
            C8632dsu.a(rawQueryWithFactory, "");
            return rawQueryWithFactory;
        }

        public static final boolean isWriteAheadLoggingEnabled(SQLiteDatabase sQLiteDatabase) {
            C8632dsu.c((Object) sQLiteDatabase, "");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        public static final void setWriteAheadLoggingEnabled(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            C8632dsu.c((Object) sQLiteOpenHelper, "");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        public static final Uri getNotificationUri(Cursor cursor) {
            C8632dsu.c((Object) cursor, "");
            Uri notificationUri = cursor.getNotificationUri();
            C8632dsu.a(notificationUri, "");
            return notificationUri;
        }

        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            C8632dsu.c((Object) activityManager, "");
            return activityManager.isLowRamDevice();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final File getNoBackupFilesDir(Context context) {
            C8632dsu.c((Object) context, "");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            C8632dsu.a(noBackupFilesDir, "");
            return noBackupFilesDir;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void setExtras(Cursor cursor, Bundle bundle) {
            C8632dsu.c((Object) cursor, "");
            C8632dsu.c((Object) bundle, "");
            cursor.setExtras(bundle);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void setNotificationUris(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
            C8632dsu.c((Object) cursor, "");
            C8632dsu.c((Object) contentResolver, "");
            C8632dsu.c((Object) list, "");
            cursor.setNotificationUris(contentResolver, list);
        }

        public static final List<Uri> getNotificationUris(Cursor cursor) {
            C8632dsu.c((Object) cursor, "");
            List<Uri> notificationUris = cursor.getNotificationUris();
            C8632dsu.d(notificationUris);
            return notificationUris;
        }
    }
}
