package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m1134equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m1149getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m1134equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m1149getZeroF1C5BW0());
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long m1141minusMKHz9U = Offset.m1141minusMKHz9U(pointerInputChange.m1729getPositionF1C5BW0(), pointerInputChange.m1730getPreviousPositionF1C5BW0());
        return (z || !pointerInputChange.isConsumed()) ? m1141minusMKHz9U : Offset.Companion.m1149getZeroF1C5BW0();
    }

    /* renamed from: isOutOfBounds-O0kMr_c  reason: not valid java name */
    public static final boolean m1700isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j) {
        long m1729getPositionF1C5BW0 = pointerInputChange.m1729getPositionF1C5BW0();
        float m1137getXimpl = Offset.m1137getXimpl(m1729getPositionF1C5BW0);
        float m1138getYimpl = Offset.m1138getYimpl(m1729getPositionF1C5BW0);
        return m1137getXimpl < 0.0f || m1137getXimpl > ((float) IntSize.m2547getWidthimpl(j)) || m1138getYimpl < 0.0f || m1138getYimpl > ((float) IntSize.m2546getHeightimpl(j));
    }

    /* renamed from: isOutOfBounds-jwHxaWs  reason: not valid java name */
    public static final boolean m1701isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        if (!PointerType.m1754equalsimpl0(pointerInputChange.m1732getTypeT8wyACA(), PointerType.Companion.m1761getTouchT8wyACA())) {
            return m1700isOutOfBoundsO0kMr_c(pointerInputChange, j);
        }
        long m1729getPositionF1C5BW0 = pointerInputChange.m1729getPositionF1C5BW0();
        float m1137getXimpl = Offset.m1137getXimpl(m1729getPositionF1C5BW0);
        float m1138getYimpl = Offset.m1138getYimpl(m1729getPositionF1C5BW0);
        return m1137getXimpl < (-Size.m1176getWidthimpl(j2)) || m1137getXimpl > ((float) IntSize.m2547getWidthimpl(j)) + Size.m1176getWidthimpl(j2) || m1138getYimpl < (-Size.m1174getHeightimpl(j2)) || m1138getYimpl > ((float) IntSize.m2546getHeightimpl(j)) + Size.m1174getHeightimpl(j2);
    }
}
