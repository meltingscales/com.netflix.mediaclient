package o;

import android.view.Choreographer;

/* renamed from: o.fb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class Choreographer$FrameCallbackC8908fb extends AbstractC8850eW implements Choreographer.FrameCallback {
    private C3658bG b;
    private float j = 1.0f;
    private boolean f = false;
    private long a = 0;
    private float d = 0.0f;
    private float c = 0.0f;
    private int g = 0;
    private float h = -2.14748365E9f;
    private float i = 2.14748365E9f;
    protected boolean e = false;
    private boolean m = false;

    public void e(float f) {
        this.j = f;
    }

    public void e(boolean z) {
        this.m = z;
    }

    public void f() {
        this.b = null;
        this.h = -2.14748365E9f;
        this.i = 2.14748365E9f;
    }

    public float g() {
        return this.c;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.e;
    }

    public float o() {
        return this.j;
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    public float j() {
        C3658bG c3658bG = this.b;
        if (c3658bG == null) {
            return 0.0f;
        }
        return (this.c - c3658bG.m()) / (this.b.d() - this.b.m());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float m;
        float i;
        float m2;
        if (this.b == null) {
            return 0.0f;
        }
        if (p()) {
            m = i() - this.c;
            i = i();
            m2 = m();
        } else {
            m = this.c - m();
            i = i();
            m2 = m();
        }
        return m / (i - m2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C3658bG c3658bG = this.b;
        if (c3658bG == null) {
            return 0L;
        }
        return c3658bG.e();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        k();
        if (this.b == null || !isRunning()) {
            return;
        }
        C3550bC.d("LottieValueAnimator#doFrame");
        long j2 = this.a;
        float s = ((float) (j2 != 0 ? j - j2 : 0L)) / s();
        float f = this.d;
        if (p()) {
            s = -s;
        }
        float f2 = f + s;
        boolean d = C8853eZ.d(f2, m(), i());
        float f3 = this.d;
        float a = C8853eZ.a(f2, m(), i());
        this.d = a;
        if (this.m) {
            a = (float) Math.floor(a);
        }
        this.c = a;
        this.a = j;
        if (!this.m || this.d != f3) {
            b();
        }
        if (!d) {
            if (getRepeatCount() != -1 && this.g >= getRepeatCount()) {
                float m = this.j < 0.0f ? m() : i();
                this.d = m;
                this.c = m;
                q();
                b(p());
            } else {
                a();
                this.g++;
                if (getRepeatMode() == 2) {
                    this.f = !this.f;
                    r();
                } else {
                    float i = p() ? i() : m();
                    this.d = i;
                    this.c = i;
                }
                this.a = j;
            }
        }
        u();
        C3550bC.a("LottieValueAnimator#doFrame");
    }

    private float s() {
        C3658bG c3658bG = this.b;
        if (c3658bG == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c3658bG.f()) / Math.abs(this.j);
    }

    public void a(C3658bG c3658bG) {
        boolean z = this.b == null;
        this.b = c3658bG;
        if (z) {
            a(Math.max(this.h, c3658bG.m()), Math.min(this.i, c3658bG.d()));
        } else {
            a((int) c3658bG.m(), (int) c3658bG.d());
        }
        float f = this.c;
        this.c = 0.0f;
        this.d = 0.0f;
        a((int) f);
        b();
    }

    public void a(float f) {
        if (this.d == f) {
            return;
        }
        float a = C8853eZ.a(f, m(), i());
        this.d = a;
        if (this.m) {
            a = (float) Math.floor(a);
        }
        this.c = a;
        this.a = 0L;
        b();
    }

    public void a(int i) {
        a(i, (int) this.i);
    }

    public void d(float f) {
        a(this.h, f);
    }

    public void a(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        C3658bG c3658bG = this.b;
        float m = c3658bG == null ? -3.4028235E38f : c3658bG.m();
        C3658bG c3658bG2 = this.b;
        float d = c3658bG2 == null ? Float.MAX_VALUE : c3658bG2.d();
        float a = C8853eZ.a(f, m, d);
        float a2 = C8853eZ.a(f2, m, d);
        if (a == this.h && a2 == this.i) {
            return;
        }
        this.h = a;
        this.i = a2;
        a((int) C8853eZ.a(this.c, a, a2));
    }

    public void r() {
        e(-o());
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f) {
            return;
        }
        this.f = false;
        r();
    }

    public void n() {
        this.e = true;
        a(p());
        a((int) (p() ? i() : m()));
        this.a = 0L;
        this.g = 0;
        k();
    }

    public void h() {
        q();
        b(p());
    }

    public void l() {
        q();
        d();
    }

    public void t() {
        this.e = true;
        k();
        this.a = 0L;
        if (p() && g() == m()) {
            a(i());
        } else if (!p() && g() == i()) {
            a(m());
        }
        c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        e();
        q();
    }

    private boolean p() {
        return o() < 0.0f;
    }

    public float m() {
        C3658bG c3658bG = this.b;
        if (c3658bG == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.14748365E9f ? c3658bG.m() : f;
    }

    public float i() {
        C3658bG c3658bG = this.b;
        if (c3658bG == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.14748365E9f ? c3658bG.d() : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC8850eW
    public void e() {
        super.e();
        b(p());
    }

    protected void k() {
        if (isRunning()) {
            c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void q() {
        c(true);
    }

    protected void c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.e = false;
        }
    }

    private void u() {
        if (this.b == null) {
            return;
        }
        float f = this.c;
        float f2 = this.h;
        if (f < f2 || f > this.i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.i), Float.valueOf(f)));
        }
    }
}
