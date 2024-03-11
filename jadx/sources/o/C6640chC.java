package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C6638chA;

/* renamed from: o.chC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6640chC {
    public final C3786bKp a;
    public final ConstraintLayout c;
    private final ConstraintLayout e;

    private C6640chC(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, C3786bKp c3786bKp) {
        this.e = constraintLayout;
        this.c = constraintLayout2;
        this.a = c3786bKp;
    }

    public static C6640chC e(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C6638chA.d.d;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null) {
            return new C6640chC(constraintLayout, constraintLayout, c3786bKp);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
