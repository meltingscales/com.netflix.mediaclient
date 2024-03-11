package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3776bKf;

/* renamed from: o.bKd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3774bKd extends AbstractC3776bKf implements InterfaceC1673aK<AbstractC3776bKf.e>, InterfaceC3773bKc {
    private InterfaceC4573bh<C3774bKd, AbstractC3776bKf.e> b;
    private InterfaceC4467bf<C3774bKd, AbstractC3776bKf.e> c;
    private InterfaceC4414be<C3774bKd, AbstractC3776bKf.e> d;
    private InterfaceC4732bk<C3774bKd, AbstractC3776bKf.e> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3776bKf.e eVar, int i) {
    }

    @Override // o.InterfaceC3773bKc
    public /* synthetic */ InterfaceC3773bKc a(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C3774bKd, AbstractC3776bKf.e>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC3776bKf.e eVar, int i) {
        InterfaceC4467bf<C3774bKd, AbstractC3776bKf.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    public C3774bKd d(InterfaceC4467bf<C3774bKd, AbstractC3776bKf.e> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC3776bKf.e eVar) {
        super.b((C3774bKd) eVar);
        InterfaceC4414be<C3774bKd, AbstractC3776bKf.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3776bKf, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC3776bKf.e eVar) {
        InterfaceC4732bk<C3774bKd, AbstractC3776bKf.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.c(i, eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC3776bKf.e eVar) {
        InterfaceC4573bh<C3774bKd, AbstractC3776bKf.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3773bKc
    /* renamed from: c */
    public C3774bKd b(long j) {
        h();
        super.d(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3774bKd e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3773bKc
    /* renamed from: d */
    public C3774bKd c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3773bKc
    /* renamed from: c */
    public C3774bKd d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3773bKc
    /* renamed from: e */
    public C3774bKd d(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3776bKf.e b(ViewParent viewParent) {
        return new AbstractC3776bKf.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3774bKd) && super.equals(obj)) {
            C3774bKd c3774bKd = (C3774bKd) obj;
            if ((this.c == null) != (c3774bKd.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3774bKd.d == null)) {
                return false;
            }
            if ((this.h == null) != (c3774bKd.h == null)) {
                return false;
            }
            if ((this.b == null) != (c3774bKd.b == null)) {
                return false;
            }
            if (l() == null ? c3774bKd.l() == null : l().equals(c3774bKd.l())) {
                return i() == c3774bKd.i();
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
        int i3 = this.h != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.b == null ? 0 : 1)) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + ((int) (i() ^ (i() >>> 32)));
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "LoadingModel_{label=" + l() + ", delayInMs=" + i() + "}" + super.toString();
    }
}
