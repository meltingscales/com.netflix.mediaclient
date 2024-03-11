package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;

@Deprecated
/* renamed from: o.Jm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0967Jm extends IT {
    private final String g;
    private final InterfaceC1242Ud i;

    public C0967Jm(C0954Iz<?> c0954Iz, String str, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchFalkorVideo", c0954Iz, interfaceC1757aNc);
        this.g = str;
        this.i = IE.b(SignupConstants.Field.VIDEOS, str, IE.c("summary", "detail", "synopsisDP"));
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.i);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8329diN c8329diN = (C8329diN) this.d.a(this.i);
        if (aSC.e(c8329diN)) {
            interfaceC1757aNc.d(c8329diN, InterfaceC1078Nw.aJ);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FetchFalkorVideoTask got weird movie id: ");
        sb.append(c8329diN == null ? "null" : c8329diN.getId());
        sb.append(" requested videoId ");
        sb.append(this.g);
        String sb2 = sb.toString();
        InterfaceC1593aHa.b(sb2);
        InterfaceC1598aHf.a(new C1596aHd("SPY-7519: FetchFalkorVideoTask").b(false));
        C1044Mm.d("FetchFalkorVideoTask", sb2);
        interfaceC1757aNc.d((InterfaceC8366diy) null, InterfaceC1078Nw.ai);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.d((InterfaceC8366diy) null, status);
    }
}
