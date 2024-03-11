package com.google.android.gms.cast.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@VisibleForTesting
/* loaded from: classes2.dex */
public class zzd extends zzp {
    private final List zzb;

    public zzd(String str, String str2, String str3) {
        super(str, "MediaControlChannel", null);
        this.zzb = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb() {
        synchronized (this.zzb) {
            for (zzat zzatVar : this.zzb) {
                zzatVar.zzc(2002);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(zzat zzatVar) {
        this.zzb.add(zzatVar);
    }
}
