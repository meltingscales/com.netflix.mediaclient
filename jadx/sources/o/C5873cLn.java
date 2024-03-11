package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C5863cLd;

/* renamed from: o.cLn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5873cLn {
    public final C1204Sr a;
    public final ProgressBar b;
    public final C1204Sr c;
    public final C1204Sr d;
    public final EditText e;
    private final ConstraintLayout g;
    public final C1204Sr j;

    public ConstraintLayout c() {
        return this.g;
    }

    private C5873cLn(ConstraintLayout constraintLayout, C1204Sr c1204Sr, ProgressBar progressBar, C1204Sr c1204Sr2, EditText editText, C1204Sr c1204Sr3, C1204Sr c1204Sr4) {
        this.g = constraintLayout;
        this.c = c1204Sr;
        this.b = progressBar;
        this.a = c1204Sr2;
        this.e = editText;
        this.d = c1204Sr3;
        this.j = c1204Sr4;
    }

    public static C5873cLn a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C5863cLd.b.c, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static C5873cLn b(View view) {
        int i = C5863cLd.c.e;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null) {
            i = C5863cLd.c.b;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = C5863cLd.c.m;
                C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                if (c1204Sr2 != null) {
                    i = C5863cLd.c.k;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                    if (editText != null) {
                        i = C5863cLd.c.n;
                        C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                        if (c1204Sr3 != null) {
                            i = C5863cLd.c.q;
                            C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr4 != null) {
                                return new C5873cLn((ConstraintLayout) view, c1204Sr, progressBar, c1204Sr2, editText, c1204Sr3, c1204Sr4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
