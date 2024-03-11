package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bON {
    public final C1204Sr a;
    public final NetflixImageView b;
    public final C1203Sq c;
    public final NetflixImageView d;
    public final ImageButton e;
    private final ScrollView g;
    public final C1204Sr h;

    public ScrollView b() {
        return this.g;
    }

    private bON(ScrollView scrollView, NetflixImageView netflixImageView, C1204Sr c1204Sr, ImageButton imageButton, C1203Sq c1203Sq, NetflixImageView netflixImageView2, C1204Sr c1204Sr2) {
        this.g = scrollView;
        this.d = netflixImageView;
        this.a = c1204Sr;
        this.e = imageButton;
        this.c = c1203Sq;
        this.b = netflixImageView2;
        this.h = c1204Sr2;
    }

    public static bON c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3895bOq.c.W, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bON a(View view) {
        int i = C3895bOq.b.a;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C3895bOq.b.b;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C3895bOq.b.h;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    i = C3895bOq.b.g;
                    C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                    if (c1203Sq != null) {
                        i = C3895bOq.b.P;
                        NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                        if (netflixImageView2 != null) {
                            i = C3895bOq.b.al;
                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr2 != null) {
                                return new bON((ScrollView) view, netflixImageView, c1204Sr, imageButton, c1203Sq, netflixImageView2, c1204Sr2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
