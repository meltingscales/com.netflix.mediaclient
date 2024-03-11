package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJG;

/* loaded from: classes4.dex */
public class bJM extends bJG implements InterfaceC1673aK<bJG.a>, bJD {
    private InterfaceC4467bf<bJM, bJG.a> b;
    private InterfaceC4573bh<bJM, bJG.a> c;
    private InterfaceC4414be<bJM, bJG.a> d;
    private InterfaceC4732bk<bJM, bJG.a> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bJG.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bJG.a aVar, int i) {
        InterfaceC4467bf<bJM, bJG.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bJG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bJG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bJM, bJG.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bJG.a aVar) {
        InterfaceC4732bk<bJM, bJG.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bJG.a aVar) {
        InterfaceC4573bh<bJM, bJG.a> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.bJD
    /* renamed from: g */
    public bJM c(CharSequence charSequence) {
        h();
        super.w_(charSequence);
        return this;
    }

    @Override // o.bJD
    /* renamed from: j */
    public bJM d(CharSequence charSequence) {
        h();
        super.x_(charSequence);
        return this;
    }

    @Override // o.bJD
    /* renamed from: b */
    public bJM a(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bJM e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJD
    /* renamed from: e */
    public bJM b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bJD
    /* renamed from: b */
    public bJM d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public bJM a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bJG.a b(ViewParent viewParent) {
        return new bJG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bJM) && super.equals(obj)) {
            bJM bjm = (bJM) obj;
            if ((this.b == null) != (bjm.b == null)) {
                return false;
            }
            if ((this.d == null) != (bjm.d == null)) {
                return false;
            }
            if ((this.g == null) != (bjm.g == null)) {
                return false;
            }
            if ((this.c == null) == (bjm.c == null) && l() == bjm.l()) {
                if (o() == null ? bjm.o() == null : o().equals(bjm.o())) {
                    if (t() == null ? bjm.t() == null : t().equals(bjm.t())) {
                        return (k() == null) == (bjm.k() == null);
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        boolean l = l();
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (l ? 1 : 0)) * 31) + hashCode2) * 31) + (t() != null ? t().hashCode() : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ErrorModel_{lightTheme=" + l() + ", message=" + ((Object) o()) + ", retryLabel=" + ((Object) t()) + ", onRetryClick=" + k() + "}" + super.toString();
    }
}
