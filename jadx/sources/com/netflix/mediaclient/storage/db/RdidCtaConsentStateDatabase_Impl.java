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
import o.C5325bwd;
import o.InterfaceC5323bwb;

/* loaded from: classes6.dex */
public final class RdidCtaConsentStateDatabase_Impl extends RdidCtaConsentStateDatabase {
    private volatile InterfaceC5323bwb b;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: com.netflix.mediaclient.storage.db.RdidCtaConsentStateDatabase_Impl.3
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `rdidCtaConsentState` (`consentId` TEXT NOT NULL, `displayedAt` TEXT NOT NULL, `isDenied` INTEGER NOT NULL, PRIMARY KEY(`consentId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43ec21a30a9afe3a951a68ac639f1269')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `rdidCtaConsentState`");
                List<RoomDatabase.Callback> list = RdidCtaConsentStateDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List<RoomDatabase.Callback> list = RdidCtaConsentStateDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                RdidCtaConsentStateDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                RdidCtaConsentStateDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List<RoomDatabase.Callback> list = RdidCtaConsentStateDatabase_Impl.this.mCallbacks;
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
                HashMap hashMap = new HashMap(3);
                hashMap.put("consentId", new TableInfo.Column("consentId", "TEXT", true, 1, null, 1));
                hashMap.put("displayedAt", new TableInfo.Column("displayedAt", "TEXT", true, 0, null, 1));
                hashMap.put("isDenied", new TableInfo.Column("isDenied", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("rdidCtaConsentState", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "rdidCtaConsentState");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "rdidCtaConsentState(com.netflix.mediaclient.storage.db.entity.RdidCtaConsentStateEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "43ec21a30a9afe3a951a68ac639f1269", "5f559be19a8813b00c6d338ab99fcd00")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "rdidCtaConsentState");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC5323bwb.class, C5325bwd.e());
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

    @Override // com.netflix.mediaclient.storage.db.RdidCtaConsentStateDatabase
    public InterfaceC5323bwb e() {
        InterfaceC5323bwb interfaceC5323bwb;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new C5325bwd(this);
            }
            interfaceC5323bwb = this.b;
        }
        return interfaceC5323bwb;
    }
}
