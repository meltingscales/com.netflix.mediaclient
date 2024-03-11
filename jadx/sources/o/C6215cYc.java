package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.cXZ;

/* renamed from: o.cYc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6215cYc extends cXZ implements InterfaceC1673aK<cXZ.b>, InterfaceC6214cYb {
    private InterfaceC4573bh<C6215cYc, cXZ.b> b;
    private InterfaceC4414be<C6215cYc, cXZ.b> c;
    private InterfaceC4467bf<C6215cYc, cXZ.b> d;
    private InterfaceC4732bk<C6215cYc, cXZ.b> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, cXZ.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(cXZ.b bVar, int i) {
        InterfaceC4467bf<C6215cYc, cXZ.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(cXZ.b bVar) {
        super.b((C6215cYc) bVar);
        InterfaceC4414be<C6215cYc, cXZ.b> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, cXZ.b bVar) {
        InterfaceC4732bk<C6215cYc, cXZ.b> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, cXZ.b bVar) {
        InterfaceC4573bh<C6215cYc, cXZ.b> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6215cYc e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6214cYb
    /* renamed from: c */
    public C6215cYc e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6215cYc a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C6215cYc a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public cXZ.b b(ViewParent viewParent) {
        return new cXZ.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6215cYc) && super.equals(obj)) {
            C6215cYc c6215cYc = (C6215cYc) obj;
            if ((this.d == null) != (c6215cYc.d == null)) {
                return false;
            }
            if ((this.c == null) != (c6215cYc.c == null)) {
                return false;
            }
            if ((this.j == null) != (c6215cYc.j == null)) {
                return false;
            }
            return (this.b == null) == (c6215cYc.b == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        return (((((((hashCode * 31) + i) * 31) + i2) * 31) + (this.j != null ? 1 : 0)) * 31) + (this.b == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FooterTextModel_{}" + super.toString();
    }
}
