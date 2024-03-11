package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.dpR;
import o.drM;
import o.dsT;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;
    private State<Integer> heightState;
    private State<Integer> widthState;

    public final void setFraction(float f) {
        this.fraction = f;
    }

    public final void setHeightState(State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f, State<Integer> state, State<Integer> state2) {
        this.fraction = f;
        this.widthState = state;
        this.heightState = state2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        State<Integer> state = this.widthState;
        int e = (state == null || state.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : dsT.e(state.getValue().floatValue() * this.fraction);
        State<Integer> state2 = this.heightState;
        int e2 = (state2 == null || state2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : dsT.e(state2.getValue().floatValue() * this.fraction);
        int m2475getMinWidthimpl = e != Integer.MAX_VALUE ? e : Constraints.m2475getMinWidthimpl(j);
        int m2474getMinHeightimpl = e2 != Integer.MAX_VALUE ? e2 : Constraints.m2474getMinHeightimpl(j);
        if (e == Integer.MAX_VALUE) {
            e = Constraints.m2473getMaxWidthimpl(j);
        }
        if (e2 == Integer.MAX_VALUE) {
            e2 = Constraints.m2472getMaxHeightimpl(j);
        }
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.Constraints(m2475getMinWidthimpl, e, m2474getMinHeightimpl, e2));
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
