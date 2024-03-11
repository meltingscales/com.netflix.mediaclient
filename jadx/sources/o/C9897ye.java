package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: o.ye  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9897ye extends Drawable {
    private final Drawable c;
    private final int d;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C9897ye(Drawable drawable, int i) {
        C8632dsu.c((Object) drawable, "");
        this.c = drawable;
        this.d = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        int save = canvas.save();
        Path path = new Path();
        RectF rectF = new RectF(getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        float f = this.d;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        canvas.clipPath(path);
        this.c.setBounds(getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        this.c.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.c.setBounds(i, i2, i3, i4);
    }
}
