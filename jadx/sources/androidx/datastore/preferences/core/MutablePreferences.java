package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.drM;

/* loaded from: classes2.dex */
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public MutablePreferences() {
        this(null, false, 3, null);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public MutablePreferences(Map<Preferences.Key<?>, Object> map, boolean z) {
        C8632dsu.c((Object) map, "");
        this.preferencesMap = map;
        this.frozen = new AtomicBoolean(z);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (!(!this.frozen.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(Preferences.Key<T> key) {
        C8632dsu.c((Object) key, "");
        return (T) this.preferencesMap.get(key);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Map<Preferences.Key<?>, Object> asMap() {
        Map<Preferences.Key<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        C8632dsu.a(unmodifiableMap, "");
        return unmodifiableMap;
    }

    public final <T> void set(Preferences.Key<T> key, T t) {
        C8632dsu.c((Object) key, "");
        setUnchecked$datastore_preferences_core(key, t);
    }

    public final void setUnchecked$datastore_preferences_core(Preferences.Key<?> key, Object obj) {
        Set W;
        C8632dsu.c((Object) key, "");
        checkNotFrozen$datastore_preferences_core();
        if (obj == null) {
            remove(key);
        } else if (!(obj instanceof Set)) {
            this.preferencesMap.put(key, obj);
        } else {
            Map<Preferences.Key<?>, Object> map = this.preferencesMap;
            W = C8576dqs.W((Iterable) obj);
            Set unmodifiableSet = Collections.unmodifiableSet(W);
            C8632dsu.a(unmodifiableSet, "");
            map.put(key, unmodifiableSet);
        }
    }

    public final void putAll(Preferences.Pair<?>... pairArr) {
        C8632dsu.c((Object) pairArr, "");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : pairArr) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(Preferences.Key<T> key) {
        C8632dsu.c((Object) key, "");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return C8632dsu.c(this.preferencesMap, ((MutablePreferences) obj).preferencesMap);
        }
        return false;
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    public String toString() {
        String d;
        d = C8576dqs.d(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new drM<Map.Entry<Preferences.Key<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences$toString$1
            @Override // o.drM
            public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
                C8632dsu.c((Object) entry, "");
                return "  " + entry.getKey().getName() + " = " + entry.getValue();
            }
        }, 24, null);
        return d;
    }
}
