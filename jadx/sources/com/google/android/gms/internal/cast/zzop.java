package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzop extends zzor {
    final /* synthetic */ zzoy zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzop(zzoy zzoyVar) {
        this.zza = zzoyVar;
        this.zzc = zzoyVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzot
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
