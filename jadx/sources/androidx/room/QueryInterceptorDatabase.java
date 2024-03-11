package androidx.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.List;
import java.util.concurrent.Executor;
import o.C8566dqi;
import o.C8569dql;
import o.C8571dqn;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.delegate.setVersion(i);
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase supportSQLiteDatabase, Executor executor, RoomDatabase.QueryCallback queryCallback) {
        C8632dsu.c((Object) supportSQLiteDatabase, "");
        C8632dsu.c((Object) executor, "");
        C8632dsu.c((Object) queryCallback, "");
        this.delegate = supportSQLiteDatabase;
        this.queryCallbackExecutor = executor;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String str) {
        C8632dsu.c((Object) str, "");
        return new QueryInterceptorStatement(this.delegate.compileStatement(str), str, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase queryInterceptorDatabase) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase queryInterceptorDatabase) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(QueryInterceptorDatabase queryInterceptorDatabase) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery("END TRANSACTION", i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase queryInterceptorDatabase) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery("TRANSACTION SUCCESSFUL", i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final String str) {
        C8632dsu.c((Object) str, "");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(QueryInterceptorDatabase.this, str);
            }
        });
        return this.delegate.query(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        C8632dsu.c((Object) str, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery(str, i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery) {
        C8632dsu.c((Object) supportSQLiteQuery, "");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(QueryInterceptorDatabase.this, supportSQLiteQuery, queryInterceptorProgram);
            }
        });
        return this.delegate.query(supportSQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        C8632dsu.c((Object) supportSQLiteQuery, "");
        C8632dsu.c((Object) queryInterceptorProgram, "");
        queryInterceptorDatabase.queryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        C8632dsu.c((Object) supportSQLiteQuery, "");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(QueryInterceptorDatabase.this, supportSQLiteQuery, queryInterceptorProgram);
            }
        });
        return this.delegate.query(supportSQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram) {
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        C8632dsu.c((Object) supportSQLiteQuery, "");
        C8632dsu.c((Object) queryInterceptorProgram, "");
        queryInterceptorDatabase.queryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String str) {
        C8632dsu.c((Object) str, "");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(QueryInterceptorDatabase.this, str);
            }
        });
        this.delegate.execSQL(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(QueryInterceptorDatabase queryInterceptorDatabase, String str) {
        List<? extends Object> i;
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        C8632dsu.c((Object) str, "");
        RoomDatabase.QueryCallback queryCallback = queryInterceptorDatabase.queryCallback;
        i = C8569dql.i();
        queryCallback.onQuery(str, i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final String str, Object[] objArr) {
        List a;
        final List o2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) objArr, "");
        a = C8566dqi.a();
        C8571dqn.e(a, objArr);
        o2 = C8566dqi.o(a);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.QueryInterceptorDatabase$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$12(QueryInterceptorDatabase.this, str, o2);
            }
        });
        this.delegate.execSQL(str, o2.toArray(new Object[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$12(QueryInterceptorDatabase queryInterceptorDatabase, String str, List list) {
        C8632dsu.c((Object) queryInterceptorDatabase, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        queryInterceptorDatabase.queryCallback.onQuery(str, list);
    }
}
