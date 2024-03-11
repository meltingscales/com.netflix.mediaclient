package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7639czx;

/* renamed from: o.czG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7596czG {
    public final bJB a;
    public final NetflixImageView b;
    public final LinearLayout c;
    public final NetflixImageView d;
    public final C1204Sr e;
    public final C1204Sr f;
    private final View g;
    public final LinearLayout i;

    private C7596czG(View view, C1204Sr c1204Sr, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, LinearLayout linearLayout, bJB bjb, C1204Sr c1204Sr2, LinearLayout linearLayout2) {
        this.g = view;
        this.e = c1204Sr;
        this.d = netflixImageView;
        this.b = netflixImageView2;
        this.c = linearLayout;
        this.a = bjb;
        this.f = c1204Sr2;
        this.i = linearLayout2;
    }

    public static C7596czG e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C7639czx.c.l, viewGroup);
        return c(viewGroup);
    }

    public static C7596czG c(View view) {
        int i = C7639czx.e.b;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C7639czx.e.d;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C7639czx.e.a;
                NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView2 != null) {
                    i = C7639czx.e.e;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C7639czx.e.H;
                        bJB bjb = (bJB) ViewBindings.findChildViewById(view, i);
                        if (bjb != null) {
                            i = C7639czx.e.N;
                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr2 != null) {
                                i = C7639czx.e.f13794J;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    return new C7596czG(view, c1204Sr, netflixImageView, netflixImageView2, linearLayout, bjb, c1204Sr2, linearLayout2);
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
