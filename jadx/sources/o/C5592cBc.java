package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.cAX;

/* renamed from: o.cBc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5592cBc extends cAX implements InterfaceC1673aK<cAX.b>, cAZ {
    private InterfaceC4414be<C5592cBc, cAX.b> b;
    private InterfaceC4467bf<C5592cBc, cAX.b> c;
    private InterfaceC4573bh<C5592cBc, cAX.b> d;
    private InterfaceC4732bk<C5592cBc, cAX.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, cAX.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(cAX.b bVar, int i) {
        InterfaceC4467bf<C5592cBc, cAX.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(cAX.b bVar) {
        super.b((C5592cBc) bVar);
        InterfaceC4414be<C5592cBc, cAX.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, cAX.b bVar) {
        InterfaceC4732bk<C5592cBc, cAX.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, cAX.b bVar) {
        InterfaceC4573bh<C5592cBc, cAX.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C5592cBc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAZ
    /* renamed from: c */
    public C5592cBc d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C5592cBc a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5592cBc a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public cAX.b b(ViewParent viewParent) {
        return new cAX.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C5592cBc) && super.equals(obj)) {
            C5592cBc c5592cBc = (C5592cBc) obj;
            if ((this.c == null) != (c5592cBc.c == null)) {
                return false;
            }
            if ((this.b == null) != (c5592cBc.b == null)) {
                return false;
            }
            if ((this.j == null) != (c5592cBc.j == null)) {
                return false;
            }
            return (this.d == null) == (c5592cBc.d == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.j != null ? 1 : 0)) * 31) + (this.d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PreviewVideoGradientModel_{}" + super.toString();
    }
}
