package com.google.android.gms.internal.recaptcha;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzgm extends AbstractList<String> implements zzej, RandomAccess {
    private final zzej zza;

    public zzgm(zzej zzejVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final zzej zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzgl(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzgo(this);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzej
    public final List<?> zzd() {
        return this.zza.zzd();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
