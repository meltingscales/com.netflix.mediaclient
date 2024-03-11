package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bER {
    public final C1204Sr a;
    public final C1204Sr b;
    public final bEV c;
    public final View d;
    public final C1204Sr e;
    public final ProgressBar f;
    public final C1204Sr g;
    public final C1204Sr h;
    public final LinearLayout i;
    public final C1204Sr j;
    public final C1204Sr k;
    public final C1204Sr l;
    private final ConstraintLayout n;

    private bER(ConstraintLayout constraintLayout, View view, bEV bev, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, LinearLayout linearLayout, C1204Sr c1204Sr5, C1204Sr c1204Sr6, ProgressBar progressBar, C1204Sr c1204Sr7, C1204Sr c1204Sr8) {
        this.n = constraintLayout;
        this.d = view;
        this.c = bev;
        this.e = c1204Sr;
        this.b = c1204Sr2;
        this.a = c1204Sr3;
        this.h = c1204Sr4;
        this.i = linearLayout;
        this.g = c1204Sr5;
        this.j = c1204Sr6;
        this.f = progressBar;
        this.k = c1204Sr7;
        this.l = c1204Sr8;
    }

    public static bER c(View view) {
        View findChildViewById;
        int i = com.netflix.mediaclient.ui.R.g.ab;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = com.netflix.mediaclient.ui.R.g.af))) != null) {
            bEV d = bEV.d(findChildViewById);
            i = com.netflix.mediaclient.ui.R.g.aQ;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = com.netflix.mediaclient.ui.R.g.dg;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = com.netflix.mediaclient.ui.R.g.dN;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = com.netflix.mediaclient.ui.R.g.dO;
                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr4 != null) {
                            i = com.netflix.mediaclient.ui.R.g.es;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = com.netflix.mediaclient.ui.R.g.eq;
                                C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr5 != null) {
                                    i = com.netflix.mediaclient.ui.R.g.ex;
                                    C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr6 != null) {
                                        i = com.netflix.mediaclient.ui.R.g.eP;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                        if (progressBar != null) {
                                            i = com.netflix.mediaclient.ui.R.g.gr;
                                            C1204Sr c1204Sr7 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                            if (c1204Sr7 != null) {
                                                i = com.netflix.mediaclient.ui.R.g.gu;
                                                C1204Sr c1204Sr8 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr8 != null) {
                                                    return new bER((ConstraintLayout) view, findChildViewById2, d, c1204Sr, c1204Sr2, c1204Sr3, c1204Sr4, linearLayout, c1204Sr5, c1204Sr6, progressBar, c1204Sr7, c1204Sr8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
