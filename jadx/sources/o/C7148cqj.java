package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7142cqd;

/* renamed from: o.cqj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7148cqj {
    public final RelativeLayout a;
    public final C7161cqw b;
    public final NetflixImageView c;
    public final ImageView d;
    public final C1204Sr e;
    private final CardView g;

    public CardView d() {
        return this.g;
    }

    private C7148cqj(CardView cardView, RelativeLayout relativeLayout, NetflixImageView netflixImageView, ImageView imageView, C1204Sr c1204Sr, C7161cqw c7161cqw) {
        this.g = cardView;
        this.a = relativeLayout;
        this.c = netflixImageView;
        this.d = imageView;
        this.e = c1204Sr;
        this.b = c7161cqw;
    }

    public static C7148cqj d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.f, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static C7148cqj a(View view) {
        int i = C7142cqd.b.g;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C7142cqd.b.h;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C7142cqd.b.m;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C7142cqd.b.f13764o;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null) {
                        i = C7142cqd.b.q;
                        C7161cqw c7161cqw = (C7161cqw) ViewBindings.findChildViewById(view, i);
                        if (c7161cqw != null) {
                            return new C7148cqj((CardView) view, relativeLayout, netflixImageView, imageView, c1204Sr, c7161cqw);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
