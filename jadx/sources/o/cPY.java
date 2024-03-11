package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.cPX;

/* loaded from: classes4.dex */
public final class cPY {
    public final LinearLayout a;
    public final C1203Sq b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final C1204Sr e;
    public final C1204Sr h;
    private final LinearLayout i;

    private cPY(LinearLayout linearLayout, C1203Sq c1203Sq, C1204Sr c1204Sr, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, C1204Sr c1204Sr2) {
        this.i = linearLayout;
        this.b = c1203Sq;
        this.e = c1204Sr;
        this.d = linearLayout2;
        this.a = linearLayout3;
        this.c = linearLayout4;
        this.h = c1204Sr2;
    }

    public static cPY c(View view) {
        int i = cPX.a.c;
        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
        if (c1203Sq != null) {
            i = cPX.a.i;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = cPX.a.h;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = cPX.a.f;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = cPX.a.m;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout3 != null) {
                            i = cPX.a.k;
                            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr2 != null) {
                                return new cPY((LinearLayout) view, c1203Sq, c1204Sr, linearLayout, linearLayout2, linearLayout3, c1204Sr2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
