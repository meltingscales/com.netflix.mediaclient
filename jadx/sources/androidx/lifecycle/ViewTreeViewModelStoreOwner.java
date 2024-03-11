package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.viewmodel.R;
import o.C8632dsu;
import o.C8670due;
import o.drM;
import o.dtQ;
import o.dtY;

/* loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        C8632dsu.c((Object) view, "");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }

    public static final ViewModelStoreOwner get(View view) {
        dtQ a;
        dtQ m;
        Object s;
        C8632dsu.c((Object) view, "");
        a = dtY.a(view, new drM<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
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
        m = C8670due.m(a, new drM<View, ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // o.drM
            public final ViewModelStoreOwner invoke(View view2) {
                C8632dsu.c((Object) view2, "");
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof ViewModelStoreOwner) {
                    return (ViewModelStoreOwner) tag;
                }
                return null;
            }
        });
        s = C8670due.s(m);
        return (ViewModelStoreOwner) s;
    }
}
