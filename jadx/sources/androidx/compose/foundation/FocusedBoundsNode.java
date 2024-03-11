package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FocusedBoundsNode extends Modifier.Node implements ModifierLocalModifierNode, GlobalPositionAwareModifierNode {
    private boolean isFocused;
    private LayoutCoordinates layoutCoordinates;

    private final drM<LayoutCoordinates, dpR> getObserver() {
        if (isAttached()) {
            return (drM) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    public final void setFocus(boolean z) {
        if (z == this.isFocused) {
            return;
        }
        if (!z) {
            drM<LayoutCoordinates, dpR> observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        } else {
            notifyObserverWhenAttached();
        }
        this.isFocused = z;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
        if (this.isFocused) {
            if (layoutCoordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            drM<LayoutCoordinates, dpR> observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        }
    }

    private final void notifyObserverWhenAttached() {
        drM<LayoutCoordinates, dpR> observer;
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            C8632dsu.d(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (observer = getObserver()) == null) {
                return;
            }
            observer.invoke(this.layoutCoordinates);
        }
    }
}
