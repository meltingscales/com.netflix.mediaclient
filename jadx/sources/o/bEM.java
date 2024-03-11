package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEM {
    public final C1204Sr a;
    public final LinearLayout b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final ScrollView e;
    public final C1208Sv f;
    public final C1203Sq g;
    public final C1203Sq h;
    public final C1204Sr i;
    public final C1203Sq j;
    private final FrameLayout m;

    public FrameLayout b() {
        return this.m;
    }

    private bEM(FrameLayout frameLayout, C1204Sr c1204Sr, LinearLayout linearLayout, C1204Sr c1204Sr2, ScrollView scrollView, C1204Sr c1204Sr3, C1204Sr c1204Sr4, C1208Sv c1208Sv, C1203Sq c1203Sq, C1203Sq c1203Sq2, C1203Sq c1203Sq3) {
        this.m = frameLayout;
        this.c = c1204Sr;
        this.b = linearLayout;
        this.a = c1204Sr2;
        this.e = scrollView;
        this.d = c1204Sr3;
        this.i = c1204Sr4;
        this.f = c1208Sv;
        this.j = c1203Sq;
        this.h = c1203Sq2;
        this.g = c1203Sq3;
    }

    public static bEM d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.aj, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bEM a(View view) {
        int i = com.netflix.mediaclient.ui.R.g.bf;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = com.netflix.mediaclient.ui.R.g.dj;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = com.netflix.mediaclient.ui.R.g.eb;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = com.netflix.mediaclient.ui.R.g.ea;
                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                    if (scrollView != null) {
                        i = com.netflix.mediaclient.ui.R.g.ed;
                        C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr3 != null) {
                            i = com.netflix.mediaclient.ui.R.g.ek;
                            C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr4 != null) {
                                i = com.netflix.mediaclient.ui.R.g.el;
                                C1208Sv c1208Sv = (C1208Sv) ViewBindings.findChildViewById(view, i);
                                if (c1208Sv != null) {
                                    i = com.netflix.mediaclient.ui.R.g.fk;
                                    C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                    if (c1203Sq != null) {
                                        i = com.netflix.mediaclient.ui.R.g.fL;
                                        C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                        if (c1203Sq2 != null) {
                                            i = com.netflix.mediaclient.ui.R.g.gP;
                                            C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                                            if (c1203Sq3 != null) {
                                                return new bEM((FrameLayout) view, c1204Sr, linearLayout, c1204Sr2, scrollView, c1204Sr3, c1204Sr4, c1208Sv, c1203Sq, c1203Sq2, c1203Sq3);
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
