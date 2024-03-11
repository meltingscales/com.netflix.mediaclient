package com.apollographql.apollo3.exception;

import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C9006hT;
import o.InterfaceC7871dIn;

/* loaded from: classes2.dex */
public final class ApolloHttpException extends ApolloException {
    private final List<C9006hT> a;
    private final InterfaceC7871dIn b;
    private final int e;

    public /* synthetic */ ApolloHttpException(int i, List list, InterfaceC7871dIn interfaceC7871dIn, String str, Throwable th, int i2, C8627dsp c8627dsp) {
        this(i, list, interfaceC7871dIn, str, (i2 & 16) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, List<C9006hT> list, InterfaceC7871dIn interfaceC7871dIn, String str, Throwable th) {
        super(str, th, null);
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        this.e = i;
        this.a = list;
        this.b = interfaceC7871dIn;
    }
}
