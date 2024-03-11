package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import o.C4642biP;

/* renamed from: o.bmJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4775bmJ extends BaseEventJson {
    @SerializedName("auxSrcmidType")
    private String a;
    @SerializedName("reason")
    private String e;

    public final C4775bmJ b(String str) {
        C8632dsu.c((Object) str, "");
        this.h = str;
        return this;
    }

    public final C4775bmJ d(String str) {
        this.e = str;
        return this;
    }

    public C4775bmJ(String str, String str2, String str3, String str4, boolean z, String str5) {
        super("segmentdropped", str, str2, str3, str4, str5);
        if (z) {
            a(Logblob.Severity.error);
        } else {
            a(Logblob.Severity.info);
        }
    }

    public final C4775bmJ a(long j) {
        c(j);
        return this;
    }

    public final C4775bmJ a(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }

    public final C4775bmJ e(long j) {
        this.i = Long.valueOf(j);
        return this;
    }

    public final C4775bmJ e(C4642biP.e eVar) {
        this.j = eVar != null ? Long.valueOf(eVar.a()) : null;
        if (eVar != null) {
            if (eVar.n()) {
                this.a = C4855bnk.a.d(SegmentType.a);
            } else {
                this.a = C4855bnk.a.d(SegmentType.c);
            }
        }
        return this;
    }
}
