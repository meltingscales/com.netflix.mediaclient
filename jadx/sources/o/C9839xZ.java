package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C9834xU;

/* renamed from: o.xZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9839xZ {
    private final View a;
    public final C1204Sr c;
    public final NetflixImageView e;

    private C9839xZ(View view, NetflixImageView netflixImageView, C1204Sr c1204Sr) {
        this.a = view;
        this.e = netflixImageView;
        this.c = c1204Sr;
    }

    public static C9839xZ c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C9834xU.i.k, viewGroup);
        return c(viewGroup);
    }

    public static C9839xZ c(View view) {
        int i = C9834xU.g.I;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            i = C9834xU.g.ag;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                return new C9839xZ(view, netflixImageView, c1204Sr);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
