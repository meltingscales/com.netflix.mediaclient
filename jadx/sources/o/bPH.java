package o;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import org.chromium.net.NetError;

/* loaded from: classes4.dex */
public final class bPH implements InterfaceC5345bwx {
    private final FragmentHelper e;

    @Override // o.InterfaceC5345bwx
    public void b(Intent intent, Fragment fragment, Intent intent2, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public void c(Intent intent, Fragment fragment, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public boolean c(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        return true;
    }

    public bPH(FragmentHelper fragmentHelper) {
        C8632dsu.c((Object) fragmentHelper, "");
        this.e = fragmentHelper;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return g(intent);
    }

    private final boolean g(Intent intent) {
        String stringExtra;
        boolean g;
        if (C8632dsu.c((Object) VideoType.GAMES.getValue(), (Object) intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE)) && (stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID)) != null) {
            g = C8691duz.g(stringExtra);
            if (!g) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = o.C8689dux.n(r0);
     */
    @Override // o.InterfaceC5345bwx
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.netflix.mediaclient.android.fragment.NetflixFrag d(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            boolean r0 = r3.e(r4)
            if (r0 == 0) goto L41
            java.lang.String r0 = "extra_video_id"
            java.lang.String r0 = r4.getStringExtra(r0)
            if (r0 == 0) goto L41
            java.lang.Integer r0 = o.C8684dus.e(r0)
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
            java.lang.String r1 = "extra_trackinginfo_holder"
            android.os.Parcelable r1 = r4.getParcelableExtra(r1)
            com.netflix.mediaclient.clutils.TrackingInfoHolder r1 = (com.netflix.mediaclient.clutils.TrackingInfoHolder) r1
            if (r1 != 0) goto L36
            com.netflix.mediaclient.servicemgr.PlayLocationType r1 = com.netflix.mediaclient.servicemgr.PlayLocationType.GDP
            com.netflix.mediaclient.clutils.TrackingInfoHolder r2 = new com.netflix.mediaclient.clutils.TrackingInfoHolder
            r2.<init>(r1)
            com.netflix.mediaclient.util.PlayContext r4 = r3.j(r4)
            r2.d(r0, r4)
            r1 = r2
        L36:
            com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment$d r4 = com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment r4 = r4.e(r0, r1)
            goto L42
        L41:
            r4 = 0
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bPH.d(android.content.Intent):com.netflix.mediaclient.android.fragment.NetflixFrag");
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.e.e();
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.gameDetails;
    }

    @Override // o.InterfaceC5345bwx
    public TrackingInfo b(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return new C8263dhA(j(intent), i(intent));
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        NetflixFrag netflixFrag = fragment instanceof NetflixFrag ? (NetflixFrag) fragment : null;
        if (netflixFrag != null) {
            netflixFrag.bt_();
        }
    }

    private final PlayContext j(Intent intent) {
        PlayContextImp playContextImp;
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) intent.getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder == null || (playContextImp = trackingInfoHolder.d(false)) == null) {
            playContextImp = (PlayContextImp) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
        }
        return playContextImp != null ? playContextImp : new EmptyPlayContext("getPlayContext", NetError.ERR_TOO_MANY_ACCEPT_CH_RESTARTS);
    }

    private final String i(Intent intent) {
        return intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
    }
}
