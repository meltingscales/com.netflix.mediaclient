package o;

import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.AbstractC3949bQq;

/* renamed from: o.bQs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3951bQs extends AbstractC3949bQq implements InterfaceC1673aK<AbstractC3949bQq.d>, InterfaceC3948bQp {
    private InterfaceC4414be<C3951bQs, AbstractC3949bQq.d> b;
    private InterfaceC4573bh<C3951bQs, AbstractC3949bQq.d> c;
    private InterfaceC4467bf<C3951bQs, AbstractC3949bQq.d> d;
    private InterfaceC4732bk<C3951bQs, AbstractC3949bQq.d> g;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3949bQq.d dVar, int i) {
    }

    @Override // o.InterfaceC3948bQp
    public /* synthetic */ InterfaceC3948bQp b(InterfaceC4467bf interfaceC4467bf) {
        return c((InterfaceC4467bf<C3951bQs, AbstractC3949bQq.d>) interfaceC4467bf);
    }

    @Override // o.InterfaceC3948bQp
    public /* synthetic */ InterfaceC3948bQp e(List list) {
        return d((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC3949bQq.d dVar, int i) {
        InterfaceC4467bf<C3951bQs, AbstractC3949bQq.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public C3951bQs c(InterfaceC4467bf<C3951bQs, AbstractC3949bQq.d> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC3949bQq, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3949bQq.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C3951bQs, AbstractC3949bQq.d> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3949bQq.d dVar) {
        InterfaceC4732bk<C3951bQs, AbstractC3949bQq.d> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3949bQq.d dVar) {
        InterfaceC4573bh<C3951bQs, AbstractC3949bQq.d> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: i */
    public C3951bQs b(String str) {
        h();
        super.y_(str);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: h */
    public C3951bQs c(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: e */
    public C3951bQs d(Drawable drawable) {
        h();
        super.b_(drawable);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: f */
    public C3951bQs e(String str) {
        h();
        super.z_(str);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: g */
    public C3951bQs a(String str) {
        h();
        super.x_(str);
        return this;
    }

    public C3951bQs d(List<String> list) {
        h();
        super.b(list);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: e */
    public C3951bQs a(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3951bQs e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: c */
    public C3951bQs b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3948bQp
    /* renamed from: c */
    public C3951bQs e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3951bQs a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC3949bQq.d b(ViewParent viewParent) {
        return new AbstractC3949bQq.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3951bQs) && super.equals(obj)) {
            C3951bQs c3951bQs = (C3951bQs) obj;
            if ((this.d == null) != (c3951bQs.d == null)) {
                return false;
            }
            if ((this.b == null) != (c3951bQs.b == null)) {
                return false;
            }
            if ((this.g == null) != (c3951bQs.g == null)) {
                return false;
            }
            if ((this.c == null) != (c3951bQs.c == null)) {
                return false;
            }
            if (m() == null ? c3951bQs.m() == null : m().equals(c3951bQs.m())) {
                if (q() == null ? c3951bQs.q() == null : q().equals(c3951bQs.q())) {
                    if ((o() == null) != (c3951bQs.o() == null)) {
                        return false;
                    }
                    if (n() == null ? c3951bQs.n() == null : n().equals(c3951bQs.n())) {
                        if (k() == null ? c3951bQs.k() == null : k().equals(c3951bQs.k())) {
                            if (i() == null ? c3951bQs.i() == null : i().equals(c3951bQs.i())) {
                                return l() == c3951bQs.l();
                            }
                            return false;
                        }
                        return false;
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        int hashCode3 = q() != null ? q().hashCode() : 0;
        int i5 = o() == null ? 0 : 1;
        int hashCode4 = n() != null ? n().hashCode() : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + i5) * 31) + hashCode4) * 31) + (k() != null ? k().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (l() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MoreDataRowModel_{keyText=" + m() + ", valueText=" + q() + ", valueIcon=" + o() + ", valueContentDescription=" + n() + ", description=" + k() + ", additionalValues=" + i() + ", lastItem=" + l() + "}" + super.toString();
    }
}
