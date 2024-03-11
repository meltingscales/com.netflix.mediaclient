package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzda<T> extends zzcy<T> {
    private final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzda(T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final T zzb() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzda) {
            return this.zza.equals(((zzda) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
