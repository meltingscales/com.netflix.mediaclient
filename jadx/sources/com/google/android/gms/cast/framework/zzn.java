package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.zzx;
import com.google.android.gms.cast.zzbr;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn extends zzw {
    final /* synthetic */ CastSession zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzn(CastSession castSession, zzm zzmVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.framework.zzx
    public final void zzb(int i) {
        CastSession.zzh(this.zza, i);
    }

    @Override // com.google.android.gms.cast.framework.zzx
    public final void zzc(final String str, final String str2) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzh;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzh;
            final zzbr zzbrVar = (zzbr) zzrVar2;
            zzbrVar.doWrite(TaskApiCall.builder().run(new RemoteCall(str, str2, null) { // from class: com.google.android.gms.cast.zzbf
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzc;

                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzbr.this.zzF(this.zzb, this.zzc, null, (zzx) obj, (TaskCompletionSource) obj2);
                }
            }).setMethodKey(8407).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzk
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    CastSession.zzi(zzn.this.zza, "joinApplication", task);
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.framework.zzx
    public final void zzd(final String str, final LaunchOptions launchOptions) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzh;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzh;
            final zzbr zzbrVar = (zzbr) zzrVar2;
            zzbrVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbe
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzbr.this.zzG(str, launchOptions, (zzx) obj, (TaskCompletionSource) obj2);
                }
            }).setMethodKey(8406).build()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.framework.zzl
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    CastSession.zzi(zzn.this.zza, "launchApplication", task);
                }
            });
        }
    }

    @Override // com.google.android.gms.cast.framework.zzx
    public final void zze(final String str) {
        com.google.android.gms.cast.zzr zzrVar;
        com.google.android.gms.cast.zzr zzrVar2;
        CastSession castSession = this.zza;
        zzrVar = castSession.zzh;
        if (zzrVar != null) {
            zzrVar2 = castSession.zzh;
            final zzbr zzbrVar = (zzbr) zzrVar2;
            zzbrVar.doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.zzbc
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zzbr.this.zzM(str, (zzx) obj, (TaskCompletionSource) obj2);
                }
            }).setMethodKey(8409).build());
        }
    }
}
