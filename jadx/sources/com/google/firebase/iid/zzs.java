package com.google.firebase.iid;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzs {
    private final String zza;
    private final long zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public zzs(String str, long j) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzs) {
            zzs zzsVar = (zzs) obj;
            return this.zzb == zzsVar.zzb && this.zza.equals(zzsVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Long.valueOf(this.zzb));
    }
}
