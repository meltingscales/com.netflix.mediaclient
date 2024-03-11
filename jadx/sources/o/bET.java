package o;

import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes4.dex */
public final class bET {
    private final ScrollView a;
    public final NetflixImageView b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final ConstraintLayout e;

    private bET(ScrollView scrollView, ConstraintLayout constraintLayout, C1204Sr c1204Sr, NetflixImageView netflixImageView, C1204Sr c1204Sr2) {
        this.a = scrollView;
        this.e = constraintLayout;
        this.c = c1204Sr;
        this.b = netflixImageView;
        this.d = c1204Sr2;
    }

    public static bET c(View view) {
        int i = com.netflix.mediaclient.ui.R.g.f13247o;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = com.netflix.mediaclient.ui.R.g.U;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = com.netflix.mediaclient.ui.R.g.cv;
                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView != null) {
                    i = com.netflix.mediaclient.ui.R.g.gr;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        return new bET((ScrollView) view, constraintLayout, c1204Sr, netflixImageView, c1204Sr2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
