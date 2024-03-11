package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5616cC implements InterfaceC7271ct, AbstractC5913cN.d, InterfaceC7589cz {
    private final AbstractC5913cN<Integer, Integer> a;
    private AbstractC5913cN<Float, Float> b;
    float c;
    private AbstractC5913cN<ColorFilter, ColorFilter> d;
    private C5966cP e;
    private final AbstractC5913cN<Integer, Integer> f;
    private final LottieDrawable g;
    private final AbstractC7877dM h;
    private final boolean i;
    private final String j;
    private final List<InterfaceC5724cG> k;
    private final Path l;
    private final Paint m;

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.j;
    }

    public C5616cC(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7876dL c7876dL) {
        Path path = new Path();
        this.l = path;
        this.m = new C7112cq(1);
        this.k = new ArrayList();
        this.h = abstractC7877dM;
        this.j = c7876dL.c();
        this.i = c7876dL.e();
        this.g = lottieDrawable;
        if (abstractC7877dM.c() != null) {
            AbstractC5913cN<Float, Float> b = abstractC7877dM.c().b().b();
            this.b = b;
            b.b(this);
            abstractC7877dM.c(this.b);
        }
        if (abstractC7877dM.d() != null) {
            this.e = new C5966cP(this, abstractC7877dM, abstractC7877dM.d());
        }
        if (c7876dL.b() == null || c7876dL.a() == null) {
            this.a = null;
            this.f = null;
            return;
        }
        path.setFillType(c7876dL.d());
        AbstractC5913cN<Integer, Integer> b2 = c7876dL.b().b();
        this.a = b2;
        b2.b(this);
        abstractC7877dM.c(b2);
        AbstractC5913cN<Integer, Integer> b3 = c7876dL.a().b();
        this.f = b3;
        b3.b(this);
        abstractC7877dM.c(b3);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.g.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC7324cu interfaceC7324cu = list2.get(i);
            if (interfaceC7324cu instanceof InterfaceC5724cG) {
                this.k.add((InterfaceC5724cG) interfaceC7324cu);
            }
        }
    }

    @Override // o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        if (this.i) {
            return;
        }
        C3550bC.d("FillContent#draw");
        this.m.setColor((C8853eZ.a((int) ((((i / 255.0f) * this.f.g().intValue()) / 100.0f) * 255.0f), 0, (int) PrivateKeyType.INVALID) << 24) | (((C5993cQ) this.a).j() & 16777215));
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.d;
        if (abstractC5913cN != null) {
            this.m.setColorFilter(abstractC5913cN.g());
        }
        AbstractC5913cN<Float, Float> abstractC5913cN2 = this.b;
        if (abstractC5913cN2 != null) {
            float floatValue = abstractC5913cN2.g().floatValue();
            if (floatValue == 0.0f) {
                this.m.setMaskFilter(null);
            } else if (floatValue != this.c) {
                this.m.setMaskFilter(this.h.c(floatValue));
            }
            this.c = floatValue;
        }
        C5966cP c5966cP = this.e;
        if (c5966cP != null) {
            c5966cP.e(this.m);
        }
        this.l.reset();
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            this.l.addPath(this.k.get(i2).c(), matrix);
        }
        canvas.drawPath(this.l, this.m);
        C3550bC.a("FillContent#draw");
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.l.reset();
        for (int i = 0; i < this.k.size(); i++) {
            this.l.addPath(this.k.get(i).c(), matrix);
        }
        this.l.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        C5966cP c5966cP;
        C5966cP c5966cP2;
        C5966cP c5966cP3;
        C5966cP c5966cP4;
        C5966cP c5966cP5;
        if (t == InterfaceC6637ch.a) {
            this.a.b((C8912ff<Integer>) c8912ff);
        } else if (t == InterfaceC6637ch.m) {
            this.f.b((C8912ff<Integer>) c8912ff);
        } else if (t == InterfaceC6637ch.b) {
            AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.d;
            if (abstractC5913cN != null) {
                this.h.d(abstractC5913cN);
            }
            if (c8912ff == null) {
                this.d = null;
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.d = c8156df;
            c8156df.b(this);
            this.h.c(this.d);
        } else if (t == InterfaceC6637ch.c) {
            AbstractC5913cN<Float, Float> abstractC5913cN2 = this.b;
            if (abstractC5913cN2 != null) {
                abstractC5913cN2.b((C8912ff<Float>) c8912ff);
                return;
            }
            C8156df c8156df2 = new C8156df(c8912ff);
            this.b = c8156df2;
            c8156df2.b(this);
            this.h.c(this.b);
        } else if (t == InterfaceC6637ch.d && (c5966cP5 = this.e) != null) {
            c5966cP5.c(c8912ff);
        } else if (t == InterfaceC6637ch.f && (c5966cP4 = this.e) != null) {
            c5966cP4.e((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.i && (c5966cP3 = this.e) != null) {
            c5966cP3.b(c8912ff);
        } else if (t == InterfaceC6637ch.g && (c5966cP2 = this.e) != null) {
            c5966cP2.a(c8912ff);
        } else if (t != InterfaceC6637ch.j || (c5966cP = this.e) == null) {
        } else {
            c5966cP.d(c8912ff);
        }
    }
}
