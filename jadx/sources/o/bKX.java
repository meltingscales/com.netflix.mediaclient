package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.C3796bKz;
import o.InterfaceC3825bMa;
import o.bKX;

/* loaded from: classes4.dex */
public abstract class bKX extends AbstractC3813bLp implements bLP, InterfaceC3825bMa {
    public TrackingInfoHolder b;
    public AppView c;
    private String d;
    private InterfaceC3825bMa.a h;

    @Override // o.AbstractC3813bLp, o.AbstractC3073as
    public int a() {
        return C3796bKz.g.z;
    }

    public final void l_(String str) {
        this.d = str;
    }

    public final String m() {
        return this.d;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    @Override // o.bLP
    public AppView k() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder l() {
        TrackingInfoHolder trackingInfoHolder = this.b;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.bLP
    public drO<TrackingInfo> i() {
        return new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.SynopsisTextModel$contextualTrackingInfoBuilder$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.a(bKX.this.l(), null, bKX.this.m(), null, 5, null);
            }
        };
    }
}
