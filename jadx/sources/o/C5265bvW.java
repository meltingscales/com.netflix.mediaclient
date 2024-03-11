package o;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvW  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5265bvW implements InterfaceC5264bvV {
    private final EntityInsertionAdapter<C5340bws> a;
    private final RoomDatabase b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public C5265bvW(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
        this.a = new EntityInsertionAdapter<C5340bws>(roomDatabase) { // from class: o.bvW.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `playEvent` (`playableId`,`xid`,`eventTime`,`eventType`,`network`,`duration`,`offline`,`id`) VALUES (?,?,?,?,?,?,?,nullif(?, 0))";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: c */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5340bws c5340bws) {
                supportSQLiteStatement.bindString(1, c5340bws.h());
                supportSQLiteStatement.bindString(2, c5340bws.i());
                supportSQLiteStatement.bindLong(3, c5340bws.e());
                supportSQLiteStatement.bindLong(4, c5340bws.a());
                supportSQLiteStatement.bindLong(5, c5340bws.c());
                supportSQLiteStatement.bindLong(6, c5340bws.b());
                supportSQLiteStatement.bindLong(7, c5340bws.f() ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, c5340bws.d());
            }
        };
        this.d = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvW.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM playEvent where eventTime <= ?";
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvW.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM playEvent WHERE id IN (SELECT id FROM playEvent ORDER BY id ASC LIMIT ?)";
            }
        };
    }

    @Override // o.InterfaceC5264bvV
    public void e(C5340bws c5340bws) {
        this.b.assertNotSuspendingTransaction();
        this.b.beginTransaction();
        try {
            this.a.insert((EntityInsertionAdapter<C5340bws>) c5340bws);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    @Override // o.InterfaceC5264bvV
    public void a(long j) {
        this.b.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.d.acquire();
        acquire.bindLong(1, j);
        try {
            this.b.beginTransaction();
            acquire.executeUpdateDelete();
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } finally {
            this.d.release(acquire);
        }
    }

    @Override // o.InterfaceC5264bvV
    public void d(int i) {
        this.b.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.c.acquire();
        acquire.bindLong(1, i);
        try {
            this.b.beginTransaction();
            acquire.executeUpdateDelete();
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } finally {
            this.c.release(acquire);
        }
    }

    @Override // o.InterfaceC5264bvV
    public int d(long j, int i) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT count(*) FROM playEvent where eventTime >= ? AND network = ?", 2);
        acquire.bindLong(1, j);
        acquire.bindLong(2, i);
        this.b.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.b, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // o.InterfaceC5264bvV
    public List<C5340bws> a() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM playEvent WHERE id IN (SELECT id FROM playEvent ORDER BY id ASC LIMIT 1)", 0);
        this.b.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.b, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "xid");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "eventTime");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, Payload.PARAM_RENO_EVENT_TYPE);
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "network");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "offline");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.LANG_ID);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C5340bws c5340bws = new C5340bws(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getLong(columnIndexOrThrow6), query.getInt(columnIndexOrThrow7) != 0);
                c5340bws.d(query.getLong(columnIndexOrThrow8));
                arrayList.add(c5340bws);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // o.InterfaceC5264bvV
    public int b() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT count(*) from playEvent", 0);
        this.b.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.b, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }
}
