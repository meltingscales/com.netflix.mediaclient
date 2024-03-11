package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.bYw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4171bYw implements InterfaceC8962gc {
    private final bZK a;
    private final List<InterfaceC5227bul> b;
    private final AbstractC8918fl<dpR> c;
    private final Integer d;
    private final String e;
    private final AbstractC8918fl<InterfaceC8366diy> f;
    private final String g;
    private final boolean h;
    private final AbstractC8918fl<List<InterfaceC5195buF>> i;
    private final Map<Integer, Boolean> j;

    public C4171bYw() {
        this(null, null, false, null, null, null, null, null, null, null, 1023, null);
    }

    public final AbstractC8918fl<dpR> a() {
        return this.c;
    }

    public final List<InterfaceC5227bul> b() {
        return this.b;
    }

    public final Integer c() {
        return this.d;
    }

    public final C4171bYw c(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, boolean z, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2, Integer num, List<? extends InterfaceC5227bul> list, AbstractC8918fl<dpR> abstractC8918fl3, String str2, bZK bzk, Map<Integer, Boolean> map) {
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) abstractC8918fl3, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) map, "");
        return new C4171bYw(str, abstractC8918fl, z, abstractC8918fl2, num, list, abstractC8918fl3, str2, bzk, map);
    }

    public final String component1() {
        return this.g;
    }

    public final Map<Integer, Boolean> component10() {
        return this.j;
    }

    public final AbstractC8918fl<InterfaceC8366diy> component2() {
        return this.f;
    }

    public final boolean component3() {
        return this.h;
    }

    public final AbstractC8918fl<List<InterfaceC5195buF>> component4() {
        return this.i;
    }

    public final Integer component5() {
        return this.d;
    }

    public final List<InterfaceC5227bul> component6() {
        return this.b;
    }

    public final AbstractC8918fl<dpR> component7() {
        return this.c;
    }

    public final String component8() {
        return this.e;
    }

    public final bZK component9() {
        return this.a;
    }

    public final AbstractC8918fl<List<InterfaceC5195buF>> d() {
        return this.i;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4171bYw) {
            C4171bYw c4171bYw = (C4171bYw) obj;
            return C8632dsu.c((Object) this.g, (Object) c4171bYw.g) && C8632dsu.c(this.f, c4171bYw.f) && this.h == c4171bYw.h && C8632dsu.c(this.i, c4171bYw.i) && C8632dsu.c(this.d, c4171bYw.d) && C8632dsu.c(this.b, c4171bYw.b) && C8632dsu.c(this.c, c4171bYw.c) && C8632dsu.c((Object) this.e, (Object) c4171bYw.e) && C8632dsu.c(this.a, c4171bYw.a) && C8632dsu.c(this.j, c4171bYw.j);
        }
        return false;
    }

    public final boolean f() {
        return this.h;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.g;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.f.hashCode();
        int hashCode3 = Boolean.hashCode(this.h);
        int hashCode4 = this.i.hashCode();
        Integer num = this.d;
        int hashCode5 = num == null ? 0 : num.hashCode();
        List<InterfaceC5227bul> list = this.b;
        int hashCode6 = list == null ? 0 : list.hashCode();
        int hashCode7 = this.c.hashCode();
        String str2 = this.e;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + this.j.hashCode();
    }

    public final AbstractC8918fl<InterfaceC8366diy> j() {
        return this.f;
    }

    public String toString() {
        String str = this.g;
        AbstractC8918fl<InterfaceC8366diy> abstractC8918fl = this.f;
        boolean z = this.h;
        AbstractC8918fl<List<InterfaceC5195buF>> abstractC8918fl2 = this.i;
        Integer num = this.d;
        List<InterfaceC5227bul> list = this.b;
        AbstractC8918fl<dpR> abstractC8918fl3 = this.c;
        String str2 = this.e;
        bZK bzk = this.a;
        Map<Integer, Boolean> map = this.j;
        return "ShowState(showId=" + str + ", showDetails=" + abstractC8918fl + ", willFetchSeasonsAndEpisodes=" + z + ", seasons=" + abstractC8918fl2 + ", currentSeasonIndex=" + num + ", episodes=" + list + ", episodesRequest=" + abstractC8918fl3 + ", currentEpisodeId=" + str2 + ", liveVideosState=" + bzk + ", remindMeLocalState=" + map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4171bYw(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, boolean z, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2, Integer num, List<? extends InterfaceC5227bul> list, AbstractC8918fl<dpR> abstractC8918fl3, String str2, bZK bzk, Map<Integer, Boolean> map) {
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) abstractC8918fl3, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) map, "");
        this.g = str;
        this.f = abstractC8918fl;
        this.h = z;
        this.i = abstractC8918fl2;
        this.d = num;
        this.b = list;
        this.c = abstractC8918fl3;
        this.e = str2;
        this.a = bzk;
        this.j = map;
    }

    public /* synthetic */ C4171bYw(String str, AbstractC8918fl abstractC8918fl, boolean z, AbstractC8918fl abstractC8918fl2, Integer num, List list, AbstractC8918fl abstractC8918fl3, String str2, bZK bzk, Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C8974go.e : abstractC8918fl2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list, (i & 64) != 0 ? C8974go.e : abstractC8918fl3, (i & 128) == 0 ? str2 : null, (i & JSONzip.end) != 0 ? new bZK(null, null, null, 7, null) : bzk, (i & 512) != 0 ? dqF.c() : map);
    }

    public final boolean k() {
        boolean z;
        return this.g == null || (this.f instanceof InterfaceC8881fA) || ((z = this.h) && (this.i instanceof InterfaceC8881fA)) || ((z && (this.c instanceof C8932fz)) || (z && this.b == null));
    }

    public final boolean i() {
        AbstractC8918fl<InterfaceC8366diy> abstractC8918fl = this.f;
        return (abstractC8918fl instanceof C8927fu) && abstractC8918fl.c() == null;
    }

    public final int g() {
        int i;
        int b;
        InterfaceC5195buF A;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        if (this.i.c() != null) {
            List<InterfaceC5195buF> c = this.i.c();
            if (c != null) {
                Iterator<InterfaceC5195buF> it = c.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    String id = it.next().getId();
                    InterfaceC8366diy c2 = this.f.c();
                    if (C8632dsu.c((Object) id, (Object) ((c2 == null || (A = c2.A()) == null) ? null : A.getId()))) {
                        break;
                    }
                    i++;
                }
            } else {
                i = 0;
            }
            b = C8657dts.b(i, 0);
            return b;
        }
        return 0;
    }
}
