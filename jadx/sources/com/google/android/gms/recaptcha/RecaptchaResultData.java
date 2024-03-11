package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public class RecaptchaResultData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaResultData> CREATOR = new zzr();
    private final String zza;

    public RecaptchaResultData(String str) {
        this.zza = str;
    }

    public String getTokenResult() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getTokenResult(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
