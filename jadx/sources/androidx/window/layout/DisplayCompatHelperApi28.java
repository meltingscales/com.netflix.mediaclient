package androidx.window.layout;

import android.view.DisplayCutout;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        int safeInsetLeft;
        C8632dsu.c((Object) displayCutout, "");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        int safeInsetTop;
        C8632dsu.c((Object) displayCutout, "");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        int safeInsetRight;
        C8632dsu.c((Object) displayCutout, "");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        int safeInsetBottom;
        C8632dsu.c((Object) displayCutout, "");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }
}
