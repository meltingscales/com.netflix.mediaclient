package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C9834xU;

/* renamed from: o.yd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9896yd {
    public final LinearLayout a;
    public final C1204Sr b;
    public final ImageView c;
    public final C1204Sr d;
    public final LinearLayout e;
    private final LinearLayout j;

    private C9896yd(LinearLayout linearLayout, C1204Sr c1204Sr, LinearLayout linearLayout2, ImageView imageView, C1204Sr c1204Sr2, LinearLayout linearLayout3) {
        this.j = linearLayout;
        this.b = c1204Sr;
        this.a = linearLayout2;
        this.c = imageView;
        this.d = c1204Sr2;
        this.e = linearLayout3;
    }

    public static C9896yd a(View view) {
        int i = C9834xU.g.B;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C9834xU.g.ad;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C9834xU.g.ah;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C9834xU.g.ae;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        return new C9896yd(linearLayout2, c1204Sr, linearLayout, imageView, c1204Sr2, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
