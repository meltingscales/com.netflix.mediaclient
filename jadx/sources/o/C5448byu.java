package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5437byj;

/* renamed from: o.byu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5448byu {
    public final View a;
    public final NetflixImageView b;
    public final C5434byg c;
    private final ConstraintLayout d;
    public final ConstraintLayout e;

    private C5448byu(ConstraintLayout constraintLayout, C5434byg c5434byg, View view, ConstraintLayout constraintLayout2, NetflixImageView netflixImageView) {
        this.d = constraintLayout;
        this.c = c5434byg;
        this.a = view;
        this.e = constraintLayout2;
        this.b = netflixImageView;
    }

    public static C5448byu e(View view) {
        View findChildViewById;
        int i = C5437byj.c.c;
        C5434byg c5434byg = (C5434byg) ViewBindings.findChildViewById(view, i);
        if (c5434byg != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C5437byj.c.g))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C5437byj.c.D;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                return new C5448byu(constraintLayout, c5434byg, findChildViewById, constraintLayout, netflixImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
