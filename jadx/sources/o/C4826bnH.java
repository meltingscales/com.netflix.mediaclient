package o;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.common.NetflixTimedTextTrackData;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bnH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4826bnH extends BaseEventJson {
    @SerializedName("switchdelay")
    protected Long a;
    @SerializedName("oldtrack")
    protected b c;
    @SerializedName("track")
    protected b e;

    protected C4826bnH() {
    }

    public C4826bnH(String str, String str2, String str3, String str4, String str5) {
        super("timedtextswitch", str, str2, str3, str4, str5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bnH$b */
    /* loaded from: classes3.dex */
    public static class b {
        @SerializedName("downloadableId")
        protected String a;
        @SerializedName("trackId")
        protected String b;
        @SerializedName("rank")
        protected int c;
        @SerializedName("bcp47")
        protected String d;
        @SerializedName("profile")
        protected String e;

        private b(Format format) {
            this.c = -1;
            if (format != null) {
                String str = format.id;
                this.a = str;
                this.b = str;
                this.d = format.language;
                this.e = C4453bem.c(format);
                Metadata metadata = format.metadata;
                if (metadata == null || metadata.length() < 1 || !(format.metadata.get(0) instanceof NetflixTimedTextTrackData)) {
                    this.c = -1;
                } else {
                    this.c = ((NetflixTimedTextTrackData) format.metadata.get(0)).e;
                }
            }
        }
    }

    public C4826bnH e(Format format) {
        this.e = new b(format);
        return this;
    }

    public C4826bnH a(Format format) {
        this.c = new b(format);
        return this;
    }

    public C4826bnH a(long j) {
        c(j);
        return this;
    }

    public C4826bnH a(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4826bnH e(long j) {
        this.a = Long.valueOf(j);
        return this;
    }
}
