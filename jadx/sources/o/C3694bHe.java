package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3695bHf;

/* renamed from: o.bHe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3694bHe extends AbstractC3695bHf implements InterfaceC1673aK<AbstractC3695bHf.c>, InterfaceC3693bHd {
    private InterfaceC4467bf<C3694bHe, AbstractC3695bHf.c> b;
    private InterfaceC4414be<C3694bHe, AbstractC3695bHf.c> c;
    private InterfaceC4573bh<C3694bHe, AbstractC3695bHf.c> f;
    private InterfaceC4732bk<C3694bHe, AbstractC3695bHf.c> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3695bHf.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3695bHf.c cVar, int i) {
        InterfaceC4467bf<C3694bHe, AbstractC3695bHf.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3695bHf, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3695bHf.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C3694bHe, AbstractC3695bHf.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC3695bHf.c cVar) {
        InterfaceC4732bk<C3694bHe, AbstractC3695bHf.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3695bHf.c cVar) {
        InterfaceC4573bh<C3694bHe, AbstractC3695bHf.c> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC3693bHd
    /* renamed from: f */
    public C3694bHe d(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.InterfaceC3693bHd
    /* renamed from: b */
    public C3694bHe c(Integer num) {
        h();
        super.a(num);
        return this;
    }

    @Override // o.InterfaceC3693bHd
    /* renamed from: g */
    public C3694bHe e(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3694bHe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3693bHd
    /* renamed from: e */
    public C3694bHe c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3694bHe a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3694bHe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC3695bHf.c b(ViewParent viewParent) {
        return new AbstractC3695bHf.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3694bHe) && super.equals(obj)) {
            C3694bHe c3694bHe = (C3694bHe) obj;
            if ((this.b == null) != (c3694bHe.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3694bHe.c == null)) {
                return false;
            }
            if ((this.h == null) != (c3694bHe.h == null)) {
                return false;
            }
            if ((this.f == null) != (c3694bHe.f == null)) {
                return false;
            }
            if (n() == null ? c3694bHe.n() == null : n().equals(c3694bHe.n())) {
                if (i() == null ? c3694bHe.i() == null : i().equals(c3694bHe.i())) {
                    return m() == null ? c3694bHe.m() == null : m().equals(c3694bHe.m());
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
        int i4 = this.f == null ? 0 : 1;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? m().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpSupplementalMessageModel_{text=" + ((Object) n()) + ", drawableResId=" + i() + ", marginTop=" + m() + "}" + super.toString();
    }
}
