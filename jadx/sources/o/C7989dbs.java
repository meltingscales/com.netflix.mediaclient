package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7990dbt;

/* renamed from: o.dbs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7989dbs extends AbstractC7990dbt implements InterfaceC1673aK<AbstractC7990dbt.b>, InterfaceC7992dbv {
    private InterfaceC4414be<C7989dbs, AbstractC7990dbt.b> b;
    private InterfaceC4467bf<C7989dbs, AbstractC7990dbt.b> d;
    private InterfaceC4573bh<C7989dbs, AbstractC7990dbt.b> h;
    private InterfaceC4732bk<C7989dbs, AbstractC7990dbt.b> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC7990dbt.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC7990dbt.b bVar, int i) {
        InterfaceC4467bf<C7989dbs, AbstractC7990dbt.b> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC7990dbt, o.bLN, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC7990dbt.b bVar) {
        super.e(bVar);
        InterfaceC4414be<C7989dbs, AbstractC7990dbt.b> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC7990dbt.b bVar) {
        InterfaceC4732bk<C7989dbs, AbstractC7990dbt.b> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC7990dbt.b bVar) {
        InterfaceC4573bh<C7989dbs, AbstractC7990dbt.b> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, bVar);
    }

    @Override // o.InterfaceC7992dbv
    /* renamed from: c */
    public C7989dbs e(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.InterfaceC7992dbv
    /* renamed from: d */
    public C7989dbs a(long j) {
        h();
        super.b(j);
        return this;
    }

    @Override // o.InterfaceC7992dbv
    /* renamed from: a */
    public C7989dbs d(bLZ blz) {
        h();
        super.c(blz);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7989dbs e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7992dbv
    /* renamed from: e */
    public C7989dbs c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7989dbs a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7989dbs a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7990dbt.b b(ViewParent viewParent) {
        return new AbstractC7990dbt.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7989dbs) && super.equals(obj)) {
            C7989dbs c7989dbs = (C7989dbs) obj;
            if ((this.d == null) != (c7989dbs.d == null)) {
                return false;
            }
            if ((this.b == null) != (c7989dbs.b == null)) {
                return false;
            }
            if ((this.i == null) != (c7989dbs.i == null)) {
                return false;
            }
            if ((this.h == null) != (c7989dbs.h == null)) {
                return false;
            }
            if (l() == null ? c7989dbs.l() == null : l().equals(c7989dbs.l())) {
                if (k() != c7989dbs.k()) {
                    return false;
                }
                return (n() == null) == (c7989dbs.n() == null);
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
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + ((int) (k() ^ (k() >>> 32)))) * 31) + (n() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FadingNetflixBadgeModel_{url=" + l() + ", delayBeforeHidingInMS=" + k() + ", playerSimpleStatusListenerManager=" + n() + "}" + super.toString();
    }
}
