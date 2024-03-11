package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.GradientType;

/* renamed from: o.cB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5535cB extends AbstractC7059cp {
    private final RectF a;
    private final int d;
    private final boolean f;
    private C8156df g;
    private final LongSparseArray<LinearGradient> h;
    private final AbstractC5913cN<PointF, PointF> i;
    private final AbstractC5913cN<C7670dB, C7670dB> j;
    private final LongSparseArray<RadialGradient> k;
    private final String l;
    private final AbstractC5913cN<PointF, PointF> m;
    private final GradientType n;

    @Override // o.InterfaceC7324cu
    public String e() {
        return this.l;
    }

    public C5535cB(LottieDrawable lottieDrawable, AbstractC7877dM abstractC7877dM, C7832dH c7832dH) {
        super(lottieDrawable, abstractC7877dM, c7832dH.e().e(), c7832dH.g().b(), c7832dH.i(), c7832dH.h(), c7832dH.n(), c7832dH.j(), c7832dH.a());
        this.h = new LongSparseArray<>();
        this.k = new LongSparseArray<>();
        this.a = new RectF();
        this.l = c7832dH.f();
        this.n = c7832dH.d();
        this.f = c7832dH.m();
        this.d = (int) (lottieDrawable.getComposition().e() / 32.0f);
        AbstractC5913cN<C7670dB, C7670dB> b = c7832dH.c().b();
        this.j = b;
        b.b(this);
        abstractC7877dM.c(b);
        AbstractC5913cN<PointF, PointF> b2 = c7832dH.k().b();
        this.m = b2;
        b2.b(this);
        abstractC7877dM.c(b2);
        AbstractC5913cN<PointF, PointF> b3 = c7832dH.b().b();
        this.i = b3;
        b3.b(this);
        abstractC7877dM.c(b3);
    }

    @Override // o.AbstractC7059cp, o.InterfaceC7271ct
    public void b(Canvas canvas, Matrix matrix, int i) {
        Shader c;
        if (this.f) {
            return;
        }
        d(this.a, matrix, false);
        if (this.n == GradientType.LINEAR) {
            c = a();
        } else {
            c = c();
        }
        c.setLocalMatrix(matrix);
        this.b.setShader(c);
        super.b(canvas, matrix, i);
    }

    private LinearGradient a() {
        long d = d();
        LinearGradient linearGradient = this.h.get(d);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF g = this.m.g();
        PointF g2 = this.i.g();
        C7670dB g3 = this.j.g();
        LinearGradient linearGradient2 = new LinearGradient(g.x, g.y, g2.x, g2.y, a(g3.e()), g3.c(), Shader.TileMode.CLAMP);
        this.h.put(d, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient c() {
        float f;
        float f2;
        long d = d();
        RadialGradient radialGradient = this.k.get(d);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF g = this.m.g();
        PointF g2 = this.i.g();
        C7670dB g3 = this.j.g();
        int[] a = a(g3.e());
        float[] c = g3.c();
        RadialGradient radialGradient2 = new RadialGradient(g.x, g.y, (float) Math.hypot(g2.x - f, g2.y - f2), a, c, Shader.TileMode.CLAMP);
        this.k.put(d, radialGradient2);
        return radialGradient2;
    }

    private int d() {
        int round = Math.round(this.m.c() * this.d);
        int round2 = Math.round(this.i.c() * this.d);
        int round3 = Math.round(this.j.c() * this.d);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] a(int[] iArr) {
        C8156df c8156df = this.g;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7059cp, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.n) {
            C8156df c8156df = this.g;
            if (c8156df != null) {
                this.e.d(c8156df);
            }
            if (c8912ff == null) {
                this.g = null;
                return;
            }
            C8156df c8156df2 = new C8156df(c8912ff);
            this.g = c8156df2;
            c8156df2.b(this);
            this.e.c(this.g);
        }
    }
}
