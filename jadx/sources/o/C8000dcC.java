package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C8029dcf;

/* renamed from: o.dcC  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8000dcC {
    private final ConstraintLayout a;
    public final C1700aL d;
    public final C3786bKp e;

    private C8000dcC(ConstraintLayout constraintLayout, C3786bKp c3786bKp, C1700aL c1700aL) {
        this.a = constraintLayout;
        this.e = c3786bKp;
        this.d = c1700aL;
    }

    public static C8000dcC d(View view) {
        int i = C8029dcf.a.c;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null) {
            i = C8029dcf.a.j;
            C1700aL c1700aL = (C1700aL) ViewBindings.findChildViewById(view, i);
            if (c1700aL != null) {
                return new C8000dcC((ConstraintLayout) view, c3786bKp, c1700aL);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
