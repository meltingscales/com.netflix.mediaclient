package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k  reason: not valid java name */
    public static final long m485coerceIn3MmeM6k(long j, Rect rect) {
        float right;
        float bottom;
        if (Offset.m1137getXimpl(j) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m1137getXimpl(j) > rect.getRight() ? rect.getRight() : Offset.m1137getXimpl(j);
        }
        if (Offset.m1138getYimpl(j) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m1138getYimpl(j) > rect.getBottom() ? rect.getBottom() : Offset.m1138getYimpl(j);
        }
        return OffsetKt.Offset(right, bottom);
    }
}
