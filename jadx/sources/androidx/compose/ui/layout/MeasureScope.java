package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.netflix.model.leafs.ArtworkColors;
import java.util.Map;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, drM drm, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = dqE.d();
            }
            return measureScope.layout(i, i2, map, drm);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    default MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final drM<? super Placeable.PlacementScope, dpR> drm) {
        if ((i & ArtworkColors.DEFAULT_BACKGROUND_COLOR) == 0 && ((-16777216) & i2) == 0) {
            return new MeasureResult(i, i2, map, this, drm) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                final /* synthetic */ drM<Placeable.PlacementScope, dpR> $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i;
                    this.this$0 = this;
                    this.$placementBlock = drm;
                    this.width = i;
                    this.height = i2;
                    this.alignmentLines = map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    MeasureScope measureScope = this.this$0;
                    if (measureScope instanceof LookaheadCapablePlaceable) {
                        this.$placementBlock.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                    } else {
                        this.$placementBlock.invoke(new SimplePlacementScope(this.$width, measureScope.getLayoutDirection()));
                    }
                }
            };
        }
        throw new IllegalStateException(("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }
}
