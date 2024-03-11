package o;

import android.icu.text.SimpleDateFormat;
import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7996dbz;

/* renamed from: o.dby  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7995dby extends AbstractC7996dbz implements InterfaceC1673aK<AbstractC7996dbz.a>, InterfaceC7945dbA {
    private InterfaceC4467bf<C7995dby, AbstractC7996dbz.a> d;
    private InterfaceC4732bk<C7995dby, AbstractC7996dbz.a> g;
    private InterfaceC4573bh<C7995dby, AbstractC7996dbz.a> h;
    private InterfaceC4414be<C7995dby, AbstractC7996dbz.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC7996dbz.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    public void a(AbstractC7996dbz.a aVar, int i) {
        InterfaceC4467bf<C7995dby, AbstractC7996dbz.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC7996dbz, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7996dbz.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C7995dby, AbstractC7996dbz.a> interfaceC4414be = this.j;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC7996dbz.a aVar) {
        InterfaceC4732bk<C7995dby, AbstractC7996dbz.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC7996dbz.a aVar) {
        InterfaceC4573bh<C7995dby, AbstractC7996dbz.a> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC7945dbA
    /* renamed from: c */
    public C7995dby b(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.InterfaceC7945dbA
    /* renamed from: d */
    public C7995dby b(SimpleDateFormat simpleDateFormat) {
        h();
        ((AbstractC7996dbz) this).b = simpleDateFormat;
        return this;
    }

    @Override // o.InterfaceC7945dbA
    /* renamed from: a */
    public C7995dby d(View.OnClickListener onClickListener) {
        h();
        super.l_(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7995dby e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7945dbA
    /* renamed from: b */
    public C7995dby d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7995dby a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7995dby a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7996dbz.a b(ViewParent viewParent) {
        return new AbstractC7996dbz.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7995dby) && super.equals(obj)) {
            C7995dby c7995dby = (C7995dby) obj;
            if ((this.d == null) != (c7995dby.d == null)) {
                return false;
            }
            if ((this.j == null) != (c7995dby.j == null)) {
                return false;
            }
            if ((this.g == null) != (c7995dby.g == null)) {
                return false;
            }
            if ((this.h == null) != (c7995dby.h == null)) {
                return false;
            }
            if (k() == null ? c7995dby.k() == null : k().equals(c7995dby.k())) {
                if ((((AbstractC7996dbz) this).b == null) != (((AbstractC7996dbz) c7995dby).b == null)) {
                    return false;
                }
                return (l() == null) == (c7995dby.l() == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.j != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = k() != null ? k().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (((AbstractC7996dbz) this).b != null ? 1 : 0)) * 31) + (l() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ReleaseCountdownModel_{releaseDate=" + k() + ", dateFormat=" + ((AbstractC7996dbz) this).b + ", onClick=" + l() + "}" + super.toString();
    }
}
