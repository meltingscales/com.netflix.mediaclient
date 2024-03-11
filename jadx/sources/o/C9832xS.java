package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: o.xS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9832xS extends Drawable {
    private final RectF a;
    private final int b;
    private final Drawable c;
    private final Path d;

    public C9832xS(Drawable drawable, RectF rectF, int i) {
        C8632dsu.c((Object) drawable, "");
        C8632dsu.c((Object) rectF, "");
        this.c = drawable;
        this.a = rectF;
        this.b = i;
        this.d = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C8632dsu.c((Object) canvas, "");
        canvas.save();
        this.d.reset();
        Path path = this.d;
        RectF rectF = this.a;
        float f = this.b;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.d.close();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.d);
        } else {
            canvas.clipPath(this.d, Region.Op.DIFFERENCE);
        }
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.c.setBounds(i, i2, i3, i4);
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
    public int getOpacity() {
        return this.c.getOpacity();
    }
}
