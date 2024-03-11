package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJI;

/* loaded from: classes4.dex */
public class bJO extends bJI implements InterfaceC1673aK<bJI.c>, bJP {
    private InterfaceC4573bh<bJO, bJI.c> b;
    private InterfaceC4467bf<bJO, bJI.c> c;
    private InterfaceC4414be<bJO, bJI.c> d;
    private InterfaceC4732bk<bJO, bJI.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, bJI.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bJI.c cVar, int i) {
        InterfaceC4467bf<bJO, bJI.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.bJI, o.AbstractC3336ax, o.AbstractC3073as
    public void e(bJI.c cVar) {
        super.e(cVar);
        InterfaceC4414be<bJO, bJI.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, bJI.c cVar) {
        InterfaceC4732bk<bJO, bJI.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bJI.c cVar) {
        InterfaceC4573bh<bJO, bJI.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.bJP
    /* renamed from: b */
    public bJO e(View.OnClickListener onClickListener) {
        h();
        super.b_(onClickListener);
        return this;
    }

    @Override // o.bJP
    /* renamed from: e */
    public bJO b(Float f) {
        h();
        super.d(f);
        return this;
    }

    @Override // o.bJP
    /* renamed from: b */
    public bJO e(Drawable drawable) {
        h();
        super.d(drawable);
        return this;
    }

    @Override // o.bJP
    /* renamed from: b */
    public bJO e(Integer num) {
        h();
        super.d(num);
        return this;
    }

    @Override // o.bJP
    /* renamed from: c */
    public bJO e(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bJO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJP
    /* renamed from: c */
    public bJO d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public bJO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bJO a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bJI.c b(ViewParent viewParent) {
        return new bJI.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJO) && super.equals(obj)) {
            bJO bjo = (bJO) obj;
            if ((this.c == null) != (bjo.c == null)) {
                return false;
            }
            if ((this.d == null) != (bjo.d == null)) {
                return false;
            }
            if ((this.f == null) != (bjo.f == null)) {
                return false;
            }
            if ((this.b == null) != (bjo.b == null)) {
                return false;
            }
            if ((n() == null) != (bjo.n() == null)) {
                return false;
            }
            if (l() == null ? bjo.l() == null : l().equals(bjo.l())) {
                if (m() == null ? bjo.m() == null : m().equals(bjo.m())) {
                    if (i() == null ? bjo.i() == null : i().equals(bjo.i())) {
                        return o() == null ? bjo.o() == null : o().equals(bjo.o());
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int i5 = n() == null ? 0 : 1;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        int hashCode3 = m() != null ? m().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode2) * 31) + hashCode3) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FloatingActionButtonModel_{onClick=" + n() + ", elevation=" + l() + ", iconDrawable=" + m() + ", buttonColor=" + i() + ", contentDescription=" + o() + "}" + super.toString();
    }
}
