package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* renamed from: o.Jn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0968Jn extends IT {
    private final InterfaceC1242Ud g;
    private final TaskMode j;

    public C0968Jn(C0954Iz<?> c0954Iz, String str, TaskMode taskMode, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchFilteredGenreList", c0954Iz, interfaceC1757aNc);
        this.g = IE.b("filteredCategoriesList", str);
        this.j = taskMode;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.g);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        IH ih = (IH) this.d.b(this.g);
        if (ih == null) {
            C1044Mm.e("FetchFilteredGenreListTask", "Null response for %s", this.g);
            interfaceC1757aNc.j(null, InterfaceC1078Nw.ai);
            return;
        }
        interfaceC1757aNc.j(new ArrayList((List) ih.a()), InterfaceC1078Nw.aJ);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList(2);
        if (C8153dex.o()) {
            arrayList.add(new C8143den.d("enableCpeRow", Boolean.TRUE.toString()));
        }
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        if (l == null || !l.s()) {
            arrayList.add(new C8143den.d("enableLolomoDownloadableRow", Boolean.FALSE.toString()));
        }
        return arrayList;
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.j(Collections.emptyList(), status);
    }

    @Override // o.IT
    protected boolean y() {
        return this.j == TaskMode.FROM_CACHE_ONLY;
    }

    @Override // o.IT
    protected boolean u() {
        return this.j == TaskMode.FROM_NETWORK;
    }
}
