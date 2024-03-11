package androidx.compose.ui.semantics;

import o.C8627dsp;
import o.C8632dsu;
import o.C8658dtt;
import o.InterfaceC8650dtl;

/* loaded from: classes.dex */
public final class ProgressBarRangeInfo {
    public static final Companion Companion = new Companion(null);
    private static final ProgressBarRangeInfo Indeterminate;
    private final float current;
    private final InterfaceC8650dtl<Float> range;
    private final int steps;

    public final float getCurrent() {
        return this.current;
    }

    public final InterfaceC8650dtl<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public ProgressBarRangeInfo(float f, InterfaceC8650dtl<Float> interfaceC8650dtl, int i) {
        this.current = f;
        this.range = interfaceC8650dtl;
        this.steps = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public /* synthetic */ ProgressBarRangeInfo(float f, InterfaceC8650dtl interfaceC8650dtl, int i, int i2, C8627dsp c8627dsp) {
        this(f, interfaceC8650dtl, (i2 & 4) != 0 ? 0 : i);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }
    }

    static {
        InterfaceC8650dtl e;
        e = C8658dtt.e(0.0f, 0.0f);
        Indeterminate = new ProgressBarRangeInfo(0.0f, e, 0, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProgressBarRangeInfo) {
            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
            return this.current == progressBarRangeInfo.current && C8632dsu.c(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }
}
