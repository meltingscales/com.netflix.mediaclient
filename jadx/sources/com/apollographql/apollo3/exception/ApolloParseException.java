package com.apollographql.apollo3.exception;

import o.C8627dsp;

/* loaded from: classes2.dex */
public final class ApolloParseException extends ApolloException {
    public ApolloParseException() {
        this(null, null, 3, null);
    }

    public ApolloParseException(String str, Throwable th) {
        super(str, th, null);
    }

    public /* synthetic */ ApolloParseException(String str, Throwable th, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }
}
