package com.google.android.gms.internal.recaptcha;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcg extends zzci {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzch zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcg(zzch zzchVar) {
        this.zzc = zzchVar;
        this.zzb = zzchVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzcm
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
