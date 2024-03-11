package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptcha.RecaptchaResultData;

/* loaded from: classes2.dex */
public abstract class zzo extends zza implements zzl {
    public zzo() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    @Override // com.google.android.gms.internal.recaptcha.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza((Status) zzd.zza(parcel, Status.CREATOR), (RecaptchaResultData) zzd.zza(parcel, RecaptchaResultData.CREATOR));
            return true;
        }
        return false;
    }
}
