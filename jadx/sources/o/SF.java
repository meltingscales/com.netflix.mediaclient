package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public class SF extends Drawable {
    private final float[] a;
    private float b;
    private int c;
    private final Path d;
    private int e;
    private boolean f;
    private final Paint g;
    private float[] h;
    private float i;
    private int j;
    private boolean k;
    private final RectF l;
    private boolean m;
    private final Path n;

    /* renamed from: o  reason: collision with root package name */
    private final float[] f13395o;

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.k;
    }

    public float e() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public SF(int i) {
        this.f13395o = new float[8];
        this.a = new float[8];
        this.g = new Paint(1);
        this.f = false;
        this.b = 0.0f;
        this.i = 0.0f;
        this.c = 0;
        this.m = false;
        this.k = false;
        this.n = new Path();
        this.d = new Path();
        this.j = 0;
        this.l = new RectF();
        this.e = PrivateKeyType.INVALID;
        b(i);
    }

    public SF(float f, int i) {
        this(i);
        e(f);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.g.setColor(C1182Rv.b(this.j, this.e));
        this.g.setStyle(Paint.Style.FILL);
        this.g.setFilterBitmap(c());
        canvas.drawPath(this.n, this.g);
        if (this.b != 0.0f) {
            this.g.setColor(C1182Rv.b(this.c, this.e));
            this.g.setStyle(Paint.Style.STROKE);
            this.g.setStrokeWidth(this.b);
            canvas.drawPath(this.d, this.g);
        }
    }

    public void e(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("radius should be non negative");
        }
        Arrays.fill(this.f13395o, f);
        a();
        invalidateSelf();
    }

    public void b(int i) {
        if (this.j != i) {
            this.j = i;
            invalidateSelf();
        }
    }

    public void a(int i, float f) {
        if (this.c != i) {
            this.c = i;
            invalidateSelf();
        }
        if (this.b != f) {
            this.b = f;
            a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.e) {
            this.e = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C1182Rv.c(C1182Rv.b(this.j, this.e));
    }

    private void a() {
        float[] fArr;
        float[] fArr2;
        this.n.reset();
        this.d.reset();
        this.l.set(getBounds());
        RectF rectF = this.l;
        float f = this.b / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        if (this.f) {
            this.d.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.a;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f13395o[i2] + this.i) - (this.b / 2.0f);
                i2++;
            }
            this.d.addRoundRect(this.l, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.l;
        float f2 = (-this.b) / 2.0f;
        rectF2.inset(f2, f2);
        float f3 = this.i + (this.m ? this.b : 0.0f);
        this.l.inset(f3, f3);
        if (this.f) {
            this.n.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
        } else if (this.m) {
            if (this.h == null) {
                this.h = new float[8];
            }
            while (true) {
                fArr2 = this.h;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f13395o[i] - this.b;
                i++;
            }
            this.n.addRoundRect(this.l, fArr2, Path.Direction.CW);
        } else {
            this.n.addRoundRect(this.l, this.f13395o, Path.Direction.CW);
        }
        float f4 = -f3;
        this.l.inset(f4, f4);
    }
}
