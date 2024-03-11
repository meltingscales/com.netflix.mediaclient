package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.LoLoMoSummaryImpl;
import java.util.ArrayList;
import java.util.List;
import o.C8143den;

/* renamed from: o.Jt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0974Jt extends IT {
    private final String f;

    public C0974Jt(C0954Iz<?> c0954Iz, String str, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchGenreLoLoMoSummary", c0954Iz, interfaceC1757aNc);
        this.f = C0956Jb.c(str);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b("topCategories", this.f, "summary"));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        InterfaceC8322diG b = this.d.b(IE.b("topCategories", this.f, "summary"));
        interfaceC1757aNc.e(b instanceof LoLoMoSummaryImpl ? (LoLoMoSummaryImpl) b : null, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.e((InterfaceC5156btT) null, status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8153dex.g()) {
            arrayList.add(new C8143den.d("disableBillboard", Boolean.TRUE.toString()));
        }
        if (C8153dex.o()) {
            arrayList.add(new C8143den.d("enableCpeRow", Boolean.TRUE.toString()));
        }
        return arrayList;
    }
}
