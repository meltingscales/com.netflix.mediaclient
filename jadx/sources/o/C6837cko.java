package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6830ckh;

/* renamed from: o.cko  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6837cko extends AbstractC6830ckh implements InterfaceC1673aK<AbstractC6830ckh.a>, InterfaceC6835ckm {
    private InterfaceC4467bf<C6837cko, AbstractC6830ckh.a> b;
    private InterfaceC4414be<C6837cko, AbstractC6830ckh.a> c;
    private InterfaceC4573bh<C6837cko, AbstractC6830ckh.a> d;
    private InterfaceC4732bk<C6837cko, AbstractC6830ckh.a> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC6830ckh.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6830ckh.a aVar, int i) {
        InterfaceC4467bf<C6837cko, AbstractC6830ckh.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC6830ckh, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6830ckh.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C6837cko, AbstractC6830ckh.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6830ckh.a aVar) {
        InterfaceC4732bk<C6837cko, AbstractC6830ckh.a> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6830ckh.a aVar) {
        InterfaceC4573bh<C6837cko, AbstractC6830ckh.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.InterfaceC6835ckm
    /* renamed from: a */
    public C6837cko d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC6835ckm
    /* renamed from: g */
    public C6837cko e(String str) {
        h();
        super.T_(str);
        return this;
    }

    @Override // o.InterfaceC6835ckm
    /* renamed from: h */
    public C6837cko b(String str) {
        h();
        super.U_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6837cko e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6835ckm
    /* renamed from: e */
    public C6837cko c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6837cko a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6837cko a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6830ckh.a b(ViewParent viewParent) {
        return new AbstractC6830ckh.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6837cko) && super.equals(obj)) {
            C6837cko c6837cko = (C6837cko) obj;
            if ((this.b == null) != (c6837cko.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6837cko.c == null)) {
                return false;
            }
            if ((this.h == null) != (c6837cko.h == null)) {
                return false;
            }
            if ((this.d == null) != (c6837cko.d == null)) {
                return false;
            }
            if (i() == null ? c6837cko.i() == null : i().equals(c6837cko.i())) {
                if (n() == null ? c6837cko.n() == null : n().equals(c6837cko.n())) {
                    return k() == null ? c6837cko.k() == null : k().equals(c6837cko.k());
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.d == null ? 0 : 1;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (k() != null ? k().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HouseholdProfileModel_{imageUrl=" + i() + ", labelText=" + n() + ", profileName=" + k() + "}" + super.toString();
    }
}
