package com.apollographql.apollo3.internal;

import java.util.concurrent.CancellationException;
import o.C8632dsu;
import o.dyQ;

/* loaded from: classes2.dex */
final class AbortFlowException extends CancellationException {
    private final dyQ<?> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortFlowException(dyQ<?> dyq) {
        super("Flow was aborted, no more elements needed");
        C8632dsu.c((Object) dyq, "");
        this.b = dyq;
    }

    public final void b(dyQ<?> dyq) {
        C8632dsu.c((Object) dyq, "");
        if (this.b != dyq) {
            throw this;
        }
    }
}
