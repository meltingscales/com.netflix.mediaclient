package o;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: o.xh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9847xh extends Drawable {
    public abstract void e(boolean z, float f, float f2, float f3, Rect rect, int i);

    public static /* synthetic */ void c(AbstractC9847xh abstractC9847xh, boolean z, float f, float f2, float f3, Rect rect, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        abstractC9847xh.e(z, f, f2, f3, rect, i);
    }
}
