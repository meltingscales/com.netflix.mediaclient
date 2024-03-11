package androidx.navigation;

import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class NavOptionsBuilderKt {
    public static final NavOptions navOptions(drM<? super NavOptionsBuilder, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        drm.invoke(navOptionsBuilder);
        return navOptionsBuilder.build$navigation_common_release();
    }
}
