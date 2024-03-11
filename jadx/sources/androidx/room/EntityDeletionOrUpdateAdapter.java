package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import o.C8632dsu;

/* loaded from: classes5.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t);

    @Override // androidx.room.SharedSQLiteStatement
    protected abstract String createQuery();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
        C8632dsu.c((Object) roomDatabase, "");
    }

    public final int handle(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        C8632dsu.c((Object) iterable, "");
        SupportSQLiteStatement acquire = acquire();
        try {
            int i = 0;
            for (T t : iterable) {
                bind(acquire, t);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
