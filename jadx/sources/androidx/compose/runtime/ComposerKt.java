package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C8576dqs;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes.dex */
public final class ComposerKt {
    private static CompositionTracer compositionTracer;
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");
    private static final Comparator<Invalidation> InvalidationLocationAscending = new Comparator() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int InvalidationLocationAscending$lambda$15;
            InvalidationLocationAscending$lambda$15 = ComposerKt.InvalidationLocationAscending$lambda$15((Invalidation) obj, (Invalidation) obj2);
            return InvalidationLocationAscending$lambda$15;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    public static final void traceEventStart(int i, int i2, int i3, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) next).getWrapped());
            }
            if (next instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) next).release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final void deactivateCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object node = slotWriter.node(currentGroup);
            if (node instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) node);
            }
            int access$slotIndex = SlotWriter.access$slotIndex(slotWriter, SlotWriter.access$getGroups$p(slotWriter), SlotWriter.access$groupIndexToAddress(slotWriter, currentGroup));
            int i = currentGroup + 1;
            int access$dataIndex = SlotWriter.access$dataIndex(slotWriter, SlotWriter.access$getGroups$p(slotWriter), SlotWriter.access$groupIndexToAddress(slotWriter, i));
            for (int i2 = access$slotIndex; i2 < access$dataIndex; i2++) {
                int i3 = i2 - access$slotIndex;
                Object obj = SlotWriter.access$getSlots$p(slotWriter)[SlotWriter.access$dataIndexToDataAddress(slotWriter, i2)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                    if (!(wrapped instanceof ReusableRememberObserver)) {
                        removeData(slotWriter, currentGroup, i3, obj);
                        rememberManager.forgetting(wrapped);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    removeData(slotWriter, currentGroup, i3, obj);
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i;
        }
    }

    private static final void removeData(SlotWriter slotWriter, int i, int i2, Object obj) {
        if (obj == slotWriter.set(i, i2, Composer.Companion.getEmpty())) {
            return;
        }
        composeRuntimeError("Slot table is out of sync".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    private static final <K, V> dpR remove(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k);
            }
            return dpR.c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        Object H;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet != null) {
            H = C8576dqs.H(linkedHashSet);
            V v = (V) H;
            if (v != null) {
                remove(hashMap, k, v);
                return v;
            }
        }
        return null;
    }

    private static final int findLocation(List<Invalidation> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int d = C8632dsu.d(list.get(i3).getLocation(), i);
            if (d < 0) {
                i2 = i3 + 1;
            } else if (d <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private static final int findInsertLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        return findLocation < 0 ? -(findLocation + 1) : findLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i2 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new Invalidation(recomposeScopeImpl, i, identityArraySet));
        } else if (obj == null) {
            list.get(findLocation).setInstances(null);
        } else {
            IdentityArraySet<Object> instances = list.get(findLocation).getInstances();
            if (instances != null) {
                instances.add(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        if (findInsertLocation < list.size()) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() < i2) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i) {
        int findLocation = findLocation(list, i);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i, int i2) {
        int findInsertLocation = findInsertLocation(list, i);
        while (findInsertLocation < list.size() && list.get(findInsertLocation).getLocation() < i2) {
            list.remove(findInsertLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int findInsertLocation = findInsertLocation(list, i); findInsertLocation < list.size(); findInsertLocation++) {
            Invalidation invalidation = list.get(findInsertLocation);
            if (invalidation.getLocation() >= i2) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$11$collectFromGroup(openReader, arrayList, slotTable.anchorIndex(anchor));
            dpR dpr = dpR.c;
            return arrayList;
        } finally {
            openReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$11$collectFromGroup(SlotReader slotReader, List<Object> list, int i) {
        if (slotReader.isNode(i)) {
            list.add(slotReader.node(i));
            return;
        }
        int i2 = i + 1;
        int groupSize = slotReader.groupSize(i);
        while (i2 < i + groupSize) {
            collectNodesFrom$lambda$11$collectFromGroup(slotReader, list, i2);
            i2 += slotReader.groupSize(i2);
        }
    }

    private static final int distanceFrom(SlotReader slotReader, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = slotReader.parent(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (slotReader.parent(i) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == i) {
            return i;
        }
        if (slotReader.parent(i) == slotReader.parent(i2)) {
            return slotReader.parent(i);
        }
        int distanceFrom = distanceFrom(slotReader, i, i3);
        int distanceFrom2 = distanceFrom(slotReader, i2, i3);
        for (int i4 = 0; i4 < distanceFrom - distanceFrom2; i4++) {
            i = slotReader.parent(i);
        }
        for (int i5 = 0; i5 < distanceFrom2 - distanceFrom; i5++) {
            i2 = slotReader.parent(i2);
        }
        while (i != i2) {
            i = slotReader.parent(i);
            i2 = slotReader.parent(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InvalidationLocationAscending$lambda$15(Invalidation invalidation, Invalidation invalidation2) {
        return C8632dsu.d(invalidation.getLocation(), invalidation2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new KotlinNothingValueException();
    }
}
