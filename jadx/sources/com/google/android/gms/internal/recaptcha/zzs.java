package com.google.android.gms.internal.recaptcha;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* loaded from: classes2.dex */
public final class zzs extends zzb implements zzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.recaptcha.internal.IRecaptchaService");
    }

    @Override // com.google.android.gms.internal.recaptcha.zzp
    public final void zza(zzn zznVar, String str) {
        Parcel zza = zza();
        zzd.zza(zza, zznVar);
        zza.writeString(str);
        zza(2, zza);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzp
    public final void zza(zzl zzlVar, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        Parcel zza = zza();
        zzd.zza(zza, zzlVar);
        zzd.zza(zza, recaptchaHandle);
        zzd.zza(zza, recaptchaAction);
        zza(3, zza);
    }

    @Override // com.google.android.gms.internal.recaptcha.zzp
    public final void zza(zzj zzjVar, RecaptchaHandle recaptchaHandle) {
        Parcel zza = zza();
        zzd.zza(zza, zzjVar);
        zzd.zza(zza, recaptchaHandle);
        zza(4, zza);
    }
}
