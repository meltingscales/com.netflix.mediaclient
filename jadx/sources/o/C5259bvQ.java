package o;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvQ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5259bvQ implements InterfaceC5263bvU {
    private final RoomDatabase a;
    private final EntityDeletionOrUpdateAdapter<C5336bwo> c;
    private final EntityInsertionAdapter<C5336bwo> e;

    public C5259bvQ(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.e = new EntityInsertionAdapter<C5336bwo>(roomDatabase) { // from class: o.bvQ.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `offlineFalkorProfile` (`profileId`,`name`,`isKids`,`avatarUrl`) VALUES (?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: c */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5336bwo c5336bwo) {
                supportSQLiteStatement.bindString(1, c5336bwo.e);
                supportSQLiteStatement.bindString(2, c5336bwo.a);
                supportSQLiteStatement.bindLong(3, c5336bwo.b ? 1L : 0L);
                String str = c5336bwo.d;
                if (str == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str);
                }
            }
        };
        this.c = new EntityDeletionOrUpdateAdapter<C5336bwo>(roomDatabase) { // from class: o.bvQ.5
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `offlineFalkorProfile` WHERE `profileId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* renamed from: e */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5336bwo c5336bwo) {
                supportSQLiteStatement.bindString(1, c5336bwo.e);
            }
        };
    }

    @Override // o.InterfaceC5263bvU
    public void c(C5336bwo c5336bwo) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.e.insert((EntityInsertionAdapter<C5336bwo>) c5336bwo);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // o.InterfaceC5263bvU
    public void a(List<C5336bwo> list) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.c.handleMultiple(list);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // o.InterfaceC5263bvU
    public List<C5336bwo> d() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM offlineFalkorProfile", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "profileId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "isKids");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "avatarUrl");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C5336bwo c5336bwo = new C5336bwo();
                c5336bwo.e = query.getString(columnIndexOrThrow);
                c5336bwo.a = query.getString(columnIndexOrThrow2);
                c5336bwo.b = query.getInt(columnIndexOrThrow3) != 0;
                if (query.isNull(columnIndexOrThrow4)) {
                    c5336bwo.d = null;
                } else {
                    c5336bwo.d = query.getString(columnIndexOrThrow4);
                }
                arrayList.add(c5336bwo);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // o.InterfaceC5263bvU
    public int b(String str, String str2, String str3) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM offlineFalkorProfile WHERE profileId = ? AND name = ? AND avatarUrl = ?", 3);
        acquire.bindString(1, str);
        acquire.bindString(2, str2);
        acquire.bindString(3, str3);
        this.a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.a, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }
}
