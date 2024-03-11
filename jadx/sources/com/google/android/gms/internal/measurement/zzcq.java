package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzcq extends zzcl<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcq(zzcr zzcrVar, String str, Boolean bool) {
        super(zzcrVar, str, bool, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzbw.zzb.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzbw.zzc.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 28 + valueOf.length());
        sb.append("Invalid boolean value for ");
        sb.append(zzb);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
