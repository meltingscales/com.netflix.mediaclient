package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.dil  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8353dil extends C8348dig {
    public C8353dil(boolean z) {
        super(z);
    }

    @Override // o.C8348dig
    protected ObjectAnimator e(ViewGroup viewGroup, View view, boolean z) {
        float f;
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) view, "");
        if (viewGroup.getY() > 0.0f && viewGroup.getY() < viewGroup.getHeight()) {
            f = viewGroup.getY();
        } else {
            f = z ? viewGroup.getHeight() : 0.0f;
        }
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f, 0.0f);
            C8632dsu.d(ofFloat);
            return ofFloat;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f, viewGroup.getHeight());
        C8632dsu.d(ofFloat2);
        return ofFloat2;
    }
}
