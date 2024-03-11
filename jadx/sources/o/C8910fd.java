package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: o.fd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8910fd<T> {
    public final Interpolator a;
    public PointF b;
    public PointF c;
    public T d;
    public Float e;
    private final C3658bG f;
    public final float g;
    public final Interpolator h;
    public final Interpolator i;
    public final T j;
    private float k;
    private float l;
    private float m;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private int f13866o;
    private int s;

    public boolean g() {
        return this.a == null && this.i == null && this.h == null;
    }

    public C8910fd(C3658bG c3658bG, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.k = -3987645.8f;
        this.n = -3987645.8f;
        this.s = 784923401;
        this.f13866o = 784923401;
        this.m = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.c = null;
        this.b = null;
        this.f = c3658bG;
        this.j = t;
        this.d = t2;
        this.a = interpolator;
        this.i = null;
        this.h = null;
        this.g = f;
        this.e = f2;
    }

    public C8910fd(C3658bG c3658bG, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.k = -3987645.8f;
        this.n = -3987645.8f;
        this.s = 784923401;
        this.f13866o = 784923401;
        this.m = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.c = null;
        this.b = null;
        this.f = c3658bG;
        this.j = t;
        this.d = t2;
        this.a = null;
        this.i = interpolator;
        this.h = interpolator2;
        this.g = f;
        this.e = f2;
    }

    public C8910fd(C3658bG c3658bG, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.k = -3987645.8f;
        this.n = -3987645.8f;
        this.s = 784923401;
        this.f13866o = 784923401;
        this.m = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.c = null;
        this.b = null;
        this.f = c3658bG;
        this.j = t;
        this.d = t2;
        this.a = interpolator;
        this.i = interpolator2;
        this.h = interpolator3;
        this.g = f;
        this.e = f2;
    }

    public C8910fd(T t) {
        this.k = -3987645.8f;
        this.n = -3987645.8f;
        this.s = 784923401;
        this.f13866o = 784923401;
        this.m = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.c = null;
        this.b = null;
        this.f = null;
        this.j = t;
        this.d = t;
        this.a = null;
        this.i = null;
        this.h = null;
        this.g = Float.MIN_VALUE;
        this.e = Float.valueOf(Float.MAX_VALUE);
    }

    private C8910fd(T t, T t2) {
        this.k = -3987645.8f;
        this.n = -3987645.8f;
        this.s = 784923401;
        this.f13866o = 784923401;
        this.m = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.c = null;
        this.b = null;
        this.f = null;
        this.j = t;
        this.d = t2;
        this.a = null;
        this.i = null;
        this.h = null;
        this.g = Float.MIN_VALUE;
        this.e = Float.valueOf(Float.MAX_VALUE);
    }

    public C8910fd<T> e(T t, T t2) {
        return new C8910fd<>(t, t2);
    }

    public float j() {
        C3658bG c3658bG = this.f;
        if (c3658bG == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - c3658bG.m()) / this.f.b();
        }
        return this.m;
    }

    public float b() {
        if (this.f == null) {
            return 1.0f;
        }
        if (this.l == Float.MIN_VALUE) {
            if (this.e == null) {
                this.l = 1.0f;
            } else {
                this.l = j() + ((this.e.floatValue() - this.g) / this.f.b());
            }
        }
        return this.l;
    }

    public boolean b(float f) {
        return f >= j() && f < b();
    }

    public float i() {
        if (this.k == -3987645.8f) {
            this.k = ((Float) this.j).floatValue();
        }
        return this.k;
    }

    public float c() {
        if (this.n == -3987645.8f) {
            this.n = ((Float) this.d).floatValue();
        }
        return this.n;
    }

    public int h() {
        if (this.s == 784923401) {
            this.s = ((Integer) this.j).intValue();
        }
        return this.s;
    }

    public int d() {
        if (this.f13866o == 784923401) {
            this.f13866o = ((Integer) this.d).intValue();
        }
        return this.f13866o;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.j + ", endValue=" + this.d + ", startFrame=" + this.g + ", endFrame=" + this.e + ", interpolator=" + this.a + '}';
    }
}
