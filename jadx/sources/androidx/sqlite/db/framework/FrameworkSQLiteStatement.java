package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    private final SQLiteStatement delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        C8632dsu.c((Object) sQLiteStatement, "");
        this.delegate = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.delegate.executeInsert();
    }
}
