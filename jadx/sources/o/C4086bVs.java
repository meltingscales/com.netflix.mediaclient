package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC4079bVl;

/* renamed from: o.bVs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4086bVs extends AbstractC4079bVl implements InterfaceC1673aK<AbstractC4079bVl.e>, InterfaceC4080bVm {
    private InterfaceC4414be<C4086bVs, AbstractC4079bVl.e> b;
    private InterfaceC4467bf<C4086bVs, AbstractC4079bVl.e> c;
    private InterfaceC4573bh<C4086bVs, AbstractC4079bVl.e> d;
    private InterfaceC4732bk<C4086bVs, AbstractC4079bVl.e> g;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC4079bVl.e eVar, int i) {
    }

    @Override // o.InterfaceC4080bVm
    public /* synthetic */ InterfaceC4080bVm b(InterfaceC4467bf interfaceC4467bf) {
        return d((InterfaceC4467bf<C4086bVs, AbstractC4079bVl.e>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC4079bVl.e eVar, int i) {
        InterfaceC4467bf<C4086bVs, AbstractC4079bVl.e> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    public C4086bVs d(InterfaceC4467bf<C4086bVs, AbstractC4079bVl.e> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4079bVl, o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC4079bVl.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C4086bVs, AbstractC4079bVl.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC4079bVl.e eVar) {
        InterfaceC4732bk<C4086bVs, AbstractC4079bVl.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC4079bVl.e eVar) {
        InterfaceC4573bh<C4086bVs, AbstractC4079bVl.e> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC4080bVm
    /* renamed from: a */
    public C4086bVs b(View view) {
        h();
        super.a_(view);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C4086bVs e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4080bVm
    /* renamed from: d */
    public C4086bVs e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C4086bVs a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC4080bVm
    /* renamed from: d */
    public C4086bVs b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC4079bVl.e b(ViewParent viewParent) {
        return new AbstractC4079bVl.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4086bVs) && super.equals(obj)) {
            C4086bVs c4086bVs = (C4086bVs) obj;
            if ((this.c == null) != (c4086bVs.c == null)) {
                return false;
            }
            if ((this.b == null) != (c4086bVs.b == null)) {
                return false;
            }
            if ((this.g == null) != (c4086bVs.g == null)) {
                return false;
            }
            if ((this.d == null) != (c4086bVs.d == null)) {
                return false;
            }
            return (i() == null) == (c4086bVs.i() == null) && k() == c4086bVs.k();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.d != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1)) * 31) + k();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderViewWrapperModel_{view=" + i() + ", viewHashcode=" + k() + "}" + super.toString();
    }
}
