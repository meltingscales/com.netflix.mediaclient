package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzen extends zzei {
    private final transient zzeh zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzen(zzeh zzehVar, Object[] objArr, int i, int i2) {
        this.zza = zzehVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzea, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.zza.get(key));
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzei, com.google.android.gms.internal.cast.zzea, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzea
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzei, com.google.android.gms.internal.cast.zzea
    public final zzeu zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast.zzei
    final zzee zzi() {
        return new zzem(this);
    }
}
