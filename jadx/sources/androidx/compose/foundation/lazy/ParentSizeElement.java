package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    private final float fraction;
    private final State<Integer> heightState;
    private final String inspectorName;
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f, State state, State state2, String str, int i, C8627dsp c8627dsp) {
        this(f, (i & 2) != 0 ? null : state, (i & 4) != 0 ? null : state2, str);
    }

    public ParentSizeElement(float f, State<Integer> state, State<Integer> state2, String str) {
        this.fraction = f;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ParentSizeNode create() {
        return new ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ParentSizeNode parentSizeNode) {
        parentSizeNode.setFraction(this.fraction);
        parentSizeNode.setWidthState(this.widthState);
        parentSizeNode.setHeightState(this.heightState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentSizeElement) {
            ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
            return this.fraction == parentSizeElement.fraction && C8632dsu.c(this.widthState, parentSizeElement.widthState) && C8632dsu.c(this.heightState, parentSizeElement.heightState);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        State<Integer> state = this.widthState;
        int hashCode = state != null ? state.hashCode() : 0;
        State<Integer> state2 = this.heightState;
        return (((hashCode * 31) + (state2 != null ? state2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }
}
