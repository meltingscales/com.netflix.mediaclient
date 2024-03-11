package com.netflix.mediaclient.storage.db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C1044Mm;
import o.C1596aHd;
import o.C8157dfA;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5254bvL;
import o.InterfaceC5258bvP;
import o.InterfaceC5260bvR;
import o.InterfaceC5262bvT;
import o.InterfaceC5263bvU;
import o.dpR;
import o.dqE;

/* loaded from: classes.dex */
public abstract class OfflineDatabase extends RoomDatabase {
    private static OfflineDatabase z;
    private final ThreadPoolExecutor D = new ThreadPoolExecutor(0, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final e d = new e(null);
    private static final Migration n = new o();
    private static final Migration r = new p();
    private static final Migration p = new t();
    private static final Migration t = new r();
    private static final Migration y = new u();
    private static final Migration x = new y();
    private static final Migration v = new v();
    private static final Migration w = new w();
    private static final Migration u = new x();
    private static final Migration a = new a();
    private static final Migration e = new d();
    private static final Migration b = new c();
    private static final Migration c = new b();
    private static final Migration i = new j();
    private static final Migration h = new i();
    private static final Migration f = new h();
    private static final Migration g = new g();
    private static final Migration j = new f();
    private static final Migration k = new m();
    private static final Migration m = new l();
    private static final Migration l = new k();

    /* renamed from: o  reason: collision with root package name */
    private static final Migration f13239o = new n();
    private static final Migration s = new s();
    private static final Migration q = new q();

    public abstract InterfaceC5258bvP A();

    public abstract InterfaceC5263bvU B();

    public final ThreadPoolExecutor C() {
        return this.D;
    }

    public abstract InterfaceC5260bvR D();

    public abstract InterfaceC5262bvT I();

    public abstract InterfaceC5254bvL z();

    /* loaded from: classes.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final OfflineDatabase c(Context context) {
            C8632dsu.c((Object) context, "");
            if (OfflineDatabase.z == null) {
                synchronized (OfflineDatabase.class) {
                    if (OfflineDatabase.z == null) {
                        OfflineDatabase.z = OfflineDatabase.d.d(context).build();
                    }
                    dpR dpr = dpR.c;
                }
            }
            OfflineDatabase offlineDatabase = OfflineDatabase.z;
            C8632dsu.d(offlineDatabase);
            return offlineDatabase;
        }

        public final RoomDatabase.Builder<OfflineDatabase> d(Context context) {
            C8632dsu.c((Object) context, "");
            return Room.databaseBuilder(context, OfflineDatabase.class, "OfflineDb").addMigrations(OfflineDatabase.n).addMigrations(OfflineDatabase.r).addMigrations(OfflineDatabase.p).addMigrations(OfflineDatabase.t).addMigrations(OfflineDatabase.y).addMigrations(OfflineDatabase.x).addMigrations(OfflineDatabase.v).addMigrations(OfflineDatabase.w).addMigrations(OfflineDatabase.u).addMigrations(OfflineDatabase.a).addMigrations(OfflineDatabase.e).addMigrations(OfflineDatabase.b).addMigrations(OfflineDatabase.c).addMigrations(OfflineDatabase.i).addMigrations(OfflineDatabase.h).addMigrations(OfflineDatabase.f).addMigrations(OfflineDatabase.g).addMigrations(OfflineDatabase.j).addMigrations(OfflineDatabase.k).addMigrations(OfflineDatabase.m).addMigrations(OfflineDatabase.l).addMigrations(OfflineDatabase.f13239o).addMigrations(OfflineDatabase.s).addMigrations(OfflineDatabase.q);
        }

        public final void a(Context context, Exception exc) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) exc, "");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("handleDbException dbErr", exc, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            C8157dfA.a(context, "db_exception_count", C8157dfA.d(context, "db_exception_count", 0) + 1);
        }

        public final void a(Context context) {
            C8632dsu.c((Object) context, "");
            int d = C8157dfA.d(context, "db_exception_count", 0);
            C1044Mm.c("OfflineDb", "onAppStarted count=%d", Integer.valueOf(d));
            if (d >= 10) {
                C8157dfA.a(context, "db_exception_count", 0);
                C1044Mm.c("OfflineDb", "onAppStarted deleteDone=%b", Boolean.valueOf(context.deleteDatabase("OfflineDb")));
                return;
            }
            b(context);
        }

        private final void b(Context context) {
            File databasePath = context.getDatabasePath("OfflineDb");
            C8632dsu.a(databasePath, "");
            if (!databasePath.exists() || databasePath.canWrite()) {
                return;
            }
            databasePath.setWritable(true);
            C1044Mm.c("OfflineDb", "now canWrite=%b", Boolean.valueOf(databasePath.canWrite()));
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends Migration {
        o() {
            super(1, 2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `bookmarkStore` (`playableId` TEXT NOT NULL, `profileId` TEXT NOT NULL, `bookmarkInSecond` INTEGER NOT NULL, `bookmarkUpdateTimeInUTCMs` INTEGER NOT NULL, PRIMARY KEY(`profileId`, `playableId`))");
            supportSQLiteDatabase.execSQL("ALTER TABLE myListSmartDownload ADD COLUMN episodeId TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends Migration {
        p() {
            super(2, 3);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlinePlayable` (`playableId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `profileId` TEXT, `videoType` INTEGER NOT NULL, `videoQuality` TEXT, `audioTracks` TEXT, `videoTracks` TEXT, `subtitleTracks` TEXT, `trickPlays` TEXT, `downloadStateValue` INTEGER NOT NULL, `dlStateBeforeDelete` INTEGER NOT NULL, `stopReasonValue` INTEGER NOT NULL, `geoBlocked` INTEGER NOT NULL, `dxId` TEXT, `pcTrackId` INTEGER NOT NULL, `pcVideoPos` INTEGER NOT NULL, `pcListPos` INTEGER NOT NULL, `dcRequestId` TEXT, `dcInitTimeMs` INTEGER NOT NULL, `oxId` TEXT, `playStartTime` INTEGER NOT NULL, `errorCode` INTEGER NOT NULL, `errorString` TEXT, `stateTime` INTEGER NOT NULL, `keySetId` TEXT, `expirationTime` INTEGER NOT NULL, `licenseDate` INTEGER NOT NULL, `playableWindowMs` INTEGER NOT NULL, `resettable` INTEGER NOT NULL, `shouldRefresh` INTEGER NOT NULL, `viewingWindow` INTEGER NOT NULL, `playWindowResetLimit` INTEGER NOT NULL, `refreshLicenseTimestamp` INTEGER NOT NULL, `shouldUsePlayWindowLimits` INTEGER NOT NULL, `mShouldRefreshByTimestamp` INTEGER NOT NULL, `activate` TEXT, `linkDeactivate` TEXT, `linkRefresh` TEXT, `convertLicense` TEXT, PRIMARY KEY(`playableId`, `regId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineFalkorPlayable` (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmark` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `hResLandBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `horzDispSmallUrl` TEXT, `storyDispUrl` TEXT, `tvCardUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `interactiveFeatures` TEXT, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineWatched` (`episodeSmartDownloadedId` TEXT, `playableId` TEXT NOT NULL, `isEpisode` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `parentId` TEXT, PRIMARY KEY(`playableId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineFalkorProfile` (`profileId` TEXT NOT NULL, `name` TEXT, `isKids` INTEGER NOT NULL, `avatarUrl` TEXT, PRIMARY KEY(`profileId`))");
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends Migration {
        t() {
            super(3, 4);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmark` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `horzDispSmallUrl` TEXT, `storyDispUrl` TEXT, `tvCardUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `interactiveFeatures` TEXT, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmark, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, copyright, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, horzDispSmallUrl, storyDispUrl, tvCardUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, interactiveFeatures FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends Migration {
        r() {
            super(4, 5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineWatched ADD COLUMN trackId INTEGER NOT NULL DEFAULT 253494112");
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends Migration {
        u() {
            super(5, 6);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE `myListSmartDownload`");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlinePlayable ADD COLUMN overrideRequiresUnmeteredNetwork INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends Migration {
        y() {
            super(6, 7);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN isNonSerializedTv INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends Migration {
        v() {
            super(7, 8);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN tags TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends Migration {
        w() {
            super(8, 9);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN timeCodes TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends Migration {
        x() {
            super(9, 10);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlinePlayable ADD COLUMN downloadRequestType TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends Migration {
        a() {
            super(10, 11);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN billboardArtUrl TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Migration {
        d() {
            super(11, 12);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN evidenceTitle TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN evidenceType TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Migration {
        c() {
            super(12, 13);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN supplementalMessageType INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Migration {
        b() {
            super(13, 14);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmark` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `horzDispSmallUrl` TEXT, `storyDispUrl` TEXT, `tvCardUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmark, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, copyright, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, horzDispSmallUrl, storyDispUrl, tvCardUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType  FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN interactiveSummary TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends Migration {
        j() {
            super(14, 15);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN displayRuntime INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends Migration {
        i() {
            super(15, 16);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN titleGroupId INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends Migration {
        h() {
            super(16, 17);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE `tempTable` (`playableId` TEXT NOT NULL, `profileId` TEXT NOT NULL, `bookmarkInMs` INTEGER NOT NULL, `bookmarkUpdateTimeInUTCMs` INTEGER NOT NULL, PRIMARY KEY(`profileId`, `playableId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO `tempTable` SELECT playableId, profileId, bookmarkInSecond, bookmarkUpdateTimeInUTCMs from `bookmarkStore`");
            supportSQLiteDatabase.execSQL("UPDATE `tempTable` set bookmarkInMs = bookmarkInMs*1000");
            supportSQLiteDatabase.execSQL("DROP TABLE `bookmarkStore`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `bookmarkStore`");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `horzDispSmallUrl` TEXT, `storyDispUrl` TEXT, `tvCardUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, `interactiveSummary` TEXT, `displayRuntime` INTEGER NOT NULL DEFAULT 0, `titleGroupId` INTEGER NOT NULL DEFAULT 0,  PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmark, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, copyright, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, horzDispSmallUrl, storyDispUrl, tvCardUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType, interactiveSummary, displayRuntime, titleGroupId  FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("UPDATE `tempTable` set bookmarkMs = bookmarkMs*1000");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends Migration {
        g() {
            super(17, 18);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN synopsisDpEvidenceKey TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN synopsisDpText TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends Migration {
        f() {
            super(18, 19);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlinePlayable ADD COLUMN overrideRequiresCharger INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends Migration {
        m() {
            super(19, 20);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `horzDispSmallUrl` TEXT, `storyDispUrl` TEXT, `tvCardUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, `interactiveSummary` TEXT, `displayRuntime` INTEGER NOT NULL DEFAULT 0, `synopsisDpText` TEXT, `synopsisDpEvidenceKey` TEXT, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmarkMs, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, copyright, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, horzDispSmallUrl, storyDispUrl, tvCardUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType, interactiveSummary, displayRuntime, synopsisDpText, synopsisDpEvidenceKey FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends Migration {
        l() {
            super(20, 21);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `copyright` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, `interactiveSummary` TEXT, `displayRuntime` INTEGER NOT NULL DEFAULT 0, `synopsisDpText` TEXT, `synopsisDpEvidenceKey` TEXT, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmarkMs, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, copyright, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType, interactiveSummary, displayRuntime, synopsisDpText, synopsisDpEvidenceKey FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends Migration {
        k() {
            super(21, 22);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlineFalkorPlayable ADD COLUMN hasSpatialAudio INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends Migration {
        n() {
            super(22, 23);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isAutoPlay` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, `interactiveSummary` TEXT, `displayRuntime` INTEGER NOT NULL DEFAULT 0, `synopsisDpText` TEXT, `synopsisDpEvidenceKey` TEXT, `hasSpatialAudio` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE, isAutoPlay, isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmarkMs, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType, interactiveSummary, displayRuntime, synopsisDpText, synopsisDpEvidenceKey, hasSpatialAudio FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends Migration {
        s() {
            super(23, 24);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE offlinePlayable ADD COLUMN widevineInfo TEXT");
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends Migration {
        q() {
            super(24, 25);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE temptable (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `isNonSerializedTv` INTEGER NOT NULL DEFAULT 0, `tags` TEXT, `timeCodes` TEXT, `billboardArtUrl` TEXT, `evidenceTitle` TEXT, `evidenceType` TEXT, `supplementalMessageType` INTEGER NOT NULL DEFAULT -1, `interactiveSummary` TEXT, `displayRuntime` INTEGER NOT NULL DEFAULT 0, `synopsisDpText` TEXT, `synopsisDpEvidenceKey` TEXT, `hasSpatialAudio` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`videoId`, `regId`))");
            supportSQLiteDatabase.execSQL("INSERT INTO tempTable SELECT videoId, regId, parentId, title, seasonLabel, advisoriesString, isEpisode, isNSRE,  isNextPlayableEpisode, isAgeProtected, isPinProtected, isPreviewProtected, isAdvisoryDisabled, isAvailableToStream, isSupplementalVideo, duration, seasonNumber, episodeNumber, logicalStart, endtime, maxAutoplay, expTime, watchedTime, bookmarkMs, supportsPrePlay, episodeNumberHidden, profileId, seasonLabels, errorType, videoType, year, maturityLevel, synopsis, quality, actors, genres, cert, supplMessage, defaultTrailer, hResPortBoxArtUrl, boxshotUrl, boxartImageId, horzDispUrl, storyUrl, bifUrl, catalogIdUrl, titleImgUrl, titleCroppedImgUrl, nextEpisodeId, isOriginal, isPreRelease, hasWatched, hasTrailers, isInQueue, isVideoHd, isVideoUhd, isVideo5dot1, isVideoHdr10, isVideoDolbyVision, isNonSerializedTv, tags, timeCodes, billboardArtUrl, evidenceTitle, evidenceType, supplementalMessageType, interactiveSummary, displayRuntime, synopsisDpText, synopsisDpEvidenceKey, hasSpatialAudio FROM `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("DROP TABLE `offlineFalkorPlayable`");
            supportSQLiteDatabase.execSQL("ALTER TABLE tempTable RENAME TO `offlineFalkorPlayable`");
        }
    }
}
