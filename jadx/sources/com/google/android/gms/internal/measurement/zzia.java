package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class zzia extends AbstractList<String> implements zzfv, RandomAccess {
    private final zzfv zza;

    public zzia(zzfv zzfvVar) {
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final zzfv g_() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final void zza(zzdu zzduVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzhz(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzic(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final List<?> zzb() {
        return this.zza.zzb();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
