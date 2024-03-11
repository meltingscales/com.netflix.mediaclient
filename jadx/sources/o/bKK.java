package o;

import android.view.ViewParent;
import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import java.util.List;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public class bKK extends RowModel implements InterfaceC1673aK<RowModel.b>, bKI {
    private InterfaceC4467bf<bKK, RowModel.b> b;
    private InterfaceC4732bk<bKK, RowModel.b> g;
    private InterfaceC4573bh<bKK, RowModel.b> h;
    private InterfaceC4414be<bKK, RowModel.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, RowModel.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(RowModel.b bVar, int i) {
        InterfaceC4467bf<bKK, RowModel.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public bKK e(InterfaceC4467bf<bKK, RowModel.b> interfaceC4467bf) {
        h();
        this.b = interfaceC4467bf;
        return this;
    }

    @Override // com.netflix.mediaclient.ui.epoxymodels.api.RowModel, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(RowModel.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bKK, RowModel.b> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    public bKK e(InterfaceC4414be<bKK, RowModel.b> interfaceC4414be) {
        h();
        this.j = interfaceC4414be;
        return this;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, RowModel.b bVar) {
        InterfaceC4732bk<bKK, RowModel.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, RowModel.b bVar) {
        InterfaceC4573bh<bKK, RowModel.b> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    public bKK b(InterfaceC3825bMa.a aVar) {
        h();
        super.d(aVar);
        return this;
    }

    public bKK b(List<? extends AbstractC3073as<?>> list) {
        h();
        super.d(list);
        return this;
    }

    public bKK e(int i) {
        h();
        super.d(i);
        return this;
    }

    public bKK c(boolean z) {
        h();
        super.e(z);
        return this;
    }

    public bKK e(C1729aMb c1729aMb) {
        h();
        super.b(c1729aMb);
        return this;
    }

    public bKK b(drX<? super AbstractC3179au, ? super Integer, dpR> drx) {
        h();
        super.d(drx);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bKK e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bKK a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKK a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bKK a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public RowModel.b b(ViewParent viewParent) {
        return new RowModel.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bKK) && super.equals(obj)) {
            bKK bkk = (bKK) obj;
            if ((this.b == null) != (bkk.b == null)) {
                return false;
            }
            if ((this.j == null) != (bkk.j == null)) {
                return false;
            }
            if ((this.g == null) != (bkk.g == null)) {
                return false;
            }
            if ((this.h == null) != (bkk.h == null)) {
                return false;
            }
            if (l() == null ? bkk.l() == null : l().equals(bkk.l())) {
                if (n() == null ? bkk.n() == null : n().equals(bkk.n())) {
                    if (o() == bkk.o() && k() == bkk.k()) {
                        if (i() == null ? bkk.i() == null : i().equals(bkk.i())) {
                            return (m() == null) == (bkk.m() == null);
                        }
                        return false;
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
        int i = this.b != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        int o2 = o();
        boolean k = k();
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + o2) * 31) + (k ? 1 : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "RowModel_{impressionInfo=" + l() + ", models=" + n() + ", listPos=" + o() + ", loading=" + k() + ", config=" + i() + "}" + super.toString();
    }
}
