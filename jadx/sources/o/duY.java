package o;

import java.util.Map;

/* loaded from: classes5.dex */
public interface duY<K, V> extends duU<K, V> {

    /* loaded from: classes5.dex */
    public interface d<K, V> extends Map<K, V>, dsP {
        duY<K, V> c();
    }

    d<K, V> a();

    duY<K, V> b(Map<? extends K, ? extends V> map);
}
