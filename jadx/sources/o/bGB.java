package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.AbstractC3686bGx;

/* loaded from: classes4.dex */
public class bGB extends AbstractC3686bGx implements InterfaceC1673aK<AbstractC3686bGx.e>, InterfaceC3687bGy {
    private InterfaceC4467bf<bGB, AbstractC3686bGx.e> b;
    private InterfaceC4573bh<bGB, AbstractC3686bGx.e> c;
    private InterfaceC4414be<bGB, AbstractC3686bGx.e> d;
    private InterfaceC4732bk<bGB, AbstractC3686bGx.e> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC3686bGx.e eVar, int i) {
    }

    @Override // o.InterfaceC3687bGy
    public /* synthetic */ InterfaceC3687bGy e(List list) {
        return a((List<? extends InterfaceC5227bul>) list);
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC3686bGx.e eVar, int i) {
        InterfaceC4467bf<bGB, AbstractC3686bGx.e> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3686bGx.e eVar) {
        super.b((bGB) eVar);
        InterfaceC4414be<bGB, AbstractC3686bGx.e> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC3686bGx.e eVar) {
        InterfaceC4732bk<bGB, AbstractC3686bGx.e> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC3686bGx.e eVar) {
        InterfaceC4573bh<bGB, AbstractC3686bGx.e> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3687bGy
    /* renamed from: c */
    public bGB b(String str) {
        h();
        super.b_(str);
        return this;
    }

    public bGB a(List<? extends InterfaceC5227bul> list) {
        h();
        super.b(list);
        return this;
    }

    @Override // o.InterfaceC3687bGy
    /* renamed from: a */
    public bGB d(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.InterfaceC3687bGy
    /* renamed from: d */
    public bGB b(int i) {
        h();
        super.e(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bGB e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3687bGy
    /* renamed from: b */
    public bGB d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bGB a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bGB a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3686bGx.e b(ViewParent viewParent) {
        return new AbstractC3686bGx.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bGB) && super.equals(obj)) {
            bGB bgb = (bGB) obj;
            if ((this.b == null) != (bgb.b == null)) {
                return false;
            }
            if ((this.d == null) != (bgb.d == null)) {
                return false;
            }
            if ((this.i == null) != (bgb.i == null)) {
                return false;
            }
            if ((this.c == null) != (bgb.c == null)) {
                return false;
            }
            if (m() == null ? bgb.m() == null : m().equals(bgb.m())) {
                if (l() == null ? bgb.l() == null : l().equals(bgb.l())) {
                    if (o() == null ? bgb.o() == null : o().equals(bgb.o())) {
                        return i() == bgb.i();
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
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.c == null ? 0 : 1;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (l() != null ? l().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + i();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DpCtaSeasonDownloadButtonModel_{playableId=" + m() + ", episodesList=" + l() + ", seasonLabel=" + o() + ", episodeNumber=" + i() + "}" + super.toString();
    }
}
