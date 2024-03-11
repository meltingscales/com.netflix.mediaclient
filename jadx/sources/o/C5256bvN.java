package o;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvN  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5256bvN implements InterfaceC5254bvL {
    private final RoomDatabase a;
    private final EntityInsertionAdapter<C5328bwg> b;
    private final SharedSQLiteStatement e;

    public C5256bvN(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new EntityInsertionAdapter<C5328bwg>(roomDatabase) { // from class: o.bvN.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `bookmarkStore` (`playableId`,`profileId`,`bookmarkInMs`,`bookmarkUpdateTimeInUTCMs`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: d */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5328bwg c5328bwg) {
                supportSQLiteStatement.bindString(1, c5328bwg.b());
                supportSQLiteStatement.bindString(2, c5328bwg.c());
                supportSQLiteStatement.bindLong(3, c5328bwg.a());
                supportSQLiteStatement.bindLong(4, c5328bwg.d());
            }
        };
        this.e = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvN.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM bookmarkStore WHERE playableId = ? AND  profileId = ?";
            }
        };
    }

    @Override // o.InterfaceC5254bvL
    public void b(C5328bwg c5328bwg) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert((EntityInsertionAdapter<C5328bwg>) c5328bwg);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // o.InterfaceC5254bvL
    public void c(List<C5328bwg> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.b.insert(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // o.InterfaceC5254bvL
    public void a(String str, String str2) {
        this.a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.e.acquire();
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        try {
            this.a.beginTransaction();
            acquire.executeUpdateDelete();
            this.a.setTransactionSuccessful();
            this.a.endTransaction();
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // o.InterfaceC5254bvL
    public List<C5328bwg> c() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM bookmarkStore", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "profileId");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "bookmarkInMs");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "bookmarkUpdateTimeInUTCMs");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new C5328bwg(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getLong(columnIndexOrThrow4)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // o.InterfaceC5254bvL
    public void e(List<String> list) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("DELETE FROM bookmarkStore WHERE profileId IN(");
        StringUtil.appendPlaceholders(newStringBuilder, list == null ? 1 : list.size());
        newStringBuilder.append(") ");
        SupportSQLiteStatement compileStatement = this.a.compileStatement(newStringBuilder.toString());
        if (list == null) {
            compileStatement.bindNull(1);
        } else {
            int i = 1;
            for (String str : list) {
                compileStatement.bindString(i, str);
                i++;
            }
        }
        this.a.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    public static List<Class<?>> b() {
        return Collections.emptyList();
    }
}
