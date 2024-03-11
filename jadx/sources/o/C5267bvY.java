package o;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: o.bvY  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5267bvY implements InterfaceC5262bvT {
    private final EntityInsertionAdapter<C5334bwm> a;
    private final EntityDeletionOrUpdateAdapter<C5334bwm> b;
    private final SharedSQLiteStatement c;
    private final RoomDatabase d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement i;

    public C5267bvY(RoomDatabase roomDatabase) {
        this.d = roomDatabase;
        this.a = new EntityInsertionAdapter<C5334bwm>(roomDatabase) { // from class: o.bvY.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `offlineWatched` (`playableId`,`isEpisode`,`seasonNumber`,`episodeNumber`,`parentId`,`trackId`,`episodeSmartDownloadedId`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: b */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5334bwm c5334bwm) {
                supportSQLiteStatement.bindString(1, c5334bwm.a());
                supportSQLiteStatement.bindLong(2, c5334bwm.g() ? 1L : 0L);
                supportSQLiteStatement.bindLong(3, c5334bwm.c());
                supportSQLiteStatement.bindLong(4, c5334bwm.e());
                if (c5334bwm.d() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, c5334bwm.d());
                }
                supportSQLiteStatement.bindLong(6, c5334bwm.f());
                if (c5334bwm.b() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, c5334bwm.b());
                }
            }
        };
        this.b = new EntityDeletionOrUpdateAdapter<C5334bwm>(roomDatabase) { // from class: o.bvY.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `offlineWatched` WHERE `playableId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* renamed from: b */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5334bwm c5334bwm) {
                supportSQLiteStatement.bindString(1, c5334bwm.a());
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvY.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE from offlineWatched where parentId = ?";
            }
        };
        this.i = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvY.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE offlineWatched SET episodeSmartDownloadedId=? WHERE playableId = ? AND isEpisode = 1";
            }
        };
        this.e = new SharedSQLiteStatement(roomDatabase) { // from class: o.bvY.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE from offlineWatched";
            }
        };
    }

    @Override // o.InterfaceC5262bvT
    public void b(C5334bwm c5334bwm) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.a.insert((EntityInsertionAdapter<C5334bwm>) c5334bwm);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5262bvT
    public void d(C5334bwm c5334bwm) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.b.handle(c5334bwm);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5262bvT
    public void c(String str) {
        this.d.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.c.acquire();
        acquire.bindString(1, str);
        try {
            this.d.beginTransaction();
            acquire.executeUpdateDelete();
            this.d.setTransactionSuccessful();
            this.d.endTransaction();
        } finally {
            this.c.release(acquire);
        }
    }

    @Override // o.InterfaceC5262bvT
    public void c(String str, String str2) {
        this.d.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.i.acquire();
        acquire.bindString(1, str2);
        acquire.bindString(2, str);
        try {
            this.d.beginTransaction();
            acquire.executeUpdateDelete();
            this.d.setTransactionSuccessful();
            this.d.endTransaction();
        } finally {
            this.i.release(acquire);
        }
    }

    @Override // o.InterfaceC5262bvT
    public void e() {
        this.d.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.e.acquire();
        try {
            this.d.beginTransaction();
            acquire.executeUpdateDelete();
            this.d.setTransactionSuccessful();
            this.d.endTransaction();
        } finally {
            this.e.release(acquire);
        }
    }

    @Override // o.InterfaceC5262bvT
    public Flowable<List<String>> c() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT DISTINCT parentId FROM offlineWatched where isEpisode = 1", 0);
        return RxRoom.createFlowable(this.d, false, new String[]{"offlineWatched"}, new Callable<List<String>>() { // from class: o.bvY.10
            @Override // java.util.concurrent.Callable
            /* renamed from: c */
            public List<String> call() {
                Cursor query = DBUtil.query(C5267bvY.this.d, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(0));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // o.InterfaceC5262bvT
    public Flowable<List<C5334bwm>> a() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from offlineWatched", 0);
        return RxRoom.createFlowable(this.d, false, new String[]{"offlineWatched"}, new Callable<List<C5334bwm>>() { // from class: o.bvY.6
            @Override // java.util.concurrent.Callable
            /* renamed from: d */
            public List<C5334bwm> call() {
                Cursor query = DBUtil.query(C5267bvY.this.d, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "isEpisode");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "seasonNumber");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "episodeNumber");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "parentId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trackId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "episodeSmartDownloadedId");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        C5334bwm c5334bwm = new C5334bwm(query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2) != 0, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6));
                        c5334bwm.b(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                        arrayList.add(c5334bwm);
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // o.InterfaceC5262bvT
    public Flowable<List<C5334bwm>> d(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from offlineWatched where parentId = ? ORDER BY seasonNumber ASC, episodeNumber ASC", 1);
        acquire.bindString(1, str);
        return RxRoom.createFlowable(this.d, false, new String[]{"offlineWatched"}, new Callable<List<C5334bwm>>() { // from class: o.bvY.7
            @Override // java.util.concurrent.Callable
            /* renamed from: e */
            public List<C5334bwm> call() {
                Cursor query = DBUtil.query(C5267bvY.this.d, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "isEpisode");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "seasonNumber");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "episodeNumber");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "parentId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trackId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "episodeSmartDownloadedId");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        C5334bwm c5334bwm = new C5334bwm(query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2) != 0, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6));
                        c5334bwm.b(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                        arrayList.add(c5334bwm);
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // o.InterfaceC5262bvT
    public Flowable<List<C5334bwm>> a(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * from offlineWatched where episodeSmartDownloadedId = ?", 1);
        acquire.bindString(1, str);
        return RxRoom.createFlowable(this.d, false, new String[]{"offlineWatched"}, new Callable<List<C5334bwm>>() { // from class: o.bvY.8
            @Override // java.util.concurrent.Callable
            /* renamed from: e */
            public List<C5334bwm> call() {
                Cursor query = DBUtil.query(C5267bvY.this.d, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "isEpisode");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "seasonNumber");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "episodeNumber");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "parentId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "trackId");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "episodeSmartDownloadedId");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        C5334bwm c5334bwm = new C5334bwm(query.getString(columnIndexOrThrow), query.getInt(columnIndexOrThrow2) != 0, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.getInt(columnIndexOrThrow6));
                        c5334bwm.b(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                        arrayList.add(c5334bwm);
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }
}
