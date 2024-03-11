package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import java.util.LinkedHashMap;
import java.util.Map;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class FocusTransactionManager {
    private boolean ongoingTransaction;
    private final Map<FocusTargetNode, FocusStateImpl> states = new LinkedHashMap();
    private final MutableVector<drO<dpR>> cancellationListener = new MutableVector<>(new drO[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode focusTargetNode) {
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        Map<FocusTargetNode, FocusStateImpl> map = this.states;
        if (focusStateImpl == null) {
            throw new IllegalStateException("requires a non-null focus state".toString());
        }
        map.put(focusTargetNode, focusStateImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitTransaction() {
        for (FocusTargetNode focusTargetNode : this.states.keySet()) {
            focusTargetNode.commitFocusState$ui_release();
        }
        this.states.clear();
        this.ongoingTransaction = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTransaction() {
        MutableVector<drO<dpR>> mutableVector = this.cancellationListener;
        int size = mutableVector.getSize();
        if (size <= 0) {
            this.cancellationListener.clear();
            this.states.clear();
            this.ongoingTransaction = false;
        }
        drO<dpR>[] content = mutableVector.getContent();
        int i = 0;
        do {
            content[i].invoke();
            i++;
        } while (i < size);
        this.cancellationListener.clear();
        this.states.clear();
        this.ongoingTransaction = false;
    }
}
