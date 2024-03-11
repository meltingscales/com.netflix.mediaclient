package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.List;

/* renamed from: o.Jc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0957Jc extends IT {
    private InterfaceC1242Ud j;

    public C0957Jc(C0954Iz<?> c0954Iz, String str, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchAdvisories", c0954Iz, interfaceC1757aNc);
        this.j = IE.b(SignupConstants.Field.VIDEOS, str, "advisories");
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.j);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8329diN c8329diN = (C8329diN) this.d.a(this.j);
        if (c8329diN == null || C8168dfL.g(c8329diN.getId())) {
            interfaceC1757aNc.e((List<Advisory>) null, InterfaceC1078Nw.ag);
        } else {
            interfaceC1757aNc.e(c8329diN.e(), InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.e((List<Advisory>) null, status);
    }
}
