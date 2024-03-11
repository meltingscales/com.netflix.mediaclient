package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzdx extends zzdz {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzdu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdx(zzdu zzduVar) {
        this.zzc = zzduVar;
        this.zzb = zzduVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzed
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
