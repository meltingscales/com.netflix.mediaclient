package com.netflix.mediaclient.service.player.bladerunnerclient;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C4330bcV;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AdsConsentAndOptOut$updateAdvertisingIdInfo$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C4330bcV b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsConsentAndOptOut$updateAdvertisingIdInfo$1(C4330bcV c4330bcV, InterfaceC8585dra<? super AdsConsentAndOptOut$updateAdvertisingIdInfo$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c4330bcV;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdsConsentAndOptOut$updateAdvertisingIdInfo$1(this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdsConsentAndOptOut$updateAdvertisingIdInfo$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            C4330bcV c4330bcV = this.b;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(AbstractApplicationC1040Mh.getInstance().getApplicationContext());
                C4330bcV.d.getLogTag();
                bool = C8589dre.e(advertisingIdInfo.isLimitAdTrackingEnabled());
            } catch (Exception e) {
                this.b.a(e);
                bool = null;
            }
            c4330bcV.a = bool;
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
