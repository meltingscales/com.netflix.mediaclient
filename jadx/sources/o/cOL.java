package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.android.widgetry.lolomo.LolomoRecyclerView;
import o.cOG;

/* loaded from: classes4.dex */
public final class cOL {
    private final FrameLayout b;
    public final LolomoRecyclerView d;

    public FrameLayout c() {
        return this.b;
    }

    private cOL(FrameLayout frameLayout, LolomoRecyclerView lolomoRecyclerView) {
        this.b = frameLayout;
        this.d = lolomoRecyclerView;
    }

    public static cOL c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(cOG.a.e, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return e(inflate);
    }

    public static cOL e(View view) {
        int i = cOG.b.b;
        LolomoRecyclerView lolomoRecyclerView = (LolomoRecyclerView) ViewBindings.findChildViewById(view, i);
        if (lolomoRecyclerView != null) {
            return new cOL((FrameLayout) view, lolomoRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
