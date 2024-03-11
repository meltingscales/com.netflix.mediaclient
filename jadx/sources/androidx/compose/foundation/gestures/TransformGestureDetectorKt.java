package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;

/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long m1729getPositionF1C5BW0 = pointerInputChange2.m1729getPositionF1C5BW0();
                long m1141minusMKHz9U = Offset.m1141minusMKHz9U(pointerInputChange2.m1730getPreviousPositionF1C5BW0(), calculateCentroid2);
                long m1141minusMKHz9U2 = Offset.m1141minusMKHz9U(m1729getPositionF1C5BW0, calculateCentroid);
                float m218anglek4lQ0M = m218anglek4lQ0M(m1141minusMKHz9U2) - m218anglek4lQ0M(m1141minusMKHz9U);
                float m1135getDistanceimpl = Offset.m1135getDistanceimpl(Offset.m1142plusMKHz9U(m1141minusMKHz9U2, m1141minusMKHz9U)) / 2.0f;
                if (m218anglek4lQ0M > 180.0f) {
                    m218anglek4lQ0M -= 360.0f;
                } else if (m218anglek4lQ0M < -180.0f) {
                    m218anglek4lQ0M += 360.0f;
                }
                f2 += m218anglek4lQ0M * m1135getDistanceimpl;
                f += m1135getDistanceimpl;
            }
        }
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    /* renamed from: angle-k-4lQ0M  reason: not valid java name */
    private static final float m218anglek4lQ0M(long j) {
        if (Offset.m1137getXimpl(j) == 0.0f && Offset.m1138getYimpl(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m1137getXimpl(j), Offset.m1138getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        if (Offset.m1134equalsimpl0(calculateCentroid, companion.m1148getUnspecifiedF1C5BW0())) {
            return companion.m1149getZeroF1C5BW0();
        }
        return Offset.m1141minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f = 0.0f;
        if (Offset.m1134equalsimpl0(calculateCentroid, Offset.Companion.m1148getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                f += Offset.m1135getDistanceimpl(Offset.m1141minusMKHz9U(z ? pointerInputChange.m1729getPositionF1C5BW0() : pointerInputChange.m1730getPreviousPositionF1C5BW0(), calculateCentroid));
                i++;
            }
        }
        return f / i;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long m1149getZeroF1C5BW0 = Offset.Companion.m1149getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m1149getZeroF1C5BW0 = Offset.m1142plusMKHz9U(m1149getZeroF1C5BW0, z ? pointerInputChange.m1729getPositionF1C5BW0() : pointerInputChange.m1730getPreviousPositionF1C5BW0());
                i++;
            }
        }
        if (i == 0) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        return Offset.m1132divtuRUvjQ(m1149getZeroF1C5BW0, i);
    }
}
