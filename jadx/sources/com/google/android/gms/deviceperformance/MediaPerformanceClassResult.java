package com.google.android.gms.deviceperformance;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class MediaPerformanceClassResult extends AbstractSafeParcelable {
    private final int zza;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MediaPerformanceClassResult> CREATOR = new zza();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8627dsp c8627dsp) {
        }
    }

    public MediaPerformanceClassResult(int i) {
        this.zza = i;
    }

    public final int getMediaPerformanceClass() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632dsu.c((Object) parcel, "");
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMediaPerformanceClass());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
