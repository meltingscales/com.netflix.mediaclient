package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* loaded from: classes2.dex */
public final /* synthetic */ class SQLiteEventStore$$Lambda$18 implements SQLiteEventStore.Function {
    private static final SQLiteEventStore$$Lambda$18 instance = new SQLiteEventStore$$Lambda$18();

    private SQLiteEventStore$$Lambda$18() {
    }

    public static SQLiteEventStore.Function lambdaFactory$() {
        return instance;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$ensureBeginTransaction$15((Throwable) obj);
    }
}
