package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;

/* loaded from: classes4.dex */
public final class bEI {
    public final Barrier a;
    public final FrameLayout b;
    public final ImageView c;
    public final FrameLayout d;
    private final ConstraintLayout e;

    public ConstraintLayout d() {
        return this.e;
    }

    private bEI(ConstraintLayout constraintLayout, Barrier barrier, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView) {
        this.e = constraintLayout;
        this.a = barrier;
        this.b = frameLayout;
        this.d = frameLayout2;
        this.c = imageView;
    }

    public static bEI d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(com.netflix.mediaclient.ui.R.i.U, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return d(inflate);
    }

    public static bEI d(View view) {
        int i = com.netflix.mediaclient.ui.R.g.bH;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = com.netflix.mediaclient.ui.R.g.bM;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = com.netflix.mediaclient.ui.R.g.bK;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = com.netflix.mediaclient.ui.R.g.bO;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new bEI((ConstraintLayout) view, barrier, frameLayout, frameLayout2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
