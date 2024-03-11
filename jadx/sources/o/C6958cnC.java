package o;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C6956cnA;

/* renamed from: o.cnC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6958cnC {
    public final HorizontalScrollView a;
    public final LinearLayout c;
    private final HorizontalScrollView e;

    private C6958cnC(HorizontalScrollView horizontalScrollView, HorizontalScrollView horizontalScrollView2, LinearLayout linearLayout) {
        this.e = horizontalScrollView;
        this.a = horizontalScrollView2;
        this.c = linearLayout;
    }

    public static C6958cnC c(View view) {
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
        int i = C6956cnA.e.h;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            return new C6958cnC(horizontalScrollView, horizontalScrollView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
