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
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C5265bvW;
import o.C5322bwa;
import o.InterfaceC5264bvV;
import o.InterfaceC5324bwc;

/* loaded from: classes6.dex */
public final class AppHistoryDb_Impl extends AppHistoryDb {
    private volatile InterfaceC5264bvV d;
    private volatile InterfaceC5324bwc e;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(2) { // from class: com.netflix.mediaclient.storage.db.AppHistoryDb_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `playEvent` (`playableId` TEXT NOT NULL, `xid` TEXT NOT NULL, `eventTime` INTEGER NOT NULL, `eventType` INTEGER NOT NULL, `network` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `offline` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_playEvent_playableId` ON `playEvent` (`playableId`)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_playEvent_xid` ON `playEvent` (`xid`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `sessionNetworkStatistics` (`streamId` INTEGER NOT NULL, `bytes` INTEGER NOT NULL, `interval` INTEGER NOT NULL, `locationID` TEXT NOT NULL, `ip` TEXT NOT NULL, `networkType` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `totalBufferingTime` INTEGER NOT NULL, PRIMARY KEY(`streamId`, `timestamp`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64783612aaf2bdb45e97b2103e0b66f2')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `playEvent`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `sessionNetworkStatistics`");
                List<RoomDatabase.Callback> list = AppHistoryDb_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List<RoomDatabase.Callback> list = AppHistoryDb_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                AppHistoryDb_Impl.this.mDatabase = supportSQLiteDatabase;
                AppHistoryDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List<RoomDatabase.Callback> list = AppHistoryDb_Impl.this.mCallbacks;
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
                HashMap hashMap = new HashMap(8);
                hashMap.put("playableId", new TableInfo.Column("playableId", "TEXT", true, 0, null, 1));
                hashMap.put("xid", new TableInfo.Column("xid", "TEXT", true, 0, null, 1));
                hashMap.put("eventTime", new TableInfo.Column("eventTime", "INTEGER", true, 0, null, 1));
                hashMap.put(Payload.PARAM_RENO_EVENT_TYPE, new TableInfo.Column(Payload.PARAM_RENO_EVENT_TYPE, "INTEGER", true, 0, null, 1));
                hashMap.put("network", new TableInfo.Column("network", "INTEGER", true, 0, null, 1));
                hashMap.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
                hashMap.put("offline", new TableInfo.Column("offline", "INTEGER", true, 0, null, 1));
                hashMap.put(SignupConstants.Field.LANG_ID, new TableInfo.Column(SignupConstants.Field.LANG_ID, "INTEGER", true, 1, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_playEvent_playableId", false, Arrays.asList("playableId"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_playEvent_xid", false, Arrays.asList("xid"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("playEvent", hashMap, hashSet, hashSet2);
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "playEvent");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "playEvent(com.netflix.mediaclient.storage.db.entity.PlayEventEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put("streamId", new TableInfo.Column("streamId", "INTEGER", true, 1, null, 1));
                hashMap2.put("bytes", new TableInfo.Column("bytes", "INTEGER", true, 0, null, 1));
                hashMap2.put("interval", new TableInfo.Column("interval", "INTEGER", true, 0, null, 1));
                hashMap2.put("locationID", new TableInfo.Column("locationID", "TEXT", true, 0, null, 1));
                hashMap2.put("ip", new TableInfo.Column("ip", "TEXT", true, 0, null, 1));
                hashMap2.put("networkType", new TableInfo.Column("networkType", "TEXT", true, 0, null, 1));
                hashMap2.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 2, null, 1));
                hashMap2.put("totalBufferingTime", new TableInfo.Column("totalBufferingTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("sessionNetworkStatistics", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "sessionNetworkStatistics");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "sessionNetworkStatistics(com.netflix.mediaclient.storage.db.entity.ThroughputSample).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "64783612aaf2bdb45e97b2103e0b66f2", "893025be97d76f9c05cc5dcd5f4a31f3")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "playEvent", "sessionNetworkStatistics");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC5264bvV.class, C5265bvW.d());
        hashMap.put(InterfaceC5324bwc.class, C5322bwa.a());
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

    @Override // com.netflix.mediaclient.storage.db.AppHistoryDb
    public InterfaceC5264bvV c() {
        InterfaceC5264bvV interfaceC5264bvV;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new C5265bvW(this);
            }
            interfaceC5264bvV = this.d;
        }
        return interfaceC5264bvV;
    }

    @Override // com.netflix.mediaclient.storage.db.AppHistoryDb
    public InterfaceC5324bwc b() {
        InterfaceC5324bwc interfaceC5324bwc;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new C5322bwa(this);
            }
            interfaceC5324bwc = this.e;
        }
        return interfaceC5324bwc;
    }
}
