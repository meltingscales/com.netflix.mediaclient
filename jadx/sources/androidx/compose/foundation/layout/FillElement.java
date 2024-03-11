package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8627dsp;

/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement<FillNode> {
    public static final Companion Companion = new Companion(null);
    private final Direction direction;
    private final float fraction;
    private final String inspectorName;

    public FillElement(Direction direction, float f, String str) {
        this.direction = direction;
        this.fraction = f;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FillNode fillNode) {
        fillNode.setDirection(this.direction);
        fillNode.setFraction(this.fraction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            FillElement fillElement = (FillElement) obj;
            return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final FillElement width(float f) {
            return new FillElement(Direction.Horizontal, f, "fillMaxWidth");
        }

        public final FillElement height(float f) {
            return new FillElement(Direction.Vertical, f, "fillMaxHeight");
        }

        public final FillElement size(float f) {
            return new FillElement(Direction.Both, f, "fillMaxSize");
        }
    }
}
