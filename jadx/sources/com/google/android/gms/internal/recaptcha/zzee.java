package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzee<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzee(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zza.next();
        return next.getValue() instanceof zzed ? new zzef(next) : next;
    }
}
