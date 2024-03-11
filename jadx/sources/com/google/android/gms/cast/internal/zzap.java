package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.netflix.mediaclient.service.pushnotification.Payload;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzap extends zzd {
    public static final String zzb = CastUtils.zzc("com.google.cast.media");
    private int zzA;
    private TaskCompletionSource zzB;
    @VisibleForTesting
    final zzat zzc;
    @VisibleForTesting
    final zzat zzd;
    @VisibleForTesting
    final zzat zze;
    @VisibleForTesting
    final zzat zzf;
    @VisibleForTesting
    final zzat zzg;
    @VisibleForTesting
    final zzat zzh;
    @VisibleForTesting
    final zzat zzi;
    @VisibleForTesting
    final zzat zzj;
    @VisibleForTesting
    final zzat zzk;
    @VisibleForTesting
    final zzat zzl;
    @VisibleForTesting
    final zzat zzm;
    @VisibleForTesting
    final zzat zzn;
    @VisibleForTesting
    final zzat zzo;
    @VisibleForTesting
    final zzat zzp;
    @VisibleForTesting
    final zzat zzq;
    @VisibleForTesting
    final zzat zzr;
    @VisibleForTesting
    final zzat zzs;
    @VisibleForTesting
    final zzat zzt;
    @VisibleForTesting
    final zzat zzu;
    @VisibleForTesting
    final zzat zzv;
    private long zzw;
    private MediaStatus zzx;
    private Long zzy;
    private zzam zzz;

    public zzap(String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzA = -1;
        zzat zzatVar = new zzat(86400000L);
        this.zzc = zzatVar;
        zzat zzatVar2 = new zzat(86400000L);
        this.zzd = zzatVar2;
        zzat zzatVar3 = new zzat(86400000L);
        this.zze = zzatVar3;
        zzat zzatVar4 = new zzat(86400000L);
        this.zzf = zzatVar4;
        zzat zzatVar5 = new zzat(10000L);
        this.zzg = zzatVar5;
        zzat zzatVar6 = new zzat(86400000L);
        this.zzh = zzatVar6;
        zzat zzatVar7 = new zzat(86400000L);
        this.zzi = zzatVar7;
        zzat zzatVar8 = new zzat(86400000L);
        this.zzj = zzatVar8;
        zzat zzatVar9 = new zzat(86400000L);
        this.zzk = zzatVar9;
        zzat zzatVar10 = new zzat(86400000L);
        this.zzl = zzatVar10;
        zzat zzatVar11 = new zzat(86400000L);
        this.zzm = zzatVar11;
        zzat zzatVar12 = new zzat(86400000L);
        this.zzn = zzatVar12;
        zzat zzatVar13 = new zzat(86400000L);
        this.zzo = zzatVar13;
        zzat zzatVar14 = new zzat(86400000L);
        this.zzp = zzatVar14;
        zzat zzatVar15 = new zzat(86400000L);
        this.zzq = zzatVar15;
        zzat zzatVar16 = new zzat(86400000L);
        this.zzs = zzatVar16;
        this.zzr = new zzat(86400000L);
        zzat zzatVar17 = new zzat(86400000L);
        this.zzt = zzatVar17;
        zzat zzatVar18 = new zzat(86400000L);
        this.zzu = zzatVar18;
        zzat zzatVar19 = new zzat(86400000L);
        this.zzv = zzatVar19;
        zzc(zzatVar);
        zzc(zzatVar2);
        zzc(zzatVar3);
        zzc(zzatVar4);
        zzc(zzatVar5);
        zzc(zzatVar6);
        zzc(zzatVar7);
        zzc(zzatVar8);
        zzc(zzatVar9);
        zzc(zzatVar10);
        zzc(zzatVar11);
        zzc(zzatVar12);
        zzc(zzatVar13);
        zzc(zzatVar14);
        zzc(zzatVar15);
        zzc(zzatVar16);
        zzc(zzatVar16);
        zzc(zzatVar17);
        zzc(zzatVar18);
        zzc(zzatVar19);
        zzV();
    }

    private final long zzT(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzw;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 <= 0 || j3 <= j2) {
            if (j3 >= 0) {
                return j3;
            }
            return 0L;
        }
        return j2;
    }

    private static zzao zzU(JSONObject jSONObject) {
        MediaError zza = MediaError.zza(jSONObject);
        zzao zzaoVar = new zzao();
        zzaoVar.zza = CastUtils.zzg(jSONObject, "customData");
        zzaoVar.zzb = zza;
        return zzaoVar;
    }

    private final void zzV() {
        this.zzw = 0L;
        this.zzx = null;
        for (zzat zzatVar : zza()) {
            zzatVar.zzc(2002);
        }
    }

    private final void zzW(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.zzA = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.zza.w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzX() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzc();
        }
    }

    private final void zzY() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzd();
        }
    }

    private final void zzZ() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzk();
        }
    }

    private final void zzaa() {
        zzam zzamVar = this.zzz;
        if (zzamVar != null) {
            zzamVar.zzm();
        }
    }

    private final boolean zzab() {
        return this.zzA != -1;
    }

    private static int[] zzac(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final long zzB(zzar zzarVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.zzx;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzj.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzC(zzar zzarVar, MediaSeekOptions mediaSeekOptions) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        long position = mediaSeekOptions.isSeekToInfinite() ? 4294967296000L : mediaSeekOptions.getPosition();
        try {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                jSONObject.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzy = Long.valueOf(position);
        this.zzg.zzb(zzd, new zzaj(this, zzarVar));
        return zzd;
    }

    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    public final MediaStatus zzL() {
        return this.zzx;
    }

    public final Task zzN(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject2.put("type", "STORE_SESSION");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("assistant_supported", true);
            jSONObject3.put("display_supported", true);
            jSONObject3.put("is_group", false);
            jSONObject2.put("targetDeviceCapabilities", jSONObject3);
        } catch (JSONException e) {
            this.zza.w(e, "store session failed to create JSON message", new Object[0]);
        }
        try {
            zzg(jSONObject2.toString(), zzd, null);
            this.zzv.zzb(zzd, new zzak(this));
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zzB = taskCompletionSource;
            return taskCompletionSource.getTask();
        } catch (IllegalStateException e2) {
            return Tasks.forException(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027f, code lost:
        r3 = r16.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0281, code lost:
        if (r3 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0284, code lost:
        r0 = r3.zza(r0, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzQ(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.zzap.zzQ(java.lang.String):void");
    }

    public final void zzR(long j, int i) {
        for (zzat zzatVar : zza()) {
            zzatVar.zzd(j, i, null);
        }
    }

    public final void zzS(zzam zzamVar) {
        this.zzz = zzamVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzV();
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        return !liveSeekableRange.isLiveDone() ? zzT(1.0d, endTime, -1L) : endTime;
    }

    public final long zzl() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long startTime = liveSeekableRange.getStartTime();
        if (liveSeekableRange.isMovingWindow()) {
            startTime = zzT(1.0d, startTime, -1L);
        }
        return liveSeekableRange.isLiveDone() ? Math.min(startTime, liveSeekableRange.getEndTime()) : startTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo zzK = zzK();
        if (zzK == null || (mediaStatus = this.zzx) == null) {
            return 0L;
        }
        Long l = this.zzy;
        if (l == null) {
            if (this.zzw == 0) {
                return 0L;
            }
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = mediaStatus.getStreamPosition();
            return (playbackRate == 0.0d || mediaStatus.getPlayerState() != 2) ? streamPosition : zzT(playbackRate, streamPosition, zzK.getStreamDuration());
        }
        if (l.equals(4294967296000L)) {
            if (this.zzx.getLiveSeekableRange() != null) {
                return Math.min(l.longValue(), zzk());
            }
            if (zzo() >= 0) {
                return Math.min(l.longValue(), zzo());
            }
        }
        return l.longValue();
    }

    public final long zzn() {
        MediaStatus mediaStatus = this.zzx;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzan();
    }

    public final long zzo() {
        MediaInfo zzK = zzK();
        if (zzK != null) {
            return zzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzq(zzar zzarVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzd.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzr(zzar zzarVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject2.put("type", Payload.Action.PLAY);
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zze.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzu(zzar zzarVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzq.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzv(zzar zzarVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzr.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzD(zzar zzarVar, long[] jArr) {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzk.zzb(zzd, zzarVar);
        return zzd;
    }

    public final long zzA(zzar zzarVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Boolean bool, Integer num, JSONObject jSONObject) {
        int i3 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i3 == 0 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long zzd = zzd();
            try {
                jSONObject2.put(Payload.PARAM_RENO_REQUEST_ID, zzd);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", zzn());
                if (i != 0) {
                    jSONObject2.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("jump", i2);
                }
                if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                        jSONArray.put(i4, mediaQueueItemArr[i4].toJson());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                if (bool != null) {
                    jSONObject2.put("shuffle", bool);
                }
                String zza = MediaCommon.zza(num);
                if (zza != null) {
                    jSONObject2.put("repeatMode", zza);
                }
                if (i3 != 0) {
                    jSONObject2.put("currentTime", CastUtils.millisecToSec(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
                if (zzab()) {
                    jSONObject2.put("sequenceNumber", this.zzA);
                }
            } catch (JSONException unused) {
            }
            zzg(jSONObject2.toString(), zzd, null);
            this.zzn.zzb(zzd, new zzal(this, zzarVar));
            return zzd;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
