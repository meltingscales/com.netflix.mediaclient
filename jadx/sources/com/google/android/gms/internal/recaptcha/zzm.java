package com.google.android.gms.internal.recaptcha;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzm extends zza implements zzj {
    public zzm() {
        super("com.google.android.gms.recaptcha.internal.ICloseCallback");
    }

    @Override // com.google.android.gms.internal.recaptcha.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zza((Status) zzd.zza(parcel, Status.CREATOR), zzd.zza(parcel));
            return true;
        }
        return false;
    }
}
