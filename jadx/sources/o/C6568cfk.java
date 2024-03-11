package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6566cfi;

/* renamed from: o.cfk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6568cfk extends AbstractC6566cfi implements InterfaceC1673aK<AbstractC6566cfi.c>, InterfaceC6572cfo {
    private InterfaceC4414be<C6568cfk, AbstractC6566cfi.c> b;
    private InterfaceC4573bh<C6568cfk, AbstractC6566cfi.c> c;
    private InterfaceC4467bf<C6568cfk, AbstractC6566cfi.c> d;
    private InterfaceC4732bk<C6568cfk, AbstractC6566cfi.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6566cfi.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC6566cfi.c cVar, int i) {
        InterfaceC4467bf<C6568cfk, AbstractC6566cfi.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC6566cfi, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6566cfi.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C6568cfk, AbstractC6566cfi.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6566cfi.c cVar) {
        InterfaceC4732bk<C6568cfk, AbstractC6566cfi.c> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC6566cfi.c cVar) {
        InterfaceC4573bh<C6568cfk, AbstractC6566cfi.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) cVar);
    }

    @Override // o.InterfaceC6572cfo
    /* renamed from: a */
    public C6568cfk e(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C6568cfk e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6572cfo
    /* renamed from: b */
    public C6568cfk c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6568cfk a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6568cfk a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6566cfi.c b(ViewParent viewParent) {
        return new AbstractC6566cfi.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6568cfk) && super.equals(obj)) {
            C6568cfk c6568cfk = (C6568cfk) obj;
            if ((this.d == null) != (c6568cfk.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6568cfk.b == null)) {
                return false;
            }
            if ((this.j == null) != (c6568cfk.j == null)) {
                return false;
            }
            if ((this.c == null) != (c6568cfk.c == null)) {
                return false;
            }
            return (i() == null) == (c6568cfk.i() == null);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.c != null ? 1 : 0)) * 31) + (i() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CastSheetHelpButtonModel_{onClickListener=" + i() + "}" + super.toString();
    }
}
