package o;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.bkd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4744bkd {
    private C4646biT b;
    private final ExoPlayer d;
    private final C4703bjX e;
    private C4745bkf i;
    private PlaylistMap j;
    private final List<Pair<Handler, MediaSourceEventListener>> a = new ArrayList();
    private final Map<String, ClippingMediaSource> c = new HashMap();
    private final ArrayList<String> h = new ArrayList<>();
    private final Map<String, String> g = new HashMap();

    public C4744bkd(ExoPlayer exoPlayer, C4703bjX c4703bjX, C4646biT c4646biT) {
        C4745bkf c4745bkf = new C4745bkf();
        this.i = c4745bkf;
        this.e = c4703bjX;
        this.d = exoPlayer;
        exoPlayer.setShuffleOrder(c4745bkf);
        exoPlayer.setShuffleModeEnabled(true);
        this.b = c4646biT;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d A[LOOP:2: B:67:0x0187->B:69:0x018d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap r35) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4744bkd.e(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap):void");
    }

    public void c(String str, String str2) {
        String put;
        boolean containsKey = this.j.h().containsKey(str);
        Assertions.checkArgument(containsKey, "source segment " + str + " did not exist in playgraph");
        boolean z = str2 == null || this.j.h().containsKey(str2);
        Assertions.checkArgument(z, "destination segment " + str2 + " did not exist in playgraph");
        if (str2 == null) {
            put = this.g.remove(str);
        } else {
            put = this.g.put(str, str2);
        }
        if (true ^ Objects.equals(put, str2)) {
            C1044Mm.a("PlaygraphMediaSourceManager", "setting branch choice of %s -> %s (previous=%s)", str, str2, put);
            a(false);
        }
    }

    public C5209buT e(int i) {
        return this.i.d(i);
    }

    public ClippingMediaSource a(String str) {
        return this.c.get(str);
    }

    public void b(String str) {
        c(str, null);
        ClippingMediaSource a = a(str);
        if (a != null) {
            a.updateEndPositionUs(-9223372036854775807L);
        }
    }

    private void a(List<String> list) {
        for (String str : list) {
            int d = d(str);
            this.c.remove(str);
            this.h.remove(d);
            a(true);
            this.d.removeMediaItem(d);
        }
    }

    private void c(List<Pair<String, ClippingMediaSource>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean isEmpty = this.c.isEmpty();
        for (Pair<String, ClippingMediaSource> pair : list) {
            this.c.put((String) pair.first, (ClippingMediaSource) pair.second);
            this.h.add((String) pair.first);
            arrayList.add((MediaSource) pair.second);
        }
        a(true);
        if (isEmpty) {
            this.d.setMediaSources(arrayList);
        } else {
            this.d.addMediaSources(arrayList);
        }
    }

    public int d(String str) {
        for (int i = 0; i < this.h.size(); i++) {
            if (this.h.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private void a(boolean z) {
        C4705bjZ c4705bjZ = new C4705bjZ(this.h, this.j.h(), this.g);
        if (!z) {
            C4745bkf c4745bkf = new C4745bkf(c4705bjZ);
            this.i = c4745bkf;
            this.d.setShuffleOrder(c4745bkf);
            return;
        }
        this.i.a(c4705bjZ);
    }
}
