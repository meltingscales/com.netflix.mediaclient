package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.cOG;

/* loaded from: classes4.dex */
public final class cOH {
    private final LinearLayout a;
    public final C9909yq c;
    public final NetflixImageView d;
    public final C1204Sr e;

    public LinearLayout e() {
        return this.a;
    }

    private cOH(LinearLayout linearLayout, C9909yq c9909yq, C1204Sr c1204Sr, NetflixImageView netflixImageView) {
        this.a = linearLayout;
        this.c = c9909yq;
        this.e = c1204Sr;
        this.d = netflixImageView;
    }

    public static cOH a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(cOG.a.a, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static cOH d(View view) {
        int i = cOG.b.a;
        C9909yq c9909yq = (C9909yq) ViewBindings.findChildViewById(view, i);
        if (c9909yq != null) {
            i = cOG.b.e;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = cOG.b.d;
                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView != null) {
                    return new cOH((LinearLayout) view, c9909yq, c1204Sr, netflixImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
