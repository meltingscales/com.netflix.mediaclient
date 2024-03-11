package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, C8627dsp c8627dsp) {
        this(f, f2, f3, f4, z);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m278getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m279getTopD9Ej5fM() {
        return this.top;
    }

    /* renamed from: setBottom-0680j_4  reason: not valid java name */
    public final void m280setBottom0680j_4(float f) {
        this.bottom = f;
    }

    /* renamed from: setEnd-0680j_4  reason: not valid java name */
    public final void m281setEnd0680j_4(float f) {
        this.end = f;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setStart-0680j_4  reason: not valid java name */
    public final void m282setStart0680j_4(float f) {
        this.start = f;
    }

    /* renamed from: setTop-0680j_4  reason: not valid java name */
    public final void m283setTop0680j_4(float f) {
        this.top = f;
    }

    private PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        int mo187roundToPx0680j_4 = measureScope.mo187roundToPx0680j_4(this.start) + measureScope.mo187roundToPx0680j_4(this.end);
        int mo187roundToPx0680j_42 = measureScope.mo187roundToPx0680j_4(this.top) + measureScope.mo187roundToPx0680j_4(this.bottom);
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(ConstraintsKt.m2488offsetNN6EwU(j, -mo187roundToPx0680j_4, -mo187roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m2486constrainWidthK40F9xA(j, mo1803measureBRTryo0.getWidth() + mo187roundToPx0680j_4), ConstraintsKt.m2485constrainHeightK40F9xA(j, mo1803measureBRTryo0.getHeight() + mo187roundToPx0680j_42), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
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
                if (PaddingNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, mo1803measureBRTryo0, measureScope.mo187roundToPx0680j_4(PaddingNode.this.m278getStartD9Ej5fM()), measureScope.mo187roundToPx0680j_4(PaddingNode.this.m279getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, mo1803measureBRTryo0, measureScope.mo187roundToPx0680j_4(PaddingNode.this.m278getStartD9Ej5fM()), measureScope.mo187roundToPx0680j_4(PaddingNode.this.m279getTopD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }
}
