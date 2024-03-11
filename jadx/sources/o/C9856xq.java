package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o.C9840xa;

/* renamed from: o.xq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9856xq extends AbstractC9847xh {
    public static final a b = new a(null);
    public static final int c = 8;
    private final AbstractC9847xh a;
    private final AbstractC9847xh d;
    private final RectF e;

    public /* synthetic */ C9856xq(AbstractC9847xh abstractC9847xh, AbstractC9847xh abstractC9847xh2, RectF rectF, C8627dsp c8627dsp) {
        this(abstractC9847xh, abstractC9847xh2, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    private C9856xq(AbstractC9847xh abstractC9847xh, AbstractC9847xh abstractC9847xh2, RectF rectF) {
        this.d = abstractC9847xh;
        this.a = abstractC9847xh2;
        this.e = rectF;
    }

    /* renamed from: o.xq$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9856xq c(int i, int i2, int i3, RectF rectF) {
            C8632dsu.c((Object) rectF, "");
            C9840xa.a aVar = C9840xa.c;
            Paint a = aVar.a(i3);
            a.setColor(i);
            C9840xa c9840xa = new C9840xa(a);
            Paint a2 = aVar.a(i3);
            a2.setColor(i2);
            return new C9856xq(c9840xa, new C9840xa(a2), rectF, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        canvas.save();
        this.d.draw(canvas);
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh != null) {
            canvas.clipRect(this.e);
            abstractC9847xh.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh == null) {
            return;
        }
        abstractC9847xh.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh == null) {
            return;
        }
        abstractC9847xh.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh != null) {
            abstractC9847xh.setBounds(i, i2, i3, i4);
        }
        this.d.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        C8632dsu.c((Object) rect, "");
        super.setBounds(rect);
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh != null) {
            abstractC9847xh.setBounds(rect);
        }
        this.d.setBounds(rect);
    }

    @Override // o.AbstractC9847xh
    public void e(boolean z, float f, float f2, float f3, Rect rect, int i) {
        C8632dsu.c((Object) rect, "");
        AbstractC9847xh abstractC9847xh = this.a;
        if (abstractC9847xh != null) {
            AbstractC9847xh.c(abstractC9847xh, z, f, f2, f3, rect, 0, 32, null);
        }
        AbstractC9847xh.c(this.d, z, f, f2, f3, rect, 0, 32, null);
    }
}
