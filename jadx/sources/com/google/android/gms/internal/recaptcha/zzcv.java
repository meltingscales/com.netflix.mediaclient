package com.google.android.gms.internal.recaptcha;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcv extends zzct {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzl;

    private zzcv(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzl = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzg = i2 + i;
        this.zzi = i;
        this.zzj = i;
        this.zzf = z;
    }

    private final void zzz() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = i - this.zzj;
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzh = i4;
        this.zzg = i - i4;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final int zzu() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.recaptcha.zzct
    public final int zzc(int i) {
        if (i < 0) {
            throw zzdy.zzb();
        }
        int zzu = i + zzu();
        int i2 = this.zzl;
        if (zzu > i2) {
            throw zzdy.zza();
        }
        this.zzl = zzu;
        zzz();
        return i2;
    }
}
