package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends FunctionReferenceImpl implements drM<SupportSQLiteDatabase, Boolean> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // o.drM
    public final Boolean invoke(SupportSQLiteDatabase supportSQLiteDatabase) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        return Boolean.valueOf(supportSQLiteDatabase.inTransaction());
    }
}
