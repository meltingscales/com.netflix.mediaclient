package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C6863clN;

/* renamed from: o.clS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6868clS {
    public final NetflixImageView a;
    private final View b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final C1204Sr e;

    private C6868clS(View view, C1204Sr c1204Sr, NetflixImageView netflixImageView, C1204Sr c1204Sr2, C1204Sr c1204Sr3) {
        this.b = view;
        this.d = c1204Sr;
        this.a = netflixImageView;
        this.c = c1204Sr2;
        this.e = c1204Sr3;
    }

    public static C6868clS d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C6863clN.a.h, viewGroup);
        return d(viewGroup);
    }

    public static C6868clS d(View view) {
        int i = C6863clN.d.b;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C6863clN.d.i;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C6863clN.d.f;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C6863clN.d.g;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        return new C6868clS(view, c1204Sr, netflixImageView, c1204Sr2, c1204Sr3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
