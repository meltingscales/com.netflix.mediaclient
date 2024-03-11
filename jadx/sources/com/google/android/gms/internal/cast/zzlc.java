package com.google.android.gms.internal.cast;

/* loaded from: classes2.dex */
public final class zzlc extends zzpt {
    private static final zzlc zzb;
    private int zze;
    private zzls zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zznl zzn;
    private int zzo;
    private int zzp;

    static {
        zzlc zzlcVar = new zzlc();
        zzb = zzlcVar;
        zzpt.zzA(zzlc.class, zzlcVar);
    }

    private zzlc() {
    }

    public static zzlb zza() {
        return (zzlb) zzb.zzr();
    }

    public static zzlb zzc(zzlc zzlcVar) {
        zzpq zzr = zzb.zzr();
        zzr.zzo(zzlcVar);
        return (zzlb) zzr;
    }

    public static zzlc zze() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzlc zzlcVar, zzls zzlsVar) {
        zzlsVar.getClass();
        zzlcVar.zzf = zzlsVar;
        zzlcVar.zze |= 1;
    }

    public static /* synthetic */ void zzg(zzlc zzlcVar, boolean z) {
        zzlcVar.zze |= 2;
        zzlcVar.zzg = z;
    }

    public static /* synthetic */ void zzh(zzlc zzlcVar, long j) {
        zzlcVar.zze |= 4;
        zzlcVar.zzh = j;
    }

    public static /* synthetic */ void zzi(zzlc zzlcVar, int i) {
        zzlcVar.zze |= 64;
        zzlcVar.zzl = i;
    }

    public static /* synthetic */ void zzj(zzlc zzlcVar, int i) {
        zzlcVar.zze |= 128;
        zzlcVar.zzm = i;
    }

    public static /* synthetic */ void zzk(zzlc zzlcVar, int i) {
        zzlcVar.zze |= 1024;
        zzlcVar.zzp = i;
    }

    @Override // com.google.android.gms.internal.cast.zzpt
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return zzpt.zzz(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဌ\t\u000bင\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfr.zza(), "zzk", zzfo.zza(), "zzl", "zzm", "zzn", "zzo", zzhe.zza(), "zzp"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzlb(null);
            } else {
                return new zzlc();
            }
        }
        return (byte) 1;
    }
}
