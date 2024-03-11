package com.apollographql.apollo3.exception;

import o.C8632dsu;

/* loaded from: classes2.dex */
public final class SubscriptionOperationException extends ApolloException {
    private final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String str, Object obj) {
        super("Operation error " + str, null, 2, null);
        C8632dsu.c((Object) str, "");
        this.a = obj;
    }
}
