package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* renamed from: o.xa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9840xa extends AbstractC9847xh {
    private final Path b;
    private final Paint d;
    public static final a c = new a(null);
    public static final int a = 8;

    public final Paint d() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public C9840xa(Paint paint) {
        C8632dsu.c((Object) paint, "");
        this.d = paint;
        this.b = new Path();
    }

    /* renamed from: o.xa$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Paint a(int i) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setPathEffect(new CornerPathEffect(i));
            return paint;
        }
    }

    @Override // o.AbstractC9847xh
    public void e(boolean z, float f, float f2, float f3, Rect rect, int i) {
        C8632dsu.c((Object) rect, "");
        this.b.reset();
        float width = rect.width() / 2.0f;
        float f4 = f3 - width;
        float f5 = width + f3;
        if (z) {
            float height = rect.height();
            this.b.moveTo(0.0f, height);
            this.b.lineTo(f4, height);
            this.b.lineTo(f3, height - rect.height());
            this.b.lineTo(f5, height);
            this.b.lineTo(f, height);
            this.b.lineTo(f, f2);
            this.b.lineTo(0.0f, f2);
        } else {
            float height2 = f2 - rect.height();
            this.b.moveTo(0.0f, 0.0f);
            this.b.lineTo(f, 0.0f);
            this.b.lineTo(f, height2);
            this.b.lineTo(f5, height2);
            this.b.lineTo(f3, rect.height() + height2);
            this.b.lineTo(f4, height2);
            this.b.lineTo(0.0f, height2);
        }
        this.b.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        canvas.drawPath(this.b, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
