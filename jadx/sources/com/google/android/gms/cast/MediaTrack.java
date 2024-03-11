package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new zzcl();
    public static final String ROLE_ALTERNATE = "alternate";
    String zza;
    private long zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private final String zzg;
    private int zzh;
    private final List zzi;
    private final JSONObject zzj;

    @VisibleForTesting
    /* loaded from: classes5.dex */
    public static class Builder {
        private final long zza;
        private final int zzb;
        private String zzc;
        private String zzd;
        private String zze;
        private String zzf;
        private int zzg = 0;
        private List zzh;
        private JSONObject zzi;

        public Builder(long j, int i) {
            this.zza = j;
            this.zzb = i;
        }

        public MediaTrack build() {
            return new MediaTrack(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
        }

        public Builder setContentId(String str) {
            this.zzc = str;
            return this;
        }

        public Builder setName(String str) {
            this.zze = str;
            return this;
        }

        public Builder setSubtype(int i) {
            if (i < -1 || i > 5) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid subtype ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (i == 0 || this.zzb == 1) {
                this.zzg = i;
                return this;
            } else {
                throw new IllegalArgumentException("subtypes are only valid for text tracks");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = i2;
        this.zzi = list;
        this.zzj = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaTrack) {
            MediaTrack mediaTrack = (MediaTrack) obj;
            JSONObject jSONObject = this.zzj;
            boolean z = jSONObject == null;
            JSONObject jSONObject2 = mediaTrack.zzj;
            if (z != (jSONObject2 == null)) {
                return false;
            }
            return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzb == mediaTrack.zzb && this.zzc == mediaTrack.zzc && CastUtils.zzh(this.zzd, mediaTrack.zzd) && CastUtils.zzh(this.zze, mediaTrack.zze) && CastUtils.zzh(this.zzf, mediaTrack.zzf) && CastUtils.zzh(this.zzg, mediaTrack.zzg) && this.zzh == mediaTrack.zzh && CastUtils.zzh(this.zzi, mediaTrack.zzi);
        }
        return false;
    }

    public String getContentId() {
        return this.zzd;
    }

    public String getContentType() {
        return this.zze;
    }

    public long getId() {
        return this.zzb;
    }

    public String getLanguage() {
        return this.zzg;
    }

    @TargetApi(21)
    public Locale getLanguageLocale() {
        if (TextUtils.isEmpty(this.zzg)) {
            return null;
        }
        if (PlatformVersion.isAtLeastLollipop()) {
            return Locale.forLanguageTag(this.zzg);
        }
        String[] split = this.zzg.split("-", -1);
        if (split.length == 1) {
            return new Locale(split[0]);
        }
        return new Locale(split[0], split[1]);
    }

    public String getName() {
        return this.zzf;
    }

    public List<String> getRoles() {
        return this.zzi;
    }

    public int getSubtype() {
        return this.zzh;
    }

    public int getType() {
        return this.zzc;
    }

    public int hashCode() {
        long j = this.zzb;
        int i = this.zzc;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        String str4 = this.zzg;
        int i2 = this.zzh;
        return Objects.hashCode(Long.valueOf(j), Integer.valueOf(i), str, str2, str3, str4, Integer.valueOf(i2), this.zzi, String.valueOf(this.zzj));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzj;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getId());
        SafeParcelWriter.writeInt(parcel, 3, getType());
        SafeParcelWriter.writeString(parcel, 4, getContentId(), false);
        SafeParcelWriter.writeString(parcel, 5, getContentType(), false);
        SafeParcelWriter.writeString(parcel, 6, getName(), false);
        SafeParcelWriter.writeString(parcel, 7, getLanguage(), false);
        SafeParcelWriter.writeInt(parcel, 8, getSubtype());
        SafeParcelWriter.writeStringList(parcel, 9, getRoles(), false);
        SafeParcelWriter.writeString(parcel, 10, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.zzb);
            int i = this.zzc;
            if (i == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str = this.zzd;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.zze;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.zzf;
            if (str3 != null) {
                jSONObject.put("name", str3);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject.put("language", this.zzg);
            }
            int i2 = this.zzh;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.zzi;
            if (list != null) {
                jSONObject.put("roles", new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.zzj;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
