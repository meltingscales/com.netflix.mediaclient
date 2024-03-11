package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* loaded from: classes3.dex */
public class JY extends IQ {
    private final String c;
    private final boolean e;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    public JY(String str, boolean z) {
        super("FetchVideoVolatileNodes");
        this.c = str;
        this.e = z;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C0956Jb.d(list, this.c, this.e);
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8329diN c8329diN = (C8329diN) iy.d.a(IE.b(SignupConstants.Field.VIDEOS, this.c));
        if (c8329diN == null || C8168dfL.g(c8329diN.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-12098: FetchVideoVolatileNodesTask bad video id. Requested: ");
            sb.append(this.c);
            sb.append(", got: ");
            sb.append(c8329diN == null ? "rtn=null" : c8329diN.getId());
            String sb2 = sb.toString();
            InterfaceC1598aHf.a(sb2);
            C1044Mm.d("FetchVideoVolatileNodesTask", sb2);
            interfaceC1757aNc.a((InterfaceC5238buw) null, InterfaceC1078Nw.ai);
            return;
        }
        iy.d(this.c, c8329diN.aC());
        if (this.e) {
            interfaceC1757aNc.a((InterfaceC5238buw) c8329diN, InterfaceC1078Nw.aJ);
        } else {
            interfaceC1757aNc.c(c8329diN, InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        if (this.e) {
            interfaceC1757aNc.a((InterfaceC5238buw) null, status);
        } else {
            interfaceC1757aNc.c((InterfaceC5194buE) null, status);
        }
    }
}
