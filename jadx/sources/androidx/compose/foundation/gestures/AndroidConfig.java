package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* loaded from: classes.dex */
final class AndroidConfig implements ScrollConfig {
    public static final AndroidConfig INSTANCE = new AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE  reason: not valid java name */
    public long mo152calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m1126boximpl = Offset.m1126boximpl(Offset.Companion.m1149getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m1126boximpl = Offset.m1126boximpl(Offset.m1142plusMKHz9U(m1126boximpl.m1146unboximpl(), changes.get(i).m1731getScrollDeltaF1C5BW0()));
        }
        return Offset.m1143timestuRUvjQ(m1126boximpl.m1146unboximpl(), -density.mo193toPx0680j_4(Dp.m2492constructorimpl(64)));
    }
}
