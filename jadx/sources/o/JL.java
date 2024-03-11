package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.model.leafs.NAPASearchPageResultImpl;
import com.netflix.model.leafs.NAPASearchPageResultsImpl;
import com.netflix.model.leafs.SearchPageEntityImpl;
import com.netflix.model.leafs.SearchSectionSummaryImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import o.C8143den;

/* loaded from: classes3.dex */
public final class JL extends AbstractC0985Ke<Pair<? extends InterfaceC5280bvl, ? extends Status>> {
    public static final d c = new d(null);
    private final int a;
    private String b;
    private String d;
    private final int e;
    private String f;
    private final long g;
    private String h;
    private InterfaceC1242Ud i;
    private boolean j;
    private InterfaceC1242Ud k;
    private final int l;
    private String m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private InterfaceC1242Ud f13361o;

    public JL(long j, int i, int i2, int i3, int i4) {
        super("FetchSearchPageTask", null, false, 6, null);
        this.g = j;
        this.a = i;
        this.l = i2;
        this.e = i3;
        this.n = i4;
        this.h = "preQueryType";
        this.m = "empty_session_id";
        this.k = l();
        this.f13361o = m();
        InterfaceC1242Ud c2 = this.k.c("summary");
        C8632dsu.a(c2, "");
        this.i = c2;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("FetchSearchPageTask");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JL(String str, long j, int i, int i2, int i3, int i4, String str2, boolean z) {
        this(j, i, i2, i3, i4);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.h = "searchType";
        this.f = aSC.e(str);
        if (str2.length() > 0) {
            this.m = str2;
        }
        this.k = l();
        this.f13361o = m();
        InterfaceC1242Ud c2 = this.k.c("summary");
        C8632dsu.a(c2, "");
        this.i = c2;
        this.j = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JL(String str, String str2, long j, int i, int i2, int i3, int i4, String str3) {
        this(j, i, i2, i3, i4);
        C8632dsu.c((Object) str3, "");
        this.h = "searchByEntity";
        this.d = str;
        this.b = str2;
        if (str3.length() > 0) {
            this.m = str3;
        }
        this.k = l();
        this.f13361o = m();
        InterfaceC1242Ud c2 = this.k.c("summary");
        C8632dsu.a(c2, "");
        this.i = c2;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: c */
    public Pair<NAPASearchPageResultsImpl, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        NAPASearchPageResultsImpl.Builder builder = new NAPASearchPageResultsImpl.Builder();
        Collection c2 = interfaceC1240Ub.c(this.f13361o);
        C8632dsu.a(c2, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : c2) {
            if (obj instanceof SearchSectionSummaryImpl) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            NAPASearchPageResultImpl.Builder builder2 = new NAPASearchPageResultImpl.Builder();
            SearchSectionSummaryImpl searchSectionSummaryImpl = (SearchSectionSummaryImpl) arrayList.get(i);
            Collection c3 = interfaceC1240Ub.c(c(this.a + i));
            C8632dsu.a(c3, "");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c3) {
                if (obj2 instanceof SearchPageEntityImpl) {
                    arrayList2.add(obj2);
                }
            }
            builder2.addVideoEntities(arrayList2);
            Collection c4 = interfaceC1240Ub.c(b(this.a + i));
            C8632dsu.a(c4, "");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : c4) {
                if (obj3 instanceof C8329diN) {
                    arrayList3.add(obj3);
                }
            }
            builder2.addVideos(arrayList3);
            Collection c5 = interfaceC1240Ub.c(b(this.a + i));
            C8632dsu.a(c5, "");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : c5) {
                if (obj4 instanceof C8327diL) {
                    arrayList4.add(obj4);
                }
            }
            builder2.addGames(arrayList4);
            builder2.setSectionIndex(this.a + i);
            builder2.setSearchSectionSummary(searchSectionSummaryImpl);
            builder.addSearchSection(builder2.getResults());
            builder.setRequestId(this.g);
        }
        return new Pair<>(builder.getResults(), InterfaceC1078Nw.aJ);
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.f13361o);
        InterfaceC1242Ud d2 = this.k.c("resultItem").d(IE.b("summary"));
        C8632dsu.a(d2, "");
        list.add(d2);
        list.add(this.i);
    }

    private final InterfaceC1242Ud o() {
        String str = this.h;
        if (C8632dsu.c((Object) str, (Object) "searchType")) {
            InterfaceC1242Ud b = IE.b("searchPage", "search", this.f, this.m);
            C8632dsu.a(b, "");
            return b;
        } else if (C8632dsu.c((Object) str, (Object) "searchByEntity")) {
            InterfaceC1242Ud b2 = IE.b("searchPage", "searchForEntity", this.d, this.b, this.m);
            C8632dsu.a(b2, "");
            return b2;
        } else {
            InterfaceC1242Ud b3 = IE.b("searchPage", "preQuery", this.m);
            C8632dsu.a(b3, "");
            return b3;
        }
    }

    private final InterfaceC1242Ud m() {
        InterfaceC1242Ud c2 = o().c(IE.a(this.a, this.l)).c("summary");
        C8632dsu.a(c2, "");
        return c2;
    }

    private final InterfaceC1242Ud l() {
        InterfaceC1242Ud c2 = o().c(IE.a(this.a, this.l)).c(IE.a(this.e, this.n));
        C8632dsu.a(c2, "");
        return c2;
    }

    private final InterfaceC1242Ud e(int i) {
        InterfaceC1242Ud c2 = o().c(Integer.valueOf(i)).c(IE.a(this.e, this.n));
        C8632dsu.a(c2, "");
        return c2;
    }

    private final InterfaceC1242Ud c(int i) {
        InterfaceC1242Ud c2 = e(i).c("summary");
        C8632dsu.a(c2, "");
        return c2;
    }

    private final InterfaceC1242Ud b(int i) {
        InterfaceC1242Ud c2 = e(i).c("resultItem").c("summary");
        C8632dsu.a(c2, "");
        return c2;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8143den.d("supportsCreatorHome", "true"));
        if (C8153dex.y()) {
            arrayList.add(new C8143den.d("supportsGameCarousel", "true"));
        }
        if (ConfigFastPropertyFeatureControlConfig.Companion.C()) {
            arrayList.add(new C8143den.d("enableSearchLolomoOnTablet", "true"));
        }
        if (this.j) {
            arrayList.add(new C8143den.d("onlySearchLexicalMatches", "true"));
        }
        return arrayList;
    }
}
