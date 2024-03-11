package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import o.C8564dqg;
import o.C8569dql;
import o.C8575dqr;
import o.C8632dsu;
import o.dpD;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drO;
import o.drX;
import o.dsH;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private ChangeList deferredChanges;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionContext parentContext;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private IntMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private SlotReader reader;
    private boolean reusing;
    private final SlotTable slotTable;
    private boolean sourceInformationEnabled;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final Stack<Pending> pendingStack = new Stack<>();
    private IntStack nodeIndexStack = new IntStack();
    private IntStack groupNodeCountStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
        @Override // androidx.compose.runtime.DerivedStateObserver
        public void start(DerivedState<?> derivedState) {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.DerivedStateObserver
        public void done(DerivedState<?> derivedState) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }
    };
    private final Stack<RecomposeScopeImpl> invalidateStack = new Stack<>();

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int insertedGroupVirtualIndex(int i) {
        return (-2) - i;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceInformationEnabled = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final void setReader$runtime_release(SlotReader slotReader) {
        this.reader = slotReader;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, ChangeList changeList, ChangeList changeList2, ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public dqZ getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceableGroup(int i) {
        m993startBaiHCIY(i, null, GroupKind.Companion.m1000getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startDefaults() {
        m993startBaiHCIY(NetError.ERR_PROXY_AUTH_REQUESTED, null, GroupKind.Companion.m1000getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    public void startMovableGroup(int i, Object obj) {
        m993startBaiHCIY(i, obj, GroupKind.Companion.m1000getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.sourceInformationEnabled) {
            this.sourceInformationEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        this.insertFixups.clear();
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    public final void deactivate$runtime_release() {
        this.invalidateStack.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    private final void startGroup(int i) {
        m993startBaiHCIY(i, null, GroupKind.Companion.m1000getGroupULZAiWs(), null);
    }

    private final void startGroup(int i, Object obj) {
        m993startBaiHCIY(i, obj, GroupKind.Companion.m1000getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m993startBaiHCIY(125, null, GroupKind.Companion.m1001getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m993startBaiHCIY(125, null, GroupKind.Companion.m1002getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(drO<? extends T> dro) {
        validateNodeExpected();
        if (getInserting()) {
            int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            this.insertFixups.createAndInsertNode(dro, peek, anchor);
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            Object node = getNode(this.reader);
            this.changeListWriter.moveDown(node);
            if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
                this.changeListWriter.useNode(node);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i, Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i && !C8632dsu.c(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m993startBaiHCIY(i, null, GroupKind.Companion.m1000getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    public final void endReuseFromRoot() {
        if (this.isComposing || this.reusingGroup != 100) {
            throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i2) {
                    return;
                }
                end(slotWriter.isNode(parent));
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i) {
                    return;
                }
                end(slotReader.isNode(parent2));
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v, drX<? super T, ? super V, dpR> drx) {
        if (getInserting()) {
            this.insertFixups.updateNode(v, drx);
        } else {
            this.changeListWriter.updateNode(v, drx);
        }
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.Companion.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(Object obj) {
        if (C8632dsu.c(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changedInstance(Object obj) {
        if (nextSlot() != obj) {
            updateValue(obj);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(float f) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            return;
        }
        this.changeListWriter.updateValue(obj, this.reader.getGroupSlotIndex() - 1);
    }

    public final void updateCachedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            if (getInserting()) {
                this.changeListWriter.remember((RememberObserver) obj);
            }
            this.abandonSet.add(obj);
            obj = new RememberObserverHolder((RememberObserver) obj);
        }
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(drO<dpR> dro) {
        this.changeListWriter.sideEffect(dro);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && C8632dsu.c(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    C8632dsu.d(groupAux);
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i > 0) {
                if (this.reader.groupKey(i) == 202 && C8632dsu.c(this.reader.groupObjectKey(i), ComposerKt.getCompositionLocalMap())) {
                    IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(i)) == null) {
                        Object groupAux2 = this.reader.groupAux(i);
                        C8632dsu.d(groupAux2);
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i = this.reader.parent(i);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r5 == r9) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Composer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startProvider(androidx.compose.runtime.ProvidedValue<?> r9) {
        /*
            r8 = this;
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = r8.currentCompositionLocalScope()
            r1 = 201(0xc9, float:2.82E-43)
            java.lang.Object r2 = androidx.compose.runtime.ComposerKt.getProvider()
            r8.startGroup(r1, r2)
            java.lang.Object r1 = r8.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            boolean r2 = o.C8632dsu.c(r1, r2)
            if (r2 == 0) goto L1f
            r1 = 0
            goto L24
        L1f:
            o.C8632dsu.d(r1)
            androidx.compose.runtime.State r1 = (androidx.compose.runtime.State) r1
        L24:
            androidx.compose.runtime.CompositionLocal r2 = r9.getCompositionLocal()
            o.C8632dsu.d(r2)
            java.lang.Object r3 = r9.getValue()
            androidx.compose.runtime.State r3 = r2.updatedStateOf$runtime_release(r3, r1)
            boolean r1 = o.C8632dsu.c(r3, r1)
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L3e
            r8.updateRememberedValue(r3)
        L3e:
            boolean r5 = r8.getInserting()
            r6 = 0
            if (r5 == 0) goto L4d
            androidx.compose.runtime.PersistentCompositionLocalMap r9 = r0.putValue(r2, r3)
            r8.writerHasAProvider = r4
        L4b:
            r4 = r6
            goto L7d
        L4d:
            androidx.compose.runtime.SlotReader r5 = r8.reader
            int r7 = r5.getCurrentGroup()
            java.lang.Object r5 = r5.groupAux(r7)
            o.C8632dsu.d(r5)
            androidx.compose.runtime.PersistentCompositionLocalMap r5 = (androidx.compose.runtime.PersistentCompositionLocalMap) r5
            boolean r7 = r8.getSkipping()
            if (r7 == 0) goto L64
            if (r1 == 0) goto L71
        L64:
            boolean r9 = r9.getCanOverride()
            if (r9 != 0) goto L73
            boolean r9 = androidx.compose.runtime.CompositionLocalMapKt.contains(r0, r2)
            if (r9 != 0) goto L71
            goto L73
        L71:
            r9 = r5
            goto L77
        L73:
            androidx.compose.runtime.PersistentCompositionLocalMap r9 = r0.putValue(r2, r3)
        L77:
            boolean r0 = r8.reusing
            if (r0 != 0) goto L7d
            if (r5 == r9) goto L4b
        L7d:
            if (r4 == 0) goto L88
            boolean r0 = r8.getInserting()
            if (r0 != 0) goto L88
            r8.recordProviderUpdate(r9)
        L88:
            androidx.compose.runtime.IntStack r0 = r8.providersInvalidStack
            boolean r1 = r8.providersInvalid
            int r1 = androidx.compose.runtime.ComposerKt.access$asInt(r1)
            r0.push(r1)
            r8.providersInvalid = r4
            r8.providerCache = r9
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()
            androidx.compose.runtime.GroupKind$Companion r1 = androidx.compose.runtime.GroupKind.Companion
            int r1 = r1.m1000getGroupULZAiWs()
            r2 = 202(0xca, float:2.83E-43)
            r8.m993startBaiHCIY(r2, r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.startProvider(androidx.compose.runtime.ProvidedValue):void");
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
        if (intMap == null) {
            intMap = new IntMap<>(0, 1, null);
            this.providerUpdates = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        if (o.C8632dsu.c(r7, r1) != false) goto L4;
     */
    @Override // androidx.compose.runtime.Composer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startProviders(androidx.compose.runtime.ProvidedValue<?>[] r7) {
        /*
            r6 = this;
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = r6.currentCompositionLocalScope()
            r1 = 201(0xc9, float:2.82E-43)
            java.lang.Object r2 = androidx.compose.runtime.ComposerKt.getProvider()
            r6.startGroup(r1, r2)
            boolean r1 = r6.getInserting()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            r1 = 4
            r4 = 0
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap$default(r7, r0, r4, r1, r4)
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = r6.updateProviderMapGroup(r0, r7)
            r6.writerHasAProvider = r2
        L21:
            r2 = r3
            goto L61
        L23:
            androidx.compose.runtime.SlotReader r1 = r6.reader
            java.lang.Object r1 = r1.groupGet(r3)
            o.C8632dsu.d(r1)
            androidx.compose.runtime.PersistentCompositionLocalMap r1 = (androidx.compose.runtime.PersistentCompositionLocalMap) r1
            androidx.compose.runtime.SlotReader r4 = r6.reader
            java.lang.Object r4 = r4.groupGet(r2)
            o.C8632dsu.d(r4)
            androidx.compose.runtime.PersistentCompositionLocalMap r4 = (androidx.compose.runtime.PersistentCompositionLocalMap) r4
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = androidx.compose.runtime.CompositionLocalMapKt.updateCompositionMap(r7, r0, r4)
            boolean r5 = r6.getSkipping()
            if (r5 == 0) goto L53
            boolean r5 = r6.reusing
            if (r5 != 0) goto L53
            boolean r4 = o.C8632dsu.c(r4, r7)
            if (r4 != 0) goto L4e
            goto L53
        L4e:
            r6.skipGroup()
            r7 = r1
            goto L21
        L53:
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = r6.updateProviderMapGroup(r0, r7)
            boolean r0 = r6.reusing
            if (r0 != 0) goto L61
            boolean r0 = o.C8632dsu.c(r7, r1)
            if (r0 != 0) goto L21
        L61:
            if (r2 == 0) goto L6c
            boolean r0 = r6.getInserting()
            if (r0 != 0) goto L6c
            r6.recordProviderUpdate(r7)
        L6c:
            androidx.compose.runtime.IntStack r0 = r6.providersInvalidStack
            boolean r1 = r6.providersInvalid
            int r1 = androidx.compose.runtime.ComposerKt.access$asInt(r1)
            r0.push(r1)
            r6.providersInvalid = r2
            r6.providerCache = r7
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()
            androidx.compose.runtime.GroupKind$Companion r1 = androidx.compose.runtime.GroupKind.Companion
            int r1 = r1.m1000getGroupULZAiWs()
            r2 = 202(0xca, float:2.83E-43)
            r6.m993startBaiHCIY(r2, r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.startProviders(androidx.compose.runtime.ProvidedValue[]):void");
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z = this.forceRecomposeScopes;
            boolean z2 = this.sourceInformationEnabled;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            CompositionContextHolder compositionContextHolder2 = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z, z2, compositionImpl != null ? compositionImpl.getObserverHolder$runtime_release() : null));
            updateValue(compositionContextHolder2);
            compositionContextHolder = compositionContextHolder2;
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    /* renamed from: start-BaiHCIY  reason: not valid java name */
    private final void m993startBaiHCIY(int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i, obj, obj2);
        GroupKind.Companion companion = GroupKind.Companion;
        boolean z = i2 != companion.m1000getGroupULZAiWs();
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(i, Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i, obj3, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj3 == null) {
                    obj3 = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i, obj3);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z, null);
            return;
        }
        boolean z2 = i2 == companion.m1001getNodeULZAiWs() && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z2 && groupKey == i && C8632dsu.c(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i, obj);
            if (!z2 && next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                this.changeListWriter.moveReaderRelativeTo(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    this.changeListWriter.moveCurrentGroup(groupIndex);
                }
                startReaderGroup(z, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(i, Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i, obj3, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj3 == null) {
                        obj3 = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i, obj3);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z, pending);
    }

    private final void enterGroup(boolean z, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i, boolean z) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i;
    }

    private final void end(boolean z) {
        Set set;
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = keyInfos.get(i2);
                if (!fastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = fastToSet;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            KeyInfo keyInfo2 = used.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i4) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list = used;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i4 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i4, updatedNodeCountOf);
                                } else {
                                    list = used;
                                }
                            } else {
                                list = used;
                                i2++;
                            }
                            i3++;
                            i4 += pending.updatedNodeCountOf(keyInfo2);
                            fastToSet = set;
                            used = list;
                        }
                        list = used;
                        fastToSet = set;
                        used = list;
                    }
                }
                i2++;
                list = used;
                fastToSet = set;
                used = list;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (z) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (z) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int i, int i2) {
        int updatedNodeCount = updatedNodeCount(i);
        if (updatedNodeCount != i2) {
            int size = this.pendingStack.getSize() - 1;
            while (i != -1) {
                int updatedNodeCount2 = updatedNodeCount(i) + (i2 - updatedNodeCount);
                updateNodeCount(i, updatedNodeCount2);
                int i3 = size;
                while (true) {
                    if (-1 < i3) {
                        Pending peek = this.pendingStack.peek(i3);
                        if (peek != null && peek.updateNodeCount(i, updatedNodeCount2)) {
                            size = i3 - 1;
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.reader.getParent();
                } else if (this.reader.isNode(i)) {
                    return;
                } else {
                    i = this.reader.parent(i);
                }
            }
        }
    }

    private final int nodeIndexOf(int i, int i2, int i3, int i4) {
        int parent = this.reader.parent(i2);
        while (parent != i3 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i4 = 0;
        }
        if (parent == i2) {
            return i4;
        }
        int updatedNodeCount = updatedNodeCount(parent);
        int nodeCount = this.reader.nodeCount(i2);
        int i5 = i4;
        loop1: while (i5 < (updatedNodeCount - nodeCount) + i4 && parent != i) {
            parent++;
            while (parent < i) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i >= groupSize) {
                    i5 += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
        }
        return i5;
    }

    private final int updatedNodeCount(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.reader.nodeCount(i) : i2;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || !mutableIntIntMap.contains(i)) {
            return 0;
        }
        return mutableIntIntMap.get(i);
    }

    private final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) != i2) {
            if (i < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i, i2);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                C8564dqg.b(iArr, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i] = i2;
        }
    }

    private final void recordUpsAndDowns(int i, int i2, int i3) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i, i2, i3);
        while (i > 0 && i != nearestCommonRootOf) {
            if (slotReader.isNode(i)) {
                this.changeListWriter.moveUp();
            }
            i = slotReader.parent(i);
        }
        doRecordDownsFor(i2, nearestCommonRootOf);
    }

    private final void doRecordDownsFor(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i), i2);
        if (this.reader.isNode(i)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, i));
        }
    }

    private final int compoundKeyOf(int i, int i2, int i3) {
        if (i == i2) {
            return i3;
        }
        int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, i);
        return groupCompoundKeyPart == 126665345 ? groupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(i), i2, i3), 3) ^ groupCompoundKeyPart;
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                if (groupObjectKey instanceof Enum) {
                    return ((Enum) groupObjectKey).ordinal();
                }
                if (groupObjectKey instanceof MovableContent) {
                    return 126665345;
                }
                return groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        return (groupKey != 207 || (groupAux = slotReader.groupAux(i)) == null || C8632dsu.c(groupAux, Composer.Companion.getEmpty())) ? groupKey : groupAux.hashCode();
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void skipToGroupEnd() {
        if (this.groupNodeCount == 0) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void deactivateToEndGroup(boolean z) {
        if (this.groupNodeCount == 0) {
            if (getInserting()) {
                return;
            }
            if (!z) {
                skipReaderToGroupEnd();
                return;
            }
            int currentGroup = this.reader.getCurrentGroup();
            int currentEnd = this.reader.getCurrentEnd();
            this.changeListWriter.deactivateCurrentGroup();
            ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
            this.reader.skipToGroupEnd();
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public Composer startRestartGroup(int i) {
        m993startBaiHCIY(i, null, GroupKind.Companion.m1000getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r0 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addRecomposeScope() {
        /*
            r3 = this;
            boolean r0 = r3.getInserting()
            if (r0 == 0) goto L22
            androidx.compose.runtime.ControlledComposition r0 = r3.getComposition()
            o.C8632dsu.d(r0)
            androidx.compose.runtime.RecomposeScopeImpl r1 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r0 = (androidx.compose.runtime.CompositionImpl) r0
            r1.<init>(r0)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r3.invalidateStack
            r0.push(r1)
            r3.updateValue(r1)
            int r0 = r3.compositionToken
            r1.start(r0)
            goto L74
        L22:
            java.util.List<androidx.compose.runtime.Invalidation> r0 = r3.invalidations
            androidx.compose.runtime.SlotReader r1 = r3.reader
            int r1 = r1.getParent()
            androidx.compose.runtime.Invalidation r0 = androidx.compose.runtime.ComposerKt.access$removeLocation(r0, r1)
            androidx.compose.runtime.SlotReader r1 = r3.reader
            java.lang.Object r1 = r1.next()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            boolean r2 = o.C8632dsu.c(r1, r2)
            if (r2 == 0) goto L52
            androidx.compose.runtime.ControlledComposition r1 = r3.getComposition()
            o.C8632dsu.d(r1)
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.CompositionImpl r1 = (androidx.compose.runtime.CompositionImpl) r1
            r2.<init>(r1)
            r3.updateValue(r2)
            goto L58
        L52:
            o.C8632dsu.d(r1)
            r2 = r1
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
        L58:
            if (r0 != 0) goto L66
            boolean r0 = r2.getForcedRecompose()
            r1 = 0
            if (r0 == 0) goto L64
            r2.setForcedRecompose(r1)
        L64:
            if (r0 == 0) goto L67
        L66:
            r1 = 1
        L67:
            r2.setRequiresRecompose(r1)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r3.invalidateStack
            r0.push(r2)
            int r0 = r3.compositionToken
            r2.start(r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    @Override // androidx.compose.runtime.Composer
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        drM<Composition, dpR> end;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl pop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (pop != null) {
            pop.setRequiresRecompose(false);
        }
        if (pop != null && (end = pop.end(this.compositionToken)) != null) {
            this.changeListWriter.endCompositionScope(end, getComposition());
        }
        if (pop != null && !pop.getSkipped$runtime_release() && (pop.getUsed() || this.forceRecomposeScopes)) {
            if (pop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                pop.setAnchor(anchor);
            }
            pop.setDefaultsInvalid(false);
            recomposeScopeImpl = pop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        C8632dsu.d(movableContent);
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        recordProviderUpdate(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invokeMovableContentLambda(final androidx.compose.runtime.MovableContent<java.lang.Object> r12, androidx.compose.runtime.PersistentCompositionLocalMap r13, final java.lang.Object r14, boolean r15) {
        /*
            r11 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r11.startMovableGroup(r0, r12)
            r11.updateSlot(r14)
            int r1 = r11.getCompoundKeyHash()
            r2 = 0
            r11.compoundKeyHash = r0     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1d
            androidx.compose.runtime.SlotWriter r0 = r11.writer     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotWriter.markGroup$default(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L9b
        L1d:
            boolean r0 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L24
            goto L31
        L24:
            androidx.compose.runtime.SlotReader r0 = r11.reader     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = r0.getGroupAux()     // Catch: java.lang.Throwable -> L9b
            boolean r0 = o.C8632dsu.c(r0, r13)     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L36
            r11.recordProviderUpdate(r13)     // Catch: java.lang.Throwable -> L9b
        L36:
            java.lang.Object r0 = androidx.compose.runtime.ComposerKt.getCompositionLocalMap()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.GroupKind$Companion r5 = androidx.compose.runtime.GroupKind.Companion     // Catch: java.lang.Throwable -> L9b
            int r5 = r5.m1000getGroupULZAiWs()     // Catch: java.lang.Throwable -> L9b
            r6 = 202(0xca, float:2.83E-43)
            r11.m993startBaiHCIY(r6, r0, r5, r13)     // Catch: java.lang.Throwable -> L9b
            r11.providerCache = r2     // Catch: java.lang.Throwable -> L9b
            boolean r13 = r11.getInserting()     // Catch: java.lang.Throwable -> L9b
            if (r13 == 0) goto L7b
            if (r15 != 0) goto L7b
            r11.writerHasAProvider = r4     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotWriter r13 = r11.writer     // Catch: java.lang.Throwable -> L9b
            int r15 = r13.getParent()     // Catch: java.lang.Throwable -> L9b
            int r15 = r13.parent(r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.Anchor r8 = r13.anchor(r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.MovableContentStateReference r13 = new androidx.compose.runtime.MovableContentStateReference     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ControlledComposition r6 = r11.getComposition()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.SlotTable r7 = r11.insertTable     // Catch: java.lang.Throwable -> L9b
            java.util.List r9 = o.C8570dqm.c()     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = r11.currentCompositionLocalScope()     // Catch: java.lang.Throwable -> L9b
            r3 = r13
            r4 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.CompositionContext r12 = r11.parentContext     // Catch: java.lang.Throwable -> L9b
            r12.insertMovableContent$runtime_release(r13)     // Catch: java.lang.Throwable -> L9b
            goto L90
        L7b:
            boolean r13 = r11.providersInvalid     // Catch: java.lang.Throwable -> L9b
            r11.providersInvalid = r3     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1 r15 = new androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1     // Catch: java.lang.Throwable -> L9b
            r15.<init>()     // Catch: java.lang.Throwable -> L9b
            r12 = 316014703(0x12d6006f, float:1.3505406E-27)
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r12, r4, r15)     // Catch: java.lang.Throwable -> L9b
            androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(r11, r12)     // Catch: java.lang.Throwable -> L9b
            r11.providersInvalid = r13     // Catch: java.lang.Throwable -> L9b
        L90:
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            return
        L9b:
            r12 = move-exception
            r11.endGroup()
            r11.providerCache = r2
            r11.compoundKeyHash = r1
            r11.endMovableGroup()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda(androidx.compose.runtime.MovableContent, androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object, boolean):void");
    }

    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, drO dro, int i, Object obj) {
        List i2;
        ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i & 4) != 0 ? null : num;
        List list2 = list;
        if ((i & 8) != 0) {
            i2 = C8569dql.i();
            list2 = i2;
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list2, dro);
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, drX<? super Composer, ? super Integer, dpR> drx) {
        if (this.changes.isEmpty()) {
            doCompose(identityArrayMap, drx);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void prepareCompose$runtime_release(drO<dpR> dro) {
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                dro.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap) {
        if (this.changes.isEmpty()) {
            if (identityArrayMap.isNotEmpty() || (!this.invalidations.isEmpty()) || this.forciblyRecompose) {
                doCompose(identityArrayMap, null);
                return this.changes.isNotEmpty();
            }
            return false;
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
            return;
        }
        this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
        this.insertFixups = new FixupList();
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, boolean z, int i2) {
        List filterToRange;
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i)) {
            int groupKey = slotReader.groupKey(i);
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) groupObjectKey;
                Object groupGet = slotReader.groupGet(i, 0);
                Anchor anchor = slotReader.anchor(i);
                filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i, slotReader.groupSize(i) + i);
                ArrayList arrayList = new ArrayList(filterToRange.size());
                int size = filterToRange.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Invalidation invalidation = (Invalidation) filterToRange.get(i3);
                    arrayList.add(dpD.a(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReference);
                if (z) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i2, i);
                    return 0;
                }
                return slotReader.nodeCount(i);
            } else if (groupKey == 206 && C8632dsu.c(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet2 = slotReader.groupGet(i, 0);
                CompositionContextHolder compositionContextHolder = groupGet2 instanceof CompositionContextHolder ? (CompositionContextHolder) groupGet2 : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i);
            } else if (!slotReader.isNode(i)) {
                return slotReader.nodeCount(i);
            }
        } else if (slotReader.containsMark(i)) {
            int groupSize = slotReader.groupSize(i);
            int i4 = 0;
            for (int i5 = i + 1; i5 < groupSize + i; i5 += slotReader.groupSize(i5)) {
                boolean isNode = slotReader.isNode(i5);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i5));
                }
                i4 += reportFreeMovableContent$reportGroup(composerImpl, i5, isNode || z, isNode ? 0 : i2 + i4);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (!slotReader.isNode(i)) {
                return i4;
            }
        } else if (!slotReader.isNode(i)) {
            return slotReader.nodeCount(i);
        }
        return 1;
    }

    private final void reportFreeMovableContent(int i) {
        reportFreeMovableContent$reportGroup(this, i, false, 0);
        this.changeListWriter.endNodeMovement();
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                composerChangeListWriter.setChangeList(changeList);
                reportFreeMovableContent(0);
                this.changeListWriter.releaseMovableContent();
                composerChangeListWriter.setChangeList(changeList2);
                dpR dpr = dpR.c;
            } finally {
                openReader.close();
            }
        }
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (this.pendingStack.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        private final CompositionContextImpl ref;

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        public CompositionContextImpl(int i, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : this.composers) {
                        for (Set<CompositionData> set2 : set) {
                            set2.remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            C8632dsu.d(composer);
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    C8632dsu.d(composer);
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            dsH.b(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public dqZ getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition controlledComposition, drX<? super Composer, ? super Integer, dpR> drx) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, drx);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
            Set set2 = this.inspectionTables;
            if (set2 == null) {
                set2 = new HashSet();
                this.inspectionTables = set2;
            }
            set2.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(controlledComposition);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !C8632dsu.c(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(obj2.hashCode());
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(i);
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i) {
        this.compoundKeyHash = i ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207 && !C8632dsu.c(obj2, Composer.Companion.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(obj2.hashCode());
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(i);
            }
        } else if (obj instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) obj).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(obj.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i) ^ getCompoundKeyHash(), 3);
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            dpR dpr = dpR.c;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder = persistentCompositionLocalMap.builder();
        builder.putAll(persistentCompositionLocalMap2);
        ?? build = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(build);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return build;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        List<? extends Object> collectNodesFrom;
        SlotReader slotReader;
        IntMap intMap;
        SlotReader slotReader2;
        int[] iArr;
        ChangeList changeList3;
        ComposerChangeListWriter composerChangeListWriter3;
        boolean implicitRootStart;
        int i;
        ControlledComposition composition$runtime_release;
        ControlledComposition composition$runtime_release2;
        int currentGroup;
        int i2;
        SlotTable slotTable$runtime_release2;
        SlotReader slotReader3;
        final ChangeList changeList4;
        ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
        ChangeList changeList5 = this.lateChanges;
        ChangeList changeList6 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList5);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i4);
                    final MovableContentStateReference b = pair.b();
                    MovableContentStateReference c = pair.c();
                    Anchor anchor$runtime_release2 = b.getAnchor$runtime_release();
                    int anchorIndex = b.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                    IntRef intRef = new IntRef(i3, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime_release2);
                    if (c == null) {
                        if (C8632dsu.c(b.getSlotTable$runtime_release(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader openReader = b.getSlotTable$runtime_release().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            changeList4 = new ChangeList();
                            slotReader3 = openReader;
                        } catch (Throwable th) {
                            th = th;
                            slotReader3 = openReader;
                        }
                        try {
                            recomposeMovableContent$default(this, null, null, null, null, new drO<dpR>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
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
                                    ComposerChangeListWriter composerChangeListWriter5;
                                    ComposerChangeListWriter composerChangeListWriter6;
                                    composerChangeListWriter5 = ComposerImpl.this.changeListWriter;
                                    ChangeList changeList7 = changeList4;
                                    ComposerImpl composerImpl = ComposerImpl.this;
                                    SlotReader slotReader4 = openReader;
                                    MovableContentStateReference movableContentStateReference = b;
                                    ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                    try {
                                        composerChangeListWriter5.setChangeList(changeList7);
                                        SlotReader reader$runtime_release = composerImpl.getReader$runtime_release();
                                        int[] iArr2 = composerImpl.nodeCountOverrides;
                                        IntMap intMap2 = composerImpl.providerUpdates;
                                        composerImpl.nodeCountOverrides = null;
                                        composerImpl.providerUpdates = null;
                                        composerImpl.setReader$runtime_release(slotReader4);
                                        composerChangeListWriter6 = composerImpl.changeListWriter;
                                        boolean implicitRootStart2 = composerChangeListWriter6.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(false);
                                            composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
                                            composerChangeListWriter6.setImplicitRootStart(implicitRootStart2);
                                            dpR dpr = dpR.c;
                                            composerImpl.setReader$runtime_release(reader$runtime_release);
                                            composerImpl.nodeCountOverrides = iArr2;
                                            composerImpl.providerUpdates = intMap2;
                                        } catch (Throwable th2) {
                                            composerChangeListWriter6.setImplicitRootStart(implicitRootStart2);
                                            throw th2;
                                        }
                                    } finally {
                                        composerChangeListWriter5.setChangeList(changeList8);
                                    }
                                }
                            }, 15, null);
                            this.changeListWriter.includeOperationsIn(changeList4, intRef);
                            dpR dpr = dpR.c;
                            slotReader3.close();
                            i = size;
                            composerChangeListWriter2 = composerChangeListWriter4;
                            changeList2 = changeList6;
                            i2 = i4;
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader3.close();
                            throw th;
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(c);
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                            slotTable$runtime_release = c.getSlotTable$runtime_release();
                        }
                        if (movableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                            anchor$runtime_release = c.getAnchor$runtime_release();
                        }
                        collectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                        if (!collectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            if (C8632dsu.c(b.getSlotTable$runtime_release(), this.slotTable)) {
                                int anchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                                updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime_release, this.parentContext, c, b);
                        SlotReader openReader2 = slotTable$runtime_release.openReader();
                        try {
                            SlotReader reader$runtime_release = getReader$runtime_release();
                            int[] iArr2 = this.nodeCountOverrides;
                            IntMap intMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(openReader2);
                                int anchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                                openReader2.reposition(anchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    composerChangeListWriter3 = this.changeListWriter;
                                    composerChangeListWriter2 = composerChangeListWriter4;
                                    try {
                                        implicitRootStart = composerChangeListWriter3.getImplicitRootStart();
                                        i = size;
                                        try {
                                            composerChangeListWriter3.setImplicitRootStart(false);
                                            composition$runtime_release = c.getComposition$runtime_release();
                                            composition$runtime_release2 = b.getComposition$runtime_release();
                                            currentGroup = openReader2.getCurrentGroup();
                                            changeList2 = changeList6;
                                            changeList3 = changeList8;
                                            i2 = i4;
                                            slotReader = openReader2;
                                            iArr = iArr2;
                                            slotReader2 = reader$runtime_release;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            intMap = intMap2;
                                            slotReader2 = reader$runtime_release;
                                            slotReader = openReader2;
                                            changeList3 = changeList8;
                                            iArr = iArr2;
                                        }
                                        try {
                                            recomposeMovableContent(composition$runtime_release, composition$runtime_release2, Integer.valueOf(currentGroup), c.getInvalidations$runtime_release(), new drO<dpR>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
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
                                                    ComposerImpl.this.invokeMovableContentLambda(b.getContent$runtime_release(), b.getLocals$runtime_release(), b.getParameter$runtime_release(), true);
                                                }
                                            });
                                        } catch (Throwable th4) {
                                            th = th4;
                                            intMap = intMap2;
                                            try {
                                                composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                try {
                                                    composerChangeListWriter5.setChangeList(changeList3);
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    setReader$runtime_release(slotReader2);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        intMap = intMap2;
                                        slotReader2 = reader$runtime_release;
                                        slotReader = openReader2;
                                        changeList3 = changeList8;
                                        iArr = iArr2;
                                        composerChangeListWriter5.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    intMap = intMap2;
                                    slotReader2 = reader$runtime_release;
                                }
                                try {
                                    composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                    try {
                                        composerChangeListWriter5.setChangeList(changeList3);
                                        this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                        dpR dpr2 = dpR.c;
                                        try {
                                            setReader$runtime_release(slotReader2);
                                            this.nodeCountOverrides = iArr;
                                            this.providerUpdates = intMap2;
                                            try {
                                                slotReader.close();
                                            } catch (Throwable th9) {
                                                th = th9;
                                                composerChangeListWriter = composerChangeListWriter2;
                                                changeList = changeList2;
                                                composerChangeListWriter.setChangeList(changeList);
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            slotReader.close();
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        intMap = intMap2;
                                        setReader$runtime_release(slotReader2);
                                        this.nodeCountOverrides = iArr;
                                        this.providerUpdates = intMap;
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    intMap = intMap2;
                                    composerChangeListWriter5.setChangeList(changeList3);
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                intMap = intMap2;
                                slotReader2 = reader$runtime_release;
                                slotReader = openReader2;
                                iArr = iArr2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            slotReader = openReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i4 = i2 + 1;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    size = i;
                    changeList6 = changeList2;
                    i3 = 0;
                } catch (Throwable th15) {
                    th = th15;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList6;
                }
            }
            ComposerChangeListWriter composerChangeListWriter6 = composerChangeListWriter4;
            ChangeList changeList9 = changeList6;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter6.setChangeList(changeList9);
        } catch (Throwable th16) {
            th = th16;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r11 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r11, androidx.compose.runtime.ControlledComposition r12, java.lang.Integer r13, java.util.List<kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>>> r14, o.drO<? extends R> r15) {
        /*
            r10 = this;
            boolean r0 = r10.isComposing
            int r1 = r10.nodeIndex
            r2 = 1
            r10.isComposing = r2     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            r10.nodeIndex = r2     // Catch: java.lang.Throwable -> L5b
            int r3 = r14.size()     // Catch: java.lang.Throwable -> L5b
            r4 = r2
        Lf:
            if (r4 >= r3) goto L42
            java.lang.Object r5 = r14.get(r4)     // Catch: java.lang.Throwable -> L5b
            kotlin.Pair r5 = (kotlin.Pair) r5     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.b()     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.collection.IdentityArraySet r5 = (androidx.compose.runtime.collection.IdentityArraySet) r5     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L3b
            java.lang.Object[] r7 = r5.getValues()     // Catch: java.lang.Throwable -> L5b
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L5b
            r8 = r2
        L2e:
            if (r8 >= r5) goto L3f
            r9 = r7[r8]     // Catch: java.lang.Throwable -> L5b
            o.C8632dsu.d(r9)     // Catch: java.lang.Throwable -> L5b
            r10.tryImminentInvalidation$runtime_release(r6, r9)     // Catch: java.lang.Throwable -> L5b
            int r8 = r8 + 1
            goto L2e
        L3b:
            r5 = 0
            r10.tryImminentInvalidation$runtime_release(r6, r5)     // Catch: java.lang.Throwable -> L5b
        L3f:
            int r4 = r4 + 1
            goto Lf
        L42:
            if (r11 == 0) goto L52
            if (r13 == 0) goto L4b
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L5b
            goto L4c
        L4b:
            r13 = -1
        L4c:
            java.lang.Object r11 = r11.delegateInvalidations(r12, r13, r15)     // Catch: java.lang.Throwable -> L5b
            if (r11 != 0) goto L56
        L52:
            java.lang.Object r11 = r15.invoke()     // Catch: java.lang.Throwable -> L5b
        L56:
            r10.isComposing = r0
            r10.nodeIndex = r1
            return r11
        L5b:
            r11 = move-exception
            r10.isComposing = r0
            r10.nodeIndex = r1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, o.drO):java.lang.Object");
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, drX<? super Composer, ? super Integer, dpR> drx) {
        Comparator comparator;
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.compositionToken = SnapshotKt.currentSnapshot().getId();
            this.providerUpdates = null;
            int size = identityArrayMap.getSize();
            int i = 0;
            while (true) {
                if (i >= size) {
                    List<Invalidation> list = this.invalidations;
                    comparator = ComposerKt.InvalidationLocationAscending;
                    C8575dqr.c(list, comparator);
                    this.nodeIndex = 0;
                    this.isComposing = true;
                    startRoot();
                    Object nextSlot = nextSlot();
                    if (nextSlot != drx && drx != null) {
                        updateValue(drx);
                    }
                    ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                    MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                    try {
                        derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                        if (drx != null) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, drx);
                            endGroup();
                        } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !C8632dsu.c(nextSlot, Composer.Companion.getEmpty())) {
                            startGroup(200, ComposerKt.getInvocation());
                            ActualJvm_jvmKt.invokeComposable(this, (drX) dsH.a(nextSlot, 2));
                            endGroup();
                        } else {
                            skipCurrentGroup();
                        }
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        endRoot();
                        this.isComposing = false;
                        this.invalidations.clear();
                        createFreshInsertTable();
                        dpR dpr = dpR.c;
                    } catch (Throwable th) {
                        derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                        throw th;
                    }
                } else {
                    Object obj = identityArrayMap.getKeys()[i];
                    C8632dsu.d(obj);
                    IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues()[i];
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    Anchor anchor = recomposeScopeImpl.getAnchor();
                    if (anchor == null) {
                        break;
                    }
                    this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation$runtime_release(), identityArraySet));
                    i++;
                }
            }
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }
}
