package com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bON;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class InstallInterstitialFragment$onCreateView$3$2$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int d;
    final /* synthetic */ InstallInterstitialFragment e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallInterstitialFragment$onCreateView$3$2$2(InstallInterstitialFragment installInterstitialFragment, InterfaceC8585dra<? super InstallInterstitialFragment$onCreateView$3$2$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = installInterstitialFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InstallInterstitialFragment$onCreateView$3$2$2(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InstallInterstitialFragment$onCreateView$3$2$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bON bon;
        C8586drb.e();
        if (this.d == 0) {
            C8556dpz.d(obj);
            bon = this.e.c;
            if (bon == null) {
                C8632dsu.d("");
                bon = null;
            }
            NetflixImageView netflixImageView = bon.b;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(8);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
