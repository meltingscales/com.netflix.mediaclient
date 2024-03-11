package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.bDv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3599bDv {
    private ObjectAnimator c;

    public C3599bDv(View view, int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", i, i2);
        this.c = ofFloat;
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.c.setDuration(300L);
    }

    public void b() {
        this.c.start();
    }

    public boolean e() {
        return this.c.isRunning();
    }

    public void d() {
        this.c.cancel();
    }
}
