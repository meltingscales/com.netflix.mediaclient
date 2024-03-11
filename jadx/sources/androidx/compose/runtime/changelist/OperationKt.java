package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import o.C8576dqs;
import o.dpD;
import o.dpR;

/* loaded from: classes.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < anchorIndex);
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == anchorIndex);
        return currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseMovableGroupAtCurrent(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(126665345, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recordReadOf(Object obj) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                            InvalidationResult invalidationResult;
                            List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> b;
                            ControlledComposition controlledComposition2 = ControlledComposition.this;
                            IdentityArraySet identityArraySet = null;
                            RecomposeScopeOwner recomposeScopeOwner = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                            if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.invalidate(recomposeScopeImpl, obj)) == null) {
                                invalidationResult = InvalidationResult.IGNORED;
                            }
                            if (invalidationResult == InvalidationResult.IGNORED) {
                                MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                                if (obj != null) {
                                    identityArraySet = new IdentityArraySet();
                                    identityArraySet.add(identityArraySet);
                                }
                                b = C8576dqs.b((Collection<? extends Pair>) ((Collection<? extends Object>) invalidations$runtime_release), dpD.a(recomposeScopeImpl, identityArraySet));
                                movableContentStateReference2.setInvalidations$runtime_release(b);
                                return InvalidationResult.SCHEDULED;
                            }
                            return invalidationResult;
                        }
                    });
                    dpR dpr = dpR.c;
                } finally {
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }
}
