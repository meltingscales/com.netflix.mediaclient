package com.airbnb.mvrx;

import kotlin.jvm.internal.AdaptedFunctionReference;
import o.C8632dsu;
import o.InterfaceC8888fH;
import o.dpR;
import o.drM;
import o.dwF;

/* JADX INFO: Add missing generic type declarations: [S] */
/* loaded from: classes2.dex */
public final /* synthetic */ class MavericksRepository$awaitState$2<S> extends AdaptedFunctionReference implements drM<S, dpR> {
    public MavericksRepository$awaitState$2(Object obj) {
        super(1, obj, dwF.class, "complete", "complete(Ljava/lang/Object;)Z", 8);
    }

    /* JADX WARN: Incorrect types in method signature: (TS;)V */
    public final void e(InterfaceC8888fH interfaceC8888fH) {
        C8632dsu.c((Object) interfaceC8888fH, "");
        ((dwF) this.receiver).a((dwF) interfaceC8888fH);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(Object obj) {
        e((InterfaceC8888fH) obj);
        return dpR.c;
    }
}
