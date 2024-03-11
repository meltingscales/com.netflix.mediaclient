package com.google.android.gms.recaptcha;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.recaptcha.zzac;
import com.google.android.gms.internal.recaptcha.zzai;
import com.google.android.gms.internal.recaptcha.zzaj;
import com.google.android.gms.internal.recaptcha.zzp;
import com.google.android.gms.internal.recaptcha.zzv;
import com.google.android.gms.internal.recaptcha.zzy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public class RecaptchaClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey<com.google.android.gms.internal.recaptcha.zzr> zza;
    private static final zzv zzb;
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.recaptcha.zzr, Api.ApiOptions.NoOptions> zzc;
    private static final Api<Api.ApiOptions.NoOptions> zzd;
    private final Context zze;
    private final zzac zzf;
    private final zzaj zzg;

    public RecaptchaClient(Activity activity) {
        super(activity, (Api<Api.ApiOptions>) zzd, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = activity;
        zzv zzvVar = zzb;
        this.zzf = new zzac(zzvVar);
        this.zzg = new zzaj(activity, zzvVar);
    }

    public Task<RecaptchaHandle> init(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall(this, str) { // from class: com.google.android.gms.recaptcha.zzg
            private final RecaptchaClient zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                RecaptchaClient recaptchaClient = this.zza;
                String str2 = this.zzb;
                ((zzp) ((com.google.android.gms.internal.recaptcha.zzr) obj).getService()).zza(new zzm(recaptchaClient, (TaskCompletionSource) obj2), str2);
            }
        }).setFeatures(zzb.zza).build());
    }

    public Task<RecaptchaResultData> execute(final RecaptchaHandle recaptchaHandle, final RecaptchaAction recaptchaAction) {
        return doRead(TaskApiCall.builder().run(new RemoteCall(this, recaptchaHandle, recaptchaAction) { // from class: com.google.android.gms.recaptcha.zzf
            private final RecaptchaClient zza;
            private final RecaptchaHandle zzb;
            private final RecaptchaAction zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = recaptchaHandle;
                this.zzc = recaptchaAction;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zza(this.zzb, this.zzc, (com.google.android.gms.internal.recaptcha.zzr) obj, (TaskCompletionSource) obj2);
            }
        }).setFeatures(zzb.zzb).build());
    }

    public Task<Boolean> close(final RecaptchaHandle recaptchaHandle) {
        return doRead(TaskApiCall.builder().run(new RemoteCall(this, recaptchaHandle) { // from class: com.google.android.gms.recaptcha.zzi
            private final RecaptchaClient zza;
            private final RecaptchaHandle zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = recaptchaHandle;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                RecaptchaClient recaptchaClient = this.zza;
                RecaptchaHandle recaptchaHandle2 = this.zzb;
                ((zzp) ((com.google.android.gms.internal.recaptcha.zzr) obj).getService()).zza(new zzo(recaptchaClient, (TaskCompletionSource) obj2), recaptchaHandle2);
            }
        }).setFeatures(zzb.zzc).build());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction, com.google.android.gms.internal.recaptcha.zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        ((zzp) zzrVar.getService()).zza(new zzl(this, taskCompletionSource), recaptchaHandle, new RecaptchaAction(recaptchaAction, zzai.zza(this.zze, recaptchaHandle.getSiteKey())));
    }

    static {
        Api.ClientKey<com.google.android.gms.internal.recaptcha.zzr> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        new zzy();
        zzb = zzy.zza();
        zzj zzjVar = new zzj();
        zzc = zzjVar;
        zzd = new Api<>("Recaptcha.API", zzjVar, clientKey);
    }
}
