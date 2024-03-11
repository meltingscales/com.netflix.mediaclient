package o;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import o.C5855cKw;

/* loaded from: classes4.dex */
public final class cKC {
    public final ConstraintLayout a;
    public final C1199Sm b;
    public final C1176Rp c;
    public final ConstraintLayout d;
    public final C1193Sg e;
    public final C1204Sr f;
    public final C1203Sq g;
    public final ProgressBar h;
    public final C1203Sq i;
    public final C1204Sr j;
    public final C1204Sr k;
    private final ConstraintLayout l;
    public final C1204Sr m;

    /* renamed from: o  reason: collision with root package name */
    public final Guideline f13670o;

    public ConstraintLayout a() {
        return this.l;
    }

    private cKC(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, C1193Sg c1193Sg, C1199Sm c1199Sm, C1176Rp c1176Rp, ProgressBar progressBar, C1203Sq c1203Sq, C1203Sq c1203Sq2, C1204Sr c1204Sr, C1204Sr c1204Sr2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, Guideline guideline) {
        this.l = constraintLayout;
        this.a = constraintLayout2;
        this.d = constraintLayout3;
        this.e = c1193Sg;
        this.b = c1199Sm;
        this.c = c1176Rp;
        this.h = progressBar;
        this.g = c1203Sq;
        this.i = c1203Sq2;
        this.f = c1204Sr;
        this.j = c1204Sr2;
        this.m = c1204Sr3;
        this.k = c1204Sr4;
        this.f13670o = guideline;
    }

    public static cKC a(View view) {
        int i = C5855cKw.d.A;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C5855cKw.d.B;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C5855cKw.d.H;
                C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
                if (c1193Sg != null) {
                    i = C5855cKw.d.G;
                    C1199Sm c1199Sm = (C1199Sm) ViewBindings.findChildViewById(view, i);
                    if (c1199Sm != null) {
                        i = C5855cKw.d.F;
                        C1176Rp c1176Rp = (C1176Rp) ViewBindings.findChildViewById(view, i);
                        if (c1176Rp != null) {
                            i = C5855cKw.d.E;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar != null) {
                                i = C5855cKw.d.L;
                                C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                if (c1203Sq != null) {
                                    i = C5855cKw.d.f13676J;
                                    C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                    if (c1203Sq2 != null) {
                                        i = C5855cKw.d.K;
                                        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                        if (c1204Sr != null) {
                                            i = C5855cKw.d.M;
                                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                            if (c1204Sr2 != null) {
                                                i = C5855cKw.d.N;
                                                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr3 != null) {
                                                    i = C5855cKw.d.R;
                                                    C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr4 != null) {
                                                        i = C5855cKw.d.P;
                                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                        if (guideline != null) {
                                                            return new cKC((ConstraintLayout) view, constraintLayout, constraintLayout2, c1193Sg, c1199Sm, c1176Rp, progressBar, c1203Sq, c1203Sq2, c1204Sr, c1204Sr2, c1204Sr3, c1204Sr4, guideline);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
