package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C7939dav;

/* renamed from: o.dbi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7979dbi {
    public final ConstraintLayout a;
    public final Barrier b;
    public final Barrier c;
    public final C1204Sr d;
    public final C1204Sr e;
    public final C1204Sr f;
    public final C1204Sr g;
    public final ImageView h;
    public final C1204Sr i;
    public final Barrier j;
    public final C1204Sr k;
    private final View l;
    public final C1204Sr m;
    public final C1204Sr n;

    /* renamed from: o  reason: collision with root package name */
    public final C1204Sr f13825o;

    private C7979dbi(View view, ConstraintLayout constraintLayout, C1204Sr c1204Sr, Barrier barrier, C1204Sr c1204Sr2, Barrier barrier2, C1204Sr c1204Sr3, Barrier barrier3, ImageView imageView, C1204Sr c1204Sr4, C1204Sr c1204Sr5, C1204Sr c1204Sr6, C1204Sr c1204Sr7, C1204Sr c1204Sr8, C1204Sr c1204Sr9) {
        this.l = view;
        this.a = constraintLayout;
        this.d = c1204Sr;
        this.b = barrier;
        this.e = c1204Sr2;
        this.c = barrier2;
        this.f = c1204Sr3;
        this.j = barrier3;
        this.h = imageView;
        this.i = c1204Sr4;
        this.g = c1204Sr5;
        this.m = c1204Sr6;
        this.f13825o = c1204Sr7;
        this.n = c1204Sr8;
        this.k = c1204Sr9;
    }

    public static C7979dbi a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C7939dav.a.F, viewGroup);
        return a(viewGroup);
    }

    public static C7979dbi a(View view) {
        int i = C7939dav.d.a;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C7939dav.d.f;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C7939dav.d.j;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier != null) {
                    i = C7939dav.d.i;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        i = C7939dav.d.h;
                        Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                        if (barrier2 != null) {
                            i = C7939dav.d.g;
                            C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr3 != null) {
                                i = C7939dav.d.m;
                                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                                if (barrier3 != null) {
                                    i = C7939dav.d.n;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = C7939dav.d.t;
                                        C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                        if (c1204Sr4 != null) {
                                            i = C7939dav.d.r;
                                            C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                            if (c1204Sr5 != null) {
                                                i = C7939dav.d.q;
                                                C1204Sr c1204Sr6 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                if (c1204Sr6 != null) {
                                                    i = C7939dav.d.y;
                                                    C1204Sr c1204Sr7 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr7 != null) {
                                                        i = C7939dav.d.w;
                                                        C1204Sr c1204Sr8 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                        if (c1204Sr8 != null) {
                                                            i = C7939dav.d.C;
                                                            C1204Sr c1204Sr9 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                            if (c1204Sr9 != null) {
                                                                return new C7979dbi(view, constraintLayout, c1204Sr, barrier, c1204Sr2, barrier2, c1204Sr3, barrier3, imageView, c1204Sr4, c1204Sr5, c1204Sr6, c1204Sr7, c1204Sr8, c1204Sr9);
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
