package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6216cYd;

/* renamed from: o.cYi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6221cYi extends AbstractC6216cYd implements InterfaceC1673aK<AbstractC6216cYd.b>, InterfaceC6213cYa {
    private InterfaceC4467bf<C6221cYi, AbstractC6216cYd.b> b;
    private InterfaceC4573bh<C6221cYi, AbstractC6216cYd.b> c;
    private InterfaceC4414be<C6221cYi, AbstractC6216cYd.b> d;
    private InterfaceC4732bk<C6221cYi, AbstractC6216cYd.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6216cYd.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6216cYd.b bVar, int i) {
        InterfaceC4467bf<C6221cYi, AbstractC6216cYd.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6216cYd.b bVar) {
        super.b((C6221cYi) bVar);
        InterfaceC4414be<C6221cYi, AbstractC6216cYd.b> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6216cYd.b bVar) {
        InterfaceC4732bk<C6221cYi, AbstractC6216cYd.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6216cYd.b bVar) {
        InterfaceC4573bh<C6221cYi, AbstractC6216cYd.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    @Override // o.InterfaceC6213cYa
    /* renamed from: b */
    public C6221cYi d(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6221cYi e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6213cYa
    /* renamed from: d */
    public C6221cYi e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6221cYi a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6221cYi a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6216cYd.b b(ViewParent viewParent) {
        return new AbstractC6216cYd.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6221cYi) && super.equals(obj)) {
            C6221cYi c6221cYi = (C6221cYi) obj;
            if ((this.b == null) != (c6221cYi.b == null)) {
                return false;
            }
            if ((this.d == null) != (c6221cYi.d == null)) {
                return false;
            }
            if ((this.j == null) != (c6221cYi.j == null)) {
                return false;
            }
            return (this.c == null) == (c6221cYi.c == null) && i() == c6221cYi.i();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.j != null ? 1 : 0)) * 31) + (this.c == null ? 0 : 1)) * 31) + i();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "HeaderModel_{text=" + i() + "}" + super.toString();
    }
}
