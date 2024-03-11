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
import o.C5330bwi;
import o.InterfaceC5326bwe;

/* loaded from: classes6.dex */
public final class UserMarksDatabase_Impl extends UserMarksDatabase {
    private volatile InterfaceC5326bwe a;

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: com.netflix.mediaclient.storage.db.UserMarksDatabase_Impl.5
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `userMarkStore` (`markId` TEXT NOT NULL, `profileId` TEXT NOT NULL, `videoId` TEXT NOT NULL, `runtime` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `title` TEXT NOT NULL, `parentTitle` TEXT, `imageUrl` TEXT, `videoType` INTEGER NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`markId`, `profileId`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c80e6e8fc08b70cf3949262a9aa94ef5')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `userMarkStore`");
                List<RoomDatabase.Callback> list = UserMarksDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                List<RoomDatabase.Callback> list = UserMarksDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    for (RoomDatabase.Callback callback : list) {
                        callback.onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                UserMarksDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                UserMarksDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                List<RoomDatabase.Callback> list = UserMarksDatabase_Impl.this.mCallbacks;
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
                HashMap hashMap = new HashMap(10);
                hashMap.put("markId", new TableInfo.Column("markId", "TEXT", true, 1, null, 1));
                hashMap.put("profileId", new TableInfo.Column("profileId", "TEXT", true, 2, null, 1));
                hashMap.put(SignupConstants.Field.VIDEO_ID, new TableInfo.Column(SignupConstants.Field.VIDEO_ID, "TEXT", true, 0, null, 1));
                hashMap.put("runtime", new TableInfo.Column("runtime", "INTEGER", true, 0, null, 1));
                hashMap.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                hashMap.put(SignupConstants.Field.VIDEO_TITLE, new TableInfo.Column(SignupConstants.Field.VIDEO_TITLE, "TEXT", true, 0, null, 1));
                hashMap.put("parentTitle", new TableInfo.Column("parentTitle", "TEXT", false, 0, null, 1));
                hashMap.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
                hashMap.put("videoType", new TableInfo.Column("videoType", "INTEGER", true, 0, null, 1));
                hashMap.put("position", new TableInfo.Column("position", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("userMarkStore", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "userMarkStore");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "userMarkStore(com.netflix.mediaclient.storage.db.entity.UserMarkStoreEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "c80e6e8fc08b70cf3949262a9aa94ef5", "5cb402c513551636b84c578b86e7aa60")).build());
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "userMarkStore");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC5326bwe.class, C5330bwi.d());
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

    @Override // com.netflix.mediaclient.storage.db.UserMarksDatabase
    public InterfaceC5326bwe c() {
        InterfaceC5326bwe interfaceC5326bwe;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new C5330bwi(this);
            }
            interfaceC5326bwe = this.a;
        }
        return interfaceC5326bwe;
    }
}
