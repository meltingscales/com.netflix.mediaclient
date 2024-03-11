package androidx.datastore.preferences.core;

import java.util.Map;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes2.dex */
public abstract class Preferences {

    /* loaded from: classes2.dex */
    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> T get(Key<T> key);

    /* loaded from: classes2.dex */
    public static final class Key<T> {
        private final String name;

        public final String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }

        public Key(String str) {
            C8632dsu.c((Object) str, "");
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return C8632dsu.c((Object) this.name, (Object) ((Key) obj).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    public final MutablePreferences toMutablePreferences() {
        Map k;
        k = dqE.k(asMap());
        return new MutablePreferences(k, false);
    }

    public final Preferences toPreferences() {
        Map k;
        k = dqE.k(asMap());
        return new MutablePreferences(k, true);
    }
}
