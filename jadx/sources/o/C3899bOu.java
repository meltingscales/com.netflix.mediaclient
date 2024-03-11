package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3902bOx;

/* renamed from: o.bOu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3899bOu extends AbstractC3902bOx implements InterfaceC1673aK<AbstractC3902bOx.d>, InterfaceC3898bOt {
    private InterfaceC4414be<C3899bOu, AbstractC3902bOx.d> b;
    private InterfaceC4467bf<C3899bOu, AbstractC3902bOx.d> c;
    private InterfaceC4732bk<C3899bOu, AbstractC3902bOx.d> f;
    private InterfaceC4573bh<C3899bOu, AbstractC3902bOx.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC3902bOx.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3902bOx.d dVar, int i) {
        InterfaceC4467bf<C3899bOu, AbstractC3902bOx.d> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3902bOx, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3902bOx.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C3899bOu, AbstractC3902bOx.d> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3902bOx.d dVar) {
        InterfaceC4732bk<C3899bOu, AbstractC3902bOx.d> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3902bOx.d dVar) {
        InterfaceC4573bh<C3899bOu, AbstractC3902bOx.d> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3898bOt
    /* renamed from: e */
    public C3899bOu b(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC3898bOt
    /* renamed from: i */
    public C3899bOu a(String str) {
        h();
        super.o_(str);
        return this;
    }

    @Override // o.InterfaceC3898bOt
    /* renamed from: g */
    public C3899bOu d(String str) {
        h();
        super.n_(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3899bOu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3899bOu a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3898bOt
    /* renamed from: b */
    public C3899bOu d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3899bOu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3902bOx.d b(ViewParent viewParent) {
        return new AbstractC3902bOx.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3899bOu) && super.equals(obj)) {
            C3899bOu c3899bOu = (C3899bOu) obj;
            if ((this.c == null) != (c3899bOu.c == null)) {
                return false;
            }
            if ((this.b == null) != (c3899bOu.b == null)) {
                return false;
            }
            if ((this.f == null) != (c3899bOu.f == null)) {
                return false;
            }
            if ((this.j == null) != (c3899bOu.j == null)) {
                return false;
            }
            if (i() == null ? c3899bOu.i() == null : i().equals(c3899bOu.i())) {
                if (k() == null ? c3899bOu.k() == null : k().equals(c3899bOu.k())) {
                    return m() == null ? c3899bOu.m() == null : m().equals(c3899bOu.m());
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
        int i4 = this.j == null ? 0 : 1;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (m() != null ? m().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameBillboardIconAndTitleModel_{gameId=" + i() + ", title=" + k() + ", iconImageUrl=" + m() + "}" + super.toString();
    }
}
