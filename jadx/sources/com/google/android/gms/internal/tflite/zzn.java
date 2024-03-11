package com.google.android.gms.internal.tflite;

import android.content.Context;

/* loaded from: classes5.dex */
final class zzn extends zzr {
    private final Context zza;
    private final zzv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(Context context, zzv zzvVar) {
        this.zza = context;
        this.zzb = zzvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            return this.zza.equals(zzrVar.zza()) && this.zzb.equals(zzrVar.zzb());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + obj2 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.tflite.zzr
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.tflite.zzr
    public final zzv zzb() {
        return this.zzb;
    }
}
