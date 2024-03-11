package com.google.android.gms.internal.recaptcha;

/* loaded from: classes2.dex */
public final class zzeq<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzcy zzcyVar, zzet<K, V> zzetVar, K k, V v) {
        zzdl.zza(zzcyVar, zzetVar.zza, 1, k);
        zzdl.zza(zzcyVar, zzetVar.zzc, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzet<K, V> zzetVar, K k, V v) {
        return zzdl.zza(zzetVar.zza, 1, k) + zzdl.zza(zzetVar.zzc, 2, v);
    }
}
