package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes5.dex */
public abstract class SharedSQLiteStatement {
    private final RoomDatabase database;
    private final AtomicBoolean lock;
    private final InterfaceC8554dpx stmt$delegate;

    protected abstract String createQuery();

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) roomDatabase, "");
        this.database = roomDatabase;
        this.lock = new AtomicBoolean(false);
        b = dpB.b(new drO<SupportSQLiteStatement>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final SupportSQLiteStatement invoke() {
                SupportSQLiteStatement createNewStatement;
                createNewStatement = SharedSQLiteStatement.this.createNewStatement();
                return createNewStatement;
            }
        });
        this.stmt$delegate = b;
    }

    private final SupportSQLiteStatement getStmt() {
        return (SupportSQLiteStatement) this.stmt$delegate.getValue();
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final SupportSQLiteStatement getStmt(boolean z) {
        if (z) {
            return getStmt();
        }
        return createNewStatement();
    }

    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    public void release(SupportSQLiteStatement supportSQLiteStatement) {
        C8632dsu.c((Object) supportSQLiteStatement, "");
        if (supportSQLiteStatement == getStmt()) {
            this.lock.set(false);
        }
    }
}
