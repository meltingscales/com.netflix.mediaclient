package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC4610bhk;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bne  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4849bne extends BaseEventJson {
    @SerializedName("vbitrate")
    protected Long U;
    @SerializedName("abitrate")
    protected Long a;
    @SerializedName("trace")
    protected List<Long[]> c;
    @SerializedName("samplinginterval")
    protected Long e;

    protected C4849bne() {
        this.c = new ArrayList();
    }

    public C4849bne(String str, String str2, String str3, String str4, String str5) {
        super("livereport", str, str2, str3, str4, str5);
        this.c = new ArrayList();
    }

    public C4849bne d(long j) {
        this.e = Long.valueOf(j);
        return this;
    }

    public void e(long j, long j2, long j3, long j4) {
        this.c.add(new Long[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)});
    }

    public C4849bne a(long j) {
        c(j);
        return this;
    }

    public C4849bne d(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public C4849bne d(InterfaceC4610bhk.b bVar) {
        this.U = bVar == null ? null : Long.valueOf(bVar.a / 1000);
        return this;
    }

    public C4849bne c(InterfaceC4610bhk.b bVar) {
        this.a = bVar == null ? null : Long.valueOf(bVar.a / 1000);
        return this;
    }

    public boolean c() {
        return this.c.isEmpty();
    }

    public void a() {
        this.c.clear();
    }
}
