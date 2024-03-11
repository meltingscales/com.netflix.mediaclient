package o;

import android.content.Context;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoEpoxyController;
import com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.LazyThreadSafetyMode;
import o.C5105bsV;
import o.C8126deW;
import o.C8632dsu;
import o.bTF;
import o.bTK;
import o.dpR;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class bTK extends bTJ implements bRZ {
    private final InterfaceC8554dpx b;
    private final AppView e;

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public AppView bh_() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public void c(boolean z) {
    }

    public bTK() {
        InterfaceC8554dpx b;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<C5105bsV>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.HomeLolomoMvRxFragment$playbackExperience$2
            @Override // o.drO
            /* renamed from: a */
            public final C5105bsV invoke() {
                return new C5105bsV("motionBillboard", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.HomeLolomoMvRxFragment$playbackExperience$2.1
                    @Override // o.drO
                    /* renamed from: b */
                    public final String invoke() {
                        String d = C8126deW.d();
                        C8632dsu.a(d, "");
                        return d;
                    }
                }, 2, null);
            }
        });
        this.b = b;
        this.e = AppView.browseTitles;
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C5105bsV J() {
        return (C5105bsV) this.b.getValue();
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public C4048bUh F() {
        return new C4048bUh(new InterfaceC8612dsa<Integer, String, String, dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.HomeLolomoMvRxFragment$buildVolatileRowHandler$1
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(Integer num, String str, String str2) {
                e(num.intValue(), str, str2);
                return dpR.c;
            }

            public final void e(int i, String str, String str2) {
                bTF.d(bTK.this.aq(), i, false, 2, null);
            }
        });
    }

    @Override // com.netflix.mediaclient.ui.home.impl.lolomo.LolomoMvRxFragment
    public LolomoEpoxyController c(bSY bsy, bLW blw, bTX btx, drX<? super LoMo, ? super Integer, dpR> drx, drO<MiniPlayerVideoGroupViewModel> dro, drM<? super LoMo, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) blw, "");
        C8632dsu.c((Object) btx, "");
        C8632dsu.c((Object) drx, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        LolomoMvRxFragment.d Z = Z();
        Context requireContext = requireContext();
        C8632dsu.a(requireContext, "");
        return new LolomoEpoxyController(Z, requireContext, af_(), bsy, blw, btx, drx, drm, dro, aq().i());
    }
}
