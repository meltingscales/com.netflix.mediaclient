package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
final class zzen extends zzei {
    private zzen() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.recaptcha.zzei
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.recaptcha.zzei
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzdz<E> zzc = zzc(obj, j);
        zzdz<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzdz<E> zzdzVar = zzc;
        zzdzVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zza = zzc.zza();
            zzdz<E> zzdzVar2 = zzc;
            if (!zza) {
                zzdzVar2 = zzc.zza(size2 + size);
            }
            zzdzVar2.addAll(zzc2);
            zzdzVar = zzdzVar2;
        }
        if (size > 0) {
            zzc2 = zzdzVar;
        }
        zzgn.zza(obj, j, zzc2);
    }

    private static <E> zzdz<E> zzc(Object obj, long j) {
        return (zzdz) zzgn.zzf(obj, j);
    }
}
