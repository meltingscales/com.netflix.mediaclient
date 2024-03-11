package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public final class bEO {
    private final ConstraintLayout a;
    public final EpoxyRecyclerView c;
    public final View d;
    public final ViewStub e;

    public ConstraintLayout b() {
        return this.a;
    }

    private bEO(ConstraintLayout constraintLayout, View view, ViewStub viewStub, EpoxyRecyclerView epoxyRecyclerView) {
        this.a = constraintLayout;
        this.d = view;
        this.e = viewStub;
        this.c = epoxyRecyclerView;
    }

    public static bEO e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.aT, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public static bEO a(View view) {
        int i = com.netflix.mediaclient.ui.R.g.ab;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = com.netflix.mediaclient.ui.R.g.cd;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                i = com.netflix.mediaclient.ui.R.g.eC;
                EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) ViewBindings.findChildViewById(view, i);
                if (epoxyRecyclerView != null) {
                    return new bEO((ConstraintLayout) view, findChildViewById, viewStub, epoxyRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
