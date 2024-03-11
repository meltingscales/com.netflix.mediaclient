package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class SC extends Drawable {
    private final Paint a;
    private final Paint d;
    private final float e;
    private float h;
    public static final d c = new d(null);
    public static final int b = 8;

    public SC() {
        this(0, 0, 0.0f, 7, null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SC(int r1, int r2, float r3, int r4, o.C8627dsp r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L14
            o.Xp r1 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Object r1 = o.C1332Xp.b(r1)
            android.content.Context r1 = (android.content.Context) r1
            int r5 = o.C9834xU.c.e
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r5)
        L14:
            r5 = r4 & 2
            if (r5 == 0) goto L28
            o.Xp r2 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r2 = o.C1332Xp.b(r2)
            android.content.Context r2 = (android.content.Context) r2
            int r5 = o.C9834xU.c.j
            int r2 = androidx.core.content.ContextCompat.getColor(r2, r5)
        L28:
            r4 = r4 & 4
            if (r4 == 0) goto L2d
            r3 = 0
        L2d:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SC.<init>(int, int, float, int, o.dsp):void");
    }

    public SC(int i, int i2, float f) {
        this.e = f;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.a = paint2;
        c(i);
        b(i2);
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ProgressDrawable");
        }
    }

    public final void c(int i) {
        this.d.setColor(i);
        invalidateSelf();
    }

    public final void b(int i) {
        this.a.setColor(i);
        invalidateSelf();
    }

    public final void e(float f) {
        this.h = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        float width = (this.h / 100.0f) * canvas.getWidth();
        RectF rectF = new RectF(width, 0.0f, canvas.getWidth(), canvas.getHeight());
        float f = this.e;
        canvas.drawRoundRect(rectF, f, f, this.a);
        RectF rectF2 = new RectF(0.0f, 0.0f, width, canvas.getHeight());
        float f2 = this.e;
        canvas.drawRoundRect(rectF2, f2, f2, this.d);
    }
}
