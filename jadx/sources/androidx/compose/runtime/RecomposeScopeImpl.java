package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private drX<? super Composer, ? super Integer, dpR> block;
    private int currentToken;
    private int flags;
    private RecomposeScopeObserver observer;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z) {
        this.flags = z ? this.flags | 32 : this.flags & (-33);
    }

    private final void setSkipped(boolean z) {
        this.flags = z ? this.flags | 16 : this.flags & (-17);
    }

    public final void adoptedBy(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        this.flags = z ? this.flags | 2 : this.flags & (-3);
    }

    public final void setDefaultsInvalid(boolean z) {
        this.flags = z ? this.flags | 4 : this.flags & (-5);
    }

    public final void setForcedRecompose(boolean z) {
        this.flags = z ? this.flags | 64 : this.flags & (-65);
    }

    public final void setRequiresRecompose(boolean z) {
        this.flags = z ? this.flags | 8 : this.flags & (-9);
    }

    public final void setUsed(boolean z) {
        this.flags = z ? this.flags | 1 : this.flags & (-2);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(drX<? super Composer, ? super Integer, dpR> drx) {
        this.block = drx;
    }

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final boolean getValid() {
        Anchor anchor;
        return (this.owner == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    public final void compose(Composer composer) {
        dpR dpr;
        drX<? super Composer, ? super Integer, dpR> drx = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && drx != null) {
            recomposeScopeObserver.onBeginScopeComposition(this);
            try {
                drx.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(this);
            }
        }
        if (drx != null) {
            drx.invoke(composer, 1);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    public final void start(int i) {
        this.currentToken = i;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final boolean recordRead(Object obj) {
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        if (mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken) {
            return true;
        }
        if (obj instanceof DerivedState) {
            MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
            if (mutableScatterMap == null) {
                mutableScatterMap = new MutableScatterMap<>(0, 1, null);
                this.trackedDependencies = mutableScatterMap;
            }
            mutableScatterMap.set(obj, ((DerivedState) obj).getCurrentRecord().getCurrentValue());
        }
        return false;
    }

    public final boolean isInvalidFor(IdentityArraySet<Object> identityArraySet) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (identityArraySet != null && (mutableScatterMap = this.trackedDependencies) != null && identityArraySet.isNotEmpty()) {
            if (identityArraySet.isEmpty()) {
                return false;
            }
            for (Object obj : identityArraySet) {
                if (obj instanceof DerivedState) {
                    DerivedState<?> derivedState = (DerivedState) obj;
                    SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                    if (policy == null) {
                        policy = SnapshotStateKt.structuralEqualityPolicy();
                    }
                    if (!policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (mutableObjectIntMap = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                recomposeScopeOwner.recordReadOf(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } finally {
            setRereading(false);
        }
    }

    public final drM<Composition, dpR> end(final int i) {
        final MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap != null && !getSkipped$runtime_release()) {
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                if (iArr[i5] != i) {
                                    return new drM<Composition, dpR>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // o.drM
                                        public /* bridge */ /* synthetic */ dpR invoke(Composition composition) {
                                            invoke2(composition);
                                            return dpR.c;
                                        }

                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                        public final void invoke2(Composition composition) {
                                            int i6;
                                            MutableObjectIntMap mutableObjectIntMap2;
                                            int i7;
                                            MutableScatterMap mutableScatterMap;
                                            Composition composition2 = composition;
                                            i6 = RecomposeScopeImpl.this.currentToken;
                                            if (i6 == i) {
                                                MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableObjectIntMap;
                                                mutableObjectIntMap2 = RecomposeScopeImpl.this.trackedInstances;
                                                if (C8632dsu.c(mutableObjectIntMap3, mutableObjectIntMap2) && (composition2 instanceof CompositionImpl)) {
                                                    MutableObjectIntMap<Object> mutableObjectIntMap4 = mutableObjectIntMap;
                                                    int i8 = i;
                                                    RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                                                    long[] jArr2 = mutableObjectIntMap4.metadata;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i9 = 0;
                                                        while (true) {
                                                            long j2 = jArr2[i9];
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i10 = 8;
                                                                int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                                                int i12 = 0;
                                                                while (i12 < i11) {
                                                                    if ((255 & j2) < 128) {
                                                                        int i13 = (i9 << 3) + i12;
                                                                        Object obj2 = mutableObjectIntMap4.keys[i13];
                                                                        boolean z = mutableObjectIntMap4.values[i13] != i8;
                                                                        if (z) {
                                                                            CompositionImpl compositionImpl = (CompositionImpl) composition2;
                                                                            compositionImpl.removeObservation$runtime_release(obj2, recomposeScopeImpl);
                                                                            DerivedState<?> derivedState = obj2 instanceof DerivedState ? (DerivedState) obj2 : null;
                                                                            if (derivedState != null) {
                                                                                compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                                                                mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                                                                if (mutableScatterMap != null) {
                                                                                    mutableScatterMap.remove(derivedState);
                                                                                    if (mutableScatterMap.getSize() == 0) {
                                                                                        recomposeScopeImpl.trackedDependencies = null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (z) {
                                                                            mutableObjectIntMap4.removeValueAt(i13);
                                                                        }
                                                                        i7 = 8;
                                                                    } else {
                                                                        i7 = i10;
                                                                    }
                                                                    j2 >>= i7;
                                                                    i12++;
                                                                    i10 = i7;
                                                                    composition2 = composition;
                                                                }
                                                                if (i11 != i10) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i9 == length2) {
                                                                break;
                                                            }
                                                            i9++;
                                                            composition2 = composition;
                                                        }
                                                    }
                                                    if (mutableObjectIntMap.getSize() == 0) {
                                                        RecomposeScopeImpl.this.trackedInstances = null;
                                                    }
                                                }
                                            }
                                        }
                                    };
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime_release(SlotWriter slotWriter, List<Anchor> list, RecomposeScopeOwner recomposeScopeOwner) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object slot = slotWriter.slot(list.get(i), 0);
                    RecomposeScopeImpl recomposeScopeImpl = slot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) slot : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(SlotTable slotTable, List<Anchor> list) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = list.get(i);
                    if (slotTable.ownsAnchor(anchor) && (slotTable.slot$runtime_release(slotTable.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
