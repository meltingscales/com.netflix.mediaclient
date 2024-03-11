package com.netflix.mediaclient.ui.interstitials.impl;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.FM;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class InterstitialsImpl$createInterstitialCommonParameters$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super FM>, Object> {
    final /* synthetic */ boolean a;
    Object b;
    final /* synthetic */ InterstitialsImpl c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialsImpl$createInterstitialCommonParameters$1(boolean z, InterstitialsImpl interstitialsImpl, InterfaceC8585dra<? super InterstitialsImpl$createInterstitialCommonParameters$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = z;
        this.c = interstitialsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InterstitialsImpl$createInterstitialCommonParameters$1(this.a, this.c, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super FM> interfaceC8585dra) {
        return ((InterstitialsImpl$createInterstitialCommonParameters$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:34:0x007f->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
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
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r8.b
            com.netflix.clcs.models.RdidDeviceConsent r0 = (com.netflix.clcs.models.RdidDeviceConsent) r0
            o.C8556dpz.d(r9)
            goto L6e
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            o.C8556dpz.d(r9)
            goto L39
        L23:
            o.C8556dpz.d(r9)
            boolean r9 = r8.a
            if (r9 == 0) goto L56
            com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl r9 = r8.c
            com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo r9 = com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.b(r9)
            r8.e = r4
            java.lang.Object r9 = r9.getRdidDeviceConsentState(r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState r9 = (com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState) r9
            boolean r1 = r9 instanceof com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState.Approved
            if (r1 == 0) goto L42
            com.netflix.clcs.models.RdidDeviceConsent r9 = com.netflix.clcs.models.RdidDeviceConsent.d
            goto L57
        L42:
            boolean r1 = r9 instanceof com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState.Denied
            if (r1 == 0) goto L49
            com.netflix.clcs.models.RdidDeviceConsent r9 = com.netflix.clcs.models.RdidDeviceConsent.b
            goto L57
        L49:
            boolean r9 = r9 instanceof com.netflix.mediaclient.acquisition.lib.rdid.RdidDeviceConsentState.Undetermined
            if (r9 == 0) goto L50
            com.netflix.clcs.models.RdidDeviceConsent r9 = com.netflix.clcs.models.RdidDeviceConsent.a
            goto L57
        L50:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L56:
            r9 = r3
        L57:
            boolean r1 = r8.a
            if (r1 == 0) goto La2
            com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl r1 = r8.c
            com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo r1 = com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl.b(r1)
            r8.b = r9
            r8.e = r2
            java.lang.Object r1 = r1.getRdidCtaConsentStates(r8)
            if (r1 != r0) goto L6c
            return r0
        L6c:
            r0 = r9
            r9 = r1
        L6e:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = o.C8570dqm.a(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L7f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r9.next()
            com.netflix.mediaclient.acquisition.lib.rdid.RdidCtaConsentState r2 = (com.netflix.mediaclient.acquisition.lib.rdid.RdidCtaConsentState) r2
            o.FS r5 = new o.FS
            java.lang.String r6 = r2.getConsentId()
            java.lang.String r7 = r2.getDisplayedAt()
            boolean r2 = r2.isDenied()
            r5.<init>(r6, r7, r2)
            r1.add(r5)
            goto L7f
        La0:
            r9 = r0
            goto La3
        La2:
            r1 = r3
        La3:
            o.FM r0 = new o.FM
            r0.<init>(r9, r1, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.interstitials.impl.InterstitialsImpl$createInterstitialCommonParameters$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
