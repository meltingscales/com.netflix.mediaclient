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
import o.AbstractC7985dbo;
import o.C7939dav;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.dbo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7985dbo extends AbstractC3336ax<c> implements InterfaceC3829bMe {
    public InterfaceC5179btq b;
    public TrackingInfoHolder c;
    public AppView d;
    private InterfaceC3825bMa.a i;
    private boolean j;
    private int g = -1;
    private drO<? extends TrackingInfo> h = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.ContinueWatchingModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: c */
        public final TrackingInfo invoke() {
            return TrackingInfoHolder.e(AbstractC7985dbo.this.q(), null, 1, null);
        }
    };
    private LiveState f = LiveState.e;

    @Override // o.AbstractC3073as
    public int a() {
        return 0;
    }

    public void e(InterfaceC3825bMa.a aVar) {
        this.i = aVar;
    }

    public final boolean l() {
        return this.j;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.h;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.i;
    }

    public final LiveState o() {
        return this.f;
    }

    public final int r() {
        return this.g;
    }

    public final void w_(int i) {
        this.g = i;
    }

    public final InterfaceC5179btq k() {
        InterfaceC5179btq interfaceC5179btq = this.b;
        if (interfaceC5179btq != null) {
            return interfaceC5179btq;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder q() {
        TrackingInfoHolder trackingInfoHolder = this.c;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.d;
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
        c6428cdC.setId(C7939dav.d.D);
        return c6428cdC;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.a().c(k(), null, q(), this.g, this.j, this.f);
    }

    /* renamed from: o.dbo$c */
    /* loaded from: classes5.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "continueWatchingView", "getContinueWatchingView()Lcom/netflix/mediaclient/ui/lomo/CwView;", 0))};
        private final dsZ e = bIF.d(this, C7939dav.d.D, false, 2, null);

        public final CwView a() {
            return (CwView) this.e.getValue(this, b[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setTag(aLX.a.e, Boolean.TRUE);
        }

        public final boolean c() {
            return !a().c();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((c) C9726vo.d(abstractC3179au, c.class)).c();
    }
}
