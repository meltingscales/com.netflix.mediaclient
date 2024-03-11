package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    private PaddingValues paddingValues;

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public final void setPaddingValues(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public PaddingValuesModifier(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        float f = 0;
        if (Dp.m2491compareTo0680j_4(this.paddingValues.mo249calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m2492constructorimpl(f)) < 0 || Dp.m2491compareTo0680j_4(this.paddingValues.mo251calculateTopPaddingD9Ej5fM(), Dp.m2492constructorimpl(f)) < 0 || Dp.m2491compareTo0680j_4(this.paddingValues.mo250calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m2492constructorimpl(f)) < 0 || Dp.m2491compareTo0680j_4(this.paddingValues.mo248calculateBottomPaddingD9Ej5fM(), Dp.m2492constructorimpl(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo249calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo187roundToPx0680j_4(this.paddingValues.mo250calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.paddingValues.mo251calculateTopPaddingD9Ej5fM()) + measureScope.mo187roundToPx0680j_4(this.paddingValues.mo248calculateBottomPaddingD9Ej5fM());
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.m2488offsetNN6EwU(j, -mo187roundToPx0680j_4, -mo187roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m2486constrainWidthK40F9xA(j, mo1803measureBRTryo0.getWidth() + mo187roundToPx0680j_4), ConstraintsKt.m2485constrainHeightK40F9xA(j, mo1803measureBRTryo0.getHeight() + mo187roundToPx0680j_42), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, measureScope.mo187roundToPx0680j_4(this.getPaddingValues().mo249calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo187roundToPx0680j_4(this.getPaddingValues().mo251calculateTopPaddingD9Ej5fM()), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
