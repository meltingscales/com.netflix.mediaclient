package o;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import o.C7939dav;

/* renamed from: o.dbm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7983dbm {
    private final LinearLayout a;
    public final ViewStub c;
    public final FrameLayout d;
    public final bJB e;

    private C7983dbm(LinearLayout linearLayout, FrameLayout frameLayout, ViewStub viewStub, bJB bjb) {
        this.a = linearLayout;
        this.d = frameLayout;
        this.c = viewStub;
        this.e = bjb;
    }

    public static C7983dbm d(View view) {
        int i = C7939dav.d.k;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C7939dav.d.f13822o;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                i = C7939dav.d.v;
                bJB bjb = (bJB) ViewBindings.findChildViewById(view, i);
                if (bjb != null) {
                    return new C7983dbm((LinearLayout) view, frameLayout, viewStub, bjb);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
