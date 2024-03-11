package o;

import android.text.TextUtils;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.model.leafs.SearchResults;
import com.netflix.model.leafs.SearchTrackableListSummary;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public class JB extends IT {
    private final InterfaceC1242Ud f;
    private final InterfaceC1242Ud g;
    private final InterfaceC1242Ud h;
    private final InterfaceC1242Ud i;
    private final InterfaceC1242Ud j;

    /* renamed from: o  reason: collision with root package name */
    private final TaskMode f13360o;

    public JB(C0954Iz<?> c0954Iz, String str, TaskMode taskMode, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchNewSearchResults", c0954Iz, interfaceC1757aNc);
        this.f13360o = taskMode;
        String e = aSC.e(str);
        this.g = IE.b("newSearch", e, "titles", "summary");
        this.f = IE.b("newSearch", e, "titleSuggestions", "summary");
        int a = C8153dex.a() - 1;
        this.h = IE.b("newSearch", e, "titles", IE.a(a), "summary");
        String arrayList = new ArrayList();
        if (C8153dex.b()) {
            if (C8153dex.b()) {
                arrayList.add("volatileBitmaskedDetails");
            }
            arrayList.add("summary");
        }
        Object[] objArr = new Object[6];
        objArr[0] = "newSearch";
        objArr[1] = e;
        objArr[2] = "titles";
        objArr[3] = IE.a(a);
        objArr[4] = "item";
        objArr[5] = arrayList.isEmpty() ? "summary" : arrayList;
        this.j = IE.b(objArr);
        this.i = IE.b("newSearch", e, "titleSuggestions", IE.a(19), "summary");
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.g);
        list.add(this.f);
        list.add(this.h);
        list.add(this.j);
        list.add(this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8171dfO.b()) {
            arrayList.add(new C8143den.d("includeBookmark", Boolean.TRUE.toString()));
        }
        arrayList.add(new C8143den.d("supportsCreatorHome", Boolean.TRUE.toString()));
        return arrayList;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        SearchResults.Builder builder = new SearchResults.Builder();
        builder.setVideoListSummary((SearchTrackableListSummary) this.d.b(this.g));
        builder.setSuggestionsListSummary((SearchTrackableListSummary) this.d.b(this.f));
        List<I> c = this.d.c(this.j);
        if (!c.isEmpty()) {
            builder.addVideos(c);
        }
        List<I> c2 = this.d.c(this.h);
        if (!c2.isEmpty()) {
            builder.addVideoEntities(c2);
        }
        List<I> c3 = this.d.c(this.i);
        if (!c3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (I i : c3) {
                if (i instanceof InterfaceC5279bvk) {
                    InterfaceC5279bvk interfaceC5279bvk = (InterfaceC5279bvk) i;
                    if (!TextUtils.isEmpty(interfaceC5279bvk.getEntityId())) {
                        arrayList.add(interfaceC5279bvk);
                    }
                }
            }
            builder.addSuggestions(arrayList);
        }
        interfaceC1757aNc.a(builder.getResults(), InterfaceC1078Nw.aJ, !c1244Uf.b());
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a(new SearchResults.Builder().getResults(), status, false);
    }

    @Override // o.IT
    protected boolean y() {
        return this.f13360o == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.f13360o == TaskMode.FROM_NETWORK;
    }
}
