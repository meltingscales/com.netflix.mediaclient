package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.CaptionStyleCompat;

/* renamed from: o.bee  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4445bee extends C4456bep {
    static final float[] a;
    private static double b = 0.7d;
    static ColorMatrixColorFilter d;
    private boolean e;

    static {
        float[] fArr = {0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        a = fArr;
        d = new ColorMatrixColorFilter(fArr);
    }

    public C4445bee(Context context) {
        super(context);
    }

    @Override // androidx.media3.ui.SubtitlePainter
    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        if (cue.bitmap == null) {
            super.draw(cue, new CaptionStyleCompat(a(captionStyleCompat.foregroundColor), a(captionStyleCompat.backgroundColor), a(captionStyleCompat.windowColor), captionStyleCompat.edgeType, captionStyleCompat.edgeColor, captionStyleCompat.typeface), f, f2, f3, canvas, i, i2, i3, i4);
            return;
        }
        if (!this.e) {
            this.bitmapPaint.setColorFilter(d);
            this.e = true;
        }
        super.draw(cue, captionStyleCompat, f, f2, f3, canvas, i, i2, i3, i4);
    }

    public static int a(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        double d2 = b;
        return Color.argb(alpha, (int) (red * d2), (int) (green * d2), (int) (blue * d2));
    }
}
