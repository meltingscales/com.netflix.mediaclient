package androidx.window.layout;

import android.app.Activity;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity.isInMultiWindowMode();
    }
}
