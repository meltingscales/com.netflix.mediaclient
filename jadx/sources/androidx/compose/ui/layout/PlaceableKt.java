package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class PlaceableKt {
    private static final drM<GraphicsLayerScope, dpR> DefaultLayerBlock = new drM<GraphicsLayerScope, dpR>() { // from class: androidx.compose.ui.layout.PlaceableKt$DefaultLayerBlock$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return dpR.c;
        }
    };
    private static final long DefaultConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    public static final Placeable.PlacementScope PlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final Placeable.PlacementScope PlacementScope(Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
