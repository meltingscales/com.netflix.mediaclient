package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import o.AbstractC3073as;
import o.bAL;

/* loaded from: classes4.dex */
public class bAS extends bAL implements InterfaceC1673aK<bAL.b>, bAM {
    private InterfaceC4732bk<bAS, bAL.b> k;
    private InterfaceC4414be<bAS, bAL.b> l;
    private InterfaceC4573bh<bAS, bAL.b> m;
    private InterfaceC4467bf<bAS, bAL.b> n;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bAL.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bAL.b bVar, int i) {
        InterfaceC4467bf<bAS, bAL.b> interfaceC4467bf = this.n;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.bAL, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bAL.b bVar) {
        super.e(bVar);
        InterfaceC4414be<bAS, bAL.b> interfaceC4414be = this.l;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.bAL, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, bAL.b bVar) {
        InterfaceC4732bk<bAS, bAL.b> interfaceC4732bk = this.k;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.c(i, bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bAL.b bVar) {
        InterfaceC4573bh<bAS, bAL.b> interfaceC4573bh = this.m;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bAM
    /* renamed from: f */
    public bAS d(CharSequence charSequence) {
        h();
        ((bAL) this).i = charSequence;
        return this;
    }

    @Override // o.bAM
    /* renamed from: j */
    public bAS b(CharSequence charSequence) {
        h();
        ((bAL) this).d = charSequence;
        return this;
    }

    @Override // o.bAM
    /* renamed from: h */
    public bAS c(CharSequence charSequence) {
        h();
        ((bAL) this).h = charSequence;
        return this;
    }

    @Override // o.bAM
    /* renamed from: c */
    public bAS a(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.bAM
    /* renamed from: j */
    public bAS e(String str) {
        h();
        ((bAL) this).g = str;
        return this;
    }

    @Override // o.bAM
    /* renamed from: c */
    public bAS b(String str) {
        h();
        ((bAL) this).j = str;
        return this;
    }

    @Override // o.bAM
    /* renamed from: a */
    public bAS d(String str) {
        h();
        ((bAL) this).b = str;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bAS e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bAM
    /* renamed from: i */
    public bAS e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public bAS a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bAM
    /* renamed from: b */
    public bAS e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bAL.b b(ViewParent viewParent) {
        return new bAL.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bAS) && super.equals(obj)) {
            bAS bas = (bAS) obj;
            if ((this.n == null) != (bas.n == null)) {
                return false;
            }
            if ((this.l == null) != (bas.l == null)) {
                return false;
            }
            if ((this.k == null) != (bas.k == null)) {
                return false;
            }
            if ((this.m == null) != (bas.m == null)) {
                return false;
            }
            if (n() == null ? bas.n() == null : n().equals(bas.n())) {
                CharSequence charSequence = ((bAL) this).i;
                if (charSequence == null ? ((bAL) bas).i == null : charSequence.equals(((bAL) bas).i)) {
                    CharSequence charSequence2 = ((bAL) this).d;
                    if (charSequence2 == null ? ((bAL) bas).d == null : charSequence2.equals(((bAL) bas).d)) {
                        CharSequence charSequence3 = ((bAL) this).h;
                        if (charSequence3 == null ? ((bAL) bas).h == null : charSequence3.equals(((bAL) bas).h)) {
                            if ((t() == null) != (bas.t() == null)) {
                                return false;
                            }
                            AppView appView = this.c;
                            if (appView == null ? bas.c == null : appView.equals(bas.c)) {
                                if ((((bAL) this).f == null) != (((bAL) bas).f == null)) {
                                    return false;
                                }
                                String str = ((bAL) this).g;
                                if (str == null ? ((bAL) bas).g == null : str.equals(((bAL) bas).g)) {
                                    String str2 = ((bAL) this).j;
                                    if (str2 == null ? ((bAL) bas).j == null : str2.equals(((bAL) bas).j)) {
                                        String str3 = ((bAL) this).b;
                                        String str4 = ((bAL) bas).b;
                                        return str3 == null ? str4 == null : str3.equals(str4);
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
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.n != null ? 1 : 0;
        int i2 = this.l != null ? 1 : 0;
        int i3 = this.k != null ? 1 : 0;
        int i4 = this.m != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        CharSequence charSequence = ((bAL) this).i;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        CharSequence charSequence2 = ((bAL) this).d;
        int hashCode4 = charSequence2 != null ? charSequence2.hashCode() : 0;
        CharSequence charSequence3 = ((bAL) this).h;
        int hashCode5 = charSequence3 != null ? charSequence3.hashCode() : 0;
        int i5 = t() != null ? 1 : 0;
        AppView appView = this.c;
        int hashCode6 = appView != null ? appView.hashCode() : 0;
        int i6 = ((bAL) this).f == null ? 0 : 1;
        String str = ((bAL) this).g;
        int hashCode7 = str != null ? str.hashCode() : 0;
        String str2 = ((bAL) this).j;
        int hashCode8 = str2 != null ? str2.hashCode() : 0;
        String str3 = ((bAL) this).b;
        return (((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i5) * 31) + hashCode6) * 31) + i6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CollectTasteLolomoModel_{impressionInfo=" + n() + ", headline=" + ((Object) ((bAL) this).i) + ", body=" + ((Object) ((bAL) this).d) + ", cta=" + ((Object) ((bAL) this).h) + ", onClick=" + t() + ", appView=" + this.c + ", trackingInfoHolder=" + ((bAL) this).f + ", topTitleCardUrl=" + ((bAL) this).g + ", middleTitleCardUrl=" + ((bAL) this).j + ", bottomTitleCardUrl=" + ((bAL) this).b + "}" + super.toString();
    }
}
