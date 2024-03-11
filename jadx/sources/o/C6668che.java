package o;

import android.view.ViewParent;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import o.AbstractC3073as;
import o.AbstractC6667chd;

/* renamed from: o.che  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6668che extends AbstractC6667chd implements InterfaceC1673aK<AbstractC6667chd.b>, InterfaceC6666chc {
    private InterfaceC4467bf<C6668che, AbstractC6667chd.b> b;
    private InterfaceC4414be<C6668che, AbstractC6667chd.b> c;
    private InterfaceC4732bk<C6668che, AbstractC6667chd.b> h;
    private InterfaceC4573bh<C6668che, AbstractC6667chd.b> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6667chd.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6667chd.b bVar, int i) {
        InterfaceC4467bf<C6668che, AbstractC6667chd.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6667chd.b bVar) {
        super.b((C6668che) bVar);
        InterfaceC4414be<C6668che, AbstractC6667chd.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6667chd.b bVar) {
        InterfaceC4732bk<C6668che, AbstractC6667chd.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6667chd.b bVar) {
        InterfaceC4573bh<C6668che, AbstractC6667chd.b> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6666chc
    /* renamed from: b */
    public C6668che c(TouPaymentViewModel touPaymentViewModel) {
        h();
        ((AbstractC6667chd) this).d = touPaymentViewModel;
        return this;
    }

    @Override // o.InterfaceC6666chc
    /* renamed from: e */
    public C6668che d(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6668che e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6666chc
    /* renamed from: b */
    public C6668che c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6668che a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6668che a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6667chd.b b(ViewParent viewParent) {
        return new AbstractC6667chd.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6668che) && super.equals(obj)) {
            C6668che c6668che = (C6668che) obj;
            if ((this.b == null) != (c6668che.b == null)) {
                return false;
            }
            if ((this.c == null) != (c6668che.c == null)) {
                return false;
            }
            if ((this.h == null) != (c6668che.h == null)) {
                return false;
            }
            if ((this.i == null) != (c6668che.i == null)) {
                return false;
            }
            return (((AbstractC6667chd) this).d == null) == (((AbstractC6667chd) c6668che).d == null) && i() == c6668che.i();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.i != null ? 1 : 0)) * 31) + (((AbstractC6667chd) this).d == null ? 0 : 1)) * 31) + (i() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TermsOfUseCheckboxModel_{touViewModel=" + ((AbstractC6667chd) this).d + ", showFormErrors=" + i() + "}" + super.toString();
    }
}
