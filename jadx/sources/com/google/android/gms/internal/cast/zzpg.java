package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzpg extends zzoo {
    private static final Logger zzb = Logger.getLogger(zzpg.class.getName());
    private static final boolean zzc = zzsn.zzx();
    zzph zza;

    private zzpg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpg(zzpf zzpfVar) {
    }

    public static int zzA(int i) {
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

    public static int zzB(long j) {
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

    public static zzpg zzC(byte[] bArr) {
        return new zzpd(bArr, 0, bArr.length);
    }

    public static int zzt(zzoy zzoyVar) {
        int zzd = zzoyVar.zzd();
        return zzA(zzd) + zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzu(int i, zzrb zzrbVar, zzrm zzrmVar) {
        int zzA = zzA(i << 3);
        zzol zzolVar = (zzol) zzrbVar;
        int zzn = zzolVar.zzn();
        if (zzn == -1) {
            zzn = zzrmVar.zza(zzolVar);
            zzolVar.zzp(zzn);
        }
        return zzA + zzA + zzn;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzw(zzqh zzqhVar) {
        int zza = zzqhVar.zza();
        return zzA(zza) + zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(zzrb zzrbVar, zzrm zzrmVar) {
        zzol zzolVar = (zzol) zzrbVar;
        int zzn = zzolVar.zzn();
        if (zzn == -1) {
            zzn = zzrmVar.zza(zzolVar);
            zzolVar.zzp(zzn);
        }
        return zzA(zzn) + zzn;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzsr.zzc(str);
        } catch (zzsq unused) {
            length = str.getBytes(zzqc.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i) {
        return zzA(i << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzE(String str, zzsq zzsqVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzsqVar);
        byte[] bytes = str.getBytes(zzqc.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzpe(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i, boolean z);

    public abstract void zze(int i, zzoy zzoyVar);

    public abstract void zzf(int i, int i2);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i, int i2);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i2);

    public abstract void zzm(int i, String str);

    public abstract void zzo(int i, int i2);

    public abstract void zzp(int i, int i2);

    public abstract void zzq(int i);

    public abstract void zzr(int i, long j);

    public abstract void zzs(long j);
}
