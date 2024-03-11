package androidx.media3.database;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public interface DatabaseProvider {
    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}
