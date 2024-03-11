package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.bIV;

/* renamed from: o.bJb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3745bJb extends bIV implements InterfaceC1673aK<bIV.a>, bIU {
    private InterfaceC4467bf<C3745bJb, bIV.a> b;
    private InterfaceC4414be<C3745bJb, bIV.a> c;
    private InterfaceC4573bh<C3745bJb, bIV.a> d;
    private InterfaceC4732bk<C3745bJb, bIV.a> g;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, bIV.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(bIV.a aVar, int i) {
        InterfaceC4467bf<C3745bJb, bIV.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(bIV.a aVar) {
        super.b((C3745bJb) aVar);
        InterfaceC4414be<C3745bJb, bIV.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bIV.a aVar) {
        InterfaceC4732bk<C3745bJb, bIV.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, bIV.a aVar) {
        InterfaceC4573bh<C3745bJb, bIV.a> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3745bJb e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.bIU
    /* renamed from: e */
    public C3745bJb d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C3745bJb a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.bIU
    /* renamed from: e */
    public C3745bJb b(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public bIV.a b(ViewParent viewParent) {
        return new bIV.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3745bJb) && super.equals(obj)) {
            C3745bJb c3745bJb = (C3745bJb) obj;
            if ((this.b == null) != (c3745bJb.b == null)) {
                return false;
            }
            if ((this.c == null) != (c3745bJb.c == null)) {
                return false;
            }
            if ((this.g == null) != (c3745bJb.g == null)) {
                return false;
            }
            return (this.d == null) == (c3745bJb.d == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.g != null ? 1 : 0)) * 31) + (this.d == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ViewDownloadsButtonModel_{}" + super.toString();
    }
}
