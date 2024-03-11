package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        android.view.WindowMetrics currentWindowMetrics;
        Rect bounds;
        C8632dsu.c((Object) activity, "");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        C8632dsu.a(bounds, "");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        android.view.WindowMetrics maximumWindowMetrics;
        Rect bounds;
        C8632dsu.c((Object) activity, "");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        C8632dsu.a(bounds, "");
        return bounds;
    }
}
