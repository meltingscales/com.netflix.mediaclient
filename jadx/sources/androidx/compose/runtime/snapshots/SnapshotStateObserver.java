package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import o.C8564dqg;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final drM<drO<dpR>, dpR> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final drX<Set<? extends Object>, Snapshot, dpR> applyObserver = new drX<Set<? extends Object>, Snapshot, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(2);
        }

        @Override // o.drX
        public /* bridge */ /* synthetic */ dpR invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            boolean drainChanges;
            SnapshotStateObserver.this.addChanges(set);
            drainChanges = SnapshotStateObserver.this.drainChanges();
            if (drainChanges) {
                SnapshotStateObserver.this.sendNotifications();
            }
        }
    };
    private final drM<Object, dpR> readObserver = new drM<Object, dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(1);
        }

        @Override // o.drM
        public /* bridge */ /* synthetic */ dpR invoke(Object obj) {
            invoke2(obj);
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            boolean z;
            MutableVector mutableVector;
            SnapshotStateObserver.ObservedScopeMap observedScopeMap;
            z = SnapshotStateObserver.this.isPaused;
            if (z) {
                return;
            }
            mutableVector = SnapshotStateObserver.this.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (mutableVector) {
                observedScopeMap = snapshotStateObserver.currentMap;
                C8632dsu.d(observedScopeMap);
                observedScopeMap.recordRead(obj);
                dpR dpr = dpR.c;
            }
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(drM<? super drO<dpR>, dpR> drm) {
        this.onChangedExecutor = drm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        if (!content[i].recordInvalidation(removeChanges) && !z2) {
                            z2 = false;
                            i++;
                        }
                        z2 = true;
                        i++;
                    } while (i < size);
                    dpR dpr = dpR.c;
                } else {
                    dpR dpr2 = dpR.c;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new drO<dpR>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableVector mutableVector;
                boolean z;
                boolean drainChanges;
                MutableVector mutableVector2;
                do {
                    mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        z = snapshotStateObserver.sendingNotifications;
                        if (!z) {
                            snapshotStateObserver.sendingNotifications = true;
                            mutableVector2 = snapshotStateObserver.observedScopeMaps;
                            int size = mutableVector2.getSize();
                            if (size <= 0) {
                                snapshotStateObserver.sendingNotifications = false;
                            } else {
                                Object[] content = mutableVector2.getContent();
                                int i = 0;
                                do {
                                    ((SnapshotStateObserver.ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                    i++;
                                } while (i < size);
                                snapshotStateObserver.sendingNotifications = false;
                            }
                        }
                        dpR dpr = dpR.c;
                    }
                    drainChanges = SnapshotStateObserver.this.drainChanges();
                } while (drainChanges);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List e;
        Set<? extends Object> g;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                g = set;
            } else if (obj instanceof Set) {
                g = C8569dql.j(obj, set);
            } else if (!(obj instanceof List)) {
                report();
                throw new KotlinNothingValueException();
            } else {
                e = C8566dqi.e(set);
                g = C8576dqs.g((Collection) obj, (Iterable) e);
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, g));
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, obj2));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    public final <T> void observeReads(T t, drM<? super T, dpR> drm, drO<dpR> dro) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(drm);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1 && j != ActualJvm_jvmKt.currentThreadId()) {
            throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread.currentThread().getId();
            ensureMap.observe(t, this.readObserver, dro);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final drM<Object, dpR> onChanged;
        private int currentToken = -1;
        private final ScopeMap<Object> valueToScopes = new ScopeMap<>();
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues = new MutableScatterMap<>(0, 1, null);
        private final MutableScatterSet<Object> invalidated = new MutableScatterSet<>(0, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i + 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i - 1;
            }
        };
        private final ScopeMap<DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public final drM<Object, dpR> getOnChanged() {
            return this.onChanged;
        }

        public ObservedScopeMap(drM<Object, dpR> drm) {
            this.onChanged = drm;
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.currentScope;
            C8632dsu.d(obj2);
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
                dpR dpr = dpR.c;
            }
            recordRead(obj, i, obj2, mutableObjectIntMap);
        }

        private final void recordRead(Object obj, int i, Object obj2, MutableObjectIntMap<Object> mutableObjectIntMap) {
            int i2;
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = mutableObjectIntMap.put(obj, i, -1);
            if (!(obj instanceof DerivedState) || put == i) {
                i2 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(obj);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i4 << 3) + i7];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.Companion;
                                        ((StateObjectImpl) stateObject).m1055recordReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, obj);
                                    i3 = 8;
                                } else {
                                    i3 = i5;
                                }
                                j >>= i3;
                                i7++;
                                i5 = i3;
                            }
                            if (i6 != i5) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                i2 = -1;
            }
            if (put == i2) {
                if (obj instanceof StateObjectImpl) {
                    ReaderKind.Companion companion2 = ReaderKind.Companion;
                    ((StateObjectImpl) obj).m1055recordReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(2));
                }
                this.valueToScopes.add(obj, obj2);
            }
        }

        public final void observe(Object obj, drM<Object, dpR> drm, drO<dpR> dro) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(drm, null, dro);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                C8632dsu.d(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        public final void clearScopeObservations(Object obj) {
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(obj);
            if (remove == null) {
                return;
            }
            Object[] objArr = remove.keys;
            int[] iArr = remove.values;
            long[] jArr = remove.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                }
                i++;
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if (!(obj2 instanceof DerivedState) || this.valueToScopes.contains(obj2)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj);
                if (mutableObjectIntMap2 == null) {
                    mutableObjectIntMap2 = new MutableObjectIntMap<>(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap2);
                    dpR dpr = dpR.c;
                }
                recordRead(derivedState, id, obj, mutableObjectIntMap2);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr3 = mutableScatterSet.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            Object obj2 = objArr[(i2 << 3) + i5];
                            MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj2);
                            jArr2 = jArr3;
                            if (mutableObjectIntMap3 == null) {
                                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap);
                                dpR dpr2 = dpR.c;
                            } else {
                                mutableObjectIntMap = mutableObjectIntMap3;
                            }
                            recordRead(derivedState, id, obj2, mutableObjectIntMap);
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        private final void clearObsoleteStateReads(Object obj) {
            int i = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = mutableObjectIntMap.keys[i5];
                            boolean z = mutableObjectIntMap.values[i5] != i;
                            if (z) {
                                removeObservation(obj, obj2);
                            }
                            if (z) {
                                mutableObjectIntMap.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                }
                i2++;
            }
        }

        public final void removeScopeIf(drM<Object, Boolean> drm) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            long j;
            int i3;
            long j2;
            int i4;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                long j4 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = mutableScatterMap.keys[i9];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i9];
                            Boolean invoke = drm.invoke(obj);
                            if (invoke.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    i3 = i7;
                                    int i10 = 0;
                                    while (true) {
                                        long j5 = jArr4[i10];
                                        i2 = i5;
                                        j = j3;
                                        j2 = -9187201950435737472L;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj2 = objArr[i13];
                                                    int i14 = iArr[i13];
                                                    removeObservation(obj, obj2);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i5 = i2;
                                        j3 = j;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = i5;
                                    j = j3;
                                    i3 = i7;
                                    j2 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                j = j3;
                                i3 = i7;
                                j2 = j4;
                            }
                            if (invoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i9);
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                            j = j3;
                            i3 = i7;
                            j2 = j4;
                            i4 = i6;
                        }
                        j3 = j >> i4;
                        i8++;
                        i6 = i4;
                        j4 = j2;
                        jArr3 = jArr2;
                        i7 = i3;
                        i5 = i2;
                    }
                    jArr = jArr3;
                    int i15 = i5;
                    if (i7 != i6) {
                        return;
                    }
                    i = i15;
                } else {
                    jArr = jArr3;
                    i = i5;
                }
                if (i == length) {
                    return;
                }
                i5 = i + 1;
                jArr3 = jArr;
            }
        }

        public final boolean recordInvalidation(Set<? extends Object> set) {
            boolean z;
            Iterator it;
            HashMap<DerivedState<?>, Object> hashMap;
            Object obj;
            ScopeMap<DerivedState<?>> scopeMap;
            String str;
            int i;
            Object obj2;
            HashMap<DerivedState<?>, Object> hashMap2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            HashMap<DerivedState<?>, Object> hashMap3;
            Object obj3;
            ScopeMap<DerivedState<?>> scopeMap2;
            long[] jArr2;
            int i2;
            String str2;
            Object[] objArr2;
            char c;
            long[] jArr3;
            long[] jArr4;
            int i3;
            ScopeMap<DerivedState<?>> scopeMap3;
            HashMap<DerivedState<?>, Object> hashMap4;
            ScopeMap<Object> scopeMap4;
            Object[] objArr3;
            String str3;
            int i4;
            int i5;
            Object obj4;
            HashMap<DerivedState<?>, Object> hashMap5;
            long[] jArr5;
            Object[] objArr4;
            HashMap<DerivedState<?>, Object> hashMap6;
            ScopeMap<Object> scopeMap5;
            Object[] objArr5;
            String str4;
            int i6;
            long[] jArr6;
            Object[] objArr6;
            char c2;
            long[] jArr7;
            long[] jArr8;
            ScopeMap<DerivedState<?>> scopeMap6 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> hashMap7 = this.recordedDerivedStateValues;
            ScopeMap<Object> scopeMap7 = this.valueToScopes;
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            char c3 = 7;
            int i7 = 2;
            String str5 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            if (set instanceof IdentityArraySet) {
                IdentityArraySet identityArraySet = (IdentityArraySet) set;
                Object[] values = identityArraySet.getValues();
                int size = identityArraySet.size();
                int i8 = 0;
                z = false;
                while (i8 < size) {
                    Object obj5 = values[i8];
                    C8632dsu.d(obj5);
                    if (obj5 instanceof StateObjectImpl) {
                        ReaderKind.Companion companion = ReaderKind.Companion;
                        if (!((StateObjectImpl) obj5).m1054isReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(i7))) {
                            i3 = size;
                            scopeMap3 = scopeMap6;
                            hashMap4 = hashMap7;
                            scopeMap4 = scopeMap7;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i8;
                            i8 = i4 + 1;
                            hashMap7 = hashMap4;
                            scopeMap6 = scopeMap3;
                            size = i3;
                            values = objArr3;
                            str5 = str3;
                            scopeMap7 = scopeMap4;
                            c3 = 7;
                            i7 = 2;
                        }
                    }
                    if (!scopeMap6.contains(obj5) || (obj4 = scopeMap6.getMap().get(obj5)) == null) {
                        i3 = size;
                        scopeMap3 = scopeMap6;
                        hashMap4 = hashMap7;
                        scopeMap4 = scopeMap7;
                        objArr3 = values;
                        str3 = str5;
                        i4 = i8;
                    } else if (obj4 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj4;
                        Object[] objArr7 = mutableScatterSet2.elements;
                        long[] jArr9 = mutableScatterSet2.metadata;
                        int length = jArr9.length - i7;
                        if (length >= 0) {
                            int i9 = length;
                            int i10 = 0;
                            while (true) {
                                long j = jArr9[i10];
                                i3 = size;
                                scopeMap3 = scopeMap6;
                                if ((((~j) << c3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - i9)) >>> 31);
                                    int i12 = 0;
                                    while (i12 < i11) {
                                        if ((j & 255) < 128) {
                                            DerivedState<?> derivedState = (DerivedState) objArr7[(i10 << 3) + i12];
                                            C8632dsu.e(derivedState, str5);
                                            objArr5 = values;
                                            Object obj6 = hashMap7.get(derivedState);
                                            SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                            if (policy == null) {
                                                policy = SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            jArr6 = jArr9;
                                            objArr6 = objArr7;
                                            if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj6)) {
                                                hashMap6 = hashMap7;
                                                scopeMap5 = scopeMap7;
                                                str4 = str5;
                                                i6 = i8;
                                                this.statesToReread.add(derivedState);
                                            } else {
                                                Object obj7 = scopeMap7.getMap().get(derivedState);
                                                if (obj7 != null) {
                                                    if (obj7 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj7;
                                                        Object[] objArr8 = mutableScatterSet3.elements;
                                                        long[] jArr10 = mutableScatterSet3.metadata;
                                                        int length2 = jArr10.length - 2;
                                                        if (length2 >= 0) {
                                                            str4 = str5;
                                                            i6 = i8;
                                                            int i13 = 0;
                                                            while (true) {
                                                                long j2 = jArr10[i13];
                                                                hashMap6 = hashMap7;
                                                                scopeMap5 = scopeMap7;
                                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                    int i15 = 0;
                                                                    while (i15 < i14) {
                                                                        if ((j2 & 255) < 128) {
                                                                            jArr8 = jArr10;
                                                                            mutableScatterSet.add(objArr8[(i13 << 3) + i15]);
                                                                            z = true;
                                                                        } else {
                                                                            jArr8 = jArr10;
                                                                        }
                                                                        j2 >>= 8;
                                                                        i15++;
                                                                        jArr10 = jArr8;
                                                                    }
                                                                    jArr7 = jArr10;
                                                                    if (i14 != 8) {
                                                                        c2 = '\b';
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr7 = jArr10;
                                                                }
                                                                if (i13 == length2) {
                                                                    break;
                                                                }
                                                                i13++;
                                                                hashMap7 = hashMap6;
                                                                scopeMap7 = scopeMap5;
                                                                jArr10 = jArr7;
                                                            }
                                                        }
                                                    } else {
                                                        hashMap6 = hashMap7;
                                                        scopeMap5 = scopeMap7;
                                                        str4 = str5;
                                                        i6 = i8;
                                                        mutableScatterSet.add(obj7);
                                                        z = true;
                                                    }
                                                }
                                                hashMap6 = hashMap7;
                                                scopeMap5 = scopeMap7;
                                                str4 = str5;
                                                i6 = i8;
                                            }
                                        } else {
                                            hashMap6 = hashMap7;
                                            scopeMap5 = scopeMap7;
                                            objArr5 = values;
                                            str4 = str5;
                                            i6 = i8;
                                            jArr6 = jArr9;
                                            objArr6 = objArr7;
                                        }
                                        c2 = '\b';
                                        j >>= c2;
                                        i12++;
                                        values = objArr5;
                                        str5 = str4;
                                        jArr9 = jArr6;
                                        objArr7 = objArr6;
                                        i8 = i6;
                                        hashMap7 = hashMap6;
                                        scopeMap7 = scopeMap5;
                                    }
                                    hashMap5 = hashMap7;
                                    scopeMap4 = scopeMap7;
                                    objArr3 = values;
                                    str3 = str5;
                                    i4 = i8;
                                    jArr5 = jArr9;
                                    objArr4 = objArr7;
                                    if (i11 != 8) {
                                        break;
                                    }
                                } else {
                                    hashMap5 = hashMap7;
                                    scopeMap4 = scopeMap7;
                                    objArr3 = values;
                                    str3 = str5;
                                    i4 = i8;
                                    jArr5 = jArr9;
                                    objArr4 = objArr7;
                                }
                                int i16 = i9;
                                if (i10 == i16) {
                                    break;
                                }
                                i10++;
                                i9 = i16;
                                scopeMap6 = scopeMap3;
                                size = i3;
                                values = objArr3;
                                str5 = str3;
                                jArr9 = jArr5;
                                objArr7 = objArr4;
                                i8 = i4;
                                hashMap7 = hashMap5;
                                scopeMap7 = scopeMap4;
                                c3 = 7;
                            }
                            hashMap4 = hashMap5;
                        } else {
                            i3 = size;
                            scopeMap3 = scopeMap6;
                            scopeMap4 = scopeMap7;
                            objArr3 = values;
                            str3 = str5;
                            i4 = i8;
                            hashMap4 = hashMap7;
                        }
                    } else {
                        i3 = size;
                        scopeMap3 = scopeMap6;
                        scopeMap4 = scopeMap7;
                        objArr3 = values;
                        str3 = str5;
                        i4 = i8;
                        DerivedState<?> derivedState2 = (DerivedState) obj4;
                        hashMap4 = hashMap7;
                        Object obj8 = hashMap4.get(derivedState2);
                        SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                        if (policy2 == null) {
                            policy2 = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj8)) {
                            this.statesToReread.add(derivedState2);
                        } else {
                            Object obj9 = scopeMap4.getMap().get(derivedState2);
                            if (obj9 != null) {
                                if (obj9 instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet4 = (MutableScatterSet) obj9;
                                    Object[] objArr9 = mutableScatterSet4.elements;
                                    long[] jArr11 = mutableScatterSet4.metadata;
                                    int length3 = jArr11.length - 2;
                                    if (length3 >= 0) {
                                        int i17 = 0;
                                        while (true) {
                                            long j3 = jArr11[i17];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                                for (int i19 = 0; i19 < i18; i19++) {
                                                    if ((j3 & 255) < 128) {
                                                        mutableScatterSet.add(objArr9[(i17 << 3) + i19]);
                                                        z = true;
                                                    }
                                                    j3 >>= 8;
                                                }
                                                if (i18 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i17 == length3) {
                                                break;
                                            }
                                            i17++;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj9);
                                    z = true;
                                }
                            }
                        }
                    }
                    Object obj10 = scopeMap4.getMap().get(obj5);
                    if (obj10 != null) {
                        if (obj10 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj10;
                            Object[] objArr10 = mutableScatterSet5.elements;
                            long[] jArr12 = mutableScatterSet5.metadata;
                            int length4 = jArr12.length - 2;
                            if (length4 >= 0) {
                                while (true) {
                                    long j4 = jArr12[i5];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i5 - length4)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j4 & 255) < 128) {
                                                mutableScatterSet.add(objArr10[(i5 << 3) + i21]);
                                                z = true;
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i5 = i5 != length4 ? i5 + 1 : 0;
                                }
                            }
                        } else {
                            mutableScatterSet.add(obj10);
                            z = true;
                        }
                    }
                    i8 = i4 + 1;
                    hashMap7 = hashMap4;
                    scopeMap6 = scopeMap3;
                    size = i3;
                    values = objArr3;
                    str5 = str3;
                    scopeMap7 = scopeMap4;
                    c3 = 7;
                    i7 = 2;
                }
            } else {
                ScopeMap<DerivedState<?>> scopeMap8 = scopeMap6;
                HashMap<DerivedState<?>, Object> hashMap8 = hashMap7;
                String str6 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
                Iterator it3 = set.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof StateObjectImpl) {
                        ReaderKind.Companion companion2 = ReaderKind.Companion;
                        if (!((StateObjectImpl) next).m1054isReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(2))) {
                            it = it3;
                            hashMap = hashMap8;
                            scopeMap = scopeMap8;
                            str = str6;
                            hashMap8 = hashMap;
                            str6 = str;
                            scopeMap8 = scopeMap;
                            it3 = it;
                        }
                    }
                    ScopeMap<DerivedState<?>> scopeMap9 = scopeMap8;
                    if (!scopeMap9.contains(next) || (obj2 = scopeMap9.getMap().get(next)) == null) {
                        it = it3;
                        hashMap = hashMap8;
                        obj = next;
                        scopeMap = scopeMap9;
                        str = str6;
                    } else if (obj2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj2;
                        Object[] objArr11 = mutableScatterSet6.elements;
                        long[] jArr13 = mutableScatterSet6.metadata;
                        int length5 = jArr13.length - 2;
                        if (length5 >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j5 = jArr13[i22];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i23 = 8 - ((~(i22 - length5)) >>> 31);
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        if ((j5 & 255) < 128) {
                                            DerivedState<?> derivedState3 = (DerivedState) objArr11[(i22 << 3) + i24];
                                            str2 = str6;
                                            C8632dsu.e(derivedState3, str2);
                                            it2 = it3;
                                            Object obj11 = hashMap8.get(derivedState3);
                                            SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                            if (policy3 == null) {
                                                policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                            }
                                            scopeMap2 = scopeMap9;
                                            jArr2 = jArr13;
                                            if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj11)) {
                                                hashMap3 = hashMap8;
                                                obj3 = next;
                                                objArr2 = objArr11;
                                                i2 = length5;
                                                this.statesToReread.add(derivedState3);
                                            } else {
                                                Object obj12 = scopeMap7.getMap().get(derivedState3);
                                                if (obj12 != null) {
                                                    if (obj12 instanceof MutableScatterSet) {
                                                        MutableScatterSet mutableScatterSet7 = (MutableScatterSet) obj12;
                                                        Object[] objArr12 = mutableScatterSet7.elements;
                                                        long[] jArr14 = mutableScatterSet7.metadata;
                                                        int length6 = jArr14.length - 2;
                                                        if (length6 >= 0) {
                                                            hashMap3 = hashMap8;
                                                            obj3 = next;
                                                            int i25 = 0;
                                                            while (true) {
                                                                long j6 = jArr14[i25];
                                                                objArr2 = objArr11;
                                                                i2 = length5;
                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i26 = 8 - ((~(i25 - length6)) >>> 31);
                                                                    int i27 = 0;
                                                                    while (i27 < i26) {
                                                                        if ((j6 & 255) < 128) {
                                                                            jArr4 = jArr14;
                                                                            mutableScatterSet.add(objArr12[(i25 << 3) + i27]);
                                                                            z = true;
                                                                        } else {
                                                                            jArr4 = jArr14;
                                                                        }
                                                                        j6 >>= 8;
                                                                        i27++;
                                                                        jArr14 = jArr4;
                                                                    }
                                                                    jArr3 = jArr14;
                                                                    c = '\b';
                                                                    if (i26 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    jArr3 = jArr14;
                                                                }
                                                                if (i25 == length6) {
                                                                    break;
                                                                }
                                                                i25++;
                                                                objArr11 = objArr2;
                                                                length5 = i2;
                                                                jArr14 = jArr3;
                                                            }
                                                            j5 >>= c;
                                                            i24++;
                                                            it3 = it2;
                                                            next = obj3;
                                                            scopeMap9 = scopeMap2;
                                                            jArr13 = jArr2;
                                                            objArr11 = objArr2;
                                                            length5 = i2;
                                                            hashMap8 = hashMap3;
                                                            str6 = str2;
                                                        }
                                                    } else {
                                                        hashMap3 = hashMap8;
                                                        obj3 = next;
                                                        objArr2 = objArr11;
                                                        i2 = length5;
                                                        mutableScatterSet.add(obj12);
                                                        z = true;
                                                    }
                                                }
                                                hashMap3 = hashMap8;
                                                obj3 = next;
                                                objArr2 = objArr11;
                                                i2 = length5;
                                            }
                                        } else {
                                            it2 = it3;
                                            hashMap3 = hashMap8;
                                            obj3 = next;
                                            scopeMap2 = scopeMap9;
                                            jArr2 = jArr13;
                                            i2 = length5;
                                            str2 = str6;
                                            objArr2 = objArr11;
                                        }
                                        c = '\b';
                                        j5 >>= c;
                                        i24++;
                                        it3 = it2;
                                        next = obj3;
                                        scopeMap9 = scopeMap2;
                                        jArr13 = jArr2;
                                        objArr11 = objArr2;
                                        length5 = i2;
                                        hashMap8 = hashMap3;
                                        str6 = str2;
                                    }
                                    it = it3;
                                    hashMap2 = hashMap8;
                                    obj = next;
                                    scopeMap = scopeMap9;
                                    jArr = jArr13;
                                    int i28 = length5;
                                    str = str6;
                                    objArr = objArr11;
                                    if (i23 != 8) {
                                        break;
                                    }
                                    length5 = i28;
                                } else {
                                    it = it3;
                                    hashMap2 = hashMap8;
                                    obj = next;
                                    scopeMap = scopeMap9;
                                    jArr = jArr13;
                                    str = str6;
                                    objArr = objArr11;
                                }
                                if (i22 == length5) {
                                    break;
                                }
                                i22++;
                                it3 = it;
                                next = obj;
                                scopeMap9 = scopeMap;
                                jArr13 = jArr;
                                objArr11 = objArr;
                                hashMap8 = hashMap2;
                                str6 = str;
                            }
                        } else {
                            it = it3;
                            hashMap2 = hashMap8;
                            obj = next;
                            scopeMap = scopeMap9;
                            str = str6;
                        }
                        hashMap = hashMap2;
                    } else {
                        it = it3;
                        obj = next;
                        scopeMap = scopeMap9;
                        str = str6;
                        DerivedState<?> derivedState4 = (DerivedState) obj2;
                        hashMap = hashMap8;
                        Object obj13 = hashMap.get(derivedState4);
                        SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                        if (policy4 == null) {
                            policy4 = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj13)) {
                            this.statesToReread.add(derivedState4);
                        } else {
                            Object obj14 = scopeMap7.getMap().get(derivedState4);
                            if (obj14 != null) {
                                if (obj14 instanceof MutableScatterSet) {
                                    MutableScatterSet mutableScatterSet8 = (MutableScatterSet) obj14;
                                    Object[] objArr13 = mutableScatterSet8.elements;
                                    long[] jArr15 = mutableScatterSet8.metadata;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        int i29 = 0;
                                        while (true) {
                                            long j7 = jArr15[i29];
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i30 = 8 - ((~(i29 - length7)) >>> 31);
                                                for (int i31 = 0; i31 < i30; i31++) {
                                                    if ((j7 & 255) < 128) {
                                                        mutableScatterSet.add(objArr13[(i29 << 3) + i31]);
                                                        z = true;
                                                    }
                                                    j7 >>= 8;
                                                }
                                                if (i30 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i29 == length7) {
                                                break;
                                            }
                                            i29++;
                                        }
                                    }
                                } else {
                                    mutableScatterSet.add(obj14);
                                    z = true;
                                }
                            }
                        }
                    }
                    Object obj15 = scopeMap7.getMap().get(obj);
                    if (obj15 != null) {
                        if (obj15 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) obj15;
                            Object[] objArr14 = mutableScatterSet9.elements;
                            long[] jArr16 = mutableScatterSet9.metadata;
                            int length8 = jArr16.length - 2;
                            if (length8 >= 0) {
                                while (true) {
                                    long j8 = jArr16[i];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i - length8)) >>> 31);
                                        for (int i33 = 0; i33 < i32; i33++) {
                                            if ((j8 & 255) < 128) {
                                                mutableScatterSet.add(objArr14[(i << 3) + i33]);
                                                z = true;
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i32 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length8 ? i + 1 : 0;
                                }
                            }
                        } else {
                            mutableScatterSet.add(obj15);
                            z = true;
                        }
                        hashMap8 = hashMap;
                        str6 = str;
                        scopeMap8 = scopeMap;
                        it3 = it;
                    }
                    hashMap8 = hashMap;
                    str6 = str;
                    scopeMap8 = scopeMap;
                    it3 = it;
                }
            }
            if (this.statesToReread.isNotEmpty()) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                int size2 = mutableVector.getSize();
                if (size2 > 0) {
                    DerivedState<?>[] content = mutableVector.getContent();
                    int i34 = 0;
                    do {
                        rereadDerivedState(content[i34]);
                        i34++;
                    } while (i34 < size2);
                    this.statesToReread.clear();
                } else {
                    this.statesToReread.clear();
                }
            }
            return z;
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            drM<Object, dpR> drm = this.onChanged;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                drm.invoke(objArr[(i << 3) + i3]);
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
            mutableScatterSet.clear();
        }
    }

    public final void clear(Object obj) {
        ObservedScopeMap observedScopeMap;
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].clearScopeObservations(obj);
                if (!observedScopeMap.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            C8564dqg.d(mutableVector.getContent(), null, i3, size);
            mutableVector.setSize(i3);
            dpR dpr = dpR.c;
        }
    }

    public final void clearIf(drM<Object, Boolean> drm) {
        ObservedScopeMap observedScopeMap;
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                mutableVector.getContent()[i2].removeScopeIf(drm);
                if (!observedScopeMap.hasScopeObservations()) {
                    i++;
                } else if (i > 0) {
                    mutableVector.getContent()[i2 - i] = mutableVector.getContent()[i2];
                }
            }
            int i3 = size - i;
            C8564dqg.d(mutableVector.getContent(), null, i3, size);
            mutableVector.setSize(i3);
            dpR dpr = dpR.c;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].clear();
                    i++;
                } while (i < size);
                dpR dpr = dpR.c;
            } else {
                dpR dpr2 = dpR.c;
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(drM<? super T, dpR> drm) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i = 0;
            do {
                observedScopeMap = content[i];
                if (observedScopeMap.getOnChanged() == drm) {
                    break;
                }
                i++;
            } while (i < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            C8632dsu.d(drm);
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((drM) dsH.a(drm, 1));
            this.observedScopeMaps.add(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }
}
