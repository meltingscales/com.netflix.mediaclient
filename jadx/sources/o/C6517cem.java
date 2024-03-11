package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC6519ceo;

/* renamed from: o.cem  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6517cem extends AbstractC6519ceo implements InterfaceC1673aK<AbstractC6519ceo.a> {
    private InterfaceC4467bf<C6517cem, AbstractC6519ceo.a> b;
    private InterfaceC4573bh<C6517cem, AbstractC6519ceo.a> c;
    private InterfaceC4414be<C6517cem, AbstractC6519ceo.a> d;
    private InterfaceC4732bk<C6517cem, AbstractC6519ceo.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void e(C1511aE c1511aE, AbstractC6519ceo.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6519ceo.a aVar, int i) {
        InterfaceC4467bf<C6517cem, AbstractC6519ceo.a> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC6519ceo.a aVar) {
        super.b((C6517cem) aVar);
        InterfaceC4414be<C6517cem, AbstractC6519ceo.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC6519ceo.a aVar) {
        InterfaceC4732bk<C6517cem, AbstractC6519ceo.a> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC6519ceo.a aVar) {
        InterfaceC4573bh<C6517cem, AbstractC6519ceo.a> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    public C6517cem e(CharSequence charSequence) {
        h();
        super.d(charSequence);
        return this;
    }

    public C6517cem e(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6517cem e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6517cem a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6517cem a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6517cem a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6519ceo.a b(ViewParent viewParent) {
        return new AbstractC6519ceo.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6517cem) && super.equals(obj)) {
            C6517cem c6517cem = (C6517cem) obj;
            if ((this.b == null) != (c6517cem.b == null)) {
                return false;
            }
            if ((this.d == null) != (c6517cem.d == null)) {
                return false;
            }
            if ((this.j == null) != (c6517cem.j == null)) {
                return false;
            }
            if ((this.c == null) != (c6517cem.c == null)) {
                return false;
            }
            if (o() == null ? c6517cem.o() == null : o().equals(c6517cem.o())) {
                return (i() == null) == (c6517cem.i() == null);
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (o() != null ? o().hashCode() : 0)) * 31) + (i() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CwDialogTitleModel_{titleText=" + ((Object) o()) + ", closeClickListener=" + i() + "}" + super.toString();
    }
}
