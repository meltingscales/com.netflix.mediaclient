package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.TB;

/* renamed from: o.Tz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1238Tz extends TB implements InterfaceC1673aK<TB.d>, InterfaceC1236Tx {
    private InterfaceC4467bf<C1238Tz, TB.d> b;
    private InterfaceC4414be<C1238Tz, TB.d> c;
    private InterfaceC4573bh<C1238Tz, TB.d> d;
    private InterfaceC4732bk<C1238Tz, TB.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, TB.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(TB.d dVar, int i) {
        InterfaceC4467bf<C1238Tz, TB.d> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.TB, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(TB.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C1238Tz, TB.d> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, TB.d dVar) {
        InterfaceC4732bk<C1238Tz, TB.d> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, TB.d dVar) {
        InterfaceC4573bh<C1238Tz, TB.d> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC1236Tx
    /* renamed from: h */
    public C1238Tz d(CharSequence charSequence) {
        h();
        super.b(charSequence);
        return this;
    }

    @Override // o.InterfaceC1236Tx
    /* renamed from: d */
    public C1238Tz c(boolean z) {
        h();
        super.a(z);
        return this;
    }

    @Override // o.InterfaceC1236Tx
    /* renamed from: e */
    public C1238Tz b(boolean z) {
        h();
        super.b_(z);
        return this;
    }

    @Override // o.InterfaceC1236Tx
    /* renamed from: d */
    public C1238Tz a(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C1238Tz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC1236Tx
    /* renamed from: c */
    public C1238Tz e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C1238Tz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C1238Tz a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public TB.d b(ViewParent viewParent) {
        return new TB.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C1238Tz) && super.equals(obj)) {
            C1238Tz c1238Tz = (C1238Tz) obj;
            if ((this.b == null) != (c1238Tz.b == null)) {
                return false;
            }
            if ((this.c == null) != (c1238Tz.c == null)) {
                return false;
            }
            if ((this.j == null) != (c1238Tz.j == null)) {
                return false;
            }
            if ((this.d == null) != (c1238Tz.d == null)) {
                return false;
            }
            if (o() == null ? c1238Tz.o() == null : o().equals(c1238Tz.o())) {
                if (i() == c1238Tz.i() && n() == c1238Tz.n()) {
                    return (l() == null) == (c1238Tz.l() == null);
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (i() ? 1 : 0)) * 31) + (n() ? 1 : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "SelectionItemModel_{label=" + ((Object) o()) + ", hideLabel=" + i() + ", selected=" + n() + ", onClick=" + l() + "}" + super.toString();
    }
}
