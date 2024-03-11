package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;

/* renamed from: o.cI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5778cI extends AbstractC7059cp {
    private AbstractC5913cN<ColorFilter, ColorFilter> a;
    private final AbstractC5913cN<Integer, Integer> d;
    private final String f;
    private final AbstractC7877dM i;
    private final boolean j;

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.f;
    }

    public C5778cI(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, ShapeStroke shapeStroke) {
        super(lottieDrawable, abstractC7877dM, shapeStroke.d().e(), shapeStroke.b().b(), shapeStroke.i(), shapeStroke.h(), shapeStroke.g(), shapeStroke.c(), shapeStroke.a());
        this.i = abstractC7877dM;
        this.f = shapeStroke.f();
        this.j = shapeStroke.j();
        AbstractC5913cN<Integer, Integer> b = shapeStroke.e().b();
        this.d = b;
        b.b(this);
        abstractC7877dM.c(b);
    }

    @Override // o.AbstractC7059cp, o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        if (this.j) {
            return;
        }
        this.b.setColor(((C5993cQ) this.d).j());
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.a;
        if (abstractC5913cN != null) {
            this.b.setColorFilter(abstractC5913cN.g());
        }
        super.b(canvas, matrix, i);
    }

    @Override // o.AbstractC7059cp, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.v) {
            this.d.b((C8912ff<Integer>) c8912ff);
        } else if (t == InterfaceC6637ch.b) {
            AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.a;
            if (abstractC5913cN != null) {
                this.i.d(abstractC5913cN);
            }
            if (c8912ff == null) {
                this.a = null;
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.a = c8156df;
            c8156df.b(this);
            this.i.c(this.d);
        }
    }
}
