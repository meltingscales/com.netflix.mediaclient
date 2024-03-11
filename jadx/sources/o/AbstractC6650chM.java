package o;

import o.AbstractC6729cim;

/* renamed from: o.chM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6650chM extends AbstractC6729cim implements bLR<AbstractC6729cim.b>, bLY<AbstractC6729cim.b> {
    private int c;
    private Integer f;

    @Override // o.bLR
    public Integer d() {
        return this.f;
    }

    public final void d(Integer num) {
        this.f = num;
    }

    @Override // o.bLR
    public int e() {
        return this.c;
    }

    public final Integer o() {
        return this.f;
    }

    public void r_(int i) {
        this.c = i;
    }

    @Override // o.AbstractC6729cim, o.AbstractC3336ax
    public /* synthetic */ void a(AbstractC6729cim.b bVar, AbstractC3073as abstractC3073as) {
        e(bVar, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.AbstractC6729cim, o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj, AbstractC3073as abstractC3073as) {
        e((AbstractC6729cim.b) obj, (AbstractC3073as<?>) abstractC3073as);
    }

    @Override // o.bLR
    public void c(AbstractC6729cim.b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.g();
    }

    @Override // o.bLR
    /* renamed from: e */
    public void d(AbstractC6729cim.b bVar, boolean z) {
        C8632dsu.c((Object) bVar, "");
        AbstractC6729cim.b.a(bVar, false, 1, null);
    }

    @Override // o.AbstractC6729cim
    public void e(AbstractC6729cim.b bVar, AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) abstractC3073as, "");
        if (C8632dsu.c(this, abstractC3073as)) {
            return;
        }
        super.e(bVar, abstractC3073as);
    }
}
