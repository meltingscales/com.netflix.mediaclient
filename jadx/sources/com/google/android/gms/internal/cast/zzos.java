package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
final class zzos extends zzov {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzos(byte[] bArr, int i, int i2) {
        super(bArr);
        zzoy.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.zzov, com.google.android.gms.internal.cast.zzoy
    public final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.cast.zzov
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.zzov, com.google.android.gms.internal.cast.zzoy
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.cast.zzov, com.google.android.gms.internal.cast.zzoy
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zza[i];
    }
}
