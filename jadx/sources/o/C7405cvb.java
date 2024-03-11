package o;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7373cuw;

/* renamed from: o.cvb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7405cvb {
    public final C1204Sr a;
    public final NetflixImageView b;
    public final C1204Sr c;
    public final NetflixImageView d;
    private final View e;

    private C7405cvb(View view, NetflixImageView netflixImageView, NetflixImageView netflixImageView2, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.e = view;
        this.d = netflixImageView;
        this.b = netflixImageView2;
        this.c = c1204Sr;
        this.a = c1204Sr2;
    }

    public static C7405cvb b(View view) {
        int i = C7373cuw.c.k;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C7373cuw.c.n;
            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView2 != null) {
                i = C7373cuw.c.m;
                C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr != null) {
                    i = C7373cuw.c.p;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        return new C7405cvb(view, netflixImageView, netflixImageView2, c1204Sr, c1204Sr2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
