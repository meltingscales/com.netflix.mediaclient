package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7215crx;

/* renamed from: o.crA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7166crA extends AbstractC7215crx implements InterfaceC1673aK<AbstractC7215crx.c>, InterfaceC7217crz {
    private InterfaceC4414be<C7166crA, AbstractC7215crx.c> b;
    private InterfaceC4467bf<C7166crA, AbstractC7215crx.c> d;
    private InterfaceC4573bh<C7166crA, AbstractC7215crx.c> h;
    private InterfaceC4732bk<C7166crA, AbstractC7215crx.c> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7215crx.c cVar, int i) {
    }

    @Override // o.InterfaceC7217crz
    public /* synthetic */ InterfaceC7217crz d(InterfaceC4467bf interfaceC4467bf) {
        return a((InterfaceC4467bf<C7166crA, AbstractC7215crx.c>) interfaceC4467bf);
    }

    @Override // o.InterfaceC7217crz
    public /* synthetic */ InterfaceC7217crz d(InterfaceC4732bk interfaceC4732bk) {
        return b((InterfaceC4732bk<C7166crA, AbstractC7215crx.c>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC7215crx.c cVar, int i) {
        InterfaceC4467bf<C7166crA, AbstractC7215crx.c> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    public C7166crA a(InterfaceC4467bf<C7166crA, AbstractC7215crx.c> interfaceC4467bf) {
        h();
        this.d = interfaceC4467bf;
        return this;
    }

    @Override // o.AbstractC7215crx, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7215crx.c cVar) {
        super.e(cVar);
        InterfaceC4414be<C7166crA, AbstractC7215crx.c> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, AbstractC7215crx.c cVar) {
        InterfaceC4732bk<C7166crA, AbstractC7215crx.c> interfaceC4732bk = this.j;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    public C7166crA b(InterfaceC4732bk<C7166crA, AbstractC7215crx.c> interfaceC4732bk) {
        h();
        this.j = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7215crx.c cVar) {
        InterfaceC4573bh<C7166crA, AbstractC7215crx.c> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: i */
    public C7166crA d(View.OnClickListener onClickListener) {
        h();
        super.b(onClickListener);
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: j */
    public C7166crA c(View.OnClickListener onClickListener) {
        h();
        super.k_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: a */
    public C7166crA e(View.OnClickListener onClickListener) {
        h();
        super.j_(onClickListener);
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: c */
    public C7166crA d(C7201crj c7201crj) {
        h();
        this.c = c7201crj;
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: j */
    public C7166crA d(int i) {
        h();
        super.t_(i);
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: c */
    public C7166crA b(int i) {
        h();
        super.s_(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C7166crA e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7217crz
    /* renamed from: e */
    public C7166crA c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7166crA a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7166crA a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC7215crx.c b(ViewParent viewParent) {
        return new AbstractC7215crx.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7166crA) && super.equals(obj)) {
            C7166crA c7166crA = (C7166crA) obj;
            if ((this.d == null) != (c7166crA.d == null)) {
                return false;
            }
            if ((this.b == null) != (c7166crA.b == null)) {
                return false;
            }
            if ((this.j == null) != (c7166crA.j == null)) {
                return false;
            }
            if ((this.h == null) != (c7166crA.h == null)) {
                return false;
            }
            if ((k() == null) != (c7166crA.k() == null)) {
                return false;
            }
            if ((n() == null) != (c7166crA.n() == null)) {
                return false;
            }
            if ((i() == null) != (c7166crA.i() == null)) {
                return false;
            }
            C7201crj c7201crj = this.c;
            if (c7201crj == null ? c7166crA.c == null : c7201crj.equals(c7166crA.c)) {
                return m() == c7166crA.m() && o() == c7166crA.o();
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.j != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int i5 = k() != null ? 1 : 0;
        int i6 = n() != null ? 1 : 0;
        int i7 = i() == null ? 0 : 1;
        C7201crj c7201crj = this.c;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (c7201crj != null ? c7201crj.hashCode() : 0)) * 31) + m()) * 31) + o();
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "NuxCarouselCardItemV2Model_{onPrimaryCTAOnClick=" + k() + ", onSecondaryCTAOnClick=" + n() + ", containerOnClick=" + i() + ", nux=" + this.c + ", numPages=" + m() + ", currentPage=" + o() + "}" + super.toString();
    }
}
