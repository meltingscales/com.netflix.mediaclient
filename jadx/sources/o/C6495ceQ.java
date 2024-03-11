package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6493ceO;

/* renamed from: o.ceQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6495ceQ extends AbstractC6493ceO implements InterfaceC1673aK<AbstractC6493ceO.b>, InterfaceC6494ceP {
    private InterfaceC4467bf<C6495ceQ, AbstractC6493ceO.b> b;
    private InterfaceC4414be<C6495ceQ, AbstractC6493ceO.b> c;
    private InterfaceC4573bh<C6495ceQ, AbstractC6493ceO.b> d;
    private InterfaceC4732bk<C6495ceQ, AbstractC6493ceO.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6493ceO.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6493ceO.b bVar, int i) {
        InterfaceC4467bf<C6495ceQ, AbstractC6493ceO.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6493ceO.b bVar) {
        super.b((C6495ceQ) bVar);
        InterfaceC4414be<C6495ceQ, AbstractC6493ceO.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6493ceO.b bVar) {
        InterfaceC4732bk<C6495ceQ, AbstractC6493ceO.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6493ceO.b bVar) {
        InterfaceC4573bh<C6495ceQ, AbstractC6493ceO.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6495ceQ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6494ceP
    /* renamed from: b */
    public C6495ceQ d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6495ceQ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6495ceQ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6493ceO.b b(ViewParent viewParent) {
        return new AbstractC6493ceO.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6495ceQ) && super.equals(obj)) {
            C6495ceQ c6495ceQ = (C6495ceQ) obj;
            if ((this.b == null) != (c6495ceQ.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6495ceQ.c == null)) {
                return false;
            }
            if ((this.h == null) != (c6495ceQ.h == null)) {
                return false;
            }
            return (this.d == null) == (c6495ceQ.d == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.h != null ? 1 : 0)) * 31) + (this.d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetBodyModel_{}" + super.toString();
    }
}
