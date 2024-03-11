package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.bja  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4706bja {
    public static final List<String> d(long j, PlaylistMap<C5209buT> playlistMap) {
        C8632dsu.c((Object) playlistMap, "");
        ArrayList arrayList = new ArrayList();
        Map<String, C5209buT> h = playlistMap.h();
        C8632dsu.a(h, "");
        for (Map.Entry<String, C5209buT> entry : h.entrySet()) {
            if (entry.getValue() instanceof C5273bve) {
                C5209buT value = entry.getValue();
                C8632dsu.d(value);
                if (((C5273bve) value).i == j) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }
}
