package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: o.Ht  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0922Ht extends SQLiteOpenHelper {
    public static final a d = new a(null);
    private final C0916Hn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922Ht(Context context, C0916Hn c0916Hn) {
        super(context, c0916Hn.e(), (SQLiteDatabase.CursorFactory) null, 1);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c0916Hn, "");
        this.c = c0916Hn;
    }

    /* renamed from: o.Ht$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("SqliteDiskCache");
        }
    }

    private final String d(C0916Hn c0916Hn) {
        String str = c0916Hn.b() ? "BLOB" : "TEXT";
        return "CREATE TABLE falcor_leafs (path TEXT PRIMARY KEY NOT NULL,path_hashcode INTEGER NOT NULL,type INTEGER NOT NULL,expires INTEGER,timestamp INTEGER,size INTEGER,write_time INTEGER NOT NULL,access_time INTEGER NOT NULL,value " + str + ") WITHOUT ROWID;";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C8632dsu.c((Object) sQLiteDatabase, "");
        sQLiteDatabase.enableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C8632dsu.c((Object) sQLiteDatabase, "");
        sQLiteDatabase.execSQL(d(this.c));
        sQLiteDatabase.execSQL("CREATE INDEX path_hashcode_index ON falcor_leafs(path_hashcode);");
        sQLiteDatabase.execSQL("CREATE INDEX access_time_index ON falcor_leafs(access_time);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8632dsu.c((Object) sQLiteDatabase, "");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS falcor_leafs");
        onCreate(sQLiteDatabase);
    }
}
