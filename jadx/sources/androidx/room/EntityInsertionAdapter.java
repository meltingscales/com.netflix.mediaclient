package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import o.C8632dsu;

/* loaded from: classes5.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        C8632dsu.c((Object) roomDatabase, "");
    }

    public final void insert(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t : iterable) {
                bind(acquire, t);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
