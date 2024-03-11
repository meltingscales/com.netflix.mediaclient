package o;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bmO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4780bmO extends BaseEventJson {
    @SerializedName("oldtrack")
    protected a a;
    @SerializedName("switchdelay")
    protected Long c;
    @SerializedName("track")
    protected a e;

    public C4780bmO a(a aVar) {
        this.e = aVar;
        return this;
    }

    public C4780bmO c(a aVar) {
        this.a = aVar;
        return this;
    }

    protected C4780bmO() {
    }

    public C4780bmO(String str, String str2, String str3, String str4, String str5) {
        super("audioswitch", str, str2, str3, str4, str5);
    }

    /* renamed from: o.bmO$a */
    /* loaded from: classes3.dex */
    public static class a {
        @SerializedName("trackId")
        protected String a;
        @SerializedName("bcp47")
        protected String b;
        @SerializedName("chan")
        protected int c;
        @SerializedName("rank")
        protected int d;
        @SerializedName("downloadableId")
        protected String e;

        public a(Format format) {
            this.d = -1;
            this.c = -1;
            if (format != null) {
                String str = format.id;
                this.a = str;
                this.b = format.language;
                this.e = str;
                this.c = format.channelCount;
                Metadata metadata = format.metadata;
                if (metadata == null || metadata.length() < 1 || !(format.metadata.get(0) instanceof NetflixIdMetadataEntry)) {
                    this.d = -1;
                } else {
                    this.d = ((NetflixIdMetadataEntry) format.metadata.get(0)).e;
                }
            }
        }
    }

    public C4780bmO d(long j) {
        c(j);
        return this;
    }

    public C4780bmO e(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4780bmO a(long j) {
        this.c = Long.valueOf(j);
        return this;
    }
}
