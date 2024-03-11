package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOR {
    public final C1204Sr a;
    public final ConstraintLayout b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final C1204Sr e;
    private final NestedScrollView g;
    public final C1204Sr h;

    public NestedScrollView c() {
        return this.g;
    }

    private bOR(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, C1204Sr c1204Sr5) {
        this.g = nestedScrollView;
        this.b = constraintLayout;
        this.a = c1204Sr;
        this.e = c1204Sr2;
        this.d = c1204Sr3;
        this.c = c1204Sr4;
        this.h = c1204Sr5;
    }

    public static bOR e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3895bOq.c.X, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static bOR c(View view) {
        int i = C3895bOq.b.G;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C3895bOq.b.ah;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C3895bOq.b.ad;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C3895bOq.b.ae;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = C3895bOq.b.af;
                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr4 != null) {
                            i = C3895bOq.b.am;
                            C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr5 != null) {
                                return new bOR((NestedScrollView) view, constraintLayout, c1204Sr, c1204Sr2, c1204Sr3, c1204Sr4, c1204Sr5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
