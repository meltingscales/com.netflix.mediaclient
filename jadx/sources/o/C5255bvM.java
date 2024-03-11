package o;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.bvM  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5255bvM implements InterfaceC5258bvP {
    private final EntityDeletionOrUpdateAdapter<C5327bwf> b;
    private final RoomDatabase d;
    private final EntityInsertionAdapter<C5327bwf> e;

    public C5255bvM(RoomDatabase roomDatabase) {
        this.d = roomDatabase;
        this.e = new EntityInsertionAdapter<C5327bwf>(roomDatabase) { // from class: o.bvM.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `offlineFalkorPlayable` (`videoId`,`regId`,`parentId`,`title`,`seasonLabel`,`advisoriesString`,`isEpisode`,`isNSRE`,`isNextPlayableEpisode`,`isAgeProtected`,`isPinProtected`,`isPreviewProtected`,`isAdvisoryDisabled`,`isAvailableToStream`,`isSupplementalVideo`,`duration`,`displayRuntime`,`seasonNumber`,`episodeNumber`,`logicalStart`,`endtime`,`maxAutoplay`,`expTime`,`watchedTime`,`bookmarkMs`,`supportsPrePlay`,`episodeNumberHidden`,`profileId`,`seasonLabels`,`errorType`,`videoType`,`year`,`maturityLevel`,`synopsis`,`quality`,`actors`,`genres`,`cert`,`supplMessage`,`defaultTrailer`,`hResPortBoxArtUrl`,`boxshotUrl`,`boxartImageId`,`horzDispUrl`,`storyUrl`,`bifUrl`,`billboardArtUrl`,`evidenceType`,`evidenceTitle`,`catalogIdUrl`,`titleImgUrl`,`titleCroppedImgUrl`,`nextEpisodeId`,`isOriginal`,`isPreRelease`,`hasWatched`,`hasTrailers`,`isInQueue`,`isVideoHd`,`isVideoUhd`,`isVideo5dot1`,`hasSpatialAudio`,`isVideoHdr10`,`isVideoDolbyVision`,`interactiveSummary`,`isNonSerializedTv`,`tags`,`timeCodes`,`supplementalMessageType`,`synopsisDpText`,`synopsisDpEvidenceKey`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertionAdapter
            /* renamed from: a */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5327bwf c5327bwf) {
                supportSQLiteStatement.bindString(1, c5327bwf.aq);
                supportSQLiteStatement.bindLong(2, c5327bwf.V);
                String str = c5327bwf.T;
                if (str == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, str);
                }
                String str2 = c5327bwf.am;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str2);
                }
                String str3 = c5327bwf.aa;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, str3);
                }
                String str4 = c5327bwf.e;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, str4);
                }
                supportSQLiteStatement.bindLong(7, c5327bwf.C ? 1L : 0L);
                supportSQLiteStatement.bindLong(8, c5327bwf.H ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, c5327bwf.E ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, c5327bwf.B ? 1L : 0L);
                supportSQLiteStatement.bindLong(11, c5327bwf.N ? 1L : 0L);
                supportSQLiteStatement.bindLong(12, c5327bwf.K ? 1L : 0L);
                supportSQLiteStatement.bindLong(13, c5327bwf.z ? 1L : 0L);
                supportSQLiteStatement.bindLong(14, c5327bwf.A ? 1L : 0L);
                supportSQLiteStatement.bindLong(15, c5327bwf.M ? 1L : 0L);
                supportSQLiteStatement.bindLong(16, c5327bwf.k);
                supportSQLiteStatement.bindLong(17, c5327bwf.n);
                supportSQLiteStatement.bindLong(18, c5327bwf.ac);
                supportSQLiteStatement.bindLong(19, c5327bwf.f13636o);
                supportSQLiteStatement.bindLong(20, c5327bwf.Q);
                supportSQLiteStatement.bindLong(21, c5327bwf.l);
                supportSQLiteStatement.bindLong(22, c5327bwf.W);
                supportSQLiteStatement.bindLong(23, c5327bwf.s);
                supportSQLiteStatement.bindLong(24, c5327bwf.an);
                supportSQLiteStatement.bindLong(25, c5327bwf.b);
                supportSQLiteStatement.bindLong(26, c5327bwf.ae ? 1L : 0L);
                supportSQLiteStatement.bindLong(27, c5327bwf.m ? 1L : 0L);
                String str5 = c5327bwf.Y;
                if (str5 == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindString(28, str5);
                }
                String str6 = c5327bwf.ab;
                if (str6 == null) {
                    supportSQLiteStatement.bindNull(29);
                } else {
                    supportSQLiteStatement.bindString(29, str6);
                }
                supportSQLiteStatement.bindLong(30, c5327bwf.p);
                supportSQLiteStatement.bindLong(31, c5327bwf.ao);
                supportSQLiteStatement.bindLong(32, c5327bwf.as);
                supportSQLiteStatement.bindLong(33, c5327bwf.X);
                String str7 = c5327bwf.af;
                if (str7 == null) {
                    supportSQLiteStatement.bindNull(34);
                } else {
                    supportSQLiteStatement.bindString(34, str7);
                }
                String str8 = c5327bwf.Z;
                if (str8 == null) {
                    supportSQLiteStatement.bindNull(35);
                } else {
                    supportSQLiteStatement.bindString(35, str8);
                }
                String str9 = c5327bwf.d;
                if (str9 == null) {
                    supportSQLiteStatement.bindNull(36);
                } else {
                    supportSQLiteStatement.bindString(36, str9);
                }
                String str10 = c5327bwf.r;
                if (str10 == null) {
                    supportSQLiteStatement.bindNull(37);
                } else {
                    supportSQLiteStatement.bindString(37, str10);
                }
                String str11 = c5327bwf.h;
                if (str11 == null) {
                    supportSQLiteStatement.bindNull(38);
                } else {
                    supportSQLiteStatement.bindString(38, str11);
                }
                String str12 = c5327bwf.ah;
                if (str12 == null) {
                    supportSQLiteStatement.bindNull(39);
                } else {
                    supportSQLiteStatement.bindString(39, str12);
                }
                String str13 = c5327bwf.g;
                if (str13 == null) {
                    supportSQLiteStatement.bindNull(40);
                } else {
                    supportSQLiteStatement.bindString(40, str13);
                }
                String str14 = c5327bwf.v;
                if (str14 == null) {
                    supportSQLiteStatement.bindNull(41);
                } else {
                    supportSQLiteStatement.bindString(41, str14);
                }
                String str15 = c5327bwf.i;
                if (str15 == null) {
                    supportSQLiteStatement.bindNull(42);
                } else {
                    supportSQLiteStatement.bindString(42, str15);
                }
                String str16 = c5327bwf.j;
                if (str16 == null) {
                    supportSQLiteStatement.bindNull(43);
                } else {
                    supportSQLiteStatement.bindString(43, str16);
                }
                String str17 = c5327bwf.u;
                if (str17 == null) {
                    supportSQLiteStatement.bindNull(44);
                } else {
                    supportSQLiteStatement.bindString(44, str17);
                }
                String str18 = c5327bwf.ad;
                if (str18 == null) {
                    supportSQLiteStatement.bindNull(45);
                } else {
                    supportSQLiteStatement.bindString(45, str18);
                }
                String str19 = c5327bwf.a;
                if (str19 == null) {
                    supportSQLiteStatement.bindNull(46);
                } else {
                    supportSQLiteStatement.bindString(46, str19);
                }
                String str20 = c5327bwf.c;
                if (str20 == null) {
                    supportSQLiteStatement.bindNull(47);
                } else {
                    supportSQLiteStatement.bindString(47, str20);
                }
                String str21 = c5327bwf.t;
                if (str21 == null) {
                    supportSQLiteStatement.bindNull(48);
                } else {
                    supportSQLiteStatement.bindString(48, str21);
                }
                String str22 = c5327bwf.q;
                if (str22 == null) {
                    supportSQLiteStatement.bindNull(49);
                } else {
                    supportSQLiteStatement.bindString(49, str22);
                }
                String str23 = c5327bwf.f;
                if (str23 == null) {
                    supportSQLiteStatement.bindNull(50);
                } else {
                    supportSQLiteStatement.bindString(50, str23);
                }
                String str24 = c5327bwf.ar;
                if (str24 == null) {
                    supportSQLiteStatement.bindNull(51);
                } else {
                    supportSQLiteStatement.bindString(51, str24);
                }
                String str25 = c5327bwf.ap;
                if (str25 == null) {
                    supportSQLiteStatement.bindNull(52);
                } else {
                    supportSQLiteStatement.bindString(52, str25);
                }
                String str26 = c5327bwf.U;
                if (str26 == null) {
                    supportSQLiteStatement.bindNull(53);
                } else {
                    supportSQLiteStatement.bindString(53, str26);
                }
                supportSQLiteStatement.bindLong(54, c5327bwf.F ? 1L : 0L);
                supportSQLiteStatement.bindLong(55, c5327bwf.L ? 1L : 0L);
                supportSQLiteStatement.bindLong(56, c5327bwf.y ? 1L : 0L);
                supportSQLiteStatement.bindLong(57, c5327bwf.x ? 1L : 0L);
                supportSQLiteStatement.bindLong(58, c5327bwf.G ? 1L : 0L);
                supportSQLiteStatement.bindLong(59, c5327bwf.O ? 1L : 0L);
                supportSQLiteStatement.bindLong(60, c5327bwf.S ? 1L : 0L);
                supportSQLiteStatement.bindLong(61, c5327bwf.f13635J ? 1L : 0L);
                supportSQLiteStatement.bindLong(62, c5327bwf.w ? 1L : 0L);
                supportSQLiteStatement.bindLong(63, c5327bwf.R ? 1L : 0L);
                supportSQLiteStatement.bindLong(64, c5327bwf.P ? 1L : 0L);
                String str27 = c5327bwf.D;
                if (str27 == null) {
                    supportSQLiteStatement.bindNull(65);
                } else {
                    supportSQLiteStatement.bindString(65, str27);
                }
                supportSQLiteStatement.bindLong(66, c5327bwf.I ? 1L : 0L);
                String str28 = c5327bwf.ai;
                if (str28 == null) {
                    supportSQLiteStatement.bindNull(67);
                } else {
                    supportSQLiteStatement.bindString(67, str28);
                }
                String str29 = c5327bwf.ak;
                if (str29 == null) {
                    supportSQLiteStatement.bindNull(68);
                } else {
                    supportSQLiteStatement.bindString(68, str29);
                }
                supportSQLiteStatement.bindLong(69, c5327bwf.ag);
                String str30 = c5327bwf.aj;
                if (str30 == null) {
                    supportSQLiteStatement.bindNull(70);
                } else {
                    supportSQLiteStatement.bindString(70, str30);
                }
                String str31 = c5327bwf.al;
                if (str31 == null) {
                    supportSQLiteStatement.bindNull(71);
                } else {
                    supportSQLiteStatement.bindString(71, str31);
                }
            }
        };
        this.b = new EntityDeletionOrUpdateAdapter<C5327bwf>(roomDatabase) { // from class: o.bvM.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `offlineFalkorPlayable` WHERE `videoId` = ? AND `regId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            /* renamed from: d */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, C5327bwf c5327bwf) {
                supportSQLiteStatement.bindString(1, c5327bwf.aq);
                supportSQLiteStatement.bindLong(2, c5327bwf.V);
            }
        };
    }

    @Override // o.InterfaceC5258bvP
    public void c(C5327bwf c5327bwf) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.e.insert((EntityInsertionAdapter<C5327bwf>) c5327bwf);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5258bvP
    public void c(List<C5327bwf> list) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.e.insert(list);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5258bvP
    public void a(List<C5327bwf> list) {
        this.d.assertNotSuspendingTransaction();
        this.d.beginTransaction();
        try {
            this.b.handleMultiple(list);
            this.d.setTransactionSuccessful();
        } finally {
            this.d.endTransaction();
        }
    }

    @Override // o.InterfaceC5258bvP
    public List<C5327bwf> b() {
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
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM offlineFalkorPlayable", 0);
        this.d.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.d, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.VIDEO_ID);
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "regId");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "parentId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.VIDEO_TITLE);
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "seasonLabel");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "advisoriesString");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "isEpisode");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "isNSRE");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "isNextPlayableEpisode");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "isAgeProtected");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "isPinProtected");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "isPreviewProtected");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "isAdvisoryDisabled");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "isAvailableToStream");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "isSupplementalVideo");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "duration");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "displayRuntime");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "seasonNumber");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "episodeNumber");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "logicalStart");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "endtime");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "maxAutoplay");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "expTime");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "watchedTime");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "bookmarkMs");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "supportsPrePlay");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "episodeNumberHidden");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "profileId");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "seasonLabels");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "errorType");
            int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "videoType");
            int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR);
            int columnIndexOrThrow33 = CursorUtil.getColumnIndexOrThrow(query, "maturityLevel");
            int columnIndexOrThrow34 = CursorUtil.getColumnIndexOrThrow(query, "synopsis");
            int columnIndexOrThrow35 = CursorUtil.getColumnIndexOrThrow(query, "quality");
            int columnIndexOrThrow36 = CursorUtil.getColumnIndexOrThrow(query, "actors");
            int columnIndexOrThrow37 = CursorUtil.getColumnIndexOrThrow(query, "genres");
            int columnIndexOrThrow38 = CursorUtil.getColumnIndexOrThrow(query, "cert");
            int columnIndexOrThrow39 = CursorUtil.getColumnIndexOrThrow(query, "supplMessage");
            int columnIndexOrThrow40 = CursorUtil.getColumnIndexOrThrow(query, "defaultTrailer");
            int columnIndexOrThrow41 = CursorUtil.getColumnIndexOrThrow(query, "hResPortBoxArtUrl");
            int columnIndexOrThrow42 = CursorUtil.getColumnIndexOrThrow(query, "boxshotUrl");
            int columnIndexOrThrow43 = CursorUtil.getColumnIndexOrThrow(query, "boxartImageId");
            int columnIndexOrThrow44 = CursorUtil.getColumnIndexOrThrow(query, "horzDispUrl");
            int columnIndexOrThrow45 = CursorUtil.getColumnIndexOrThrow(query, "storyUrl");
            int columnIndexOrThrow46 = CursorUtil.getColumnIndexOrThrow(query, "bifUrl");
            int columnIndexOrThrow47 = CursorUtil.getColumnIndexOrThrow(query, "billboardArtUrl");
            int columnIndexOrThrow48 = CursorUtil.getColumnIndexOrThrow(query, "evidenceType");
            int columnIndexOrThrow49 = CursorUtil.getColumnIndexOrThrow(query, "evidenceTitle");
            int columnIndexOrThrow50 = CursorUtil.getColumnIndexOrThrow(query, "catalogIdUrl");
            int columnIndexOrThrow51 = CursorUtil.getColumnIndexOrThrow(query, "titleImgUrl");
            int columnIndexOrThrow52 = CursorUtil.getColumnIndexOrThrow(query, "titleCroppedImgUrl");
            int columnIndexOrThrow53 = CursorUtil.getColumnIndexOrThrow(query, "nextEpisodeId");
            int columnIndexOrThrow54 = CursorUtil.getColumnIndexOrThrow(query, "isOriginal");
            int columnIndexOrThrow55 = CursorUtil.getColumnIndexOrThrow(query, "isPreRelease");
            int columnIndexOrThrow56 = CursorUtil.getColumnIndexOrThrow(query, "hasWatched");
            int columnIndexOrThrow57 = CursorUtil.getColumnIndexOrThrow(query, "hasTrailers");
            int columnIndexOrThrow58 = CursorUtil.getColumnIndexOrThrow(query, "isInQueue");
            int columnIndexOrThrow59 = CursorUtil.getColumnIndexOrThrow(query, "isVideoHd");
            int columnIndexOrThrow60 = CursorUtil.getColumnIndexOrThrow(query, "isVideoUhd");
            int columnIndexOrThrow61 = CursorUtil.getColumnIndexOrThrow(query, "isVideo5dot1");
            int columnIndexOrThrow62 = CursorUtil.getColumnIndexOrThrow(query, "hasSpatialAudio");
            int columnIndexOrThrow63 = CursorUtil.getColumnIndexOrThrow(query, "isVideoHdr10");
            int columnIndexOrThrow64 = CursorUtil.getColumnIndexOrThrow(query, "isVideoDolbyVision");
            int columnIndexOrThrow65 = CursorUtil.getColumnIndexOrThrow(query, "interactiveSummary");
            int columnIndexOrThrow66 = CursorUtil.getColumnIndexOrThrow(query, "isNonSerializedTv");
            int columnIndexOrThrow67 = CursorUtil.getColumnIndexOrThrow(query, "tags");
            int columnIndexOrThrow68 = CursorUtil.getColumnIndexOrThrow(query, "timeCodes");
            int columnIndexOrThrow69 = CursorUtil.getColumnIndexOrThrow(query, "supplementalMessageType");
            int columnIndexOrThrow70 = CursorUtil.getColumnIndexOrThrow(query, "synopsisDpText");
            int columnIndexOrThrow71 = CursorUtil.getColumnIndexOrThrow(query, "synopsisDpEvidenceKey");
            int i4 = columnIndexOrThrow14;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                C5327bwf c5327bwf = new C5327bwf();
                ArrayList arrayList2 = arrayList;
                c5327bwf.aq = query.getString(columnIndexOrThrow);
                c5327bwf.V = query.getInt(columnIndexOrThrow2);
                if (query.isNull(columnIndexOrThrow3)) {
                    c5327bwf.T = null;
                } else {
                    c5327bwf.T = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    c5327bwf.am = null;
                } else {
                    c5327bwf.am = query.getString(columnIndexOrThrow4);
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    c5327bwf.aa = null;
                } else {
                    c5327bwf.aa = query.getString(columnIndexOrThrow5);
                }
                if (query.isNull(columnIndexOrThrow6)) {
                    c5327bwf.e = null;
                } else {
                    c5327bwf.e = query.getString(columnIndexOrThrow6);
                }
                c5327bwf.C = query.getInt(columnIndexOrThrow7) != 0;
                c5327bwf.H = query.getInt(columnIndexOrThrow8) != 0;
                c5327bwf.E = query.getInt(columnIndexOrThrow9) != 0;
                c5327bwf.B = query.getInt(columnIndexOrThrow10) != 0;
                c5327bwf.N = query.getInt(columnIndexOrThrow11) != 0;
                c5327bwf.K = query.getInt(columnIndexOrThrow12) != 0;
                c5327bwf.z = query.getInt(columnIndexOrThrow13) != 0;
                int i5 = i4;
                if (query.getInt(i5) != 0) {
                    i = columnIndexOrThrow;
                    z = true;
                } else {
                    i = columnIndexOrThrow;
                    z = false;
                }
                c5327bwf.A = z;
                int i6 = columnIndexOrThrow15;
                if (query.getInt(i6) != 0) {
                    columnIndexOrThrow15 = i6;
                    z2 = true;
                } else {
                    columnIndexOrThrow15 = i6;
                    z2 = false;
                }
                c5327bwf.M = z2;
                int i7 = columnIndexOrThrow16;
                int i8 = columnIndexOrThrow12;
                c5327bwf.k = query.getInt(i7);
                int i9 = columnIndexOrThrow17;
                c5327bwf.n = query.getInt(i9);
                int i10 = columnIndexOrThrow18;
                c5327bwf.ac = query.getInt(i10);
                int i11 = columnIndexOrThrow19;
                c5327bwf.f13636o = query.getInt(i11);
                int i12 = columnIndexOrThrow20;
                c5327bwf.Q = query.getInt(i12);
                int i13 = columnIndexOrThrow21;
                c5327bwf.l = query.getInt(i13);
                int i14 = columnIndexOrThrow22;
                c5327bwf.W = query.getInt(i14);
                int i15 = columnIndexOrThrow23;
                int i16 = columnIndexOrThrow13;
                c5327bwf.s = query.getLong(i15);
                int i17 = columnIndexOrThrow2;
                int i18 = columnIndexOrThrow24;
                int i19 = columnIndexOrThrow3;
                c5327bwf.an = query.getLong(i18);
                int i20 = columnIndexOrThrow25;
                c5327bwf.b = query.getLong(i20);
                int i21 = columnIndexOrThrow26;
                c5327bwf.ae = query.getInt(i21) != 0;
                int i22 = columnIndexOrThrow27;
                if (query.getInt(i22) != 0) {
                    i2 = i14;
                    z3 = true;
                } else {
                    i2 = i14;
                    z3 = false;
                }
                c5327bwf.m = z3;
                int i23 = columnIndexOrThrow28;
                if (query.isNull(i23)) {
                    i3 = i21;
                    c5327bwf.Y = null;
                } else {
                    i3 = i21;
                    c5327bwf.Y = query.getString(i23);
                }
                int i24 = columnIndexOrThrow29;
                if (query.isNull(i24)) {
                    columnIndexOrThrow28 = i23;
                    c5327bwf.ab = null;
                } else {
                    columnIndexOrThrow28 = i23;
                    c5327bwf.ab = query.getString(i24);
                }
                columnIndexOrThrow29 = i24;
                int i25 = columnIndexOrThrow30;
                c5327bwf.p = query.getInt(i25);
                columnIndexOrThrow30 = i25;
                int i26 = columnIndexOrThrow31;
                c5327bwf.ao = query.getInt(i26);
                columnIndexOrThrow31 = i26;
                int i27 = columnIndexOrThrow32;
                c5327bwf.as = query.getInt(i27);
                columnIndexOrThrow32 = i27;
                int i28 = columnIndexOrThrow33;
                c5327bwf.X = query.getInt(i28);
                int i29 = columnIndexOrThrow34;
                if (query.isNull(i29)) {
                    columnIndexOrThrow33 = i28;
                    c5327bwf.af = null;
                } else {
                    columnIndexOrThrow33 = i28;
                    c5327bwf.af = query.getString(i29);
                }
                int i30 = columnIndexOrThrow35;
                if (query.isNull(i30)) {
                    columnIndexOrThrow34 = i29;
                    c5327bwf.Z = null;
                } else {
                    columnIndexOrThrow34 = i29;
                    c5327bwf.Z = query.getString(i30);
                }
                int i31 = columnIndexOrThrow36;
                if (query.isNull(i31)) {
                    columnIndexOrThrow35 = i30;
                    c5327bwf.d = null;
                } else {
                    columnIndexOrThrow35 = i30;
                    c5327bwf.d = query.getString(i31);
                }
                int i32 = columnIndexOrThrow37;
                if (query.isNull(i32)) {
                    columnIndexOrThrow36 = i31;
                    c5327bwf.r = null;
                } else {
                    columnIndexOrThrow36 = i31;
                    c5327bwf.r = query.getString(i32);
                }
                int i33 = columnIndexOrThrow38;
                if (query.isNull(i33)) {
                    columnIndexOrThrow37 = i32;
                    c5327bwf.h = null;
                } else {
                    columnIndexOrThrow37 = i32;
                    c5327bwf.h = query.getString(i33);
                }
                int i34 = columnIndexOrThrow39;
                if (query.isNull(i34)) {
                    columnIndexOrThrow38 = i33;
                    c5327bwf.ah = null;
                } else {
                    columnIndexOrThrow38 = i33;
                    c5327bwf.ah = query.getString(i34);
                }
                int i35 = columnIndexOrThrow40;
                if (query.isNull(i35)) {
                    columnIndexOrThrow39 = i34;
                    c5327bwf.g = null;
                } else {
                    columnIndexOrThrow39 = i34;
                    c5327bwf.g = query.getString(i35);
                }
                int i36 = columnIndexOrThrow41;
                if (query.isNull(i36)) {
                    columnIndexOrThrow40 = i35;
                    c5327bwf.v = null;
                } else {
                    columnIndexOrThrow40 = i35;
                    c5327bwf.v = query.getString(i36);
                }
                int i37 = columnIndexOrThrow42;
                if (query.isNull(i37)) {
                    columnIndexOrThrow41 = i36;
                    c5327bwf.i = null;
                } else {
                    columnIndexOrThrow41 = i36;
                    c5327bwf.i = query.getString(i37);
                }
                int i38 = columnIndexOrThrow43;
                if (query.isNull(i38)) {
                    columnIndexOrThrow42 = i37;
                    c5327bwf.j = null;
                } else {
                    columnIndexOrThrow42 = i37;
                    c5327bwf.j = query.getString(i38);
                }
                int i39 = columnIndexOrThrow44;
                if (query.isNull(i39)) {
                    columnIndexOrThrow43 = i38;
                    c5327bwf.u = null;
                } else {
                    columnIndexOrThrow43 = i38;
                    c5327bwf.u = query.getString(i39);
                }
                int i40 = columnIndexOrThrow45;
                if (query.isNull(i40)) {
                    columnIndexOrThrow44 = i39;
                    c5327bwf.ad = null;
                } else {
                    columnIndexOrThrow44 = i39;
                    c5327bwf.ad = query.getString(i40);
                }
                int i41 = columnIndexOrThrow46;
                if (query.isNull(i41)) {
                    columnIndexOrThrow45 = i40;
                    c5327bwf.a = null;
                } else {
                    columnIndexOrThrow45 = i40;
                    c5327bwf.a = query.getString(i41);
                }
                int i42 = columnIndexOrThrow47;
                if (query.isNull(i42)) {
                    columnIndexOrThrow46 = i41;
                    c5327bwf.c = null;
                } else {
                    columnIndexOrThrow46 = i41;
                    c5327bwf.c = query.getString(i42);
                }
                int i43 = columnIndexOrThrow48;
                if (query.isNull(i43)) {
                    columnIndexOrThrow47 = i42;
                    c5327bwf.t = null;
                } else {
                    columnIndexOrThrow47 = i42;
                    c5327bwf.t = query.getString(i43);
                }
                int i44 = columnIndexOrThrow49;
                if (query.isNull(i44)) {
                    columnIndexOrThrow48 = i43;
                    c5327bwf.q = null;
                } else {
                    columnIndexOrThrow48 = i43;
                    c5327bwf.q = query.getString(i44);
                }
                int i45 = columnIndexOrThrow50;
                if (query.isNull(i45)) {
                    columnIndexOrThrow49 = i44;
                    c5327bwf.f = null;
                } else {
                    columnIndexOrThrow49 = i44;
                    c5327bwf.f = query.getString(i45);
                }
                int i46 = columnIndexOrThrow51;
                if (query.isNull(i46)) {
                    columnIndexOrThrow50 = i45;
                    c5327bwf.ar = null;
                } else {
                    columnIndexOrThrow50 = i45;
                    c5327bwf.ar = query.getString(i46);
                }
                int i47 = columnIndexOrThrow52;
                if (query.isNull(i47)) {
                    columnIndexOrThrow51 = i46;
                    c5327bwf.ap = null;
                } else {
                    columnIndexOrThrow51 = i46;
                    c5327bwf.ap = query.getString(i47);
                }
                int i48 = columnIndexOrThrow53;
                if (query.isNull(i48)) {
                    columnIndexOrThrow52 = i47;
                    c5327bwf.U = null;
                } else {
                    columnIndexOrThrow52 = i47;
                    c5327bwf.U = query.getString(i48);
                }
                int i49 = columnIndexOrThrow54;
                columnIndexOrThrow54 = i49;
                c5327bwf.F = query.getInt(i49) != 0;
                int i50 = columnIndexOrThrow55;
                columnIndexOrThrow55 = i50;
                c5327bwf.L = query.getInt(i50) != 0;
                int i51 = columnIndexOrThrow56;
                columnIndexOrThrow56 = i51;
                c5327bwf.y = query.getInt(i51) != 0;
                int i52 = columnIndexOrThrow57;
                columnIndexOrThrow57 = i52;
                c5327bwf.x = query.getInt(i52) != 0;
                int i53 = columnIndexOrThrow58;
                columnIndexOrThrow58 = i53;
                c5327bwf.G = query.getInt(i53) != 0;
                int i54 = columnIndexOrThrow59;
                columnIndexOrThrow59 = i54;
                c5327bwf.O = query.getInt(i54) != 0;
                int i55 = columnIndexOrThrow60;
                columnIndexOrThrow60 = i55;
                c5327bwf.S = query.getInt(i55) != 0;
                int i56 = columnIndexOrThrow61;
                columnIndexOrThrow61 = i56;
                c5327bwf.f13635J = query.getInt(i56) != 0;
                int i57 = columnIndexOrThrow62;
                columnIndexOrThrow62 = i57;
                c5327bwf.w = query.getInt(i57) != 0;
                int i58 = columnIndexOrThrow63;
                columnIndexOrThrow63 = i58;
                c5327bwf.R = query.getInt(i58) != 0;
                int i59 = columnIndexOrThrow64;
                columnIndexOrThrow64 = i59;
                c5327bwf.P = query.getInt(i59) != 0;
                int i60 = columnIndexOrThrow65;
                if (query.isNull(i60)) {
                    columnIndexOrThrow53 = i48;
                    c5327bwf.D = null;
                } else {
                    columnIndexOrThrow53 = i48;
                    c5327bwf.D = query.getString(i60);
                }
                int i61 = columnIndexOrThrow66;
                if (query.getInt(i61) != 0) {
                    columnIndexOrThrow65 = i60;
                    z4 = true;
                } else {
                    columnIndexOrThrow65 = i60;
                    z4 = false;
                }
                c5327bwf.I = z4;
                int i62 = columnIndexOrThrow67;
                if (query.isNull(i62)) {
                    columnIndexOrThrow66 = i61;
                    c5327bwf.ai = null;
                } else {
                    columnIndexOrThrow66 = i61;
                    c5327bwf.ai = query.getString(i62);
                }
                int i63 = columnIndexOrThrow68;
                if (query.isNull(i63)) {
                    columnIndexOrThrow67 = i62;
                    c5327bwf.ak = null;
                } else {
                    columnIndexOrThrow67 = i62;
                    c5327bwf.ak = query.getString(i63);
                }
                columnIndexOrThrow68 = i63;
                int i64 = columnIndexOrThrow69;
                c5327bwf.ag = query.getInt(i64);
                int i65 = columnIndexOrThrow70;
                if (query.isNull(i65)) {
                    columnIndexOrThrow69 = i64;
                    c5327bwf.aj = null;
                } else {
                    columnIndexOrThrow69 = i64;
                    c5327bwf.aj = query.getString(i65);
                }
                int i66 = columnIndexOrThrow71;
                if (query.isNull(i66)) {
                    columnIndexOrThrow70 = i65;
                    c5327bwf.al = null;
                } else {
                    columnIndexOrThrow70 = i65;
                    c5327bwf.al = query.getString(i66);
                }
                arrayList2.add(c5327bwf);
                columnIndexOrThrow71 = i66;
                columnIndexOrThrow = i;
                i4 = i5;
                arrayList = arrayList2;
                columnIndexOrThrow12 = i8;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow21 = i13;
                columnIndexOrThrow22 = i2;
                columnIndexOrThrow26 = i3;
                columnIndexOrThrow27 = i22;
                columnIndexOrThrow2 = i17;
                columnIndexOrThrow13 = i16;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow3 = i19;
                columnIndexOrThrow24 = i18;
                columnIndexOrThrow25 = i20;
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
