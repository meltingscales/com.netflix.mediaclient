package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class RectHelper_androidKt {
    public static final RectF toAndroidRectF(Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    public static final Rect toComposeRect(android.graphics.Rect rect) {
        return new Rect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
