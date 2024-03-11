package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6664cha;

/* renamed from: o.chb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6665chb extends AbstractC6664cha implements InterfaceC1673aK<AbstractC6664cha.b>, InterfaceC6669chf {
    private InterfaceC4414be<C6665chb, AbstractC6664cha.b> b;
    private InterfaceC4467bf<C6665chb, AbstractC6664cha.b> c;
    private InterfaceC4573bh<C6665chb, AbstractC6664cha.b> d;
    private InterfaceC4732bk<C6665chb, AbstractC6664cha.b> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC6664cha.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6664cha.b bVar, int i) {
        InterfaceC4467bf<C6665chb, AbstractC6664cha.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6664cha.b bVar) {
        super.b((C6665chb) bVar);
        InterfaceC4414be<C6665chb, AbstractC6664cha.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6664cha.b bVar) {
        InterfaceC4732bk<C6665chb, AbstractC6664cha.b> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC6664cha.b bVar) {
        InterfaceC4573bh<C6665chb, AbstractC6664cha.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6669chf
    /* renamed from: j */
    public C6665chb c(CharSequence charSequence) {
        h();
        super.M_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6669chf
    /* renamed from: h */
    public C6665chb b(CharSequence charSequence) {
        h();
        super.L_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6669chf
    /* renamed from: f */
    public C6665chb d(CharSequence charSequence) {
        h();
        super.K_(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6665chb e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6669chf
    /* renamed from: g */
    public C6665chb e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6665chb a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6665chb a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6664cha.b b(ViewParent viewParent) {
        return new AbstractC6664cha.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6665chb) && super.equals(obj)) {
            C6665chb c6665chb = (C6665chb) obj;
            if ((this.c == null) != (c6665chb.c == null)) {
                return false;
            }
            if ((this.b == null) != (c6665chb.b == null)) {
                return false;
            }
            if ((this.f == null) != (c6665chb.f == null)) {
                return false;
            }
            if ((this.d == null) != (c6665chb.d == null)) {
                return false;
            }
            if (m() == null ? c6665chb.m() == null : m().equals(c6665chb.m())) {
                if (k() == null ? c6665chb.k() == null : k().equals(c6665chb.k())) {
                    return i() == null ? c6665chb.i() == null : i().equals(c6665chb.i());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.d == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PlanCardModel_{title=" + ((Object) m()) + ", price=" + ((Object) k()) + ", description=" + ((Object) i()) + "}" + super.toString();
    }
}
