package com.apollographql.apollo3.exception;

import o.C8627dsp;

/* loaded from: classes2.dex */
public final class ApolloWebSocketClosedException extends ApolloException {
    private final int b;
    private final String c;

    public /* synthetic */ ApolloWebSocketClosedException(int i, String str, Throwable th, int i2, C8627dsp c8627dsp) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : th);
    }

    public ApolloWebSocketClosedException(int i, String str, Throwable th) {
        super("WebSocket Closed code='" + i + "' reason='" + str + '\'', th, null);
        this.b = i;
        this.c = str;
    }
}
