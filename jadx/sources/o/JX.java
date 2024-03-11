package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class JX extends IT {
    private final String g;
    private final InterfaceC1242Ud i;

    public JX(C0954Iz<?> c0954Iz, String str, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchVideoSummary", c0954Iz, interfaceC1757aNc);
        this.i = IE.b(SignupConstants.Field.VIDEOS, str, "summary");
        this.g = str;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.i);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8329diN c8329diN = (C8329diN) this.d.a(this.i);
        if (c8329diN == null || C8168dfL.g(c8329diN.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-7519: FetchVideoSummaryTask got weird movie id: ");
            sb.append(c8329diN == null ? "null" : c8329diN.getId());
            sb.append(" requested videoId ");
            sb.append(this.g);
            String sb2 = sb.toString();
            InterfaceC1598aHf.a(new C1596aHd(sb2).b(false));
            C1044Mm.d("FetchVideoSummaryTask", sb2);
            interfaceC1757aNc.d((InterfaceC5188btz) null, InterfaceC1078Nw.ai);
            return;
        }
        interfaceC1757aNc.d(c8329diN.aO(), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.d((InterfaceC5188btz) null, status);
    }
}
