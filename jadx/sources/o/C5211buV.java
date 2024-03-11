package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.Map;

/* renamed from: o.buV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5211buV extends PlaylistMap<C5209buT> {
    private final long d;

    public long c() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap
    public long e(String str) {
        if (str == null) {
            return -1L;
        }
        return this.d;
    }

    public C5211buV(Map<String, C5209buT> map, String str, String str2, long j) {
        super(map, str, str2);
        this.d = j;
    }
}
