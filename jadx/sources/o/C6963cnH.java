package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C6956cnA;

/* renamed from: o.cnH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6963cnH {
    private final ConstraintLayout b;
    public final C1204Sr c;
    public final C1204Sr d;

    public ConstraintLayout e() {
        return this.b;
    }

    private C6963cnH(ConstraintLayout constraintLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.b = constraintLayout;
        this.d = c1204Sr;
        this.c = c1204Sr2;
    }

    public static C6963cnH b(View view) {
        int i = C6956cnA.e.m;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C6956cnA.e.n;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                return new C6963cnH((ConstraintLayout) view, c1204Sr, c1204Sr2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
