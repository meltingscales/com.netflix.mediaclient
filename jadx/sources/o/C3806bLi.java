package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.AbstractC3799bLb;

/* renamed from: o.bLi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3806bLi extends AbstractC3799bLb implements InterfaceC1673aK<AbstractC3799bLb.e>, InterfaceC3807bLj {
    private InterfaceC4573bh<C3806bLi, AbstractC3799bLb.e> b;
    private InterfaceC4467bf<C3806bLi, AbstractC3799bLb.e> c;
    private InterfaceC4414be<C3806bLi, AbstractC3799bLb.e> d;
    private InterfaceC4732bk<C3806bLi, AbstractC3799bLb.e> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3799bLb.e eVar, int i) {
    }

    @Override // o.InterfaceC3807bLj
    public /* synthetic */ InterfaceC3807bLj c(List list) {
        return b((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3799bLb.e eVar, int i) {
        InterfaceC4467bf<C3806bLi, AbstractC3799bLb.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3799bLb, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC3799bLb.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C3806bLi, AbstractC3799bLb.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3799bLb.e eVar) {
        InterfaceC4732bk<C3806bLi, AbstractC3799bLb.e> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC3799bLb.e eVar) {
        InterfaceC4573bh<C3806bLi, AbstractC3799bLb.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    public C3806bLi b(List<String> list) {
        h();
        super.d(list);
        return this;
    }

    @Override // o.InterfaceC3807bLj
    /* renamed from: c */
    public C3806bLi b(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3806bLi e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3807bLj
    /* renamed from: d */
    public C3806bLi e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3807bLj
    /* renamed from: c */
    public C3806bLi b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3806bLi a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC3799bLb.e b(ViewParent viewParent) {
        return new AbstractC3799bLb.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3806bLi) && super.equals(obj)) {
            C3806bLi c3806bLi = (C3806bLi) obj;
            if ((this.c == null) != (c3806bLi.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3806bLi.d == null)) {
                return false;
            }
            if ((this.i == null) != (c3806bLi.i == null)) {
                return false;
            }
            if ((this.b == null) != (c3806bLi.b == null)) {
                return false;
            }
            if (l() == null ? c3806bLi.l() == null : l().equals(c3806bLi.l())) {
                if (i() == null ? c3806bLi.i() == null : i().equals(c3806bLi.i())) {
                    return (m() == null) == (c3806bLi.m() == null);
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TagsModel_{tags=" + l() + ", accentColor=" + i() + ", onClick=" + m() + "}" + super.toString();
    }
}
