package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {
    private final InterfaceC8612dsa<DragAndDropTransferData, Size, drM<? super DrawScope, dpR>, Boolean> startDrag;
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(new drM<DragAndDropEvent, DragAndDropTarget>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // o.drM
        public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
            return null;
        }
    });
    private final ArraySet<DragAndDropModifierNode> interestedNodes = new ArraySet<>(0, 1, null);
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DragAndDropNode create() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }
    };

    public Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(InterfaceC8612dsa<? super DragAndDropTransferData, ? super Size, ? super drM<? super DrawScope, dpR>, Boolean> interfaceC8612dsa) {
        this.startDrag = interfaceC8612dsa;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                for (DragAndDropModifierNode dragAndDropModifierNode : this.interestedNodes) {
                    dragAndDropModifierNode.onStarted(dragAndDropEvent);
                }
                return acceptDragAndDropTransfer;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 3:
                return this.rootDragAndDropNode.onDrop(dragAndDropEvent);
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode) {
        this.interestedNodes.add(dragAndDropModifierNode);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode) {
        return this.interestedNodes.contains(dragAndDropModifierNode);
    }
}
