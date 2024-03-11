package com.netflix.mediaclient.storage.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C5255bvM;
import o.C5256bvN;
import o.C5259bvQ;
import o.C5261bvS;
import o.C5267bvY;
import o.InterfaceC5254bvL;
import o.InterfaceC5258bvP;
import o.InterfaceC5260bvR;
import o.InterfaceC5262bvT;
import o.InterfaceC5263bvU;

/* loaded from: classes6.dex */
public final class OfflineDatabase_Impl extends OfflineDatabase {
    private volatile InterfaceC5263bvU a;
    private volatile InterfaceC5254bvL b;
    private volatile InterfaceC5258bvP c;
    private volatile InterfaceC5260bvR e;
    private volatile InterfaceC5262bvT i;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(25) { // from class: com.netflix.mediaclient.storage.db.OfflineDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `bookmarkStore` (`playableId` TEXT NOT NULL, `profileId` TEXT NOT NULL, `bookmarkInMs` INTEGER NOT NULL, `bookmarkUpdateTimeInUTCMs` INTEGER NOT NULL, PRIMARY KEY(`profileId`, `playableId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlinePlayable` (`playableId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `profileId` TEXT, `videoType` INTEGER NOT NULL, `videoQuality` TEXT, `audioTracks` TEXT, `videoTracks` TEXT, `subtitleTracks` TEXT, `trickPlays` TEXT, `downloadStateValue` INTEGER NOT NULL, `dlStateBeforeDelete` INTEGER NOT NULL, `stopReasonValue` INTEGER NOT NULL, `geoBlocked` INTEGER NOT NULL, `dxId` TEXT, `pcTrackId` INTEGER NOT NULL, `pcVideoPos` INTEGER NOT NULL, `pcListPos` INTEGER NOT NULL, `dcRequestId` TEXT, `dcInitTimeMs` INTEGER NOT NULL, `oxId` TEXT, `playStartTime` INTEGER NOT NULL, `errorCode` INTEGER NOT NULL, `errorString` TEXT, `downloadRequestType` TEXT, `stateTime` INTEGER NOT NULL, `keySetId` TEXT, `expirationTime` INTEGER NOT NULL, `licenseDate` INTEGER NOT NULL, `playableWindowMs` INTEGER NOT NULL, `resettable` INTEGER NOT NULL, `shouldRefresh` INTEGER NOT NULL, `viewingWindow` INTEGER NOT NULL, `playWindowResetLimit` INTEGER NOT NULL, `refreshLicenseTimestamp` INTEGER NOT NULL, `shouldUsePlayWindowLimits` INTEGER NOT NULL, `mShouldRefreshByTimestamp` INTEGER NOT NULL, `activate` TEXT, `linkDeactivate` TEXT, `linkRefresh` TEXT, `convertLicense` TEXT, `overrideRequiresUnmeteredNetwork` INTEGER NOT NULL, `overrideRequiresCharger` INTEGER NOT NULL, `widevineInfo` TEXT, PRIMARY KEY(`playableId`, `regId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineFalkorPlayable` (`videoId` TEXT NOT NULL, `regId` INTEGER NOT NULL, `parentId` TEXT, `title` TEXT, `seasonLabel` TEXT, `advisoriesString` TEXT, `isEpisode` INTEGER NOT NULL, `isNSRE` INTEGER NOT NULL, `isNextPlayableEpisode` INTEGER NOT NULL, `isAgeProtected` INTEGER NOT NULL, `isPinProtected` INTEGER NOT NULL, `isPreviewProtected` INTEGER NOT NULL, `isAdvisoryDisabled` INTEGER NOT NULL, `isAvailableToStream` INTEGER NOT NULL, `isSupplementalVideo` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `displayRuntime` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `logicalStart` INTEGER NOT NULL, `endtime` INTEGER NOT NULL, `maxAutoplay` INTEGER NOT NULL, `expTime` INTEGER NOT NULL, `watchedTime` INTEGER NOT NULL, `bookmarkMs` INTEGER NOT NULL, `supportsPrePlay` INTEGER NOT NULL, `episodeNumberHidden` INTEGER NOT NULL, `profileId` TEXT, `seasonLabels` TEXT, `errorType` INTEGER NOT NULL, `videoType` INTEGER NOT NULL, `year` INTEGER NOT NULL, `maturityLevel` INTEGER NOT NULL, `synopsis` TEXT, `quality` TEXT, `actors` TEXT, `genres` TEXT, `cert` TEXT, `supplMessage` TEXT, `defaultTrailer` TEXT, `hResPortBoxArtUrl` TEXT, `boxshotUrl` TEXT, `boxartImageId` TEXT, `horzDispUrl` TEXT, `storyUrl` TEXT, `bifUrl` TEXT, `billboardArtUrl` TEXT, `evidenceType` TEXT, `evidenceTitle` TEXT, `catalogIdUrl` TEXT, `titleImgUrl` TEXT, `titleCroppedImgUrl` TEXT, `nextEpisodeId` TEXT, `isOriginal` INTEGER NOT NULL, `isPreRelease` INTEGER NOT NULL, `hasWatched` INTEGER NOT NULL, `hasTrailers` INTEGER NOT NULL, `isInQueue` INTEGER NOT NULL, `isVideoHd` INTEGER NOT NULL, `isVideoUhd` INTEGER NOT NULL, `isVideo5dot1` INTEGER NOT NULL, `hasSpatialAudio` INTEGER NOT NULL, `isVideoHdr10` INTEGER NOT NULL, `isVideoDolbyVision` INTEGER NOT NULL, `interactiveSummary` TEXT, `isNonSerializedTv` INTEGER NOT NULL, `tags` TEXT, `timeCodes` TEXT, `supplementalMessageType` INTEGER NOT NULL, `synopsisDpText` TEXT, `synopsisDpEvidenceKey` TEXT, PRIMARY KEY(`videoId`, `regId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineFalkorProfile` (`profileId` TEXT NOT NULL, `name` TEXT, `isKids` INTEGER NOT NULL, `avatarUrl` TEXT, PRIMARY KEY(`profileId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `offlineWatched` (`playableId` TEXT NOT NULL, `isEpisode` INTEGER NOT NULL, `seasonNumber` INTEGER NOT NULL, `episodeNumber` INTEGER NOT NULL, `parentId` TEXT, `trackId` INTEGER NOT NULL, `episodeSmartDownloadedId` TEXT, PRIMARY KEY(`playableId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd8dfab4626962d8d9cf1b8657d8fee1a')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `bookmarkStore`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `offlinePlayable`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `offlineFalkorPlayable`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `offlineFalkorProfile`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `offlineWatched`");
                List<RoomDatabase.Callback> list = OfflineDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List<RoomDatabase.Callback> list = OfflineDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                OfflineDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                OfflineDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List<RoomDatabase.Callback> list = OfflineDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("playableId", new TableInfo.Column("playableId", "TEXT", true, 2, null, 1));
                hashMap.put("profileId", new TableInfo.Column("profileId", "TEXT", true, 1, null, 1));
                hashMap.put("bookmarkInMs", new TableInfo.Column("bookmarkInMs", "INTEGER", true, 0, null, 1));
                hashMap.put("bookmarkUpdateTimeInUTCMs", new TableInfo.Column("bookmarkUpdateTimeInUTCMs", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("bookmarkStore", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "bookmarkStore");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "bookmarkStore(com.netflix.mediaclient.storage.db.entity.BookmarkStoreEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(43);
                hashMap2.put("playableId", new TableInfo.Column("playableId", "TEXT", true, 1, null, 1));
                hashMap2.put("regId", new TableInfo.Column("regId", "INTEGER", true, 2, null, 1));
                hashMap2.put("profileId", new TableInfo.Column("profileId", "TEXT", false, 0, null, 1));
                hashMap2.put("videoType", new TableInfo.Column("videoType", "INTEGER", true, 0, null, 1));
                hashMap2.put("videoQuality", new TableInfo.Column("videoQuality", "TEXT", false, 0, null, 1));
                hashMap2.put("audioTracks", new TableInfo.Column("audioTracks", "TEXT", false, 0, null, 1));
                hashMap2.put("videoTracks", new TableInfo.Column("videoTracks", "TEXT", false, 0, null, 1));
                hashMap2.put("subtitleTracks", new TableInfo.Column("subtitleTracks", "TEXT", false, 0, null, 1));
                hashMap2.put("trickPlays", new TableInfo.Column("trickPlays", "TEXT", false, 0, null, 1));
                hashMap2.put("downloadStateValue", new TableInfo.Column("downloadStateValue", "INTEGER", true, 0, null, 1));
                hashMap2.put("dlStateBeforeDelete", new TableInfo.Column("dlStateBeforeDelete", "INTEGER", true, 0, null, 1));
                hashMap2.put("stopReasonValue", new TableInfo.Column("stopReasonValue", "INTEGER", true, 0, null, 1));
                hashMap2.put("geoBlocked", new TableInfo.Column("geoBlocked", "INTEGER", true, 0, null, 1));
                hashMap2.put("dxId", new TableInfo.Column("dxId", "TEXT", false, 0, null, 1));
                hashMap2.put("pcTrackId", new TableInfo.Column("pcTrackId", "INTEGER", true, 0, null, 1));
                hashMap2.put("pcVideoPos", new TableInfo.Column("pcVideoPos", "INTEGER", true, 0, null, 1));
                hashMap2.put("pcListPos", new TableInfo.Column("pcListPos", "INTEGER", true, 0, null, 1));
                hashMap2.put("dcRequestId", new TableInfo.Column("dcRequestId", "TEXT", false, 0, null, 1));
                hashMap2.put("dcInitTimeMs", new TableInfo.Column("dcInitTimeMs", "INTEGER", true, 0, null, 1));
                hashMap2.put("oxId", new TableInfo.Column("oxId", "TEXT", false, 0, null, 1));
                hashMap2.put("playStartTime", new TableInfo.Column("playStartTime", "INTEGER", true, 0, null, 1));
                hashMap2.put("errorCode", new TableInfo.Column("errorCode", "INTEGER", true, 0, null, 1));
                hashMap2.put("errorString", new TableInfo.Column("errorString", "TEXT", false, 0, null, 1));
                hashMap2.put("downloadRequestType", new TableInfo.Column("downloadRequestType", "TEXT", false, 0, null, 1));
                hashMap2.put("stateTime", new TableInfo.Column("stateTime", "INTEGER", true, 0, null, 1));
                hashMap2.put("keySetId", new TableInfo.Column("keySetId", "TEXT", false, 0, null, 1));
                hashMap2.put("expirationTime", new TableInfo.Column("expirationTime", "INTEGER", true, 0, null, 1));
                hashMap2.put("licenseDate", new TableInfo.Column("licenseDate", "INTEGER", true, 0, null, 1));
                hashMap2.put("playableWindowMs", new TableInfo.Column("playableWindowMs", "INTEGER", true, 0, null, 1));
                hashMap2.put("resettable", new TableInfo.Column("resettable", "INTEGER", true, 0, null, 1));
                hashMap2.put("shouldRefresh", new TableInfo.Column("shouldRefresh", "INTEGER", true, 0, null, 1));
                hashMap2.put("viewingWindow", new TableInfo.Column("viewingWindow", "INTEGER", true, 0, null, 1));
                hashMap2.put("playWindowResetLimit", new TableInfo.Column("playWindowResetLimit", "INTEGER", true, 0, null, 1));
                hashMap2.put("refreshLicenseTimestamp", new TableInfo.Column("refreshLicenseTimestamp", "INTEGER", true, 0, null, 1));
                hashMap2.put("shouldUsePlayWindowLimits", new TableInfo.Column("shouldUsePlayWindowLimits", "INTEGER", true, 0, null, 1));
                hashMap2.put("mShouldRefreshByTimestamp", new TableInfo.Column("mShouldRefreshByTimestamp", "INTEGER", true, 0, null, 1));
                hashMap2.put("activate", new TableInfo.Column("activate", "TEXT", false, 0, null, 1));
                hashMap2.put("linkDeactivate", new TableInfo.Column("linkDeactivate", "TEXT", false, 0, null, 1));
                hashMap2.put("linkRefresh", new TableInfo.Column("linkRefresh", "TEXT", false, 0, null, 1));
                hashMap2.put("convertLicense", new TableInfo.Column("convertLicense", "TEXT", false, 0, null, 1));
                hashMap2.put("overrideRequiresUnmeteredNetwork", new TableInfo.Column("overrideRequiresUnmeteredNetwork", "INTEGER", true, 0, null, 1));
                hashMap2.put("overrideRequiresCharger", new TableInfo.Column("overrideRequiresCharger", "INTEGER", true, 0, null, 1));
                hashMap2.put("widevineInfo", new TableInfo.Column("widevineInfo", "TEXT", false, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("offlinePlayable", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "offlinePlayable");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "offlinePlayable(com.netflix.mediaclient.storage.db.entity.OfflinePlayableEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(71);
                hashMap3.put(SignupConstants.Field.VIDEO_ID, new TableInfo.Column(SignupConstants.Field.VIDEO_ID, "TEXT", true, 1, null, 1));
                hashMap3.put("regId", new TableInfo.Column("regId", "INTEGER", true, 2, null, 1));
                hashMap3.put("parentId", new TableInfo.Column("parentId", "TEXT", false, 0, null, 1));
                hashMap3.put(SignupConstants.Field.VIDEO_TITLE, new TableInfo.Column(SignupConstants.Field.VIDEO_TITLE, "TEXT", false, 0, null, 1));
                hashMap3.put("seasonLabel", new TableInfo.Column("seasonLabel", "TEXT", false, 0, null, 1));
                hashMap3.put("advisoriesString", new TableInfo.Column("advisoriesString", "TEXT", false, 0, null, 1));
                hashMap3.put("isEpisode", new TableInfo.Column("isEpisode", "INTEGER", true, 0, null, 1));
                hashMap3.put("isNSRE", new TableInfo.Column("isNSRE", "INTEGER", true, 0, null, 1));
                hashMap3.put("isNextPlayableEpisode", new TableInfo.Column("isNextPlayableEpisode", "INTEGER", true, 0, null, 1));
                hashMap3.put("isAgeProtected", new TableInfo.Column("isAgeProtected", "INTEGER", true, 0, null, 1));
                hashMap3.put("isPinProtected", new TableInfo.Column("isPinProtected", "INTEGER", true, 0, null, 1));
                hashMap3.put("isPreviewProtected", new TableInfo.Column("isPreviewProtected", "INTEGER", true, 0, null, 1));
                hashMap3.put("isAdvisoryDisabled", new TableInfo.Column("isAdvisoryDisabled", "INTEGER", true, 0, null, 1));
                hashMap3.put("isAvailableToStream", new TableInfo.Column("isAvailableToStream", "INTEGER", true, 0, null, 1));
                hashMap3.put("isSupplementalVideo", new TableInfo.Column("isSupplementalVideo", "INTEGER", true, 0, null, 1));
                hashMap3.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
                hashMap3.put("displayRuntime", new TableInfo.Column("displayRuntime", "INTEGER", true, 0, null, 1));
                hashMap3.put("seasonNumber", new TableInfo.Column("seasonNumber", "INTEGER", true, 0, null, 1));
                hashMap3.put("episodeNumber", new TableInfo.Column("episodeNumber", "INTEGER", true, 0, null, 1));
                hashMap3.put("logicalStart", new TableInfo.Column("logicalStart", "INTEGER", true, 0, null, 1));
                hashMap3.put("endtime", new TableInfo.Column("endtime", "INTEGER", true, 0, null, 1));
                hashMap3.put("maxAutoplay", new TableInfo.Column("maxAutoplay", "INTEGER", true, 0, null, 1));
                hashMap3.put("expTime", new TableInfo.Column("expTime", "INTEGER", true, 0, null, 1));
                hashMap3.put("watchedTime", new TableInfo.Column("watchedTime", "INTEGER", true, 0, null, 1));
                hashMap3.put("bookmarkMs", new TableInfo.Column("bookmarkMs", "INTEGER", true, 0, null, 1));
                hashMap3.put("supportsPrePlay", new TableInfo.Column("supportsPrePlay", "INTEGER", true, 0, null, 1));
                hashMap3.put("episodeNumberHidden", new TableInfo.Column("episodeNumberHidden", "INTEGER", true, 0, null, 1));
                hashMap3.put("profileId", new TableInfo.Column("profileId", "TEXT", false, 0, null, 1));
                hashMap3.put("seasonLabels", new TableInfo.Column("seasonLabels", "TEXT", false, 0, null, 1));
                hashMap3.put("errorType", new TableInfo.Column("errorType", "INTEGER", true, 0, null, 1));
                hashMap3.put("videoType", new TableInfo.Column("videoType", "INTEGER", true, 0, null, 1));
                hashMap3.put(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR, new TableInfo.Column(SignupConstants.Field.DEMO_COLLECT_BIRTH_YEAR, "INTEGER", true, 0, null, 1));
                hashMap3.put("maturityLevel", new TableInfo.Column("maturityLevel", "INTEGER", true, 0, null, 1));
                hashMap3.put("synopsis", new TableInfo.Column("synopsis", "TEXT", false, 0, null, 1));
                hashMap3.put("quality", new TableInfo.Column("quality", "TEXT", false, 0, null, 1));
                hashMap3.put("actors", new TableInfo.Column("actors", "TEXT", false, 0, null, 1));
                hashMap3.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, 1));
                hashMap3.put("cert", new TableInfo.Column("cert", "TEXT", false, 0, null, 1));
                hashMap3.put("supplMessage", new TableInfo.Column("supplMessage", "TEXT", false, 0, null, 1));
                hashMap3.put("defaultTrailer", new TableInfo.Column("defaultTrailer", "TEXT", false, 0, null, 1));
                hashMap3.put("hResPortBoxArtUrl", new TableInfo.Column("hResPortBoxArtUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("boxshotUrl", new TableInfo.Column("boxshotUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("boxartImageId", new TableInfo.Column("boxartImageId", "TEXT", false, 0, null, 1));
                hashMap3.put("horzDispUrl", new TableInfo.Column("horzDispUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("storyUrl", new TableInfo.Column("storyUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("bifUrl", new TableInfo.Column("bifUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("billboardArtUrl", new TableInfo.Column("billboardArtUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("evidenceType", new TableInfo.Column("evidenceType", "TEXT", false, 0, null, 1));
                hashMap3.put("evidenceTitle", new TableInfo.Column("evidenceTitle", "TEXT", false, 0, null, 1));
                hashMap3.put("catalogIdUrl", new TableInfo.Column("catalogIdUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("titleImgUrl", new TableInfo.Column("titleImgUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("titleCroppedImgUrl", new TableInfo.Column("titleCroppedImgUrl", "TEXT", false, 0, null, 1));
                hashMap3.put("nextEpisodeId", new TableInfo.Column("nextEpisodeId", "TEXT", false, 0, null, 1));
                hashMap3.put("isOriginal", new TableInfo.Column("isOriginal", "INTEGER", true, 0, null, 1));
                hashMap3.put("isPreRelease", new TableInfo.Column("isPreRelease", "INTEGER", true, 0, null, 1));
                hashMap3.put("hasWatched", new TableInfo.Column("hasWatched", "INTEGER", true, 0, null, 1));
                hashMap3.put("hasTrailers", new TableInfo.Column("hasTrailers", "INTEGER", true, 0, null, 1));
                hashMap3.put("isInQueue", new TableInfo.Column("isInQueue", "INTEGER", true, 0, null, 1));
                hashMap3.put("isVideoHd", new TableInfo.Column("isVideoHd", "INTEGER", true, 0, null, 1));
                hashMap3.put("isVideoUhd", new TableInfo.Column("isVideoUhd", "INTEGER", true, 0, null, 1));
                hashMap3.put("isVideo5dot1", new TableInfo.Column("isVideo5dot1", "INTEGER", true, 0, null, 1));
                hashMap3.put("hasSpatialAudio", new TableInfo.Column("hasSpatialAudio", "INTEGER", true, 0, null, 1));
                hashMap3.put("isVideoHdr10", new TableInfo.Column("isVideoHdr10", "INTEGER", true, 0, null, 1));
                hashMap3.put("isVideoDolbyVision", new TableInfo.Column("isVideoDolbyVision", "INTEGER", true, 0, null, 1));
                hashMap3.put("interactiveSummary", new TableInfo.Column("interactiveSummary", "TEXT", false, 0, null, 1));
                hashMap3.put("isNonSerializedTv", new TableInfo.Column("isNonSerializedTv", "INTEGER", true, 0, null, 1));
                hashMap3.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1));
                hashMap3.put("timeCodes", new TableInfo.Column("timeCodes", "TEXT", false, 0, null, 1));
                hashMap3.put("supplementalMessageType", new TableInfo.Column("supplementalMessageType", "INTEGER", true, 0, null, 1));
                hashMap3.put("synopsisDpText", new TableInfo.Column("synopsisDpText", "TEXT", false, 0, null, 1));
                hashMap3.put("synopsisDpEvidenceKey", new TableInfo.Column("synopsisDpEvidenceKey", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("offlineFalkorPlayable", hashMap3, new HashSet(0), new HashSet(0));
                TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "offlineFalkorPlayable");
                if (!tableInfo3.equals(read3)) {
                    return new RoomOpenHelper.ValidationResult(false, "offlineFalkorPlayable(com.netflix.mediaclient.storage.db.entity.OfflineFalkorPlayableEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("profileId", new TableInfo.Column("profileId", "TEXT", true, 1, null, 1));
                hashMap4.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
                hashMap4.put("isKids", new TableInfo.Column("isKids", "INTEGER", true, 0, null, 1));
                hashMap4.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("offlineFalkorProfile", hashMap4, new HashSet(0), new HashSet(0));
                TableInfo read4 = TableInfo.read(supportSQLiteDatabase, "offlineFalkorProfile");
                if (!tableInfo4.equals(read4)) {
                    return new RoomOpenHelper.ValidationResult(false, "offlineFalkorProfile(com.netflix.mediaclient.storage.db.entity.OfflineFalkorProfileEntity).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(7);
                hashMap5.put("playableId", new TableInfo.Column("playableId", "TEXT", true, 1, null, 1));
                hashMap5.put("isEpisode", new TableInfo.Column("isEpisode", "INTEGER", true, 0, null, 1));
                hashMap5.put("seasonNumber", new TableInfo.Column("seasonNumber", "INTEGER", true, 0, null, 1));
                hashMap5.put("episodeNumber", new TableInfo.Column("episodeNumber", "INTEGER", true, 0, null, 1));
                hashMap5.put("parentId", new TableInfo.Column("parentId", "TEXT", false, 0, null, 1));
                hashMap5.put("trackId", new TableInfo.Column("trackId", "INTEGER", true, 0, null, 1));
                hashMap5.put("episodeSmartDownloadedId", new TableInfo.Column("episodeSmartDownloadedId", "TEXT", false, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("offlineWatched", hashMap5, new HashSet(0), new HashSet(0));
                TableInfo read5 = TableInfo.read(supportSQLiteDatabase, "offlineWatched");
                if (!tableInfo5.equals(read5)) {
                    return new RoomOpenHelper.ValidationResult(false, "offlineWatched(com.netflix.mediaclient.storage.db.entity.OfflineWatchedEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "d8dfab4626962d8d9cf1b8657d8fee1a", "06cdd3b3f7606047ad391dcc64d9e06e")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "bookmarkStore", "offlinePlayable", "offlineFalkorPlayable", "offlineFalkorProfile", "offlineWatched");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC5254bvL.class, C5256bvN.b());
        hashMap.put(InterfaceC5260bvR.class, C5261bvS.c());
        hashMap.put(InterfaceC5258bvP.class, C5255bvM.c());
        hashMap.put(InterfaceC5263bvU.class, C5259bvQ.a());
        hashMap.put(InterfaceC5262bvT.class, C5267bvY.d());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends Object>, Object> map) {
        return new ArrayList();
    }

    @Override // com.netflix.mediaclient.storage.db.OfflineDatabase
    public InterfaceC5254bvL z() {
        InterfaceC5254bvL interfaceC5254bvL;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new C5256bvN(this);
            }
            interfaceC5254bvL = this.b;
        }
        return interfaceC5254bvL;
    }

    @Override // com.netflix.mediaclient.storage.db.OfflineDatabase
    public InterfaceC5260bvR D() {
        InterfaceC5260bvR interfaceC5260bvR;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new C5261bvS(this);
            }
            interfaceC5260bvR = this.e;
        }
        return interfaceC5260bvR;
    }

    @Override // com.netflix.mediaclient.storage.db.OfflineDatabase
    public InterfaceC5258bvP A() {
        InterfaceC5258bvP interfaceC5258bvP;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new C5255bvM(this);
            }
            interfaceC5258bvP = this.c;
        }
        return interfaceC5258bvP;
    }

    @Override // com.netflix.mediaclient.storage.db.OfflineDatabase
    public InterfaceC5263bvU B() {
        InterfaceC5263bvU interfaceC5263bvU;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new C5259bvQ(this);
            }
            interfaceC5263bvU = this.a;
        }
        return interfaceC5263bvU;
    }

    @Override // com.netflix.mediaclient.storage.db.OfflineDatabase
    public InterfaceC5262bvT I() {
        InterfaceC5262bvT interfaceC5262bvT;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new C5267bvY(this);
            }
            interfaceC5262bvT = this.i;
        }
        return interfaceC5262bvT;
    }
}
