package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class RowColumnMeasurePolicy implements MeasurePolicy {
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final Arrangement.Horizontal horizontalArrangement;
    private final LayoutOrientation orientation;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, C8627dsp c8627dsp) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RowColumnMeasurePolicy) {
            RowColumnMeasurePolicy rowColumnMeasurePolicy = (RowColumnMeasurePolicy) obj;
            return this.orientation == rowColumnMeasurePolicy.orientation && C8632dsu.c(this.horizontalArrangement, rowColumnMeasurePolicy.horizontalArrangement) && C8632dsu.c(this.verticalArrangement, rowColumnMeasurePolicy.verticalArrangement) && Dp.m2494equalsimpl0(this.arrangementSpacing, rowColumnMeasurePolicy.arrangementSpacing) && this.crossAxisSize == rowColumnMeasurePolicy.crossAxisSize && C8632dsu.c(this.crossAxisAlignment, rowColumnMeasurePolicy.crossAxisAlignment);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode();
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = horizontal == null ? 0 : horizontal.hashCode();
        Arrangement.Vertical vertical = this.verticalArrangement;
        return (((((((((hashCode * 31) + hashCode2) * 31) + (vertical != null ? vertical.hashCode() : 0)) * 31) + Dp.m2495hashCodeimpl(this.arrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode();
    }

    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", arrangementSpacing=" + ((Object) Dp.m2496toStringimpl(this.arrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    private RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int crossAxisSize;
        int mainAxisSize;
        final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.arrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        final RowColumnMeasureHelperResult m285measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m285measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
        if (this.orientation == LayoutOrientation.Horizontal) {
            crossAxisSize = m285measureWithoutPlacing_EkL_Y.getMainAxisSize();
            mainAxisSize = m285measureWithoutPlacing_EkL_Y.getCrossAxisSize();
        } else {
            crossAxisSize = m285measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            mainAxisSize = m285measureWithoutPlacing_EkL_Y.getMainAxisSize();
        }
        return MeasureScope.layout$default(measureScope, crossAxisSize, mainAxisSize, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.RowColumnMeasurePolicy$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                RowColumnMeasurementHelper.this.placeHelper(placementScope, m285measureWithoutPlacing_EkL_Y, 0, measureScope.getLayoutDirection());
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        InterfaceC8612dsa MinIntrinsicWidthMeasureBlock;
        MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.orientation);
        return ((Number) MinIntrinsicWidthMeasureBlock.invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo187roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        InterfaceC8612dsa MinIntrinsicHeightMeasureBlock;
        MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.orientation);
        return ((Number) MinIntrinsicHeightMeasureBlock.invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo187roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        InterfaceC8612dsa MaxIntrinsicWidthMeasureBlock;
        MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.orientation);
        return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo187roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        InterfaceC8612dsa MaxIntrinsicHeightMeasureBlock;
        MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.orientation);
        return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(list, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo187roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }
}
