package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C6863clN;

/* renamed from: o.clQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6866clQ {
    public final C1203Sq c;
    private final ConstraintLayout e;

    private C6866clQ(ConstraintLayout constraintLayout, C1203Sq c1203Sq) {
        this.e = constraintLayout;
        this.c = c1203Sq;
    }

    public static C6866clQ c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C6863clN.a.f, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static C6866clQ c(View view) {
        int i = C6863clN.d.e;
        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
        if (c1203Sq != null) {
            return new C6866clQ((ConstraintLayout) view, c1203Sq);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
