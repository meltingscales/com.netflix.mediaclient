package com.apollographql.apollo3.exception;

import o.C8553dpw;

/* loaded from: classes2.dex */
public final class ApolloCompositeException extends ApolloException {
    public ApolloCompositeException(Throwable th, Throwable th2) {
        super("Multiple exceptions happened", th2, null);
        if (th != null) {
            C8553dpw.c(this, th);
        }
        if (th2 != null) {
            C8553dpw.c(this, th2);
        }
    }
}
