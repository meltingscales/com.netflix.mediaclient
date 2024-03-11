package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NotImplementedError;

@Singleton
/* renamed from: o.aDm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1497aDm implements aCJ {
    private final InterfaceC9101jI a;
    private final InterfaceC1471aCn b;
    private final InterfaceC1475aCr d;
    private final Void e;

    @Override // o.aCJ
    public boolean b() {
        return false;
    }

    @Override // o.aCJ
    public boolean d() {
        return false;
    }

    public Void h() {
        return this.e;
    }

    @Override // o.aCJ
    public InterfaceC9101jI j() {
        return this.a;
    }

    @Inject
    public C1497aDm(InterfaceC1477aCt interfaceC1477aCt, InterfaceC1475aCr interfaceC1475aCr, InterfaceC1471aCn interfaceC1471aCn) {
        C8632dsu.c((Object) interfaceC1477aCt, "");
        C8632dsu.c((Object) interfaceC1475aCr, "");
        C8632dsu.c((Object) interfaceC1471aCn, "");
        this.d = interfaceC1475aCr;
        this.b = interfaceC1471aCn;
        this.a = interfaceC1477aCt.a(null, b());
    }

    @Override // o.aCJ
    public /* synthetic */ AbstractC9054iO a() {
        return (AbstractC9054iO) f();
    }

    @Override // o.aCJ
    public /* synthetic */ dwQ e() {
        return (dwQ) h();
    }

    @Override // o.aCJ
    public String c() {
        return this.d.c();
    }

    @Override // o.aCJ
    public InterfaceC9095jC c(InterfaceC1473aCp interfaceC1473aCp) {
        C8632dsu.c((Object) interfaceC1473aCp, "");
        return C1493aDi.c.d(this, this.b, interfaceC1473aCp);
    }

    public Void f() {
        throw new NotImplementedError("An operation is not implemented: LoggedOutApolloClientConfig should not use cache");
    }
}
