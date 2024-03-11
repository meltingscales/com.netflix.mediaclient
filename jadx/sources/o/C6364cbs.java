package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import o.C6361cbp;

/* renamed from: o.cbs  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6364cbs {
    private final View c;
    public final C1203Sq d;
    public final C1204Sr e;

    private C6364cbs(View view, C1204Sr c1204Sr, C1203Sq c1203Sq) {
        this.c = view;
        this.e = c1204Sr;
        this.d = c1203Sq;
    }

    public static C6364cbs b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C6361cbp.e.c, viewGroup);
        return e(viewGroup);
    }

    public static C6364cbs e(View view) {
        int i = C6361cbp.c.b;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C6361cbp.c.a;
            C1203Sq c1203Sq = (C1203Sq) ViewBindings.findChildViewById(view, i);
            if (c1203Sq != null) {
                return new C6364cbs(view, c1204Sr, c1203Sq);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
