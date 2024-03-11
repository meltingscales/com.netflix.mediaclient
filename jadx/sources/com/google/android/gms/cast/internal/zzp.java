package com.google.android.gms.cast.internal;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class zzp {
    protected final Logger zza;
    private final String zzb;
    private zzaq zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzp(String str, String str2, String str3) {
        CastUtils.throwIfInvalidNamespace(str);
        this.zzb = str;
        Logger logger = new Logger("MediaControlChannel");
        this.zza = logger;
        if (TextUtils.isEmpty(null)) {
            return;
        }
        logger.zzc(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzd() {
        zzaq zzaqVar = this.zzc;
        if (zzaqVar == null) {
            this.zza.e("Attempt to generate requestId without a sink", new Object[0]);
            return 0L;
        }
        return zzaqVar.zza();
    }

    public final String zze() {
        return this.zzb;
    }

    public void zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(String str, long j, String str2) {
        zzaq zzaqVar = this.zzc;
        if (zzaqVar == null) {
            this.zza.e("Attempt to send text message without a sink", new Object[0]);
        } else {
            zzaqVar.zzb(this.zzb, str, j, null);
        }
    }

    public final void zzh(zzaq zzaqVar) {
        this.zzc = zzaqVar;
        if (zzaqVar == null) {
            zzf();
        }
    }
}
