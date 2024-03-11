package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.NAPASearchPageResultImpl;
import com.netflix.model.leafs.NAPASearchPageResultsImpl;
import com.netflix.model.leafs.SearchSectionSummaryImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import o.C8143den;

/* renamed from: o.Kt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1000Kt extends AbstractC0985Ke<Pair<? extends InterfaceC5280bvl, ? extends Status>> {
    public static final c b = new c(null);
    private final int a;
    private final InterfaceC1242Ud c;
    private final String d;
    private final InterfaceC1242Ud e;
    private final TaskMode f;
    private final InterfaceC1242Ud g;
    private final int h;
    private InterfaceC1242Ud i;
    private InterfaceC1242Ud j;

    public C1000Kt() {
        this(null, 0, 0, 7, null);
    }

    public /* synthetic */ C1000Kt(TaskMode taskMode, int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? TaskMode.FROM_CACHE_OR_NETWORK : taskMode, (i3 & 2) != 0 ? 3 : i, (i3 & 4) != 0 ? 51 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000Kt(TaskMode taskMode, int i, int i2) {
        super("PreFetchPreQueryV3SectionsTask", null, false, 6, null);
        InterfaceC1242Ud b2;
        C8632dsu.c((Object) taskMode, "");
        this.f = taskMode;
        this.h = i;
        this.a = i2;
        String str = C8153dex.i() ? "searchPageV2" : "searchPage";
        this.d = str;
        if (C8153dex.i()) {
            b2 = IE.b(str, "preQuery");
            C8632dsu.d(b2);
        } else {
            b2 = IE.b(str, "preQuery", "empty_session_id");
            C8632dsu.d(b2);
        }
        this.c = b2;
        int i3 = i - 1;
        InterfaceC1242Ud c2 = b2.c(IE.a(i3)).c("summary");
        C8632dsu.a(c2, "");
        this.g = c2;
        InterfaceC1242Ud c3 = b2.c(IE.a(i3)).c(IE.a(i2 - 1));
        C8632dsu.a(c3, "");
        this.e = c3;
        InterfaceC1242Ud c4 = c3.c("resultItem");
        C8632dsu.a(c4, "");
        this.i = c4;
        InterfaceC1242Ud c5 = c3.c("summary");
        C8632dsu.a(c5, "");
        this.j = c5;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.g);
        InterfaceC1242Ud b2 = C0956Jb.b.b(this.i);
        C8632dsu.a(b2, "");
        list.add(b2);
        InterfaceC1242Ud d = this.i.d(IE.b("summary"));
        C8632dsu.a(d, "");
        this.i = d;
        list.add(d);
        list.add(this.j);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8153dex.w()) {
            arrayList.add(new C8143den.d("supportsGameCarousel", "true"));
        }
        return arrayList;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public Pair<InterfaceC5280bvl, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        NAPASearchPageResultsImpl.Builder builder = new NAPASearchPageResultsImpl.Builder();
        Collection c2 = interfaceC1240Ub.c(this.g);
        C8632dsu.a(c2, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : c2) {
            if (obj instanceof SearchSectionSummaryImpl) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int i = 0;
            if (((SearchSectionSummaryImpl) arrayList.get(0)).getDisplayString() != null && ((SearchSectionSummaryImpl) arrayList.get(0)).getListType() != null) {
                for (Object obj2 : arrayList) {
                    if (i < 0) {
                        C8569dql.h();
                    }
                    SearchSectionSummaryImpl searchSectionSummaryImpl = (SearchSectionSummaryImpl) obj2;
                    if (searchSectionSummaryImpl.getRequestId() != null && searchSectionSummaryImpl.getListType() != null && searchSectionSummaryImpl.getDisplayString() != null) {
                        NAPASearchPageResultImpl.Builder builder2 = new NAPASearchPageResultImpl.Builder();
                        builder2.setSearchSectionSummary(searchSectionSummaryImpl);
                        builder2.setSectionIndex(i);
                        builder.addSearchSection(builder2.getResults());
                    }
                    i++;
                }
                return new Pair<>(builder.getResults(), InterfaceC1078Nw.aJ);
            }
        }
        return new Pair<>(builder.getResults(), InterfaceC1078Nw.ad);
    }

    /* renamed from: o.Kt$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PreFetchPreQueryV3SectionsTask");
        }
    }
}
