package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEV {
    public final C1203Sq a;
    public final C1203Sq b;
    public final C1203Sq c;
    public final LinearLayout d;
    public final C1204Sr e;
    private final LinearLayout g;

    private bEV(LinearLayout linearLayout, C1204Sr c1204Sr, LinearLayout linearLayout2, C1203Sq c1203Sq, C1203Sq c1203Sq2, C1203Sq c1203Sq3) {
        this.g = linearLayout;
        this.e = c1204Sr;
        this.d = linearLayout2;
        this.a = c1203Sq;
        this.b = c1203Sq2;
        this.c = c1203Sq3;
    }

    public static bEV d(View view) {
        int i = com.netflix.mediaclient.ui.R.g.ah;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = com.netflix.mediaclient.ui.R.g.ag;
            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
            if (c1203Sq != null) {
                i = com.netflix.mediaclient.ui.R.g.fn;
                C1203Sq c1203Sq2 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                if (c1203Sq2 != null) {
                    i = com.netflix.mediaclient.ui.R.g.gK;
                    C1203Sq c1203Sq3 = (C1203Sq) ViewBindings.findChildViewById(view, i);
                    if (c1203Sq3 != null) {
                        return new bEV(linearLayout, c1204Sr, linearLayout, c1203Sq, c1203Sq2, c1203Sq3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
