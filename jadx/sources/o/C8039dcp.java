package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC8031dch;

/* renamed from: o.dcp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8039dcp extends AbstractC8031dch implements InterfaceC1673aK<AbstractC8031dch.e>, InterfaceC8036dcm {
    private InterfaceC4573bh<C8039dcp, AbstractC8031dch.e> b;
    private InterfaceC4414be<C8039dcp, AbstractC8031dch.e> c;
    private InterfaceC4467bf<C8039dcp, AbstractC8031dch.e> d;
    private InterfaceC4732bk<C8039dcp, AbstractC8031dch.e> h;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC8031dch.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC8031dch.e eVar, int i) {
        InterfaceC4467bf<C8039dcp, AbstractC8031dch.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC8031dch.e eVar) {
        super.b((C8039dcp) eVar);
        InterfaceC4414be<C8039dcp, AbstractC8031dch.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC8031dch.e eVar) {
        InterfaceC4732bk<C8039dcp, AbstractC8031dch.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC8031dch.e eVar) {
        InterfaceC4573bh<C8039dcp, AbstractC8031dch.e> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C8039dcp e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC8036dcm
    /* renamed from: b */
    public C8039dcp d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C8039dcp a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C8039dcp a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC8031dch.e b(ViewParent viewParent) {
        return new AbstractC8031dch.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C8039dcp) && super.equals(obj)) {
            C8039dcp c8039dcp = (C8039dcp) obj;
            if ((this.d == null) != (c8039dcp.d == null)) {
                return false;
            }
            if ((this.c == null) != (c8039dcp.c == null)) {
                return false;
            }
            if ((this.h == null) != (c8039dcp.h == null)) {
                return false;
            }
            return (this.b == null) == (c8039dcp.b == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.h != null ? 1 : 0)) * 31) + (this.b == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "UserMarksEmptyStateModel_{}" + super.toString();
    }
}
