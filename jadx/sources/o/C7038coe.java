package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7040cog;

/* renamed from: o.coe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7038coe extends AbstractC7040cog implements InterfaceC1673aK<AbstractC7040cog.d>, InterfaceC7037cod {
    private InterfaceC4467bf<C7038coe, AbstractC7040cog.d> b;
    private InterfaceC4414be<C7038coe, AbstractC7040cog.d> c;
    private InterfaceC4573bh<C7038coe, AbstractC7040cog.d> d;
    private InterfaceC4732bk<C7038coe, AbstractC7040cog.d> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC7040cog.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC7040cog.d dVar, int i) {
        InterfaceC4467bf<C7038coe, AbstractC7040cog.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC7040cog.d dVar) {
        super.b((C7038coe) dVar);
        InterfaceC4414be<C7038coe, AbstractC7040cog.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7040cog.d dVar) {
        InterfaceC4732bk<C7038coe, AbstractC7040cog.d> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC7040cog.d dVar) {
        InterfaceC4573bh<C7038coe, AbstractC7040cog.d> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) dVar);
    }

    @Override // o.InterfaceC7037cod
    /* renamed from: j */
    public C7038coe b(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.InterfaceC7037cod
    /* renamed from: d */
    public C7038coe c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC7037cod
    /* renamed from: e */
    public C7038coe c(Integer num) {
        h();
        super.a(num);
        return this;
    }

    @Override // o.InterfaceC7037cod
    /* renamed from: a */
    public C7038coe c(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7038coe e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7037cod
    /* renamed from: e */
    public C7038coe d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7038coe a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7038coe a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7040cog.d b(ViewParent viewParent) {
        return new AbstractC7040cog.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7038coe) && super.equals(obj)) {
            C7038coe c7038coe = (C7038coe) obj;
            if ((this.b == null) != (c7038coe.b == null)) {
                return false;
            }
            if ((this.c == null) != (c7038coe.c == null)) {
                return false;
            }
            if ((this.i == null) != (c7038coe.i == null)) {
                return false;
            }
            if ((this.d == null) != (c7038coe.d == null)) {
                return false;
            }
            if (o() == null ? c7038coe.o() == null : o().equals(c7038coe.o())) {
                if (n() != c7038coe.n()) {
                    return false;
                }
                if (i() == null ? c7038coe.i() == null : i().equals(c7038coe.i())) {
                    return (l() == null) == (c7038coe.l() == null);
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        boolean n = n();
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (n ? 1 : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "MyListSortOptionModel_{titleRes=" + o() + ", selected=" + n() + ", accessibilityRes=" + i() + ", clickListener=" + l() + "}" + super.toString();
    }
}
