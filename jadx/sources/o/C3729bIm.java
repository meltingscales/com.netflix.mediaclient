package o;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.bIm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3729bIm implements InterfaceC8962gc {
    private final Integer a;
    private final List<InterfaceC5227bul> b;
    private final AbstractC8918fl<dpR> c;
    private final bZK d;
    private final String e;
    private final AbstractC8918fl<List<InterfaceC5195buF>> f;
    private final String g;
    private final String h;
    private final AbstractC8918fl<InterfaceC8366diy> i;
    private final Map<Integer, Boolean> j;
    private final AbstractC8918fl<InterfaceC5198buI> l;
    private final Long m;
    private final boolean n;

    public C3729bIm() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final bZK a() {
        return this.d;
    }

    public final List<InterfaceC5227bul> b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final C3729bIm c(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, boolean z, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2, Integer num, List<? extends InterfaceC5227bul> list, AbstractC8918fl<dpR> abstractC8918fl3, String str2, String str3, Long l, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl4, bZK bzk, Map<Integer, Boolean> map) {
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) abstractC8918fl3, "");
        C8632dsu.c((Object) abstractC8918fl4, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) map, "");
        return new C3729bIm(str, abstractC8918fl, z, abstractC8918fl2, num, list, abstractC8918fl3, str2, str3, l, abstractC8918fl4, bzk, map);
    }

    public final String component1() {
        return this.h;
    }

    public final Long component10() {
        return this.m;
    }

    public final AbstractC8918fl<InterfaceC5198buI> component11() {
        return this.l;
    }

    public final bZK component12() {
        return this.d;
    }

    public final Map<Integer, Boolean> component13() {
        return this.j;
    }

    public final AbstractC8918fl<InterfaceC8366diy> component2() {
        return this.i;
    }

    public final boolean component3() {
        return this.n;
    }

    public final AbstractC8918fl<List<InterfaceC5195buF>> component4() {
        return this.f;
    }

    public final Integer component5() {
        return this.a;
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

    public final String component9() {
        return this.g;
    }

    public final Integer d() {
        return this.a;
    }

    public final AbstractC8918fl<dpR> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3729bIm) {
            C3729bIm c3729bIm = (C3729bIm) obj;
            return C8632dsu.c((Object) this.h, (Object) c3729bIm.h) && C8632dsu.c(this.i, c3729bIm.i) && this.n == c3729bIm.n && C8632dsu.c(this.f, c3729bIm.f) && C8632dsu.c(this.a, c3729bIm.a) && C8632dsu.c(this.b, c3729bIm.b) && C8632dsu.c(this.c, c3729bIm.c) && C8632dsu.c((Object) this.e, (Object) c3729bIm.e) && C8632dsu.c((Object) this.g, (Object) c3729bIm.g) && C8632dsu.c(this.m, c3729bIm.m) && C8632dsu.c(this.l, c3729bIm.l) && C8632dsu.c(this.d, c3729bIm.d) && C8632dsu.c(this.j, c3729bIm.j);
        }
        return false;
    }

    public final AbstractC8918fl<List<InterfaceC5195buF>> f() {
        return this.f;
    }

    public final AbstractC8918fl<InterfaceC8366diy> g() {
        return this.i;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.h;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.i.hashCode();
        int hashCode3 = Boolean.hashCode(this.n);
        int hashCode4 = this.f.hashCode();
        Integer num = this.a;
        int hashCode5 = num == null ? 0 : num.hashCode();
        List<InterfaceC5227bul> list = this.b;
        int hashCode6 = list == null ? 0 : list.hashCode();
        int hashCode7 = this.c.hashCode();
        String str2 = this.e;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.g;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        Long l = this.m;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.l.hashCode()) * 31) + this.d.hashCode()) * 31) + this.j.hashCode();
    }

    public final Map<Integer, Boolean> i() {
        return this.j;
    }

    public final AbstractC8918fl<InterfaceC5198buI> l() {
        return this.l;
    }

    public final String n() {
        return this.g;
    }

    public final boolean o() {
        return this.n;
    }

    public String toString() {
        String str = this.h;
        AbstractC8918fl<InterfaceC8366diy> abstractC8918fl = this.i;
        boolean z = this.n;
        AbstractC8918fl<List<InterfaceC5195buF>> abstractC8918fl2 = this.f;
        Integer num = this.a;
        List<InterfaceC5227bul> list = this.b;
        AbstractC8918fl<dpR> abstractC8918fl3 = this.c;
        String str2 = this.e;
        String str3 = this.g;
        Long l = this.m;
        AbstractC8918fl<InterfaceC5198buI> abstractC8918fl4 = this.l;
        bZK bzk = this.d;
        Map<Integer, Boolean> map = this.j;
        return "ShowState(showId=" + str + ", showDetails=" + abstractC8918fl + ", willFetchSeasonsAndEpisodes=" + z + ", seasons=" + abstractC8918fl2 + ", currentSeasonIndex=" + num + ", episodes=" + list + ", episodesRequest=" + abstractC8918fl3 + ", currentEpisodeId=" + str2 + ", trailerId=" + str3 + ", trailerVideoBookmarkMs=" + l + ", trailerInfo=" + abstractC8918fl4 + ", liveVideosState=" + bzk + ", remindMeLocalState=" + map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3729bIm(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl, boolean z, AbstractC8918fl<? extends List<? extends InterfaceC5195buF>> abstractC8918fl2, Integer num, List<? extends InterfaceC5227bul> list, AbstractC8918fl<dpR> abstractC8918fl3, String str2, String str3, Long l, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl4, bZK bzk, Map<Integer, Boolean> map) {
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) abstractC8918fl2, "");
        C8632dsu.c((Object) abstractC8918fl3, "");
        C8632dsu.c((Object) abstractC8918fl4, "");
        C8632dsu.c((Object) bzk, "");
        C8632dsu.c((Object) map, "");
        this.h = str;
        this.i = abstractC8918fl;
        this.n = z;
        this.f = abstractC8918fl2;
        this.a = num;
        this.b = list;
        this.c = abstractC8918fl3;
        this.e = str2;
        this.g = str3;
        this.m = l;
        this.l = abstractC8918fl4;
        this.d = bzk;
        this.j = map;
    }

    public /* synthetic */ C3729bIm(String str, AbstractC8918fl abstractC8918fl, boolean z, AbstractC8918fl abstractC8918fl2, Integer num, List list, AbstractC8918fl abstractC8918fl3, String str2, String str3, Long l, AbstractC8918fl abstractC8918fl4, bZK bzk, Map map, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C8974go.e : abstractC8918fl2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list, (i & 64) != 0 ? C8974go.e : abstractC8918fl3, (i & 128) != 0 ? null : str2, (i & JSONzip.end) != 0 ? null : str3, (i & 512) == 0 ? l : null, (i & 1024) != 0 ? C8974go.e : abstractC8918fl4, (i & 2048) != 0 ? new bZK(null, null, null, 7, null) : bzk, (i & 4096) != 0 ? dqF.c() : map);
    }

    public final boolean k() {
        boolean z;
        return this.h == null || (this.i instanceof InterfaceC8881fA) || (this.g != null && (this.l instanceof InterfaceC8881fA)) || (((z = this.n) && (this.f instanceof InterfaceC8881fA)) || ((z && (this.c instanceof C8932fz)) || (z && this.b == null)));
    }

    public final boolean m() {
        AbstractC8918fl<InterfaceC8366diy> abstractC8918fl = this.i;
        return (abstractC8918fl instanceof C8927fu) && abstractC8918fl.c() == null;
    }

    public final boolean e(int i) {
        InterfaceC8366diy c = this.i.c();
        if (this.j.containsKey(Integer.valueOf(i))) {
            Boolean bool = this.j.get(Integer.valueOf(i));
            if (bool != null) {
                return bool.booleanValue();
            }
        } else {
            Object obj = null;
            if (C8632dsu.c((Object) String.valueOf(i), (Object) (c != null ? c.getId() : null))) {
                return c.aq();
            }
            if (c != null) {
                Map<Integer, Boolean> map = this.j;
                String id = c.getId();
                C8632dsu.a(id, "");
                if (C8632dsu.c(map.get(Integer.valueOf(Integer.parseInt(id))), Boolean.TRUE) || c.aq()) {
                    return true;
                }
            }
            List<InterfaceC5227bul> list = this.b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String id2 = ((InterfaceC5227bul) next).getId();
                    C8632dsu.a(id2, "");
                    if (Integer.parseInt(id2) == i) {
                        obj = next;
                        break;
                    }
                }
                InterfaceC5227bul interfaceC5227bul = (InterfaceC5227bul) obj;
                if (interfaceC5227bul != null) {
                    return interfaceC5227bul.aq();
                }
            }
        }
        return false;
    }

    public final int j() {
        int i;
        int b;
        InterfaceC5195buF A;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        if (this.f.c() != null) {
            List<InterfaceC5195buF> c = this.f.c();
            if (c != null) {
                Iterator<InterfaceC5195buF> it = c.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    String id = it.next().getId();
                    InterfaceC8366diy c2 = this.i.c();
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
