package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: o.dV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7886dV extends AbstractC7877dM {
    private final Layer f;
    private final Paint h;
    private AbstractC5913cN<ColorFilter, ColorFilter> i;
    private final Path j;
    private final RectF l;

    /* renamed from: o  reason: collision with root package name */
    private final float[] f13816o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7886dV(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.l = new RectF();
        C7112cq c7112cq = new C7112cq();
        this.h = c7112cq;
        this.f13816o = new float[8];
        this.j = new Path();
        this.f = layer;
        c7112cq.setAlpha(0);
        c7112cq.setStyle(Paint.Style.FILL);
        c7112cq.setColor(layer.o());
    }

    @Override // o.AbstractC7877dM
    public void a(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.g.e() == null ? 100 : this.g.e().g().intValue())) / 100.0f) * 255.0f);
        this.h.setAlpha(intValue);
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.i;
        if (abstractC5913cN != null) {
            this.h.setColorFilter(abstractC5913cN.g());
        }
        if (intValue > 0) {
            float[] fArr = this.f13816o;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f.s();
            float[] fArr2 = this.f13816o;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f.s();
            this.f13816o[5] = this.f.p();
            float[] fArr3 = this.f13816o;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f.p();
            matrix.mapPoints(this.f13816o);
            this.j.reset();
            Path path = this.j;
            float[] fArr4 = this.f13816o;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.j;
            float[] fArr5 = this.f13816o;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.j;
            float[] fArr6 = this.f13816o;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.j;
            float[] fArr7 = this.f13816o;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.j;
            float[] fArr8 = this.f13816o;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.j.close();
            canvas.drawPath(this.j, this.h);
        }
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.l.set(0.0f, 0.0f, this.f.s(), this.f.p());
        this.c.mapRect(this.l);
        rectF.set(this.l);
    }

    @Override // o.AbstractC7877dM, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.b) {
            if (c8912ff == null) {
                this.i = null;
            } else {
                this.i = new C8156df(c8912ff);
            }
        }
    }
}
