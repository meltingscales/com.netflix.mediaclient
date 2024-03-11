package o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnb  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C4846bnb extends BaseEventJson {
    @SerializedName("curr")
    protected c a;
    @SerializedName("mediatype")
    protected String c;
    @SerializedName("prev")
    protected c e;

    protected C4846bnb() {
        this.c = "video";
    }

    public C4846bnb(String str, String str2, String str3, String str4, String str5) {
        super("livepipelinefailover", str, str2, str3, str4, str5);
        this.c = "video";
    }

    public C4846bnb e(long j) {
        c(j);
        return this;
    }

    public C4846bnb a(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4846bnb b(String str, String str2) {
        this.e = new c(str, str2);
        return this;
    }

    public C4846bnb c(String str, String str2) {
        this.a = new c(str, str2);
        return this;
    }

    /* renamed from: o.bnb$c */
    /* loaded from: classes6.dex */
    static class c {
        @SerializedName("enc")
        public String b;
        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ORIGIN)
        public String e;

        public c(String str, String str2) {
            this.b = str;
            this.e = str2;
        }
    }
}
