package o;

import java.util.List;

/* loaded from: classes3.dex */
public final class VV {
    private final List<C1291Wa> a;
    private final Integer b;
    private final C1291Wa d;
    private final List<VW> e;

    public final List<VW> b() {
        return this.e;
    }

    public final List<C1291Wa> c() {
        return this.a;
    }

    public final C1291Wa d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VV) {
            VV vv = (VV) obj;
            return C8632dsu.c(this.a, vv.a) && C8632dsu.c(this.b, vv.b) && C8632dsu.c(this.d, vv.d) && C8632dsu.c(this.e, vv.e);
        }
        return false;
    }

    public int hashCode() {
        List<C1291Wa> list = this.a;
        int hashCode = list == null ? 0 : list.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        C1291Wa c1291Wa = this.d;
        int hashCode3 = c1291Wa == null ? 0 : c1291Wa.hashCode();
        List<VW> list2 = this.e;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        List<C1291Wa> list = this.a;
        Integer num = this.b;
        C1291Wa c1291Wa = this.d;
        List<VW> list2 = this.e;
        return "EpisodesScreenData(seasonsList=" + list + ", currentSeasonNumber=" + num + ", currentSeasonData=" + c1291Wa + ", currentSeasonEpisodesList=" + list2 + ")";
    }

    public VV(List<C1291Wa> list, Integer num, C1291Wa c1291Wa, List<VW> list2) {
        this.a = list;
        this.b = num;
        this.d = c1291Wa;
        this.e = list2;
    }
}
