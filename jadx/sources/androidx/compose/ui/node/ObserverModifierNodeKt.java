package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t, drO<dpR> dro) {
        ObserverNodeOwnerScope ownerScope$ui_release = t.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t);
            t.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), dro);
    }
}
