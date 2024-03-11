package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6500ceV;

/* renamed from: o.ceZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6504ceZ extends AbstractC6500ceV implements InterfaceC1673aK<AbstractC6500ceV.c>, InterfaceC6501ceW {
    private InterfaceC4414be<C6504ceZ, AbstractC6500ceV.c> b;
    private InterfaceC4467bf<C6504ceZ, AbstractC6500ceV.c> d;
    private InterfaceC4732bk<C6504ceZ, AbstractC6500ceV.c> h;
    private InterfaceC4573bh<C6504ceZ, AbstractC6500ceV.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC6500ceV.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC6500ceV.c cVar, int i) {
        InterfaceC4467bf<C6504ceZ, AbstractC6500ceV.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6500ceV.c cVar) {
        super.b((C6504ceZ) cVar);
        InterfaceC4414be<C6504ceZ, AbstractC6500ceV.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC6500ceV.c cVar) {
        InterfaceC4732bk<C6504ceZ, AbstractC6500ceV.c> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6500ceV.c cVar) {
        InterfaceC4573bh<C6504ceZ, AbstractC6500ceV.c> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC6501ceW
    /* renamed from: f */
    public C6504ceZ c(CharSequence charSequence) {
        h();
        super.E_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6501ceW
    /* renamed from: j */
    public C6504ceZ b(CharSequence charSequence) {
        h();
        super.F_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6501ceW
    /* renamed from: h */
    public C6504ceZ d(CharSequence charSequence) {
        h();
        super.G_(charSequence);
        return this;
    }

    @Override // o.InterfaceC6501ceW
    /* renamed from: e */
    public C6504ceZ d(View.OnClickListener onClickListener) {
        h();
        this.c = onClickListener;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6504ceZ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6501ceW
    /* renamed from: i */
    public C6504ceZ e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6504ceZ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6504ceZ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC6500ceV.c b(ViewParent viewParent) {
        return new AbstractC6500ceV.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6504ceZ) && super.equals(obj)) {
            C6504ceZ c6504ceZ = (C6504ceZ) obj;
            if ((this.d == null) != (c6504ceZ.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6504ceZ.b == null)) {
                return false;
            }
            if ((this.h == null) != (c6504ceZ.h == null)) {
                return false;
            }
            if ((this.j == null) != (c6504ceZ.j == null)) {
                return false;
            }
            if (i() == null ? c6504ceZ.i() == null : i().equals(c6504ceZ.i())) {
                if (o() == null ? c6504ceZ.o() == null : o().equals(c6504ceZ.o())) {
                    if (n() == null ? c6504ceZ.n() == null : n().equals(c6504ceZ.n())) {
                        return (this.c == null) == (c6504ceZ.c == null);
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        int hashCode3 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (this.c != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetDeviceConnectedModel_{deviceName=" + ((Object) i()) + ", mainMessageText=" + ((Object) o()) + ", messageDetailsText=" + ((Object) n()) + ", disconnectClickListener=" + this.c + "}" + super.toString();
    }
}
