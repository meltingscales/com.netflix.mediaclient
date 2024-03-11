package com.netflix.mediaclient.service.logging.proxy;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.aVA;
import o.aVB;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
final class DnsResolverProbe$createLogblob$4$tests$1$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super aVA>, Object> {
    final /* synthetic */ aVB b;
    final /* synthetic */ List<String> c;
    int d;
    final /* synthetic */ String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DnsResolverProbe$createLogblob$4$tests$1$1$1(aVB avb, List<String> list, String str, InterfaceC8585dra<? super DnsResolverProbe$createLogblob$4$tests$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = avb;
        this.c = list;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new DnsResolverProbe$createLogblob$4$tests$1$1$1(this.b, this.c, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super aVA> interfaceC8585dra) {
        return ((DnsResolverProbe$createLogblob$4$tests$1$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            aVB avb = this.b;
            List<String> list = this.c;
            String str = this.e;
            this.d = 1;
            obj = avb.d(list, str, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
