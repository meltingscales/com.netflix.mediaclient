package com.netflix.clcs.ui;

import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.FE;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class InterstitialCoordinator$handleEffect$13 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ InterstitialCoordinator b;
    final /* synthetic */ FE c;
    final /* synthetic */ Map<String, Object> d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialCoordinator$handleEffect$13(InterstitialCoordinator interstitialCoordinator, String str, FE fe, Map<String, Object> map, InterfaceC8585dra<? super InterstitialCoordinator$handleEffect$13> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interstitialCoordinator;
        this.a = str;
        this.c = fe;
        this.d = map;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InterstitialCoordinator$handleEffect$13) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialCoordinator$handleEffect$13(this.b, this.a, this.c, this.d, interfaceC8585dra);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:5:0x000b, B:15:0x0037, B:17:0x003b, B:19:0x004d, B:21:0x006f, B:23:0x0074, B:22:0x0072, B:24:0x0078, B:26:0x007c, B:10:0x001a, B:12:0x0022), top: B:32:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:5:0x000b, B:15:0x0037, B:17:0x003b, B:19:0x004d, B:21:0x006f, B:23:0x0074, B:22:0x0072, B:24:0x0078, B:26:0x007c, B:10:0x001a, B:12:0x0022), top: B:32:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r5.e
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.C8556dpz.d(r6)     // Catch: java.lang.Exception -> L88
            goto L37
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            o.C8556dpz.d(r6)
            com.netflix.clcs.ui.InterstitialCoordinator r6 = r5.b     // Catch: java.lang.Exception -> L88
            com.netflix.clcs.client.InterstitialClient r6 = com.netflix.clcs.ui.InterstitialCoordinator.c(r6)     // Catch: java.lang.Exception -> L88
            if (r6 == 0) goto L3a
            java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L88
            o.FE r3 = r5.c     // Catch: java.lang.Exception -> L88
            o.FE$j r3 = (o.FE.j) r3     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = r3.b()     // Catch: java.lang.Exception -> L88
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.d     // Catch: java.lang.Exception -> L88
            r5.e = r2     // Catch: java.lang.Exception -> L88
            java.lang.Object r6 = r6.d(r1, r3, r4, r5)     // Catch: java.lang.Exception -> L88
            if (r6 != r0) goto L37
            return r0
        L37:
            com.netflix.clcs.client.InterstitialClient$e r6 = (com.netflix.clcs.client.InterstitialClient.e) r6     // Catch: java.lang.Exception -> L88
            goto L3b
        L3a:
            r6 = 0
        L3b:
            com.netflix.clcs.ui.InterstitialCoordinator r0 = r5.b     // Catch: java.lang.Exception -> L88
            o.dzl r0 = com.netflix.clcs.ui.InterstitialCoordinator.e(r0)     // Catch: java.lang.Exception -> L88
            r1 = 0
            java.lang.Boolean r1 = o.C8589dre.e(r1)     // Catch: java.lang.Exception -> L88
            r0.d(r1)     // Catch: java.lang.Exception -> L88
            boolean r0 = r6 instanceof com.netflix.clcs.client.InterstitialClient.e.a     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L78
            com.netflix.clcs.ui.InterstitialCoordinator r0 = r5.b     // Catch: java.lang.Exception -> L88
            com.netflix.clcs.models.InterstitialLoggingHandler r0 = r0.c()     // Catch: java.lang.Exception -> L88
            o.FE r1 = r5.c     // Catch: java.lang.Exception -> L88
            o.FE$j r1 = (o.FE.j) r1     // Catch: java.lang.Exception -> L88
            java.lang.String r1 = r1.d()     // Catch: java.lang.Exception -> L88
            r0.d(r1)     // Catch: java.lang.Exception -> L88
            com.netflix.clcs.ui.InterstitialCoordinator r0 = r5.b     // Catch: java.lang.Exception -> L88
            r1 = r6
            com.netflix.clcs.client.InterstitialClient$e$a r1 = (com.netflix.clcs.client.InterstitialClient.e.a) r1     // Catch: java.lang.Exception -> L88
            o.FX r1 = r1.b()     // Catch: java.lang.Exception -> L88
            com.netflix.clcs.client.InterstitialClient$e$a r6 = (com.netflix.clcs.client.InterstitialClient.e.a) r6     // Catch: java.lang.Exception -> L88
            boolean r6 = r6.e()     // Catch: java.lang.Exception -> L88
            if (r6 == 0) goto L72
            com.netflix.clcs.ui.InterstitialCoordinator$Navigation r6 = com.netflix.clcs.ui.InterstitialCoordinator.Navigation.a     // Catch: java.lang.Exception -> L88
            goto L74
        L72:
            com.netflix.clcs.ui.InterstitialCoordinator$Navigation r6 = com.netflix.clcs.ui.InterstitialCoordinator.Navigation.c     // Catch: java.lang.Exception -> L88
        L74:
            com.netflix.clcs.ui.InterstitialCoordinator.e(r0, r1, r6)     // Catch: java.lang.Exception -> L88
            goto L99
        L78:
            boolean r0 = r6 instanceof com.netflix.clcs.client.InterstitialClient.e.b     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto L99
            com.netflix.clcs.ui.InterstitialCoordinator r0 = r5.b     // Catch: java.lang.Exception -> L88
            com.netflix.clcs.client.InterstitialClient$e$b r6 = (com.netflix.clcs.client.InterstitialClient.e.b) r6     // Catch: java.lang.Exception -> L88
            o.FE r6 = r6.d()     // Catch: java.lang.Exception -> L88
            r0.e(r6)     // Catch: java.lang.Exception -> L88
            goto L99
        L88:
            r6 = move-exception
            r6.printStackTrace()
            com.netflix.clcs.ui.InterstitialCoordinator r6 = r5.b
            o.FE r0 = r5.c
            o.FE$j r0 = (o.FE.j) r0
            o.FE$a r0 = r0.e()
            com.netflix.clcs.ui.InterstitialCoordinator.a(r6, r0)
        L99:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.ui.InterstitialCoordinator$handleEffect$13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
