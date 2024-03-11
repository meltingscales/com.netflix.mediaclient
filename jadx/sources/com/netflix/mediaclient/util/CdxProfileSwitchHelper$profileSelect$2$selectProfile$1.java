package com.netflix.mediaclient.util;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import io.reactivex.Observable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8130dea;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC5283bvo;
import o.InterfaceC8585dra;
import o.cNW;
import o.dAU;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
final class CdxProfileSwitchHelper$profileSelect$2$selectProfile$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super cNW.b>, Object> {
    final /* synthetic */ C8130dea b;
    int c;
    final /* synthetic */ InterfaceC5283bvo d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdxProfileSwitchHelper$profileSelect$2$selectProfile$1(C8130dea c8130dea, InterfaceC5283bvo interfaceC5283bvo, InterfaceC8585dra<? super CdxProfileSwitchHelper$profileSelect$2$selectProfile$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = c8130dea;
        this.d = interfaceC5283bvo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CdxProfileSwitchHelper$profileSelect$2$selectProfile$1(this.b, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super cNW.b> interfaceC8585dra) {
        return ((CdxProfileSwitchHelper$profileSelect$2$selectProfile$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        NetflixActivity netflixActivity;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            cNW d = this.b.e.d();
            netflixActivity = this.b.a;
            Observable<cNW.b> e2 = d.e(netflixActivity, this.d, AppView.accountMenu);
            AnonymousClass1 anonymousClass1 = new drO<cNW.b>() { // from class: com.netflix.mediaclient.util.CdxProfileSwitchHelper$profileSelect$2$selectProfile$1.1
                @Override // o.drO
                /* renamed from: e */
                public final cNW.b invoke() {
                    return new cNW.b(2, null, false, 6, null);
                }
            };
            this.c = 1;
            obj = dAU.d(e2, anonymousClass1, this);
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
