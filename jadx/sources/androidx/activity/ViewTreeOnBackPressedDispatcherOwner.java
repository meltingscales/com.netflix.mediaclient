package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import o.C8632dsu;
import o.C8670due;
import o.drM;
import o.dtQ;
import o.dtY;

/* loaded from: classes.dex */
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final void set(View view, OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) onBackPressedDispatcherOwner, "");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final OnBackPressedDispatcherOwner get(View view) {
        dtQ a;
        dtQ m;
        Object s;
        C8632dsu.c((Object) view, "");
        a = dtY.a(view, new drM<View, View>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
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
        m = C8670due.m(a, new drM<View, OnBackPressedDispatcherOwner>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // o.drM
            public final OnBackPressedDispatcherOwner invoke(View view2) {
                C8632dsu.c((Object) view2, "");
                Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof OnBackPressedDispatcherOwner) {
                    return (OnBackPressedDispatcherOwner) tag;
                }
                return null;
            }
        });
        s = C8670due.s(m);
        return (OnBackPressedDispatcherOwner) s;
    }
}
