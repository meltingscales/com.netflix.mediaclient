package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7142cqd;

/* renamed from: o.cqe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7143cqe {
    private final NetflixImageView c;
    public final NetflixImageView e;

    public NetflixImageView d() {
        return this.c;
    }

    private C7143cqe(NetflixImageView netflixImageView, NetflixImageView netflixImageView2) {
        this.c = netflixImageView;
        this.e = netflixImageView2;
    }

    public static C7143cqe a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.a, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static C7143cqe a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        NetflixImageView netflixImageView = (NetflixImageView) view;
        return new C7143cqe(netflixImageView, netflixImageView);
    }
}
