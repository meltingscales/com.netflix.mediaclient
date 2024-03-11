package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEQ {
    public final C1204Sr a;
    public final RecyclerView b;
    public final C1203Sq c;
    public final C1203Sq d;
    public final Guideline e;
    public final Guideline f;
    public final RecyclerView g;
    public final ConstraintLayout h;
    public final C1204Sr i;
    private final ConstraintLayout j;

    private bEQ(ConstraintLayout constraintLayout, C1203Sq c1203Sq, C1204Sr c1204Sr, RecyclerView recyclerView, C1203Sq c1203Sq2, Guideline guideline, Guideline guideline2, ConstraintLayout constraintLayout2, C1204Sr c1204Sr2, RecyclerView recyclerView2) {
        this.j = constraintLayout;
        this.c = c1203Sq;
        this.a = c1204Sr;
        this.b = recyclerView;
        this.d = c1203Sq2;
        this.e = guideline;
        this.f = guideline2;
        this.h = constraintLayout2;
        this.i = c1204Sr2;
        this.g = recyclerView2;
    }

    public static bEQ e(View view) {
        int i = com.netflix.mediaclient.ui.R.g.s;
        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
        if (c1203Sq != null) {
            i = com.netflix.mediaclient.ui.R.g.r;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = com.netflix.mediaclient.ui.R.g.p;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = com.netflix.mediaclient.ui.R.g.az;
                    C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                    if (c1203Sq2 != null) {
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, com.netflix.mediaclient.ui.R.g.cn);
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, com.netflix.mediaclient.ui.R.g.cq);
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = com.netflix.mediaclient.ui.R.g.gk;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            i = com.netflix.mediaclient.ui.R.g.gh;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                return new bEQ(constraintLayout, c1203Sq, c1204Sr, recyclerView, c1203Sq2, guideline, guideline2, constraintLayout, c1204Sr2, recyclerView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
