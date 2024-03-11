package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzeb;
import com.google.android.gms.internal.cast.zzee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private MediaMetadata zzf;
    private long zzg;
    private List zzh;
    private TextTrackStyle zzi;
    private List zzj;
    private List zzk;
    private String zzl;
    private VastAdsRequest zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private JSONObject zzs;
    private final Writer zzt;
    public static final long zza = CastUtils.secToMillisec(-1L);
    public static final Parcelable.Creator<MediaInfo> CREATOR = new zzbw();

    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        public void setAdBreaks(List<AdBreakInfo> list) {
            MediaInfo.this.zzj = list;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaInfo) {
            MediaInfo mediaInfo = (MediaInfo) obj;
            JSONObject jSONObject = this.zzs;
            boolean z = jSONObject == null;
            JSONObject jSONObject2 = mediaInfo.zzs;
            if (z != (jSONObject2 == null)) {
                return false;
            }
            return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && CastUtils.zzh(this.zzc, mediaInfo.zzc) && this.zzd == mediaInfo.zzd && CastUtils.zzh(this.zze, mediaInfo.zze) && CastUtils.zzh(this.zzf, mediaInfo.zzf) && this.zzg == mediaInfo.zzg && CastUtils.zzh(this.zzh, mediaInfo.zzh) && CastUtils.zzh(this.zzi, mediaInfo.zzi) && CastUtils.zzh(this.zzj, mediaInfo.zzj) && CastUtils.zzh(this.zzk, mediaInfo.zzk) && CastUtils.zzh(this.zzl, mediaInfo.zzl) && CastUtils.zzh(this.zzm, mediaInfo.zzm) && this.zzn == mediaInfo.zzn && CastUtils.zzh(this.zzo, mediaInfo.zzo) && CastUtils.zzh(this.zzp, mediaInfo.zzp) && CastUtils.zzh(this.zzq, mediaInfo.zzq) && CastUtils.zzh(this.zzr, mediaInfo.zzr);
        }
        return false;
    }

    public List<AdBreakClipInfo> getAdBreakClips() {
        List list = this.zzk;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<AdBreakInfo> getAdBreaks() {
        List list = this.zzj;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String getContentId() {
        return this.zzc;
    }

    public String getContentType() {
        return this.zze;
    }

    public String getContentUrl() {
        return this.zzp;
    }

    public String getEntity() {
        return this.zzl;
    }

    public String getHlsSegmentFormat() {
        return this.zzq;
    }

    public String getHlsVideoSegmentFormat() {
        return this.zzr;
    }

    public List<MediaTrack> getMediaTracks() {
        return this.zzh;
    }

    public MediaMetadata getMetadata() {
        return this.zzf;
    }

    public long getStartAbsoluteTime() {
        return this.zzn;
    }

    public long getStreamDuration() {
        return this.zzg;
    }

    public int getStreamType() {
        return this.zzd;
    }

    public TextTrackStyle getTextTrackStyle() {
        return this.zzi;
    }

    public VastAdsRequest getVmapAdsRequest() {
        return this.zzm;
    }

    public Writer getWriter() {
        return this.zzt;
    }

    public int hashCode() {
        String str = this.zzc;
        int i = this.zzd;
        String str2 = this.zze;
        MediaMetadata mediaMetadata = this.zzf;
        long j = this.zzg;
        String valueOf = String.valueOf(this.zzs);
        List list = this.zzh;
        TextTrackStyle textTrackStyle = this.zzi;
        List list2 = this.zzj;
        List list3 = this.zzk;
        String str3 = this.zzl;
        VastAdsRequest vastAdsRequest = this.zzm;
        long j2 = this.zzn;
        return Objects.hashCode(str, Integer.valueOf(i), str2, mediaMetadata, Long.valueOf(j), valueOf, list, textTrackStyle, list2, list3, str3, vastAdsRequest, Long.valueOf(j2), this.zzo, this.zzq, this.zzr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzs;
        this.zzb = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getContentId(), false);
        SafeParcelWriter.writeInt(parcel, 3, getStreamType());
        SafeParcelWriter.writeString(parcel, 4, getContentType(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, getMetadata(), i, false);
        SafeParcelWriter.writeLong(parcel, 6, getStreamDuration());
        SafeParcelWriter.writeTypedList(parcel, 7, getMediaTracks(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getTextTrackStyle(), i, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 10, getAdBreaks(), false);
        SafeParcelWriter.writeTypedList(parcel, 11, getAdBreakClips(), false);
        SafeParcelWriter.writeString(parcel, 12, getEntity(), false);
        SafeParcelWriter.writeParcelable(parcel, 13, getVmapAdsRequest(), i, false);
        SafeParcelWriter.writeLong(parcel, 14, getStartAbsoluteTime());
        SafeParcelWriter.writeString(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, getContentUrl(), false);
        SafeParcelWriter.writeString(parcel, 17, getHlsSegmentFormat(), false);
        SafeParcelWriter.writeString(parcel, 18, getHlsVideoSegmentFormat(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.zzc);
            jSONObject.putOpt("contentUrl", this.zzp);
            int i = this.zzd;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.zze;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.zzf;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.zza());
            }
            long j = this.zzg;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", CastUtils.millisecToSec(j));
            }
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : this.zzh) {
                    jSONArray.put(mediaTrack.zza());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.zzi;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.zza());
            }
            JSONObject jSONObject2 = this.zzs;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.zzl;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.zzj != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (AdBreakInfo adBreakInfo : this.zzj) {
                    jSONArray2.put(adBreakInfo.zza());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.zzk != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (AdBreakClipInfo adBreakClipInfo : this.zzk) {
                    jSONArray3.put(adBreakClipInfo.zza());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.zzm;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.zza());
            }
            long j2 = this.zzn;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", CastUtils.millisecToSec(j2));
            }
            jSONObject.putOpt("atvEntity", this.zzo);
            String str3 = this.zzq;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.zzr;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8 A[LOOP:0: B:5:0x0021->B:27:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0183 A[LOOP:2: B:33:0x00ce->B:61:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzs(org.json.JSONObject r39) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.zzs(org.json.JSONObject):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.zzt = new Writer();
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
        this.zzf = mediaMetadata;
        this.zzg = j;
        this.zzh = list;
        this.zzi = textTrackStyle;
        this.zzb = str3;
        if (str3 != null) {
            try {
                this.zzs = new JSONObject(this.zzb);
            } catch (JSONException unused) {
                this.zzs = null;
                this.zzb = null;
            }
        } else {
            this.zzs = null;
        }
        this.zzj = list2;
        this.zzk = list3;
        this.zzl = str4;
        this.zzm = vastAdsRequest;
        this.zzn = j2;
        this.zzo = str5;
        this.zzp = str6;
        this.zzq = str7;
        this.zzr = str8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        zzee zzeeVar;
        int i3;
        String optString = jSONObject.optString("streamType", "NONE");
        int i4 = 2;
        int i5 = 1;
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.zzd = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.zzd = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.zzd = 2;
            } else {
                mediaInfo.zzd = -1;
            }
        }
        mediaInfo.zze = CastUtils.optStringOrNull(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            mediaInfo.zzf = mediaMetadata;
            mediaMetadata.zzc(jSONObject2);
        }
        mediaInfo.zzg = -1L;
        if (mediaInfo.zzd != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                mediaInfo.zzg = CastUtils.secToMillisec(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i6 = 0;
            while (i6 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                String str = MediaTrack.ROLE_ALTERNATE;
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = i5;
                } else if ("AUDIO".equals(optString2)) {
                    i = i4;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String optStringOrNull = CastUtils.optStringOrNull(jSONObject3, "trackContentId");
                String optStringOrNull2 = CastUtils.optStringOrNull(jSONObject3, "trackContentType");
                String optStringOrNull3 = CastUtils.optStringOrNull(jSONObject3, "name");
                String optStringOrNull4 = CastUtils.optStringOrNull(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = i5;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = i4;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        if ("CHAPTERS".equals(string)) {
                            i3 = 4;
                        } else if ("METADATA".equals(string)) {
                            i3 = 5;
                        } else {
                            i2 = -1;
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    zzeb zzi = zzee.zzi();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                        zzi.zzc(jSONArray2.optString(i7));
                    }
                    zzeeVar = zzi.zzd();
                } else {
                    zzeeVar = null;
                }
                arrayList.add(new MediaTrack(j, i, optStringOrNull, optStringOrNull2, optStringOrNull3, optStringOrNull4, i2, zzeeVar, jSONObject3.optJSONObject("customData")));
                i6++;
                i4 = 2;
                i5 = 1;
            }
            mediaInfo.zzh = new ArrayList(arrayList);
        } else {
            mediaInfo.zzh = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.fromJson(jSONObject4);
            mediaInfo.zzi = textTrackStyle;
        } else {
            mediaInfo.zzi = null;
        }
        zzs(jSONObject);
        mediaInfo.zzs = jSONObject.optJSONObject("customData");
        mediaInfo.zzl = CastUtils.optStringOrNull(jSONObject, "entity");
        mediaInfo.zzo = CastUtils.optStringOrNull(jSONObject, "atvEntity");
        mediaInfo.zzm = VastAdsRequest.fromJson(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.zzn = CastUtils.secToMillisec(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.zzp = jSONObject.optString("contentUrl");
        }
        mediaInfo.zzq = CastUtils.optStringOrNull(jSONObject, "hlsSegmentFormat");
        mediaInfo.zzr = CastUtils.optStringOrNull(jSONObject, "hlsVideoSegmentFormat");
    }
}
