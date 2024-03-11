package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {
    public static final EmptyMeasurePolicy INSTANCE = new EmptyMeasurePolicy();
    private static final drM<Placeable.PlacementScope, dpR> placementBlock = new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.text.EmptyMeasurePolicy$placementBlock$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope placementScope) {
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return dpR.c;
        }
    };

    private EmptyMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m2473getMaxWidthimpl(j), Constraints.m2472getMaxHeightimpl(j), null, placementBlock, 4, null);
    }
}
