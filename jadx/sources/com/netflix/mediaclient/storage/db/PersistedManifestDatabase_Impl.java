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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C5268bvZ;
import o.InterfaceC5266bvX;

/* loaded from: classes6.dex */
public final class PersistedManifestDatabase_Impl extends PersistedManifestDatabase {
    private volatile InterfaceC5266bvX c;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(7) { // from class: com.netflix.mediaclient.storage.db.PersistedManifestDatabase_Impl.2
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `PersistedManifest` (`expires` INTEGER NOT NULL, `manifest` TEXT NOT NULL, `playableId` INTEGER NOT NULL, `netType` INTEGER NOT NULL, `netId` INTEGER NOT NULL, `isBranching` INTEGER NOT NULL, `supportsLanguageSelector` INTEGER NOT NULL, `preferredAudio` TEXT NOT NULL, `preferredSubtitle` TEXT NOT NULL, `preferredAssistive` TEXT NOT NULL, `token` TEXT NOT NULL, PRIMARY KEY(`playableId`, `netType`, `netId`, `isBranching`, `supportsLanguageSelector`, `preferredAudio`, `preferredSubtitle`, `preferredAssistive`, `token`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '95e176f9675c7e42c6e5565ea522be1a')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `PersistedManifest`");
                List<RoomDatabase.Callback> list = PersistedManifestDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List<RoomDatabase.Callback> list = PersistedManifestDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                PersistedManifestDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                PersistedManifestDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List<RoomDatabase.Callback> list = PersistedManifestDatabase_Impl.this.mCallbacks;
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
                HashMap hashMap = new HashMap(11);
                hashMap.put("expires", new TableInfo.Column("expires", "INTEGER", true, 0, null, 1));
                hashMap.put("manifest", new TableInfo.Column("manifest", "TEXT", true, 0, null, 1));
                hashMap.put("playableId", new TableInfo.Column("playableId", "INTEGER", true, 1, null, 1));
                hashMap.put("netType", new TableInfo.Column("netType", "INTEGER", true, 2, null, 1));
                hashMap.put("netId", new TableInfo.Column("netId", "INTEGER", true, 3, null, 1));
                hashMap.put("isBranching", new TableInfo.Column("isBranching", "INTEGER", true, 4, null, 1));
                hashMap.put("supportsLanguageSelector", new TableInfo.Column("supportsLanguageSelector", "INTEGER", true, 5, null, 1));
                hashMap.put("preferredAudio", new TableInfo.Column("preferredAudio", "TEXT", true, 6, null, 1));
                hashMap.put("preferredSubtitle", new TableInfo.Column("preferredSubtitle", "TEXT", true, 7, null, 1));
                hashMap.put("preferredAssistive", new TableInfo.Column("preferredAssistive", "TEXT", true, 8, null, 1));
                hashMap.put("token", new TableInfo.Column("token", "TEXT", true, 9, null, 1));
                TableInfo tableInfo = new TableInfo("PersistedManifest", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "PersistedManifest");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "PersistedManifest(com.netflix.mediaclient.storage.db.entity.PersistedManifest).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "95e176f9675c7e42c6e5565ea522be1a", "27375df75bf855f6d09b8c80596aaf03")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "PersistedManifest");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC5266bvX.class, C5268bvZ.c());
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

    @Override // com.netflix.mediaclient.storage.db.PersistedManifestDatabase
    public InterfaceC5266bvX c() {
        InterfaceC5266bvX interfaceC5266bvX;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new C5268bvZ(this);
            }
            interfaceC5266bvX = this.c;
        }
        return interfaceC5266bvX;
    }
}
