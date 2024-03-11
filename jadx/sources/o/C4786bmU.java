package o;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.BaseEventJson;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;

/* renamed from: o.bmU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4786bmU extends BaseEventJson {
    protected C4786bmU() {
    }

    public C4786bmU(String str, String str2, String str3, String str4, String str5) {
        super("enterpipplay", str, str2, str3, str4, str5);
    }

    public C4786bmU d(long j) {
        c(j);
        return this;
    }

    public C4786bmU b(long j, PlaylistTimestamp playlistTimestamp) {
        c(j, playlistTimestamp);
        return this;
    }
}
