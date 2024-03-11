package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import com.netflix.model.leafs.ArtworkColors;
import java.util.Map;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public abstract LookaheadCapablePlaceable getChild();

    public abstract boolean getHasMeasureResult();

    public abstract MeasureResult getMeasureResult$ui_release();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* renamed from: getPosition-nOcc-ac  reason: not valid java name */
    public abstract long mo1892getPositionnOccac();

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    public final boolean isPlacingForAlignment$ui_release() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui_release() {
        return this.isShallowPlacing;
    }

    public abstract void replace$ui_release();

    public final void setPlacingForAlignment$ui_release(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui_release(boolean z) {
        this.isShallowPlacing = z;
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        int m2534getYimpl;
        if (getHasMeasureResult() && (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            if (alignmentLine instanceof VerticalAlignmentLine) {
                m2534getYimpl = IntOffset.m2533getXimpl(m1822getApparentToRealOffsetnOccac());
            } else {
                m2534getYimpl = IntOffset.m2534getYimpl(m1822getApparentToRealOffsetnOccac());
            }
            return calculateAlignmentLine + m2534getYimpl;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui_release = nodeCoordinator.getWrapped$ui_release();
        if (!C8632dsu.c(wrapped$ui_release != null ? wrapped$ui_release.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final drM<? super Placeable.PlacementScope, dpR> drm) {
        if ((i & ArtworkColors.DEFAULT_BACKGROUND_COLOR) == 0 && ((-16777216) & i2) == 0) {
            return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return i;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    drm.invoke(this.getPlacementScope());
                }
            };
        }
        throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
