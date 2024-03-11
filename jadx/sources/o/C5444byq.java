package o;

import android.view.View;
import android.view.ViewStub;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5437byj;

/* renamed from: o.byq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5444byq {
    public final ViewStub a;
    public final C5410byI b;
    public final C1204Sr c;
    public final Space d;
    public final ViewStub e;
    public final Space f;
    public final Space g;
    public final Space h;
    public final NetflixImageView i;
    public final ConstraintLayout j;
    public final C1204Sr l;
    private final View m;

    private C5444byq(View view, C5410byI c5410byI, ViewStub viewStub, ViewStub viewStub2, Space space, C1204Sr c1204Sr, NetflixImageView netflixImageView, Space space2, Space space3, Space space4, ConstraintLayout constraintLayout, C1204Sr c1204Sr2) {
        this.m = view;
        this.b = c5410byI;
        this.e = viewStub;
        this.a = viewStub2;
        this.d = space;
        this.c = c1204Sr;
        this.i = netflixImageView;
        this.g = space2;
        this.h = space3;
        this.f = space4;
        this.j = constraintLayout;
        this.l = c1204Sr2;
    }

    public static C5444byq a(View view) {
        int i = C5437byj.c.a;
        C5410byI c5410byI = (C5410byI) ViewBindings.findChildViewById(view, i);
        if (c5410byI != null) {
            i = C5437byj.c.h;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                i = C5437byj.c.j;
                ViewStub viewStub2 = (ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub2 != null) {
                    i = C5437byj.c.f;
                    Space space = (Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C5437byj.c.n;
                        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr != null) {
                            i = C5437byj.c.l;
                            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                            if (netflixImageView != null) {
                                i = C5437byj.c.f13641o;
                                Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space2 != null) {
                                    i = C5437byj.c.t;
                                    Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                                    if (space3 != null) {
                                        i = C5437byj.c.v;
                                        Space space4 = (Space) ViewBindings.findChildViewById(view, i);
                                        if (space4 != null) {
                                            i = C5437byj.c.z;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout != null) {
                                                i = C5437byj.c.B;
                                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr2 != null) {
                                                    return new C5444byq(view, c5410byI, viewStub, viewStub2, space, c1204Sr, netflixImageView, space2, space3, space4, constraintLayout, c1204Sr2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
