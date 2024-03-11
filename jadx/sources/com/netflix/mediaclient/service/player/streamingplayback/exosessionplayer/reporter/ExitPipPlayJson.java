package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* loaded from: classes3.dex */
public class ExitPipPlayJson extends BaseEventJson {
    @SerializedName("exittype")
    protected ExitType e;

    /* loaded from: classes3.dex */
    public enum ExitType {
        CONTINUEPLAY,
        ENDSESSION
    }

    public ExitPipPlayJson d(ExitType exitType) {
        this.e = exitType;
        return this;
    }

    protected ExitPipPlayJson() {
    }

    public ExitPipPlayJson(String str, String str2, String str3, String str4, String str5) {
        super("exitpipplay", str, str2, str3, str4, str5);
    }

    public ExitPipPlayJson e(long j) {
        c(j);
        return this;
    }

    public ExitPipPlayJson b(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }
}
