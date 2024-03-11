package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.Video;
import java.util.List;
import o.C8143den;

/* renamed from: o.Kr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0998Kr extends IQ {
    private final InterfaceC1242Ud c;
    private final int d;

    @Override // o.IQ, o.IO
    public boolean a() {
        return true;
    }

    @Override // o.IQ, o.IO
    public boolean k() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998Kr(String str, int i) {
        super("RemoveFromContinueWatching");
        C8632dsu.c((Object) str, "");
        this.d = i;
        InterfaceC1242Ud b = IE.b(SignupConstants.Field.VIDEOS, str, "removeFromCw");
        C8632dsu.a(b, "");
        this.c = b;
    }

    @Override // o.IO
    public void c(List<InterfaceC1242Ud> list) {
        C8632dsu.c((Object) list, "");
        list.add(this.c);
    }

    @Override // o.IU
    public void a(IY iy, InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        Video.RemoveFromCw aM;
        C8632dsu.c((Object) iy, "");
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8329diN c8329diN = (C8329diN) iy.d.a(this.c);
        interfaceC1757aNc.a((c8329diN == null || (aM = c8329diN.aM()) == null) ? false : aM.isSuccess(), InterfaceC1078Nw.aJ);
    }

    @Override // o.IO
    public void b(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        C8632dsu.c((Object) interfaceC1757aNc, "");
        C8632dsu.c((Object) status, "");
        interfaceC1757aNc.a(false, status);
    }

    @Override // o.IQ, o.IO
    public List<C8143den.d> b() {
        List<C8143den.d> f;
        f = C8569dql.f(new C8143den.d("param", String.valueOf(this.d)));
        return f;
    }
}
