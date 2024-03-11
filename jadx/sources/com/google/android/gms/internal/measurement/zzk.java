package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class zzk extends zzq {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    @Override // com.google.android.gms.internal.measurement.zzn
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            this.zza.set(bundle);
            this.zzb = true;
            this.zza.notify();
        }
    }

    public final String zza(long j) {
        return (String) zza(zzb(j), String.class);
    }

    public final Bundle zzb(long j) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T zza(android.os.Bundle r3, java.lang.Class<T> r4) {
        /*
            if (r3 == 0) goto L32
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L32
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String r4 = "AM"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            android.util.Log.w(r4, r3, r0)
            throw r0
        L32:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzk.zza(android.os.Bundle, java.lang.Class):java.lang.Object");
    }
}
