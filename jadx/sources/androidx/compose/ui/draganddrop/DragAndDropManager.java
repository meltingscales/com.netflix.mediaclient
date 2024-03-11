package androidx.compose.ui.draganddrop;

/* loaded from: classes.dex */
public interface DragAndDropManager {
    boolean isInterestedNode(DragAndDropModifierNode dragAndDropModifierNode);

    void registerNodeInterest(DragAndDropModifierNode dragAndDropModifierNode);
}
