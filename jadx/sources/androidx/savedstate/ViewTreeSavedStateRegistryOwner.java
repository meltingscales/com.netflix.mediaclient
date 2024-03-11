package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import o.C8632dsu;
import o.C8670due;
import o.drM;
import o.dtQ;
import o.dtY;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        C8632dsu.c((Object) view, "");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }

    public static final SavedStateRegistryOwner get(View view) {
        dtQ a;
        dtQ m;
        Object s;
        C8632dsu.c((Object) view, "");
        a = dtY.a(view, new drM<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
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
        m = C8670due.m(a, new drM<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // o.drM
            public final SavedStateRegistryOwner invoke(View view2) {
                C8632dsu.c((Object) view2, "");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        });
        s = C8670due.s(m);
        return (SavedStateRegistryOwner) s;
    }
}
