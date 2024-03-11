package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.C8566dqi;
import o.C8576dqs;
import o.C8608drx;
import o.C8632dsu;
import o.dqD;
import o.dqE;
import o.dqP;

/* loaded from: classes5.dex */
public final class TableInfoKt {
    public static final TableInfo readTableInfo(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        C8632dsu.c((Object) str, "");
        return new TableInfo(str, readColumns(supportSQLiteDatabase, str), readForeignKeys(supportSQLiteDatabase, str), readIndices(supportSQLiteDatabase, str));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set c;
        Set<TableInfo.ForeignKey> c2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex(SignupConstants.Field.LANG_ID);
            int columnIndex2 = query.getColumnIndex("seq");
            int columnIndex3 = query.getColumnIndex("table");
            int columnIndex4 = query.getColumnIndex("on_delete");
            int columnIndex5 = query.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings = readForeignKeyFieldMappings(query);
            query.moveToPosition(-1);
            c = dqP.c();
            while (query.moveToNext()) {
                if (query.getInt(columnIndex2) == 0) {
                    int i = query.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : readForeignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = query.getString(columnIndex3);
                    C8632dsu.a(string, "");
                    String string2 = query.getString(columnIndex4);
                    C8632dsu.a(string2, "");
                    String string3 = query.getString(columnIndex5);
                    C8632dsu.a(string3, "");
                    c.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            c2 = dqP.c(c);
            C8608drx.a(query, null);
            return c2;
        } finally {
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        List a;
        List o2;
        List<TableInfo.ForeignKeyWithSequence> P;
        int columnIndex = cursor.getColumnIndex(SignupConstants.Field.LANG_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(NetflixActivity.EXTRA_FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        a = C8566dqi.a();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C8632dsu.a(string, "");
            String string2 = cursor.getString(columnIndex4);
            C8632dsu.a(string2, "");
            a.add(new TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        o2 = C8566dqi.o(a);
        P = C8576dqs.P(o2);
        return P;
    }

    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Map e;
        Map<String, TableInfo.Column> h;
        Map<String, TableInfo.Column> d;
        Cursor query = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (query.getColumnCount() <= 0) {
                d = dqE.d();
                C8608drx.a(query, null);
                return d;
            }
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("notnull");
            int columnIndex4 = query.getColumnIndex("pk");
            int columnIndex5 = query.getColumnIndex("dflt_value");
            e = dqD.e();
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                String string2 = query.getString(columnIndex2);
                boolean z = query.getInt(columnIndex3) != 0;
                int i = query.getInt(columnIndex4);
                String string3 = query.getString(columnIndex5);
                C8632dsu.a(string, "");
                C8632dsu.a(string2, "");
                e.put(string, new TableInfo.Column(string, string2, z, i, string3, 2));
            }
            h = dqD.h(e);
            C8608drx.a(query, null);
            return h;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C8608drx.a(query, th);
                throw th2;
            }
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Set c;
        Set<TableInfo.Index> c2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
            int columnIndex3 = query.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                c = dqP.c();
                while (query.moveToNext()) {
                    if (C8632dsu.c((Object) "c", (Object) query.getString(columnIndex2))) {
                        String string = query.getString(columnIndex);
                        boolean z = true;
                        if (query.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        C8632dsu.a(string, "");
                        TableInfo.Index readIndex = readIndex(supportSQLiteDatabase, string, z);
                        if (readIndex == null) {
                            C8608drx.a(query, null);
                            return null;
                        }
                        c.add(readIndex);
                    }
                }
                c2 = dqP.c(c);
                C8608drx.a(query, null);
                return c2;
            }
            C8608drx.a(query, null);
            return null;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        List U;
        List U2;
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("seqno");
            int columnIndex2 = query.getColumnIndex("cid");
            int columnIndex3 = query.getColumnIndex("name");
            int columnIndex4 = query.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (query.moveToNext()) {
                    if (query.getInt(columnIndex2) >= 0) {
                        int i = query.getInt(columnIndex);
                        String string = query.getString(columnIndex3);
                        String str2 = query.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        C8632dsu.a(string, "");
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                C8632dsu.a(values, "");
                U = C8576dqs.U(values);
                Collection values2 = treeMap2.values();
                C8632dsu.a(values2, "");
                U2 = C8576dqs.U(values2);
                TableInfo.Index index = new TableInfo.Index(str, z, U, U2);
                C8608drx.a(query, null);
                return index;
            }
            C8608drx.a(query, null);
            return null;
        } finally {
        }
    }
}
