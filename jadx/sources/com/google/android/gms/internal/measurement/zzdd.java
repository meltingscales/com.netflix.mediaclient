package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzdd<T> implements zzcz<T>, Serializable {
    @NullableDecl
    private final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(@NullableDecl T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final T zza() {
        return this.zza;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzdd) {
            T t = this.zza;
            T t2 = ((zzdd) obj).zza;
            if (t != t2) {
                return t != null && t.equals(t2);
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
