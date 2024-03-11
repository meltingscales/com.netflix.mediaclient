package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import o.C7142cqd;

/* renamed from: o.cqg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7145cqg {
    public final RecyclerView a;
    private final FrameLayout b;
    public final FrameLayout c;
    public final ProgressBar e;

    public FrameLayout d() {
        return this.b;
    }

    private C7145cqg(FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2, RecyclerView recyclerView) {
        this.b = frameLayout;
        this.e = progressBar;
        this.c = frameLayout2;
        this.a = recyclerView;
    }

    public static C7145cqg c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C7142cqd.a.j, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static C7145cqg b(View view) {
        int i = C7142cqd.b.r;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            int i2 = C7142cqd.b.t;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                return new C7145cqg(frameLayout, progressBar, frameLayout, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
