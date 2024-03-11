package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzhh extends zzhi<Object, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry<Object, Object> zzb = zzb(i);
                if (((zzey) zzb.getKey()).zzd()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : zzd()) {
                if (((zzey) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
