package o;

import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import o.C2376afA;

/* loaded from: classes4.dex */
public final class bZK {
    public static final e a = new e(null);
    private final Map<Integer, LiveState> b;
    private final Map<Integer, Integer> c;
    private final Set<String> d;
    private final Map<Integer, C2376afA.e> e;

    public bZK() {
        this(null, null, null, 7, null);
    }

    public final Set<String> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bZK) {
            bZK bzk = (bZK) obj;
            return C8632dsu.c(this.b, bzk.b) && C8632dsu.c(this.e, bzk.e) && C8632dsu.c(this.c, bzk.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        Map<Integer, LiveState> map = this.b;
        Map<Integer, C2376afA.e> map2 = this.e;
        Map<Integer, Integer> map3 = this.c;
        return "LiveVideosState(videoIdToState=" + map + ", videoIdToLiveBoxArtData=" + map2 + ", videoIdToEpisodeNumber=" + map3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bZK(Map<Integer, ? extends LiveState> map, Map<Integer, C2376afA.e> map2, Map<Integer, Integer> map3) {
        Set<String> W;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        this.b = map;
        this.e = map2;
        this.c = map3;
        ArrayList arrayList = new ArrayList();
        for (C2376afA.e eVar : map2.values()) {
            String e2 = eVar != null ? eVar.e() : null;
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        W = C8576dqs.W(arrayList);
        this.d = W;
    }

    public /* synthetic */ bZK(Map map, Map map2, Map map3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? dqF.c() : map, (i & 2) != 0 ? dqF.c() : map2, (i & 4) != 0 ? dqF.c() : map3);
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public final LiveState a(Integer num) {
        return num == null ? LiveState.e : this.b.getOrDefault(num, LiveState.e);
    }

    public final C2376afA.e a(int i) {
        if (a(Integer.valueOf(i)).b()) {
            return this.e.get(Integer.valueOf(i));
        }
        return null;
    }

    public final int d(int i) {
        return this.c.getOrDefault(Integer.valueOf(i), -1).intValue();
    }

    public final bZK a(bZK bzk) {
        if (bzk == null) {
            return this;
        }
        Map d = dqF.d(this.b);
        d.putAll(bzk.b);
        Map d2 = dqF.d(this.e);
        d2.putAll(bzk.e);
        Map d3 = dqF.d(this.c);
        d3.putAll(bzk.c);
        return new bZK(d, d2, d3);
    }
}
