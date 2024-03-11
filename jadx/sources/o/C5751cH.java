package o;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5751cH implements InterfaceC5724cG, AbstractC5913cN.d, InterfaceC7589cz {
    private final AbstractC5913cN<?, Float> a;
    private final AbstractC5913cN<?, Float> b;
    private final boolean c;
    private final boolean d;
    private boolean e;
    private final AbstractC5913cN<?, Float> g;
    private final String h;
    private final AbstractC5913cN<?, Float> i;
    private final LottieDrawable j;
    private final PolystarShape.Type k;
    private final AbstractC5913cN<?, PointF> l;
    private final AbstractC5913cN<?, Float> m;
    private final AbstractC5913cN<?, Float> n;
    private final Path f = new Path();

    /* renamed from: o  reason: collision with root package name */
    private final C7377cv f13658o = new C7377cv();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.h;
    }

    public C5751cH(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, PolystarShape polystarShape) {
        AbstractC5913cN<Float, Float> abstractC5913cN;
        this.j = lottieDrawable;
        this.h = polystarShape.a();
        PolystarShape.Type h = polystarShape.h();
        this.k = h;
        this.c = polystarShape.j();
        this.d = polystarShape.m();
        AbstractC5913cN<Float, Float> b = polystarShape.f().b();
        this.n = b;
        AbstractC5913cN<PointF, PointF> b2 = polystarShape.g().b();
        this.l = b2;
        AbstractC5913cN<Float, Float> b3 = polystarShape.i().b();
        this.m = b3;
        AbstractC5913cN<Float, Float> b4 = polystarShape.e().b();
        this.i = b4;
        AbstractC5913cN<Float, Float> b5 = polystarShape.b().b();
        this.g = b5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (h == type) {
            this.b = polystarShape.c().b();
            abstractC5913cN = polystarShape.d().b();
        } else {
            abstractC5913cN = null;
            this.b = null;
        }
        this.a = abstractC5913cN;
        abstractC7877dM.c(b);
        abstractC7877dM.c(b2);
        abstractC7877dM.c(b3);
        abstractC7877dM.c(b4);
        abstractC7877dM.c(b5);
        if (h == type) {
            abstractC7877dM.c(this.b);
            abstractC7877dM.c(this.a);
        }
        b.b(this);
        b2.b(this);
        b3.b(this);
        b4.b(this);
        b5.b(this);
        if (h == type) {
            this.b.b(this);
            this.a.b(this);
        }
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        i();
    }

    private void i() {
        this.e = false;
        this.j.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list.get(i);
            if (interfaceC7324cu instanceof C5859cL) {
                C5859cL c5859cL = (C5859cL) interfaceC7324cu;
                if (c5859cL.f() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f13658o.d(c5859cL);
                    c5859cL.d(this);
                }
            }
        }
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        if (this.e) {
            return this.f;
        }
        this.f.reset();
        if (this.c) {
            this.e = true;
            return this.f;
        }
        int i = AnonymousClass1.a[this.k.ordinal()];
        if (i == 1) {
            d();
        } else if (i == 2) {
            a();
        }
        this.f.close();
        this.f13658o.b(this.f);
        this.e = true;
        return this.f;
    }

    /* renamed from: o.cH$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void d() {
        AbstractC5913cN<?, Float> abstractC5913cN;
        int i;
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float floatValue = this.n.g().floatValue();
        double radians = Math.toRadians((this.m == null ? 0.0d : abstractC5913cN.g().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        if (this.d) {
            f10 *= -1.0f;
        }
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = this.i.g().floatValue();
        float floatValue3 = this.b.g().floatValue();
        AbstractC5913cN<?, Float> abstractC5913cN2 = this.a;
        float floatValue4 = abstractC5913cN2 != null ? abstractC5913cN2.g().floatValue() / 100.0f : 0.0f;
        AbstractC5913cN<?, Float> abstractC5913cN3 = this.g;
        float floatValue5 = abstractC5913cN3 != null ? abstractC5913cN3.g().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f4;
            float cos = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.f.moveTo(cos, f3);
            d = radians + ((f10 * f12) / 2.0f);
            f = cos;
            f2 = f11;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f.moveTo(cos2, sin);
            f = cos2;
            f2 = f11;
            d = radians + f2;
            f3 = sin;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f13 = f2;
        float f14 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                float f15 = z ? floatValue2 : floatValue3;
                int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f5 = f10;
                    f6 = f13;
                } else {
                    f5 = f10;
                    f6 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    d2 = d7;
                    f7 = f4;
                    f4 = f15;
                } else {
                    d2 = d7;
                    f7 = f4;
                }
                double d8 = f4;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f.lineTo(cos3, sin2);
                    d3 = d;
                    f8 = floatValue4;
                    f9 = floatValue5;
                } else {
                    f8 = floatValue4;
                    double atan2 = (float) (Math.atan2(f3, f14) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f9 = floatValue5;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f8 : f9;
                    float f17 = z ? f9 : f8;
                    float f18 = (z ? floatValue3 : floatValue2) * f16 * 0.47829f;
                    float f19 = cos4 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? floatValue2 : floatValue3) * f17 * 0.47829f;
                    float f22 = cos5 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d2 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.f.cubicTo(f14 - f19, f3 - f20, cos3 + f22, sin2 + f23, cos3, sin2);
                }
                d = d3 + f6;
                z = !z;
                i3++;
                f14 = cos3;
                f3 = sin2;
                floatValue5 = f9;
                floatValue4 = f8;
                f4 = f7;
                f10 = f5;
                ceil = d9;
            } else {
                PointF g = this.l.g();
                this.f.offset(g.x, g.y);
                this.f.close();
                return;
            }
        }
    }

    private void a() {
        AbstractC5913cN<?, Float> abstractC5913cN;
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.n.g().floatValue());
        double radians = Math.toRadians((this.m == null ? 0.0d : abstractC5913cN.g().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.g.g().floatValue() / 100.0f;
        float floatValue2 = this.i.g().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.f.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF g = this.l.g();
        this.f.offset(g.x, g.y);
        this.f.close();
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        AbstractC5913cN<?, Float> abstractC5913cN;
        AbstractC5913cN<?, Float> abstractC5913cN2;
        if (t == InterfaceC6637ch.q) {
            this.n.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.t) {
            this.m.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.r) {
            this.l.b((C8912ff<PointF>) c8912ff);
        } else if (t == InterfaceC6637ch.f13725o && (abstractC5913cN2 = this.b) != null) {
            abstractC5913cN2.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.s) {
            this.i.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.k && (abstractC5913cN = this.a) != null) {
            abstractC5913cN.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.p) {
            this.g.b((C8912ff<Float>) c8912ff);
        }
    }
}
