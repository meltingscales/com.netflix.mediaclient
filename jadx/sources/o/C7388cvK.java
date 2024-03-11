package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC7391cvN;

/* renamed from: o.cvK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7388cvK extends AbstractC7391cvN implements InterfaceC1673aK<AbstractC7391cvN.c>, InterfaceC7390cvM {
    private InterfaceC4467bf<C7388cvK, AbstractC7391cvN.c> b;
    private InterfaceC4573bh<C7388cvK, AbstractC7391cvN.c> c;
    private InterfaceC4414be<C7388cvK, AbstractC7391cvN.c> d;
    private InterfaceC4732bk<C7388cvK, AbstractC7391cvN.c> f;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, AbstractC7391cvN.c cVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void a(AbstractC7391cvN.c cVar, int i) {
        InterfaceC4467bf<C7388cvK, AbstractC7391cvN.c> interfaceC4467bf = this.b;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, cVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC7391cvN.c cVar) {
        super.b((C7388cvK) cVar);
        InterfaceC4414be<C7388cvK, AbstractC7391cvN.c> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, cVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC7391cvN.c cVar) {
        InterfaceC4732bk<C7388cvK, AbstractC7391cvN.c> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, cVar, i);
        }
        super.a(i, (int) cVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void d(float f, float f2, int i, int i2, AbstractC7391cvN.c cVar) {
        InterfaceC4573bh<C7388cvK, AbstractC7391cvN.c> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, cVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, cVar);
    }

    @Override // o.InterfaceC7390cvM
    /* renamed from: i */
    public C7388cvK e(float f) {
        h();
        super.b(f);
        return this;
    }

    @Override // o.InterfaceC7390cvM
    /* renamed from: f */
    public C7388cvK c(float f) {
        h();
        super.b_(f);
        return this;
    }

    @Override // o.InterfaceC7390cvM
    /* renamed from: g */
    public C7388cvK a(float f) {
        h();
        super.d(f);
        return this;
    }

    @Override // o.InterfaceC7390cvM
    /* renamed from: a */
    public C7388cvK b(boolean z) {
        h();
        super.e(z);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7388cvK e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC7390cvM
    /* renamed from: b */
    public C7388cvK e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7388cvK a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7388cvK a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC7391cvN.c b(ViewParent viewParent) {
        return new AbstractC7391cvN.c();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7388cvK) && super.equals(obj)) {
            C7388cvK c7388cvK = (C7388cvK) obj;
            if ((this.b == null) != (c7388cvK.b == null)) {
                return false;
            }
            if ((this.d == null) != (c7388cvK.d == null)) {
                return false;
            }
            if ((this.f == null) != (c7388cvK.f == null)) {
                return false;
            }
            return (this.c == null) == (c7388cvK.c == null) && Float.compare(c7388cvK.o(), o()) == 0 && Float.compare(c7388cvK.i(), i()) == 0 && Float.compare(c7388cvK.m(), m()) == 0 && k() == c7388cvK.k();
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.b != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.c == null ? 0 : 1;
        int floatToIntBits = o() != 0.0f ? Float.floatToIntBits(o()) : 0;
        return (((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + floatToIntBits) * 31) + (i() != 0.0f ? Float.floatToIntBits(i()) : 0)) * 31) + (m() != 0.0f ? Float.floatToIntBits(m()) : 0)) * 31) + (k() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedForYouSettingsStats_{used=" + o() + ", elected=" + i() + ", total=" + m() + ", enable=" + k() + "}" + super.toString();
    }
}
