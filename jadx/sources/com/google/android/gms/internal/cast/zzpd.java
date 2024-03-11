package com.google.android.gms.internal.cast;

import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpd extends zzpg {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpd(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzb(byte b) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzd(int i, boolean z) {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zze(int i, zzoy zzoyVar) {
        zzq((i << 3) | 2);
        zzq(zzoyVar.zzd());
        zzoyVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzf(int i, int i2) {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
            bArr[i2 + 1] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            bArr[i2 + 2] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            this.zzd = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzh(int i, long j) {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            bArr[i] = (byte) (((int) j) & PrivateKeyType.INVALID);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & PrivateKeyType.INVALID);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & PrivateKeyType.INVALID);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & PrivateKeyType.INVALID);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & PrivateKeyType.INVALID);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & PrivateKeyType.INVALID);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & PrivateKeyType.INVALID);
            this.zzd = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & PrivateKeyType.INVALID);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzj(int i, int i2) {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzk(int i) {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzm(int i, String str) {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i = this.zzd;
        try {
            int zzA = zzpg.zzA(str.length() * 3);
            int zzA2 = zzpg.zzA(str.length());
            if (zzA2 == zzA) {
                int i2 = i + zzA2;
                this.zzd = i2;
                int zzb = zzsr.zzb(str, this.zzb, i2, this.zzc - i2);
                this.zzd = i;
                zzq((zzb - i) - zzA2);
                this.zzd = zzb;
                return;
            }
            zzq(zzsr.zzc(str));
            byte[] bArr = this.zzb;
            int i3 = this.zzd;
            this.zzd = zzsr.zzb(str, bArr, i3, this.zzc - i3);
        } catch (zzsq e) {
            this.zzd = i;
            zzE(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzpe(e2);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzo(int i, int i2) {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzp(int i, int i2) {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzr(int i, long j) {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzq(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr2 = this.zzb;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.cast.zzpg
    public final void zzs(long j) {
        boolean z;
        z = zzpg.zzc;
        if (z && this.zzc - this.zzd >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                zzsn.zzn(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            zzsn.zzn(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzpe(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr4 = this.zzb;
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
