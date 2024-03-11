package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.DpSize;
import o.dpR;
import o.drM;
import o.dsT;

/* loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        int width;
        int height;
        j2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize;
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        boolean z = isAttached() && ((Boolean) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentEnforcement())).booleanValue();
        if (z) {
            width = Math.max(mo1803measureBRTryo0.getWidth(), measureScope.mo187roundToPx0680j_4(DpSize.m2519getWidthD9Ej5fM(j2)));
        } else {
            width = mo1803measureBRTryo0.getWidth();
        }
        final int i = width;
        if (z) {
            height = Math.max(mo1803measureBRTryo0.getHeight(), measureScope.mo187roundToPx0680j_4(DpSize.m2518getHeightD9Ej5fM(j2)));
        } else {
            height = mo1803measureBRTryo0.getHeight();
        }
        final int i2 = height;
        return MeasureScope.layout$default(measureScope, i, i2, null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$measure$1
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
                int e;
                int e2;
                e = dsT.e((i - mo1803measureBRTryo0.getWidth()) / 2.0f);
                e2 = dsT.e((i2 - mo1803measureBRTryo0.getHeight()) / 2.0f);
                Placeable.PlacementScope.place$default(placementScope, mo1803measureBRTryo0, e, e2, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
