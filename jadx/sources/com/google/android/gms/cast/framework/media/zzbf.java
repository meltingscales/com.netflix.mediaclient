package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.cast.internal.zzaq;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbf implements zzaq {
    final /* synthetic */ RemoteMediaClient zza;
    private com.google.android.gms.cast.zzr zzb;
    private final AtomicLong zzc = new AtomicLong((CastUtils.zzb() & 65535) * 10000);

    public zzbf(RemoteMediaClient remoteMediaClient) {
        this.zza = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.internal.zzaq
    public final long zza() {
        return this.zzc.getAndIncrement();
    }

    public final void zzc(com.google.android.gms.cast.zzr zzrVar) {
        this.zzb = zzrVar;
    }

    @Override // com.google.android.gms.cast.internal.zzaq
    public final void zzb(String str, String str2, final long j, String str3) {
        com.google.android.gms.cast.zzr zzrVar = this.zzb;
        if (zzrVar == null) {
            throw new IllegalStateException("Device is not connected");
        }
        zzrVar.zzh(str, str2).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.cast.framework.media.zzbe
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzap zzapVar;
                zzbf zzbfVar = zzbf.this;
                long j2 = j;
                int statusCode = exc instanceof ApiException ? ((ApiException) exc).getStatusCode() : 13;
                zzapVar = zzbfVar.zza.zzd;
                zzapVar.zzR(j2, statusCode);
            }
        });
    }
}
