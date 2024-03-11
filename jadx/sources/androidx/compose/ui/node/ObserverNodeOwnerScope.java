package androidx.compose.ui.node;

import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final drM<ObserverNodeOwnerScope, dpR> OnObserveReadsChanged = new drM<ObserverNodeOwnerScope, dpR>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            invoke2(observerNodeOwnerScope);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.isValidOwnerScope()) {
                observerNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
            }
        }
    };

    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final drM<ObserverNodeOwnerScope, dpR> getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }
    }
}
