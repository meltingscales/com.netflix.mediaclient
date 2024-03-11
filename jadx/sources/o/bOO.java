package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOO {
    public final C1204Sr a;
    public final C1204Sr b;
    public final NetflixImageView c;
    public final LinearLayout d;
    public final NetflixImageView e;
    private final ConstraintLayout g;

    private bOO(ConstraintLayout constraintLayout, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, C1204Sr c1204Sr, LinearLayout linearLayout, C1204Sr c1204Sr2) {
        this.g = constraintLayout;
        this.e = netflixImageView;
        this.c = netflixImageView2;
        this.a = c1204Sr;
        this.d = linearLayout;
        this.b = c1204Sr2;
    }

    public static bOO b(View view) {
        int i = C3895bOq.b.c;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C3895bOq.b.v;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                i = C3895bOq.b.T;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = C3895bOq.b.X;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C3895bOq.b.V;
                        C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr2 != null) {
                            return new bOO((ConstraintLayout) view, netflixImageView, netflixImageView2, c1204Sr, linearLayout, c1204Sr2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
