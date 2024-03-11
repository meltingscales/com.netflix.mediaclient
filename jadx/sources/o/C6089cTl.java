package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.model.leafs.SearchPageEntity;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC6094cTq;

/* renamed from: o.cTl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6089cTl implements InterfaceC8962gc {
    private final bZK a;
    private final boolean b;
    private final Integer c;
    private final long d;
    private final String e;
    private final Map<String, List<InterfaceC5278bvj>> f;
    private final Map<String, List<InterfaceC5185btw>> g;
    private final Map<String, List<SearchPageEntity>> h;
    private final List<SearchSectionSummary> i;
    private final AbstractC6094cTq j;
    private final Map<String, SearchPageEntity> m;

    public final String a() {
        return this.e;
    }

    public final C6089cTl a(List<SearchSectionSummary> list, boolean z, Map<String, SearchPageEntity> map, Map<String, List<InterfaceC5278bvj>> map2, Map<String, List<InterfaceC5185btw>> map3, Map<String, List<SearchPageEntity>> map4, Integer num, String str, AbstractC6094cTq abstractC6094cTq, bZK bzk, long j) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        C8632dsu.c((Object) map4, "");
        C8632dsu.c((Object) abstractC6094cTq, "");
        C8632dsu.c((Object) bzk, "");
        return new C6089cTl(list, z, map, map2, map3, map4, num, str, abstractC6094cTq, bzk, j);
    }

    public final long b() {
        return this.d;
    }

    public final bZK c() {
        return this.a;
    }

    public final List<SearchSectionSummary> component1() {
        return this.i;
    }

    public final bZK component10() {
        return this.a;
    }

    public final long component11() {
        return this.d;
    }

    public final boolean component2() {
        return this.b;
    }

    public final Map<String, SearchPageEntity> component3() {
        return this.m;
    }

    public final Map<String, List<InterfaceC5278bvj>> component4() {
        return this.f;
    }

    public final Map<String, List<InterfaceC5185btw>> component5() {
        return this.g;
    }

    public final Map<String, List<SearchPageEntity>> component6() {
        return this.h;
    }

    public final Integer component7() {
        return this.c;
    }

    public final String component8() {
        return this.e;
    }

    public final AbstractC6094cTq component9() {
        return this.j;
    }

    public final boolean d() {
        return this.b;
    }

    public final Integer e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6089cTl) {
            C6089cTl c6089cTl = (C6089cTl) obj;
            return C8632dsu.c(this.i, c6089cTl.i) && this.b == c6089cTl.b && C8632dsu.c(this.m, c6089cTl.m) && C8632dsu.c(this.f, c6089cTl.f) && C8632dsu.c(this.g, c6089cTl.g) && C8632dsu.c(this.h, c6089cTl.h) && C8632dsu.c(this.c, c6089cTl.c) && C8632dsu.c((Object) this.e, (Object) c6089cTl.e) && C8632dsu.c(this.j, c6089cTl.j) && C8632dsu.c(this.a, c6089cTl.a) && this.d == c6089cTl.d;
        }
        return false;
    }

    public final AbstractC6094cTq f() {
        return this.j;
    }

    public final Map<String, List<SearchPageEntity>> g() {
        return this.h;
    }

    public final List<SearchSectionSummary> h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = this.i.hashCode();
        int hashCode2 = Boolean.hashCode(this.b);
        int hashCode3 = this.m.hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.g.hashCode();
        int hashCode6 = this.h.hashCode();
        Integer num = this.c;
        int hashCode7 = num == null ? 0 : num.hashCode();
        String str = this.e;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.j.hashCode()) * 31) + this.a.hashCode()) * 31) + Long.hashCode(this.d);
    }

    public final Map<String, List<InterfaceC5278bvj>> i() {
        return this.f;
    }

    public final Map<String, List<InterfaceC5185btw>> j() {
        return this.g;
    }

    public final Map<String, SearchPageEntity> o() {
        return this.m;
    }

    public String toString() {
        List<SearchSectionSummary> list = this.i;
        boolean z = this.b;
        Map<String, SearchPageEntity> map = this.m;
        Map<String, List<InterfaceC5278bvj>> map2 = this.f;
        Map<String, List<InterfaceC5185btw>> map3 = this.g;
        Map<String, List<SearchPageEntity>> map4 = this.h;
        Integer num = this.c;
        String str = this.e;
        AbstractC6094cTq abstractC6094cTq = this.j;
        bZK bzk = this.a;
        long j = this.d;
        return "SearchResultData(sections=" + list + ", loadMore=" + z + ", videoToPageEntityMap=" + map + ", sectionToVideosMap=" + map2 + ", sectionToGamesMap=" + map3 + ", sectionToVideoInfoList=" + map4 + ", loadMoreForSection=" + num + ", query=" + str + ", uxLoadingState=" + abstractC6094cTq + ", liveVideosState=" + bzk + ", requestId=" + j + ")";
    }

    public C6089cTl(List<SearchSectionSummary> list, boolean z, Map<String, SearchPageEntity> map, Map<String, List<InterfaceC5278bvj>> map2, Map<String, List<InterfaceC5185btw>> map3, Map<String, List<SearchPageEntity>> map4, Integer num, String str, AbstractC6094cTq abstractC6094cTq, bZK bzk, long j) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) map3, "");
        C8632dsu.c((Object) map4, "");
        C8632dsu.c((Object) abstractC6094cTq, "");
        C8632dsu.c((Object) bzk, "");
        this.i = list;
        this.b = z;
        this.m = map;
        this.f = map2;
        this.g = map3;
        this.h = map4;
        this.c = num;
        this.e = str;
        this.j = abstractC6094cTq;
        this.a = bzk;
        this.d = j;
    }

    public /* synthetic */ C6089cTl(List list, boolean z, Map map, Map map2, Map map3, Map map4, Integer num, String str, AbstractC6094cTq abstractC6094cTq, bZK bzk, long j, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new LinkedHashMap() : map, (i & 8) != 0 ? new LinkedHashMap() : map2, (i & 16) != 0 ? new LinkedHashMap() : map3, (i & 32) != 0 ? new LinkedHashMap() : map4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str, (i & JSONzip.end) != 0 ? AbstractC6094cTq.a.e : abstractC6094cTq, (i & 512) != 0 ? new bZK(null, null, null, 7, null) : bzk, j);
    }
}
