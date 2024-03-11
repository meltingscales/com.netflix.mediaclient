package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bmR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4783bmR extends BaseEventJson {
    @SerializedName("maxDisplayBrightness")
    private int U;
    @SerializedName("adaptiveBrightnessEnabled")
    private boolean V;
    @SerializedName("effectiveDisplayBrightness")
    private int W;
    @SerializedName("brightness")
    protected int a;
    @SerializedName(NetflixActivity.EXTRA_SOURCE)
    protected String c;
    @SerializedName("brightnessOld")
    protected int e;

    public BaseEventJson b(boolean z) {
        this.V = z;
        return this;
    }

    public C4783bmR b(int i) {
        this.W = i;
        return this;
    }

    public C4783bmR c(int i) {
        this.a = i;
        return this;
    }

    public C4783bmR d(int i) {
        this.U = i;
        return this;
    }

    public C4783bmR d(String str) {
        this.c = str;
        return this;
    }

    public C4783bmR e(int i) {
        this.e = i;
        return this;
    }

    protected C4783bmR() {
    }

    public C4783bmR(String str, String str2, String str3, String str4, String str5) {
        super("brightnesschange", str, str2, str3, str4, str5);
    }

    public C4783bmR a(long j) {
        c(j);
        return this;
    }

    public C4783bmR b(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }
}
