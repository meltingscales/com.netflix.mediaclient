package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable mo1803measureBRTryo0(long j) {
        int minIntrinsicHeight;
        int minIntrinsicWidth;
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            if (this.minMax == IntrinsicMinMax.Max) {
                minIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m2472getMaxHeightimpl(j));
            } else {
                minIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m2472getMaxHeightimpl(j));
            }
            return new FixedSizeIntrinsicsPlaceable(minIntrinsicWidth, Constraints.m2468getHasBoundedHeightimpl(j) ? Constraints.m2472getMaxHeightimpl(j) : 32767);
        }
        if (this.minMax == IntrinsicMinMax.Max) {
            minIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m2473getMaxWidthimpl(j));
        } else {
            minIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m2473getMaxWidthimpl(j));
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m2469getHasBoundedWidthimpl(j) ? Constraints.m2473getMaxWidthimpl(j) : 32767, minIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return this.measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return this.measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return this.measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return this.measurable.maxIntrinsicHeight(i);
    }
}
