package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4843bnY extends BaseEventJson {
    @SerializedName("audioSinkType")
    protected String a;
    @SerializedName("volume")
    protected int c;
    @SerializedName("volumeOld")
    protected int e;

    public C4843bnY b(int i) {
        this.c = i;
        return this;
    }

    public C4843bnY b(String str) {
        this.a = str;
        return this;
    }

    public C4843bnY d(int i) {
        this.e = i;
        return this;
    }

    protected C4843bnY() {
    }

    public C4843bnY(String str, String str2, String str3, String str4, String str5) {
        super("volumechange", str, str2, str3, str4, str5);
    }

    public C4843bnY a(long j) {
        c(j);
        return this;
    }

    public C4843bnY b(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }
}
