package com.google.android.gms.internal.recaptcha;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzcy extends zzce {
    private static final Logger zzb = Logger.getLogger(zzcy.class.getName());
    private static final boolean zzc = zzgn.zza();
    zzdb zza;

    public static zzcy zza(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zze(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzg(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i) {
        return 4;
    }

    private static long zzi(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int zzj(int i) {
        return 4;
    }

    private static int zzm(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public abstract int zza();

    public abstract void zza(byte b);

    public abstract void zza(int i);

    public abstract void zza(int i, int i2);

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzch zzchVar);

    public abstract void zza(int i, zzey zzeyVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzey zzeyVar, zzfp zzfpVar);

    public abstract void zza(int i, String str);

    public abstract void zza(int i, boolean z);

    public abstract void zza(long j);

    public abstract void zza(zzch zzchVar);

    public abstract void zza(zzey zzeyVar);

    public abstract void zza(String str);

    public abstract void zzb(int i);

    public abstract void zzb(int i, int i2);

    public abstract void zzb(int i, zzch zzchVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2);

    public abstract void zzc(int i, int i2);

    public abstract void zzc(int i, long j);

    public abstract void zzc(long j);

    public abstract void zzd(int i);

    public abstract void zze(int i, int i2);

    /* loaded from: classes2.dex */
    public static final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.zzcy.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzcy() {
    }

    public final void zzd(int i, int i2) {
        zzc(i, zzm(i2));
    }

    public final void zzb(int i, long j) {
        zza(i, zzi(j));
    }

    public final void zza(int i, float f) {
        zze(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzc(int i) {
        zzb(zzm(i));
    }

    /* loaded from: classes2.dex */
    static final class zza extends zzcy {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, int i2) {
            zzb((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzb(int i, int i2) {
            zza(i, 0);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzc(int i, int i2) {
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zze(int i, int i2) {
            zza(i, 5);
            zzd(i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, long j) {
            zza(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzc(int i, long j) {
            zza(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, boolean z) {
            zza(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, String str) {
            zza(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, zzch zzchVar) {
            zza(i, 2);
            zza(zzchVar);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(zzch zzchVar) {
            zzb(zzchVar.zza());
            zzchVar.zza(this);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzb(byte[] bArr, int i, int i2) {
            zzb(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        final void zza(int i, zzey zzeyVar, zzfp zzfpVar) {
            zza(i, 2);
            zzbz zzbzVar = (zzbz) zzeyVar;
            int zzd = zzbzVar.zzd();
            if (zzd == -1) {
                zzd = zzfpVar.zzb(zzbzVar);
                zzbzVar.zza(zzd);
            }
            zzb(zzd);
            zzfpVar.zza((zzfp) zzeyVar, (zzhe) this.zza);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i, zzey zzeyVar) {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzeyVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzb(int i, zzch zzchVar) {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzchVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(zzey zzeyVar) {
            zzb(zzeyVar.zzk());
            zzeyVar.zza(this);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(byte b) {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(int i) {
            if (i >= 0) {
                zzb(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzb(int i) {
            if (!zzcy.zzc || zzcc.zza() || zza() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i2 = this.zze;
                        this.zze = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                    }
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zze;
                this.zze = i4 + 1;
                zzgn.zza(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.zzb;
                int i5 = this.zze;
                this.zze = i5 + 1;
                zzgn.zza(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.zzb;
                    int i7 = this.zze;
                    this.zze = i7 + 1;
                    zzgn.zza(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.zzb;
                int i8 = this.zze;
                this.zze = i8 + 1;
                zzgn.zza(bArr6, i8, (byte) (i6 | 128));
                int i9 = i >>> 14;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzgn.zza(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzgn.zza(bArr8, i11, (byte) (i9 | 128));
                int i12 = i >>> 21;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.zzb;
                    int i13 = this.zze;
                    this.zze = i13 + 1;
                    zzgn.zza(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.zzb;
                int i14 = this.zze;
                this.zze = i14 + 1;
                zzgn.zza(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.zzb;
                int i15 = this.zze;
                this.zze = i15 + 1;
                zzgn.zza(bArr11, i15, (byte) (i >>> 28));
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzd(int i) {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                this.zze = i2 + 4;
                bArr[i2 + 3] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(long j) {
            if (zzcy.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zze;
                    this.zze = i + 1;
                    zzgn.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zze;
                this.zze = i2 + 1;
                zzgn.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zze;
            this.zze = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zzc(long j) {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                this.zze = i + 8;
                bArr[i + 7] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        private final void zzc(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i2);
                this.zze += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.recaptcha.zzce
        public final void zza(byte[] bArr, int i, int i2) {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.recaptcha.zzcy
        public final void zza(String str) {
            int i = this.zze;
            try {
                int zzg = zzcy.zzg(str.length() * 3);
                int zzg2 = zzcy.zzg(str.length());
                if (zzg2 == zzg) {
                    int i2 = i + zzg2;
                    this.zze = i2;
                    int zza = zzgq.zza(str, this.zzb, i2, zza());
                    this.zze = i;
                    zzb((zza - i) - zzg2);
                    this.zze = zza;
                    return;
                }
                zzb(zzgq.zza(str));
                this.zze = zzgq.zza(str, this.zzb, this.zze, zza());
            } catch (zzgt e) {
                this.zze = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    public final void zzb(long j) {
        zza(zzi(j));
    }

    public final void zza(float f) {
        zzd(Float.floatToRawIntBits(f));
    }

    public final void zza(double d) {
        zzc(Double.doubleToRawLongBits(d));
    }

    public final void zza(boolean z) {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public static int zzf(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzg(int i, int i2) {
        return zze(i) + zzg(i2);
    }

    public static int zzh(int i, int i2) {
        return zze(i) + zzg(zzm(i2));
    }

    public static int zzi(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zzj(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zze(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zzf(int i, long j) {
        return zze(i) + zze(zzi(j));
    }

    public static int zzg(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zze(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zze(i) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zze(i) + 1;
    }

    public static int zzk(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzb(int i, String str) {
        return zze(i) + zzb(str);
    }

    public static int zzc(int i, zzch zzchVar) {
        int zze = zze(i);
        int zza2 = zzchVar.zza();
        return zze + zzg(zza2) + zza2;
    }

    public static int zza(int i, zzeh zzehVar) {
        int zze = zze(i);
        int zzb2 = zzehVar.zzb();
        return zze + zzg(zzb2) + zzb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzey zzeyVar, zzfp zzfpVar) {
        return zze(i) + zza(zzeyVar, zzfpVar);
    }

    public static int zzb(int i, zzey zzeyVar) {
        return (zze(1) << 1) + zzg(2, i) + zze(3) + zzb(zzeyVar);
    }

    public static int zzd(int i, zzch zzchVar) {
        return (zze(1) << 1) + zzg(2, i) + zzc(3, zzchVar);
    }

    public static int zzb(int i, zzeh zzehVar) {
        return (zze(1) << 1) + zzg(2, i) + zza(3, zzehVar);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzg(i);
        }
        return 10;
    }

    public static int zzh(int i) {
        return zzg(zzm(i));
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzgq.zza(str);
        } catch (zzgt unused) {
            length = str.getBytes(zzdv.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zza(zzeh zzehVar) {
        int zzb2 = zzehVar.zzb();
        return zzg(zzb2) + zzb2;
    }

    public static int zzb(zzch zzchVar) {
        int zza2 = zzchVar.zza();
        return zzg(zza2) + zza2;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(zzey zzeyVar) {
        int zzk = zzeyVar.zzk();
        return zzg(zzk) + zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzey zzeyVar, zzfp zzfpVar) {
        zzbz zzbzVar = (zzbz) zzeyVar;
        int zzd = zzbzVar.zzd();
        if (zzd == -1) {
            zzd = zzfpVar.zzb(zzbzVar);
            zzbzVar.zza(zzd);
        }
        return zzg(zzd) + zzd;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzgt zzgtVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgtVar);
        byte[] bytes = str.getBytes(zzdv.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzey zzeyVar, zzfp zzfpVar) {
        int zze = zze(i);
        zzbz zzbzVar = (zzbz) zzeyVar;
        int zzd = zzbzVar.zzd();
        if (zzd == -1) {
            zzd = zzfpVar.zzb(zzbzVar);
            zzbzVar.zza(zzd);
        }
        return (zze << 1) + zzd;
    }

    @Deprecated
    public static int zzc(zzey zzeyVar) {
        return zzeyVar.zzk();
    }

    @Deprecated
    public static int zzl(int i) {
        return zzg(i);
    }
}
