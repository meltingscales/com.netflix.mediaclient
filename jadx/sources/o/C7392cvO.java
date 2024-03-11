package o;

import android.view.ViewParent;
import android.widget.CompoundButton;
import o.AbstractC3073as;
import o.AbstractC7389cvL;

/* renamed from: o.cvO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7392cvO extends AbstractC7389cvL implements InterfaceC1673aK<AbstractC7389cvL.b>, InterfaceC7395cvR {
    private InterfaceC4414be<C7392cvO, AbstractC7389cvL.b> b;
    private InterfaceC4573bh<C7392cvO, AbstractC7389cvL.b> c;
    private InterfaceC4467bf<C7392cvO, AbstractC7389cvL.b> d;
    private InterfaceC4732bk<C7392cvO, AbstractC7389cvL.b> g;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC7389cvL.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC7389cvL.b bVar, int i) {
        InterfaceC4467bf<C7392cvO, AbstractC7389cvL.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(AbstractC7389cvL.b bVar) {
        super.b((C7392cvO) bVar);
        InterfaceC4414be<C7392cvO, AbstractC7389cvL.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC7389cvL.b bVar) {
        InterfaceC4732bk<C7392cvO, AbstractC7389cvL.b> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC7389cvL.b bVar) {
        InterfaceC4573bh<C7392cvO, AbstractC7389cvL.b> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: i */
    public C7392cvO c(boolean z) {
        h();
        super.E_(z);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: f */
    public C7392cvO d(boolean z) {
        h();
        super.D_(z);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: j */
    public C7392cvO b(boolean z) {
        h();
        super.F_(z);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: a */
    public C7392cvO e(boolean z) {
        h();
        super.C_(z);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: a */
    public C7392cvO b(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.e(onCheckedChangeListener);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: d */
    public C7392cvO c(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        h();
        super.a_(onCheckedChangeListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7392cvO e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7395cvR
    /* renamed from: d */
    public C7392cvO b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7392cvO a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7392cvO a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public AbstractC7389cvL.b b(ViewParent viewParent) {
        return new AbstractC7389cvL.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7392cvO) && super.equals(obj)) {
            C7392cvO c7392cvO = (C7392cvO) obj;
            if ((this.d == null) != (c7392cvO.d == null)) {
                return false;
            }
            if ((this.b == null) != (c7392cvO.b == null)) {
                return false;
            }
            if ((this.g == null) != (c7392cvO.g == null)) {
                return false;
            }
            if ((this.c == null) == (c7392cvO.c == null) && m() == c7392cvO.m() && n() == c7392cvO.n() && o() == c7392cvO.o() && i() == c7392cvO.i()) {
                if ((k() == null) != (c7392cvO.k() == null)) {
                    return false;
                }
                return (l() == null) == (c7392cvO.l() == null);
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c != null ? 1 : 0;
        boolean m = m();
        boolean n = n();
        boolean o2 = o();
        boolean i5 = i();
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (m ? 1 : 0)) * 31) + (n ? 1 : 0)) * 31) + (o2 ? 1 : 0)) * 31) + (i5 ? 1 : 0)) * 31) + (k() != null ? 1 : 0)) * 31) + (l() == null ? 0 : 1);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedForYouSettingsTop_{nextEpisodeEnabled=" + m() + ", downloadedForYouOptedIn=" + n() + ", smartDownloadsEligibleForPlan=" + o() + ", downloadForYouEligibleForPlan=" + i() + ", nextEpisodeListener=" + k() + ", downloadedForYouListener=" + l() + "}" + super.toString();
    }
}
