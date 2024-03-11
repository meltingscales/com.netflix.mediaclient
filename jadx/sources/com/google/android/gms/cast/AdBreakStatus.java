package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    private final long zzb;
    private final long zzc;
    private final String zzd;
    private final String zze;
    private final long zzf;
    private static final Logger zza = new Logger("AdBreakStatus");
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdBreakStatus zza(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long secToMillisec = CastUtils.secToMillisec(jSONObject.getLong("currentBreakTime"));
                long secToMillisec2 = CastUtils.secToMillisec(jSONObject.getLong("currentBreakClipTime"));
                String optStringOrNull = CastUtils.optStringOrNull(jSONObject, "breakId");
                String optStringOrNull2 = CastUtils.optStringOrNull(jSONObject, "breakClipId");
                long optLong = jSONObject.optLong("whenSkippable", -1L);
                return new AdBreakStatus(secToMillisec, secToMillisec2, optStringOrNull, optStringOrNull2, optLong != -1 ? CastUtils.secToMillisec(optLong) : optLong);
            } catch (JSONException e) {
                zza.e(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdBreakStatus) {
            AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
            return this.zzb == adBreakStatus.zzb && this.zzc == adBreakStatus.zzc && CastUtils.zzh(this.zzd, adBreakStatus.zzd) && CastUtils.zzh(this.zze, adBreakStatus.zze) && this.zzf == adBreakStatus.zzf;
        }
        return false;
    }

    public String getBreakClipId() {
        return this.zze;
    }

    public String getBreakId() {
        return this.zzd;
    }

    public long getCurrentBreakClipTimeInMs() {
        return this.zzc;
    }

    public long getCurrentBreakTimeInMs() {
        return this.zzb;
    }

    public long getWhenSkippableInMs() {
        return this.zzf;
    }

    public int hashCode() {
        long j = this.zzb;
        long j2 = this.zzc;
        return Objects.hashCode(Long.valueOf(j), Long.valueOf(j2), this.zzd, this.zze, Long.valueOf(this.zzf));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getCurrentBreakTimeInMs());
        SafeParcelWriter.writeLong(parcel, 3, getCurrentBreakClipTimeInMs());
        SafeParcelWriter.writeString(parcel, 4, getBreakId(), false);
        SafeParcelWriter.writeString(parcel, 5, getBreakClipId(), false);
        SafeParcelWriter.writeLong(parcel, 6, getWhenSkippableInMs());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
