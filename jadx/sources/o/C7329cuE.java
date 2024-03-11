package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7326cuB;

/* renamed from: o.cuE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7329cuE extends AbstractC7326cuB implements InterfaceC1673aK<AbstractC7326cuB.e> {
    private InterfaceC4467bf<C7329cuE, AbstractC7326cuB.e> b;
    private InterfaceC4414be<C7329cuE, AbstractC7326cuB.e> c;
    private InterfaceC4732bk<C7329cuE, AbstractC7326cuB.e> i;
    private InterfaceC4573bh<C7329cuE, AbstractC7326cuB.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC7326cuB.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7326cuB.e eVar, int i) {
        InterfaceC4467bf<C7329cuE, AbstractC7326cuB.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7326cuB.e eVar) {
        super.b((C7329cuE) eVar);
        InterfaceC4414be<C7329cuE, AbstractC7326cuB.e> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC7326cuB.e eVar) {
        InterfaceC4732bk<C7329cuE, AbstractC7326cuB.e> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC7326cuB.e eVar) {
        InterfaceC4573bh<C7329cuE, AbstractC7326cuB.e> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) eVar);
    }

    public C7329cuE e(CharSequence charSequence) {
        h();
        ((AbstractC7326cuB) this).d = charSequence;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7329cuE e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7329cuE a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7329cuE a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7329cuE a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7326cuB.e b(ViewParent viewParent) {
        return new AbstractC7326cuB.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7329cuE) && super.equals(obj)) {
            C7329cuE c7329cuE = (C7329cuE) obj;
            if ((this.b == null) != (c7329cuE.b == null)) {
                return false;
            }
            if ((this.c == null) != (c7329cuE.c == null)) {
                return false;
            }
            if ((this.i == null) != (c7329cuE.i == null)) {
                return false;
            }
            if ((this.j == null) != (c7329cuE.j == null)) {
                return false;
            }
            CharSequence charSequence = ((AbstractC7326cuB) this).d;
            CharSequence charSequence2 = ((AbstractC7326cuB) c7329cuE).d;
            return charSequence == null ? charSequence2 == null : charSequence.equals(charSequence2);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j == null ? 0 : 1;
        CharSequence charSequence = ((AbstractC7326cuB) this).d;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SeasonLabelModel_{text=" + ((Object) ((AbstractC7326cuB) this).d) + "}" + super.toString();
    }
}
