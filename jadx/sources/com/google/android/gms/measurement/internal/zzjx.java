package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzjx {
    private final Clock zza;
    private long zzb;

    public zzjx(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.zza = clock;
    }

    public final void zzb() {
        this.zzb = 0L;
    }

    public final void zza() {
        this.zzb = this.zza.elapsedRealtime();
    }

    public final boolean zza(long j) {
        return this.zzb == 0 || this.zza.elapsedRealtime() - this.zzb >= 3600000;
    }
}
