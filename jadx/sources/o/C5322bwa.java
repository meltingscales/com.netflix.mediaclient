package o;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: o.bwa  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5322bwa implements InterfaceC5324bwc {
    private final EntityInsertionAdapter<C5339bwr> a;
    private final SharedSQLiteStatement b;
    private final SharedSQLiteStatement c;
    private final RoomDatabase d;
    private final SharedSQLiteStatement e;

    public C5322bwa(RoomDatabase roomDatabase) {
        this.d = roomDatabase;
        this.a = new EntityInsertionAdapter<C5339bwr>(roomDatabase) { // from class: o.bwa.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `sessionNetworkStatistics` (`streamId`,`bytes`,`interval`,`locationID`,`ip`,`networkType`,`timestamp`,`totalBufferingTime`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: b */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5339bwr c5339bwr) {
                supportSQLiteStatement.bindLong(1, c5339bwr.g());
                supportSQLiteStatement.bindLong(2, c5339bwr.c());
                supportSQLiteStatement.bindLong(3, c5339bwr.e());
                supportSQLiteStatement.bindString(4, c5339bwr.b());
                supportSQLiteStatement.bindString(5, c5339bwr.a());
                supportSQLiteStatement.bindString(6, c5339bwr.d());
                supportSQLiteStatement.bindLong(7, c5339bwr.h());
                supportSQLiteStatement.bindLong(8, c5339bwr.i());
            }
        };
        this.b = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwa.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sessionNetworkStatistics WHERE timestamp < ?";
            }
        };
        this.e = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwa.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sessionNetworkStatistics where timestamp <= ?";
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase) { // from class: o.bwa.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM sessionNetworkStatistics WHERE timestamp IN (SELECT timestamp FROM sessionNetworkStatistics ORDER BY timestamp LIMIT ?)";
            }
        };
    }

    @Override // o.InterfaceC5324bwc
    public Object d(final Collection<C5339bwr> collection, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return CoroutinesRoom.execute(this.d, true, new Callable<dpR>() { // from class: o.bwa.6
            @Override // java.util.concurrent.Callable
            /* renamed from: c */
            public dpR call() {
                C5322bwa.this.d.beginTransaction();
                try {
                    C5322bwa.this.a.insert((Iterable) collection);
                    C5322bwa.this.d.setTransactionSuccessful();
                    return dpR.c;
                } finally {
                    C5322bwa.this.d.endTransaction();
                }
            }
        }, interfaceC8585dra);
    }

    @Override // o.InterfaceC5324bwc
    public Object a(final long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return CoroutinesRoom.execute(this.d, true, new Callable<dpR>() { // from class: o.bwa.9
            @Override // java.util.concurrent.Callable
            /* renamed from: e */
            public dpR call() {
                SupportSQLiteStatement acquire = C5322bwa.this.e.acquire();
                acquire.bindLong(1, j);
                try {
                    C5322bwa.this.d.beginTransaction();
                    acquire.executeUpdateDelete();
                    C5322bwa.this.d.setTransactionSuccessful();
                    dpR dpr = dpR.c;
                    C5322bwa.this.d.endTransaction();
                    return dpr;
                } finally {
                    C5322bwa.this.e.release(acquire);
                }
            }
        }, interfaceC8585dra);
    }

    @Override // o.InterfaceC5324bwc
    public Object b(final int i, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return CoroutinesRoom.execute(this.d, true, new Callable<dpR>() { // from class: o.bwa.10
            @Override // java.util.concurrent.Callable
            /* renamed from: c */
            public dpR call() {
                SupportSQLiteStatement acquire = C5322bwa.this.c.acquire();
                acquire.bindLong(1, i);
                try {
                    C5322bwa.this.d.beginTransaction();
                    acquire.executeUpdateDelete();
                    C5322bwa.this.d.setTransactionSuccessful();
                    dpR dpr = dpR.c;
                    C5322bwa.this.d.endTransaction();
                    return dpr;
                } finally {
                    C5322bwa.this.c.release(acquire);
                }
            }
        }, interfaceC8585dra);
    }

    @Override // o.InterfaceC5324bwc
    public long d() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM sessionNetworkStatistics", 0);
        this.d.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.d, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getLong(0) : 0L;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // o.InterfaceC5324bwc
    public Object e(String str, String str2, String str3, InterfaceC8585dra<? super List<C5339bwr>> interfaceC8585dra) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from sessionNetworkStatistics INNER JOIN (SELECT streamId, timestamp, MAX(CAST(networkType = ? AS INT)  * 3 + CAST(ip = ? AS INT) * 1 + CAST(locationID = ? AS INT) * 1) as score FROM sessionNetworkStatistics GROUP BY 1,2 HAVING score >= 3) USING (streamId, timestamp)", 3);
        if (str3 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str3);
        }
        if (str2 == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str2);
        }
        if (str == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, str);
        }
        return CoroutinesRoom.execute(this.d, false, DBUtil.createCancellationSignal(), new Callable<List<C5339bwr>>() { // from class: o.bwa.5
            @Override // java.util.concurrent.Callable
            /* renamed from: e */
            public List<C5339bwr> call() {
                Cursor query = DBUtil.query(C5322bwa.this.d, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "streamId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "bytes");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "interval");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "locationID");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "ip");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "networkType");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "timestamp");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "totalBufferingTime");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new C5339bwr(query.getLong(columnIndexOrThrow), query.getLong(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3), query.getString(columnIndexOrThrow4), query.getString(columnIndexOrThrow5), query.getString(columnIndexOrThrow6), query.getLong(columnIndexOrThrow7), query.getLong(columnIndexOrThrow8)));
                    }
                    return arrayList;
                } finally {
                    query.close();
                    acquire.release();
                }
            }
        }, interfaceC8585dra);
    }

    public static List<Class<?>> a() {
        return Collections.emptyList();
    }
}
