package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C8627dsp;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private ChangeList changeList;
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private Stack<Object> pendingDownNodes = new Stack<>();
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void moveReaderToAbsolute(int i) {
        this.writersReaderDelta = i;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    private final SlotReader getReader() {
        return this.composer.getReader$runtime_release();
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z);
    }

    private final void pushSlotTableOperationPreamble(boolean z) {
        realizeOperationLocation(z);
    }

    public final void moveReaderRelativeTo(int i) {
        this.writersReaderDelta += i - getReader().getCurrentGroup();
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final void ensureGroupStarted(Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.realizeOperationLocation(z);
    }

    private final void realizeOperationLocation(boolean z) {
        int parent = z ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (i < 0) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        } else if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.writersReaderDelta = parent;
        }
    }

    public final void remember(RememberObserver rememberObserver) {
        this.changeList.pushRemember(rememberObserver);
    }

    public final void updateValue(Object obj, int i) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(obj, i);
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(Object obj) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(obj);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            if (this.startedGroups.peekOr(-1) == parent) {
                pushSlotTableOperationPreamble$default(this, false, 1, null);
                this.startedGroups.pop();
                this.changeList.pushEndCurrentGroup();
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable);
    }

    public final void insertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, slotTable, fixupList);
    }

    public final void moveCurrentGroup(int i) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(i);
    }

    public final void endCompositionScope(drM<? super Composition, dpR> drm, Composition composition) {
        this.changeList.pushEndCompositionScope(drm, composition);
    }

    public final void useNode(Object obj) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(obj);
    }

    public final <T, V> void updateNode(V v, drX<? super T, ? super V, dpR> drx) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(v, drx);
    }

    public final void removeNode(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + i).toString());
                throw new KotlinNothingValueException();
            } else if (this.removeFrom == i) {
                this.moveCount += i2;
            } else {
                realizeNodeMovementOperations();
                this.removeFrom = i;
                this.moveCount = i2;
            }
        }
    }

    public final void moveNode(int i, int i2, int i3) {
        if (i3 > 0) {
            int i4 = this.moveCount;
            if (i4 > 0 && this.moveFrom == i - i4 && this.moveTo == i2 - i4) {
                this.moveCount = i4 + i3;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = i;
            this.moveTo = i2;
            this.moveCount = i3;
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int i, int i2) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int nodeCount = getReader().isNode(i2) ? 1 : getReader().nodeCount(i2);
        if (nodeCount > 0) {
            removeNode(i, nodeCount);
        }
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int i, int i2) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(i, i2);
    }

    private final void realizeMoveNode(int i, int i2, int i3) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(i, i2, i3);
    }

    public final void moveUp() {
        if (this.pendingDownNodes.isNotEmpty()) {
            this.pendingDownNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    public final void moveDown(Object obj) {
        this.pendingDownNodes.push(obj);
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.isNotEmpty()) {
            this.changeList.pushDowns(this.pendingDownNodes.toArray());
            this.pendingDownNodes.clear();
        }
    }

    public final void sideEffect(drO<dpR> dro) {
        this.changeList.pushSideEffect(dro);
    }

    public final void determineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(intRef, anchor);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        this.changeList.pushCopyNodesToNewAnchorLocation(list, intRef);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.changeList.pushCopySlotTableToAnchorLocation(movableContentState, compositionContext, movableContentStateReference, movableContentStateReference2);
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public final void includeOperationsIn(ChangeList changeList, IntRef intRef) {
        this.changeList.pushExecuteOperationsIn(changeList, intRef);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.isEmpty()) {
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
        throw new KotlinNothingValueException();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
