package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzag {
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzew zzewVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        String[] split;
        if (zzewVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(zzewVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> zza = zza(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!zza.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!zza.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (zza.isEmpty()) {
                return;
            }
            zzewVar.zzi().zza("Table has extra columns. table, columns", str, TextUtils.join(", ", zza));
        } catch (SQLiteException e) {
            zzewVar.zzf().zza("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static boolean zza(zzew zzewVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzewVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e) {
                zzewVar.zzi().zza("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzew zzewVar, SQLiteDatabase sQLiteDatabase) {
        if (zzewVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzewVar.zzi().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzewVar.zzi().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzewVar.zzi().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzewVar.zzi().zza("Failed to turn on database write permission for owner");
    }
}
