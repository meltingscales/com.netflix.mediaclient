package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import o.dtQ;
import o.dtV;
import o.dtY;

/* loaded from: classes2.dex */
public final class ViewKt {
    public static final dtQ<ViewParent> getAncestors(View view) {
        dtQ<ViewParent> a;
        a = dtY.a(view.getParent(), ViewKt$ancestors$1.INSTANCE);
        return a;
    }

    public static final dtQ<View> getAllViews(View view) {
        dtQ<View> e;
        e = dtV.e(new ViewKt$allViews$1(view, null));
        return e;
    }
}
