package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzg implements SessionManagerListener {
    final /* synthetic */ zzh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzg(zzh zzhVar, zzf zzfVar) {
        this.zza = zzhVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionEnded(Session session, int i) {
        zzh.zzj(this.zza, (CastSession) session, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionResumeFailed(Session session, int i) {
        zzh.zzj(this.zza, (CastSession) session, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionResumed(Session session, boolean z) {
        zzi zziVar;
        zzj zzjVar;
        zzi zziVar2;
        zzd zzdVar;
        this.zza.zzq((CastSession) session);
        zziVar = this.zza.zzg;
        Preconditions.checkNotNull(zziVar);
        zzh zzhVar = this.zza;
        zzjVar = zzhVar.zzc;
        zziVar2 = zzhVar.zzg;
        zzlk zzb = zzjVar.zzb(zziVar2, z);
        zzdVar = this.zza.zzb;
        zzdVar.zzb(zzb, 227);
        r2.zzg.zzc(this.zza.zzf);
        this.zza.zzs();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionResuming(Session session, String str) {
        SharedPreferences sharedPreferences;
        zzi zziVar;
        zzj zzjVar;
        zzi zziVar2;
        zzd zzdVar;
        CastSession castSession = (CastSession) session;
        zzh zzhVar = this.zza;
        sharedPreferences = zzhVar.zzf;
        zzh.zzk(zzhVar, sharedPreferences, str);
        zziVar = this.zza.zzg;
        Preconditions.checkNotNull(zziVar);
        zzh zzhVar2 = this.zza;
        zzjVar = zzhVar2.zzc;
        zziVar2 = zzhVar2.zzg;
        zzlk zzc = zzjVar.zzc(zziVar2);
        zzdVar = this.zza.zzb;
        zzdVar.zzb(zzc, 226);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionStartFailed(Session session, int i) {
        zzh.zzj(this.zza, (CastSession) session, i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionStarted(Session session, String str) {
        zzi zziVar;
        zzj zzjVar;
        zzi zziVar2;
        zzd zzdVar;
        this.zza.zzq((CastSession) session);
        zzh zzhVar = this.zza;
        zziVar = zzhVar.zzg;
        zziVar.zzf = str;
        zzjVar = zzhVar.zzc;
        zziVar2 = zzhVar.zzg;
        zzlk zza = zzjVar.zza(zziVar2);
        zzdVar = this.zza.zzb;
        zzdVar.zzb(zza, 222);
        r2.zzg.zzc(this.zza.zzf);
        this.zza.zzs();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionStarting(Session session) {
        zzi zziVar;
        zzj zzjVar;
        zzi zziVar2;
        zzd zzdVar;
        Logger logger;
        CastSession castSession = (CastSession) session;
        zziVar = this.zza.zzg;
        if (zziVar != null) {
            logger = zzh.zza;
            logger.w("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.zza.zzr(castSession);
        zzh zzhVar = this.zza;
        zzjVar = zzhVar.zzc;
        zziVar2 = zzhVar.zzg;
        zzlk zzd = zzjVar.zzd(zziVar2);
        zzdVar = this.zza.zzb;
        zzdVar.zzb(zzd, 221);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void onSessionSuspended(Session session, int i) {
        zzi zziVar;
        zzj zzjVar;
        zzi zziVar2;
        zzd zzdVar;
        this.zza.zzq((CastSession) session);
        zziVar = this.zza.zzg;
        Preconditions.checkNotNull(zziVar);
        zzh zzhVar = this.zza;
        zzjVar = zzhVar.zzc;
        zziVar2 = zzhVar.zzg;
        zzlk zze = zzjVar.zze(zziVar2, i);
        zzdVar = this.zza.zzb;
        zzdVar.zzb(zze, 225);
        r2.zzg.zzc(this.zza.zzf);
        this.zza.zzp();
    }
}
