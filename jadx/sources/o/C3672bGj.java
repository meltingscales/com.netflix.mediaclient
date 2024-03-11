package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C3670bGh;

/* renamed from: o.bGj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3672bGj {
    public final bJB b;
    private final ConstraintLayout c;

    private C3672bGj(ConstraintLayout constraintLayout, bJB bjb) {
        this.c = constraintLayout;
        this.b = bjb;
    }

    public static C3672bGj c(View view) {
        int i = C3670bGh.a.j;
        bJB bjb = (bJB) ViewBindings.findChildViewById(view, i);
        if (bjb != null) {
            return new C3672bGj((ConstraintLayout) view, bjb);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
