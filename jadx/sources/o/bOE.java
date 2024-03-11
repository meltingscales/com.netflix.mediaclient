package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.bOG;

/* loaded from: classes4.dex */
public class bOE extends bOG implements InterfaceC1673aK<bOG.a>, bOF {
    private InterfaceC4467bf<bOE, bOG.a> b;
    private InterfaceC4414be<bOE, bOG.a> c;
    private InterfaceC4573bh<bOE, bOG.a> f;
    private InterfaceC4732bk<bOE, bOG.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bOG.a aVar, int i) {
    }

    @Override // o.bOF
    public /* synthetic */ bOF b(List list) {
        return c((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(bOG.a aVar, int i) {
        InterfaceC4467bf<bOE, bOG.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bOG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bOG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bOE, bOG.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bOG.a aVar) {
        InterfaceC4732bk<bOE, bOG.a> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bOG.a aVar) {
        InterfaceC4573bh<bOE, bOG.a> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.bOF
    /* renamed from: b */
    public bOE e(String str) {
        h();
        super.w_(str);
        return this;
    }

    @Override // o.bOF
    /* renamed from: c */
    public bOE d(String str) {
        h();
        super.a(str);
        return this;
    }

    public bOE c(List<String> list) {
        h();
        super.d(list);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bOE e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bOF
    /* renamed from: b */
    public bOE c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bOE a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bOE a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bOG.a b(ViewParent viewParent) {
        return new bOG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bOE) && super.equals(obj)) {
            bOE boe = (bOE) obj;
            if ((this.b == null) != (boe.b == null)) {
                return false;
            }
            if ((this.c == null) != (boe.c == null)) {
                return false;
            }
            if ((this.j == null) != (boe.j == null)) {
                return false;
            }
            if ((this.f == null) != (boe.f == null)) {
                return false;
            }
            if (i() == null ? boe.i() == null : i().equals(boe.i())) {
                if (l() == null ? boe.l() == null : l().equals(boe.l())) {
                    if (m() == null ? boe.m() == null : m().equals(boe.m())) {
                        return n() == null ? boe.n() == null : n().equals(boe.n());
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
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.f == null ? 0 : 1;
        int hashCode2 = i() != null ? i().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (n() != null ? n().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameTabletAndFoldBillboardContentModel_{gameId=" + i() + ", title=" + l() + ", iconImageUrl=" + m() + ", tags=" + n() + "}" + super.toString();
    }
}
