package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C5437byj;

/* renamed from: o.byr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5445byr {
    public final C1204Sr a;
    public final C1204Sr b;
    private final LinearLayout c;

    private C5445byr(LinearLayout linearLayout, C1204Sr c1204Sr, C1204Sr c1204Sr2) {
        this.c = linearLayout;
        this.a = c1204Sr;
        this.b = c1204Sr2;
    }

    public static C5445byr a(View view) {
        int i = C5437byj.c.e;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C5437byj.c.d;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                return new C5445byr((LinearLayout) view, c1204Sr, c1204Sr2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
