package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C5863cLd;

/* renamed from: o.cLo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5874cLo {
    public final C1204Sr a;
    public final C1204Sr b;
    private final ConstraintLayout c;
    public final ProgressBar d;
    public final C1204Sr e;

    public ConstraintLayout a() {
        return this.c;
    }

    private C5874cLo(ConstraintLayout constraintLayout, C1204Sr c1204Sr, ProgressBar progressBar, C1204Sr c1204Sr2, C1204Sr c1204Sr3) {
        this.c = constraintLayout;
        this.b = c1204Sr;
        this.d = progressBar;
        this.a = c1204Sr2;
        this.e = c1204Sr3;
    }

    public static C5874cLo b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5863cLd.b.a, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static C5874cLo d(View view) {
        int i = C5863cLd.c.e;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C5863cLd.c.b;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = C5863cLd.c.i;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C5863cLd.c.f13682o;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        return new C5874cLo((ConstraintLayout) view, c1204Sr, progressBar, c1204Sr2, c1204Sr3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
