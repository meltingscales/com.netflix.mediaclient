package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;

/* renamed from: o.dQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7881dQ extends AbstractC7877dM {
    private AbstractC5913cN<Bitmap, Bitmap> f;
    private AbstractC5913cN<ColorFilter, ColorFilter> h;
    private final C6478ce i;
    private final Rect j;
    private final Rect l;
    private final Paint n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7881dQ(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.n = new C7112cq(3);
        this.l = new Rect();
        this.j = new Rect();
        this.i = lottieDrawable.getLottieImageAssetForId(layer.k());
    }

    @Override // o.AbstractC7877dM
    public void a(Canvas canvas, Matrix matrix, int i) {
        Bitmap i2 = i();
        if (i2 == null || i2.isRecycled() || this.i == null) {
            return;
        }
        float d = C8914fh.d();
        this.n.setAlpha(i);
        AbstractC5913cN<ColorFilter, ColorFilter> abstractC5913cN = this.h;
        if (abstractC5913cN != null) {
            this.n.setColorFilter(abstractC5913cN.g());
        }
        canvas.save();
        canvas.concat(matrix);
        this.l.set(0, 0, i2.getWidth(), i2.getHeight());
        if (this.e.getMaintainOriginalImageBounds()) {
            this.j.set(0, 0, (int) (this.i.c() * d), (int) (this.i.a() * d));
        } else {
            this.j.set(0, 0, (int) (i2.getWidth() * d), (int) (i2.getHeight() * d));
        }
        canvas.drawBitmap(i2, this.l, this.j, this.n);
        canvas.restore();
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        if (this.i != null) {
            float d = C8914fh.d();
            rectF.set(0.0f, 0.0f, this.i.c() * d, this.i.a() * d);
            this.c.mapRect(rectF);
        }
    }

    private Bitmap i() {
        Bitmap g;
        AbstractC5913cN<Bitmap, Bitmap> abstractC5913cN = this.f;
        if (abstractC5913cN == null || (g = abstractC5913cN.g()) == null) {
            Bitmap bitmapForId = this.e.getBitmapForId(this.b.k());
            if (bitmapForId != null) {
                return bitmapForId;
            }
            C6478ce c6478ce = this.i;
            if (c6478ce != null) {
                return c6478ce.b();
            }
            return null;
        }
        return g;
    }

    @Override // o.AbstractC7877dM, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.b) {
            if (c8912ff == null) {
                this.h = null;
            } else {
                this.h = new C8156df(c8912ff);
            }
        } else if (t == InterfaceC6637ch.l) {
            if (c8912ff == null) {
                this.f = null;
            } else {
                this.f = new C8156df(c8912ff);
            }
        }
    }
}
