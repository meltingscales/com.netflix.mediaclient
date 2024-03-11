package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOP {
    public final C1204Sr a;
    public final ConstraintLayout b;
    public final bOO c;
    private final NestedScrollView d;

    public NestedScrollView b() {
        return this.d;
    }

    private bOP(NestedScrollView nestedScrollView, C1204Sr c1204Sr, ConstraintLayout constraintLayout, bOO boo) {
        this.d = nestedScrollView;
        this.a = c1204Sr;
        this.b = constraintLayout;
        this.c = boo;
    }

    public static bOP b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3895bOq.c.V, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bOP a(View view) {
        View findChildViewById;
        int i = C3895bOq.b.u;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C3895bOq.b.A;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C3895bOq.b.U))) != null) {
                return new bOP((NestedScrollView) view, c1204Sr, constraintLayout, bOO.b(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
