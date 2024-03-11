package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class RecaptchaActionType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaActionType> CREATOR = new zze();
    private String zza;

    public final String getAction() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAction(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public RecaptchaActionType(String str) {
        this.zza = str;
    }
}
