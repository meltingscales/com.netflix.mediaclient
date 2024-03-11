package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.cWN;

/* loaded from: classes5.dex */
public class cWO extends cWN implements InterfaceC1673aK<cWN.c>, cWP {
    private InterfaceC4467bf<cWO, cWN.c> b;
    private InterfaceC4414be<cWO, cWN.c> c;
    private InterfaceC4573bh<cWO, cWN.c> d;
    private InterfaceC4732bk<cWO, cWN.c> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, cWN.c cVar, int i) {
    }

    @Override // o.cWP
    public /* synthetic */ cWP b(InterfaceC4732bk interfaceC4732bk) {
        return d((InterfaceC4732bk<cWO, cWN.c>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(cWN.c cVar, int i) {
        InterfaceC4467bf<cWO, cWN.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.cWN, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(cWN.c cVar) {
        super.e(cVar);
        InterfaceC4414be<cWO, cWN.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, cWN.c cVar) {
        InterfaceC4732bk<cWO, cWN.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    public cWO d(InterfaceC4732bk<cWO, cWN.c> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, cWN.c cVar) {
        InterfaceC4573bh<cWO, cWN.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.cWP
    /* renamed from: f */
    public cWO d(String str) {
        h();
        super.ai_(str);
        return this;
    }

    @Override // o.cWP
    /* renamed from: c */
    public cWO e(String str) {
        h();
        super.ah_(str);
        return this;
    }

    @Override // o.cWP
    /* renamed from: f */
    public cWO e(Integer num) {
        h();
        super.c(num);
        return this;
    }

    @Override // o.cWP
    /* renamed from: a */
    public cWO b(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.cWP
    /* renamed from: i */
    public cWO a(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.cWP
    /* renamed from: d */
    public cWO c(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public cWO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cWP
    /* renamed from: d */
    public cWO e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public cWO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public cWO a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public cWN.c b(ViewParent viewParent) {
        return new cWN.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cWO) && super.equals(obj)) {
            cWO cwo = (cWO) obj;
            if ((this.b == null) != (cwo.b == null)) {
                return false;
            }
            if ((this.c == null) != (cwo.c == null)) {
                return false;
            }
            if ((this.i == null) != (cwo.i == null)) {
                return false;
            }
            if ((this.d == null) != (cwo.d == null)) {
                return false;
            }
            if (m() == null ? cwo.m() == null : m().equals(cwo.m())) {
                if (i() == null ? cwo.i() == null : i().equals(cwo.i())) {
                    if (n() == null ? cwo.n() == null : n().equals(cwo.n())) {
                        if (l() == null ? cwo.l() == null : l().equals(cwo.l())) {
                            if (o() == null ? cwo.o() == null : o().equals(cwo.o())) {
                                return (k() == null) == (cwo.k() == null);
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
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        int hashCode3 = i() != null ? i().hashCode() : 0;
        int hashCode4 = n() != null ? n().hashCode() : 0;
        int hashCode5 = l() != null ? l().hashCode() : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "UmaTooltipModel_{title=" + m() + ", description=" + i() + ", viewLocation=" + n() + ", icon=" + l() + ", trackingInfo=" + o() + ", onCloseButtonClick=" + k() + "}" + super.toString();
    }
}
