package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C3895bOq;

/* loaded from: classes4.dex */
public final class bOI {
    private final ConstraintLayout a;
    public final bLI d;

    private bOI(ConstraintLayout constraintLayout, bLI bli) {
        this.a = constraintLayout;
        this.d = bli;
    }

    public static bOI c(View view) {
        int i = C3895bOq.b.s;
        bLI bli = (bLI) ViewBindings.findChildViewById(view, i);
        if (bli != null) {
            return new bOI((ConstraintLayout) view, bli);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
