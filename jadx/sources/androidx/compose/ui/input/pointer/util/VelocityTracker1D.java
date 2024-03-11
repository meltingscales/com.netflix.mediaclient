package androidx.compose.ui.input.pointer.util;

import kotlin.NoWhenBranchMatchedException;
import o.C8564dqg;
import o.C8627dsp;
import o.C8657dts;

/* loaded from: classes.dex */
public final class VelocityTracker1D {
    private int index;
    private final boolean isDataDifferential;
    private final int minSampleSize;
    private final float[] reusableDataPointsArray;
    private final float[] reusableTimeArray;
    private final float[] reusableVelocityCoefficients;
    private final DataPointAtTime[] samples;
    private final Strategy strategy;

    /* loaded from: classes.dex */
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VelocityTracker1D() {
        this(false, null, 3, null);
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        this.isDataDifferential = z;
        this.strategy = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        this.minSampleSize = i2;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z, Strategy strategy, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.index + 1) % 20;
        this.index = i;
        VelocityTrackerKt.set(this.samples, i, j, f);
    }

    public final float calculateVelocity() {
        float calculateImpulseVelocity;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i];
            if (dataPointAtTime3 != null) {
                float time = (float) (dataPointAtTime.getTime() - dataPointAtTime3.getTime());
                float abs = (float) Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = dataPointAtTime3.getDataPoint();
                fArr2[i2] = -time;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime3;
            } else {
                break;
            }
        }
        if (i2 >= this.minSampleSize) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.strategy.ordinal()];
            if (i3 == 1) {
                calculateImpulseVelocity = VelocityTrackerKt.calculateImpulseVelocity(fArr, fArr2, i2, this.isDataDifferential);
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                calculateImpulseVelocity = calculateLeastSquaresVelocity(fArr, fArr2, i2);
            }
            return calculateImpulseVelocity * 1000;
        }
        return 0.0f;
    }

    public final float calculateVelocity(float f) {
        float c;
        float h;
        if (f <= 0.0f) {
            throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f).toString());
        }
        float calculateVelocity = calculateVelocity();
        if (calculateVelocity == 0.0f) {
            return 0.0f;
        }
        if (calculateVelocity > 0.0f) {
            h = C8657dts.h(calculateVelocity, f);
            return h;
        }
        c = C8657dts.c(calculateVelocity, -f);
        return c;
    }

    public final void resetTracking() {
        C8564dqg.c(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    private final float calculateLeastSquaresVelocity(float[] fArr, float[] fArr2, int i) {
        try {
            return VelocityTrackerKt.polyFitLeastSquares(fArr2, fArr, i, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }
}
