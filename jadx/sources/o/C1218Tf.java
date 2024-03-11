package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: o.Tf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1218Tf extends Drawable {
    private static final boolean e = false;
    private int a;
    private boolean c;
    private final Paint f;
    private int g;
    private final int h;
    private final int i;
    private final int j;
    private final a k;
    private final C1333Xq l;
    private final Paint m;
    private final PointF n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13402o;
    private final int p;
    private final int q;
    private float r;
    private boolean s;
    private int t;
    private final int u;
    private final TextPaint v;
    private final int w;
    private final Typeface x;
    private final int y;
    public static final c d = new c(null);
    public static final int b = 8;

    public final void c(int i, int i2, float f, boolean z) {
        this.g = i;
        this.t = i2;
        this.r = f;
        this.s = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C1218Tf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Typeface typeface, int i10, boolean z, int i11, C8627dsp c8627dsp) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, typeface, i10, (i11 & 2048) != 0 ? false : z);
    }

    public C1218Tf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Typeface typeface, int i10, boolean z) {
        this.p = i;
        this.w = i3;
        this.y = i4;
        this.x = typeface;
        this.c = z;
        this.a = i2;
        this.k = new a(0.0f, 0, 3, null);
        float f = i5;
        boolean z2 = e;
        this.q = (int) (f * (z2 ? 2 : 1));
        this.h = (int) (i6 * (z2 ? 2 : 1));
        this.u = (int) (i7 * (z2 ? 2 : 1));
        this.i = (int) (i8 * (z2 ? 2 : 1));
        this.f13402o = i9;
        this.j = Color.alpha(i);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i3);
        textPaint.setTextSize(i4);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        this.v = textPaint;
        Paint paint = new Paint();
        paint.setColor(i);
        float f2 = 1;
        C1332Xp c1332Xp = C1332Xp.b;
        paint.setStrokeWidth((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.m = paint;
        Paint paint2 = new Paint();
        paint2.setColor(this.a);
        paint2.setStrokeWidth((int) TypedValue.applyDimension(1, f2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.f = paint2;
        this.l = C1333Xq.d(i10);
        this.n = new PointF();
    }

    /* renamed from: o.Tf$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CarouselPageIndicatorDrawable");
        }
    }

    public final void e(int i) {
        if (i != this.a) {
            this.a = i;
            this.f.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.Tf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private float a;
        private int b;

        public a() {
            this(0.0f, 0, 3, null);
        }

        public final float a() {
            return this.a;
        }

        public final void a(float f) {
            this.a = f;
        }

        public final int c() {
            return this.b;
        }

        public final void c(int i) {
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.a) * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            float f = this.a;
            int i = this.b;
            return "Dot(radius=" + f + ", alpha=" + i + ")";
        }

        public a(float f, int i) {
            this.a = f;
            this.b = i;
        }

        public /* synthetic */ a(float f, int i, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        String c2;
        C8632dsu.c((Object) canvas, "");
        if (this.s) {
            c2 = this.l.d("current", Integer.valueOf(this.t - this.g)).d("total", Integer.valueOf(this.t)).c();
        } else {
            c2 = this.l.d("current", Integer.valueOf(this.g + 1)).d("total", Integer.valueOf(this.t)).c();
        }
        canvas.drawText(c2, this.s ? this.q : (getBounds().width() - this.v.measureText(c2)) - this.q, this.q + this.y, this.v);
        this.n.x = getBounds().width() / 2.0f;
        this.n.y = (getBounds().height() - (this.h * 2)) - (this.f13402o / 4);
        b(canvas, this.g, this.t, this.n, this.m);
    }

    private final a a(int i, int i2, int i3, boolean z) {
        int i4 = (i == 0 || i == this.t + (-1)) ? this.h : this.u;
        int i5 = this.g;
        int i6 = i5 - i2;
        if (i == i6) {
            if (z) {
                this.k.c((int) (this.j * (1.0f - this.r)));
                this.k.a(i4 * (1.0f - this.r));
            } else {
                this.k.c(this.j);
                this.k.a(i4);
            }
        } else if (i != i5 - (i2 - 1)) {
            int i7 = i5 + i3;
            if (i == i7) {
                if (z) {
                    this.k.c((int) (this.j * this.r));
                    this.k.a(i4 * this.r);
                } else {
                    this.k.c(0);
                    this.k.a(0.0f);
                }
            } else if (i == (i3 - 1) + i5) {
                if (z) {
                    this.k.c(this.j);
                    this.k.a(i4 + ((this.h - i4) * this.r));
                } else {
                    this.k.c(this.j);
                    this.k.a(i4);
                }
            } else if (i < i6 || i > i7) {
                this.k.c(0);
                this.k.a(0.0f);
            } else {
                this.k.c(this.j);
                this.k.a(this.h);
            }
        } else if (z) {
            this.k.c(this.j);
            this.k.a(i4 + ((this.h - i4) * (1.0f - this.r)));
        } else {
            this.k.c(this.j);
            this.k.a(this.h);
        }
        return this.k;
    }

    private final float c(int i, float f) {
        float f2 = 2;
        float f3 = (f * f2) + this.i;
        float f4 = (1 - ((i + 1) / 2)) * f3;
        return i % 2 == 0 ? f4 - (f3 / f2) : f4;
    }

    private final void b(Canvas canvas, PointF pointF, float f, float f2, Paint paint) {
        canvas.drawCircle(pointF.x + f, pointF.y, f2, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.graphics.Canvas r22, int r23, int r24, android.graphics.PointF r25, android.graphics.Paint r26) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1218Tf.b(android.graphics.Canvas, int, int, android.graphics.PointF, android.graphics.Paint):void");
    }
}
