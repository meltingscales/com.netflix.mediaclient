package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private float x;
    private float y;

    public /* synthetic */ OffsetNode(float f, float f2, boolean z, C8627dsp c8627dsp) {
        this(f, f2, z);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM  reason: not valid java name */
    public final float m255getXD9Ej5fM() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM  reason: not valid java name */
    public final float m256getYD9Ej5fM() {
        return this.y;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setX-0680j_4  reason: not valid java name */
    public final void m257setX0680j_4(float f) {
        this.x = f;
    }

    /* renamed from: setY-0680j_4  reason: not valid java name */
    public final void m258setY0680j_4(float f) {
        this.y = f;
    }

    private OffsetNode(float f, float f2, boolean z) {
        this.x = f;
        this.y = f2;
        this.rtlAware = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
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
                if (OffsetNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, mo1803measureBRTryo0, measureScope.mo187roundToPx0680j_4(OffsetNode.this.m255getXD9Ej5fM()), measureScope.mo187roundToPx0680j_4(OffsetNode.this.m256getYD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, mo1803measureBRTryo0, measureScope.mo187roundToPx0680j_4(OffsetNode.this.m255getXD9Ej5fM()), measureScope.mo187roundToPx0680j_4(OffsetNode.this.m256getYD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }
}
