package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import o.AbstractC5913cN;

/* renamed from: o.cF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5697cF implements InterfaceC7271ct, InterfaceC5724cG, InterfaceC5508cA, AbstractC5913cN.d, InterfaceC7589cz {
    private final AbstractC5913cN<Float, Float> a;
    private final LottieDrawable b;
    private C7483cx c;
    private final boolean d;
    private final AbstractC7877dM e;
    private final C8209dg g;
    private final AbstractC5913cN<Float, Float> h;
    private final String j;
    private final Matrix i = new Matrix();
    private final Path f = new Path();

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.j;
    }

    public C5697cF(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7874dJ c7874dJ) {
        this.b = lottieDrawable;
        this.e = abstractC7877dM;
        this.j = c7874dJ.a();
        this.d = c7874dJ.e();
        AbstractC5913cN<Float, Float> b = c7874dJ.b().b();
        this.a = b;
        abstractC7877dM.c(b);
        b.b(this);
        AbstractC5913cN<Float, Float> b2 = c7874dJ.d().b();
        this.h = b2;
        abstractC7877dM.c(b2);
        b2.b(this);
        C8209dg e = c7874dJ.c().e();
        this.g = e;
        e.d(abstractC7877dM);
        e.e(this);
    }

    @Override // o.InterfaceC5508cA
    public void e(ListIterator<InterfaceC7324cu> listIterator) {
        if (this.c != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.c = new C7483cx(this.b, this.e, "Repeater", this.d, arrayList, null);
    }

    @Override // o.InterfaceC7324cu
    public void e(List<InterfaceC7324cu> list, List<InterfaceC7324cu> list2) {
        this.c.e(list, list2);
    }

    @Override // o.InterfaceC5724cG
    public Path c() {
        Path c = this.c.c();
        this.f.reset();
        float floatValue = this.a.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.i.set(this.g.e(i + floatValue2));
            this.f.addPath(c, this.i);
        }
        return this.f;
    }

    @Override // o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.a.g().floatValue();
        float floatValue2 = this.h.g().floatValue();
        float floatValue3 = this.g.b().g().floatValue() / 100.0f;
        float floatValue4 = this.g.a().g().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.i.set(matrix);
            float f = i2;
            this.i.preConcat(this.g.e(f + floatValue2));
            this.c.b(canvas, this.i, (int) (i * C8853eZ.b(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.c.d(rectF, matrix, z);
    }

    @Override // o.AbstractC5913cN.d
    public void b() {
        this.b.invalidateSelf();
    }

    @Override // o.InterfaceC8395dk
    public void a(C8368dj c8368dj, int i, List<C8368dj> list, C8368dj c8368dj2) {
        C8853eZ.b(c8368dj, i, list, c8368dj2, this);
        for (int i2 = 0; i2 < this.c.d().size(); i2++) {
            InterfaceC7324cu interfaceC7324cu = this.c.d().get(i2);
            if (interfaceC7324cu instanceof InterfaceC7589cz) {
                C8853eZ.b(c8368dj, i, list, c8368dj2, (InterfaceC7589cz) interfaceC7324cu);
            }
        }
    }

    @Override // o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        if (this.g.a(t, c8912ff)) {
            return;
        }
        if (t == InterfaceC6637ch.u) {
            this.a.b((C8912ff<Float>) c8912ff);
        } else if (t == InterfaceC6637ch.w) {
            this.h.b((C8912ff<Float>) c8912ff);
        }
    }
}
