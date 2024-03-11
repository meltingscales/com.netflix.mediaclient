package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzeo extends zzei {
    private final transient zzeh zza;
    private final transient zzee zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeo(zzeh zzehVar, zzee zzeeVar) {
        this.zza = zzehVar;
        this.zzb = zzeeVar;
    }

    @Override // com.google.android.gms.internal.cast.zzea, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.cast.zzei, com.google.android.gms.internal.cast.zzea, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzea
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.cast.zzei, com.google.android.gms.internal.cast.zzea
    public final zzee zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzei, com.google.android.gms.internal.cast.zzea
    public final zzeu zze() {
        return this.zzb.listIterator(0);
    }
}
