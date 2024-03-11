package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzec {
    private final zzen zza;
    private final byte[] zzb;

    private zzec(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzen.zza(bArr);
    }

    public final zzen zzb() {
        return this.zza;
    }

    public final zzdu zza() {
        this.zza.zzb();
        return new zzee(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzec(int i, zzdx zzdxVar) {
        this(i);
    }
}
