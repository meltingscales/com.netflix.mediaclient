package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import o.C8553dpw;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8627dsp;
import o.C8632dsu;
import o.C8738dws;
import o.C8741dwv;
import o.C8768dxv;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.InterfaceC8743dwx;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.dpD;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.drX;
import o.dwG;
import o.dwU;
import o.dxD;
import o.dxG;
import o.dyR;
import o.dzB;

/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final InterfaceC8812dzl<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final List<ControlledComposition> compositionInvalidations;
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final dqZ effectCoroutineContext;
    private final dwG effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final RecomposerInfoImpl recomposerInfo;
    private dxD runnerJob;
    private IdentityArraySet<Object> snapshotInvalidations;
    private final Object stateLock;
    private InterfaceC8743dwx<? super dpR> workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC8812dzl<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = dzB.d(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* loaded from: classes.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    public final InterfaceC8822dzv<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public dqZ getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    public Recomposer(dqZ dqz) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new drO<dpR>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                InterfaceC8743dwx deriveStateLocked;
                InterfaceC8812dzl interfaceC8812dzl;
                Throwable th;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    deriveStateLocked = recomposer.deriveStateLocked();
                    interfaceC8812dzl = recomposer._state;
                    if (((Recomposer.State) interfaceC8812dzl.b()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        th = recomposer.closeCause;
                        throw C8768dxv.e("Recomposer shutdown; frame clock awaiter will never resume", th);
                    }
                }
                if (deriveStateLocked != null) {
                    Result.c cVar = Result.e;
                    deriveStateLocked.resumeWith(Result.e(dpR.c));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new IdentityArraySet<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = dzB.d(State.Inactive);
        dwG a = dxG.a((dxD) dqz.get(dxD.b));
        a.e(new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                invoke2(th);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th) {
                dxD dxd;
                InterfaceC8743dwx interfaceC8743dwx;
                InterfaceC8812dzl interfaceC8812dzl;
                InterfaceC8812dzl interfaceC8812dzl2;
                boolean z;
                InterfaceC8743dwx interfaceC8743dwx2;
                InterfaceC8743dwx interfaceC8743dwx3;
                CancellationException e = C8768dxv.e("Recomposer effect job completed", th);
                Object obj = Recomposer.this.stateLock;
                final Recomposer recomposer = Recomposer.this;
                synchronized (obj) {
                    dxd = recomposer.runnerJob;
                    interfaceC8743dwx = null;
                    if (dxd != null) {
                        interfaceC8812dzl2 = recomposer._state;
                        interfaceC8812dzl2.d(Recomposer.State.ShuttingDown);
                        z = recomposer.isClosed;
                        if (z) {
                            interfaceC8743dwx2 = recomposer.workContinuation;
                            if (interfaceC8743dwx2 != null) {
                                interfaceC8743dwx3 = recomposer.workContinuation;
                                recomposer.workContinuation = null;
                                dxd.e(new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // o.drM
                                    public /* bridge */ /* synthetic */ dpR invoke(Throwable th2) {
                                        invoke2(th2);
                                        return dpR.c;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th2) {
                                        InterfaceC8812dzl interfaceC8812dzl3;
                                        Object obj2 = Recomposer.this.stateLock;
                                        Recomposer recomposer2 = Recomposer.this;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                if (!(!(th2 instanceof CancellationException))) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    C8553dpw.c(th3, th2);
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            interfaceC8812dzl3 = recomposer2._state;
                                            interfaceC8812dzl3.d(Recomposer.State.ShutDown);
                                            dpR dpr = dpR.c;
                                        }
                                    }
                                });
                                interfaceC8743dwx = interfaceC8743dwx3;
                            }
                        } else {
                            dxd.e(e);
                        }
                        interfaceC8743dwx3 = null;
                        recomposer.workContinuation = null;
                        dxd.e(new drM<Throwable, dpR>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.drM
                            public /* bridge */ /* synthetic */ dpR invoke(Throwable th2) {
                                invoke2(th2);
                                return dpR.c;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th2) {
                                InterfaceC8812dzl interfaceC8812dzl3;
                                Object obj2 = Recomposer.this.stateLock;
                                Recomposer recomposer2 = Recomposer.this;
                                Throwable th3 = th;
                                synchronized (obj2) {
                                    if (th3 == null) {
                                        th3 = null;
                                    } else if (th2 != null) {
                                        if (!(!(th2 instanceof CancellationException))) {
                                            th2 = null;
                                        }
                                        if (th2 != null) {
                                            C8553dpw.c(th3, th2);
                                        }
                                    }
                                    recomposer2.closeCause = th3;
                                    interfaceC8812dzl3 = recomposer2._state;
                                    interfaceC8812dzl3.d(Recomposer.State.ShutDown);
                                    dpR dpr = dpR.c;
                                }
                            }
                        });
                        interfaceC8743dwx = interfaceC8743dwx3;
                    } else {
                        recomposer.closeCause = e;
                        interfaceC8812dzl = recomposer._state;
                        interfaceC8812dzl.d(Recomposer.State.ShutDown);
                        dpR dpr = dpR.c;
                    }
                }
                if (interfaceC8743dwx != null) {
                    Result.c cVar = Result.e;
                    interfaceC8743dwx.resumeWith(Result.e(dpR.c));
                }
            }
        });
        this.effectJob = a;
        this.effectCoroutineContext = dqz.plus(broadcastFrameClock).plus(a);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List arrayList;
        List i;
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            if (list3.isEmpty()) {
                i = C8569dql.i();
                arrayList = i;
            } else {
                arrayList = new ArrayList(list3);
            }
            this._knownCompositionsCache = arrayList;
            list2 = arrayList;
        }
        return list2;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8743dwx<dpR> deriveStateLocked() {
        State state;
        if (this._state.b().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC8743dwx<? super dpR> interfaceC8743dwx = this.workContinuation;
            if (interfaceC8743dwx != null) {
                InterfaceC8743dwx.a.b(interfaceC8743dwx, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if ((!this.compositionInvalidations.isEmpty()) || this.snapshotInvalidations.isNotEmpty() || (!this.compositionsAwaitingApply.isEmpty()) || (!this.compositionValuesAwaitingInsert.isEmpty()) || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.d(state);
        if (state == State.PendingWork) {
            InterfaceC8743dwx interfaceC8743dwx2 = this.workContinuation;
            this.workContinuation = null;
            return interfaceC8743dwx2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class RecomposerInfoImpl {
        public RecomposerInfoImpl() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class RecomposerErrorState {
        private final Exception cause;
        private final boolean recoverable;

        public Exception getCause() {
            return this.cause;
        }

        public RecomposerErrorState(boolean z, Exception exc) {
            this.recoverable = z;
            this.cause = exc;
        }
    }

    public final Object runRecomposeAndApplyChanges(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), interfaceC8585dra);
        e = C8586drb.e();
        return recompositionRunner == e ? recompositionRunner : dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z) {
        if (_hotReloadEnabled.get().booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new IdentityArraySet<>();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z, exc);
                if (controlledComposition != null) {
                    List list = this.failedCompositions;
                    if (list == null) {
                        list = new ArrayList();
                        this.failedCompositions = list;
                    }
                    if (!list.contains(controlledComposition)) {
                        list.add(controlledComposition);
                    }
                    removeKnownCompositionLocked(controlledComposition);
                }
                deriveStateLocked();
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, exc);
                dpR dpr = dpR.c;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw exc;
    }

    private final void clearKnownCompositionsLocked() {
        List<? extends ControlledComposition> i;
        this._knownCompositions.clear();
        i = C8569dql.i();
        this._knownCompositionsCache = i;
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.remove(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        InterfaceC8585dra b;
        C8741dwv c8741dwv;
        Object e;
        Object e2;
        if (getHasSchedulingWork()) {
            return dpR.c;
        }
        b = C8590drf.b(interfaceC8585dra);
        C8741dwv c8741dwv2 = new C8741dwv(b, 1);
        c8741dwv2.h();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                c8741dwv = c8741dwv2;
            } else {
                this.workContinuation = c8741dwv2;
                c8741dwv = null;
            }
        }
        if (c8741dwv != null) {
            Result.c cVar = Result.e;
            c8741dwv.resumeWith(Result.e(dpR.c));
        }
        Object b2 = c8741dwv2.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        e2 = C8586drb.e();
        return b2 == e2 ? b2 : dpR.c;
    }

    private final Object recompositionRunner(InterfaceC8612dsa<? super dwU, ? super MonotonicFrameClock, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object c = C8738dws.c(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, interfaceC8612dsa, MonotonicFrameClockKt.getMonotonicFrameClock(interfaceC8585dra.getContext()), null), interfaceC8585dra);
        e = C8586drb.e();
        return c == e ? c : dpR.c;
    }

    public final Object join(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object a = dyR.a(getCurrentState(), new Recomposer$join$2(null), interfaceC8585dra);
        e = C8586drb.e();
        return a == e ? a : dpR.c;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition controlledComposition, drX<? super Composer, ? super Integer, dpR> drx) {
        boolean isComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            controlledComposition.composeContent(drx);
            dpR dpr = dpR.c;
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            applyAndCheck(takeMutableSnapshot);
            if (!isComposing) {
                companion.notifyObjectsInitialized();
            }
            synchronized (this.stateLock) {
                if (this._state.b().compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(controlledComposition)) {
                    addKnownCompositionLocked(controlledComposition);
                }
            }
            try {
                performInitialMovableContentInserts(controlledComposition);
                try {
                    controlledComposition.applyChanges();
                    controlledComposition.applyLateChanges();
                    if (isComposing) {
                        return;
                    }
                    companion.notifyObjectsInitialized();
                } catch (Exception e) {
                    processCompositionError$default(this, e, null, false, 6, null);
                }
            } catch (Exception e2) {
                processCompositionError(e2, controlledComposition, true);
            }
        } catch (Exception e3) {
            processCompositionError(e3, controlledComposition, true);
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference next = it.next();
                if (C8632dsu.c(next.getComposition$runtime_release(), controlledComposition)) {
                    list.add(next);
                    it.remove();
                }
            }
            dpR dpr = dpR.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final IdentityArraySet<Object> identityArraySet) {
        Set<ControlledComposition> set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (identityArraySet != null && identityArraySet.isNotEmpty()) {
                controlledComposition.prepareCompose(new drO<dpR>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IdentityArraySet<Object> identityArraySet2 = identityArraySet;
                        ControlledComposition controlledComposition2 = controlledComposition;
                        Object[] values = identityArraySet2.getValues();
                        int size = identityArraySet2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj = values[i];
                            C8632dsu.d(obj);
                            controlledComposition2.recordWriteOf(obj);
                        }
                    }
                });
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    private final drM<Object, dpR> readObserverOf(final ControlledComposition controlledComposition) {
        return new drM<Object, dpR>() { // from class: androidx.compose.runtime.Recomposer$readObserverOf$1
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
                ControlledComposition.this.recordReadOf(obj);
            }
        };
    }

    private final drM<Object, dpR> writeObserverOf(final ControlledComposition controlledComposition, final IdentityArraySet<Object> identityArraySet) {
        return new drM<Object, dpR>() { // from class: androidx.compose.runtime.Recomposer$writeObserverOf$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ControlledComposition.this.recordWriteOf(obj);
                IdentityArraySet<Object> identityArraySet2 = identityArraySet;
                if (identityArraySet2 != null) {
                    identityArraySet2.add(obj);
                }
            }
        };
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    private final boolean getHasFrameWorkLocked() {
        return (this.compositionInvalidations.isEmpty() ^ true) || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.b();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.e(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.b();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.e(persistentSet, remove));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        for (dxD dxd : this.effectJob.cv_()) {
            if (dxd.cu_()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            IdentityArraySet<Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new IdentityArraySet<>();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i = 0; i < size; i++) {
                    knownCompositions.get(i).recordModificationsOf(identityArraySet);
                    if (this._state.b().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((Collection<? extends Object>) identityArraySet);
                    dpR dpr = dpR.c;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(dxD dxd) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.b().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.runnerJob = dxd;
            deriveStateLocked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            z = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (this._state.b().compareTo(State.Idle) >= 0) {
                this._state.d(State.ShuttingDown);
            }
            dpR dpr = dpR.c;
        }
        dxD.b.b(this.effectJob, null, 1, null);
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (C8632dsu.c(list.get(i).getComposition$runtime_release(), controlledComposition)) {
                    dpR dpr = dpR.c;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> identityArraySet) {
        List<ControlledComposition> U;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = list.get(i);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition$runtime_release();
            Object obj = hashMap.get(composition$runtime_release);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition$runtime_release, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                synchronized (this.stateLock) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i2);
                        arrayList.add(dpD.a(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                    }
                }
                controlledComposition.insertMovableContent(arrayList);
                dpR dpr = dpR.c;
                takeMutableSnapshot.restoreCurrent(makeCurrent);
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        U = C8576dqs.U(hashMap.keySet());
        return U;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i;
        List i2;
        List A;
        synchronized (this.stateLock) {
            if (!this.compositionValuesRemoved.isEmpty()) {
                A = C8572dqo.A(this.compositionValuesRemoved.values());
                this.compositionValuesRemoved.clear();
                i2 = new ArrayList(A.size());
                int size = A.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) A.get(i3);
                    i2.add(dpD.a(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                }
                this.compositionValueStatesAvailable.clear();
            } else {
                i2 = C8569dql.i();
            }
        }
        int size2 = i2.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) i2.get(i);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.b();
            MovableContentState movableContentState = (MovableContentState) pair.c();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            dpR dpr = dpR.c;
        }
    }

    public final void resumeCompositionFrameClock() {
        InterfaceC8743dwx<dpR> interfaceC8743dwx;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC8743dwx = deriveStateLocked();
            } else {
                interfaceC8743dwx = null;
            }
        }
        if (interfaceC8743dwx != null) {
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(dpR.c));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            dpR dpr = dpR.c;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition controlledComposition) {
        InterfaceC8743dwx<dpR> interfaceC8743dwx;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                interfaceC8743dwx = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                interfaceC8743dwx = deriveStateLocked();
            }
        }
        if (interfaceC8743dwx != null) {
            Result.c cVar = Result.e;
            interfaceC8743dwx.resumeWith(Result.e(dpR.c));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        InterfaceC8743dwx<dpR> deriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.c cVar = Result.e;
            deriveStateLocked.resumeWith(Result.e(dpR.c));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(movableContentStateReference, movableContentState);
            dpR dpr = dpR.c;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            Set set = this.compositionsRemoved;
            if (set == null) {
                set = new LinkedHashSet();
                this.compositionsRemoved = set;
            }
            set.add(controlledComposition);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(movableContentStateReference);
        }
        return remove;
    }
}
