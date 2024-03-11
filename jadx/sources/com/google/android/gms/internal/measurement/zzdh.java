package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
final class zzdh extends WeakReference<Throwable> {
    private final int zza;

    public zzdh(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zza = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != zzdh.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzdh zzdhVar = (zzdh) obj;
        return this.zza == zzdhVar.zza && get() == zzdhVar.get();
    }
}
