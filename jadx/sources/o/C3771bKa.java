package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.bJW;

/* renamed from: o.bKa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3771bKa extends bJW implements InterfaceC1673aK<bJW.b>, bJV {
    private InterfaceC4414be<C3771bKa, bJW.b> b;
    private InterfaceC4467bf<C3771bKa, bJW.b> c;
    private InterfaceC4573bh<C3771bKa, bJW.b> d;
    private InterfaceC4732bk<C3771bKa, bJW.b> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bJW.b bVar, int i) {
    }

    @Override // o.bJV
    public /* synthetic */ bJV b(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C3771bKa, bJW.b>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    public void a(bJW.b bVar, int i) {
        InterfaceC4467bf<C3771bKa, bJW.b> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    public C3771bKa a(InterfaceC4467bf<C3771bKa, bJW.b> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.bJW, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bJW.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C3771bKa, bJW.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bJW.b bVar) {
        InterfaceC4732bk<C3771bKa, bJW.b> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bJW.b bVar) {
        InterfaceC4573bh<C3771bKa, bJW.b> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.bJV
    /* renamed from: c */
    public C3771bKa b(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.bJV
    /* renamed from: b */
    public C3771bKa c(Integer num) {
        h();
        super.f_(num);
        return this;
    }

    @Override // o.bJV
    /* renamed from: c */
    public C3771bKa d(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.bJV
    /* renamed from: e */
    public C3771bKa d(String str) {
        h();
        super.b(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3771bKa e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bJV
    /* renamed from: c */
    public C3771bKa e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.bJV
    /* renamed from: c */
    public C3771bKa d(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3771bKa a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bJW.b b(ViewParent viewParent) {
        return new bJW.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3771bKa) && super.equals(obj)) {
            C3771bKa c3771bKa = (C3771bKa) obj;
            if ((this.c == null) != (c3771bKa.c == null)) {
                return false;
            }
            if ((this.b == null) != (c3771bKa.b == null)) {
                return false;
            }
            if ((this.h == null) != (c3771bKa.h == null)) {
                return false;
            }
            if ((this.d == null) != (c3771bKa.d == null)) {
                return false;
            }
            if ((l() == null) != (c3771bKa.l() == null)) {
                return false;
            }
            if (i() == null ? c3771bKa.i() == null : i().equals(c3771bKa.i())) {
                if (n() != c3771bKa.n()) {
                    return false;
                }
                return o() == null ? c3771bKa.o() == null : o().equals(c3771bKa.o());
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int i5 = l() == null ? 0 : 1;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (n() ? 1 : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ImageButtonModel_{onClick=" + l() + ", imageDrawableId=" + i() + ", enabled=" + n() + ", contentDescription=" + o() + "}" + super.toString();
    }
}
