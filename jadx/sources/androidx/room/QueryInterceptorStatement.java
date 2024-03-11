package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;
    private final String sqlStatement;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public QueryInterceptorStatement(SupportSQLiteStatement supportSQLiteStatement, String str, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        C8632dsu.c((Object) supportSQLiteStatement, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) queryCallback, "");
        this.delegate = supportSQLiteStatement;
        this.sqlStatement = str;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement queryInterceptorStatement) {
        C8632dsu.c((Object) queryInterceptorStatement, "");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorStatement$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeInsert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement queryInterceptorStatement) {
        C8632dsu.c((Object) queryInterceptorStatement, "");
        queryInterceptorStatement.queryCallback.onQuery(queryInterceptorStatement.sqlStatement, queryInterceptorStatement.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        saveArgsToCache(i, null);
        this.delegate.bindNull(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        saveArgsToCache(i, Long.valueOf(j));
        this.delegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, Double.valueOf(d));
        this.delegate.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        C8632dsu.c((Object) str, "");
        saveArgsToCache(i, str);
        this.delegate.bindString(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        saveArgsToCache(i, bArr);
        this.delegate.bindBlob(i, bArr);
    }

    private final void saveArgsToCache(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= this.bindArgsCache.size()) {
            int size = this.bindArgsCache.size();
            for (int i3 = 0; i3 < (i2 - size) + 1; i3++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i2, obj);
    }
}
