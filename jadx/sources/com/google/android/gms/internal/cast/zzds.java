package com.google.android.gms.internal.cast;

/* loaded from: classes5.dex */
final class zzds extends zzdn {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzds(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzds) {
            return this.zza.equals(((zzds) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.cast.zzdn
    public final Object zza() {
        return this.zza;
    }
}
