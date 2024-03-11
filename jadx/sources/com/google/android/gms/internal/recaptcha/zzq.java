package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaHandle;

/* loaded from: classes2.dex */
public abstract class zzq extends zza implements zzn {
    public zzq() {
        super("com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    @Override // com.google.android.gms.internal.recaptcha.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza((Status) zzd.zza(parcel, Status.CREATOR), (RecaptchaHandle) zzd.zza(parcel, RecaptchaHandle.CREATOR));
            return true;
        }
        return false;
    }
}
