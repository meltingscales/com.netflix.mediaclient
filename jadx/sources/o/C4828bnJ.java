package o;

import androidx.media3.exoplayer.DecoderCounters;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bnJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4828bnJ extends BaseEventJson {
    @SerializedName("speedold")
    protected int a;
    @SerializedName("videocounter")
    protected d c;
    @SerializedName("speed")
    protected int e;

    /* renamed from: o.bnJ$d */
    /* loaded from: classes3.dex */
    public static class d {
        @SerializedName("numrendrop")
        protected Integer a;
        @SerializedName("numdec")
        protected Integer b;
        @SerializedName("numren")
        protected Integer c;
        @SerializedName("numskip")
        protected Integer d;
    }

    public C4828bnJ d(int i, int i2) {
        this.a = i;
        this.e = i2;
        return this;
    }

    protected C4828bnJ() {
    }

    public C4828bnJ(String str, String str2, String str3, String str4, long j, String str5) {
        super("speedchanged", str, str2, str3, str4, str5);
        super.b(Long.valueOf(j));
    }

    public C4828bnJ a(DecoderCounters decoderCounters) {
        if (decoderCounters != null) {
            d dVar = new d();
            this.c = dVar;
            dVar.d = Integer.valueOf(decoderCounters.skippedOutputBufferCount);
            this.c.a = Integer.valueOf(decoderCounters.droppedBufferCount);
            this.c.c = Integer.valueOf(decoderCounters.renderedOutputBufferCount);
            this.c.b = Integer.valueOf(decoderCounters.queuedInputBufferCount);
        }
        return this;
    }

    public C4828bnJ d(long j) {
        super.c(j);
        return this;
    }

    public C4828bnJ d(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }
}
