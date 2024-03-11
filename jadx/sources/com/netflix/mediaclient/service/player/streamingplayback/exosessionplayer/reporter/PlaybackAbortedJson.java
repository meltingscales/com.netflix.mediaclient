package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* loaded from: classes3.dex */
public class PlaybackAbortedJson extends BaseEventJson {
    @SerializedName("waittime")
    protected long U;
    @SerializedName("hasContentPlaygraph")
    private Boolean V;
    @SerializedName("uiLabel")
    protected String W;
    @SerializedName("birthtime")
    private long X;
    @SerializedName("abortedevent")
    protected AbortedEvent a;
    @SerializedName("closetime")
    private long ac;
    @SerializedName("resumeplayreason")
    protected ResumePlayReason c;
    @SerializedName("groupname")
    protected String e;

    /* loaded from: classes3.dex */
    public enum AbortedEvent {
        STARTPLAY,
        RESUMEPLAY,
        TRANSITION
    }

    /* loaded from: classes3.dex */
    public enum ResumePlayReason {
        REPOS,
        REBUFFER,
        SKIP,
        AUDIO
    }

    public PlaybackAbortedJson a(long j) {
        this.U = j;
        return this;
    }

    public PlaybackAbortedJson a(String str) {
        this.W = str;
        return this;
    }

    public PlaybackAbortedJson c(ResumePlayReason resumePlayReason) {
        this.c = resumePlayReason;
        return this;
    }

    public PlaybackAbortedJson d(long j) {
        this.ac = j;
        return this;
    }

    public PlaybackAbortedJson e(AbortedEvent abortedEvent) {
        this.a = abortedEvent;
        return this;
    }

    public void e(Boolean bool) {
        this.V = bool;
    }

    protected PlaybackAbortedJson() {
    }

    public PlaybackAbortedJson(String str, String str2, String str3, String str4, String str5, long j) {
        super("playbackaborted", str, str2, str3, str4, str5);
        this.X = j;
    }

    public PlaybackAbortedJson b(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public PlaybackAbortedJson e(long j) {
        c(j);
        return this;
    }

    public PlaybackAbortedJson b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "control";
        }
        this.e = str;
        return this;
    }
}
