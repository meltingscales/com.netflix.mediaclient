package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import o.C8627dsp;

/* loaded from: classes.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {
    public /* synthetic */ SiblingsAlignedNode(C8627dsp c8627dsp) {
        this();
    }

    private SiblingsAlignedNode() {
    }

    /* loaded from: classes.dex */
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        private AlignmentLine alignmentLine;

        public final void setAlignmentLine(AlignmentLine alignmentLine) {
            this.alignmentLine = alignmentLine;
        }

        public WithAlignmentLineNode(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        @Override // androidx.compose.ui.node.ParentDataModifierNode
        public Object modifyParentData(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.alignmentLine)));
            return rowColumnParentData;
        }
    }
}
