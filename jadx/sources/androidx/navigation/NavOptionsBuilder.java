package androidx.navigation;

import androidx.navigation.NavOptions;
import o.C8632dsu;
import o.C8691duz;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class NavOptionsBuilder {
    private boolean inclusive;
    private boolean launchSingleTop;
    private String popUpToRoute;
    private boolean restoreState;
    private boolean saveState;
    private final NavOptions.Builder builder = new NavOptions.Builder();
    private int popUpToId = -1;

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final void setPopUpToId$navigation_common_release(int i) {
        this.popUpToId = i;
        this.inclusive = false;
    }

    private final void setPopUpToRoute(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!(!g)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void popUpTo(int i, drM<? super PopUpToBuilder, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        setPopUpToId$navigation_common_release(i);
        setPopUpToRoute(null);
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        drm.invoke(popUpToBuilder);
        this.inclusive = popUpToBuilder.getInclusive();
        this.saveState = popUpToBuilder.getSaveState();
    }

    public final void anim(drM<? super AnimBuilder, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        AnimBuilder animBuilder = new AnimBuilder();
        drm.invoke(animBuilder);
        this.builder.setEnterAnim(animBuilder.getEnter()).setExitAnim(animBuilder.getExit()).setPopEnterAnim(animBuilder.getPopEnter()).setPopExitAnim(animBuilder.getPopExit());
    }

    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder = this.builder;
        builder.setLaunchSingleTop(this.launchSingleTop);
        builder.setRestoreState(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            builder.setPopUpTo(str, this.inclusive, this.saveState);
        } else {
            builder.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
        }
        return builder.build();
    }
}
