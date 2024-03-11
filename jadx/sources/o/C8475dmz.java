package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C8475dmz;
import o.C8632dsu;

/* renamed from: o.dmz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8475dmz implements SaveableStateRegistry {
    private final Map<String, List<drO<Object>>> a;
    private final MutableState b;
    private final SnapshotStateMap<String, List<Object>> c;
    public static final c e = new c(null);
    private static final Saver<C8475dmz, Map<String, List<Object>>> d = SaverKt.Saver(new drX<SaverScope, C8475dmz, Map<String, ? extends List<? extends Object>>>() { // from class: com.slack.circuit.backstack.BackStackRecordLocalSaveableStateRegistry$Companion$Saver$1
        @Override // o.drX
        /* renamed from: b */
        public final Map<String, List<Object>> invoke(SaverScope saverScope, C8475dmz c8475dmz) {
            C8632dsu.c((Object) saverScope, "");
            C8632dsu.c((Object) c8475dmz, "");
            return c8475dmz.performSave();
        }
    }, new drM<Map<String, ? extends List<? extends Object>>, C8475dmz>() { // from class: com.slack.circuit.backstack.BackStackRecordLocalSaveableStateRegistry$Companion$Saver$2
        @Override // o.drM
        /* renamed from: b */
        public final C8475dmz invoke(Map<String, ? extends List<? extends Object>> map) {
            C8632dsu.c((Object) map, "");
            SnapshotStateMap mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
            mutableStateMapOf.putAll(map);
            return new C8475dmz(mutableStateMapOf);
        }
    });

    public C8475dmz(SnapshotStateMap<String, List<Object>> snapshotStateMap) {
        MutableState mutableStateOf$default;
        C8632dsu.c((Object) snapshotStateMap, "");
        this.c = snapshotStateMap;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.b = mutableStateOf$default;
        this.a = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        C8632dsu.c(obj, "");
        SaveableStateRegistry d2 = d();
        return !((d2 == null || d2.canBeSaved(obj)) ? false : true);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        Object y;
        List<Object> i;
        C8632dsu.c((Object) str, "");
        List<Object> remove = this.c.remove(str);
        if (remove != null) {
            y = C8576dqs.y(remove);
            if (remove.size() > 1) {
                SnapshotStateMap<String, List<Object>> snapshotStateMap = this.c;
                i = C8576dqs.i(remove, 1);
                snapshotStateMap.put(str, i);
                return y;
            }
            return y;
        }
        return null;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> k;
        k = dqE.k(this.c);
        c(k);
        return k;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, drO<? extends Object> dro) {
        boolean g;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        synchronized (this.a) {
            Map<String, List<drO<Object>>> map = this.a;
            List<drO<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(dro);
        }
        return new e(str, dro);
    }

    /* renamed from: o.dmz$e */
    /* loaded from: classes5.dex */
    public static final class e implements SaveableStateRegistry.Entry {
        final /* synthetic */ drO<Object> c;
        final /* synthetic */ String d;

        e(String str, drO<? extends Object> dro) {
            this.d = str;
            this.c = dro;
        }

        @Override // androidx.compose.runtime.saveable.SaveableStateRegistry.Entry
        public void unregister() {
            Map map = C8475dmz.this.a;
            C8475dmz c8475dmz = C8475dmz.this;
            String str = this.d;
            drO<Object> dro = this.c;
            synchronized (map) {
                List list = (List) c8475dmz.a.remove(str);
                if (list != null) {
                    list.remove(dro);
                }
                if (list != null && (!list.isEmpty())) {
                    c8475dmz.a.put(str, list);
                }
                dpR dpr = dpR.c;
            }
        }
    }

    public final void a() {
        c(this.c);
    }

    private final void c(Map<String, List<Object>> map) {
        ArrayList a;
        int d2;
        synchronized (this.a) {
            for (Map.Entry<String, List<drO<Object>>> entry : this.a.entrySet()) {
                String key = entry.getKey();
                List<drO<Object>> value = entry.getValue();
                if (value.size() == 1) {
                    Object invoke = value.get(0).invoke();
                    if (invoke != null) {
                        a = C8569dql.a(invoke);
                        map.put(key, a);
                    }
                } else {
                    d2 = C8572dqo.d(value, 10);
                    ArrayList arrayList = new ArrayList(d2);
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((drO) it.next()).invoke());
                    }
                    map.put(key, arrayList);
                }
            }
            dpR dpr = dpR.c;
        }
    }

    /* renamed from: o.dmz$c */
    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final Saver<C8475dmz, Map<String, List<Object>>> d() {
            return C8475dmz.d;
        }
    }

    public final SaveableStateRegistry d() {
        return (SaveableStateRegistry) this.b.getValue();
    }

    public final void a(SaveableStateRegistry saveableStateRegistry) {
        this.b.setValue(saveableStateRegistry);
    }
}
