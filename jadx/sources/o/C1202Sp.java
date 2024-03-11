package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.widget.NetflixVisualTimerButton$startTimer$1;
import o.C9834xU;
import o.SC;
import o.dpR;
import o.dxD;

/* renamed from: o.Sp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1202Sp extends C1203Sq implements dwU {
    private boolean b;
    private int c;
    private final dxN e;
    private final boolean f;
    private final InterfaceC8554dpx g;
    private final InterfaceC8554dpx h;
    private drO<dpR> i;
    private dxD j;
    private drO<dpR> n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1202Sp(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1202Sp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final drO<dpR> a() {
        return this.i;
    }

    @Override // o.dwU
    /* renamed from: c */
    public dxN getCoroutineContext() {
        return this.e;
    }

    public final void setAnimationsEnabled(boolean z) {
        this.b = z;
    }

    public final void setTimerFinished(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.i = dro;
    }

    public final void setTimerStopped(drO<dpR> dro) {
        C8632dsu.c((Object) dro, "");
        this.n = dro;
    }

    public /* synthetic */ C1202Sp(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202Sp(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<ValueAnimator>() { // from class: com.netflix.mediaclient.android.widget.NetflixVisualTimerButton$timerAnimator$2
            @Override // o.drO
            /* renamed from: b */
            public final ValueAnimator invoke() {
                return ValueAnimator.ofFloat(0.0f, 110.0f);
            }
        });
        this.g = b;
        this.f = C8310dhv.a();
        b2 = dpB.b(new drO<SC>() { // from class: com.netflix.mediaclient.android.widget.NetflixVisualTimerButton$progressDrawable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final SC invoke() {
                return new SC(ContextCompat.getColor(context, C9834xU.c.f), ContextCompat.getColor(context, C9834xU.c.f13913o), 0.0f, 4, null);
            }
        });
        this.h = b2;
        this.e = GF.e.d(context);
        this.b = true;
        this.i = new drO<dpR>() { // from class: com.netflix.mediaclient.android.widget.NetflixVisualTimerButton$timerFinished$1
            public final void c() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }
        };
        this.n = new drO<dpR>() { // from class: com.netflix.mediaclient.android.widget.NetflixVisualTimerButton$timerStopped$1
            public final void b() {
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                b();
                return dpR.c;
            }
        };
    }

    private final ValueAnimator j() {
        Object value = this.g.getValue();
        C8632dsu.a(value, "");
        return (ValueAnimator) value;
    }

    private final SC f() {
        return (SC) this.h.getValue();
    }

    public final void setupTimer(int i) {
        this.c = i;
        if (this.b) {
            ValueAnimator j = j();
            j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Su
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1202Sp.b(C1202Sp.this, valueAnimator);
                }
            });
            j.setDuration(i * 1000);
            j.setInterpolator(new LinearInterpolator());
            setBackground(f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1202Sp c1202Sp, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c1202Sp, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        SC f = c1202Sp.f();
        if (c1202Sp.f) {
            floatValue = 110.0f - floatValue;
        }
        f.e(Math.min(floatValue, 100.0f));
    }

    public final void e() {
        dxD c;
        if (this.b) {
            if (j().isRunning()) {
                j().cancel();
            }
            j().start();
        }
        c = C8737dwr.c(this, null, null, new NetflixVisualTimerButton$startTimer$1(this, null), 3, null);
        this.j = c;
    }

    public final void h() {
        dxD dxd = this.j;
        if (dxd != null) {
            dxD.b.b(dxd, null, 1, null);
        }
        if (this.b) {
            j().end();
        }
        this.n.invoke();
    }
}
