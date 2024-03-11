package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7536cy implements InterfaceC7271ct, AbstractC5913cN.d, InterfaceC7589cz {
    private final int a;
    private AbstractC5913cN<Float, Float> b;
    private final AbstractC5913cN<C7670dB, C7670dB> c;
    float d;
    private final RectF e;
    private final boolean f;
    private AbstractC5913cN<ColorFilter, ColorFilter> g;
    private C5966cP h;
    private C8156df i;
    private final AbstractC5913cN<PointF, PointF> j;
    private final String k;
    private final LottieDrawable m;
    private final AbstractC7877dM n;

    /* renamed from: o  reason: collision with root package name */
    private final AbstractC5913cN<Integer, Integer> f13787o;
    private final Path q;
    private final AbstractC5913cN<PointF, PointF> r;
    private final Paint s;
    private final List<InterfaceC5724cG> t;
    private final GradientType v;
    private final LongSparseArray<LinearGradient> l = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> p = new LongSparseArray<>();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.k;
    }

    public C7536cy(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM, C7805dG c7805dG) {
        Path path = new Path();
        this.q = path;
        this.s = new C7112cq(1);
        this.e = new RectF();
        this.t = new ArrayList();
        this.d = 0.0f;
        this.n = abstractC7877dM;
        this.k = c7805dG.b();
        this.f = c7805dG.i();
        this.m = lottieDrawable;
        this.v = c7805dG.a();
        path.setFillType(c7805dG.c());
        this.a = (int) (c3658bG.e() / 32.0f);
        AbstractC5913cN<C7670dB, C7670dB> b = c7805dG.d().b();
        this.c = b;
        b.b(this);
        abstractC7877dM.c(b);
        AbstractC5913cN<Integer, Integer> b2 = c7805dG.f().b();
        this.f13787o = b2;
        b2.b(this);
        abstractC7877dM.c(b2);
        AbstractC5913cN<PointF, PointF> b3 = c7805dG.j().b();
        this.r = b3;
        b3.b(this);
        abstractC7877dM.c(b3);
        AbstractC5913cN<PointF, PointF> b4 = c7805dG.e().b();
        this.j = b4;
        b4.b(this);
        abstractC7877dM.c(b4);
        if (abstractC7877dM.c() != null) {
            AbstractC5913cN<Float, Float> b5 = abstractC7877dM.c().b().b();
            this.b = b5;
            b5.b(this);
            abstractC7877dM.c(this.b);
        }
        if (abstractC7877dM.d() != null) {
            this.h = new C5966cP(this, abstractC7877dM, abstractC7877dM.d());
        }
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.m.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list2.get(i);
            if (interfaceC7324cu instanceof InterfaceC5724cG) {
                this.t.add((InterfaceC5724cG) interfaceC7324cu);
            }
        }
    }

    @Override // o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        Shader d;
        if (this.f) {
            return;
        }
        C3550bC.d("GradientFillContent#draw");
        this.q.reset();
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            this.q.addPath(this.t.get(i2).c(), matrix);
        }
        this.q.computeBounds(this.e, false);
        if (this.v == GradientType.LINEAR) {
            d = c();
        } else {
            d = d();
        }
        d.setLocalMatrix(matrix);
        this.s.setShader(d);
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.g;
        if (abstractC5913cN != null) {
            this.s.setColorFilter(abstractC5913cN.g());
        }
        AbstractC5913cN<Float, Float> abstractC5913cN2 = this.b;
        if (abstractC5913cN2 != null) {
            float floatValue = abstractC5913cN2.g().floatValue();
            if (floatValue == 0.0f) {
                this.s.setMaskFilter(null);
            } else if (floatValue != this.d) {
                this.s.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.d = floatValue;
        }
        C5966cP c5966cP = this.h;
        if (c5966cP != null) {
            c5966cP.e(this.s);
        }
        this.s.setAlpha(C8853eZ.a((int) ((((i / 255.0f) * this.f13787o.g().intValue()) / 100.0f) * 255.0f), 0, (int) PrivateKeyType.INVALID));
        canvas.drawPath(this.q, this.s);
        C3550bC.a("GradientFillContent#draw");
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.q.reset();
        for (int i = 0; i < this.t.size(); i++) {
            this.q.addPath(this.t.get(i).c(), matrix);
        }
        this.q.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private LinearGradient c() {
        long a = a();
        LinearGradient linearGradient = this.l.get(a);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF g = this.r.g();
        PointF g2 = this.j.g();
        C7670dB g3 = this.c.g();
        LinearGradient linearGradient2 = new LinearGradient(g.x, g.y, g2.x, g2.y, a(g3.e()), g3.c(), Shader.TileMode.CLAMP);
        this.l.put(a, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient d() {
        long a = a();
        RadialGradient radialGradient = this.p.get(a);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF g = this.r.g();
        PointF g2 = this.j.g();
        C7670dB g3 = this.c.g();
        int[] a2 = a(g3.e());
        float[] c = g3.c();
        float f = g.x;
        float f2 = g.y;
        float hypot = (float) Math.hypot(g2.x - f, g2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, a2, c, Shader.TileMode.CLAMP);
        this.p.put(a, radialGradient2);
        return radialGradient2;
    }

    private int a() {
        int round = Math.round(this.r.c() * this.a);
        int round2 = Math.round(this.j.c() * this.a);
        int round3 = Math.round(this.c.c() * this.a);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] a(int[] iArr) {
        C8156df c8156df = this.i;
        if (c8156df != null) {
            Integer[] numArr = (Integer[]) c8156df.g();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        C5966cP c5966cP;
        C5966cP c5966cP2;
        C5966cP c5966cP3;
        C5966cP c5966cP4;
        C5966cP c5966cP5;
        if (t == InterfaceC6637ch.m) {
            this.f13787o.b((C8912ff<Integer>) c8912ff);
        } else if (t == InterfaceC6637ch.b) {
            AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.g;
            if (abstractC5913cN != null) {
                this.n.d(abstractC5913cN);
            }
            if (c8912ff == null) {
                this.g = null;
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.g = c8156df;
            c8156df.b(this);
            this.n.c(this.g);
        } else if (t == InterfaceC6637ch.n) {
            C8156df c8156df2 = this.i;
            if (c8156df2 != null) {
                this.n.d(c8156df2);
            }
            if (c8912ff == null) {
                this.i = null;
                return;
            }
            this.l.clear();
            this.p.clear();
            C8156df c8156df3 = new C8156df(c8912ff);
            this.i = c8156df3;
            c8156df3.b(this);
            this.n.c(this.i);
        } else if (t == InterfaceC6637ch.c) {
            AbstractC5913cN<Float, Float> abstractC5913cN2 = this.b;
            if (abstractC5913cN2 != null) {
                abstractC5913cN2.b((C8912ff<Float>) c8912ff);
                return;
            }
            C8156df c8156df4 = new C8156df(c8912ff);
            this.b = c8156df4;
            c8156df4.b(this);
            this.n.c(this.b);
        } else if (t == InterfaceC6637ch.d && (c5966cP5 = this.h) != null) {
            c5966cP5.c(c8912ff);
        } else if (t == InterfaceC6637ch.f && (c5966cP4 = this.h) != null) {
            c5966cP4.e((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.i && (c5966cP3 = this.h) != null) {
            c5966cP3.b(c8912ff);
        } else if (t == InterfaceC6637ch.g && (c5966cP2 = this.h) != null) {
            c5966cP2.a(c8912ff);
        } else if (t != InterfaceC6637ch.j || (c5966cP = this.h) == null) {
        } else {
            c5966cP.d(c8912ff);
        }
    }
}
