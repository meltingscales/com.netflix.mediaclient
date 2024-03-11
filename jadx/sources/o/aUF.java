package o;

import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.NetflixDataRequest;

/* loaded from: classes3.dex */
public final class aUF {
    private UserAgent c;
    private aOV d;

    public aUF(aOV aov, UserAgent userAgent) {
        this.d = aov;
        this.c = userAgent;
    }

    public NetflixDataRequest e(String str, String str2, String str3, aUA aua) {
        return C8237dgb.d(this.c, str, new aUH(str2, str3, aua), true);
    }
}
