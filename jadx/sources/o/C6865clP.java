package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.epoxy.EpoxyRecyclerView;
import o.C6863clN;

/* renamed from: o.clP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6865clP {
    public final EpoxyRecyclerView b;
    public final FrameLayout c;
    private final FrameLayout d;

    public FrameLayout c() {
        return this.d;
    }

    private C6865clP(FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout2) {
        this.d = frameLayout;
        this.b = epoxyRecyclerView;
        this.c = frameLayout2;
    }

    public static C6865clP b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C6863clN.a.g, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static C6865clP e(View view) {
        int i = C6863clN.d.h;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) ViewBindings.findChildViewById(view, i);
        if (epoxyRecyclerView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C6865clP(frameLayout, epoxyRecyclerView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
