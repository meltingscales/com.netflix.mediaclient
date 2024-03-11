package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C6863clN;

/* renamed from: o.clM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6862clM {
    private final ConstraintLayout d;
    public final C1203Sq e;

    private C6862clM(ConstraintLayout constraintLayout, C1203Sq c1203Sq) {
        this.d = constraintLayout;
        this.e = c1203Sq;
    }

    public static C6862clM d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C6863clN.a.i, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return c(inflate);
    }

    public static C6862clM c(View view) {
        int i = C6863clN.d.d;
        C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
        if (c1203Sq != null) {
            return new C6862clM((ConstraintLayout) view, c1203Sq);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
