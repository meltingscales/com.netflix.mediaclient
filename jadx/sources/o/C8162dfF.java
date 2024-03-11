package o;

import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MdxEnabledViaFeatureConfig;
import com.netflix.mediaclient.service.user.UserAgent;

/* renamed from: o.dfF  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8162dfF {
    public static final C8162dfF e = new C8162dfF();

    private C8162dfF() {
    }

    public static final boolean d(UserAgent userAgent) {
        C8632dsu.c((Object) userAgent, "");
        return !Config_FastProperty_MdxEnabledViaFeatureConfig.Companion.b() ? !(C8151dev.h() || userAgent.r()) : !(C8151dev.h() || !C8153dex.D());
    }
}
