package o;

import android.view.ViewParent;
import com.netflix.cl.model.AppView;
import o.AbstractC3073as;
import o.AbstractC7394cvQ;
import o.InterfaceC7407cvd;

/* renamed from: o.cvT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7397cvT extends AbstractC7394cvQ implements InterfaceC1673aK<AbstractC7394cvQ.d>, InterfaceC7399cvV {
    private InterfaceC4414be<C7397cvT, AbstractC7394cvQ.d> g;
    private InterfaceC4467bf<C7397cvT, AbstractC7394cvQ.d> i;
    private InterfaceC4573bh<C7397cvT, AbstractC7394cvQ.d> j;
    private InterfaceC4732bk<C7397cvT, AbstractC7394cvQ.d> m;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC7394cvQ.d dVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC7394cvQ.d dVar, int i) {
        InterfaceC4467bf<C7397cvT, AbstractC7394cvQ.d> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC7394cvQ, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(AbstractC7394cvQ.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C7397cvT, AbstractC7394cvQ.d> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7394cvQ.d dVar) {
        InterfaceC4732bk<C7397cvT, AbstractC7394cvQ.d> interfaceC4732bk = this.m;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC7394cvQ.d dVar) {
        InterfaceC4573bh<C7397cvT, AbstractC7394cvQ.d> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    @Override // o.InterfaceC7399cvV
    /* renamed from: e */
    public C7397cvT d(InterfaceC7407cvd.d dVar) {
        h();
        ((AbstractC7394cvQ) this).f = dVar;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C7397cvT e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7399cvV
    /* renamed from: e */
    public C7397cvT d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7397cvT a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7397cvT a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7394cvQ.d b(ViewParent viewParent) {
        return new AbstractC7394cvQ.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7397cvT) && super.equals(obj)) {
            C7397cvT c7397cvT = (C7397cvT) obj;
            if ((this.i == null) != (c7397cvT.i == null)) {
                return false;
            }
            if ((this.g == null) != (c7397cvT.g == null)) {
                return false;
            }
            if ((this.m == null) != (c7397cvT.m == null)) {
                return false;
            }
            if ((this.j == null) != (c7397cvT.j == null)) {
                return false;
            }
            AppView appView = this.c;
            if (appView == null ? c7397cvT.c == null : appView.equals(c7397cvT.c)) {
                if ((((AbstractC7394cvQ) this).h == null) != (((AbstractC7394cvQ) c7397cvT).h == null)) {
                    return false;
                }
                if (n() == null ? c7397cvT.n() == null : n().equals(c7397cvT.n())) {
                    InterfaceC7407cvd.d dVar = ((AbstractC7394cvQ) this).f;
                    InterfaceC7407cvd.d dVar2 = ((AbstractC7394cvQ) c7397cvT).f;
                    return dVar == null ? dVar2 == null : dVar.equals(dVar2);
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
        int i = this.i != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.m != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        AppView appView = this.c;
        int hashCode2 = appView != null ? appView.hashCode() : 0;
        int i5 = ((AbstractC7394cvQ) this).h == null ? 0 : 1;
        int hashCode3 = n() != null ? n().hashCode() : 0;
        InterfaceC7407cvd.d dVar = ((AbstractC7394cvQ) this).f;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + i5) * 31) + hashCode3) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadsForYouRowHeaderModel_{appView=" + this.c + ", impressionInfo=" + n() + ", asset=" + ((AbstractC7394cvQ) this).f + "}" + super.toString();
    }
}
