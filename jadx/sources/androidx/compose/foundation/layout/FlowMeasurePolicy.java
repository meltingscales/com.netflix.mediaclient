package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final SizeMode crossAxisSize;
    private final Arrangement.Horizontal horizontalArrangement;
    private final float mainAxisArrangementSpacing;
    private final InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    private final int maxItemsInMainAxis;
    private final InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
    private final InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
    private final InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;
    private final LayoutOrientation orientation;
    private final Arrangement.Vertical verticalArrangement;

    public /* synthetic */ FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f2, int i, C8627dsp c8627dsp) {
        this(layoutOrientation, horizontal, vertical, f, sizeMode, crossAxisAlignment, f2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlowMeasurePolicy) {
            FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
            return this.orientation == flowMeasurePolicy.orientation && C8632dsu.c(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && C8632dsu.c(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m2494equalsimpl0(this.mainAxisArrangementSpacing, flowMeasurePolicy.mainAxisArrangementSpacing) && this.crossAxisSize == flowMeasurePolicy.crossAxisSize && C8632dsu.c(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m2494equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode();
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = horizontal == null ? 0 : horizontal.hashCode();
        Arrangement.Vertical vertical = this.verticalArrangement;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + (vertical != null ? vertical.hashCode() : 0)) * 31) + Dp.m2495hashCodeimpl(this.mainAxisArrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m2495hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis);
    }

    public String toString() {
        return "FlowMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisArrangementSpacing=" + ((Object) Dp.m2496toStringimpl(this.mainAxisArrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m2496toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ')';
    }

    private FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f2, int i) {
        InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> interfaceC8612dsa;
        InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> interfaceC8612dsa2;
        InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer> interfaceC8612dsa3;
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisArrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        this.maxMainAxisIntrinsicItemSize = layoutOrientation == layoutOrientation2 ? new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        } : new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
            @Override // o.InterfaceC8612dsa
            public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        };
        if (layoutOrientation == layoutOrientation2) {
            interfaceC8612dsa = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
                }
            };
        } else {
            interfaceC8612dsa = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
                }
            };
        }
        this.maxCrossAxisIntrinsicItemSize = interfaceC8612dsa;
        if (layoutOrientation == layoutOrientation2) {
            interfaceC8612dsa2 = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            };
        } else {
            interfaceC8612dsa2 = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            };
        }
        this.minCrossAxisIntrinsicItemSize = interfaceC8612dsa2;
        if (layoutOrientation == layoutOrientation2) {
            interfaceC8612dsa3 = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
                }
            };
        } else {
            interfaceC8612dsa3 = new InterfaceC8612dsa<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2
                @Override // o.InterfaceC8612dsa
                public /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                    return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2, int i3) {
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
                }
            };
        }
        this.minMainAxisIntrinsicItemSize = interfaceC8612dsa3;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int mainAxisTotalSize;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return dpR.c;
                }
            }, 4, null);
        }
        final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.mainAxisArrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        final FlowResult m246breakDownItemsw1Onq5I = FlowLayoutKt.m246breakDownItemsw1Onq5I(measureScope, rowColumnMeasurementHelper, this.orientation, OrientationIndependentConstraints.m261constructorimpl(j, this.orientation), this.maxItemsInMainAxis);
        MutableVector<RowColumnMeasureHelperResult> items = m246breakDownItemsw1Onq5I.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = items.getContent()[i].getCrossAxisSize();
        }
        final int[] iArr2 = new int[size];
        int crossAxisTotalSize = m246breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing) * (items.getSize() - 1));
        LayoutOrientation layoutOrientation = this.orientation;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            vertical.arrange(measureScope, crossAxisTotalSize, iArr, iArr2);
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            horizontal.arrange(measureScope, crossAxisTotalSize, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        if (this.orientation == layoutOrientation2) {
            crossAxisTotalSize = m246breakDownItemsw1Onq5I.getMainAxisTotalSize();
            mainAxisTotalSize = crossAxisTotalSize;
        } else {
            mainAxisTotalSize = m246breakDownItemsw1Onq5I.getMainAxisTotalSize();
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m2486constrainWidthK40F9xA(j, crossAxisTotalSize), ConstraintsKt.m2485constrainHeightK40F9xA(j, mainAxisTotalSize), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$measure$6
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
                MutableVector<RowColumnMeasureHelperResult> items2 = FlowResult.this.getItems();
                RowColumnMeasurementHelper rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
                int[] iArr3 = iArr2;
                MeasureScope measureScope2 = measureScope;
                int size2 = items2.getSize();
                if (size2 > 0) {
                    RowColumnMeasureHelperResult[] content = items2.getContent();
                    int i2 = 0;
                    do {
                        rowColumnMeasurementHelper2.placeHelper(placementScope, content[i2], iArr3[i2], measureScope2.getLayoutDirection());
                        i2++;
                    } while (i2 < size2);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i, intrinsicMeasureScope.mo187roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo187roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2, int i3) {
        return FlowLayoutKt.access$minIntrinsicMainAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i, i2, i3, this.maxItemsInMainAxis);
    }

    public final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        return FlowLayoutKt.access$maxIntrinsicMainAxisSize(list, this.maxMainAxisIntrinsicItemSize, i, i2, this.maxItemsInMainAxis);
    }

    public final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int i, int i2, int i3) {
        return FlowLayoutKt.access$intrinsicCrossAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i, i2, i3, this.maxItemsInMainAxis);
    }
}
