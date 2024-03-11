package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes5.dex */
abstract class zzfy {
    private static final zzfy zza = new zzga();
    private static final zzfy zzb = new zzfz();

    private zzfy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfy zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfy zzb() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);
}
