package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.lomo.BillboardView;
import com.netflix.model.leafs.originals.BillboardAsset;
import com.netflix.model.leafs.originals.BillboardSummary;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC3825bMa;
import o.bUY;

/* loaded from: classes4.dex */
public abstract class bUY extends AbstractC3336ax<b> implements InterfaceC3829bMe, bLP {
    public InterfaceC5180btr b;
    public AppView c;
    public TrackingInfoHolder d;
    private boolean g;
    private int h;
    private InterfaceC3825bMa.a i;
    private int l = -1;
    private LiveState f = LiveState.e;
    private drO<? extends TrackingInfo> k = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.models.BillboardModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: d */
        public final TrackingInfo invoke() {
            String boxartId;
            BillboardAsset background;
            TrackingInfoHolder p = bUY.this.p();
            BillboardSummary f = bUY.this.o().f();
            if (f == null || (background = f.getBackground()) == null || (boxartId = background.getImageKey()) == null) {
                boxartId = bUY.this.o().getBoxartId();
            }
            return TrackingInfoHolder.a(p, boxartId, null, null, 6, null);
        }
    };
    private AppView j = AppView.synopsisEvidence;

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    public void b_(InterfaceC3825bMa.a aVar) {
        this.i = aVar;
    }

    public final void e(LiveState liveState) {
        C8632dsu.c((Object) liveState, "");
        this.f = liveState;
    }

    @Override // o.bLP
    public AppView k() {
        return this.j;
    }

    public final LiveState l() {
        return this.f;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.k;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.i;
    }

    public final void p_(int i) {
        this.h = i;
    }

    public final boolean q() {
        return this.g;
    }

    public final void q_(int i) {
        this.l = i;
    }

    public final int r() {
        return this.l;
    }

    public final int t() {
        return this.h;
    }

    public final InterfaceC5180btr o() {
        InterfaceC5180btr interfaceC5180btr = this.b;
        if (interfaceC5180btr != null) {
            return interfaceC5180btr;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder p() {
        TrackingInfoHolder trackingInfoHolder = this.d;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.bLP
    public drO<TrackingInfo> i() {
        ContextualText contextualSynopsis;
        final String evidenceKey;
        BillboardSummary f = o().f();
        if (f == null || (contextualSynopsis = f.getContextualSynopsis()) == null || (evidenceKey = contextualSynopsis.evidenceKey()) == null) {
            return null;
        }
        return new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.models.BillboardModel$contextualTrackingInfoBuilder$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.a(bUY.this.p(), null, evidenceKey, null, 5, null);
            }
        };
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3073as
    public View d(ViewGroup viewGroup) {
        BillboardView billboardView;
        C8632dsu.c((Object) viewGroup, "");
        if (C8153dex.N()) {
            Context context = viewGroup.getContext();
            C8632dsu.a(context, "");
            billboardView = new C6464cdm(context, null, 0, 6, null);
        } else {
            billboardView = new BillboardView(viewGroup.getContext());
        }
        billboardView.setId(com.netflix.mediaclient.ui.R.g.R);
        return billboardView;
    }

    @Override // o.AbstractC3336ax
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.c().e(o(), null, p(), this.l, this.g, this.f);
        BillboardView c = bVar.c();
        InterfaceC6441cdP interfaceC6441cdP = c instanceof InterfaceC6441cdP ? (InterfaceC6441cdP) c : null;
        if (interfaceC6441cdP != null) {
            interfaceC6441cdP.setTopActionBarPadding(this.h);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.c().k();
        super.b((bUY) bVar);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "billboardView", "getBillboardView()Lcom/netflix/mediaclient/ui/lomo/BillboardView;", 0))};
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.R, false, 2, null);

        public final BillboardView c() {
            return (BillboardView) this.e.getValue(this, a[0]);
        }

        public final boolean a() {
            return !c().c();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((b) C9726vo.d(abstractC3179au, b.class)).a();
    }
}
