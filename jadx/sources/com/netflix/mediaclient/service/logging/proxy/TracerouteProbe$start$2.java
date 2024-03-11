package com.netflix.mediaclient.service.logging.proxy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.aVE;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class TracerouteProbe$start$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVE.b>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    Object f;
    int g;
    Object h;
    Object i;
    Object j;
    Object k;
    Object l;
    int m;
    Object n;

    /* renamed from: o  reason: collision with root package name */
    Object f13200o;
    private /* synthetic */ Object p;
    final /* synthetic */ aVE r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TracerouteProbe$start$2(int i, int i2, int i3, aVE ave, String str, int i4, InterfaceC8585dra<? super TracerouteProbe$start$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = i;
        this.b = i2;
        this.e = i3;
        this.r = ave;
        this.d = str;
        this.a = i4;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVE.b> interfaceC8585dra) {
        return ((TracerouteProbe$start$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        TracerouteProbe$start$2 tracerouteProbe$start$2 = new TracerouteProbe$start$2(this.c, this.b, this.e, this.r, this.d, this.a, interfaceC8585dra);
        tracerouteProbe$start$2.p = obj;
        return tracerouteProbe$start$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0215  */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [T] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00d4 -> B:16:0x00f3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0126 -> B:22:0x0130). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.logging.proxy.TracerouteProbe$start$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
