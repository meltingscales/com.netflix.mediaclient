package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C9795wi;

/* renamed from: o.wC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9741wC {
    public final C1193Sg a;
    public final C1203Sq b;
    public final C1193Sg c;
    public final C1204Sr d;
    public final ConstraintLayout e;
    private final ConstraintLayout h;
    public final C1204Sr j;

    private C9741wC(ConstraintLayout constraintLayout, C1204Sr c1204Sr, C1193Sg c1193Sg, C1203Sq c1203Sq, ConstraintLayout constraintLayout2, C1193Sg c1193Sg2, C1204Sr c1204Sr2) {
        this.h = constraintLayout;
        this.d = c1204Sr;
        this.c = c1193Sg;
        this.b = c1203Sq;
        this.e = constraintLayout2;
        this.a = c1193Sg2;
        this.j = c1204Sr2;
    }

    public static C9741wC d(View view) {
        int i = C9795wi.a.r;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C9795wi.a.t;
            C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
            if (c1193Sg != null) {
                i = C9795wi.a.s;
                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C9795wi.a.u;
                    C1193Sg c1193Sg2 = (C1193Sg) ViewBindings.findChildViewById(view, i);
                    if (c1193Sg2 != null) {
                        i = C9795wi.a.x;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            return new C9741wC(constraintLayout, c1204Sr, c1193Sg, c1203Sq, constraintLayout, c1193Sg2, c1204Sr2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
