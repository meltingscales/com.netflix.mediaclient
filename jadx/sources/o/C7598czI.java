package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7639czx;

/* renamed from: o.czI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7598czI {
    public final NetflixImageView a;
    public final ConstraintLayout b;
    public final Guideline c;
    public final Guideline d;
    public final NetflixImageView e;
    private final ConstraintLayout h;

    public ConstraintLayout c() {
        return this.h;
    }

    private C7598czI(ConstraintLayout constraintLayout, Guideline guideline, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, ConstraintLayout constraintLayout2, Guideline guideline2) {
        this.h = constraintLayout;
        this.d = guideline;
        this.e = netflixImageView;
        this.a = netflixImageView2;
        this.b = constraintLayout2;
        this.c = guideline2;
    }

    public static C7598czI d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7639czx.c.q, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static C7598czI a(View view) {
        int i = C7639czx.e.f;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C7639czx.e.i;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C7639czx.e.l;
                NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C7639czx.e.M;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline2 != null) {
                        return new C7598czI(constraintLayout, guideline, netflixImageView, netflixImageView2, constraintLayout, guideline2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
