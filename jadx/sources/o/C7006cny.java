package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBindings;
import o.C6956cnA;

/* renamed from: o.cny  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7006cny {
    public final C3786bKp a;
    public final FrameLayout b;
    public final C6963cnH c;
    public final C6958cnC d;
    public final LinearLayout e;
    private final CoordinatorLayout h;

    private C7006cny(CoordinatorLayout coordinatorLayout, C3786bKp c3786bKp, C6958cnC c6958cnC, C6963cnH c6963cnH, FrameLayout frameLayout, LinearLayout linearLayout) {
        this.h = coordinatorLayout;
        this.a = c3786bKp;
        this.d = c6958cnC;
        this.c = c6963cnH;
        this.b = frameLayout;
        this.e = linearLayout;
    }

    public static C7006cny c(View view) {
        View findChildViewById;
        int i = C6956cnA.e.e;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = C6956cnA.e.j))) != null) {
            C6958cnC c = C6958cnC.c(findChildViewById);
            i = C6956cnA.e.k;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (findChildViewById2 != null) {
                C6963cnH b = C6963cnH.b(findChildViewById2);
                i = C6956cnA.e.p;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C6956cnA.e.s;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new C7006cny((CoordinatorLayout) view, c3786bKp, c, b, frameLayout, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
