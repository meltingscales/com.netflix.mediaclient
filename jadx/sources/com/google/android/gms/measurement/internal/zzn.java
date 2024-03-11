package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzn extends zzkb {
    private String zzb;
    private Set<Integer> zzc;
    private Map<Integer, zzp> zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzke zzkeVar) {
        super(zzkeVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    protected final boolean zze() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0625, code lost:
        if (r9 != false) goto L229;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> zza(java.lang.String r49, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> r50, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> r51, java.lang.Long r52) {
        /*
            Method dump skipped, instructions count: 1795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzn.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long):java.util.List");
    }

    private final zzp zza(int i) {
        if (this.zzd.containsKey(Integer.valueOf(i))) {
            return this.zzd.get(Integer.valueOf(i));
        }
        zzp zzpVar = new zzp(this, this.zzb, null);
        this.zzd.put(Integer.valueOf(i), zzpVar);
        return zzpVar;
    }

    private final boolean zza(int i, int i2) {
        if (this.zzd.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return zzp.zza(this.zzd.get(Integer.valueOf(i))).get(i2);
    }
}
