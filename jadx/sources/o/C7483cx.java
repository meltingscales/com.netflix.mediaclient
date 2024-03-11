package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC5913cN;

/* renamed from: o.cx  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7483cx implements InterfaceC7271ct, InterfaceC5724cG, AbstractC5913cN.d, InterfaceC8395dk {
    private final String a;
    private final Matrix b;
    private final List<InterfaceC7324cu> c;
    private final boolean d;
    private final LottieDrawable e;
    private final RectF f;
    private List<InterfaceC5724cG> g;
    private final Path h;
    private final Paint i;
    private final RectF j;
    private C8209dg k;

    public List<InterfaceC7324cu> d() {
        return this.c;
    }

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.a;
    }

    private static List<InterfaceC7324cu> b(LottieDrawable lottieDrawable, C3658bG c3658bG, AbstractC7877dM abstractC7877dM, List<InterfaceC7697dC> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7324cu b = list.get(i).b(lottieDrawable, c3658bG, abstractC7877dM);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    static C8746dx b(List<InterfaceC7697dC> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC7697dC interfaceC7697dC = list.get(i);
            if (interfaceC7697dC instanceof C8746dx) {
                return (C8746dx) interfaceC7697dC;
            }
        }
        return null;
    }

    public C7483cx(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7879dO c7879dO, C3658bG c3658bG) {
        this(lottieDrawable, abstractC7877dM, c7879dO.d(), c7879dO.a(), b(lottieDrawable, c3658bG, abstractC7877dM, c7879dO.e()), b(c7879dO.e()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7483cx(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, String str, boolean z, List<InterfaceC7324cu> list, C8746dx c8746dx) {
        this.i = new C7112cq();
        this.j = new RectF();
        this.b = new Matrix();
        this.h = new Path();
        this.f = new RectF();
        this.a = str;
        this.e = lottieDrawable;
        this.d = z;
        this.c = list;
        if (c8746dx != null) {
            C8209dg e = c8746dx.e();
            this.k = e;
            e.d(abstractC7877dM);
            this.k.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = list.get(size);
            if (interfaceC7324cu instanceof InterfaceC5508cA) {
                arrayList.add((InterfaceC5508cA) interfaceC7324cu);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC5508cA) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.e.invalidateSelf();
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.c.size());
        arrayList.addAll(list);
        for (int size = this.c.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = this.c.get(size);
            interfaceC7324cu.e(arrayList, this.c.subList(0, size));
            arrayList.add(interfaceC7324cu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<InterfaceC5724cG> a() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.c.size(); i++) {
                InterfaceC7324cu interfaceC7324cu = this.c.get(i);
                if (interfaceC7324cu instanceof InterfaceC5724cG) {
                    this.g.add((InterfaceC5724cG) interfaceC7324cu);
                }
            }
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix i() {
        C8209dg c8209dg = this.k;
        if (c8209dg != null) {
            return c8209dg.c();
        }
        this.b.reset();
        return this.b;
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        this.b.reset();
        C8209dg c8209dg = this.k;
        if (c8209dg != null) {
            this.b.set(c8209dg.c());
        }
        this.h.reset();
        if (this.d) {
            return this.h;
        }
        for (int size = this.c.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = this.c.get(size);
            if (interfaceC7324cu instanceof InterfaceC5724cG) {
                this.h.addPath(((InterfaceC5724cG) interfaceC7324cu).c(), this.b);
            }
        }
        return this.h;
    }

    @Override // o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        if (this.d) {
            return;
        }
        this.b.set(matrix);
        C8209dg c8209dg = this.k;
        if (c8209dg != null) {
            this.b.preConcat(c8209dg.c());
            i = (int) (((((this.k.e() == null ? 100 : this.k.e().g().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.e.isApplyingOpacityToLayersEnabled() && g() && i != 255;
        if (z) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.j, this.b, true);
            this.i.setAlpha(i);
            C8914fh.a(canvas, this.j, this.i);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.c.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = this.c.get(size);
            if (interfaceC7324cu instanceof InterfaceC7271ct) {
                ((InterfaceC7271ct) interfaceC7324cu).b(canvas, this.b, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean g() {
        int i = 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if ((this.c.get(i2) instanceof InterfaceC7271ct) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.b.set(matrix);
        C8209dg c8209dg = this.k;
        if (c8209dg != null) {
            this.b.preConcat(c8209dg.c());
        }
        this.f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.c.size() - 1; size >= 0; size--) {
            InterfaceC7324cu interfaceC7324cu = this.c.get(size);
            if (interfaceC7324cu instanceof InterfaceC7271ct) {
                ((InterfaceC7271ct) interfaceC7324cu).d(this.f, this.b, z);
                rectF.union(this.f);
            }
        }
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        if (c8368dj.e(e(), i) || "__container".equals(e())) {
            if (!"__container".equals(e())) {
                c8368dj2 = c8368dj2.d(e());
                if (c8368dj.a(e(), i)) {
                    list.add(c8368dj2.e(this));
                }
            }
            if (c8368dj.c(e(), i)) {
                int d = c8368dj.d(e(), i);
                for (int i2 = 0; i2 < this.c.size(); i2++) {
                    InterfaceC7324cu interfaceC7324cu = this.c.get(i2);
                    if (interfaceC7324cu instanceof InterfaceC8395dk) {
                        ((InterfaceC8395dk) interfaceC7324cu).a(c8368dj, i + d, list, c8368dj2);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        C8209dg c8209dg = this.k;
        if (c8209dg != null) {
            c8209dg.a(t, c8912ff);
        }
    }
}
