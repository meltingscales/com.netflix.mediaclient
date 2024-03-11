package com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
final class InstallInterstitialFragment$onCreateView$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object b;
    final /* synthetic */ InstallInterstitialFragment d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallInterstitialFragment$onCreateView$3(InstallInterstitialFragment installInterstitialFragment, InterfaceC8585dra<? super InstallInterstitialFragment$onCreateView$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = installInterstitialFragment;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InstallInterstitialFragment$onCreateView$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        InstallInterstitialFragment$onCreateView$3 installInterstitialFragment$onCreateView$3 = new InstallInterstitialFragment$onCreateView$3(this.d, interfaceC8585dra);
        installInterstitialFragment$onCreateView$3.b = obj;
        return installInterstitialFragment$onCreateView$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r8.e
            r2 = 0
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            o.C8556dpz.d(r9)
            goto Lab
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.b
            o.C8556dpz.d(r9)
            goto L83
        L27:
            o.C8556dpz.d(r9)     // Catch: java.lang.Throwable -> L50
            goto L49
        L2b:
            o.C8556dpz.d(r9)
            java.lang.Object r9 = r8.b
            o.dwU r9 = (o.dwU) r9
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment r9 = r8.d
            kotlin.Result$c r1 = kotlin.Result.e     // Catch: java.lang.Throwable -> L50
            dagger.Lazy r9 = r9.d()     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> L50
            o.bNL r9 = (o.bNL) r9     // Catch: java.lang.Throwable -> L50
            r8.e = r6     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = r9.e(r8)     // Catch: java.lang.Throwable -> L50
            if (r9 != r0) goto L49
            return r0
        L49:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = kotlin.Result.e(r9)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r9 = move-exception
            kotlin.Result$c r1 = kotlin.Result.e
            java.lang.Object r9 = o.C8556dpz.a(r9)
            java.lang.Object r9 = kotlin.Result.e(r9)
        L5b:
            r1 = r9
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment r9 = r8.d
            java.lang.Throwable r6 = kotlin.Result.d(r1)
            if (r6 == 0) goto L83
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$d r6 = com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment.d
            o.GF r6 = o.GF.e
            android.content.Context r7 = r9.requireContext()
            o.C8632dsu.a(r7, r3)
            o.dxN r6 = r6.d(r7)
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$onCreateView$3$2$2 r7 = new com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$onCreateView$3$2$2
            r7.<init>(r9, r2)
            r8.b = r1
            r8.e = r5
            java.lang.Object r9 = o.C8738dws.c(r6, r7, r8)
            if (r9 != r0) goto L83
            return r0
        L83:
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment r9 = r8.d
            boolean r5 = kotlin.Result.h(r1)
            if (r5 == 0) goto Lab
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            o.GF r6 = o.GF.e
            android.content.Context r7 = r9.requireContext()
            o.C8632dsu.a(r7, r3)
            o.dxN r3 = r6.d(r7)
            com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$onCreateView$3$3$1 r6 = new com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$onCreateView$3$3$1
            r6.<init>(r9, r5, r2)
            r8.b = r1
            r8.e = r4
            java.lang.Object r9 = o.C8738dws.c(r3, r6, r8)
            if (r9 != r0) goto Lab
            return r0
        Lab:
            o.dpR r9 = o.dpR.c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial.InstallInterstitialFragment$onCreateView$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
