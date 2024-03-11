package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzfe implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzfc zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzfa zzf;

    public zzfe(zzfa zzfaVar, String str, URL url, byte[] bArr, Map<String, String> map, zzfc zzfcVar) {
        this.zzf = zzfaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfcVar);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzfcVar;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfe.run():void");
    }
}
