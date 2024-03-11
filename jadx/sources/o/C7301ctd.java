package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7240csV;

/* renamed from: o.ctd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7301ctd extends AbstractC7240csV implements InterfaceC1673aK<AbstractC7240csV.e>, InterfaceC7241csW {
    private InterfaceC4414be<C7301ctd, AbstractC7240csV.e> b;
    private InterfaceC4467bf<C7301ctd, AbstractC7240csV.e> d;
    private InterfaceC4573bh<C7301ctd, AbstractC7240csV.e> f;
    private InterfaceC4732bk<C7301ctd, AbstractC7240csV.e> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC7240csV.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7240csV.e eVar, int i) {
        InterfaceC4467bf<C7301ctd, AbstractC7240csV.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC7240csV.e eVar) {
        super.b((C7301ctd) eVar);
        InterfaceC4414be<C7301ctd, AbstractC7240csV.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC7240csV.e eVar) {
        InterfaceC4732bk<C7301ctd, AbstractC7240csV.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7240csV.e eVar) {
        InterfaceC4573bh<C7301ctd, AbstractC7240csV.e> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC7241csW
    /* renamed from: b */
    public C7301ctd c(CharSequence charSequence) {
        h();
        this.c = charSequence;
        return this;
    }

    @Override // o.InterfaceC7241csW
    /* renamed from: e */
    public C7301ctd a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C7301ctd e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7241csW
    /* renamed from: e */
    public C7301ctd d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7301ctd a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7301ctd a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7240csV.e b(ViewParent viewParent) {
        return new AbstractC7240csV.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7301ctd) && super.equals(obj)) {
            C7301ctd c7301ctd = (C7301ctd) obj;
            if ((this.d == null) != (c7301ctd.d == null)) {
                return false;
            }
            if ((this.b == null) != (c7301ctd.b == null)) {
                return false;
            }
            if ((this.g == null) != (c7301ctd.g == null)) {
                return false;
            }
            if ((this.f == null) != (c7301ctd.f == null)) {
                return false;
            }
            CharSequence charSequence = this.c;
            if (charSequence == null ? c7301ctd.c == null : charSequence.equals(c7301ctd.c)) {
                return (i() == null) == (c7301ctd.i() == null);
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
        int i4 = this.f != null ? 1 : 0;
        CharSequence charSequence = this.c;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FindMoreButtonModel_{text=" + ((Object) this.c) + ", clickListener=" + i() + "}" + super.toString();
    }
}
