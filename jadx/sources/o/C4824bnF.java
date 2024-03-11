package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4824bnF extends BaseEventJson {
    @SerializedName("segmentoffsetold")
    protected Long U;
    @SerializedName("segmentold")
    protected String V;
    @SerializedName("reason")
    protected String X;
    @SerializedName("moffold")
    protected long a;
    @SerializedName("navt")
    protected long c;
    @SerializedName("moffoldms")
    protected long e;

    public C4824bnF a(long j) {
        this.c = j;
        return this;
    }

    public C4824bnF a(String str) {
        this.X = str;
        return this;
    }

    protected C4824bnF() {
    }

    public C4824bnF(String str, String str2, String str3, String str4, String str5) {
        super("repos", str, str2, str3, str4, str5);
    }

    public C4824bnF a(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public C4824bnF b(long j, PlaylistTimestamp playlistTimestamp) {
        this.a = j / 1000;
        this.e = j;
        if (playlistTimestamp != null) {
            this.V = playlistTimestamp.a;
            this.U = Long.valueOf(playlistTimestamp.e);
        }
        return this;
    }

    public C4824bnF d(long j) {
        c(j);
        return this;
    }

    public C4824bnF e(long j) {
        this.O = Long.valueOf(j / 1000);
        return this;
    }
}
