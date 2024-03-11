package o;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C9795wi;

/* renamed from: o.wz  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9812wz {
    public final C1204Sr A;
    public final C1204Sr B;
    public final C1203Sq C;
    public final C1193Sg D;
    private final ConstraintLayout F;
    public final View a;
    public final NetflixImageView b;
    public final C1204Sr c;
    public final C1193Sg d;
    public final ConstraintLayout e;
    public final View f;
    public final C1204Sr g;
    public final View h;
    public final NetflixImageView i;
    public final ImageView j;
    public final View k;
    public final ProgressBar l;
    public final C1193Sg m;
    public final Space n;

    /* renamed from: o  reason: collision with root package name */
    public final C1204Sr f13908o;
    public final ViewStub p;
    public final C1193Sg q;
    public final C1204Sr r;
    public final ConstraintLayout s;
    public final ConstraintLayout t;
    public final ConstraintLayout u;
    public final SJ v;
    public final C1204Sr w;
    public final FrameLayout x;
    public final C1194Sh y;
    public final C1193Sg z;

    private C9812wz(ConstraintLayout constraintLayout, C1193Sg c1193Sg, NetflixImageView netflixImageView, ConstraintLayout constraintLayout2, C1204Sr c1204Sr, View view, View view2, NetflixImageView netflixImageView2, ImageView imageView, C1204Sr c1204Sr2, View view3, View view4, C1204Sr c1204Sr3, C1193Sg c1193Sg2, Space space, ProgressBar progressBar, C1204Sr c1204Sr4, ConstraintLayout constraintLayout3, ViewStub viewStub, ConstraintLayout constraintLayout4, C1193Sg c1193Sg3, FrameLayout frameLayout, C1204Sr c1204Sr5, C1194Sh c1194Sh, ConstraintLayout constraintLayout5, SJ sj, C1203Sq c1203Sq, C1193Sg c1193Sg4, C1204Sr c1204Sr6, C1193Sg c1193Sg5, C1204Sr c1204Sr7) {
        this.F = constraintLayout;
        this.d = c1193Sg;
        this.b = netflixImageView;
        this.e = constraintLayout2;
        this.c = c1204Sr;
        this.a = view;
        this.h = view2;
        this.i = netflixImageView2;
        this.j = imageView;
        this.g = c1204Sr2;
        this.f = view3;
        this.k = view4;
        this.f13908o = c1204Sr3;
        this.m = c1193Sg2;
        this.n = space;
        this.l = progressBar;
        this.r = c1204Sr4;
        this.t = constraintLayout3;
        this.p = viewStub;
        this.s = constraintLayout4;
        this.q = c1193Sg3;
        this.x = frameLayout;
        this.w = c1204Sr5;
        this.y = c1194Sh;
        this.u = constraintLayout5;
        this.v = sj;
        this.C = c1203Sq;
        this.D = c1193Sg4;
        this.B = c1204Sr6;
        this.z = c1193Sg5;
        this.A = c1204Sr7;
    }

    public static C9812wz b(View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        int i = C9795wi.a.b;
        C1193Sg c1193Sg = (C1193Sg) ViewBindings.findChildViewById(view, i);
        if (c1193Sg != null) {
            i = C9795wi.a.a;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                i = C9795wi.a.d;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C9795wi.a.c;
                    C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C9795wi.a.e))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = C9795wi.a.i))) != null) {
                        i = C9795wi.a.h;
                        NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                        if (netflixImageView2 != null) {
                            i = C9795wi.a.f;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C9795wi.a.j;
                                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr2 != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = C9795wi.a.g))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = C9795wi.a.m))) != null) {
                                    i = C9795wi.a.k;
                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr3 != null) {
                                        i = C9795wi.a.l;
                                        C1193Sg c1193Sg2 = (C1193Sg) ViewBindings.findChildViewById(view, i);
                                        if (c1193Sg2 != null) {
                                            i = C9795wi.a.f13904o;
                                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                                            if (space != null) {
                                                i = C9795wi.a.n;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                if (progressBar != null) {
                                                    i = C9795wi.a.q;
                                                    C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr4 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                        i = C9795wi.a.w;
                                                        ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                                                        if (viewStub != null) {
                                                            i = C9795wi.a.y;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout3 != null) {
                                                                i = C9795wi.a.v;
                                                                C1193Sg c1193Sg3 = (C1193Sg) ViewBindings.findChildViewById(view, i);
                                                                if (c1193Sg3 != null) {
                                                                    i = C9795wi.a.z;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout != null) {
                                                                        i = C9795wi.a.A;
                                                                        C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                                        if (c1204Sr5 != null) {
                                                                            i = C9795wi.a.B;
                                                                            C1194Sh c1194Sh = (C1194Sh) ViewBindings.findChildViewById(view, i);
                                                                            if (c1194Sh != null) {
                                                                                i = C9795wi.a.D;
                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout4 != null) {
                                                                                    i = C9795wi.a.C;
                                                                                    SJ sj = (SJ) ViewBindings.findChildViewById(view, i);
                                                                                    if (sj != null) {
                                                                                        i = C9795wi.a.H;
                                                                                        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                                                        if (c1203Sq != null) {
                                                                                            i = C9795wi.a.I;
                                                                                            C1193Sg c1193Sg4 = (C1193Sg) ViewBindings.findChildViewById(view, i);
                                                                                            if (c1193Sg4 != null) {
                                                                                                i = C9795wi.a.G;
                                                                                                C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                                                                if (c1204Sr6 != null) {
                                                                                                    i = C9795wi.a.E;
                                                                                                    C1193Sg c1193Sg5 = (C1193Sg) ViewBindings.findChildViewById(view, i);
                                                                                                    if (c1193Sg5 != null) {
                                                                                                        i = C9795wi.a.N;
                                                                                                        C1204Sr c1204Sr7 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                                                                        if (c1204Sr7 != null) {
                                                                                                            return new C9812wz(constraintLayout2, c1193Sg, netflixImageView, constraintLayout, c1204Sr, findChildViewById, findChildViewById2, netflixImageView2, imageView, c1204Sr2, findChildViewById3, findChildViewById4, c1204Sr3, c1193Sg2, space, progressBar, c1204Sr4, constraintLayout2, viewStub, constraintLayout3, c1193Sg3, frameLayout, c1204Sr5, c1194Sh, constraintLayout4, sj, c1203Sq, c1193Sg4, c1204Sr6, c1193Sg5, c1204Sr7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
