package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import o.InterfaceC4660bih;

/* renamed from: o.bnc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4847bnc extends BaseEventJson {
    @SerializedName("avoidseekpos")
    protected long U;
    @SerializedName("imagebasedsubtitle")
    protected Boolean V;
    @SerializedName("seekSkippedSoff")
    private long X;
    @SerializedName("avoidseek")
    protected boolean a;
    @SerializedName(Payload.PARAM_RENO_CAUSE)
    protected String c;
    @SerializedName("cdnid")
    protected Integer e;

    public BaseEventJson a(boolean z, long j, long j2) {
        this.a = z;
        this.U = j;
        this.X = j2;
        return this;
    }

    public C4847bnc d(boolean z) {
        String str;
        if (z) {
            this.V = Boolean.TRUE;
            str = "timedtext";
        } else {
            str = null;
            this.V = null;
        }
        this.c = str;
        return this;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson
    /* renamed from: d */
    public C4847bnc b(Long l) {
        super.b(l);
        c();
        return this;
    }

    private void c() {
        Long l = this.C;
        if (l != null && h()) {
            this.H = Boolean.valueOf(C4878boG.b.e(l.toString()));
        }
    }

    protected C4847bnc() {
    }

    public C4847bnc(String str, String str2, String str3, String str4, String str5) {
        super("intrplay", str, str2, str3, str4, str5);
    }

    public C4847bnc d(long j, PlaylistTimestamp playlistTimestamp) {
        super.c(j, playlistTimestamp);
        return this;
    }

    public C4847bnc d(long j) {
        c(j);
        return this;
    }

    public C4847bnc d(InterfaceC4660bih.e eVar) {
        if (eVar != null) {
            this.e = Integer.valueOf(eVar.m);
        }
        return this;
    }

    public C4847bnc a(long j) {
        this.O = Long.valueOf(j / 1000);
        return this;
    }
}
