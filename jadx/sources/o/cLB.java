package o;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.FloatProperty;
import androidx.core.content.ContextCompat;
import kotlin.LazyThreadSafetyMode;
import o.C1030Lx;
import o.C5855cKw;
import o.cLB;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes4.dex */
public final class cLB extends Drawable {
    public static final d a = new d(null);
    public static final int b = 8;
    private static final PathMeasure d = new PathMeasure();
    private final int c;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final Paint k;
    private final float l;
    private final int m;
    private final float n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f13681o;
    private final Paint p;
    private final Paint q;
    private final InterfaceC8554dpx r;
    private final float s;
    private final Path t;
    private float u;
    private final Path y;

    public static final c a() {
        return a.b();
    }

    public final float c() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public cLB(Context context) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) context, "");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C5855cKw.a.f);
        this.i = dimensionPixelOffset;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(C5855cKw.a.e);
        this.c = dimensionPixelOffset2;
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(C5855cKw.a.a);
        this.g = dimensionPixelOffset3;
        float dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(C5855cKw.a.c);
        this.e = dimensionPixelOffset4;
        float dimensionPixelOffset5 = context.getResources().getDimensionPixelOffset(C5855cKw.a.d);
        this.l = dimensionPixelOffset5;
        float dimensionPixelOffset6 = context.getResources().getDimensionPixelOffset(C5855cKw.a.b);
        this.s = dimensionPixelOffset6;
        int color = ContextCompat.getColor(context, C1030Lx.d.f13374o);
        this.m = color;
        int color2 = ContextCompat.getColor(context, C1030Lx.d.e);
        this.j = color2;
        this.h = dimensionPixelOffset2 / 4;
        this.f = dimensionPixelOffset2;
        float f = dimensionPixelOffset / 2;
        this.n = f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(dimensionPixelOffset5);
        paint.setColor(color);
        this.p = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(3 * dimensionPixelOffset5);
        paint2.setColor(color);
        paint2.setMaskFilter(new BlurMaskFilter(18.0f, BlurMaskFilter.Blur.NORMAL));
        this.f13681o = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(dimensionPixelOffset5);
        paint3.setColor(color2);
        this.k = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(color);
        paint4.setStrokeWidth(dimensionPixelOffset6);
        paint4.setStyle(style);
        this.q = paint4;
        Path path = new Path();
        path.moveTo(f, f);
        float f2 = dimensionPixelOffset3;
        float f3 = f2 + f;
        path.lineTo(f3, f);
        path.moveTo(f, f);
        float f4 = f - f2;
        path.lineTo(f4, f);
        path.moveTo(f, f);
        path.lineTo(f, f3);
        path.moveTo(f, f);
        path.lineTo(f, f4);
        this.t = path;
        Path path2 = new Path();
        float f5 = dimensionPixelOffset2;
        float f6 = f - f5;
        float f7 = f5 + f;
        path2.addRoundRect(new RectF(f6, f6, f7, f7), dimensionPixelOffset4, dimensionPixelOffset4, Path.Direction.CCW);
        this.y = path2;
        b2 = dpB.b(LazyThreadSafetyMode.e, new drO<Float>() { // from class: com.netflix.mediaclient.ui.profiles.AddProfileAnimationDrawable$length$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: d */
            public final Float invoke() {
                PathMeasure pathMeasure;
                Path path3;
                PathMeasure pathMeasure2;
                pathMeasure = cLB.d;
                path3 = cLB.this.y;
                pathMeasure.setPath(path3, false);
                pathMeasure2 = cLB.d;
                return Float.valueOf(pathMeasure2.getLength());
            }
        });
        this.r = b2;
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final c b() {
            return c.d;
        }
    }

    public final void a(float f) {
        float a2;
        a2 = C8657dts.a(f, 0.0f, 1.0f);
        this.u = a2;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final float b() {
        return ((Number) this.r.getValue()).floatValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        double d2;
        C8632dsu.c((Object) canvas, "");
        canvas.drawPath(this.t, this.q);
        canvas.drawPath(this.y, this.k);
        float f = this.u;
        if (f < 0.8f) {
            float f2 = this.h;
            if (f > 0.4f) {
                f = 0.8f - f;
            }
            float f3 = f2 + (f * 2 * this.f);
            int i = 0;
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{0.0f, b() - f3, f3, 0.0f}, (b() * 0.1875f) + (b() * this.u));
            this.p.setPathEffect(dashPathEffect);
            this.f13681o.setPathEffect(dashPathEffect);
            float f4 = this.u;
            double d3 = f4;
            if (d3 < 0.2d) {
                d2 = f4 * ((float) PrivateKeyType.INVALID);
            } else if (d3 <= 0.600000011920929d) {
                if (f4 <= 0.8f) {
                    i = 255;
                }
                this.p.setAlpha(i);
                this.f13681o.setAlpha(i);
                canvas.drawPath(this.y, this.p);
                canvas.drawPath(this.y, this.f13681o);
            } else {
                d2 = (0.8f - f4) * ((float) PrivateKeyType.INVALID);
            }
            i = (int) (d2 / 0.2d);
            this.p.setAlpha(i);
            this.f13681o.setAlpha(i);
            canvas.drawPath(this.y, this.p);
            canvas.drawPath(this.y, this.f13681o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.p.setAlpha(i);
        this.f13681o.setAlpha(i);
        this.q.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.p.setColorFilter(colorFilter);
        this.f13681o.setColorFilter(colorFilter);
        this.q.setColorFilter(colorFilter);
    }

    /* loaded from: classes4.dex */
    public static final class c extends FloatProperty<cLB> {
        public static final c d = new c();

        private c() {
            super("progress");
        }

        @Override // android.util.Property
        /* renamed from: d */
        public Float get(cLB clb) {
            if (clb != null) {
                return Float.valueOf(clb.c());
            }
            return null;
        }

        @Override // android.util.FloatProperty
        /* renamed from: b */
        public void setValue(cLB clb, float f) {
            C8632dsu.c((Object) clb, "");
            clb.a(f);
        }
    }
}
