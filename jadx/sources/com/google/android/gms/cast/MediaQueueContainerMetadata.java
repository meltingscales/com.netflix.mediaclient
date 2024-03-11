package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new zzce();
    private int zza;
    private String zzb;
    private List zzc;
    private List zzd;
    private double zze;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final MediaQueueContainerMetadata zza = new MediaQueueContainerMetadata(null);

        public MediaQueueContainerMetadata build() {
            return new MediaQueueContainerMetadata(this.zza, null);
        }

        public final Builder zza(JSONObject jSONObject) {
            MediaQueueContainerMetadata.zzb(this.zza, jSONObject);
            return this;
        }
    }

    private MediaQueueContainerMetadata() {
        zzh();
    }

    static /* synthetic */ void zzb(MediaQueueContainerMetadata mediaQueueContainerMetadata, JSONObject jSONObject) {
        char c;
        mediaQueueContainerMetadata.zzh();
        String optString = jSONObject.optString("containerType", "");
        int hashCode = optString.hashCode();
        if (hashCode != 6924225) {
            if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals("AUDIOBOOK_CONTAINER")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            mediaQueueContainerMetadata.zza = 0;
        } else if (c == 1) {
            mediaQueueContainerMetadata.zza = 1;
        }
        mediaQueueContainerMetadata.zzb = CastUtils.optStringOrNull(jSONObject, SignupConstants.Field.VIDEO_TITLE);
        JSONArray optJSONArray = jSONObject.optJSONArray("sections");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueContainerMetadata.zzc = arrayList;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    MediaMetadata mediaMetadata = new MediaMetadata();
                    mediaMetadata.zzc(optJSONObject);
                    arrayList.add(mediaMetadata);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            mediaQueueContainerMetadata.zzd = arrayList2;
            com.google.android.gms.cast.internal.media.zza.zzd(arrayList2, optJSONArray2);
        }
        mediaQueueContainerMetadata.zze = jSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaQueueContainerMetadata) {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
            return this.zza == mediaQueueContainerMetadata.zza && TextUtils.equals(this.zzb, mediaQueueContainerMetadata.zzb) && Objects.equal(this.zzc, mediaQueueContainerMetadata.zzc) && Objects.equal(this.zzd, mediaQueueContainerMetadata.zzd) && this.zze == mediaQueueContainerMetadata.zze;
        }
        return false;
    }

    public double getContainerDuration() {
        return this.zze;
    }

    public List<WebImage> getContainerImages() {
        List list = this.zzd;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int getContainerType() {
        return this.zza;
    }

    public List<MediaMetadata> getSections() {
        List list = this.zzc;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getTitle() {
        return this.zzb;
    }

    public int hashCode() {
        int i = this.zza;
        return Objects.hashCode(Integer.valueOf(i), this.zzb, this.zzc, this.zzd, Double.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getContainerType());
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getSections(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getContainerImages(), false);
        SafeParcelWriter.writeDouble(parcel, 6, getContainerDuration());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
        this.zze = d;
    }

    /* synthetic */ MediaQueueContainerMetadata(zzcd zzcdVar) {
        zzh();
    }

    /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata, zzcd zzcdVar) {
        this.zza = mediaQueueContainerMetadata.zza;
        this.zzb = mediaQueueContainerMetadata.zzb;
        this.zzc = mediaQueueContainerMetadata.zzc;
        this.zzd = mediaQueueContainerMetadata.zzd;
        this.zze = mediaQueueContainerMetadata.zze;
    }
}
