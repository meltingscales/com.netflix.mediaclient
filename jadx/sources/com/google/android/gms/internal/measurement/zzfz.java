package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes5.dex */
final class zzfz extends zzfy {
    private zzfz() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfy
    public final <L> List<L> zza(Object obj, long j) {
        zzfl zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzfl zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzib.zza(obj, j, zza);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfy
    public final void zzb(Object obj, long j) {
        zzc(obj, j).h_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzfy
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzfl<E> zzc = zzc(obj, j);
        zzfl<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzfl<E> zzflVar = zzc;
        zzflVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zza = zzc.zza();
            zzfl<E> zzflVar2 = zzc;
            if (!zza) {
                zzflVar2 = zzc.zza(size2 + size);
            }
            zzflVar2.addAll(zzc2);
            zzflVar = zzflVar2;
        }
        if (size > 0) {
            zzc2 = zzflVar;
        }
        zzib.zza(obj, j, zzc2);
    }

    private static <E> zzfl<E> zzc(Object obj, long j) {
        return (zzfl) zzib.zzf(obj, j);
    }
}
