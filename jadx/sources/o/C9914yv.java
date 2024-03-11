package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import o.C9914yv;

/* renamed from: o.yv  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9914yv {
    public static final a a = new a(null);

    /* renamed from: o.yv$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Animator e(final View view, int i, int i2, boolean z, boolean z2) {
            C8632dsu.c((Object) view, "");
            final C9917yy c9917yy = new C9917yy(i, z, z2);
            view.setOutlineProvider(c9917yy);
            view.setClipToOutline(true);
            final ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.yw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9914yv.a.d(C9917yy.this, ofInt, view, valueAnimator);
                }
            });
            C8632dsu.a(ofInt, "");
            return ofInt;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C9917yy c9917yy, ValueAnimator valueAnimator, View view, ValueAnimator valueAnimator2) {
            C8632dsu.c((Object) c9917yy, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) valueAnimator2, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            c9917yy.d(((Integer) animatedValue).intValue());
            view.invalidateOutline();
        }
    }
}
