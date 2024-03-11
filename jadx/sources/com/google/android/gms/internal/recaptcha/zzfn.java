package com.google.android.gms.internal.recaptcha;

import com.google.android.gms.internal.recaptcha.zzds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfn implements zzew {
    private final zzey zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfn(zzey zzeyVar, String str, Object[] objArr) {
        this.zza = zzeyVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.zzew
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzew
    public final zzey zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzew
    public final int zza() {
        return (this.zzd & 1) == 1 ? zzds.zzf.zzh : zzds.zzf.zzi;
    }
}
