package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import o.C4201bZz;

/* renamed from: o.bZy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4200bZy {
    public final C3786bKp a;
    public final ImageButton b;
    private final ConstraintLayout c;

    public ConstraintLayout c() {
        return this.c;
    }

    private C4200bZy(ConstraintLayout constraintLayout, C3786bKp c3786bKp, ImageButton imageButton) {
        this.c = constraintLayout;
        this.a = c3786bKp;
        this.b = imageButton;
    }

    public static C4200bZy e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C4201bZz.b.a, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static C4200bZy a(View view) {
        int i = C4201bZz.c.a;
        C3786bKp c3786bKp = (C3786bKp) ViewBindings.findChildViewById(view, i);
        if (c3786bKp != null) {
            i = C4201bZz.c.c;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null) {
                return new C4200bZy((ConstraintLayout) view, c3786bKp, imageButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
