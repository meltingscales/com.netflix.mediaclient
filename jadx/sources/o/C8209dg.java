package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import o.AbstractC5913cN;

/* renamed from: o.dg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8209dg {
    private AbstractC5913cN<?, PointF> a;
    private AbstractC5913cN<?, Float> b;
    private AbstractC5913cN<PointF, PointF> c;
    private AbstractC5913cN<Integer, Integer> d;
    private final Matrix e = new Matrix();
    private AbstractC5913cN<Float, Float> f;
    private C6020cR g;
    private AbstractC5913cN<C8913fg, C8913fg> h;
    private final Matrix i;
    private C6020cR j;
    private AbstractC5913cN<?, Float> l;
    private final Matrix m;
    private final Matrix n;

    /* renamed from: o  reason: collision with root package name */
    private final float[] f13838o;

    public AbstractC5913cN<?, Float> a() {
        return this.b;
    }

    public AbstractC5913cN<?, Float> b() {
        return this.l;
    }

    public AbstractC5913cN<?, Integer> e() {
        return this.d;
    }

    public C8209dg(C8746dx c8746dx) {
        this.c = c8746dx.d() == null ? null : c8746dx.d().b();
        this.a = c8746dx.c() == null ? null : c8746dx.c().b();
        this.h = c8746dx.h() == null ? null : c8746dx.h().b();
        this.f = c8746dx.g() == null ? null : c8746dx.g().b();
        C6020cR c6020cR = c8746dx.f() == null ? null : (C6020cR) c8746dx.f().b();
        this.j = c6020cR;
        if (c6020cR != null) {
            this.i = new Matrix();
            this.m = new Matrix();
            this.n = new Matrix();
            this.f13838o = new float[9];
        } else {
            this.i = null;
            this.m = null;
            this.n = null;
            this.f13838o = null;
        }
        this.g = c8746dx.i() == null ? null : (C6020cR) c8746dx.i().b();
        if (c8746dx.b() != null) {
            this.d = c8746dx.b().b();
        }
        if (c8746dx.j() != null) {
            this.l = c8746dx.j().b();
        } else {
            this.l = null;
        }
        if (c8746dx.a() != null) {
            this.b = c8746dx.a().b();
        } else {
            this.b = null;
        }
    }

    public void d(AbstractC7877dM abstractC7877dM) {
        abstractC7877dM.c(this.d);
        abstractC7877dM.c(this.l);
        abstractC7877dM.c(this.b);
        abstractC7877dM.c(this.c);
        abstractC7877dM.c(this.a);
        abstractC7877dM.c(this.h);
        abstractC7877dM.c(this.f);
        abstractC7877dM.c(this.j);
        abstractC7877dM.c(this.g);
    }

    public void e(AbstractC5913cN.d dVar) {
        AbstractC5913cN<Integer, Integer> abstractC5913cN = this.d;
        if (abstractC5913cN != null) {
            abstractC5913cN.b(dVar);
        }
        AbstractC5913cN<?, Float> abstractC5913cN2 = this.l;
        if (abstractC5913cN2 != null) {
            abstractC5913cN2.b(dVar);
        }
        AbstractC5913cN<?, Float> abstractC5913cN3 = this.b;
        if (abstractC5913cN3 != null) {
            abstractC5913cN3.b(dVar);
        }
        AbstractC5913cN<PointF, PointF> abstractC5913cN4 = this.c;
        if (abstractC5913cN4 != null) {
            abstractC5913cN4.b(dVar);
        }
        AbstractC5913cN<?, PointF> abstractC5913cN5 = this.a;
        if (abstractC5913cN5 != null) {
            abstractC5913cN5.b(dVar);
        }
        AbstractC5913cN<C8913fg, C8913fg> abstractC5913cN6 = this.h;
        if (abstractC5913cN6 != null) {
            abstractC5913cN6.b(dVar);
        }
        AbstractC5913cN<Float, Float> abstractC5913cN7 = this.f;
        if (abstractC5913cN7 != null) {
            abstractC5913cN7.b(dVar);
        }
        C6020cR c6020cR = this.j;
        if (c6020cR != null) {
            c6020cR.b(dVar);
        }
        C6020cR c6020cR2 = this.g;
        if (c6020cR2 != null) {
            c6020cR2.b(dVar);
        }
    }

    public void b(float f) {
        AbstractC5913cN<Integer, Integer> abstractC5913cN = this.d;
        if (abstractC5913cN != null) {
            abstractC5913cN.c(f);
        }
        AbstractC5913cN<?, Float> abstractC5913cN2 = this.l;
        if (abstractC5913cN2 != null) {
            abstractC5913cN2.c(f);
        }
        AbstractC5913cN<?, Float> abstractC5913cN3 = this.b;
        if (abstractC5913cN3 != null) {
            abstractC5913cN3.c(f);
        }
        AbstractC5913cN<PointF, PointF> abstractC5913cN4 = this.c;
        if (abstractC5913cN4 != null) {
            abstractC5913cN4.c(f);
        }
        AbstractC5913cN<?, PointF> abstractC5913cN5 = this.a;
        if (abstractC5913cN5 != null) {
            abstractC5913cN5.c(f);
        }
        AbstractC5913cN<C8913fg, C8913fg> abstractC5913cN6 = this.h;
        if (abstractC5913cN6 != null) {
            abstractC5913cN6.c(f);
        }
        AbstractC5913cN<Float, Float> abstractC5913cN7 = this.f;
        if (abstractC5913cN7 != null) {
            abstractC5913cN7.c(f);
        }
        C6020cR c6020cR = this.j;
        if (c6020cR != null) {
            c6020cR.c(f);
        }
        C6020cR c6020cR2 = this.g;
        if (c6020cR2 != null) {
            c6020cR2.c(f);
        }
    }

    public Matrix c() {
        PointF g;
        float h;
        PointF g2;
        this.e.reset();
        AbstractC5913cN<?, PointF> abstractC5913cN = this.a;
        if (abstractC5913cN != null && (g2 = abstractC5913cN.g()) != null) {
            float f = g2.x;
            if (f != 0.0f || g2.y != 0.0f) {
                this.e.preTranslate(f, g2.y);
            }
        }
        AbstractC5913cN<Float, Float> abstractC5913cN2 = this.f;
        if (abstractC5913cN2 != null) {
            if (abstractC5913cN2 instanceof C8156df) {
                h = abstractC5913cN2.g().floatValue();
            } else {
                h = ((C6020cR) abstractC5913cN2).h();
            }
            if (h != 0.0f) {
                this.e.preRotate(h);
            }
        }
        C6020cR c6020cR = this.j;
        if (c6020cR != null) {
            C6020cR c6020cR2 = this.g;
            float cos = c6020cR2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c6020cR2.h()) + 90.0f));
            C6020cR c6020cR3 = this.g;
            float sin = c6020cR3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c6020cR3.h()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(c6020cR.h()));
            d();
            float[] fArr = this.f13838o;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.i.setValues(fArr);
            d();
            float[] fArr2 = this.f13838o;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.m.setValues(fArr2);
            d();
            float[] fArr3 = this.f13838o;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.n.setValues(fArr3);
            this.m.preConcat(this.i);
            this.n.preConcat(this.m);
            this.e.preConcat(this.n);
        }
        AbstractC5913cN<C8913fg, C8913fg> abstractC5913cN3 = this.h;
        if (abstractC5913cN3 != null) {
            C8913fg g3 = abstractC5913cN3.g();
            if (g3.c() != 1.0f || g3.b() != 1.0f) {
                this.e.preScale(g3.c(), g3.b());
            }
        }
        AbstractC5913cN<PointF, PointF> abstractC5913cN4 = this.c;
        if (abstractC5913cN4 != null && (((g = abstractC5913cN4.g()) != null && g.x != 0.0f) || g.y != 0.0f)) {
            this.e.preTranslate(-g.x, -g.y);
        }
        return this.e;
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.f13838o[i] = 0.0f;
        }
    }

    public Matrix e(float f) {
        AbstractC5913cN<?, PointF> abstractC5913cN = this.a;
        PointF g = abstractC5913cN == null ? null : abstractC5913cN.g();
        AbstractC5913cN<C8913fg, C8913fg> abstractC5913cN2 = this.h;
        C8913fg g2 = abstractC5913cN2 == null ? null : abstractC5913cN2.g();
        this.e.reset();
        if (g != null) {
            this.e.preTranslate(g.x * f, g.y * f);
        }
        if (g2 != null) {
            double d = f;
            this.e.preScale((float) Math.pow(g2.c(), d), (float) Math.pow(g2.b(), d));
        }
        AbstractC5913cN<Float, Float> abstractC5913cN3 = this.f;
        if (abstractC5913cN3 != null) {
            float floatValue = abstractC5913cN3.g().floatValue();
            AbstractC5913cN<PointF, PointF> abstractC5913cN4 = this.c;
            PointF g3 = abstractC5913cN4 != null ? abstractC5913cN4.g() : null;
            this.e.preRotate(floatValue * f, g3 == null ? 0.0f : g3.x, g3 != null ? g3.y : 0.0f);
        }
        return this.e;
    }

    public <T> boolean a(T t, C8912ff<T> c8912ff) {
        if (t == InterfaceC6637ch.D) {
            AbstractC5913cN<PointF, PointF> abstractC5913cN = this.c;
            if (abstractC5913cN == null) {
                this.c = new C8156df(c8912ff, new PointF());
                return true;
            }
            abstractC5913cN.b((C8912ff<PointF>) c8912ff);
            return true;
        } else if (t == InterfaceC6637ch.E) {
            AbstractC5913cN<?, PointF> abstractC5913cN2 = this.a;
            if (abstractC5913cN2 == null) {
                this.a = new C8156df(c8912ff, new PointF());
                return true;
            }
            abstractC5913cN2.b((C8912ff<PointF>) c8912ff);
            return true;
        } else {
            if (t == InterfaceC6637ch.I) {
                AbstractC5913cN<?, PointF> abstractC5913cN3 = this.a;
                if (abstractC5913cN3 instanceof C7944db) {
                    ((C7944db) abstractC5913cN3).a(c8912ff);
                    return true;
                }
            }
            if (t == InterfaceC6637ch.H) {
                AbstractC5913cN<?, PointF> abstractC5913cN4 = this.a;
                if (abstractC5913cN4 instanceof C7944db) {
                    ((C7944db) abstractC5913cN4).c((C8912ff<Float>) c8912ff);
                    return true;
                }
            }
            if (t == InterfaceC6637ch.K) {
                AbstractC5913cN<C8913fg, C8913fg> abstractC5913cN5 = this.h;
                if (abstractC5913cN5 == null) {
                    this.h = new C8156df(c8912ff, new C8913fg());
                    return true;
                }
                abstractC5913cN5.b((C8912ff<C8913fg>) c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.f13724J) {
                AbstractC5913cN<Float, Float> abstractC5913cN6 = this.f;
                if (abstractC5913cN6 == null) {
                    this.f = new C8156df(c8912ff, Float.valueOf(0.0f));
                    return true;
                }
                abstractC5913cN6.b((C8912ff<Float>) c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.F) {
                AbstractC5913cN<Integer, Integer> abstractC5913cN7 = this.d;
                if (abstractC5913cN7 == null) {
                    this.d = new C8156df(c8912ff, 100);
                    return true;
                }
                abstractC5913cN7.b((C8912ff<Integer>) c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.L) {
                AbstractC5913cN<?, Float> abstractC5913cN8 = this.l;
                if (abstractC5913cN8 == null) {
                    this.l = new C8156df(c8912ff, Float.valueOf(100.0f));
                    return true;
                }
                abstractC5913cN8.b((C8912ff<Float>) c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.G) {
                AbstractC5913cN<?, Float> abstractC5913cN9 = this.b;
                if (abstractC5913cN9 == null) {
                    this.b = new C8156df(c8912ff, Float.valueOf(100.0f));
                    return true;
                }
                abstractC5913cN9.b((C8912ff<Float>) c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.N) {
                if (this.j == null) {
                    this.j = new C6020cR(Collections.singletonList(new C8910fd(Float.valueOf(0.0f))));
                }
                this.j.b(c8912ff);
                return true;
            } else if (t == InterfaceC6637ch.M) {
                if (this.g == null) {
                    this.g = new C6020cR(Collections.singletonList(new C8910fd(Float.valueOf(0.0f))));
                }
                this.g.b(c8912ff);
                return true;
            } else {
                return false;
            }
        }
    }
}
