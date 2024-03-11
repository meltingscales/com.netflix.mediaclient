package com.google.android.gms.internal.recaptcha;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzft extends zzfq<Object, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzft(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzfq
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry<Object, Object> zzb = zzb(i);
                if (((zzdn) zzb.getKey()).zzd()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : zzd()) {
                if (((zzdn) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
