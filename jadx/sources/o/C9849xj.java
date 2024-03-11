package o;

import android.app.Activity;
import android.view.View;
import o.C9834xU;

/* renamed from: o.xj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9849xj {
    public static final boolean a(Activity activity) {
        View findViewWithTag;
        C8632dsu.c((Object) activity, "");
        View findViewById = activity.findViewById(16908290);
        return (findViewById == null || (findViewWithTag = findViewById.findViewWithTag(Integer.valueOf(C9834xU.g.ai))) == null || findViewWithTag.getVisibility() != 0) ? false : true;
    }
}
