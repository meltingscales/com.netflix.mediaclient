package com.google.android.gms.internal.recaptcha;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzes<K, V> extends LinkedHashMap<K, V> {
    private static final zzes zzb;
    private boolean zza;

    private zzes() {
        this.zza = true;
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private zzes(Map<K, V> map) {
        super(map);
        this.zza = true;
    }

    public final void zza(zzes<K, V> zzesVar) {
        zze();
        if (zzesVar.isEmpty()) {
            return;
        }
        putAll(zzesVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zze();
        zzdv.zza(k);
        zzdv.zza(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k : map.keySet()) {
            zzdv.zza(k);
            zzdv.zza(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() != map.size()) {
                    return false;
                }
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    V value = entry.getValue();
                    Object obj2 = map.get(entry.getKey());
                    if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                        continue;
                    } else {
                        equals = value.equals(obj2);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzdv.zzc((byte[]) obj);
        }
        if (obj instanceof zzdu) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return i;
    }

    public final zzes<K, V> zzb() {
        return isEmpty() ? new zzes<>() : new zzes<>(this);
    }

    private final void zze() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzes zzesVar = new zzes();
        zzb = zzesVar;
        zzesVar.zza = false;
    }
}
