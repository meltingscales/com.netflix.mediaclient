package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import com.netflix.mediaclient.ui.lomo.CwView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC4072bVe;
import o.C4022bTi;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bVe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4072bVe extends AbstractC3336ax<d> implements InterfaceC3829bMe {
    public AppView b;
    public InterfaceC5179btq c;
    public TrackingInfoHolder d;
    private boolean g;
    private InterfaceC3825bMa.a h;
    private int f = -1;
    private drO<? extends TrackingInfo> j = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.models.ContinueWatchingModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: c */
        public final TrackingInfo invoke() {
            return TrackingInfoHolder.e(AbstractC4072bVe.this.t(), null, 1, null);
        }
    };
    private LiveState i = LiveState.e;

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    public final void b(int i) {
        this.f = i;
    }

    public final void d(LiveState liveState) {
        C8632dsu.c((Object) liveState, "");
        this.i = liveState;
    }

    public void e(InterfaceC3825bMa.a aVar) {
        this.h = aVar;
    }

    public final boolean k() {
        return this.g;
    }

    public final LiveState l() {
        return this.i;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.j;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final int q() {
        return this.f;
    }

    public final InterfaceC5179btq o() {
        InterfaceC5179btq interfaceC5179btq = this.c;
        if (interfaceC5179btq != null) {
            return interfaceC5179btq;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder t() {
        TrackingInfoHolder trackingInfoHolder = this.d;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.b;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6428cdC d(ViewGroup viewGroup) {
        C8632dsu.c((Object) viewGroup, "");
        Context context = viewGroup.getContext();
        C8632dsu.a(context, "");
        C6428cdC c6428cdC = new C6428cdC(context, null, 0, 6, null);
        c6428cdC.setId(C4022bTi.e.h);
        return c6428cdC;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.b().c(o(), null, t(), this.f, this.g, this.i);
    }

    /* renamed from: o.bVe$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(d.class, "continueWatchingView", "getContinueWatchingView()Lcom/netflix/mediaclient/ui/lomo/CwView;", 0))};
        private final dsZ c = bIF.d(this, C4022bTi.e.h, false, 2, null);

        public final CwView b() {
            return (CwView) this.c.getValue(this, b[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setTag(aLX.a.e, Boolean.TRUE);
        }

        public final boolean e() {
            return !b().c();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((d) C9726vo.d(abstractC3179au, d.class)).e();
    }
}
