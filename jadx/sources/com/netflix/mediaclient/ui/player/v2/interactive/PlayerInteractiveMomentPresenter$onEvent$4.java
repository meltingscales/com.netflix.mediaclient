package com.netflix.mediaclient.ui.player.v2.interactive;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.model.leafs.originals.interactive.ChoiceMapOverride;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5209buT;
import o.C5213buX;
import o.C5639cCw;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.aJY;
import o.cCE;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerInteractiveMomentPresenter$onEvent$4 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ cCE b;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInteractiveMomentPresenter$onEvent$4(cCE cce, InterfaceC8585dra<? super PlayerInteractiveMomentPresenter$onEvent$4> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = cce;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerInteractiveMomentPresenter$onEvent$4) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerInteractiveMomentPresenter$onEvent$4(this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        aJY ajy;
        PlaylistMap H;
        InteractiveMoments interactiveMoments;
        C8586drb.e();
        if (this.e == 0) {
            C8556dpz.d(obj);
            C5639cCw c5639cCw = C5639cCw.e;
            ajy = this.b.j;
            IPlaylistControl e = c5639cCw.e(ajy);
            if (e != null && (H = e.H()) != null) {
                interactiveMoments = this.b.i;
                if (interactiveMoments == null) {
                    C8632dsu.d("");
                    interactiveMoments = null;
                }
                Map<String, ChoiceMapOverride> choiceMapOverrides = interactiveMoments.choiceMapOverrides();
                if (choiceMapOverrides != null) {
                    C8632dsu.d(choiceMapOverrides);
                    for (Map.Entry<String, ChoiceMapOverride> entry : choiceMapOverrides.entrySet()) {
                        C5209buT a = H.a(entry.getKey());
                        if (a != null) {
                            C8632dsu.d(a);
                            C5213buX[] f = a.f();
                            C8632dsu.a(f, "");
                            for (C5213buX c5213buX : f) {
                                Integer num = entry.getValue().segmentWeights().get(c5213buX.d);
                                if (num != null) {
                                    c5213buX.e = num.intValue();
                                }
                            }
                            cCE.c.getLogTag();
                            a.e(f);
                        }
                    }
                }
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
