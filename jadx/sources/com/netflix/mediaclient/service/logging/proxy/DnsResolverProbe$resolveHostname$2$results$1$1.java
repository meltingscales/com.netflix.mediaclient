package com.netflix.mediaclient.service.logging.proxy;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aVA;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;
import org.xbill.DNS.ExtendedResolver;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DnsResolverProbe$resolveHostname$2$results$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVA>, Object> {
    final /* synthetic */ aVB a;
    final /* synthetic */ int b;
    final /* synthetic */ ExtendedResolver c;
    int d;
    final /* synthetic */ String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsResolverProbe$resolveHostname$2$results$1$1(aVB avb, ExtendedResolver extendedResolver, String str, int i, InterfaceC8585dra<? super DnsResolverProbe$resolveHostname$2$results$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = avb;
        this.c = extendedResolver;
        this.e = str;
        this.b = i;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVA> interfaceC8585dra) {
        return ((DnsResolverProbe$resolveHostname$2$results$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DnsResolverProbe$resolveHostname$2$results$1$1(this.a, this.c, this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        aVA b;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            b = this.a.b(this.c, this.e, this.b);
            return b;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
