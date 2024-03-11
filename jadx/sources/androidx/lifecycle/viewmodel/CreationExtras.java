package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* loaded from: classes2.dex */
    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }

    /* loaded from: classes.dex */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            C8632dsu.c((Object) key, "");
            return null;
        }

        private Empty() {
        }
    }
}
