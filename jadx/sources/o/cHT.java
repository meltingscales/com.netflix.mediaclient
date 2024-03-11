package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.model.leafs.originals.interactive.ImpressionData;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;

/* loaded from: classes4.dex */
public interface cHT extends cHW {
    void a(InteractiveMoments interactiveMoments, boolean z);

    void a(String str);

    void b(PlaylistTimestamp playlistTimestamp);

    void c(ImpressionData impressionData);

    void e(int i, boolean z);

    void g();

    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(cHT cht, InteractiveMoments interactiveMoments, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInteractiveMoments");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            cht.a(interactiveMoments, z);
        }
    }
}
