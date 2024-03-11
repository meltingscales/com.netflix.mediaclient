package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfs implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private Iterator<Map.Entry<Object, Object>> zzb;
    private final /* synthetic */ zzfq zzc;

    private zzfs(zzfq zzfqVar) {
        List list;
        this.zzc = zzfqVar;
        list = zzfqVar.zzb;
        this.zza = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.zza;
        if (i > 0) {
            list = this.zzc.zzb;
            if (i <= list.size()) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<Object, Object>> zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        List list;
        if (zza().hasNext()) {
            return zza().next();
        }
        list = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfs(zzfq zzfqVar, zzft zzftVar) {
        this(zzfqVar);
    }
}
