package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C6638chA;

/* renamed from: o.chB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6639chB {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final C3786bKp d;
    private final ConstraintLayout e;

    private C6639chB(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, C3786bKp c3786bKp, ConstraintLayout constraintLayout3) {
        this.e = constraintLayout;
        this.b = constraintLayout2;
        this.d = c3786bKp;
        this.a = constraintLayout3;
    }

    public static C6639chB d(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C6638chA.d.d;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null) {
            i = C6638chA.d.b;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                return new C6639chB(constraintLayout, constraintLayout, c3786bKp, constraintLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
