package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* loaded from: classes2.dex */
public class MediaStatus extends AbstractSafeParcelable {
    @VisibleForTesting
    MediaInfo zza;
    @VisibleForTesting
    long zzb;
    @VisibleForTesting
    int zzc;
    @VisibleForTesting
    double zzd;
    @VisibleForTesting
    int zze;
    @VisibleForTesting
    int zzf;
    @VisibleForTesting
    long zzg;
    long zzh;
    @VisibleForTesting
    double zzi;
    @VisibleForTesting
    boolean zzj;
    @VisibleForTesting
    long[] zzk;
    @VisibleForTesting
    int zzl;
    @VisibleForTesting
    int zzm;
    String zzn;
    @VisibleForTesting
    JSONObject zzo;
    int zzp;
    final List zzq;
    @VisibleForTesting
    boolean zzr;
    @VisibleForTesting
    AdBreakStatus zzs;
    @VisibleForTesting
    VideoInfo zzt;
    @VisibleForTesting
    MediaLiveSeekableRange zzu;
    @VisibleForTesting
    MediaQueueData zzv;
    @VisibleForTesting
    boolean zzw;
    private final SparseArray zzy;
    private final Writer zzz;
    private static final Logger zzx = new Logger("MediaStatus");
    public static final Parcelable.Creator<MediaStatus> CREATOR = new zzck();

    /* loaded from: classes2.dex */
    public class Writer {
        public Writer() {
        }

        public void setIsPlayingAd(boolean z) {
            MediaStatus.this.zzr = z;
        }
    }

