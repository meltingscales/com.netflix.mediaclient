package o;

import java.util.List;

/* loaded from: classes5.dex */
final class dFG extends C7802dFx {
    private int b;
    private final int d;
    private final List<String> e;
    private final dEP f;

    @Override // o.C7802dFx, o.AbstractC7781dFc, o.AbstractC7757dEf, o.InterfaceC7717dCt
    public void e(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
    }

    @Override // o.C7802dFx, o.InterfaceC7717dCt
    public int h(InterfaceC7707dCj interfaceC7707dCj) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        int i = this.b;
        if (i < this.d - 1) {
            int i2 = i + 1;
            this.b = i2;
            return i2;
        }
        return -1;
    }

    @Override // o.C7802dFx, o.AbstractC7781dFc
    /* renamed from: q */
    public dEP r() {
        return this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dFG(AbstractC7773dEv abstractC7773dEv, dEP dep) {
        super(abstractC7773dEv, dep, null, null, 12, null);
        List<String> U;
        C8632dsu.c((Object) abstractC7773dEv, "");
        C8632dsu.c((Object) dep, "");
        this.f = dep;
        U = C8576dqs.U(r().keySet());
        this.e = U;
        this.d = U.size() * 2;
        this.b = -1;
    }

    @Override // o.C7802dFx, o.dDG
    public String o(InterfaceC7707dCj interfaceC7707dCj, int i) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        return this.e.get(i / 2);
    }

    @Override // o.C7802dFx, o.AbstractC7781dFc
    protected dEI c(String str) {
        Object e;
        C8632dsu.c((Object) str, "");
        if (this.b % 2 == 0) {
            return dEG.b(str);
        }
        e = dqE.e(r(), str);
        return (dEI) e;
    }
}
