package com.google.android.gms.internal.recaptcha;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcp {
    private final zzcy zza;
    private final byte[] zzb;

    private zzcp(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzcy.zza(bArr);
    }

    public final zzcy zzb() {
        return this.zza;
    }

    public final zzch zza() {
        this.zza.zzb();
        return new zzcr(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcp(int i, zzcg zzcgVar) {
        this(i);
    }
}
