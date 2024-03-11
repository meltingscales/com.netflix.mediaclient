package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7059cp implements AbstractC5913cN.d, InterfaceC7589cz, InterfaceC7271ct {
    private AbstractC5913cN<ColorFilter, ColorFilter> a;
    final Paint b;
    float c;
    private AbstractC5913cN<Float, Float> d;
    protected final AbstractC7877dM e;
    private final List<AbstractC5913cN<?, Float>> f;
    private final float[] g;
    private final LottieDrawable h;
    private C5966cP i;
    private final AbstractC5913cN<?, Float> j;
    private final AbstractC5913cN<?, Integer> k;
    private final AbstractC5913cN<?, Float> r;
    private final PathMeasure l = new PathMeasure();
    private final Path m = new Path();
    private final Path p = new Path();

    /* renamed from: o  reason: collision with root package name */
    private final RectF f13760o = new RectF();
    private final List<a> n = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7059cp(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, Paint.Cap cap, Paint.Join join, float f, C8665du c8665du, C8557dq c8557dq, List<C8557dq> list, C8557dq c8557dq2) {
        C7112cq c7112cq = new C7112cq(1);
        this.b = c7112cq;
        this.c = 0.0f;
        this.h = lottieDrawable;
        this.e = abstractC7877dM;
        c7112cq.setStyle(Paint.Style.STROKE);
        c7112cq.setStrokeCap(cap);
        c7112cq.setStrokeJoin(join);
        c7112cq.setStrokeMiter(f);
        this.k = c8665du.b();
        this.r = c8557dq.b();
        if (c8557dq2 == null) {
            this.j = null;
        } else {
            this.j = c8557dq2.b();
        }
        this.f = new ArrayList(list.size());
        this.g = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f.add(list.get(i).b());
        }
        abstractC7877dM.c(this.k);
        abstractC7877dM.c(this.r);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            abstractC7877dM.c(this.f.get(i2));
        }
        AbstractC5913cN<?, Float> abstractC5913cN = this.j;
        if (abstractC5913cN != null) {
            abstractC7877dM.c(abstractC5913cN);
        }
        this.k.b(this);
        this.r.b(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f.get(i3).b(this);
        }
        AbstractC5913cN<?, Float> abstractC5913cN2 = this.j;
        if (abstractC5913cN2 != null) {
            abstractC5913cN2.b(this);
        }
        if (abstractC7877dM.c() != null) {
            AbstractC5913cN<Float, Float> b = abstractC7877dM.c().b().b();
            this.d = b;
            b.b(this);
            abstractC7877dM.c(this.d);
        }
        if (abstractC7877dM.d() != null) {
            this.i = new C5966cP(this, abstractC7877dM, abstractC7877dM.d());
        }
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.h.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        C5859cL c5859cL = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = list.get(size);
            if (interfaceC7324cu instanceof C5859cL) {
                C5859cL c5859cL2 = (C5859cL) interfaceC7324cu;
                if (c5859cL2.f() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    c5859cL = c5859cL2;
                }
            }
        }
        if (c5859cL != null) {
            c5859cL.d(this);
        }
        a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC7324cu interfaceC7324cu2 = list2.get(size2);
            if (interfaceC7324cu2 instanceof C5859cL) {
                C5859cL c5859cL3 = (C5859cL) interfaceC7324cu2;
                if (c5859cL3.f() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.n.add(aVar);
                    }
                    aVar = new a(c5859cL3);
                    c5859cL3.d(this);
                }
            }
            if (interfaceC7324cu2 instanceof InterfaceC5724cG) {
                if (aVar == null) {
                    aVar = new a(c5859cL);
                }
                aVar.b.add((InterfaceC5724cG) interfaceC7324cu2);
            }
        }
        if (aVar != null) {
            this.n.add(aVar);
        }
    }

    public void b(Canvas canvas, Matrix matrix, int i) {
        C3550bC.d("StrokeContent#draw");
        if (C8914fh.a(matrix)) {
            C3550bC.a("StrokeContent#draw");
            return;
        }
        this.b.setAlpha(C8853eZ.a((int) ((((i / 255.0f) * ((C6131cV) this.k).h()) / 100.0f) * 255.0f), 0, (int) PrivateKeyType.INVALID));
        this.b.setStrokeWidth(((C6020cR) this.r).h() * C8914fh.c(matrix));
        if (this.b.getStrokeWidth() <= 0.0f) {
            C3550bC.a("StrokeContent#draw");
            return;
        }
        b(matrix);
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.a;
        if (abstractC5913cN != null) {
            this.b.setColorFilter(abstractC5913cN.g());
        }
        AbstractC5913cN<Float, Float> abstractC5913cN2 = this.d;
        if (abstractC5913cN2 != null) {
            float floatValue = abstractC5913cN2.g().floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.c) {
                this.b.setMaskFilter(this.e.c(floatValue));
            }
            this.c = floatValue;
        }
        C5966cP c5966cP = this.i;
        if (c5966cP != null) {
            c5966cP.e(this.b);
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            a aVar = this.n.get(i2);
            if (aVar.d != null) {
                c(canvas, aVar, matrix);
            } else {
                C3550bC.d("StrokeContent#buildPath");
                this.m.reset();
                for (int size = aVar.b.size() - 1; size >= 0; size--) {
                    this.m.addPath(((InterfaceC5724cG) aVar.b.get(size)).c(), matrix);
                }
                C3550bC.a("StrokeContent#buildPath");
                C3550bC.d("StrokeContent#drawPath");
                canvas.drawPath(this.m, this.b);
                C3550bC.a("StrokeContent#drawPath");
            }
        }
        C3550bC.a("StrokeContent#draw");
    }

    private void c(Canvas canvas, a aVar, Matrix matrix) {
        C3550bC.d("StrokeContent#applyTrimPath");
        if (aVar.d == null) {
            C3550bC.a("StrokeContent#applyTrimPath");
            return;
        }
        this.m.reset();
        for (int size = aVar.b.size() - 1; size >= 0; size--) {
            this.m.addPath(((InterfaceC5724cG) aVar.b.get(size)).c(), matrix);
        }
        float floatValue = aVar.d.d().g().floatValue() / 100.0f;
        float floatValue2 = aVar.d.a().g().floatValue() / 100.0f;
        float floatValue3 = aVar.d.c().g().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.m, this.b);
            C3550bC.a("StrokeContent#applyTrimPath");
            return;
        }
        this.l.setPath(this.m, false);
        float length = this.l.getLength();
        while (this.l.nextContour()) {
            length += this.l.getLength();
        }
        float f = floatValue3 * length;
        float f2 = (floatValue * length) + f;
        float min = Math.min((floatValue2 * length) + f, (f2 + length) - 1.0f);
        float f3 = 0.0f;
        for (int size2 = aVar.b.size() - 1; size2 >= 0; size2--) {
            this.p.set(((InterfaceC5724cG) aVar.b.get(size2)).c());
            this.p.transform(matrix);
            this.l.setPath(this.p, false);
            float length2 = this.l.getLength();
            if (min > length) {
                float f4 = min - length;
                if (f4 < f3 + length2 && f3 < f4) {
                    C8914fh.d(this.p, f2 > length ? (f2 - length) / length2 : 0.0f, Math.min(f4 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.p, this.b);
                    f3 += length2;
                }
            }
            float f5 = f3 + length2;
            if (f5 >= f2 && f3 <= min) {
                if (f5 <= min && f2 < f3) {
                    canvas.drawPath(this.p, this.b);
                } else {
                    C8914fh.d(this.p, f2 < f3 ? 0.0f : (f2 - f3) / length2, min > f5 ? 1.0f : (min - f3) / length2, 0.0f);
                    canvas.drawPath(this.p, this.b);
                }
            }
            f3 += length2;
        }
        C3550bC.a("StrokeContent#applyTrimPath");
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        C3550bC.d("StrokeContent#getBounds");
        this.m.reset();
        for (int i = 0; i < this.n.size(); i++) {
            a aVar = this.n.get(i);
            for (int i2 = 0; i2 < aVar.b.size(); i2++) {
                this.m.addPath(((InterfaceC5724cG) aVar.b.get(i2)).c(), matrix);
            }
        }
        this.m.computeBounds(this.f13760o, false);
        float h = ((C6020cR) this.r).h();
        RectF rectF2 = this.f13760o;
        float f = h / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f13760o);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C3550bC.a("StrokeContent#getBounds");
    }

    private void b(Matrix matrix) {
        C3550bC.d("StrokeContent#applyDashPattern");
        if (this.f.isEmpty()) {
            C3550bC.a("StrokeContent#applyDashPattern");
            return;
        }
        float c = C8914fh.c(matrix);
        for (int i = 0; i < this.f.size(); i++) {
            this.g[i] = this.f.get(i).g().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.g;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.g;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.g;
            fArr3[i] = fArr3[i] * c;
        }
        AbstractC5913cN<?, Float> abstractC5913cN = this.j;
        this.b.setPathEffect(new DashPathEffect(this.g, abstractC5913cN == null ? 0.0f : c * abstractC5913cN.g().floatValue()));
        C3550bC.a("StrokeContent#applyDashPattern");
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    public <T> void a(T t, C8912ff<T> c8912ff) {
        C5966cP c5966cP;
        C5966cP c5966cP2;
        C5966cP c5966cP3;
        C5966cP c5966cP4;
        C5966cP c5966cP5;
        if (t == InterfaceC6637ch.m) {
            this.k.b((C8912ff<Integer>) c8912ff);
        } else if (t == InterfaceC6637ch.y) {
            this.r.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.b) {
            AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.a;
            if (abstractC5913cN != null) {
                this.e.d(abstractC5913cN);
            }
            if (c8912ff == null) {
                this.a = null;
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.a = c8156df;
            c8156df.b(this);
            this.e.c(this.a);
        } else if (t == InterfaceC6637ch.c) {
            AbstractC5913cN<Float, Float> abstractC5913cN2 = this.d;
            if (abstractC5913cN2 != null) {
                abstractC5913cN2.b((C8912ff<Float>) c8912ff);
                return;
            }
            C8156df c8156df2 = new C8156df(c8912ff);
            this.d = c8156df2;
            c8156df2.b(this);
            this.e.c(this.d);
        } else if (t == InterfaceC6637ch.d && (c5966cP5 = this.i) != null) {
            c5966cP5.c(c8912ff);
        } else if (t == InterfaceC6637ch.f && (c5966cP4 = this.i) != null) {
            c5966cP4.e((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.i && (c5966cP3 = this.i) != null) {
            c5966cP3.b(c8912ff);
        } else if (t == InterfaceC6637ch.g && (c5966cP2 = this.i) != null) {
            c5966cP2.a(c8912ff);
        } else if (t != InterfaceC6637ch.j || (c5966cP = this.i) == null) {
        } else {
            c5966cP.d(c8912ff);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cp$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private final List<InterfaceC5724cG> b;
        private final C5859cL d;

        private a(C5859cL c5859cL) {
            this.b = new ArrayList();
            this.d = c5859cL;
        }
    }
}
