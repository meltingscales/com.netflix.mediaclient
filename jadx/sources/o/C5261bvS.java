package o;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.netflix.mediaclient.storage.db.entity.DownloadablePersistentData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvS  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5261bvS implements InterfaceC5260bvR {
    private final EntityDeletionOrUpdateAdapter<C5332bwk> a;
    private final RoomDatabase b;
    private final EntityInsertionAdapter<C5332bwk> d;

    public C5261bvS(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
        this.d = new EntityInsertionAdapter<C5332bwk>(roomDatabase) { // from class: o.bvS.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `offlinePlayable` (`playableId`,`regId`,`profileId`,`videoType`,`videoQuality`,`audioTracks`,`videoTracks`,`subtitleTracks`,`trickPlays`,`downloadStateValue`,`dlStateBeforeDelete`,`stopReasonValue`,`geoBlocked`,`dxId`,`pcTrackId`,`pcVideoPos`,`pcListPos`,`dcRequestId`,`dcInitTimeMs`,`oxId`,`playStartTime`,`errorCode`,`errorString`,`downloadRequestType`,`stateTime`,`keySetId`,`expirationTime`,`licenseDate`,`playableWindowMs`,`resettable`,`shouldRefresh`,`viewingWindow`,`playWindowResetLimit`,`refreshLicenseTimestamp`,`shouldUsePlayWindowLimits`,`mShouldRefreshByTimestamp`,`activate`,`linkDeactivate`,`linkRefresh`,`convertLicense`,`overrideRequiresUnmeteredNetwork`,`overrideRequiresCharger`,`widevineInfo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: c */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5332bwk c5332bwk) {
                supportSQLiteStatement.bindString(1, c5332bwk.z);
                supportSQLiteStatement.bindLong(2, c5332bwk.F);
                String str = c5332bwk.B;
                if (str == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, str);
                }
                supportSQLiteStatement.bindLong(4, c5332bwk.S);
                String str2 = c5332bwk.l;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, str2);
                }
                List<DownloadablePersistentData> list = c5332bwk.b;
                String c = list == null ? null : C5243bvA.c(list);
                if (c == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, c);
                }
                List<DownloadablePersistentData> list2 = c5332bwk.L;
                String c2 = list2 == null ? null : C5243bvA.c(list2);
                if (c2 == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, c2);
                }
                List<DownloadablePersistentData> list3 = c5332bwk.N;
                String c3 = list3 == null ? null : C5243bvA.c(list3);
                if (c3 == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, c3);
                }
                List<DownloadablePersistentData> list4 = c5332bwk.f13637J;
                String c4 = list4 != null ? C5243bvA.c(list4) : null;
                if (c4 == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, c4);
                }
                supportSQLiteStatement.bindLong(10, c5332bwk.i);
                supportSQLiteStatement.bindLong(11, c5332bwk.e);
                supportSQLiteStatement.bindLong(12, c5332bwk.K);
                supportSQLiteStatement.bindLong(13, c5332bwk.t ? 1L : 0L);
                String str3 = c5332bwk.f13638o;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, str3);
                }
                supportSQLiteStatement.bindLong(15, c5332bwk.j);
                supportSQLiteStatement.bindLong(16, c5332bwk.h);
                supportSQLiteStatement.bindLong(17, c5332bwk.a);
                String str4 = c5332bwk.f;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, str4);
                }
                supportSQLiteStatement.bindLong(19, c5332bwk.c);
                String str5 = c5332bwk.x;
                if (str5 == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, str5);
                }
                supportSQLiteStatement.bindLong(21, c5332bwk.w);
                supportSQLiteStatement.bindLong(22, c5332bwk.n);
                String str6 = c5332bwk.k;
                if (str6 == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, str6);
                }
                String str7 = c5332bwk.g;
                if (str7 == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindString(24, str7);
                }
                supportSQLiteStatement.bindLong(25, c5332bwk.M);
                String str8 = c5332bwk.p;
                if (str8 == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindString(26, str8);
                }
                supportSQLiteStatement.bindLong(27, c5332bwk.m);
                supportSQLiteStatement.bindLong(28, c5332bwk.q);
                supportSQLiteStatement.bindLong(29, c5332bwk.A);
                supportSQLiteStatement.bindLong(30, c5332bwk.D ? 1L : 0L);
                supportSQLiteStatement.bindLong(31, c5332bwk.G ? 1L : 0L);
                supportSQLiteStatement.bindLong(32, c5332bwk.R);
                supportSQLiteStatement.bindLong(33, c5332bwk.C);
                supportSQLiteStatement.bindLong(34, c5332bwk.E);
                supportSQLiteStatement.bindLong(35, c5332bwk.H ? 1L : 0L);
                supportSQLiteStatement.bindLong(36, c5332bwk.I ? 1L : 0L);
                String str9 = c5332bwk.d;
                if (str9 == null) {
                    supportSQLiteStatement.bindNull(37);
                } else {
                    supportSQLiteStatement.bindString(37, str9);
                }
                String str10 = c5332bwk.s;
                if (str10 == null) {
                    supportSQLiteStatement.bindNull(38);
                } else {
                    supportSQLiteStatement.bindString(38, str10);
                }
                String str11 = c5332bwk.u;
                if (str11 == null) {
                    supportSQLiteStatement.bindNull(39);
                } else {
                    supportSQLiteStatement.bindString(39, str11);
                }
                String str12 = c5332bwk.r;
                if (str12 == null) {
                    supportSQLiteStatement.bindNull(40);
                } else {
                    supportSQLiteStatement.bindString(40, str12);
                }
                supportSQLiteStatement.bindLong(41, c5332bwk.y ? 1L : 0L);
                supportSQLiteStatement.bindLong(42, c5332bwk.v ? 1L : 0L);
                String str13 = c5332bwk.O;
                if (str13 == null) {
                    supportSQLiteStatement.bindNull(43);
                } else {
                    supportSQLiteStatement.bindString(43, str13);
                }
            }
        };
        this.a = new EntityDeletionOrUpdateAdapter<C5332bwk>(roomDatabase) { // from class: o.bvS.4
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `offlinePlayable` WHERE `playableId` = ? AND `regId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* renamed from: d */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5332bwk c5332bwk) {
                supportSQLiteStatement.bindString(1, c5332bwk.z);
                supportSQLiteStatement.bindLong(2, c5332bwk.F);
            }
        };
    }

    @Override // o.InterfaceC5260bvR
    public void b(C5332bwk c5332bwk) {
        this.b.assertNotSuspendingTransaction();
        this.b.beginTransaction();
        try {
            this.d.insert((EntityInsertionAdapter<C5332bwk>) c5332bwk);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    @Override // o.InterfaceC5260bvR
    public void d(List<C5332bwk> list) {
        this.b.assertNotSuspendingTransaction();
        this.b.beginTransaction();
        try {
            this.d.insert(list);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    @Override // o.InterfaceC5260bvR
    public void c(List<C5332bwk> list) {
        this.b.assertNotSuspendingTransaction();
        this.b.beginTransaction();
        try {
            this.a.handleMultiple(list);
            this.b.setTransactionSuccessful();
        } finally {
            this.b.endTransaction();
        }
    }

    @Override // o.InterfaceC5260bvR
    public List<C5332bwk> a() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM offlinePlayable", 0);
        this.b.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.b, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "playableId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "regId");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "profileId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "videoType");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "videoQuality");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "audioTracks");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "videoTracks");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "subtitleTracks");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "trickPlays");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "downloadStateValue");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "dlStateBeforeDelete");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "stopReasonValue");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "geoBlocked");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "dxId");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "pcTrackId");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "pcVideoPos");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "pcListPos");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "dcRequestId");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "dcInitTimeMs");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "oxId");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "playStartTime");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "errorCode");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "errorString");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "downloadRequestType");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "stateTime");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "keySetId");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "expirationTime");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "licenseDate");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "playableWindowMs");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "resettable");
            int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "shouldRefresh");
            int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "viewingWindow");
            int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(query, "playWindowResetLimit");
            int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(query, "refreshLicenseTimestamp");
            int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(query, "shouldUsePlayWindowLimits");
            int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(query, "mShouldRefreshByTimestamp");
            int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(query, "activate");
            int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(query, "linkDeactivate");
            int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(query, "linkRefresh");
            int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(query, "convertLicense");
            int columnIndexOrThrow41 = CursorUtil.getColumnIndexOrThrow(query, "overrideRequiresUnmeteredNetwork");
            int columnIndexOrThrow42 = CursorUtil.getColumnIndexOrThrow(query, "overrideRequiresCharger");
            int columnIndexOrThrow43 = CursorUtil.getColumnIndexOrThrow(query, "widevineInfo");
            int i8 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C5332bwk c5332bwk = new C5332bwk();
                ArrayList arrayList2 = arrayList;
                c5332bwk.z = query.getString(columnIndexOrThrow);
                c5332bwk.F = query.getInt(columnIndexOrThrow2);
                if (query.isNull(columnIndexOrThrow3)) {
                    c5332bwk.B = null;
                } else {
                    c5332bwk.B = query.getString(columnIndexOrThrow3);
                }
                c5332bwk.S = query.getInt(columnIndexOrThrow4);
                if (query.isNull(columnIndexOrThrow5)) {
                    c5332bwk.l = null;
                } else {
                    c5332bwk.l = query.getString(columnIndexOrThrow5);
                }
                c5332bwk.b = C5243bvA.c(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                c5332bwk.L = C5243bvA.c(query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7));
                c5332bwk.N = C5243bvA.c(query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8));
                c5332bwk.f13637J = C5243bvA.c(query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                c5332bwk.i = query.getInt(columnIndexOrThrow10);
                c5332bwk.e = query.getInt(columnIndexOrThrow11);
                c5332bwk.K = query.getInt(columnIndexOrThrow12);
                c5332bwk.t = query.getInt(columnIndexOrThrow13) != 0;
                int i9 = i8;
                if (query.isNull(i9)) {
                    i = columnIndexOrThrow;
                    c5332bwk.f13638o = null;
                } else {
                    i = columnIndexOrThrow;
                    c5332bwk.f13638o = query.getString(i9);
                }
                int i10 = columnIndexOrThrow15;
                int i11 = columnIndexOrThrow12;
                c5332bwk.j = query.getInt(i10);
                int i12 = columnIndexOrThrow16;
                c5332bwk.h = query.getInt(i12);
                int i13 = columnIndexOrThrow17;
                c5332bwk.a = query.getInt(i13);
                int i14 = columnIndexOrThrow18;
                if (query.isNull(i14)) {
                    i2 = i13;
                    c5332bwk.f = null;
                } else {
                    i2 = i13;
                    c5332bwk.f = query.getString(i14);
                }
                int i15 = columnIndexOrThrow19;
                c5332bwk.c = query.getLong(i15);
                int i16 = columnIndexOrThrow20;
                if (query.isNull(i16)) {
                    c5332bwk.x = null;
                } else {
                    c5332bwk.x = query.getString(i16);
                }
                int i17 = columnIndexOrThrow2;
                int i18 = columnIndexOrThrow21;
                int i19 = columnIndexOrThrow3;
                c5332bwk.w = query.getLong(i18);
                int i20 = columnIndexOrThrow22;
                c5332bwk.n = query.getInt(i20);
                int i21 = columnIndexOrThrow23;
                if (query.isNull(i21)) {
                    i3 = i15;
                    c5332bwk.k = null;
                } else {
                    i3 = i15;
                    c5332bwk.k = query.getString(i21);
                }
                int i22 = columnIndexOrThrow24;
                if (query.isNull(i22)) {
                    i4 = i16;
                    c5332bwk.g = null;
                } else {
                    i4 = i16;
                    c5332bwk.g = query.getString(i22);
                }
                int i23 = columnIndexOrThrow13;
                int i24 = columnIndexOrThrow25;
                c5332bwk.M = query.getLong(i24);
                int i25 = columnIndexOrThrow26;
                if (query.isNull(i25)) {
                    c5332bwk.p = null;
                } else {
                    c5332bwk.p = query.getString(i25);
                }
                int i26 = columnIndexOrThrow27;
                c5332bwk.m = query.getLong(i26);
                int i27 = columnIndexOrThrow28;
                c5332bwk.q = query.getLong(i27);
                int i28 = columnIndexOrThrow29;
                c5332bwk.A = query.getLong(i28);
                int i29 = columnIndexOrThrow30;
                c5332bwk.D = query.getInt(i29) != 0;
                int i30 = columnIndexOrThrow31;
                if (query.getInt(i30) != 0) {
                    i5 = i22;
                    z = true;
                } else {
                    i5 = i22;
                    z = false;
                }
                c5332bwk.G = z;
                int i31 = columnIndexOrThrow32;
                c5332bwk.R = query.getLong(i31);
                int i32 = columnIndexOrThrow33;
                c5332bwk.C = query.getLong(i32);
                int i33 = columnIndexOrThrow34;
                c5332bwk.E = query.getLong(i33);
                int i34 = columnIndexOrThrow35;
                c5332bwk.H = query.getInt(i34) != 0;
                int i35 = columnIndexOrThrow36;
                if (query.getInt(i35) != 0) {
                    i6 = i31;
                    z2 = true;
                } else {
                    i6 = i31;
                    z2 = false;
                }
                c5332bwk.I = z2;
                int i36 = columnIndexOrThrow37;
                if (query.isNull(i36)) {
                    i7 = i32;
                    c5332bwk.d = null;
                } else {
                    i7 = i32;
                    c5332bwk.d = query.getString(i36);
                }
                int i37 = columnIndexOrThrow38;
                if (query.isNull(i37)) {
                    columnIndexOrThrow37 = i36;
                    c5332bwk.s = null;
                } else {
                    columnIndexOrThrow37 = i36;
                    c5332bwk.s = query.getString(i37);
                }
                int i38 = columnIndexOrThrow39;
                if (query.isNull(i38)) {
                    columnIndexOrThrow38 = i37;
                    c5332bwk.u = null;
                } else {
                    columnIndexOrThrow38 = i37;
                    c5332bwk.u = query.getString(i38);
                }
                int i39 = columnIndexOrThrow40;
                if (query.isNull(i39)) {
                    columnIndexOrThrow39 = i38;
                    c5332bwk.r = null;
                } else {
                    columnIndexOrThrow39 = i38;
                    c5332bwk.r = query.getString(i39);
                }
                int i40 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i40;
                c5332bwk.y = query.getInt(i40) != 0;
                int i41 = columnIndexOrThrow42;
                columnIndexOrThrow42 = i41;
                c5332bwk.v = query.getInt(i41) != 0;
                int i42 = columnIndexOrThrow43;
                if (query.isNull(i42)) {
                    columnIndexOrThrow40 = i39;
                    c5332bwk.O = null;
                } else {
                    columnIndexOrThrow40 = i39;
                    c5332bwk.O = query.getString(i42);
                }
                arrayList2.add(c5332bwk);
                columnIndexOrThrow43 = i42;
                columnIndexOrThrow = i;
                i8 = i9;
                columnIndexOrThrow19 = i3;
                columnIndexOrThrow22 = i20;
                columnIndexOrThrow33 = i7;
                columnIndexOrThrow36 = i35;
                columnIndexOrThrow3 = i19;
                columnIndexOrThrow21 = i18;
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                columnIndexOrThrow27 = i26;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow31 = i30;
                columnIndexOrThrow34 = i33;
                arrayList = arrayList2;
                columnIndexOrThrow12 = i11;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow16 = i12;
                columnIndexOrThrow17 = i2;
                columnIndexOrThrow18 = i14;
                int i43 = i5;
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow13 = i23;
                columnIndexOrThrow24 = i43;
                int i44 = i6;
                columnIndexOrThrow35 = i34;
                columnIndexOrThrow2 = i17;
                columnIndexOrThrow20 = i4;
                columnIndexOrThrow23 = i21;
                columnIndexOrThrow29 = i28;
                columnIndexOrThrow32 = i44;
            }
            ArrayList arrayList3 = arrayList;
            query.close();
            roomSQLiteQuery.release();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }
}
