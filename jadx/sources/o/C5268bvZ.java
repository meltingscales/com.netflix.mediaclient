package o;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvZ  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5268bvZ implements InterfaceC5266bvX {
    private final SharedSQLiteStatement a;
    private final SharedSQLiteStatement b;
    private final RoomDatabase c;
    private final EntityInsertionAdapter<C5335bwn> d;
    private final SharedSQLiteStatement e;

    public C5268bvZ(RoomDatabase roomDatabase) {
        this.c = roomDatabase;
        this.d = new EntityInsertionAdapter<C5335bwn>(roomDatabase) { // from class: o.bvZ.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `PersistedManifest` (`expires`,`manifest`,`playableId`,`netType`,`netId`,`isBranching`,`supportsLanguageSelector`,`preferredAudio`,`preferredSubtitle`,`preferredAssistive`,`token`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: e */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5335bwn c5335bwn) {
                supportSQLiteStatement.bindLong(1, c5335bwn.a());
                supportSQLiteStatement.bindString(2, c5335bwn.c());
                C5331bwj d = c5335bwn.d();
                supportSQLiteStatement.bindLong(3, d.a());
                supportSQLiteStatement.bindLong(4, d.b());
                supportSQLiteStatement.bindLong(5, d.d());
                supportSQLiteStatement.bindLong(6, d.h() ? 1L : 0L);
                supportSQLiteStatement.bindLong(7, d.g() ? 1L : 0L);
                supportSQLiteStatement.bindString(8, d.c());
                supportSQLiteStatement.bindString(9, d.j());
                supportSQLiteStatement.bindString(10, d.e());
                supportSQLiteStatement.bindString(11, d.i());
            }
        };
        this.a = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvZ.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM PersistedManifest WHERE playableId = ?";
            }
        };
        this.e = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvZ.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM PersistedManifest WHERE expires < ?";
            }
        };
        this.b = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvZ.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM PersistedManifest";
            }
        };
    }

    @Override // o.InterfaceC5266bvX
    public void a(C5335bwn c5335bwn) {
        this.c.assertNotSuspendingTransaction();
        this.c.beginTransaction();
        try {
            this.d.insert((EntityInsertionAdapter<C5335bwn>) c5335bwn);
            this.c.setTransactionSuccessful();
        } finally {
            this.c.endTransaction();
        }
    }

    @Override // o.InterfaceC5266bvX
    public int a(long j) {
        this.c.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.a.acquire();
        acquire.bindLong(1, j);
        try {
            this.c.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.c.setTransactionSuccessful();
            this.c.endTransaction();
            return executeUpdateDelete;
        } finally {
            this.a.release(acquire);
        }
    }

    @Override // o.InterfaceC5266bvX
    public int d(long j) {
        this.c.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.e.acquire();
        acquire.bindLong(1, j);
        try {
            this.c.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.c.setTransactionSuccessful();
            this.c.endTransaction();
            return executeUpdateDelete;
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // o.InterfaceC5266bvX
    public int d() {
        this.c.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.b.acquire();
        try {
            this.c.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.c.setTransactionSuccessful();
            this.c.endTransaction();
            return executeUpdateDelete;
        } finally {
            this.b.release(acquire);
        }
    }

    @Override // o.InterfaceC5266bvX
    public C5335bwn b(long j, int i, int i2, boolean z, boolean z2, long j2, String str, String str2, String str3, String str4) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM PersistedManifest WHERE playableId = ? AND netType = ? AND netId = ? AND isBranching = ? AND supportsLanguageSelector = ? AND expires > ? AND preferredAudio = ? AND preferredSubtitle = ? AND preferredAssistive = ? AND token = ?", 10);
        acquire.bindLong(1, j);
        acquire.bindLong(2, i);
        acquire.bindLong(3, i2);
        acquire.bindLong(4, z ? 1L : 0L);
        acquire.bindLong(5, z2 ? 1L : 0L);
        acquire.bindLong(6, j2);
        acquire.bindString(7, str);
        acquire.bindString(8, str2);
        acquire.bindString(9, str3);
        acquire.bindString(10, str4);
        this.c.assertNotSuspendingTransaction();
        C5335bwn c5335bwn = null;
        Cursor query = DBUtil.query(this.c, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "expires");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "manifest");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "playableId");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "netType");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "netId");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "isBranching");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "supportsLanguageSelector");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "preferredAudio");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "preferredSubtitle");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "preferredAssistive");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "token");
            if (query.moveToFirst()) {
                c5335bwn = new C5335bwn(new C5331bwj(query.getLong(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.getInt(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6) != 0, query.getInt(columnIndexOrThrow7) != 0, query.getString(columnIndexOrThrow8), query.getString(columnIndexOrThrow9), query.getString(columnIndexOrThrow10), query.getString(columnIndexOrThrow11)), query.getLong(columnIndexOrThrow), query.getString(columnIndexOrThrow2));
            }
            return c5335bwn;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }
}
