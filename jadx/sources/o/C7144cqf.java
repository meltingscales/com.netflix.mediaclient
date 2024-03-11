package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7142cqd;

/* renamed from: o.cqf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7144cqf {
    public final NetflixImageView a;
    public final NetflixImageView b;
    public final ProgressBar c;
    public final NetflixImageView d;
    public final NetflixImageView e;
    public final NetflixImageView f;
    private final FrameLayout g;
    public final C1204Sr h;
    public final LinearLayout j;

    public FrameLayout d() {
        return this.g;
    }

    private C7144cqf(FrameLayout frameLayout, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, NetflixImageView netflixImageView3, ProgressBar progressBar, NetflixImageView netflixImageView4, NetflixImageView netflixImageView5, C1204Sr c1204Sr, LinearLayout linearLayout) {
        this.g = frameLayout;
        this.d = netflixImageView;
        this.e = netflixImageView2;
        this.a = netflixImageView3;
        this.c = progressBar;
        this.b = netflixImageView4;
        this.f = netflixImageView5;
        this.h = c1204Sr;
        this.j = linearLayout;
    }

    public static C7144cqf d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.m, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static C7144cqf e(View view) {
        int i = C7142cqd.b.b;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C7142cqd.b.d;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                i = C7142cqd.b.f;
                NetflixImageView netflixImageView3 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView3 != null) {
                    i = C7142cqd.b.k;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = C7142cqd.b.w;
                        NetflixImageView netflixImageView4 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                        if (netflixImageView4 != null) {
                            i = C7142cqd.b.D;
                            NetflixImageView netflixImageView5 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                            if (netflixImageView5 != null) {
                                i = C7142cqd.b.A;
                                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr != null) {
                                    i = C7142cqd.b.B;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        return new C7144cqf((FrameLayout) view, netflixImageView, netflixImageView2, netflixImageView3, progressBar, netflixImageView4, netflixImageView5, c1204Sr, linearLayout);
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
