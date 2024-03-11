package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C7142cqd;

/* renamed from: o.cqh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7146cqh {
    public final C1204Sr a;
    public final C1204Sr b;
    private final LinearLayout c;

    public LinearLayout a() {
        return this.c;
    }

    private C7146cqh(LinearLayout linearLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.c = linearLayout;
        this.a = c1204Sr;
        this.b = c1204Sr2;
    }

    public static C7146cqh b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.i, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static C7146cqh d(View view) {
        int i = C7142cqd.b.x;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C7142cqd.b.u;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                return new C7146cqh((LinearLayout) view, c1204Sr, c1204Sr2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
