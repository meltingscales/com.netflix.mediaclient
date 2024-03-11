package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4821bnC extends BaseEventJson {
    @SerializedName("vbitrateold")
    protected Long U;
    @SerializedName("vbitrate")
    protected Long V;
    protected transient int W;
    @SerializedName("adlidold")
    protected String X;
    @SerializedName("abitrate")
    protected Long a;
    @SerializedName("vdlid")
    protected String aa;
    @SerializedName("vdlidold")
    protected String ac;
    @SerializedName("abitrateold")
    protected Long c;
    @SerializedName("adlid")
    protected String e;

    protected C4821bnC() {
    }

    public C4821bnC(int i, String str, String str2, String str3, String str4, String str5) {
        super(i == 2 ? "renderstrmswitch" : "arenderstrmswitch", str, str2, str3, str4, str5);
        this.W = i;
    }

    public C4821bnC d(long j) {
        c(j);
        return this;
    }

    public C4821bnC a(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4821bnC b(String str, long j) {
        if (this.W == 1) {
            this.X = str;
            this.c = Long.valueOf(j);
        } else {
            this.ac = str;
            this.U = Long.valueOf(j);
        }
        return this;
    }

    public C4821bnC d(String str, long j) {
        if (this.W == 1) {
            this.e = str;
            this.a = Long.valueOf(j);
        } else {
            this.aa = str;
            this.V = Long.valueOf(j);
        }
        return this;
    }
}
