package com.netflix.mediaclient.service.logging.proxy;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1991aVv;
import o.InterfaceC8585dra;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class DnsResolverProbe$createLogblob$4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super C1991aVv>, Object> {
    Object a;
    final /* synthetic */ List<String> b;
    Object c;
    Object d;
    final /* synthetic */ List<List<String>> e;
    Object f;
    Object g;
    Object h;
    Object i;
    Object j;
    private /* synthetic */ Object k;
    int l;
    final /* synthetic */ aVB n;

    /* renamed from: o  reason: collision with root package name */
    boolean f13199o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DnsResolverProbe$createLogblob$4(aVB avb, List<? extends List<String>> list, List<String> list2, InterfaceC8585dra<? super DnsResolverProbe$createLogblob$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.n = avb;
        this.e = list;
        this.b = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DnsResolverProbe$createLogblob$4 dnsResolverProbe$createLogblob$4 = new DnsResolverProbe$createLogblob$4(this.n, this.e, this.b, interfaceC8585dra);
        dnsResolverProbe$createLogblob$4.k = obj;
        return dnsResolverProbe$createLogblob$4;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super C1991aVv> interfaceC8585dra) {
        return ((DnsResolverProbe$createLogblob$4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0211  */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.util.Collection, java.lang.Object, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0186 -> B:44:0x01c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01f9 -> B:50:0x01ff). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.logging.proxy.DnsResolverProbe$createLogblob$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
