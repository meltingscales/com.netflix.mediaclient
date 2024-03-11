package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import o.dpR;

/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private final MutableState _parentPinnableContainer$delegate;
    private final Object key;
    private final MutableState parentHandle$delegate;
    private final LazyLayoutPinnedItemList pinnedItemList;
    private final MutableIntState index$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final MutableIntState pinsCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.key;
    }

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentHandle$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._parentPinnableContainer$delegate = mutableStateOf$default2;
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void setParentPinnableContainer(PinnableContainer pinnableContainer) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            if (pinnableContainer != get_parentPinnableContainer()) {
                set_parentPinnableContainer(pinnableContainer);
                if (getPinsCount() > 0) {
                    PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                    if (parentHandle != null) {
                        parentHandle.release();
                    }
                    setParentHandle(pinnableContainer != null ? pinnableContainer.pin() : null);
                }
            }
            dpR dpr = dpR.c;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            setParentHandle(parentPinnableContainer != null ? parentPinnableContainer.pin() : null);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (getPinsCount() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        setPinsCount(getPinsCount() - 1);
        if (getPinsCount() == 0) {
            this.pinnedItemList.release$foundation_release(this);
            PinnableContainer.PinnedHandle parentHandle = getParentHandle();
            if (parentHandle != null) {
                parentHandle.release();
            }
            setParentHandle(null);
        }
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i = 0; i < pinsCount; i++) {
            release();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public void setIndex(int i) {
        this.index$delegate.setIntValue(i);
    }

    private final int getPinsCount() {
        return this.pinsCount$delegate.getIntValue();
    }

    private final void setPinsCount(int i) {
        this.pinsCount$delegate.setIntValue(i);
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle$delegate.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle$delegate.setValue(pinnedHandle);
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }
}
