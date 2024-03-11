package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes4.dex */
public final class cCU extends Animation {
    public static final c d = new c(null);
    private final float a;
    private final View b;
    private final float e;

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }

    public cCU(View view, float f, float f2) {
        C8632dsu.c((Object) view, "");
        this.b = view;
        this.a = f;
        this.e = f2;
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("InteractiveWidthResizeAnimation");
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        int i = this.b.getLayoutParams().width;
        float f2 = this.a;
        int i2 = (int) (f2 + ((this.e - f2) * f) + 0.5d);
        if (i != i2) {
            this.b.getLayoutParams().width = i2;
            this.b.requestLayout();
        }
    }
}
