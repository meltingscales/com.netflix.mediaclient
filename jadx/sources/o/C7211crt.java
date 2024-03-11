package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7212cru;

/* renamed from: o.crt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7211crt {
    public final NetflixImageView b;
    public final NetflixImageView c;
    private final ConstraintLayout d;
    public final ConstraintLayout e;

    private C7211crt(ConstraintLayout constraintLayout, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, ConstraintLayout constraintLayout2) {
        this.d = constraintLayout;
        this.b = netflixImageView;
        this.c = netflixImageView2;
        this.e = constraintLayout2;
    }

    public static C7211crt b(View view) {
        int i = C7212cru.d.f;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C7212cru.d.j;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C7211crt(constraintLayout, netflixImageView, netflixImageView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
