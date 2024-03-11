package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzhq implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private boolean zzb;
    private Iterator<Map.Entry<Object, Object>> zzc;
    private final /* synthetic */ zzhi zzd;

    private zzhq(zzhi zzhiVar) {
        this.zzd = zzhiVar;
        this.zza = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zza + 1;
        list = this.zzd.zzb;
        if (i >= list.size()) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzf();
        int i = this.zza;
        list = this.zzd.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        zzhi zzhiVar = this.zzd;
        int i2 = this.zza;
        this.zza = i2 - 1;
        zzhiVar.zzc(i2);
    }

    private final Iterator<Map.Entry<Object, Object>> zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        List list;
        List list2;
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        list = this.zzd.zzb;
        if (i >= list.size()) {
            return zza().next();
        }
        list2 = this.zzd.zzb;
        return (Map.Entry) list2.get(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhq(zzhi zzhiVar, zzhh zzhhVar) {
        this(zzhiVar);
    }
}
