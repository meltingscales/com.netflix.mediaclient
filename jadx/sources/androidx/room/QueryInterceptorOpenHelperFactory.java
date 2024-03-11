package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final SupportSQLiteOpenHelper.Factory delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelperFactory(SupportSQLiteOpenHelper.Factory factory, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) queryCallback, "");
        this.delegate = factory;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        C8632dsu.c((Object) configuration, "");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackExecutor, this.queryCallback);
    }
}
