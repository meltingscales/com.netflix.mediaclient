package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;

/* renamed from: o.Ka  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0981Ka extends IQ {
    private final boolean c;
    private final String d;
    private final InterfaceC1242Ud e;

    @Override // o.IQ, o.IO
    public boolean a() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0981Ka(String str, boolean z) {
        super("FetchVideoSummaryTask");
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = z;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "summary");
        C8632dsu.a(b, "");
        this.e = b;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.e);
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) c1244Uf, "");
        InterfaceC8319diD a = iy.d.a(this.e);
        C8329diN c8329diN = a instanceof C8329diN ? (C8329diN) a : null;
        if (c8329diN == null || C8168dfL.g(c8329diN.getId())) {
            interfaceC1757aNc.d((InterfaceC5188btz) null, InterfaceC1078Nw.ai);
        } else {
            interfaceC1757aNc.d(c8329diN.aO(), InterfaceC1078Nw.aJ);
        }
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.d((InterfaceC5188btz) null, status);
    }
}
