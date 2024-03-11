package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes6.dex */
public final class bEZ {
    public final ImageView a;
    public final C1204Sr b;
    public final View c;
    public final ImageView d;
    public final NetflixImageView e;
    private final View j;

    private bEZ(View view, C1204Sr c1204Sr, NetflixImageView netflixImageView, View view2, ImageView imageView, ImageView imageView2) {
        this.j = view;
        this.b = c1204Sr;
        this.e = netflixImageView;
        this.c = view2;
        this.d = imageView;
        this.a = imageView2;
    }

    public static bEZ a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.bK, viewGroup);
        return e(viewGroup);
    }

    public static bEZ e(View view) {
        View findChildViewById;
        int i = com.netflix.mediaclient.ui.R.g.U;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = com.netflix.mediaclient.ui.R.g.cv;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = com.netflix.mediaclient.ui.R.g.gD))) != null) {
                i = com.netflix.mediaclient.ui.R.g.gO;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = com.netflix.mediaclient.ui.R.g.gM;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        return new bEZ(view, c1204Sr, netflixImageView, findChildViewById, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