    @SuppressLint({"NonSdkVisibleApi"})
    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.zzq = new ArrayList();
        this.zzy = new SparseArray();
        this.zzz = new Writer();
        this.zza = mediaInfo;
        this.zzb = j;
        this.zzc = i;
        this.zzd = d;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = d2;
        this.zzj = z;
        this.zzk = jArr;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = str;
        if (str != null) {
            try {
                this.zzo = new JSONObject(this.zzn);
            } catch (JSONException unused) {
                this.zzo = null;
                this.zzn = null;
            }
        } else {
            this.zzo = null;
        }
        this.zzp = i6;
        if (list != null && !list.isEmpty()) {
            zze(list);
        }
        this.zzr = z2;
        this.zzs = adBreakStatus;
        this.zzt = videoInfo;
        this.zzu = mediaLiveSeekableRange;
        this.zzv = mediaQueueData;
        this.zzw = mediaQueueData != null && mediaQueueData.zzk();
    }

    private final void zze(List list) {
        this.zzq.clear();
        this.zzy.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
                this.zzq.add(mediaQueueItem);
                this.zzy.put(mediaQueueItem.getItemId(), Integer.valueOf(i));
            }
        }
    }

    private static final boolean zzf(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            } else if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaStatus) {
            MediaStatus mediaStatus = (MediaStatus) obj;
            return (this.zzo == null) == (mediaStatus.zzo == null) && this.zzb == mediaStatus.zzb && this.zzc == mediaStatus.zzc && this.zzd == mediaStatus.zzd && this.zze == mediaStatus.zze && this.zzf == mediaStatus.zzf && this.zzg == mediaStatus.zzg && this.zzi == mediaStatus.zzi && this.zzj == mediaStatus.zzj && this.zzl == mediaStatus.zzl && this.zzm == mediaStatus.zzm && this.zzp == mediaStatus.zzp && Arrays.equals(this.zzk, mediaStatus.zzk) && CastUtils.zzh(Long.valueOf(this.zzh), Long.valueOf(mediaStatus.zzh)) && CastUtils.zzh(this.zzq, mediaStatus.zzq) && CastUtils.zzh(this.zza, mediaStatus.zza) && ((jSONObject = this.zzo) == null || (jSONObject2 = mediaStatus.zzo) == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && this.zzr == mediaStatus.isPlayingAd() && CastUtils.zzh(this.zzs, mediaStatus.zzs) && CastUtils.zzh(this.zzt, mediaStatus.zzt) && CastUtils.zzh(this.zzu, mediaStatus.zzu) && Objects.equal(this.zzv, mediaStatus.zzv) && this.zzw == mediaStatus.zzw;
        }
        return false;
    }

    public long[] getActiveTrackIds() {
        return this.zzk;
    }

    public AdBreakStatus getAdBreakStatus() {
        return this.zzs;
    }

    public int getCurrentItemId() {
        return this.zzc;
    }

    public JSONObject getCustomData() {
        return this.zzo;
    }

    public int getIdleReason() {
        return this.zzf;
    }

    public Integer getIndexById(int i) {
        return (Integer) this.zzy.get(i);
    }

    public MediaQueueItem getItemById(int i) {
        Integer num = (Integer) this.zzy.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.zzq.get(num.intValue());
    }

    public MediaLiveSeekableRange getLiveSeekableRange() {
        return this.zzu;
    }

    public int getLoadingItemId() {
        return this.zzl;
    }

    public MediaInfo getMediaInfo() {
        return this.zza;
    }

    public double getPlaybackRate() {
        return this.zzd;
    }

    public int getPlayerState() {
        return this.zze;
    }

    public int getPreloadedItemId() {
        return this.zzm;
    }

    public MediaQueueData getQueueData() {
        return this.zzv;
    }

    public MediaQueueItem getQueueItemById(int i) {
        return getItemById(i);
    }

    public int getQueueItemCount() {
        return this.zzq.size();
    }

    public int getQueueRepeatMode() {
        return this.zzp;
    }

    public long getStreamPosition() {
        return this.zzg;
    }

    public double getStreamVolume() {
        return this.zzi;
    }

    public VideoInfo getVideoInfo() {
        return this.zzt;
    }

    public Writer getWriter() {
        return this.zzz;
    }

    public int hashCode() {
        MediaInfo mediaInfo = this.zza;
        long j = this.zzb;
        int i = this.zzc;
        double d = this.zzd;
        int i2 = this.zze;
        int i3 = this.zzf;
        long j2 = this.zzg;
        long j3 = this.zzh;
        double d2 = this.zzi;
        boolean z = this.zzj;
        int hashCode = Arrays.hashCode(this.zzk);
        int i4 = this.zzl;
        int i5 = this.zzm;
        String valueOf = String.valueOf(this.zzo);
        int i6 = this.zzp;
        List list = this.zzq;
        boolean z2 = this.zzr;
        return Objects.hashCode(mediaInfo, Long.valueOf(j), Integer.valueOf(i), Double.valueOf(d), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2), Long.valueOf(j3), Double.valueOf(d2), Boolean.valueOf(z), Integer.valueOf(hashCode), Integer.valueOf(i4), Integer.valueOf(i5), valueOf, Integer.valueOf(i6), list, Boolean.valueOf(z2), this.zzs, this.zzt, this.zzu, this.zzv);
    }

    public boolean isMediaCommandSupported(long j) {
        return (j & this.zzh) != 0;
    }

    public boolean isMute() {
        return this.zzj;
    }

    public boolean isPlayingAd() {
        return this.zzr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.zzo;
        this.zzn = jSONObject == null ? null : jSONObject.toString();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMediaInfo(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, getCurrentItemId());
        SafeParcelWriter.writeDouble(parcel, 5, getPlaybackRate());
        SafeParcelWriter.writeInt(parcel, 6, getPlayerState());
        SafeParcelWriter.writeInt(parcel, 7, getIdleReason());
        SafeParcelWriter.writeLong(parcel, 8, getStreamPosition());
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeDouble(parcel, 10, getStreamVolume());
        SafeParcelWriter.writeBoolean(parcel, 11, isMute());
        SafeParcelWriter.writeLongArray(parcel, 12, getActiveTrackIds(), false);
        SafeParcelWriter.writeInt(parcel, 13, getLoadingItemId());
        SafeParcelWriter.writeInt(parcel, 14, getPreloadedItemId());
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, isPlayingAd());
        SafeParcelWriter.writeParcelable(parcel, 19, getAdBreakStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 20, getVideoInfo(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 21, getLiveSeekableRange(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 22, getQueueData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
        if (r13.zzk != null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d6, code lost:
        if (r15 == false) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(org.json.JSONObject r14, int r15) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.zza(org.json.JSONObject, int):int");
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzd() {
        MediaInfo mediaInfo = this.zza;
        return zzf(this.zze, this.zzf, this.zzl, mediaInfo == null ? -1 : mediaInfo.getStreamType());
    }

    public MediaStatus(JSONObject jSONObject) {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        zza(jSONObject, 0);
    }
}
