package com.netflix.mediaclient.ui.games.impl.gdp.installInterstitial;

import com.netflix.android.imageloader.api.ShowImageRequest;
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
public final class InstallInterstitialFragment$onCreateView$3$3$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InstallInterstitialFragment a;
    int b;
    final /* synthetic */ String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallInterstitialFragment$onCreateView$3$3$1(InstallInterstitialFragment installInterstitialFragment, String str, InterfaceC8585dra<? super InstallInterstitialFragment$onCreateView$3$3$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = installInterstitialFragment;
        this.d = str;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((InstallInterstitialFragment$onCreateView$3$3$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new InstallInterstitialFragment$onCreateView$3$3$1(this.a, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bON bon;
        bON bon2;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            bon = this.a.c;
            bON bon3 = null;
            if (bon == null) {
                C8632dsu.d("");
                bon = null;
            }
            NetflixImageView netflixImageView = bon.b;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(0);
            ShowImageRequest d = new ShowImageRequest().a(this.d).c(ShowImageRequest.Priority.a).d();
            bon2 = this.a.c;
            if (bon2 == null) {
                C8632dsu.d("");
            } else {
                bon3 = bon2;
            }
            bon3.b.showImage(d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
