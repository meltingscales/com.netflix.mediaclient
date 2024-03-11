package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {
    private final drM<GraphicsLayerScope, dpR> block;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && C8632dsu.c(this.block, ((BlockGraphicsLayerElement) obj).block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(drM<? super GraphicsLayerScope, dpR> drm) {
        this.block = drm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
