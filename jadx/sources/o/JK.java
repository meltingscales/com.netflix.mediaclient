package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.NAPASearchPageResultImpl;
import com.netflix.model.leafs.SearchPageEntityImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import o.C8143den;

/* loaded from: classes3.dex */
public final class JK extends AbstractC0985Ke<Pair<? extends InterfaceC5272bvd, ? extends Status>> {
    public static final b e = new b(null);
    private final int a;
    private final TaskMode c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JK(TaskMode taskMode, int i) {
        super("FetchPreQuerySearchV3Task", null, false, 6, null);
        C8632dsu.c((Object) taskMode, "");
        this.c = taskMode;
        this.a = i;
        this.d = C8153dex.i() ? "searchPageV2" : "searchPage";
    }

    private final InterfaceC1242Ud e(int i) {
        if (C8153dex.i()) {
            InterfaceC1242Ud b2 = IE.b(this.d, "preQuery", Integer.valueOf(i), IE.a(49));
            C8632dsu.a(b2, "");
            return b2;
        }
        InterfaceC1242Ud b3 = IE.b(this.d, "preQuery", "empty_session_id", Integer.valueOf(i), IE.a(49));
        C8632dsu.a(b3, "");
        return b3;
    }

    private final InterfaceC1242Ud c(int i) {
        InterfaceC1242Ud c = e(i).c("summary");
        C8632dsu.a(c, "");
        return c;
    }

    private final InterfaceC1242Ud a(int i) {
        InterfaceC1242Ud c = e(i).c("resultItem").c("summary");
        C8632dsu.a(c, "");
        return c;
    }

    @Override // o.InterfaceC0986Kf
    public void d(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(c(this.a));
        list.add(a(this.a));
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
    /* renamed from: a */
    public Pair<InterfaceC5272bvd, Status> e(InterfaceC1240Ub<?> interfaceC1240Ub, C1244Uf c1244Uf) {
        ArrayList arrayList;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) c1244Uf, "");
        NAPASearchPageResultImpl.Builder builder = new NAPASearchPageResultImpl.Builder();
        Collection c = interfaceC1240Ub.c(c(this.a));
        C8632dsu.a(c, "");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof SearchPageEntityImpl) {
                arrayList2.add(obj);
            }
        }
        builder.addVideoEntities(arrayList2);
        Collection c2 = interfaceC1240Ub.c(a(this.a));
        C8632dsu.a(c2, "");
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c2) {
            if (obj2 instanceof C8327diL) {
                arrayList3.add(obj2);
            }
        }
        builder.addGames(arrayList3);
        if (arrayList2.isEmpty()) {
            return new Pair<>(builder.getResults(), InterfaceC1078Nw.ad);
        }
        Collection c3 = interfaceC1240Ub.c(a(this.a));
        if (c3 != null) {
            arrayList = new ArrayList();
            for (Object obj3 : c3) {
                if (obj3 instanceof C8329diN) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            builder.addVideos(arrayList);
        }
        builder.setSectionIndex(this.a);
        return new Pair<>(builder.getResults(), InterfaceC1078Nw.aJ);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("FetchPreQuerySearchV3Task");
        }
    }
}
