package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7103cpr;

/* renamed from: o.cpz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7111cpz extends AbstractC7103cpr implements InterfaceC1673aK<AbstractC7103cpr.c>, InterfaceC7108cpw {
    private InterfaceC4467bf<C7111cpz, AbstractC7103cpr.c> b;
    private InterfaceC4414be<C7111cpz, AbstractC7103cpr.c> f;
    private InterfaceC4732bk<C7111cpz, AbstractC7103cpr.c> i;
    private InterfaceC4573bh<C7111cpz, AbstractC7103cpr.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7103cpr.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC7103cpr.c cVar, int i) {
        InterfaceC4467bf<C7111cpz, AbstractC7103cpr.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC7103cpr, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC7103cpr.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C7111cpz, AbstractC7103cpr.c> interfaceC4414be = this.f;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7103cpr.c cVar) {
        InterfaceC4732bk<C7111cpz, AbstractC7103cpr.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC7103cpr.c cVar) {
        InterfaceC4573bh<C7111cpz, AbstractC7103cpr.c> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7108cpw
    /* renamed from: h */
    public C7111cpz e(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    @Override // o.InterfaceC7108cpw
    /* renamed from: b */
    public C7111cpz a(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7111cpz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7108cpw
    /* renamed from: b */
    public C7111cpz c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7111cpz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7111cpz a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC7103cpr.c b(ViewParent viewParent) {
        return new AbstractC7103cpr.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7111cpz) && super.equals(obj)) {
            C7111cpz c7111cpz = (C7111cpz) obj;
            if ((this.b == null) != (c7111cpz.b == null)) {
                return false;
            }
            if ((this.f == null) != (c7111cpz.f == null)) {
                return false;
            }
            if ((this.i == null) != (c7111cpz.i == null)) {
                return false;
            }
            if ((this.j == null) != (c7111cpz.j == null)) {
                return false;
            }
            if (l() == null ? c7111cpz.l() == null : l().equals(c7111cpz.l())) {
                return i() == null ? c7111cpz.i() == null : i().equals(c7111cpz.i());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.f != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j == null ? 0 : 1;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "NotificationsStackModel_{text=" + ((Object) l()) + ", contentDescription=" + i() + "}" + super.toString();
    }
}
