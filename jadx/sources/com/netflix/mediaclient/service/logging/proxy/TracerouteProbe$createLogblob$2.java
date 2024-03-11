package com.netflix.mediaclient.service.logging.proxy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.aVE;
import o.aVF;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class TracerouteProbe$createLogblob$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVF>, Object> {
    Object a;
    int b;
    int c;
    int d;
    int e;
    int f;
    Object g;
    Object h;
    Object i;
    final /* synthetic */ aVE j;
    private /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerouteProbe$createLogblob$2(aVE ave, InterfaceC8585dra<? super TracerouteProbe$createLogblob$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.j = ave;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        TracerouteProbe$createLogblob$2 tracerouteProbe$createLogblob$2 = new TracerouteProbe$createLogblob$2(this.j, interfaceC8585dra);
        tracerouteProbe$createLogblob$2.n = obj;
        return tracerouteProbe$createLogblob$2;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVF> interfaceC8585dra) {
        return ((TracerouteProbe$createLogblob$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163  */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0157 -> B:25:0x015a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.logging.proxy.TracerouteProbe$createLogblob$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
