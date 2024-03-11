package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C5863cLd;

/* renamed from: o.cLr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5877cLr {
    public final C1204Sr a;
    public final View b;
    public final C1204Sr c;
    public final ConstraintLayout d;
    public final LinearLayout e;
    public final C1204Sr f;
    public final C1203Sq g;
    public final LinearLayout h;
    private final FrameLayout i;
    public final C1204Sr j;

    public FrameLayout d() {
        return this.i;
    }

    private C5877cLr(FrameLayout frameLayout, View view, C1204Sr c1204Sr, C1204Sr c1204Sr2, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, C1204Sr c1204Sr3, C1204Sr c1204Sr4, C1203Sq c1203Sq) {
        this.i = frameLayout;
        this.b = view;
        this.c = c1204Sr;
        this.a = c1204Sr2;
        this.e = linearLayout;
        this.d = constraintLayout;
        this.h = linearLayout2;
        this.j = c1204Sr3;
        this.f = c1204Sr4;
        this.g = c1203Sq;
    }

    public static C5877cLr c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5863cLd.b.d, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static C5877cLr d(View view) {
        int i = C5863cLd.c.c;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = C5863cLd.c.a;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = C5863cLd.c.d;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C5863cLd.c.g;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C5863cLd.c.l;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = C5863cLd.c.p;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C5863cLd.c.r;
                                C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr3 != null) {
                                    i = C5863cLd.c.t;
                                    C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr4 != null) {
                                        i = C5863cLd.c.s;
                                        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                        if (c1203Sq != null) {
                                            return new C5877cLr((FrameLayout) view, findChildViewById, c1204Sr, c1204Sr2, linearLayout, constraintLayout, linearLayout2, c1204Sr3, c1204Sr4, c1203Sq);
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
