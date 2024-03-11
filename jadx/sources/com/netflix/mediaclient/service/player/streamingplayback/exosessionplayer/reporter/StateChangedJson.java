package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* loaded from: classes3.dex */
public class StateChangedJson extends BaseEventJson {
    @SerializedName("oldstate")
    public State a;
    @SerializedName("newstate")
    public State e;

    /* loaded from: classes3.dex */
    enum State {
        PAUSED,
        PLAYING
    }

    protected StateChangedJson() {
    }

    public StateChangedJson(String str, String str2, String str3, String str4, String str5) {
        super("statechanged", str, str2, str3, str4, str5);
    }

    public StateChangedJson a(boolean z) {
        if (z) {
            this.a = State.PLAYING;
            this.e = State.PAUSED;
        } else {
            this.a = State.PAUSED;
            this.e = State.PLAYING;
        }
        return this;
    }

    public StateChangedJson e(long j) {
        super.c(j);
        return this;
    }

    public StateChangedJson e(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public StateChangedJson d(long j) {
        this.O = Long.valueOf(j / 1000);
        return this;
    }
}
