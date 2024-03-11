package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.Ref;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
final class FocusablePinnableContainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private boolean isFocused;
    private PinnableContainer.PinnedHandle pinnedHandle;

    private final PinnableContainer retrievePinnableContainer() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new drO<dpR>() { // from class: androidx.compose.foundation.FocusablePinnableContainerNode$retrievePinnableContainer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.d = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }
        });
        return (PinnableContainer) objectRef.d;
    }

    public final void setFocus(boolean z) {
        if (z) {
            PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
            this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.isFocused) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = retrievePinnableContainer != null ? retrievePinnableContainer.pin() : null;
        }
    }
}
