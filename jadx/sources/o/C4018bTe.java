package o;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import o.C4022bTi;

/* renamed from: o.bTe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4018bTe {
    public final FrameLayout a;
    public final bTX b;
    public final ViewStub c;
    private final FrameLayout d;

    private C4018bTe(FrameLayout frameLayout, FrameLayout frameLayout2, ViewStub viewStub, bTX btx) {
        this.d = frameLayout;
        this.a = frameLayout2;
        this.c = viewStub;
        this.b = btx;
    }

    public static C4018bTe a(View view) {
        int i = C4022bTi.e.a;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C4022bTi.e.i;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
            if (viewStub != null) {
                i = C4022bTi.e.m;
                bTX btx = (bTX) ViewBindings.findChildViewById(view, i);
                if (btx != null) {
                    return new C4018bTe((FrameLayout) view, frameLayout, viewStub, btx);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
