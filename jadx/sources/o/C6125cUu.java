package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6124cUt;

/* renamed from: o.cUu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6125cUu extends AbstractC6124cUt implements InterfaceC1673aK<AbstractC6124cUt.b> {
    private InterfaceC4414be<C6125cUu, AbstractC6124cUt.b> b;
    private InterfaceC4467bf<C6125cUu, AbstractC6124cUt.b> d;
    private InterfaceC4732bk<C6125cUu, AbstractC6124cUt.b> i;
    private InterfaceC4573bh<C6125cUu, AbstractC6124cUt.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6124cUt.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6124cUt.b bVar, int i) {
        InterfaceC4467bf<C6125cUu, AbstractC6124cUt.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6124cUt.b bVar) {
        super.b((C6125cUu) bVar);
        InterfaceC4414be<C6125cUu, AbstractC6124cUt.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6124cUt.b bVar) {
        InterfaceC4732bk<C6125cUu, AbstractC6124cUt.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    public C6125cUu d(InterfaceC4732bk<C6125cUu, AbstractC6124cUt.b> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6124cUt.b bVar) {
        InterfaceC4573bh<C6125cUu, AbstractC6124cUt.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    public C6125cUu a(InterfaceC4308bc<C6125cUu, AbstractC6124cUt.b> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.e((View.OnClickListener) null);
        } else {
            super.e((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C6125cUu d(String str) {
        h();
        this.c = str;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6125cUu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6125cUu a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6125cUu a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6125cUu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6124cUt.b b(ViewParent viewParent) {
        return new AbstractC6124cUt.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6125cUu) && super.equals(obj)) {
            C6125cUu c6125cUu = (C6125cUu) obj;
            if ((this.d == null) != (c6125cUu.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6125cUu.b == null)) {
                return false;
            }
            if ((this.i == null) != (c6125cUu.i == null)) {
                return false;
            }
            if ((this.j == null) != (c6125cUu.j == null)) {
                return false;
            }
            if ((i() == null) != (c6125cUu.i() == null)) {
                return false;
            }
            String str = this.c;
            if (str == null ? c6125cUu.c == null : str.equals(c6125cUu.c)) {
                return o() == c6125cUu.o();
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int i5 = i() == null ? 0 : 1;
        String str = this.c;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + o();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SearchPillModel_{clickListener=" + i() + ", pillText=" + this.c + ", entityId=" + o() + "}" + super.toString();
    }
}
