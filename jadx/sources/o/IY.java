package o;

import com.netflix.android.volley.Request;
import com.netflix.mediaclient.android.app.Status;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public final class IY extends IV {
    private final IU i;

    public IY(C0954Iz<?> c0954Iz, IG ig, IU iu, InterfaceC1757aNc interfaceC1757aNc) {
        super(iu.d(), c0954Iz, ig, interfaceC1757aNc);
        this.b = iu.i();
        this.i = iu;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        this.i.c(list);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        this.i.a(this, interfaceC1757aNc, c1244Uf);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        this.i.b(interfaceC1757aNc, status);
    }

    @Override // o.IT
    protected List<C8143den.d> c() {
        return this.i.b();
    }

    @Override // o.IT
    protected List<C8143den.d> l() {
        return this.i.c();
    }

    @Override // o.IT
    protected boolean e(List<InterfaceC1242Ud> list) {
        return this.i.a(list);
    }

    @Override // o.IT
    protected boolean a() {
        return this.i.k();
    }

    @Override // o.IT
    public int n() {
        return this.i.j();
    }

    @Override // o.IT
    protected boolean v() {
        return this.i.g();
    }

    @Override // o.IT
    protected boolean y() {
        return this.i.m();
    }

    @Override // o.IT
    protected boolean u() {
        return this.i.a();
    }

    @Override // o.IT
    protected boolean x() {
        return this.i.e();
    }

    @Override // o.IT
    protected void e(HZ hz) {
        this.i.e(hz);
    }

    @Override // o.IT
    protected String o() {
        return this.i.h();
    }

    @Override // o.IT
    protected Request.Priority b() {
        return this.i.f();
    }
}
