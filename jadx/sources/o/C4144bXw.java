package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import o.InterfaceC7343cuS;

/* renamed from: o.bXw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4144bXw extends AbstractC4140bXs {
    private final InterfaceC7343cuS.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144bXw(C4141bXt c4141bXt, InterfaceC7343cuS.d dVar) {
        super(c4141bXt);
        C8632dsu.c((Object) c4141bXt, "");
        C8632dsu.c((Object) dVar, "");
        this.c = dVar;
    }

    private final boolean d(NetflixActivity netflixActivity) {
        return netflixActivity.getTutorialHelper().d(netflixActivity.getServiceManager(), netflixActivity.offlineApi.a().d(C8126deW.a(netflixActivity)) > 0);
    }

    @Override // o.AbstractC4140bXs
    public boolean a() {
        Activity e = e();
        if (e != null) {
            return d((NetflixActivity) e);
        }
        return false;
    }

    @Override // o.AbstractC4140bXs
    public boolean b() {
        Activity e = e();
        if (e != null) {
            NetflixActivity netflixActivity = (NetflixActivity) e;
            return netflixActivity.getTutorialHelper().c(this.c, e, netflixActivity.getServiceManager());
        }
        return false;
    }
}
