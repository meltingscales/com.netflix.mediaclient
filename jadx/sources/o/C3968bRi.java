package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3971bRl;

/* renamed from: o.bRi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3968bRi extends AbstractC3971bRl implements InterfaceC1673aK<AbstractC3971bRl.c>, InterfaceC3972bRm {
    private InterfaceC4573bh<C3968bRi, AbstractC3971bRl.c> b;
    private InterfaceC4414be<C3968bRi, AbstractC3971bRl.c> c;
    private InterfaceC4467bf<C3968bRi, AbstractC3971bRl.c> d;
    private InterfaceC4732bk<C3968bRi, AbstractC3971bRl.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC3971bRl.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3971bRl.c cVar, int i) {
        InterfaceC4467bf<C3968bRi, AbstractC3971bRl.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3971bRl, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC3971bRl.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3968bRi, AbstractC3971bRl.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3971bRl.c cVar) {
        InterfaceC4732bk<C3968bRi, AbstractC3971bRl.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3971bRl.c cVar) {
        InterfaceC4573bh<C3968bRi, AbstractC3971bRl.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3972bRm
    /* renamed from: f */
    public C3968bRi b(String str) {
        h();
        super.A_(str);
        return this;
    }

    @Override // o.InterfaceC3972bRm
    /* renamed from: g */
    public C3968bRi c(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC3972bRm
    /* renamed from: j */
    public C3968bRi e(String str) {
        h();
        super.C_(str);
        return this;
    }

    @Override // o.InterfaceC3972bRm
    /* renamed from: i */
    public C3968bRi d(String str) {
        h();
        super.B_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3968bRi e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3968bRi a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3968bRi a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3968bRi a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3971bRl.c b(ViewParent viewParent) {
        return new AbstractC3971bRl.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3968bRi) && super.equals(obj)) {
            C3968bRi c3968bRi = (C3968bRi) obj;
            if ((this.d == null) != (c3968bRi.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3968bRi.c == null)) {
                return false;
            }
            if ((this.f == null) != (c3968bRi.f == null)) {
                return false;
            }
            if ((this.b == null) != (c3968bRi.b == null)) {
                return false;
            }
            if (i() == null ? c3968bRi.i() == null : i().equals(c3968bRi.i())) {
                if (k() == null ? c3968bRi.k() == null : k().equals(c3968bRi.k())) {
                    if (o() == null ? c3968bRi.o() == null : o().equals(c3968bRi.o())) {
                        return l() == null ? c3968bRi.l() == null : l().equals(c3968bRi.l());
                    }
                    return false;
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.b == null ? 0 : 1;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (l() != null ? l().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "IPBasedGameInfoModel_{gameId=" + i() + ", iconImageUrl=" + k() + ", title=" + o() + ", genre=" + l() + "}" + super.toString();
    }
}
