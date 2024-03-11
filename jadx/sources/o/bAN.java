package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import o.AbstractC3073as;
import o.bAH;

/* loaded from: classes4.dex */
public class bAN extends bAH implements InterfaceC1673aK<bAH.a>, bAJ {
    private InterfaceC4414be<bAN, bAH.a> g;
    private InterfaceC4467bf<bAN, bAH.a> h;
    private InterfaceC4732bk<bAN, bAH.a> i;
    private InterfaceC4573bh<bAN, bAH.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bAH.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bAH.a aVar, int i) {
        InterfaceC4467bf<bAN, bAH.a> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bAH, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bAH.a aVar) {
        super.e(aVar);
        InterfaceC4414be<bAN, bAH.a> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bAH.a aVar) {
        InterfaceC4732bk<bAN, bAH.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, bAH.a aVar) {
        InterfaceC4573bh<bAN, bAH.a> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.bAJ
    /* renamed from: j */
    public bAN e(CharSequence charSequence) {
        h();
        this.c = charSequence;
        return this;
    }

    @Override // o.bAJ
    /* renamed from: d */
    public bAN c(CharSequence charSequence) {
        h();
        ((bAH) this).b = charSequence;
        return this;
    }

    @Override // o.bAJ
    /* renamed from: a */
    public bAN d(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public bAN e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bAJ
    /* renamed from: g */
    public bAN b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public bAN a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bAJ
    /* renamed from: b */
    public bAN e(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bAH.a b(ViewParent viewParent) {
        return new bAH.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof bAN) && super.equals(obj)) {
            bAN ban = (bAN) obj;
            if ((this.h == null) != (ban.h == null)) {
                return false;
            }
            if ((this.g == null) != (ban.g == null)) {
                return false;
            }
            if ((this.i == null) != (ban.i == null)) {
                return false;
            }
            if ((this.j == null) != (ban.j == null)) {
                return false;
            }
            if (n() == null ? ban.n() == null : n().equals(ban.n())) {
                CharSequence charSequence = this.c;
                if (charSequence == null ? ban.c == null : charSequence.equals(ban.c)) {
                    CharSequence charSequence2 = ((bAH) this).b;
                    if (charSequence2 == null ? ((bAH) ban).b == null : charSequence2.equals(((bAH) ban).b)) {
                        if ((o() == null) != (ban.o() == null)) {
                            return false;
                        }
                        AppView appView = ((bAH) this).d;
                        if (appView == null ? ((bAH) ban).d == null : appView.equals(((bAH) ban).d)) {
                            return (((bAH) this).f == null) == (((bAH) ban).f == null);
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
        int i = this.h != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        CharSequence charSequence = this.c;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        CharSequence charSequence2 = ((bAH) this).b;
        int hashCode4 = charSequence2 != null ? charSequence2.hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        AppView appView = ((bAH) this).d;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i5) * 31) + (appView != null ? appView.hashCode() : 0)) * 31) + (((bAH) this).f != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CollectTasteLolomoMessageModel_{impressionInfo=" + n() + ", headline=" + ((Object) this.c) + ", body=" + ((Object) ((bAH) this).b) + ", onClick=" + o() + ", appView=" + ((bAH) this).d + ", trackingInfoHolder=" + ((bAH) this).f + "}" + super.toString();
    }
}
