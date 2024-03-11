package o;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C5437byj;

/* renamed from: o.byt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5447byt {
    public final ConstraintLayout a;
    public final Space b;
    public final C9909yq c;
    public final NetflixImageView d;
    public final Space e;
    public final ConstraintLayout f;
    public final C1204Sr g;
    public final ProgressBar h;
    public final TextView i;
    public final NetflixImageView j;
    public final NetflixImageView k;
    public final C1204Sr l;
    private final View m;
    public final ViewPager2 n;

    /* renamed from: o  reason: collision with root package name */
    public final C1204Sr f13642o;

    private C5447byt(View view, ConstraintLayout constraintLayout, C9909yq c9909yq, NetflixImageView netflixImageView, Space space, Space space2, C1204Sr c1204Sr, ProgressBar progressBar, ConstraintLayout constraintLayout2, TextView textView, NetflixImageView netflixImageView2, NetflixImageView netflixImageView3, C1204Sr c1204Sr2, ViewPager2 viewPager2, C1204Sr c1204Sr3) {
        this.m = view;
        this.a = constraintLayout;
        this.c = c9909yq;
        this.d = netflixImageView;
        this.e = space;
        this.b = space2;
        this.g = c1204Sr;
        this.h = progressBar;
        this.f = constraintLayout2;
        this.i = textView;
        this.j = netflixImageView2;
        this.k = netflixImageView3;
        this.l = c1204Sr2;
        this.n = viewPager2;
        this.f13642o = c1204Sr3;
    }

    public static C5447byt e(View view) {
        int i = C5437byj.c.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C5437byj.c.i;
            C9909yq c9909yq = (C9909yq) ViewBindings.findChildViewById(view, i);
            if (c9909yq != null) {
                i = C5437byj.c.k;
                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView != null) {
                    i = C5437byj.c.r;
                    Space space = (Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C5437byj.c.q;
                        Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                        if (space2 != null) {
                            i = C5437byj.c.p;
                            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr != null) {
                                i = C5437byj.c.s;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                if (progressBar != null) {
                                    i = C5437byj.c.w;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout2 != null) {
                                        i = C5437byj.c.x;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C5437byj.c.u;
                                            NetflixImageView netflixImageView2 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                            if (netflixImageView2 != null) {
                                                i = C5437byj.c.y;
                                                NetflixImageView netflixImageView3 = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                                                if (netflixImageView3 != null) {
                                                    i = C5437byj.c.C;
                                                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr2 != null) {
                                                        i = C5437byj.c.F;
                                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                        if (viewPager2 != null) {
                                                            i = C5437byj.c.G;
                                                            C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                            if (c1204Sr3 != null) {
                                                                return new C5447byt(view, constraintLayout, c9909yq, netflixImageView, space, space2, c1204Sr, progressBar, constraintLayout2, textView, netflixImageView2, netflixImageView3, c1204Sr2, viewPager2, c1204Sr3);
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
