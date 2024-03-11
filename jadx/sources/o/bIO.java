package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bIL;

/* loaded from: classes4.dex */
public class bIO extends bIL implements InterfaceC1673aK<bIL.d>, bIK {
    private InterfaceC4414be<bIO, bIL.d> c;
    private InterfaceC4467bf<bIO, bIL.d> d;
    private InterfaceC4573bh<bIO, bIL.d> i;
    private InterfaceC4732bk<bIO, bIL.d> j;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bIL.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bIL.d dVar, int i) {
        InterfaceC4467bf<bIO, bIL.d> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(bIL.d dVar) {
        super.b((bIO) dVar);
        InterfaceC4414be<bIO, bIL.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bIL.d dVar) {
        InterfaceC4732bk<bIO, bIL.d> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, bIL.d dVar) {
        InterfaceC4573bh<bIO, bIL.d> interfaceC4573bh = this.i;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.bIK
    /* renamed from: c */
    public bIO e(CharSequence charSequence) {
        h();
        ((bIL) this).b = charSequence;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bIO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bIK
    /* renamed from: d */
    public bIO b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bIO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bIK
    /* renamed from: d */
    public bIO b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bIL.d b(ViewParent viewParent) {
        return new bIL.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bIO) && super.equals(obj)) {
            bIO bio = (bIO) obj;
            if ((this.d == null) != (bio.d == null)) {
                return false;
            }
            if ((this.c == null) != (bio.c == null)) {
                return false;
            }
            if ((this.j == null) != (bio.j == null)) {
                return false;
            }
            if ((this.i == null) != (bio.i == null)) {
                return false;
            }
            if (o() == null ? bio.o() == null : o().equals(bio.o())) {
                CharSequence charSequence = ((bIL) this).b;
                if (charSequence == null ? ((bIL) bio).b == null : charSequence.equals(((bIL) bio).b)) {
                    return i() == null ? bio.i() == null : i().equals(bio.i());
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
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.i == null ? 0 : 1;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        CharSequence charSequence = ((bIL) this).b;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ErrorTextModel_{gravity=" + o() + ", text=" + ((Object) ((bIL) this).b) + ", color=" + i() + "}" + super.toString();
    }
}
