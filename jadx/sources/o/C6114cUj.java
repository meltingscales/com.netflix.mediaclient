package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6115cUk;

/* renamed from: o.cUj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6114cUj extends AbstractC6115cUk implements InterfaceC1673aK<AbstractC6115cUk.c>, InterfaceC6113cUi {
    private InterfaceC4414be<C6114cUj, AbstractC6115cUk.c> b;
    private InterfaceC4467bf<C6114cUj, AbstractC6115cUk.c> c;
    private InterfaceC4573bh<C6114cUj, AbstractC6115cUk.c> d;
    private InterfaceC4732bk<C6114cUj, AbstractC6115cUk.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6115cUk.c cVar, int i) {
    }

    @Override // o.InterfaceC6113cUi
    public /* synthetic */ InterfaceC6113cUi b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C6114cUj, AbstractC6115cUk.c>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6115cUk.c cVar, int i) {
        InterfaceC4467bf<C6114cUj, AbstractC6115cUk.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    public C6114cUj d(InterfaceC4467bf<C6114cUj, AbstractC6115cUk.c> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC6115cUk.c cVar) {
        super.b((C6114cUj) cVar);
        InterfaceC4414be<C6114cUj, AbstractC6115cUk.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC6115cUk, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6115cUk.c cVar) {
        InterfaceC4732bk<C6114cUj, AbstractC6115cUk.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.c(i, cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6115cUk.c cVar) {
        InterfaceC4573bh<C6114cUj, AbstractC6115cUk.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6114cUj e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6113cUi
    /* renamed from: c */
    public C6114cUj e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6114cUj a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC6113cUi
    /* renamed from: e */
    public C6114cUj c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6115cUk.c b(ViewParent viewParent) {
        return new AbstractC6115cUk.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6114cUj) && super.equals(obj)) {
            C6114cUj c6114cUj = (C6114cUj) obj;
            if ((this.c == null) != (c6114cUj.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6114cUj.b == null)) {
                return false;
            }
            if ((this.i == null) != (c6114cUj.i == null)) {
                return false;
            }
            return (this.d == null) == (c6114cUj.d == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.i != null ? 1 : 0)) * 31) + (this.d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "LoadingShimmeringModel_{}" + super.toString();
    }
}
