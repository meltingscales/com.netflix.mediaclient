package o;

import android.view.ViewParent;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import o.AbstractC3073as;
import o.AbstractC6603cgS;

/* renamed from: o.cgZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6610cgZ extends AbstractC6603cgS implements InterfaceC1673aK<AbstractC6603cgS.b>, InterfaceC6606cgV {
    private InterfaceC4414be<C6610cgZ, AbstractC6603cgS.b> c;
    private InterfaceC4467bf<C6610cgZ, AbstractC6603cgS.b> d;
    private InterfaceC4573bh<C6610cgZ, AbstractC6603cgS.b> i;
    private InterfaceC4732bk<C6610cgZ, AbstractC6603cgS.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC6603cgS.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6603cgS.b bVar, int i) {
        InterfaceC4467bf<C6610cgZ, AbstractC6603cgS.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6603cgS.b bVar) {
        super.b((C6610cgZ) bVar);
        InterfaceC4414be<C6610cgZ, AbstractC6603cgS.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6603cgS.b bVar) {
        InterfaceC4732bk<C6610cgZ, AbstractC6603cgS.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6603cgS.b bVar) {
        InterfaceC4573bh<C6610cgZ, AbstractC6603cgS.b> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC6606cgV
    /* renamed from: b */
    public C6610cgZ a(KoreaCheckBoxesViewModel koreaCheckBoxesViewModel) {
        h();
        ((AbstractC6603cgS) this).b = koreaCheckBoxesViewModel;
        return this;
    }

    @Override // o.InterfaceC6606cgV
    /* renamed from: a */
    public C6610cgZ e(boolean z) {
        h();
        super.b(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6610cgZ e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6606cgV
    /* renamed from: e */
    public C6610cgZ d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6610cgZ a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6610cgZ a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC6603cgS.b b(ViewParent viewParent) {
        return new AbstractC6603cgS.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6610cgZ) && super.equals(obj)) {
            C6610cgZ c6610cgZ = (C6610cgZ) obj;
            if ((this.d == null) != (c6610cgZ.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6610cgZ.c == null)) {
                return false;
            }
            if ((this.j == null) != (c6610cgZ.j == null)) {
                return false;
            }
            if ((this.i == null) != (c6610cgZ.i == null)) {
                return false;
            }
            return (((AbstractC6603cgS) this).b == null) == (((AbstractC6603cgS) c6610cgZ).b == null) && n() == c6610cgZ.n();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.i != null ? 1 : 0)) * 31) + (((AbstractC6603cgS) this).b == null ? 0 : 1)) * 31) + (n() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "KoreaCheckboxesModel_{koreaCheckBoxesViewModel=" + ((AbstractC6603cgS) this).b + ", showFormErrors=" + n() + "}" + super.toString();
    }
}
