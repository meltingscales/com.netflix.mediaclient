package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;

/* renamed from: o.Rw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1183Rw extends View$OnClickListenerC1217Te {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183Rw(NetflixActivity netflixActivity, bDG bdg) {
        super(netflixActivity, bdg);
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) bdg, "");
    }

    @Override // o.View$OnClickListenerC1217Te
    protected void a(NetflixActivity netflixActivity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        InterfaceC3643bFl.c.a(netflixActivity).d(netflixActivity, interfaceC5223buh, trackingInfoHolder, "GameDetailsClickListener");
    }
}
