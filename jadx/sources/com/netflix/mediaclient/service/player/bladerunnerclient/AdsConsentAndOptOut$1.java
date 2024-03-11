package com.netflix.mediaclient.service.player.bladerunnerclient;

import android.content.Context;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidConsentStateRepo;
import com.netflix.mediaclient.acquisition.lib.rdid.RdidCtaConsentState;
import dagger.hilt.android.EntryPointAccessors;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractApplicationC1040Mh;
import o.C4330bcV;
import o.C8556dpz;
import o.C8572dqo;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class AdsConsentAndOptOut$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    Object b;
    int c;
    final /* synthetic */ C4330bcV d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsConsentAndOptOut$1(C4330bcV c4330bcV, InterfaceC8585dra<? super AdsConsentAndOptOut$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c4330bcV;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new AdsConsentAndOptOut$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((AdsConsentAndOptOut$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        C4330bcV c4330bcV;
        C4330bcV c4330bcV2;
        ArrayList arrayList;
        int d;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            Context applicationContext = AbstractApplicationC1040Mh.getInstance().getApplicationContext();
            C8632dsu.a(applicationContext, "");
            c4330bcV = this.d;
            RdidConsentStateRepo aQ = ((C4330bcV.c) EntryPointAccessors.fromApplication(applicationContext, C4330bcV.c.class)).aQ();
            if (aQ != null) {
                this.b = c4330bcV;
                this.c = 1;
                obj = aQ.getRdidCtaConsentStates(this);
                if (obj == e) {
                    return e;
                }
                c4330bcV2 = c4330bcV;
            }
            c4330bcV2 = c4330bcV;
            arrayList = null;
            c4330bcV2.e = arrayList;
            return dpR.c;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            c4330bcV2 = (C4330bcV) this.b;
            C8556dpz.d(obj);
        }
        List<RdidCtaConsentState> list = (List) obj;
        if (list == null) {
            c4330bcV = c4330bcV2;
            c4330bcV2 = c4330bcV;
            arrayList = null;
            c4330bcV2.e = arrayList;
            return dpR.c;
        }
        d = C8572dqo.d(list, 10);
        arrayList = new ArrayList(d);
        for (RdidCtaConsentState rdidCtaConsentState : list) {
            arrayList.add(new C4330bcV.d(rdidCtaConsentState.getConsentId(), rdidCtaConsentState.getDisplayedAt(), rdidCtaConsentState.isDenied()));
        }
        c4330bcV2.e = arrayList;
        return dpR.c;
    }
}
