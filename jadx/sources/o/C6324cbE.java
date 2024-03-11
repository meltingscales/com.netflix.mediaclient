package o;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import o.C6363cbr;

/* renamed from: o.cbE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6324cbE {
    private final ConstraintLayout a;
    public final Toolbar d;
    public final RecyclerView e;

    private C6324cbE(ConstraintLayout constraintLayout, RecyclerView recyclerView, Toolbar toolbar) {
        this.a = constraintLayout;
        this.e = recyclerView;
        this.d = toolbar;
    }

    public static C6324cbE e(View view) {
        int i = C6363cbr.a.g;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C6363cbr.a.h;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
            if (toolbar != null) {
                return new C6324cbE((ConstraintLayout) view, recyclerView, toolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
