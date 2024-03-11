package o;

import android.view.animation.Interpolator;

/* renamed from: o.byl  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class animation.InterpolatorC5439byl implements Interpolator {
    private final float a;
    private final Interpolator b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;

    public animation.InterpolatorC5439byl(long j, long j2, long j3, Interpolator interpolator) {
        long d;
        C8632dsu.c((Object) interpolator, "");
        this.e = j;
        this.c = j2;
        this.f = j3;
        this.b = interpolator;
        d = C8657dts.d(j2, j2 - j);
        this.a = (float) d;
        this.d = (float) j;
    }

    public /* synthetic */ animation.InterpolatorC5439byl(long j, long j2, long j3, Interpolator interpolator, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? 0L : j, j2, j3, (i & 8) != 0 ? new C5443byp() : interpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.b.getInterpolation(((f * ((float) this.f)) - this.d) / this.a);
    }
}
