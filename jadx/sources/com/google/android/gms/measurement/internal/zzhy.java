package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzlk;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* loaded from: classes5.dex */
public final class zzhy implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzhb zza;

    private zzhy(zzhb zzhbVar) {
        this.zza = zzhbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.zza.zzr().zzx().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data != null && data.isHierarchical()) {
                this.zza.zzp();
                String str = zzkm.zza(intent) ? "gs" : "auto";
                String queryParameter = data.getQueryParameter("referrer");
                boolean z = bundle == null;
                if (zzlk.zzb() && zzap.zzbz.zza(null).booleanValue()) {
                    this.zza.zzq().zza(new zzhx(this, z, data, str, queryParameter));
                } else {
                    zza(z, data, str, queryParameter);
                }
            }
        } catch (Exception e) {
            this.zza.zzr().zzf().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzi().zza(activity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: Exception -> 0x0195, TRY_ENTER, TryCatch #0 {Exception -> 0x0195, blocks: (B:2:0x0000, B:5:0x001b, B:7:0x0029, B:32:0x008f, B:34:0x009b, B:36:0x00ae, B:39:0x00b6, B:41:0x00bc, B:42:0x00d0, B:44:0x00d7, B:47:0x00e7, B:50:0x00f7, B:53:0x00ff, B:55:0x0105, B:56:0x0110, B:59:0x0117, B:63:0x0138, B:65:0x014d, B:64:0x013e, B:67:0x0153, B:69:0x0159, B:71:0x015f, B:73:0x0165, B:75:0x016b, B:77:0x0173, B:79:0x017b, B:81:0x0181, B:83:0x0187, B:9:0x0037, B:12:0x0044, B:14:0x004a, B:16:0x0050, B:18:0x0056, B:20:0x005c, B:22:0x0069, B:25:0x0071, B:27:0x007b, B:29:0x0085, B:26:0x0076), top: B:88:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117 A[Catch: Exception -> 0x0195, TRY_LEAVE, TryCatch #0 {Exception -> 0x0195, blocks: (B:2:0x0000, B:5:0x001b, B:7:0x0029, B:32:0x008f, B:34:0x009b, B:36:0x00ae, B:39:0x00b6, B:41:0x00bc, B:42:0x00d0, B:44:0x00d7, B:47:0x00e7, B:50:0x00f7, B:53:0x00ff, B:55:0x0105, B:56:0x0110, B:59:0x0117, B:63:0x0138, B:65:0x014d, B:64:0x013e, B:67:0x0153, B:69:0x0159, B:71:0x015f, B:73:0x0165, B:75:0x016b, B:77:0x0173, B:79:0x017b, B:81:0x0181, B:83:0x0187, B:9:0x0037, B:12:0x0044, B:14:0x004a, B:16:0x0050, B:18:0x0056, B:20:0x005c, B:22:0x0069, B:25:0x0071, B:27:0x007b, B:29:0x0085, B:26:0x0076), top: B:88:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(boolean r12, android.net.Uri r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.zza(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzi().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzi().zzb(activity);
        zzjo zzk = this.zza.zzk();
        zzk.zzq().zza(new zzjq(zzk, zzk.zzm().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (zzkt.zzb() && zzap.zzav.zza(null).booleanValue()) {
            this.zza.zzk().zzab();
            this.zza.zzi().zza(activity);
            return;
        }
        this.zza.zzi().zza(activity);
        this.zza.zzk().zzab();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzi().zzb(activity, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhy(zzhb zzhbVar, zzhd zzhdVar) {
        this(zzhbVar);
    }
}
