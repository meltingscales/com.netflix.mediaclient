package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.dqZ;
import o.drO;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner {
    private final dqZ _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private drX<? super Composer, ? super Integer, dpR> composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final ScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final ScopeMap<RecomposeScopeImpl> observations;
    private final ScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, dqZ dqz) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = dqz;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m991getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, dqZ dqz, int i, C8627dsp c8627dsp) {
        this(compositionContext, applier, (i & 4) != 0 ? null : dqz);
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(drX<? super Composer, ? super Integer, dpR> drx) {
        composeInitial(drx);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(drX<? super Composer, ? super Integer, dpR> drx) {
        this.composer.startReuseFromRoot();
        composeInitial(drx);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(drX<? super Composer, ? super Integer, dpR> drx) {
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = drx;
        this.parent.composeInitial$runtime_release(this, drx);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (C8632dsu.c(andSet, obj2)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            } else if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
            } else if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            } else {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, true);
                }
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (C8632dsu.c(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
        } else if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            } else {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
        } else {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> set2;
        Object obj2;
        ?? a;
        do {
            obj = this.pendingModifications.get();
            if (obj != null) {
                obj2 = CompositionKt.PendingApplyNoModifications;
                if (!C8632dsu.c(obj, obj2)) {
                    if (obj instanceof Set) {
                        set2 = new Set[]{obj, set};
                    } else if (!(obj instanceof Object[])) {
                        throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                    } else {
                        C8632dsu.d(obj);
                        a = C8564dqg.a((Set[]) obj, set);
                        set2 = a;
                    }
                }
            }
            set2 = set;
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, obj, set2));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                dpR dpr = dpR.c;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.collection.IdentityArraySet
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            androidx.compose.runtime.collection.IdentityArraySet r7 = (androidx.compose.runtime.collection.IdentityArraySet) r7
            java.lang.Object[] r0 = r7.getValues()
            int r7 = r7.size()
            r3 = r2
        L11:
            if (r3 >= r7) goto L2d
            r4 = r0[r3]
            o.C8632dsu.d(r4)
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r5 = r6.observations
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L2c
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> r5 = r6.derivedStates
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L29
            goto L2c
        L29:
            int r3 = r3 + 1
            goto L11
        L2c:
            return r1
        L2d:
            return r2
        L2e:
            java.util.Iterator r7 = r7.iterator()
        L32:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r7.next()
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r3 = r6.observations
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L4c
            androidx.compose.runtime.collection.ScopeMap<androidx.compose.runtime.DerivedState<?>> r3 = r6.derivedStates
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L32
        L4c:
            return r1
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(drO<dpR> dro) {
        this.composer.prepareCompose$runtime_release(dro);
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(obj)) {
            return;
        }
        if (obj instanceof StateObjectImpl) {
            ReaderKind.Companion companion = ReaderKind.Companion;
            ((StateObjectImpl) obj).m1055recordReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(1));
        }
        this.observations.add(obj, currentRecomposeScope$runtime_release);
        if (!(obj instanceof DerivedState)) {
            return;
        }
        this.derivedStates.removeScope(obj);
        ObjectIntMap<StateObject> dependencies = ((DerivedState) obj).getCurrentRecord().getDependencies();
        Object[] objArr = dependencies.keys;
        long[] jArr = dependencies.metadata;
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
                        StateObject stateObject = (StateObject) objArr[(i << 3) + i3];
                        if (stateObject instanceof StateObjectImpl) {
                            ReaderKind.Companion companion2 = ReaderKind.Companion;
                            ((StateObjectImpl) stateObject).m1055recordReadInh_f27i8$runtime_release(ReaderKind.m1049constructorimpl(1));
                        }
                        this.derivedStates.add(stateObject, obj);
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

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            dpR dpr = dpR.c;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
        if (((androidx.compose.runtime.RecomposeScopeImpl) r11).getValid() == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r31) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, drO<? extends R> dro) {
        if (controlledComposition != null && !C8632dsu.c(controlledComposition, this) && i >= 0) {
            this.invalidationDelegate = (CompositionImpl) controlledComposition;
            this.invalidationDelegateGroup = i;
            try {
                return dro.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return dro.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            if (!recomposeScopeImpl.getCanRecompose()) {
                return InvalidationResult.IGNORED;
            }
            return invalidateChecked(recomposeScopeImpl, anchor, obj);
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        if (compositionImpl != null && compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) {
            return InvalidationResult.IMMINENT;
        }
        return InvalidationResult.IGNORED;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        if (this.observations.contains(derivedState)) {
            return;
        }
        this.derivedStates.removeScope(derivedState);
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!C8632dsu.c(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<Object> forgetting = new ArrayList();
        private final List<drO<dpR>> sideEffects = new ArrayList();

        public RememberEventDispatcher(Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver rememberObserver) {
            this.remembering.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver rememberObserver) {
            this.forgetting.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(drO<dpR> dro) {
            this.sideEffects.add(dro);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            this.forgetting.add(composeNodeLifecycleCallback);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.releasing;
            if (mutableScatterSet == null) {
                mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
                this.releasing = mutableScatterSet;
            }
            mutableScatterSet.plusAssign(composeNodeLifecycleCallback);
            this.forgetting.add(composeNodeLifecycleCallback);
        }

        public final void dispatchRememberObservers() {
            Object beginSection;
            if (!this.forgetting.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    ScatterSet scatterSet = this.releasing;
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        Object obj = this.forgetting.get(size);
                        dsH.b(this.abandoning).remove(obj);
                        if (obj instanceof RememberObserver) {
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (scatterSet != null && scatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            }
                        }
                    }
                    dpR dpr = dpR.c;
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        RememberObserver rememberObserver = list.get(i);
                        this.abandoning.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    dpR dpr2 = dpR.c;
                } finally {
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<drO<dpR>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    dpR dpr = dpR.c;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().onAbandoned();
                    }
                    dpR dpr = dpR.c;
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        boolean z = this.slotTable.getGroupsSize() > 0;
        if (z || (true ^ this.abandonSet.isEmpty())) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Compose:deactivate");
            try {
                RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                if (z) {
                    this.applier.onBeginChanges();
                    SlotWriter openWriter = this.slotTable.openWriter();
                    ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                    dpR dpr = dpR.c;
                    openWriter.close();
                    this.applier.onEndChanges();
                    rememberEventDispatcher.dispatchRememberObservers();
                }
                rememberEventDispatcher.dispatchAbandons();
                dpR dpr2 = dpR.c;
                trace.endSection(beginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(beginSection);
                throw th;
            }
        }
        this.observations.clear();
        this.derivedStates.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.composer.deactivate$runtime_release();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(drX<? super Composer, ? super Integer, dpR> drx) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                try {
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                        C8632dsu.d(asMap);
                        observer.onBeginComposition(this, asMap);
                    }
                    this.composer.composeContent$runtime_release(takeInvalidations, drx);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        dpR dpr = dpR.c;
                    }
                } catch (Exception e) {
                    this.invalidations = takeInvalidations;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e2) {
                abandonChanges();
                throw e2;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!(!this.composer.isComposing$runtime_release())) {
                throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
            }
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m992getLambda2$runtime_release();
                ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        this.applier.onBeginChanges();
                        SlotWriter openWriter = this.slotTable.openWriter();
                        ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                        dpR dpr = dpR.c;
                        openWriter.close();
                        this.applier.clear();
                        this.applier.onEndChanges();
                        rememberEventDispatcher.dispatchRememberObservers();
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            dpR dpr2 = dpR.c;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    private final HashSet<RecomposeScopeImpl> addPendingInvalidationsLocked(HashSet<RecomposeScopeImpl> hashSet, Object obj, boolean z) {
        HashSet<RecomposeScopeImpl> hashSet2;
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                                    if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                        if (recomposeScopeImpl.isConditional() && !z) {
                                            this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                        } else {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet<>();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        }
                                    }
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
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    HashSet<RecomposeScopeImpl> hashSet3 = hashSet == null ? new HashSet<>() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022a, code lost:
        if (r12.isEmpty() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
        if (r14.isEmpty() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
        if (r31.observations.contains((androidx.compose.runtime.DerivedState) r14) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r1.removeValueAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
        r0 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void cleanUpDerivedStateObservations() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.cleanUpDerivedStateObservations():void");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                                this.observationsProcessed.add(obj, recomposeScopeImpl);
                            }
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                this.observationsProcessed.add(obj, recomposeScopeImpl2);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object obj) {
        synchronized (this.lock) {
            invalidateScopeOfLocked(obj);
            Object obj2 = this.derivedStates.getMap().get(obj);
            if (obj2 != null) {
                if (!(obj2 instanceof MutableScatterSet)) {
                    invalidateScopeOfLocked((DerivedState) obj2);
                } else {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
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
                                        invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
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
                }
            }
            dpR dpr = dpR.c;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
            try {
                CompositionObserver observer = observer();
                if (observer != null) {
                    Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                    C8632dsu.d(asMap);
                    observer.onBeginComposition(this, asMap);
                }
                recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                if (!recompose$runtime_release) {
                    drainPendingModificationsLocked();
                }
                if (observer != null) {
                    observer.onEndComposition(this);
                }
            } catch (Exception e) {
                this.invalidations = takeInvalidations;
                throw e;
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!C8632dsu.c(list.get(i).d().getComposition$runtime_release(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(list);
            dpR dpr = dpR.c;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                dpR dpr = dpR.c;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                dpR dpr = dpR.c;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                dpR dpr = dpR.c;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        Object[] slots;
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            dpR dpr = dpR.c;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (tryImminentInvalidation(recomposeScopeImpl, obj)) {
                    return InvalidationResult.IMMINENT;
                } else if (obj != null) {
                    CompositionKt.addValue(this.invalidations, recomposeScopeImpl, obj);
                } else {
                    this.invalidations.set(recomposeScopeImpl, null);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(recomposeScopeImpl, anchor, obj);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }
}
