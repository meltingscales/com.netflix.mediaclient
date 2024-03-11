package o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceC5326bwe;

/* renamed from: o.bwi  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5330bwi implements InterfaceC5326bwe {
    private final SharedSQLiteStatement a;
    private final RoomDatabase b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;
    private final EntityInsertionAdapter<C5341bwt> e;

    public C5330bwi(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
        this.e = new EntityInsertionAdapter<C5341bwt>(roomDatabase) { // from class: o.bwi.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `userMarkStore` (`markId`,`profileId`,`videoId`,`runtime`,`timestamp`,`title`,`parentTitle`,`imageUrl`,`videoType`,`position`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: b */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5341bwt c5341bwt) {
                supportSQLiteStatement.bindString(1, c5341bwt.a());
                supportSQLiteStatement.bindString(2, c5341bwt.e());
                supportSQLiteStatement.bindString(3, c5341bwt.h());
                supportSQLiteStatement.bindLong(4, c5341bwt.f());
                supportSQLiteStatement.bindLong(5, c5341bwt.g());
                supportSQLiteStatement.bindString(6, c5341bwt.i());
                if (c5341bwt.d() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, c5341bwt.d());
                }
                if (c5341bwt.b() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, c5341bwt.b());
                }
                supportSQLiteStatement.bindLong(9, c5341bwt.j());
                supportSQLiteStatement.bindLong(10, c5341bwt.c());
            }
        };
        this.d = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwi.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE userMarkStore SET position = ? WHERE markId=?";
            }
        };
        this.a = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwi.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM userMarkStore WHERE profileId = ?";
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwi.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM userMarkStore WHERE markId = ?";
            }
        };
    }

    @Override // o.InterfaceC5326bwe
    public void e(C5341bwt c5341bwt) {
        this.b.assertNotSuspendingTransaction();
        this.b.beginTransaction();
        try {
            this.e.insert((EntityInsertionAdapter<C5341bwt>) c5341bwt);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b(C5341bwt c5341bwt, InterfaceC8585dra interfaceC8585dra) {
        return InterfaceC5326bwe.a.d(this, c5341bwt, interfaceC8585dra);
    }

    @Override // o.InterfaceC5326bwe
    public Object e(final C5341bwt c5341bwt, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return RoomDatabaseKt.withTransaction(this.b, new drM() { // from class: o.bwh
            @Override // o.drM
            public final Object invoke(Object obj) {
                Object b;
                b = C5330bwi.this.b(c5341bwt, (InterfaceC8585dra) obj);
                return b;
            }
        }, interfaceC8585dra);
    }

    @Override // o.InterfaceC5326bwe
    public void d(List<C5341bwt> list) {
        this.b.beginTransaction();
        try {
            InterfaceC5326bwe.a.e(this, list);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    @Override // o.InterfaceC5326bwe
    public void d(String str, long j) {
        this.b.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.d.acquire();
        acquire.bindLong(1, j);
        acquire.bindString(2, str);
        try {
            this.b.beginTransaction();
            acquire.executeUpdateDelete();
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } finally {
            this.d.release(acquire);
        }
    }

    @Override // o.InterfaceC5326bwe
    public void a(String str) {
        this.b.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.a.acquire();
        acquire.bindString(1, str);
        try {
            this.b.beginTransaction();
            acquire.executeUpdateDelete();
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } finally {
            this.a.release(acquire);
        }
    }

    @Override // o.InterfaceC5326bwe
    public void e(String str) {
        this.b.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.c.acquire();
        acquire.bindString(1, str);
        try {
            this.b.beginTransaction();
            acquire.executeUpdateDelete();
            this.b.setTransactionSuccessful();
            this.b.endTransaction();
        } finally {
            this.c.release(acquire);
        }
    }

    @Override // o.InterfaceC5326bwe
    public Object c(String str, InterfaceC8585dra<? super List<C5341bwt>> interfaceC8585dra) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM userMarkStore WHERE profileId = ? ORDER BY position ASC", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.b, false, DBUtil.createCancellationSignal(), new Callable<List<C5341bwt>>() { // from class: o.bwi.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<C5341bwt> call() {
                Cursor query = DBUtil.query(C5330bwi.this.b, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "markId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "profileId");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.VIDEO_ID);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "runtime");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "timestamp");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.VIDEO_TITLE);
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "parentTitle");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "videoType");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "position");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new C5341bwt(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getString(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getInt(columnIndexOrThrow9), query.getLong(columnIndexOrThrow10)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, interfaceC8585dra);
    }

    @Override // o.InterfaceC5326bwe
    public Object a(String str, InterfaceC8585dra<? super Long> interfaceC8585dra) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM userMarkStore WHERE profileId = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.b, false, DBUtil.createCancellationSignal(), new Callable<Long>() { // from class: o.bwi.7
            @Override // java.util.concurrent.Callable
            /* renamed from: d */
            public Long call() {
                long j;
                Cursor query = DBUtil.query(C5330bwi.this.b, acquire, false, null);
                try {
                    if (query.moveToFirst()) {
                        j = Long.valueOf(query.getLong(0));
                    } else {
                        j = 0L;
                    }
                    return j;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, interfaceC8585dra);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }
}
