package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import o.C9671um;

/* renamed from: o.up  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9674up {
    public final LinearLayout a;
    public final TextView b;
    public final ImageView c;
    private final LinearLayout d;
    public final ImageView e;

    public LinearLayout d() {
        return this.d;
    }

    private C9674up(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView) {
        this.d = linearLayout;
        this.e = imageView;
        this.c = imageView2;
        this.a = linearLayout2;
        this.b = textView;
    }

    public static C9674up d(LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    public static C9674up e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C9671um.c.e, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static C9674up c(View view) {
        int i = C9671um.a.e;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C9671um.a.d;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C9671um.a.a;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C9671um.a.c;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C9674up((LinearLayout) view, imageView, imageView2, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
