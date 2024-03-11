package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class JT extends IT {
    private final String h;
    private final int i;
    private final int j;

    public JT(C0954Iz<?> c0954Iz, String str, int i, int i2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchGenres", c0954Iz, interfaceC1757aNc);
        this.h = C0956Jb.c(str);
        this.j = i;
        this.i = i2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b("topCategories", this.h, IE.a(this.j, this.i), "summary"));
        list.add(IE.b("topCategories", this.h, IE.a(this.j, this.i), IE.a(aMH.c().a(j(), LoMoType.STANDARD) - 1), "listItem", "summary"));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.h(this.d.c(this.j, c1244Uf.e), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.h(Collections.emptyList(), status);
    }
}
