package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
final class zzdi {
    private final ConcurrentHashMap<zzdh, List<Throwable>> zza = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzb = new ReferenceQueue<>();

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzb.poll();
        while (poll != null) {
            this.zza.remove(poll);
            poll = this.zzb.poll();
        }
        List<Throwable> list = this.zza.get(new zzdh(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zza.putIfAbsent(new zzdh(th, this.zzb), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
