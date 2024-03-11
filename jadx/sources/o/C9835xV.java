package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C9834xU;

/* renamed from: o.xV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9835xV {
    public final ConstraintLayout a;
    public final C1204Sr b;
    public final Space c;
    public final ImageView d;
    public final AppCompatImageView e;
    public final Space f;
    public final C1203Sq g;
    public final Space h;
    public final Space i;
    public final Space j;
    public final C1203Sq k;
    public final AppCompatImageView l;
    public final C1203Sq m;
    public final C1203Sq n;

    /* renamed from: o  reason: collision with root package name */
    public final C1203Sq f13923o;
    private final View t;

    private C9835xV(View view, ConstraintLayout constraintLayout, C1204Sr c1204Sr, AppCompatImageView appCompatImageView, ImageView imageView, Space space, Space space2, Space space3, Space space4, Space space5, C1203Sq c1203Sq, AppCompatImageView appCompatImageView2, C1203Sq c1203Sq2, C1203Sq c1203Sq3, C1203Sq c1203Sq4, C1203Sq c1203Sq5) {
        this.t = view;
        this.a = constraintLayout;
        this.b = c1204Sr;
        this.e = appCompatImageView;
        this.d = imageView;
        this.c = space;
        this.f = space2;
        this.j = space3;
        this.h = space4;
        this.i = space5;
        this.g = c1203Sq;
        this.l = appCompatImageView2;
        this.k = c1203Sq2;
        this.n = c1203Sq3;
        this.m = c1203Sq4;
        this.f13923o = c1203Sq5;
    }

    public static C9835xV d(View view) {
        int i = C9834xU.g.h;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C9834xU.g.i;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C9834xU.g.g;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C9834xU.g.G;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C9834xU.g.O;
                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                        if (space != null) {
                            i = C9834xU.g.Q;
                            Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                            if (space2 != null) {
                                i = C9834xU.g.W;
                                Space space3 = (Space) ViewBindings.findChildViewById(view, i);
                                if (space3 != null) {
                                    i = C9834xU.g.V;
                                    Space space4 = (Space) ViewBindings.findChildViewById(view, i);
                                    if (space4 != null) {
                                        i = C9834xU.g.T;
                                        Space space5 = (Space) ViewBindings.findChildViewById(view, i);
                                        if (space5 != null) {
                                            i = C9834xU.g.U;
                                            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                            if (c1203Sq != null) {
                                                i = C9834xU.g.X;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatImageView2 != null) {
                                                    i = C9834xU.g.Z;
                                                    C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                    if (c1203Sq2 != null) {
                                                        i = C9834xU.g.ab;
                                                        C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                        if (c1203Sq3 != null) {
                                                            i = C9834xU.g.aa;
                                                            C1203Sq c1203Sq4 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                            if (c1203Sq4 != null) {
                                                                i = C9834xU.g.Y;
                                                                C1203Sq c1203Sq5 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                                                if (c1203Sq5 != null) {
                                                                    return new C9835xV(view, constraintLayout, c1204Sr, appCompatImageView, imageView, space, space2, space3, space4, space5, c1203Sq, appCompatImageView2, c1203Sq2, c1203Sq3, c1203Sq4, c1203Sq5);
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
