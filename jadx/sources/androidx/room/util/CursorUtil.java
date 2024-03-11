package androidx.room.util;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import o.C8563dqf;
import o.C8608drx;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes5.dex */
public final class CursorUtil {
    public static final Cursor copyAndClose(Cursor cursor) {
        C8632dsu.c((Object) cursor, "");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            C8608drx.a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    public static final int getColumnIndex(Cursor cursor, String str) {
        C8632dsu.c((Object) cursor, "");
        C8632dsu.c((Object) str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : findColumnIndexBySuffix(cursor, str);
    }

    public static final int getColumnIndexOrThrow(Cursor cursor, String str) {
        String str2;
        C8632dsu.c((Object) cursor, "");
        C8632dsu.c((Object) str, "");
        int columnIndex = getColumnIndex(cursor, str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C8632dsu.a(columnNames, "");
            str2 = C8563dqf.d(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    private static final int findColumnIndexBySuffix(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = cursor.getColumnNames();
            C8632dsu.a(columnNames, "");
            return findColumnIndexBySuffix(columnNames, str);
        }
        return -1;
    }

    public static final int findColumnIndexBySuffix(String[] strArr, String str) {
        boolean a;
        boolean a2;
        C8632dsu.c((Object) strArr, "");
        C8632dsu.c((Object) str, "");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            if (str4.length() >= str.length() + 2) {
                a = C8691duz.a(str4, str2, false, 2, null);
                if (a) {
                    return i2;
                }
                if (str4.charAt(0) == '`') {
                    a2 = C8691duz.a(str4, str3, false, 2, null);
                    if (a2) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i++;
            i2++;
        }
        return -1;
    }
}
