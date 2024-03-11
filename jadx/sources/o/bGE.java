package o;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* loaded from: classes4.dex */
public abstract class bGE extends AbstractC3336ax<a> {
    private boolean b;
    private int c = -1;
    private View.OnClickListener d;
    private String f;
    private InterfaceC5176btn i;
    private TrackingInfoHolder j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.n;
    }

    public final void b(String str) {
        this.f = str;
    }

    public final void b(InterfaceC5176btn interfaceC5176btn) {
        this.i = interfaceC5176btn;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final void e(TrackingInfoHolder trackingInfoHolder) {
        this.j = trackingInfoHolder;
    }

    public final int i() {
        return this.c;
    }

    public final View.OnClickListener k() {
        return this.d;
    }

    public final boolean l() {
        return this.b;
    }

    public final String m() {
        return this.f;
    }

    public final TrackingInfoHolder n() {
        return this.j;
    }

    public final InterfaceC5176btn o() {
        return this.i;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.c().setOnClickListener(this.d);
        DownloadButton c = aVar.c();
        if (c instanceof C7184crS) {
            C7184crS c7184crS = (C7184crS) c;
            c7184crS.setEpisodeNumber(this.b ? -1 : this.c);
            c7184crS.setSeasonNumberAbbreviation(this.b ? null : this.f);
        }
        Context context = aVar.c().getContext();
        C8632dsu.a(context, "");
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(context, NetflixActivity.class);
        DownloadButton c2 = aVar.c();
        InterfaceC5176btn interfaceC5176btn = this.i;
        if (interfaceC5176btn == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        c2.setStateFromPlayable(interfaceC5176btn, netflixActivity);
        DownloadButton c3 = aVar.c();
        TrackingInfoHolder trackingInfoHolder = this.j;
        c3.setPlayContext(trackingInfoHolder != null ? TrackingInfoHolder.b(trackingInfoHolder, PlayLocationType.DOWNLOADS, false, 2, null) : null);
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "button", "getButton()Lcom/netflix/mediaclient/ui/offline/DownloadButton;", 0))};
        private final dsZ c = bIF.d(this, C3670bGh.a.B, false, 2, null);

        public final DownloadButton c() {
            return (DownloadButton) this.c.getValue(this, e[0]);
        }
    }
}
