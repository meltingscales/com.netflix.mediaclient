package o;

import android.view.ViewParent;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import o.AbstractC3073as;
import o.bQX;

/* loaded from: classes4.dex */
public class bQW extends bQX implements InterfaceC1673aK<bQX.b>, bQT {
    private InterfaceC4467bf<bQW, bQX.b> b;
    private InterfaceC4573bh<bQW, bQX.b> c;
    private InterfaceC4414be<bQW, bQX.b> d;
    private InterfaceC4732bk<bQW, bQX.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, bQX.b bVar, int i) {
    }

    @Override // o.bQT
    public /* synthetic */ bQT c(drM drm) {
        return e((drM<? super String, dpR>) drm);
    }

    @Override // o.InterfaceC1673aK
    public void a(bQX.b bVar, int i) {
        InterfaceC4467bf<bQW, bQX.b> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.bQX, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bQX.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bQW, bQX.b> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bQX.b bVar) {
        InterfaceC4732bk<bQW, bQX.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bQX.b bVar) {
        InterfaceC4573bh<bQW, bQX.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bQT
    /* renamed from: i */
    public bQW b(int i) {
        h();
        super.n_(i);
        return this;
    }

    @Override // o.bQT
    /* renamed from: f */
    public bQW e(int i) {
        h();
        super.d(i);
        return this;
    }

    @Override // o.bQT
    /* renamed from: d */
    public bQW c(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.bQT
    /* renamed from: a */
    public bQW c(IdentityViewModel.a aVar) {
        h();
        super.e(aVar);
        return this;
    }

    public bQW e(drM<? super String, dpR> drm) {
        h();
        super.b(drm);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bQW e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bQT
    /* renamed from: e */
    public bQW b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bQW a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bQW a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public bQX.b b(ViewParent viewParent) {
        return new bQX.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bQW) && super.equals(obj)) {
            bQW bqw = (bQW) obj;
            if ((this.b == null) != (bqw.b == null)) {
                return false;
            }
            if ((this.d == null) != (bqw.d == null)) {
                return false;
            }
            if ((this.h == null) != (bqw.h == null)) {
                return false;
            }
            if ((this.c == null) == (bqw.c == null) && l() == bqw.l() && k() == bqw.k()) {
                if (o() == null ? bqw.o() == null : o().equals(bqw.o())) {
                    if (i() == null ? bqw.i() == null : i().equals(bqw.i())) {
                        return (m() == null) == (bqw.m() == null);
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
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        int l = l();
        int k = k();
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + l) * 31) + k) * 31) + hashCode2) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "InputHandleModel_{minLength=" + l() + ", maxLength=" + k() + ", handle=" + o() + ", checkHandleStatus=" + i() + "}" + super.toString();
    }
}
