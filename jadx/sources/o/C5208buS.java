package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.buS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5208buS extends PlaylistMap<C5273bve> {
    public C5208buS(Map<String, C5273bve> map, String str, String str2) {
        super(map, str, str2);
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap
    public long e(String str) {
        C5273bve a;
        if (str == null || (a = a(str)) == null) {
            return -1L;
        }
        return a.i;
    }

    public b d() {
        b bVar = new b(this.e);
        bVar.c.putAll(this.a);
        bVar.b = this.b;
        return bVar;
    }

    public String toString() {
        return "GenericPlaylistMap id=" + this.e + " segmentsMap=" + this.a + " initialSegmentId=" + this.b;
    }

    /* renamed from: o.buS$b */
    /* loaded from: classes4.dex */
    public static class b {
        private String b;
        private Map<String, C5273bve> c = new HashMap();
        private final String d;

        public b d(String str) {
            this.b = str;
            return this;
        }

        public b(String str) {
            this.d = str;
        }

        public C5208buS a() {
            return new C5208buS(new HashMap(this.c), this.b, this.d);
        }

        public b a(String str, C5273bve c5273bve) {
            this.c.put(str, c5273bve);
            return this;
        }
    }
}
