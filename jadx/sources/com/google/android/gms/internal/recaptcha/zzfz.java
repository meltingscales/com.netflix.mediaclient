package com.google.android.gms.internal.recaptcha;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfz implements Comparable<zzfz>, Map.Entry<Object, Object> {
    private final Object zza;
    private Object zzb;
    private final /* synthetic */ zzfq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(zzfq zzfqVar, Map.Entry<Object, Object> entry) {
        this(zzfqVar, (Comparable) entry.getKey(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfz(zzfq zzfqVar, Object obj, Object obj2) {
        this.zzc = zzfqVar;
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzf();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzfz zzfzVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzfzVar.getKey());
    }
}
