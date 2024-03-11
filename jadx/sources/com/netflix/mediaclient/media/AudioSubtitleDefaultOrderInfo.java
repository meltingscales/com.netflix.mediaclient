package com.netflix.mediaclient.media;

import o.AbstractC4562bgp;
import o.C1044Mm;
import o.C8123deT;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AudioSubtitleDefaultOrderInfo implements Comparable<AudioSubtitleDefaultOrderInfo> {
    private String audioTrackId;
    private long creationTimeInMs;
    private int preferenceOrder;
    private String subtitleTrackId;

    public String getAudioTrackId() {
        return this.audioTrackId;
    }

    public long getCreationTimeInMs() {
        return this.creationTimeInMs;
    }

    public int getPreferenceOrder() {
        return this.preferenceOrder;
    }

    public String getSubtitleTrackId() {
        return this.subtitleTrackId;
    }

    public AudioSubtitleDefaultOrderInfo(JSONObject jSONObject, long j) {
        this.audioTrackId = C8123deT.a(jSONObject, "audioTrackId", (String) null);
        this.subtitleTrackId = C8123deT.a(jSONObject, "subtitleTrackId", (String) null);
        this.preferenceOrder = C8123deT.a(jSONObject, "preferenceOrder", -1);
        this.creationTimeInMs = j;
    }

    public AudioSubtitleDefaultOrderInfo(AbstractC4562bgp abstractC4562bgp, long j) {
        this.audioTrackId = abstractC4562bgp.e();
        this.subtitleTrackId = abstractC4562bgp.b();
        this.preferenceOrder = abstractC4562bgp.c();
        this.creationTimeInMs = j;
    }

    public AudioSubtitleDefaultOrderInfo(String str, String str2, int i) {
        this.audioTrackId = str;
        this.subtitleTrackId = str2;
        this.preferenceOrder = i;
    }

    public String toString() {
        return "AudioSubtitleDefaultOrderInfo [audioTrackId=" + this.audioTrackId + ", subtitleTrackId=" + this.subtitleTrackId + ", preferenceOrder=" + this.preferenceOrder + ", creationTimeInMs=" + this.creationTimeInMs + "]";
    }

    @Override // java.lang.Comparable
    public int compareTo(AudioSubtitleDefaultOrderInfo audioSubtitleDefaultOrderInfo) {
        if (audioSubtitleDefaultOrderInfo == null) {
            return 1;
        }
        int i = this.preferenceOrder;
        int i2 = audioSubtitleDefaultOrderInfo.preferenceOrder;
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public static void dumpLog(AudioSubtitleDefaultOrderInfo[] audioSubtitleDefaultOrderInfoArr, String str) {
        if (audioSubtitleDefaultOrderInfoArr != null) {
            return;
        }
        C1044Mm.d(str, "Defaults are null!");
    }
}
