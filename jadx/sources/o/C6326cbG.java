package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import o.C6363cbr;

/* renamed from: o.cbG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6326cbG {
    public final TextView a;
    public final TextView b;
    private final LinearLayout e;

    private C6326cbG(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.e = linearLayout;
        this.a = textView;
        this.b = textView2;
    }

    public static C6326cbG e(View view) {
        int i = C6363cbr.a.c;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C6363cbr.a.f;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C6326cbG((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
