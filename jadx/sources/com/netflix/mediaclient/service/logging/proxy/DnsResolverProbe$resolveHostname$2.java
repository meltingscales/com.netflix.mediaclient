package com.netflix.mediaclient.service.logging.proxy;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.aVA;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class DnsResolverProbe$resolveHostname$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVA>, Object> {
    final /* synthetic */ List<String> a;
    Object b;
    final /* synthetic */ String c;
    Object d;
    int e;
    final /* synthetic */ aVB f;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsResolverProbe$resolveHostname$2(List<String> list, aVB avb, String str, InterfaceC8585dra<? super DnsResolverProbe$resolveHostname$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = list;
        this.f = avb;
        this.c = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVA> interfaceC8585dra) {
        return ((DnsResolverProbe$resolveHostname$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DnsResolverProbe$resolveHostname$2 dnsResolverProbe$resolveHostname$2 = new DnsResolverProbe$resolveHostname$2(this.a, this.f, this.c, interfaceC8585dra);
        dnsResolverProbe$resolveHostname$2.i = obj;
        return dnsResolverProbe$resolveHostname$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d5 -> B:23:0x00d6). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.logging.proxy.DnsResolverProbe$resolveHostname$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
