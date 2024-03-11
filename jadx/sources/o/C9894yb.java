package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C9834xU;

/* renamed from: o.yb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9894yb {
    public final C1204Sr a;
    public final ImageView b;
    public final C1204Sr c;
    public final FrameLayout d;
    public final LinearLayout e;
    private final LinearLayout h;

    private C9894yb(LinearLayout linearLayout, C1204Sr c1204Sr, FrameLayout frameLayout, ImageView imageView, C1204Sr c1204Sr2, LinearLayout linearLayout2) {
        this.h = linearLayout;
        this.a = c1204Sr;
        this.d = frameLayout;
        this.b = imageView;
        this.c = c1204Sr2;
        this.e = linearLayout2;
    }

    public static C9894yb c(View view) {
        int i = C9834xU.g.B;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C9834xU.g.ad;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C9834xU.g.ah;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C9834xU.g.ae;
                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr2 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        return new C9894yb(linearLayout, c1204Sr, frameLayout, imageView, c1204Sr2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
