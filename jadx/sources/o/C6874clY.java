package o;

import android.view.ViewParent;
import o.AbstractC3073as;

/* renamed from: o.clY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6874clY extends AbstractC6872clW implements InterfaceC1673aK<C6946cmr>, InterfaceC6873clX {
    private InterfaceC4573bh<C6874clY, C6946cmr> b;
    private InterfaceC4414be<C6874clY, C6946cmr> c;
    private InterfaceC4467bf<C6874clY, C6946cmr> d;
    private InterfaceC4732bk<C6874clY, C6946cmr> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, C6946cmr c6946cmr, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(C6946cmr c6946cmr, int i) {
        InterfaceC4467bf<C6874clY, C6946cmr> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, c6946cmr, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(C6946cmr c6946cmr) {
        super.b((C6874clY) c6946cmr);
        InterfaceC4414be<C6874clY, C6946cmr> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, c6946cmr);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, C6946cmr c6946cmr) {
        InterfaceC4732bk<C6874clY, C6946cmr> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, c6946cmr, i);
        }
        super.a(i, (int) c6946cmr);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, C6946cmr c6946cmr) {
        InterfaceC4573bh<C6874clY, C6946cmr> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, c6946cmr, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, c6946cmr);
    }

    @Override // o.InterfaceC6873clX
    /* renamed from: c */
    public C6874clY e(String str) {
        h();
        super.W_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6874clY e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6873clX
    /* renamed from: c */
    public C6874clY d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6874clY a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6874clY a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public C6946cmr b(ViewParent viewParent) {
        return new C6946cmr();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6874clY) && super.equals(obj)) {
            C6874clY c6874clY = (C6874clY) obj;
            if ((this.d == null) != (c6874clY.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6874clY.c == null)) {
                return false;
            }
            if ((this.f == null) != (c6874clY.f == null)) {
                return false;
            }
            if ((this.b == null) != (c6874clY.b == null)) {
                return false;
            }
            return i() == null ? c6874clY.i() == null : i().equals(c6874clY.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.b == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MultiMonthAnnualFullPriceModel_{fullPrice=" + i() + "}" + super.toString();
    }
}
