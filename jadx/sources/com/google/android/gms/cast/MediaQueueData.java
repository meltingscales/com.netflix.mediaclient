package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new zzcg();
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private MediaQueueContainerMetadata zze;
    private int zzf;
    private List zzg;
    private int zzh;
    private long zzi;
    private boolean zzj;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final MediaQueueData zza = new MediaQueueData(null);

        public MediaQueueData build() {
            return new MediaQueueData(this.zza, null);
        }

        public final Builder zza(JSONObject jSONObject) {
            MediaQueueData.zzb(this.zza, jSONObject);
            return this;
        }
    }

    private MediaQueueData() {
        zzl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static /* synthetic */ void zzb(MediaQueueData mediaQueueData, JSONObject jSONObject) {
        char c;
        mediaQueueData.zzl();
        if (jSONObject == null) {
            return;
        }
        mediaQueueData.zza = CastUtils.optStringOrNull(jSONObject, SignupConstants.Field.LANG_ID);
        mediaQueueData.zzb = CastUtils.optStringOrNull(jSONObject, "entity");
        String optString = jSONObject.optString("queueType");
        switch (optString.hashCode()) {
            case -1803151310:
                if (optString.equals("PODCAST_SERIES")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1758903120:
                if (optString.equals("RADIO_STATION")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1632865838:
                if (optString.equals("PLAYLIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1319760993:
                if (optString.equals("AUDIOBOOK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1088524588:
                if (optString.equals("TV_SERIES")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (optString.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 73549584:
                if (optString.equals("MOVIE")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 393100598:
                if (optString.equals("VIDEO_PLAYLIST")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 902303413:
                if (optString.equals("LIVE_TV")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mediaQueueData.zzc = 1;
                break;
            case 1:
                mediaQueueData.zzc = 2;
                break;
            case 2:
                mediaQueueData.zzc = 3;
                break;
            case 3:
                mediaQueueData.zzc = 4;
                break;
            case 4:
                mediaQueueData.zzc = 5;
                break;
            case 5:
                mediaQueueData.zzc = 6;
                break;
            case 6:
                mediaQueueData.zzc = 7;
                break;
            case 7:
                mediaQueueData.zzc = 8;
                break;
            case '\b':
                mediaQueueData.zzc = 9;
                break;
        }
        mediaQueueData.zzd = CastUtils.optStringOrNull(jSONObject, "name");
        JSONObject optJSONObject = jSONObject.has("containerMetadata") ? jSONObject.optJSONObject("containerMetadata") : null;
        if (optJSONObject != null) {
            MediaQueueContainerMetadata.Builder builder = new MediaQueueContainerMetadata.Builder();
            builder.zza(optJSONObject);
            mediaQueueData.zze = builder.build();
        }
        Integer mediaRepeatModeFromString = MediaCommon.mediaRepeatModeFromString(jSONObject.optString("repeatMode"));
        if (mediaRepeatModeFromString != null) {
            mediaQueueData.zzf = mediaRepeatModeFromString.intValue();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueData.zzg = arrayList;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    try {
                        arrayList.add(new MediaQueueItem(optJSONObject2));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        mediaQueueData.zzh = jSONObject.optInt("startIndex", mediaQueueData.zzh);
        if (jSONObject.has("startTime")) {
            mediaQueueData.zzi = CastUtils.secToMillisec(jSONObject.optDouble("startTime", mediaQueueData.zzi));
        }
        mediaQueueData.zzj = jSONObject.optBoolean("shuffle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = 0;
        this.zzd = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = 0;
        this.zzi = -1L;
        this.zzj = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaQueueData) {
            MediaQueueData mediaQueueData = (MediaQueueData) obj;
            return TextUtils.equals(this.zza, mediaQueueData.zza) && TextUtils.equals(this.zzb, mediaQueueData.zzb) && this.zzc == mediaQueueData.zzc && TextUtils.equals(this.zzd, mediaQueueData.zzd) && Objects.equal(this.zze, mediaQueueData.zze) && this.zzf == mediaQueueData.zzf && Objects.equal(this.zzg, mediaQueueData.zzg) && this.zzh == mediaQueueData.zzh && this.zzi == mediaQueueData.zzi && this.zzj == mediaQueueData.zzj;
        }
        return false;
    }

    public MediaQueueContainerMetadata getContainerMetadata() {
        return this.zze;
    }

    public String getEntity() {
        return this.zzb;
    }

    public List<MediaQueueItem> getItems() {
        List list = this.zzg;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getName() {
        return this.zzd;
    }

    public String getQueueId() {
        return this.zza;
    }

    public int getQueueType() {
        return this.zzc;
    }

    public int getRepeatMode() {
        return this.zzf;
    }

    public int getStartIndex() {
        return this.zzh;
    }

    public long getStartTime() {
        return this.zzi;
    }

    public int hashCode() {
        String str = this.zza;
        String str2 = this.zzb;
        int i = this.zzc;
        String str3 = this.zzd;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = this.zze;
        int i2 = this.zzf;
        return Objects.hashCode(str, str2, Integer.valueOf(i), str3, mediaQueueContainerMetadata, Integer.valueOf(i2), this.zzg, Integer.valueOf(this.zzh), Long.valueOf(this.zzi), Boolean.valueOf(this.zzj));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getQueueId(), false);
        SafeParcelWriter.writeString(parcel, 3, getEntity(), false);
        SafeParcelWriter.writeInt(parcel, 4, getQueueType());
        SafeParcelWriter.writeString(parcel, 5, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getContainerMetadata(), i, false);
        SafeParcelWriter.writeInt(parcel, 7, getRepeatMode());
        SafeParcelWriter.writeTypedList(parcel, 8, getItems(), false);
        SafeParcelWriter.writeInt(parcel, 9, getStartIndex());
        SafeParcelWriter.writeLong(parcel, 10, getStartTime());
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zzk() {
        return this.zzj;
    }

    /* synthetic */ MediaQueueData(zzcf zzcfVar) {
        zzl();
    }

    /* synthetic */ MediaQueueData(MediaQueueData mediaQueueData, zzcf zzcfVar) {
        this.zza = mediaQueueData.zza;
        this.zzb = mediaQueueData.zzb;
        this.zzc = mediaQueueData.zzc;
        this.zzd = mediaQueueData.zzd;
        this.zze = mediaQueueData.zze;
        this.zzf = mediaQueueData.zzf;
        this.zzg = mediaQueueData.zzg;
        this.zzh = mediaQueueData.zzh;
        this.zzi = mediaQueueData.zzi;
        this.zzj = mediaQueueData.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List list, int i3, long j, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = str3;
        this.zze = mediaQueueContainerMetadata;
        this.zzf = i2;
        this.zzg = list;
        this.zzh = i3;
        this.zzi = j;
        this.zzj = z;
    }
}
