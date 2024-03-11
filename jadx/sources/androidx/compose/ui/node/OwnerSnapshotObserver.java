package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final drM<LayoutNode, dpR> onCommitAffectingLookaheadMeasure = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingMeasure = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingSemantics = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui_release();
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingLayout = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingLayoutModifier = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingLayoutModifierInLookahead = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final drM<LayoutNode, dpR> onCommitAffectingLookahead = new drM<LayoutNode, dpR>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(drM<? super drO<dpR>, dpR> drm) {
        this.observer = new SnapshotStateObserver(drm);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, drO dro, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z, dro);
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, drO<dpR> dro) {
        if (z && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, dro);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, dro);
        }
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, drO dro, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z, dro);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, drO<dpR> dro) {
        if (z && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, dro);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, dro);
        }
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, drO dro, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z, dro);
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, drO<dpR> dro) {
        if (z && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, dro);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, dro);
        }
    }

    public final void observeSemanticsReads$ui_release(LayoutNode layoutNode, drO<dpR> dro) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, dro);
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T t, drM<? super T, dpR> drm, drO<dpR> dro) {
        this.observer.observeReads(t, drm, dro);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new drM<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drM
            public final Boolean invoke(Object obj) {
                C8632dsu.d(obj);
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void clear$ui_release(Object obj) {
        this.observer.clear(obj);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
