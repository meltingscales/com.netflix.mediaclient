package com.apollographql.apollo3.exception;

import o.C8627dsp;

/* loaded from: classes2.dex */
public abstract class ApolloException extends RuntimeException {
    public /* synthetic */ ApolloException(String str, Throwable th, C8627dsp c8627dsp) {
        this(str, th);
    }

    private ApolloException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ ApolloException(String str, Throwable th, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, null);
    }
}
