package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEN {
    public final C1204Sr a;
    private final ConstraintLayout b;
    public final C1193Sg c;
    public final C1203Sq e;

    private bEN(ConstraintLayout constraintLayout, C1193Sg c1193Sg, C1204Sr c1204Sr, C1203Sq c1203Sq) {
        this.b = constraintLayout;
        this.c = c1193Sg;
        this.a = c1204Sr;
        this.e = c1203Sq;
    }

    public static bEN c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.aI, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bEN a(View view) {
        int i = com.netflix.mediaclient.ui.R.g.az;
        C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
        if (c1193Sg != null) {
            i = com.netflix.mediaclient.ui.R.g.cV;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = com.netflix.mediaclient.ui.R.g.hc;
                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq != null) {
                    return new bEN((ConstraintLayout) view, c1193Sg, c1204Sr, c1203Sq);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
