package com.netflix.mediaclient.ui.pauseads.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7474cwr;
import o.InterfaceC7466cwj;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PauseAdsManagerImpl$prepareAd$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super InterfaceC7466cwj>, Object> {
    int a;
    final /* synthetic */ C7474cwr c;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PauseAdsManagerImpl$prepareAd$2(C7474cwr c7474cwr, InterfaceC8585dra<? super PauseAdsManagerImpl$prepareAd$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c7474cwr;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super InterfaceC7466cwj> interfaceC8585dra) {
        return ((PauseAdsManagerImpl$prepareAd$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PauseAdsManagerImpl$prepareAd$2 pauseAdsManagerImpl$prepareAd$2 = new PauseAdsManagerImpl$prepareAd$2(this.c, interfaceC8585dra);
        pauseAdsManagerImpl$prepareAd$2.e = obj;
        return pauseAdsManagerImpl$prepareAd$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r11.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            o.C8556dpz.d(r12)     // Catch: java.lang.Throwable -> L5b
            goto L54
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            java.lang.Object r1 = r11.e
            o.dwZ r1 = (o.dwZ) r1
            o.C8556dpz.d(r12)     // Catch: java.lang.Throwable -> L5b
            goto L49
        L23:
            o.C8556dpz.d(r12)
            java.lang.Object r12 = r11.e
            r5 = r12
            o.dwU r5 = (o.dwU) r5
            o.cwr r12 = r11.c
            kotlin.Result$c r1 = kotlin.Result.e     // Catch: java.lang.Throwable -> L5b
            com.netflix.mediaclient.ui.pauseads.impl.PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1 r8 = new com.netflix.mediaclient.ui.pauseads.impl.PauseAdsManagerImpl$prepareAd$2$1$prefetchDeferred$1     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r12, r2)     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            o.dwZ r1 = o.C8738dws.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5b
            r11.e = r1     // Catch: java.lang.Throwable -> L5b
            r11.a = r4     // Catch: java.lang.Throwable -> L5b
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r12 = o.C8749dxc.b(r4, r11)     // Catch: java.lang.Throwable -> L5b
            if (r12 != r0) goto L49
            return r0
        L49:
            r11.e = r2     // Catch: java.lang.Throwable -> L5b
            r11.a = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r12 = r1.b(r11)     // Catch: java.lang.Throwable -> L5b
            if (r12 != r0) goto L54
            return r0
        L54:
            o.cwi r12 = (o.C7465cwi) r12     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r12 = kotlin.Result.e(r12)     // Catch: java.lang.Throwable -> L5b
            goto L66
        L5b:
            r12 = move-exception
            kotlin.Result$c r0 = kotlin.Result.e
            java.lang.Object r12 = o.C8556dpz.a(r12)
            java.lang.Object r12 = kotlin.Result.e(r12)
        L66:
            java.lang.Throwable r0 = kotlin.Result.d(r12)
            if (r0 != 0) goto L79
            o.cwi r12 = (o.C7465cwi) r12
            if (r12 == 0) goto L76
            o.cwj$a r0 = new o.cwj$a
            r0.<init>(r12)
            goto L7b
        L76:
            o.cwj$d r0 = o.InterfaceC7466cwj.d.a
            goto L7b
        L79:
            o.cwj$b r0 = o.InterfaceC7466cwj.b.c
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.pauseads.impl.PauseAdsManagerImpl$prepareAd$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
