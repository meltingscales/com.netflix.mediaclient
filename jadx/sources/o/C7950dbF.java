package o;

import android.view.View;
import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.AbstractC7947dbC;

/* renamed from: o.dbF  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7950dbF extends AbstractC7947dbC implements InterfaceC1673aK<AbstractC7947dbC.c>, InterfaceC7948dbD {
    private InterfaceC4414be<C7950dbF, AbstractC7947dbC.c> b;
    private InterfaceC4467bf<C7950dbF, AbstractC7947dbC.c> c;
    private InterfaceC4573bh<C7950dbF, AbstractC7947dbC.c> d;
    private InterfaceC4732bk<C7950dbF, AbstractC7947dbC.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7947dbC.c cVar, int i) {
    }

    @Override // o.InterfaceC7948dbD
    public /* synthetic */ InterfaceC7948dbD b(List list) {
        return a((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7947dbC.c cVar, int i) {
        InterfaceC4467bf<C7950dbF, AbstractC7947dbC.c> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC7947dbC, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC7947dbC.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C7950dbF, AbstractC7947dbC.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, AbstractC7947dbC.c cVar) {
        InterfaceC4732bk<C7950dbF, AbstractC7947dbC.c> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, AbstractC7947dbC.c cVar) {
        InterfaceC4573bh<C7950dbF, AbstractC7947dbC.c> interfaceC4573bh = this.d;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    public C7950dbF a(List<String> list) {
        h();
        super.c(list);
        return this;
    }

    @Override // o.InterfaceC7948dbD
    /* renamed from: a */
    public C7950dbF d(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7950dbF e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7948dbD
    /* renamed from: d */
    public C7950dbF b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC7948dbD
    /* renamed from: e */
    public C7950dbF b(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7950dbF a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC7947dbC.c b(ViewParent viewParent) {
        return new AbstractC7947dbC.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7950dbF) && super.equals(obj)) {
            C7950dbF c7950dbF = (C7950dbF) obj;
            if ((this.c == null) != (c7950dbF.c == null)) {
                return false;
            }
            if ((this.b == null) != (c7950dbF.b == null)) {
                return false;
            }
            if ((this.j == null) != (c7950dbF.j == null)) {
                return false;
            }
            if ((this.d == null) != (c7950dbF.d == null)) {
                return false;
            }
            if (m() == null ? c7950dbF.m() == null : m().equals(c7950dbF.m())) {
                if ((i() == null) != (c7950dbF.i() == null)) {
                    return false;
                }
                return (k() == null) == (c7950dbF.k() == null);
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
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.d != null ? 1 : 0;
        int hashCode2 = m() != null ? m().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (i() != null ? 1 : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "TappableTagsModel_{tags=" + m() + ", onClick=" + i() + ", onTagClick=" + k() + "}" + super.toString();
    }
}
