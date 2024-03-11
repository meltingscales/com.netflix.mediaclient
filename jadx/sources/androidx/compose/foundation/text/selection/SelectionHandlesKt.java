package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M  reason: not valid java name */
    public static final long m524getAdjustedCoordinatesk4lQ0M(long j) {
        return OffsetKt.Offset(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j) - 1.0f);
    }

    static {
        float f = 25;
        HandleWidth = Dp.m2492constructorimpl(f);
        HandleHeight = Dp.m2492constructorimpl(f);
    }
}
