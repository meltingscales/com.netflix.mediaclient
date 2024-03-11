package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzeh implements Map, Serializable {
    private transient zzei zza;
    private transient zzei zzb;
    private transient zzea zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzeh zzc(Iterable iterable) {
        zzeg zzegVar = new zzeg(iterable instanceof Collection ? iterable.size() : 4);
        zzegVar.zza(iterable);
        zzef zzefVar = zzegVar.zzc;
        if (zzefVar == null) {
            zzeq zzh = zzeq.zzh(zzegVar.zzb, zzegVar.zza, zzegVar);
            zzef zzefVar2 = zzegVar.zzc;
            if (zzefVar2 == null) {
                return zzh;
            }
            throw zzefVar2.zza();
        }
        throw zzefVar.zza();
    }

    public static zzeh zzd() {
        return zzeq.zza;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzes.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* synthetic */ Set keySet() {
        zzei zzeiVar = this.zzb;
        if (zzeiVar == null) {
            zzei zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzeiVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    abstract zzea zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzea values() {
        zzea zzeaVar = this.zzc;
        if (zzeaVar == null) {
            zzea zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzeaVar;
    }

    abstract zzei zze();

    abstract zzei zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzei entrySet() {
        zzei zzeiVar = this.zza;
        if (zzeiVar == null) {
            zzei zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzeiVar;
    }
}
