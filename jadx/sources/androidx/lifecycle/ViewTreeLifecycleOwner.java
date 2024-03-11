package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.runtime.R;
import o.C8632dsu;
import o.C8670due;
import o.drM;
import o.dtQ;
import o.dtY;

/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        C8632dsu.c((Object) view, "");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }

    public static final LifecycleOwner get(View view) {
        dtQ a;
        dtQ m;
        Object s;
        C8632dsu.c((Object) view, "");
        a = dtY.a(view, new drM<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // o.drM
            public final View invoke(View view2) {
                C8632dsu.c((Object) view2, "");
                ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        });
        m = C8670due.m(a, new drM<View, LifecycleOwner>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // o.drM
            public final LifecycleOwner invoke(View view2) {
                C8632dsu.c((Object) view2, "");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof LifecycleOwner) {
                    return (LifecycleOwner) tag;
                }
                return null;
            }
        });
        s = C8670due.s(m);
        return (LifecycleOwner) s;
    }
}
