package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.Ref;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BoxMeasurePolicy implements MeasurePolicy {
    private final Alignment alignment;
    private final boolean propagateMinConstraints;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxMeasurePolicy) {
            BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
            return C8632dsu.c(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
        }
        return false;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.alignment = alignment;
        this.propagateMinConstraints = z;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(final MeasureScope measureScope, final List<? extends Measurable> list, long j) {
        boolean matchesParentSize;
        boolean matchesParentSize2;
        boolean matchesParentSize3;
        int m2475getMinWidthimpl;
        int m2474getMinHeightimpl;
        Placeable mo1803measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m2475getMinWidthimpl(j), Constraints.m2474getMinHeightimpl(j), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$1
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
        long m2464copyZbe2FdA$default = this.propagateMinConstraints ? j : Constraints.m2464copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            final Measurable measurable = list.get(0);
            matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
            if (!matchesParentSize3) {
                mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(m2464copyZbe2FdA$default);
                m2475getMinWidthimpl = Math.max(Constraints.m2475getMinWidthimpl(j), mo1803measureBRTryo0.getWidth());
                m2474getMinHeightimpl = Math.max(Constraints.m2474getMinHeightimpl(j), mo1803measureBRTryo0.getHeight());
            } else {
                m2475getMinWidthimpl = Constraints.m2475getMinWidthimpl(j);
                m2474getMinHeightimpl = Constraints.m2474getMinHeightimpl(j);
                mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(Constraints.Companion.m2480fixedJhjzzOo(Constraints.m2475getMinWidthimpl(j), Constraints.m2474getMinHeightimpl(j)));
            }
            final int i = m2475getMinWidthimpl;
            final int i2 = m2474getMinHeightimpl;
            final Placeable placeable = mo1803measureBRTryo0;
            return MeasureScope.layout$default(measureScope, i, i2, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$2
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
                    Alignment alignment;
                    Placeable placeable2 = Placeable.this;
                    Measurable measurable2 = measurable;
                    LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                    int i3 = i;
                    int i4 = i2;
                    alignment = this.alignment;
                    BoxKt.placeInBox(placementScope, placeable2, measurable2, layoutDirection, i3, i4, alignment);
                }
            }, 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.b = Constraints.m2475getMinWidthimpl(j);
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.b = Constraints.m2474getMinHeightimpl(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable2 = list.get(i3);
            matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
            if (matchesParentSize2) {
                z = true;
            } else {
                Placeable mo1803measureBRTryo02 = measurable2.mo1803measureBRTryo0(m2464copyZbe2FdA$default);
                placeableArr[i3] = mo1803measureBRTryo02;
                intRef.b = Math.max(intRef.b, mo1803measureBRTryo02.getWidth());
                intRef2.b = Math.max(intRef2.b, mo1803measureBRTryo02.getHeight());
            }
        }
        if (z) {
            int i4 = intRef.b;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = intRef2.b;
            long Constraints = ConstraintsKt.Constraints(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Measurable measurable3 = list.get(i7);
                matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                if (matchesParentSize) {
                    placeableArr[i7] = measurable3.mo1803measureBRTryo0(Constraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, intRef.b, intRef2.b, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$measure$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                Alignment alignment;
                Placeable[] placeableArr2 = placeableArr;
                List<Measurable> list2 = list;
                MeasureScope measureScope2 = measureScope;
                Ref.IntRef intRef3 = intRef;
                Ref.IntRef intRef4 = intRef2;
                BoxMeasurePolicy boxMeasurePolicy = this;
                int length = placeableArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    Placeable placeable2 = placeableArr2[i8];
                    C8632dsu.d(placeable2);
                    LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                    int i10 = intRef3.b;
                    int i11 = intRef4.b;
                    alignment = boxMeasurePolicy.alignment;
                    BoxKt.placeInBox(placementScope, placeable2, list2.get(i9), layoutDirection, i10, i11, alignment);
                    i8++;
                    i9++;
                }
            }
        }, 4, null);
    }
}
