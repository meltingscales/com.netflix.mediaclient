package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes4.dex */
public final class bES {
    public final LinearLayout a;
    public final Guideline b;
    public final C1204Sr c;
    public final Guideline d;
    public final Guideline e;
    public final NetflixImageView f;
    public final Guideline g;
    public final NetflixImageView h;
    public final C1204Sr i;
    public final C1204Sr j;
    private final ConstraintLayout n;

    private bES(ConstraintLayout constraintLayout, C1204Sr c1204Sr, LinearLayout linearLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, C1204Sr c1204Sr2, C1204Sr c1204Sr3, NetflixImageView netflixImageView, NetflixImageView netflixImageView2) {
        this.n = constraintLayout;
        this.c = c1204Sr;
        this.a = linearLayout;
        this.e = guideline;
        this.b = guideline2;
        this.d = guideline3;
        this.g = guideline4;
        this.j = c1204Sr2;
        this.i = c1204Sr3;
        this.f = netflixImageView;
        this.h = netflixImageView2;
    }

    public static bES a(View view) {
        int i = com.netflix.mediaclient.ui.R.g.U;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = com.netflix.mediaclient.ui.R.g.aC;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = com.netflix.mediaclient.ui.R.g.cj;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = com.netflix.mediaclient.ui.R.g.ck;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        i = com.netflix.mediaclient.ui.R.g.cm;
                        Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline3 != null) {
                            i = com.netflix.mediaclient.ui.R.g.cl;
                            Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline4 != null) {
                                i = com.netflix.mediaclient.ui.R.g.ct;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null) {
                                    i = com.netflix.mediaclient.ui.R.g.gr;
                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr3 != null) {
                                        i = com.netflix.mediaclient.ui.R.g.gB;
                                        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                        if (netflixImageView != null) {
                                            i = com.netflix.mediaclient.ui.R.g.gA;
                                            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                            if (netflixImageView2 != null) {
                                                return new bES((ConstraintLayout) view, c1204Sr, linearLayout, guideline, guideline2, guideline3, guideline4, c1204Sr2, c1204Sr3, netflixImageView, netflixImageView2);
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
