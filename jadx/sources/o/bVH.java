package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.TrackingInfo;

/* loaded from: classes4.dex */
public abstract class bVH extends bUY {
    @Override // o.bUY, o.bLP
    public drO<TrackingInfo> i() {
        return null;
    }

    @Override // o.bUY, o.AbstractC3073as
    public View d(ViewGroup viewGroup) {
        C6467cdp c6467cdp;
        C8632dsu.c((Object) viewGroup, "");
        if (C8171dfO.e()) {
            Context context = viewGroup.getContext();
            C8632dsu.a(context, "");
            c6467cdp = new C6470cds(context, 0, null, 0, 12, null);
        } else if (C8153dex.f()) {
            Context context2 = viewGroup.getContext();
            C8632dsu.a(context2, "");
            c6467cdp = new C6465cdn(context2, null, 0, 6, null);
        } else {
            c6467cdp = new C6467cdp(viewGroup.getContext(), 0);
        }
        c6467cdp.setId(com.netflix.mediaclient.ui.R.g.R);
        return c6467cdp;
    }
}
