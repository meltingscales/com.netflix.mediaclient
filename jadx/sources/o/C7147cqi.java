package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7142cqd;

/* renamed from: o.cqi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7147cqi {
    private final ConstraintLayout a;
    public final NetflixImageView b;
    public final NetflixImageView c;
    public final ConstraintLayout d;
    public final NetflixImageView e;

    private C7147cqi(ConstraintLayout constraintLayout, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, ConstraintLayout constraintLayout2, NetflixImageView netflixImageView3) {
        this.a = constraintLayout;
        this.b = netflixImageView;
        this.e = netflixImageView2;
        this.d = constraintLayout2;
        this.c = netflixImageView3;
    }

    public static C7147cqi d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.g, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static C7147cqi b(View view) {
        int i = C7142cqd.b.a;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C7142cqd.b.n;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C7142cqd.b.F;
                NetflixImageView netflixImageView3 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView3 != null) {
                    return new C7147cqi(constraintLayout, netflixImageView, netflixImageView2, constraintLayout, netflixImageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
