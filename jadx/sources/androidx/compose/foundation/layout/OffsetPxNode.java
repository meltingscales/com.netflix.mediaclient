package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {
    private drM<? super Density, IntOffset> offset;
    private boolean rtlAware;

    public final drM<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void setOffset(drM<? super Density, IntOffset> drm) {
        this.offset = drm;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    public OffsetPxNode(drM<? super Density, IntOffset> drm, boolean z) {
        this.offset = drm;
        this.rtlAware = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1803measureBRTryo0 = measurable.mo1803measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo1803measureBRTryo0.getWidth(), mo1803measureBRTryo0.getHeight(), null, new drM<Placeable.PlacementScope, dpR>() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
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
                long m2537unboximpl = OffsetPxNode.this.getOffset().invoke(measureScope).m2537unboximpl();
                if (OffsetPxNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, mo1803measureBRTryo0, IntOffset.m2533getXimpl(m2537unboximpl), IntOffset.m2534getYimpl(m2537unboximpl), 0.0f, null, 12, null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, mo1803measureBRTryo0, IntOffset.m2533getXimpl(m2537unboximpl), IntOffset.m2534getYimpl(m2537unboximpl), 0.0f, null, 12, null);
                }
            }
        }, 4, null);
    }
}
