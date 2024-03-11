package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;

/* renamed from: o.wY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9763wY extends AbstractC9847xh {
    public static final d b = new d(null);
    public static final int c = 8;
    private final Paint a;
    private final Path d;
    private final Paint e;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public C9763wY(Paint paint, Paint paint2) {
        C8632dsu.c((Object) paint, "");
        this.a = paint;
        this.e = paint2;
        this.d = new Path();
    }

    public /* synthetic */ C9763wY(Paint paint, Paint paint2, int i, C8627dsp c8627dsp) {
        this(paint, (i & 2) != 0 ? null : paint2);
    }

    /* renamed from: o.wY$e */
    /* loaded from: classes2.dex */
    public interface e {

        /* renamed from: o.wY$e$d */
        /* loaded from: classes2.dex */
        public static final class d implements e {
            private final int c;

            public final int a() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.c == ((d) obj).c;
            }

            public int hashCode() {
                return Integer.hashCode(this.c);
            }

            public String toString() {
                int i = this.c;
                return "Color(color=" + i + ")";
            }

            public d(int i) {
                this.c = i;
            }
        }

        /* renamed from: o.wY$e$b */
        /* loaded from: classes2.dex */
        public static final class b implements e {
            private final Drawable e;

            public final Drawable d() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C8632dsu.c(this.e, ((b) obj).e);
            }

            public int hashCode() {
                return this.e.hashCode();
            }

            public String toString() {
                Drawable drawable = this.e;
                return "Drawable(drawable=" + drawable + ")";
            }

            public b(Drawable drawable) {
                C8632dsu.c((Object) drawable, "");
                this.e = drawable;
            }
        }

        /* renamed from: o.wY$e$c */
        /* loaded from: classes2.dex */
        public static final class c implements e {
            public static final c d = new c();

            private c() {
            }
        }
    }

    /* renamed from: o.wY$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final Paint d(e eVar) {
            C8632dsu.c((Object) eVar, "");
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            if (eVar instanceof e.d) {
                paint.setColor(((e.d) eVar).a());
            } else if (eVar instanceof e.b) {
                Bitmap bitmap$default = DrawableKt.toBitmap$default(((e.b) eVar).d(), 0, 0, null, 7, null);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap$default, tileMode, tileMode));
            } else {
                C8632dsu.c(eVar, e.c.d);
            }
            return paint;
        }

        public final Paint d(int i) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(4.0f);
            paint.setColor(i);
            return paint;
        }
    }

    @Override // o.AbstractC9847xh
    public void e(boolean z, float f, float f2, float f3, Rect rect, int i) {
        C8632dsu.c((Object) rect, "");
        this.d.reset();
        float f4 = i;
        float width = rect.width() / 2.0f;
        float f5 = f3 - width;
        float f6 = width + f3;
        if (z) {
            float height = rect.height();
            Path path = this.d;
            float f7 = height + f4;
            path.moveTo(0.0f, f7);
            path.quadTo(0.0f, height, f4, height);
            path.lineTo(f5, height);
            path.lineTo(f3, height - rect.height());
            path.lineTo(f6, height);
            float f8 = f - f4;
            path.lineTo(f8, height);
            path.quadTo(f, height, f, f7);
            float f9 = f2 - f4;
            path.lineTo(f, f9);
            path.quadTo(f, f2, f8, f2);
            path.lineTo(f4, f2);
            path.quadTo(0.0f, f2, 0.0f, f9);
        } else {
            float height2 = f2 - rect.height();
            Path path2 = this.d;
            float f10 = f4 + 0.0f;
            path2.moveTo(0.0f, f10);
            path2.quadTo(0.0f, 0.0f, f4, 0.0f);
            float f11 = f - f4;
            path2.lineTo(f11, 0.0f);
            path2.quadTo(f, 0.0f, f, f10);
            float f12 = height2 - f4;
            path2.lineTo(f, f12);
            path2.quadTo(f, height2, f11, height2);
            path2.lineTo(f6, height2);
            path2.lineTo(f3, rect.height() + height2);
            path2.lineTo(f5, height2);
            path2.lineTo(f4, height2);
            path2.quadTo(0.0f, height2, 0.0f, f12);
        }
        this.d.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        canvas.drawPath(this.d, this.a);
        Paint paint = this.e;
        if (paint != null) {
            canvas.drawPath(this.d, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
