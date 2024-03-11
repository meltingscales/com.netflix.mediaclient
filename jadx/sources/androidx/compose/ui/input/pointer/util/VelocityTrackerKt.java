package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;

/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final MutableState VelocityTrackerAddPointsFix$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i] = new DataPointAtTime(j, f);
            return;
        }
        dataPointAtTime.setTime(j);
        dataPointAtTime.setDataPoint(f);
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (getVelocityTrackerAddPointsFix()) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m1780setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.m1729getPositionF1C5BW0());
            velocityTracker.resetTracking();
        }
        long m1730getPreviousPositionF1C5BW0 = pointerInputChange.m1730getPreviousPositionF1C5BW0();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = historical.get(i);
            long m1141minusMKHz9U = Offset.m1141minusMKHz9U(historicalChange.m1686getPositionF1C5BW0(), m1730getPreviousPositionF1C5BW0);
            long m1686getPositionF1C5BW0 = historicalChange.m1686getPositionF1C5BW0();
            velocityTracker.m1780setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1142plusMKHz9U(velocityTracker.m1779getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), m1141minusMKHz9U));
            velocityTracker.m1777addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.m1779getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            m1730getPreviousPositionF1C5BW0 = m1686getPositionF1C5BW0;
        }
        velocityTracker.m1780setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m1142plusMKHz9U(velocityTracker.m1779getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), Offset.m1141minusMKHz9U(pointerInputChange.m1729getPositionF1C5BW0(), m1730getPreviousPositionF1C5BW0)));
        velocityTracker.m1777addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.m1779getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = historical.get(i);
                velocityTracker.m1777addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m1685getOriginalEventPositionF1C5BW0$ui_release());
            }
            velocityTracker.m1777addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m1728getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp$ui_release() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i, boolean z) {
        float f;
        float f2;
        float f3 = 0.0f;
        if (i < 2) {
            return 0.0f;
        }
        if (i == 2) {
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            if (f4 == f5) {
                return 0.0f;
            }
            if (z) {
                f2 = fArr[0];
            } else {
                f2 = fArr[0] - fArr[1];
            }
            return f2 / (f4 - f5);
        }
        int i2 = i - 1;
        for (int i3 = i2; i3 > 0; i3--) {
            int i4 = i3 - 1;
            if (fArr2[i3] != fArr2[i4]) {
                float signum = Math.signum(f3);
                float sqrt = (float) Math.sqrt(2 * Math.abs(f3));
                if (z) {
                    f = -fArr[i4];
                } else {
                    f = fArr[i3] - fArr[i4];
                }
                float f6 = f / (fArr2[i3] - fArr2[i4]);
                f3 += (f6 - (signum * sqrt)) * Math.abs(f6);
                if (i3 == i2) {
                    f3 *= 0.5f;
                }
            }
        }
        return Math.signum(f3) * ((float) Math.sqrt(2 * Math.abs(f3)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    static {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        VelocityTrackerAddPointsFix$delegate = mutableStateOf$default;
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 >= 1) {
            if (i == 0) {
                throw new IllegalArgumentException("At least one point must be provided");
            }
            if (i3 >= i) {
                i3 = i - 1;
            }
            int i4 = i3 + 1;
            float[][] fArr4 = new float[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                fArr4[i5] = new float[i];
            }
            for (int i6 = 0; i6 < i; i6++) {
                fArr4[0][i6] = 1.0f;
                for (int i7 = 1; i7 < i4; i7++) {
                    fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
                }
            }
            float[][] fArr5 = new float[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                fArr5[i8] = new float[i];
            }
            float[][] fArr6 = new float[i4];
            for (int i9 = 0; i9 < i4; i9++) {
                fArr6[i9] = new float[i4];
            }
            int i10 = 0;
            while (i10 < i4) {
                float[] fArr7 = fArr5[i10];
                float[] fArr8 = fArr4[i10];
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr8[i11];
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    float[] fArr9 = fArr5[i12];
                    float dot = dot(fArr7, fArr9);
                    for (int i13 = 0; i13 < i; i13++) {
                        fArr7[i13] = fArr7[i13] - (fArr9[i13] * dot);
                    }
                }
                float sqrt = (float) Math.sqrt(dot(fArr7, fArr7));
                if (sqrt < 1.0E-6f) {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
                float f = 1.0f / sqrt;
                for (int i14 = 0; i14 < i; i14++) {
                    fArr7[i14] = fArr7[i14] * f;
                }
                float[] fArr10 = fArr6[i10];
                int i15 = 0;
                while (i15 < i4) {
                    fArr10[i15] = i15 < i10 ? 0.0f : dot(fArr7, fArr4[i15]);
                    i15++;
                }
                i10++;
            }
            for (int i16 = i3; -1 < i16; i16--) {
                fArr3[i16] = dot(fArr5[i16], fArr2);
                int i17 = i16 + 1;
                if (i17 <= i3) {
                    int i18 = i3;
                    while (true) {
                        fArr3[i16] = fArr3[i16] - (fArr6[i16][i18] * fArr3[i18]);
                        if (i18 != i17) {
                            i18--;
                        }
                    }
                }
                fArr3[i16] = fArr3[i16] / fArr6[i16][i16];
            }
            return fArr3;
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return ((Boolean) VelocityTrackerAddPointsFix$delegate.getValue()).booleanValue();
    }
}
