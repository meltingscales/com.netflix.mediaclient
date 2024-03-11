package o;

import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.ui.home.HomeActivity;

/* renamed from: o.ccp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6414ccp {
    public static final C6414ccp b = new C6414ccp();

    private C6414ccp() {
    }

    public static final C6455cdd a(NetflixActionBar netflixActionBar, HomeActivity homeActivity) {
        C8632dsu.c((Object) netflixActionBar, "");
        C8632dsu.c((Object) homeActivity, "");
        if (ConfigFastPropertyFeatureControlConfig.Companion.t() || C8153dex.N()) {
            return new C6458cdg(netflixActionBar, homeActivity);
        }
        return new C6455cdd(netflixActionBar, homeActivity);
    }
}
