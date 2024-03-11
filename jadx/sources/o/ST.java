package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;

/* loaded from: classes3.dex */
public final class ST extends Drawable {
    private static final boolean e = false;
    private boolean a;
    private Drawable c;
    private final TextPaint f;
    private int g;
    private boolean h;
    private int i;
    private Layout.Alignment j;
    private int k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private StaticLayout f13397o;
    private boolean p;
    private int r;
    private CharSequence t;
    public static final c d = new c(null);
    public static final int b = 8;

    public final void a(int i, int i2, int i3, int i4) {
        if (this.n != i || this.k != i2 || this.m != i3 || this.l != i4) {
            this.a = true;
        }
        this.n = i;
        this.k = i2;
        this.m = i3;
        this.l = i4;
    }

    public final void d(int i) {
        if (this.i != i) {
            this.a = true;
        }
        this.i = i;
    }

    public final void d(boolean z) {
        if (this.p != z) {
            this.a = true;
        }
        this.p = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ST(Context context) {
        C8632dsu.c((Object) context, "");
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(C1336Xt.c((Activity) C9737vz.b(context, Activity.class)));
        this.f = textPaint;
        this.i = 3;
        this.a = true;
        this.j = Layout.Alignment.ALIGN_NORMAL;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int height;
        C8632dsu.c((Object) canvas, "");
        if (e) {
            Rect copyBounds = copyBounds();
            C8632dsu.a(copyBounds, "");
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-16776961);
            canvas.drawRect(new Rect(1, 0, copyBounds.width() - 2, copyBounds.height() - 1), paint);
        }
        if (this.a) {
            a();
            this.a = false;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        StaticLayout staticLayout = this.f13397o;
        if (staticLayout != null) {
            int height2 = staticLayout.getHeight();
            float width = (canvas.getWidth() - this.g) / 2;
            if (this.p) {
                height = (copyBounds().height() - height2) / 2;
            } else {
                height = ((canvas.getHeight() - height2) - this.n) - this.m;
            }
            canvas.save();
            canvas.translate(width, height);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    private final void a() {
        StaticLayout staticLayout;
        CharSequence charSequence = this.t;
        int width = (getBounds().width() - this.l) - this.k;
        if (width <= 0 || charSequence == null || TextUtils.isEmpty(charSequence)) {
            this.g = 0;
            staticLayout = null;
        } else {
            this.g = width;
            this.j = this.h ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
            int length = charSequence.length();
            TextPaint textPaint = this.f;
            int i = this.g;
            staticLayout = SK.b(charSequence, 0, length, textPaint, i, this.j, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i, this.i);
        }
        this.f13397o = staticLayout;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f.getAlpha() != i) {
            this.a = true;
        }
        this.f.setAlpha(i);
        Drawable drawable = this.c;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (!C8632dsu.c(this.f.getColorFilter(), colorFilter)) {
            this.a = true;
        }
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        C8632dsu.c((Object) rect, "");
        if (getBounds() != rect) {
            this.a = true;
        }
        super.setBounds(rect);
        Drawable drawable = this.c;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        if (getBounds().left != i || getBounds().top != i2 || getBounds().bottom != i4) {
            this.a = true;
        }
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    public final void b(int i) {
        if (this.f.getColor() != i) {
            this.a = true;
        }
        this.f.setColor(i);
    }

    public final void e(int i) {
        float f = i;
        if (this.f.getTextSize() != f) {
            this.a = true;
        }
        this.f.setTextSize(f);
        this.r = i;
    }

    public final void d(CharSequence charSequence) {
        CharSequence charSequence2 = this.t;
        if (charSequence2 != null && !C8632dsu.c(charSequence2, charSequence)) {
            this.a = true;
        }
        this.t = charSequence;
    }

    public final void b(Context context, int i) {
        C8632dsu.c((Object) context, "");
        this.c = ContextCompat.getDrawable(context, i);
    }
}
