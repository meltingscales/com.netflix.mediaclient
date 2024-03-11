package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7953dbI;

/* renamed from: o.dbM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7957dbM extends AbstractC7953dbI implements InterfaceC1673aK<AbstractC7953dbI.c>, InterfaceC7959dbO {
    private InterfaceC4573bh<C7957dbM, AbstractC7953dbI.c> b;
    private InterfaceC4414be<C7957dbM, AbstractC7953dbI.c> c;
    private InterfaceC4467bf<C7957dbM, AbstractC7953dbI.c> d;
    private InterfaceC4732bk<C7957dbM, AbstractC7953dbI.c> i;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC7953dbI.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC7953dbI.c cVar, int i) {
        InterfaceC4467bf<C7957dbM, AbstractC7953dbI.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC7953dbI, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC7953dbI.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C7957dbM, AbstractC7953dbI.c> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7953dbI.c cVar) {
        InterfaceC4732bk<C7957dbM, AbstractC7953dbI.c> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC7953dbI.c cVar) {
        InterfaceC4573bh<C7957dbM, AbstractC7953dbI.c> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7959dbO
    /* renamed from: c */
    public C7957dbM b(String str) {
        h();
        super.am_(str);
        return this;
    }

    @Override // o.InterfaceC7959dbO
    /* renamed from: a */
    public C7957dbM d(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.InterfaceC7959dbO
    /* renamed from: a */
    public C7957dbM c(View.OnClickListener onClickListener) {
        h();
        super.d(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7957dbM e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7959dbO
    /* renamed from: c */
    public C7957dbM d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7957dbM a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7957dbM a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC7953dbI.c b(ViewParent viewParent) {
        return new AbstractC7953dbI.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7957dbM) && super.equals(obj)) {
            C7957dbM c7957dbM = (C7957dbM) obj;
            if ((this.d == null) != (c7957dbM.d == null)) {
                return false;
            }
            if ((this.c == null) != (c7957dbM.c == null)) {
                return false;
            }
            if ((this.i == null) != (c7957dbM.i == null)) {
                return false;
            }
            if ((this.b == null) != (c7957dbM.b == null)) {
                return false;
            }
            if (o() == null ? c7957dbM.o() == null : o().equals(c7957dbM.o())) {
                if (m() == null ? c7957dbM.m() == null : m().equals(c7957dbM.m())) {
                    return (i() == null) == (c7957dbM.i() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (m() != null ? m().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TitleTreatmentV2Model_{titleTreatmentUrl=" + o() + ", textFallback=" + m() + ", onClick=" + i() + "}" + super.toString();
    }
}
