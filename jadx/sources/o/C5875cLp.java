package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C5863cLd;

/* renamed from: o.cLp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5875cLp {
    public final C1204Sr a;
    public final C1204Sr b;
    public final C1204Sr c;
    public final ProgressBar d;
    public final EditText e;
    private final ConstraintLayout f;
    public final C1204Sr g;

    public ConstraintLayout a() {
        return this.f;
    }

    private C5875cLp(ConstraintLayout constraintLayout, C1204Sr c1204Sr, ProgressBar progressBar, C1204Sr c1204Sr2, C1204Sr c1204Sr3, EditText editText, C1204Sr c1204Sr4) {
        this.f = constraintLayout;
        this.c = c1204Sr;
        this.d = progressBar;
        this.b = c1204Sr2;
        this.a = c1204Sr3;
        this.e = editText;
        this.g = c1204Sr4;
    }

    public static C5875cLp a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5863cLd.b.e, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static C5875cLp e(View view) {
        int i = C5863cLd.c.e;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C5863cLd.c.b;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = C5863cLd.c.j;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C5863cLd.c.h;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = C5863cLd.c.f;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText != null) {
                            i = C5863cLd.c.w;
                            C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr4 != null) {
                                return new C5875cLp((ConstraintLayout) view, c1204Sr, progressBar, c1204Sr2, c1204Sr3, editText, c1204Sr4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
