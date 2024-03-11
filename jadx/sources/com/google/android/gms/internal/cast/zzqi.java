package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzqi extends zzom implements RandomAccess, zzqj {
    public static final zzqj zza;
    private static final zzqi zzb;
    private final List zzc;

    static {
        zzqi zzqiVar = new zzqi(10);
        zzb = zzqiVar;
        zzqiVar.zzb();
        zza = zzqiVar;
    }

    public zzqi() {
        this(10);
    }

    private static String zzi(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzoy) {
            return ((zzoy) obj).zzm(zzqc.zzb);
        }
        return zzqc.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zza();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzqj) {
            collection = ((zzqj) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzi(remove);
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zza();
        return zzi(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.cast.zzqj
    public final zzqj zzd() {
        return zzc() ? new zzsi(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.zzqj
    public final Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzoy) {
            zzoy zzoyVar = (zzoy) obj;
            String zzm = zzoyVar.zzm(zzqc.zzb);
            if (zzoyVar.zzi()) {
                this.zzc.set(i, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzqc.zzh(bArr);
        if (zzqc.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.cast.zzqb
    public final /* synthetic */ zzqb zzg(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzqi(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.zzqj
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public zzqi(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzqi(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.cast.zzom, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
