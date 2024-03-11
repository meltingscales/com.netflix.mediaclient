package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEU {
    public final ImageButton a;
    private final FrameLayout b;
    public final FrameLayout c;
    public final RecyclerView d;

    public FrameLayout a() {
        return this.b;
    }

    private bEU(FrameLayout frameLayout, ImageButton imageButton, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.b = frameLayout;
        this.a = imageButton;
        this.d = recyclerView;
        this.c = frameLayout2;
    }

    public static bEU a(LayoutInflater layoutInflater) {
        return c(layoutInflater, null, false);
    }

    public static bEU c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.bu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    public static bEU b(View view) {
        int i = com.netflix.mediaclient.ui.R.g.az;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = com.netflix.mediaclient.ui.R.g.fx;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new bEU(frameLayout, imageButton, recyclerView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
