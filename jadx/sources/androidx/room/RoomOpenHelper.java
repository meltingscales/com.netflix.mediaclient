package androidx.room;

import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.List;
import o.C8608drx;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public static final Companion Companion = new Companion(null);
    private DatabaseConfiguration configuration;
    private final Delegate delegate;
    private final String identityHash;
    private final String legacyHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, Delegate delegate, String str, String str2) {
        super(delegate.version);
        C8632dsu.c((Object) databaseConfiguration, "");
        C8632dsu.c((Object) delegate, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.configuration = databaseConfiguration;
        this.delegate = delegate;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        super.onConfigure(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        boolean hasEmptySchema$room_runtime_release = Companion.hasEmptySchema$room_runtime_release(supportSQLiteDatabase);
        this.delegate.createAllTables(supportSQLiteDatabase);
        if (!hasEmptySchema$room_runtime_release) {
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
            }
        }
        updateIdentity(supportSQLiteDatabase);
        this.delegate.onCreate(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        List<Migration> findMigrationPath;
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration != null && (findMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(i, i2)) != null) {
            this.delegate.onPreMigrate(supportSQLiteDatabase);
            for (Migration migration : findMigrationPath) {
                migration.migrate(supportSQLiteDatabase);
            }
            ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
            if (!onValidateSchema.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.expectedFoundMsg);
            }
            this.delegate.onPostMigrate(supportSQLiteDatabase);
            updateIdentity(supportSQLiteDatabase);
            return;
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(i, i2)) {
            this.delegate.dropAllTables(supportSQLiteDatabase);
            this.delegate.createAllTables(supportSQLiteDatabase);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        onUpgrade(supportSQLiteDatabase, i, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        super.onOpen(supportSQLiteDatabase);
        checkIdentity(supportSQLiteDatabase);
        this.delegate.onOpen(supportSQLiteDatabase);
        this.configuration = null;
    }

    private final void checkIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (Companion.hasRoomMasterTable$room_runtime_release(supportSQLiteDatabase)) {
            Cursor query = supportSQLiteDatabase.query(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = query.moveToFirst() ? query.getString(0) : null;
                C8608drx.a(query, null);
                if (C8632dsu.c((Object) this.identityHash, (Object) string) || C8632dsu.c((Object) this.legacyHash, (Object) string)) {
                    return;
                }
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.identityHash + ", found: " + string);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C8608drx.a(query, th);
                    throw th2;
                }
            }
        }
        ValidationResult onValidateSchema = this.delegate.onValidateSchema(supportSQLiteDatabase);
        if (!onValidateSchema.isValid) {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.expectedFoundMsg);
        }
        this.delegate.onPostMigrate(supportSQLiteDatabase);
        updateIdentity(supportSQLiteDatabase);
    }

    private final void updateIdentity(SupportSQLiteDatabase supportSQLiteDatabase) {
        createMasterTableIfNotExists(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(this.identityHash));
    }

    private final void createMasterTableIfNotExists(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* loaded from: classes5.dex */
    public static abstract class Delegate {
        public final int version;

        public abstract void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
        }

        public Delegate(int i) {
            this.version = i;
        }

        protected void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            validateMigration(supportSQLiteDatabase);
            return new ValidationResult(true, null);
        }
    }

    /* loaded from: classes5.dex */
    public static class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean hasRoomMasterTable$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            Cursor query = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (query.moveToFirst()) {
                    if (query.getInt(0) != 0) {
                        z = true;
                    }
                }
                C8608drx.a(query, null);
                return z;
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            Cursor query = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (query.moveToFirst()) {
                    if (query.getInt(0) == 0) {
                        z = true;
                    }
                }
                C8608drx.a(query, null);
                return z;
            } finally {
            }
        }
    }
}
