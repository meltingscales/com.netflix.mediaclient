package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.C8691duz;
import o.dqE;
import o.drM;
import o.drO;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableStateRegistryImpl implements SaveableStateRegistry {
    private final drM<Object, Boolean> canBeSaved;
    private final Map<String, List<Object>> restored;
    private final Map<String, List<drO<Object>>> valueProviders;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = o.dqE.k(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SaveableStateRegistryImpl(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r1, o.drM<java.lang.Object, java.lang.Boolean> r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.canBeSaved = r2
            if (r1 == 0) goto Ld
            java.util.Map r1 = o.dqF.d(r1)
            if (r1 != 0) goto L12
        Ld:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L12:
            r0.restored = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.valueProviders = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.SaveableStateRegistryImpl.<init>(java.util.Map, o.drM):void");
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.canBeSaved.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        List<Object> remove = this.restored.remove(str);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.restored.put(str, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(final String str, final drO<? extends Object> dro) {
        boolean g;
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<drO<Object>>> map = this.valueProviders;
        List<drO<Object>> list = map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            map.put(str, list);
        }
        list.add(dro);
        return new SaveableStateRegistry.Entry() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryImpl$registerProvider$3
            @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
            public void unregister() {
                Map map2;
                Map map3;
                map2 = SaveableStateRegistryImpl.this.valueProviders;
                List list2 = (List) map2.remove(str);
                if (list2 != null) {
                    list2.remove(dro);
                }
                if (list2 == null || !(!list2.isEmpty())) {
                    return;
                }
                map3 = SaveableStateRegistryImpl.this.valueProviders;
                map3.put(str, list2);
            }
        };
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> k;
        ArrayList a;
        k = dqE.k(this.restored);
        for (Map.Entry<String, List<drO<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<drO<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (!canBeSaved(invoke)) {
                    throw new IllegalStateException("item can't be saved".toString());
                } else {
                    a = C8569dql.a(invoke);
                    k.put(key, a);
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object invoke2 = value.get(i).invoke();
                    if (invoke2 != null && !canBeSaved(invoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(invoke2);
                }
                k.put(key, arrayList);
            }
        }
        return k;
    }
}
