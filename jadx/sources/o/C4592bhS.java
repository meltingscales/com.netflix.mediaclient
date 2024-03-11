package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.bhS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4592bhS implements IPlaylistControl, InterfaceC5274bvf {
    public final C4588bhO a;
    private InterfaceC5274bvf b;
    public PlaylistMap d;
    public final Map<String, Map<String, a>> e = Collections.synchronizedMap(new HashMap());

    public C4592bhS(C4588bhO c4588bhO, C4886boO c4886boO) {
        this.a = c4588bhO;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistMap H() {
        return this.a.o();
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(PlaylistMap playlistMap) {
        if (playlistMap.equals(this.d)) {
            C1044Mm.a("PlaygraphBroker", "updatePlaylistMap - Playgraph is not changed.");
            return false;
        } else if (this.a.c(playlistMap)) {
            this.d = playlistMap;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public boolean d(String str, String str2) {
        return this.a.d(str, str2);
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public PlaylistTimestamp l() {
        return c(b());
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void d(PlaylistTimestamp playlistTimestamp) {
        a(playlistTimestamp);
    }

    protected void a(PlaylistTimestamp playlistTimestamp) {
        e(b(playlistTimestamp));
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void setSegmentTransitionEndListener(InterfaceC5274bvf interfaceC5274bvf) {
        this.b = interfaceC5274bvf;
        if (interfaceC5274bvf != null) {
            this.a.c(this);
        }
    }

    public boolean e(PlaylistMap playlistMap) {
        return this.a.c(playlistMap);
    }

    public PlaylistMap c() {
        return this.a.o();
    }

    public void e(PlaylistTimestamp playlistTimestamp) {
        this.a.c(playlistTimestamp);
    }

    public PlaylistTimestamp b() {
        return this.a.j();
    }

    public String d(String str) {
        return c(new PlaylistTimestamp(this.d.b(), str, 0L)).a;
    }

    public long a(String str) {
        return this.d.e(d(str));
    }

    protected PlaylistTimestamp b(PlaylistTimestamp playlistTimestamp) {
        Map<String, a> map = this.e.get(playlistTimestamp.a);
        if (map == null || map.isEmpty()) {
            return playlistTimestamp;
        }
        long e2 = playlistTimestamp.e(this.d);
        for (Map.Entry<String, a> entry : map.entrySet()) {
            String key = entry.getKey();
            e eVar = entry.getValue().a;
            C5273bve c5273bve = entry.getValue().c;
            if (eVar != null) {
                long a2 = eVar.a(e2);
                if (a2 >= 0) {
                    return new PlaylistTimestamp(this.d.b(), key, a2);
                }
            } else if (!key.equals(playlistTimestamp.a) && c5273bve.c <= e2) {
                long j = c5273bve.b;
                if (j == -1 || j > e2) {
                    return new PlaylistTimestamp(this.d.b(), key, e2 - c5273bve.c);
                }
            }
        }
        return playlistTimestamp;
    }

    private PlaylistTimestamp c(PlaylistTimestamp playlistTimestamp) {
        long j;
        Iterator<Map.Entry<String, Map<String, a>>> it = this.e.entrySet().iterator();
        String str = null;
        a aVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Map<String, a>> next = it.next();
            a aVar2 = next.getValue().get(playlistTimestamp.a);
            if (aVar2 != null) {
                str = next.getKey();
                aVar = aVar2;
                break;
            }
            aVar = aVar2;
        }
        if (str == null) {
            return playlistTimestamp;
        }
        e eVar = aVar.a;
        if (eVar != null) {
            j = eVar.c(playlistTimestamp.e);
        } else {
            j = aVar.c.c + playlistTimestamp.e;
        }
        return new PlaylistTimestamp(playlistTimestamp.c, str, j);
    }

    @Override // o.InterfaceC5274bvf
    public void e(String str, PlaylistTimestamp playlistTimestamp) {
        if (this.b != null) {
            String d = d(str);
            if (Objects.equals(d, c(playlistTimestamp).a)) {
                return;
            }
            this.b.e(d, playlistTimestamp);
        }
    }

    /* renamed from: o.bhS$a */
    /* loaded from: classes3.dex */
    public static class a {
        public e a;
        public final C5273bve c;

        public a(C5273bve c5273bve, e eVar) {
            this.c = c5273bve;
            this.a = eVar;
        }

        public void a(long j) {
            e eVar = this.a;
            if (eVar != null) {
                this.a = new e(j, eVar.c, this.a.d);
            }
        }
    }

    /* renamed from: o.bhS$e */
    /* loaded from: classes3.dex */
    public static class e {
        private final long b;
        private final long c;
        private final float d;

        public long a(long j) {
            if (j <= this.c) {
                long j2 = this.b;
                if (j < j2) {
                    return -1L;
                }
                return ((float) (j - j2)) / this.d;
            }
            return -1L;
        }

        public e(long j, long j2, float f) {
            this.b = j;
            this.c = j2;
            this.d = f;
        }

        long c(long j) {
            return d(this.b, this.c, this.d, j);
        }

        static long d(long j, long j2, float f, long j3) {
            return Math.min(((float) j) + (f * ((float) j3)), j2);
        }
    }
}
