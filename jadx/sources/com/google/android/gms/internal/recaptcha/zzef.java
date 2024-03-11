package com.google.android.gms.internal.recaptcha;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzef<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzed> zza;

    private zzef(Map.Entry<K, zzed> entry) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzed.zza();
    }

    public final zzed zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzey)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zza.getValue().zza((zzey) obj);
    }
}
