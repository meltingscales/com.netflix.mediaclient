package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    String zza;
    private final MediaInfo zzc;
    private final MediaQueueData zzd;
    private final Boolean zze;
    private final long zzf;
    private final double zzg;
    private final long[] zzh;
    private final JSONObject zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;
    private final String zzm;
    private long zzn;
    private static final Logger zzb = new Logger("MediaLoadRequestData");
    public static final Parcelable.Creator<MediaLoadRequestData> CREATOR = new zzca();

    /* loaded from: classes2.dex */
    public static class Builder {
        private MediaInfo zza;
        private MediaQueueData zzb;
        private Boolean zzc = Boolean.TRUE;
        private long zzd = -1;
        private double zze = 1.0d;
        private long[] zzf;
        private JSONObject zzg;
        private String zzh;
        private String zzi;
        private String zzj;
        private String zzk;
        private long zzl;

        public MediaLoadRequestData build() {
            return new MediaLoadRequestData(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl);
        }

        public Builder setActiveTrackIds(long[] jArr) {
            this.zzf = jArr;
            return this;
        }

        public Builder setAtvCredentials(String str) {
            this.zzj = str;
            return this;
        }

        public Builder setAtvCredentialsType(String str) {
            this.zzk = str;
            return this;
        }

        public Builder setAutoplay(Boolean bool) {
            this.zzc = bool;
            return this;
        }

        public Builder setCredentials(String str) {
            this.zzh = str;
            return this;
        }

        public Builder setCredentialsType(String str) {
            this.zzi = str;
            return this;
        }

        public Builder setCurrentTime(long j) {
            this.zzd = j;
            return this;
        }

        public Builder setCustomData(JSONObject jSONObject) {
            this.zzg = jSONObject;
            return this;
        }

        public Builder setMediaInfo(MediaInfo mediaInfo) {
            this.zza = mediaInfo;
            return this;
        }

        public Builder setPlaybackRate(double d) {
            if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.zze = d;
            return this;
        }

        public Builder setQueueData(MediaQueueData mediaQueueData) {
            this.zzb = mediaQueueData;
            return this;
        }

        public final Builder zza(long j) {
            this.zzl = j;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, String str, String str2, String str3, String str4, String str5, long j2) {
        this(mediaInfo, mediaQueueData, bool, j, d, jArr, CastUtils.jsonStringToJsonObject(str), str2, str3, str4, str5, j2);
    }

    public static MediaLoadRequestData fromJson(JSONObject jSONObject) {
        Builder builder = new Builder();
        try {
            if (jSONObject.has("media")) {
                builder.setMediaInfo(new MediaInfo(jSONObject.getJSONObject("media")));
            }
            if (jSONObject.has("queueData")) {
                MediaQueueData.Builder builder2 = new MediaQueueData.Builder();
                builder2.zza(jSONObject.getJSONObject("queueData"));
                builder.setQueueData(builder2.build());
            }
            if (jSONObject.has("autoplay")) {
                builder.setAutoplay(Boolean.valueOf(jSONObject.getBoolean("autoplay")));
            } else {
                builder.setAutoplay(null);
            }
            if (jSONObject.has("currentTime")) {
                builder.setCurrentTime(CastUtils.secToMillisec(jSONObject.getDouble("currentTime")));
            } else {
                builder.setCurrentTime(-1L);
            }
            builder.setPlaybackRate(jSONObject.optDouble("playbackRate", 1.0d));
            builder.setCredentials(CastUtils.optStringOrNull(jSONObject, "credentials"));
            builder.setCredentialsType(CastUtils.optStringOrNull(jSONObject, "credentialsType"));
            builder.setAtvCredentials(CastUtils.optStringOrNull(jSONObject, "atvCredentials"));
            builder.setAtvCredentialsType(CastUtils.optStringOrNull(jSONObject, "atvCredentialsType"));
            builder.zza(jSONObject.optLong(Payload.PARAM_RENO_REQUEST_ID));
            JSONArray optJSONArray = jSONObject.optJSONArray("activeTrackIds");
            if (optJSONArray != null) {
                long[] jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getLong(i);
                }
                builder.setActiveTrackIds(jArr);
            }
            builder.setCustomData(jSONObject.optJSONObject("customData"));
            return builder.build();
        } catch (JSONException unused) {
            return builder.build();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaLoadRequestData) {
            MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
            return JsonUtils.areJsonValuesEquivalent(this.zzi, mediaLoadRequestData.zzi) && Objects.equal(this.zzc, mediaLoadRequestData.zzc) && Objects.equal(this.zzd, mediaLoadRequestData.zzd) && Objects.equal(this.zze, mediaLoadRequestData.zze) && this.zzf == mediaLoadRequestData.zzf && this.zzg == mediaLoadRequestData.zzg && Arrays.equals(this.zzh, mediaLoadRequestData.zzh) && Objects.equal(this.zzj, mediaLoadRequestData.zzj) && Objects.equal(this.zzk, mediaLoadRequestData.zzk) && Objects.equal(this.zzl, mediaLoadRequestData.zzl) && Objects.equal(this.zzm, mediaLoadRequestData.zzm) && this.zzn == mediaLoadRequestData.zzn;
        }
        return false;
    }

    public long[] getActiveTrackIds() {
        return this.zzh;
    }

    public Boolean getAutoplay() {
        return this.zze;
    }

    public String getCredentials() {
        return this.zzj;
    }

    public String getCredentialsType() {
        return this.zzk;
    }

    public long getCurrentTime() {
        return this.zzf;
    }

    public MediaInfo getMediaInfo() {
        return this.zzc;
    }

    public double getPlaybackRate() {
        return this.zzg;
    }

    public MediaQueueData getQueueData() {
        return this.zzd;
    }

    public long getRequestId() {
        return this.zzn;
    }

    public int hashCode() {
        MediaInfo mediaInfo = this.zzc;
        MediaQueueData mediaQueueData = this.zzd;
        Boolean bool = this.zze;
        long j = this.zzf;
        double d = this.zzg;
        return Objects.hashCode(mediaInfo, mediaQueueData, bool, Long.valueOf(j), Double.valueOf(d), this.zzh, String.valueOf(this.zzi), this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzi;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMediaInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getQueueData(), i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 4, getAutoplay(), false);
        SafeParcelWriter.writeLong(parcel, 5, getCurrentTime());
        SafeParcelWriter.writeDouble(parcel, 6, getPlaybackRate());
        SafeParcelWriter.writeLongArray(parcel, 7, getActiveTrackIds(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zza, false);
        SafeParcelWriter.writeString(parcel, 9, getCredentials(), false);
        SafeParcelWriter.writeString(parcel, 10, getCredentialsType(), false);
        SafeParcelWriter.writeString(parcel, 11, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 13, getRequestId());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.zzc = mediaInfo;
        this.zzd = mediaQueueData;
        this.zze = bool;
        this.zzf = j;
        this.zzg = d;
        this.zzh = jArr;
        this.zzi = jSONObject;
        this.zzj = str;
        this.zzk = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = j2;
    }
}
