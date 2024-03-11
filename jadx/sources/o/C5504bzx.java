package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import o.C5503bzw;

/* renamed from: o.bzx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5504bzx {
    private final FrameLayout b;
    public final C3786bKp e;

    private C5504bzx(FrameLayout frameLayout, C3786bKp c3786bKp) {
        this.b = frameLayout;
        this.e = c3786bKp;
    }

    public static C5504bzx e(View view) {
        int i = C5503bzw.c.f;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null) {
            return new C5504bzx((FrameLayout) view, c3786bKp);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
