package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.model.leafs.ListOfMoviesSummaryImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C8143den;

/* renamed from: o.Jh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0962Jh extends AbstractC0985Ke<Boolean> {
    private final String b;
    private final LoMo e;

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962Jh(String str, LoMo loMo) {
        super("FetchBulkRaterPayoffTask", TaskMode.FROM_NETWORK, false, 4, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) loMo, "");
        this.b = str;
        this.e = loMo;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        InterfaceC1242Ud b = IE.b("lolomos", this.b, "refreshList");
        C8632dsu.a(b, "");
        list.add(b);
    }

    @Override // o.AbstractC0985Ke, o.InterfaceC0986Kf
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        dsE dse = dsE.b;
        String format = String.format("\"%s\"", Arrays.copyOf(new Object[]{this.e.getId()}, 1));
        C8632dsu.a(format, "");
        String format2 = String.format("\"%s\"", Arrays.copyOf(new Object[]{this.e.getListContext()}, 1));
        C8632dsu.a(format2, "");
        arrayList.add(new C8143den.d("param", format));
        arrayList.add(new C8143den.d("param", String.valueOf(this.e.getListPos())));
        arrayList.add(new C8143den.d("param", format2));
        arrayList.add(new C8143den.d("pathSuffix", IE.b(IE.a(5), "listItem", "summary").toString()));
        arrayList.add(new C8143den.d("pathSuffix", "[\"summary\"]"));
        if (C8171dfO.b()) {
            arrayList.add(new C8143den.d("includeBookmark", "true"));
        }
        arrayList.add(new C8143den.d("generatePayoff", "true"));
        return arrayList;
    }

    @Override // o.AbstractC0985Ke
    /* renamed from: b */
    public Boolean e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        String annotation;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8322diG b = interfaceC1240Ub.b(IE.b("lolomos", this.b, this.e.getListContext(), "summary"));
        ListOfMoviesSummaryImpl listOfMoviesSummaryImpl = b instanceof ListOfMoviesSummaryImpl ? (ListOfMoviesSummaryImpl) b : null;
        return Boolean.valueOf((listOfMoviesSummaryImpl == null || (annotation = listOfMoviesSummaryImpl.getAnnotation("is_payoff")) == null) ? false : Boolean.parseBoolean(annotation));
    }
}
