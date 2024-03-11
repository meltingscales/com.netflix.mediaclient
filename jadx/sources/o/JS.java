package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import com.netflix.model.leafs.SearchSectionSummary;
import com.netflix.model.leafs.UpNextFeedListItem;
import com.netflix.model.leafs.UpNextFeedSection;
import com.netflix.model.leafs.UpNextFeedSectionImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C1870aRh;
import o.C8143den;

/* loaded from: classes3.dex */
public class JS extends AbstractC0985Ke<C5220bue> {
    private final InterfaceC1242Ud a;
    private final String b;
    private final InterfaceC1242Ud c;
    private final Map<Integer, C8654dtp> d;
    private final boolean e;
    private final TaskMode j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JS(String str, Map<Integer, C8654dtp> map, TaskMode taskMode, boolean z) {
        super("FetchUpNextFeedCmpTask", taskMode, false, 4, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) taskMode, "");
        this.b = str;
        this.d = map;
        this.j = taskMode;
        this.e = z;
        InterfaceC1242Ud b = IE.b("upNextFeed", str);
        C8632dsu.a(b, "");
        this.c = b;
        InterfaceC1242Ud c = b.c("summary");
        C8632dsu.a(c, "");
        this.a = c;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.a);
        if (this.e) {
            InterfaceC1242Ud c = this.c.c(IE.c("firstTop10Section", "secondTop10Section"));
            C8632dsu.a(c, "");
            InterfaceC1242Ud c2 = c.c("summary");
            C8632dsu.a(c2, "");
            list.add(c2);
            InterfaceC1242Ud c3 = c.c(IE.a(0, 9));
            C8632dsu.a(c3, "");
            JV.c(c3, list);
            return;
        }
        for (Map.Entry<Integer, C8654dtp> entry : this.d.entrySet()) {
            int intValue = entry.getKey().intValue();
            C8654dtp value = entry.getValue();
            InterfaceC1242Ud c4 = this.c.c(Integer.valueOf(intValue));
            C8632dsu.a(c4, "");
            InterfaceC1242Ud c5 = c4.c("summary");
            C8632dsu.a(c5, "");
            list.add(c5);
            InterfaceC1242Ud c6 = c4.c(IE.a(value.d(), value.e()));
            C8632dsu.a(c6, "");
            JV.c(c6, list);
        }
    }

    @Override // o.AbstractC0985Ke
    public boolean c(InterfaceC1240Ub<?> interfaceC1240Ub) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        return interfaceC1240Ub.b(this.a) != null;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: d */
    public C5220bue e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(this.a);
        C8632dsu.d(b);
        return new C5220bue((SearchSectionSummary) b, a(interfaceC1240Ub), false, 4, null);
    }

    protected List<UpNextFeedSection> a(InterfaceC1240Ub<?> interfaceC1240Ub) {
        List C;
        UpNextFeedListItem upNextFeedListItem;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, C8654dtp> entry : this.d.entrySet()) {
            int intValue = entry.getKey().intValue();
            C8654dtp value = entry.getValue();
            InterfaceC1242Ud c = this.c.c(Integer.valueOf(intValue));
            C8632dsu.a(c, "");
            InterfaceC8322diG b = interfaceC1240Ub.b(c.c("summary"));
            if (!(b instanceof IJ) && b != null) {
                ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = b instanceof ListOfMoviesSummaryImpl ? (ListOfMoviesSummaryImpl) b : null;
                if (listOfMoviesSummaryImpl != null) {
                    int length = listOfMoviesSummaryImpl.getLength();
                    UpNextFeedListItem[] upNextFeedListItemArr = new UpNextFeedListItem[length];
                    for (int i = 0; i < length; i++) {
                        int d = value.d();
                        if (i <= value.e() && d <= i) {
                            InterfaceC8322diG b2 = interfaceC1240Ub.b(c.c(Integer.valueOf(i)));
                            if (b2 instanceof UpNextFeedListItem) {
                                upNextFeedListItem = (UpNextFeedListItem) b2;
                                upNextFeedListItemArr[i] = upNextFeedListItem;
                            }
                        }
                        upNextFeedListItem = null;
                        upNextFeedListItemArr[i] = upNextFeedListItem;
                    }
                    C = C8563dqf.C(upNextFeedListItemArr);
                    arrayList.add(new UpNextFeedSectionImpl(listOfMoviesSummaryImpl, C));
                }
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        List<C8143den.d> j;
        String d;
        List<C8143den.d> e;
        ArrayList arrayList = new ArrayList();
        if (aQT.c.c().g()) {
            arrayList.add("POPULAR_TV");
            arrayList.add("POPULAR_MOVIES");
            d = C8576dqs.d(arrayList, ",", null, null, 0, null, null, 62, null);
            e = C8566dqi.e(new C8143den.d("upNextSupportedTypes", d));
            return e;
        }
        C1870aRh.b bVar = C1870aRh.a;
        if (bVar.a().f()) {
            j = C8569dql.j(new C8143den.d("unbrandedTrailersArt", true), new C8143den.d("hiResTrailersArt", bVar.a().c()));
            return j;
        }
        return null;
    }
}
