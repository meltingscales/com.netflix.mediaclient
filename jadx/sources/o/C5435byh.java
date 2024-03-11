package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Ref;

/* renamed from: o.byh  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5435byh {
    private final long a;
    private Boolean b;
    private ValueAnimator c;
    private final C5443byp d;
    private final ViewPager2 e;

    public C5435byh(ViewPager2 viewPager2, long j) {
        C8632dsu.c((Object) viewPager2, "");
        this.e = viewPager2;
        this.a = j;
        this.d = new C5443byp();
    }

    public final boolean a(final boolean z) {
        int i;
        C5443byp c5443byp;
        int currentItem = this.e.getCurrentItem();
        Boolean bool = this.b;
        if (C8632dsu.c(bool, Boolean.TRUE)) {
            i = 1;
        } else {
            i = C8632dsu.c(bool, Boolean.FALSE) ? -1 : 0;
        }
        int i2 = currentItem + i + (z ? 1 : -1);
        if (i2 < 0 || i2 >= d()) {
            return false;
        }
        int width = this.e.getWidth();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.b = 0;
        if (C8632dsu.c(this.b, Boolean.valueOf(z))) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                int width2 = this.e.getWidth();
                Object animatedValue = valueAnimator.getAnimatedValue();
                C8632dsu.d(animatedValue);
                width += width2 - ((Integer) animatedValue).intValue();
                valueAnimator.cancel();
            }
            c5443byp = this.d;
            C8632dsu.d(c5443byp);
        } else if (this.b != null) {
            this.b = Boolean.valueOf(z);
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                valueAnimator2.reverse();
            }
            return true;
        } else {
            c5443byp = this.d;
        }
        this.b = Boolean.valueOf(z);
        this.e.beginFakeDrag();
        final ValueAnimator ofInt = ValueAnimator.ofInt(0, width);
        ofInt.setInterpolator(c5443byp);
        ofInt.setDuration(this.a);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.byn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                C5435byh.c(ofInt, this, z, intRef, valueAnimator3);
            }
        });
        ofInt.addListener(new a());
        ofInt.start();
        this.c = ofInt;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ValueAnimator valueAnimator, C5435byh c5435byh, boolean z, Ref.IntRef intRef, ValueAnimator valueAnimator2) {
        int i;
        C8632dsu.c((Object) c5435byh, "");
        C8632dsu.c((Object) intRef, "");
        C8632dsu.c((Object) valueAnimator2, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        int intValue = ((Integer) animatedValue).intValue();
        ViewPager2 viewPager2 = c5435byh.e;
        if (z) {
            i = (intValue - intRef.b) * (-1);
        } else {
            i = intValue - intRef.b;
        }
        viewPager2.fakeDragBy(i);
        intRef.b = intValue;
    }

    /* renamed from: o.byh$a */
    /* loaded from: classes6.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C5435byh.this.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            C5435byh.this.e();
        }
    }

    private final int d() {
        RecyclerView.Adapter adapter = this.e.getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        this.c = null;
        this.b = null;
        this.e.endFakeDrag();
    }
}
