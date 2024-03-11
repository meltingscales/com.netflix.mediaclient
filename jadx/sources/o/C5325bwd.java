package o;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bwd  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5325bwd implements InterfaceC5323bwb {
    private final RoomDatabase d;
    private final EntityInsertionAdapter<C5338bwq> e;

    public C5325bwd(RoomDatabase roomDatabase) {
        this.d = roomDatabase;
        this.e = new EntityInsertionAdapter<C5338bwq>(roomDatabase) { // from class: o.bwd.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `rdidCtaConsentState` (`consentId`,`displayedAt`,`isDenied`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: a */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5338bwq c5338bwq) {
                supportSQLiteStatement.bindString(1, c5338bwq.d());
                supportSQLiteStatement.bindString(2, c5338bwq.e());
                supportSQLiteStatement.bindLong(3, c5338bwq.c() ? 1L : 0L);
            }
        };
    }

    @Override // o.InterfaceC5323bwb
    public void a(C5338bwq c5338bwq) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.e.insert((EntityInsertionAdapter<C5338bwq>) c5338bwq);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5323bwb
    public List<C5338bwq> d() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM rdidCtaConsentState", 0);
        this.d.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.d, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "consentId");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "displayedAt");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "isDenied");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new C5338bwq(query.getString(columnIndexOrThrow), query.getString(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }
}
