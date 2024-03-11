package com.apollographql.apollo3.exception;

import o.C8627dsp;

/* loaded from: classes2.dex */
public final class ApolloNetworkException extends ApolloException {
    private final Object c;

    public ApolloNetworkException() {
        this(null, null, 3, null);
    }

    public /* synthetic */ ApolloNetworkException(String str, Object obj, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj);
    }

    public ApolloNetworkException(String str, Object obj) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null, null);
        this.c = obj;
    }
}
