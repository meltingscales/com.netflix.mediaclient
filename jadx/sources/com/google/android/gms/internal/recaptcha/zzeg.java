package com.google.android.gms.internal.recaptcha;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzeg extends zzcd<String> implements zzej, RandomAccess {
    private static final zzeg zza;
    private static final zzej zzb;
    private final List<Object> zzc;

    public zzeg() {
        this(10);
    }

    public zzeg(int i) {
        this(new ArrayList(i));
    }

    private zzeg(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzc();
        if (collection instanceof zzej) {
            collection = ((zzej) collection).zzd();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzc();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final Object zzb(int i) {
        return this.zzc.get(i);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzch) {
            return ((zzch) obj).zzb();
        }
        return zzdv.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final zzej zze() {
        return zza() ? new zzgm(this) : this;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzc();
        return zza(this.zzc.set(i, (String) obj));
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzc();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zza(remove);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, com.google.android.gms.internal.recaptcha.zzdz
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzc();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcd, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzdz
    public final /* synthetic */ zzdz zza(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzeg(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzch) {
            zzch zzchVar = (zzch) obj;
            String zzb2 = zzchVar.zzb();
            if (zzchVar.zzc()) {
                this.zzc.set(i, zzb2);
            }
            return zzb2;
        }
        byte[] bArr = (byte[]) obj;
        String zzb3 = zzdv.zzb(bArr);
        if (zzdv.zza(bArr)) {
            this.zzc.set(i, zzb3);
        }
        return zzb3;
    }

    static {
        zzeg zzegVar = new zzeg();
        zza = zzegVar;
        zzegVar.zzb();
        zzb = zzegVar;
    }
}
