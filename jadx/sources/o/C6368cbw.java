package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C6361cbp;

/* renamed from: o.cbw  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6368cbw {
    public final NetflixImageView d;
    private final View e;

    private C6368cbw(View view, NetflixImageView netflixImageView) {
        this.e = view;
        this.d = netflixImageView;
    }

    public static C6368cbw d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C6361cbp.e.b, viewGroup);
        return a(viewGroup);
    }

    public static C6368cbw a(View view) {
        int i = C6361cbp.c.c;
        NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
        if (netflixImageView != null) {
            return new C6368cbw(view, netflixImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
