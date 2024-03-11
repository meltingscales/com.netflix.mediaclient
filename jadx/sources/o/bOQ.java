package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOQ {
    public final C1204Sr a;
    public final C1204Sr b;
    public final C1204Sr c;
    public final ConstraintLayout d;
    public final C1204Sr e;
    private final NestedScrollView g;
    public final View h;

    public NestedScrollView e() {
        return this.g;
    }

    private bOQ(NestedScrollView nestedScrollView, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, ConstraintLayout constraintLayout, C1204Sr c1204Sr4, View view) {
        this.g = nestedScrollView;
        this.b = c1204Sr;
        this.c = c1204Sr2;
        this.e = c1204Sr3;
        this.d = constraintLayout;
        this.a = c1204Sr4;
        this.h = view;
    }

    public static bOQ e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3895bOq.c.T, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static bOQ c(View view) {
        View findChildViewById;
        int i = C3895bOq.b.m;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C3895bOq.b.f13524o;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = C3895bOq.b.n;
                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr3 != null) {
                    i = C3895bOq.b.E;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C3895bOq.b.N;
                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C3895bOq.b.L))) != null) {
                            return new bOQ((NestedScrollView) view, c1204Sr, c1204Sr2, c1204Sr3, constraintLayout, c1204Sr4, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
