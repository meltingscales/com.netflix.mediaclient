package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.AbstractC4084bVq;
import o.InterfaceC3825bMa;

/* renamed from: o.bVp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4083bVp extends AbstractC4084bVq implements InterfaceC1673aK<AbstractC4084bVq.d>, InterfaceC4085bVr {
    private InterfaceC4467bf<C4083bVp, AbstractC4084bVq.d> c;
    private InterfaceC4414be<C4083bVp, AbstractC4084bVq.d> d;
    private InterfaceC4732bk<C4083bVp, AbstractC4084bVq.d> h;
    private InterfaceC4573bh<C4083bVp, AbstractC4084bVq.d> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC4084bVq.d dVar, int i) {
    }

    @Override // o.InterfaceC4085bVr
    public /* synthetic */ InterfaceC4085bVr a(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C4083bVp, AbstractC4084bVq.d>) interfaceC4732bk);
    }

    @Override // o.InterfaceC4085bVr
    public /* synthetic */ InterfaceC4085bVr c(drO dro) {
        return a((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC4085bVr
    public /* synthetic */ InterfaceC4085bVr e(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C4083bVp, AbstractC4084bVq.d>) interfaceC4467bf);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC4084bVq.d dVar, int i) {
        InterfaceC4467bf<C4083bVp, AbstractC4084bVq.d> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    public C4083bVp a(InterfaceC4467bf<C4083bVp, AbstractC4084bVq.d> interfaceC4467bf) {
        h();
        this.c = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC4084bVq, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC4084bVq.d dVar) {
        super.e(dVar);
        InterfaceC4414be<C4083bVp, AbstractC4084bVq.d> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC4084bVq.d dVar) {
        InterfaceC4732bk<C4083bVp, AbstractC4084bVq.d> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    public C4083bVp b(InterfaceC4732bk<C4083bVp, AbstractC4084bVq.d> interfaceC4732bk) {
        h();
        this.h = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC4084bVq.d dVar) {
        InterfaceC4573bh<C4083bVp, AbstractC4084bVq.d> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) dVar);
    }

    @Override // o.InterfaceC4085bVr
    /* renamed from: d */
    public C4083bVp e(InterfaceC3825bMa.a aVar) {
        h();
        super.b(aVar);
        return this;
    }

    @Override // o.InterfaceC4085bVr
    /* renamed from: j */
    public C4083bVp d(String str) {
        h();
        super.c(str);
        return this;
    }

    @Override // o.InterfaceC4085bVr
    /* renamed from: b */
    public C4083bVp a(String str) {
        h();
        super.e(str);
        return this;
    }

    @Override // o.InterfaceC4085bVr
    /* renamed from: e */
    public C4083bVp d(View.OnClickListener onClickListener) {
        h();
        super.f_(onClickListener);
        return this;
    }

    public C4083bVp a(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC4084bVq) this).b = dro;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C4083bVp e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC4085bVr
    /* renamed from: c */
    public C4083bVp d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C4083bVp a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C4083bVp a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC4084bVq.d b(ViewParent viewParent) {
        return new AbstractC4084bVq.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4083bVp) && super.equals(obj)) {
            C4083bVp c4083bVp = (C4083bVp) obj;
            if ((this.c == null) != (c4083bVp.c == null)) {
                return false;
            }
            if ((this.d == null) != (c4083bVp.d == null)) {
                return false;
            }
            if ((this.h == null) != (c4083bVp.h == null)) {
                return false;
            }
            if ((this.j == null) != (c4083bVp.j == null)) {
                return false;
            }
            if (n() == null ? c4083bVp.n() == null : n().equals(c4083bVp.n())) {
                if (l() == null ? c4083bVp.l() == null : l().equals(c4083bVp.l())) {
                    if (s() == null ? c4083bVp.s() == null : s().equals(c4083bVp.s())) {
                        if (k() == null ? c4083bVp.k() == null : k().equals(c4083bVp.k())) {
                            if ((o() == null) != (c4083bVp.o() == null)) {
                                return false;
                            }
                            if ((((AbstractC4084bVq) this).b == null) != (((AbstractC4084bVq) c4083bVp).b == null)) {
                                return false;
                            }
                            return aj_() == null ? c4083bVp.aj_() == null : aj_().equals(c4083bVp.aj_());
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
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int hashCode2 = n() != null ? n().hashCode() : 0;
        int hashCode3 = l() != null ? l().hashCode() : 0;
        int hashCode4 = s() != null ? s().hashCode() : 0;
        int hashCode5 = k() != null ? k().hashCode() : 0;
        int i5 = o() != null ? 1 : 0;
        return (((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i5) * 31) + (((AbstractC4084bVq) this).b == null ? 0 : 1)) * 31) + (aj_() != null ? aj_().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "KidsCharacterBarItemModel_{impressionInfo=" + n() + ", aspectRatio=" + l() + ", title=" + s() + ", boxshotUrl=" + k() + ", onClick=" + o() + ", appView=" + aj_() + "}" + super.toString();
    }
}
