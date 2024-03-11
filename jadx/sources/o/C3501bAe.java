package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.epoxy.EpoxyRecyclerView;
import o.C5473bzS;

/* renamed from: o.bAe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3501bAe {
    private final FrameLayout b;
    public final EpoxyRecyclerView e;

    private C3501bAe(FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView) {
        this.b = frameLayout;
        this.e = epoxyRecyclerView;
    }

    public static C3501bAe c(View view) {
        int i = C5473bzS.a.a;
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) ViewBindings.findChildViewById(view, i);
        if (epoxyRecyclerView != null) {
            return new C3501bAe((FrameLayout) view, epoxyRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
