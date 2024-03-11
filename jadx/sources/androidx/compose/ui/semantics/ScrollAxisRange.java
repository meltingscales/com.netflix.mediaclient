package androidx.compose.ui.semantics;

import o.drO;

/* loaded from: classes.dex */
public final class ScrollAxisRange {
    private final drO<Float> maxValue;
    private final boolean reverseScrolling;
    private final drO<Float> value;

    public final drO<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final drO<Float> getValue() {
        return this.value;
    }

    public ScrollAxisRange(drO<Float> dro, drO<Float> dro2, boolean z) {
        this.value = dro;
        this.maxValue = dro2;
        this.reverseScrolling = z;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }
}
