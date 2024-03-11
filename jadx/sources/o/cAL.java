package o;

import android.view.ViewParent;
import o.AbstractC3073as;
import o.cAK;

/* loaded from: classes4.dex */
public class cAL extends cAK implements InterfaceC1673aK<cAK.a>, cAM {
    private InterfaceC4732bk<cAL, cAK.a> f;
    private InterfaceC4414be<cAL, cAK.a> g;
    private InterfaceC4467bf<cAL, cAK.a> h;
    private InterfaceC4573bh<cAL, cAK.a> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, cAK.a aVar, int i) {
    }

    @Override // o.cAM
    public /* synthetic */ cAM a(InterfaceC4732bk interfaceC4732bk) {
        return d((InterfaceC4732bk<cAL, cAK.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(cAK.a aVar, int i) {
        InterfaceC4467bf<cAL, cAK.a> interfaceC4467bf = this.h;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.cAK, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(cAK.a aVar) {
        super.e(aVar);
        InterfaceC4414be<cAL, cAK.a> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, cAK.a aVar) {
        InterfaceC4732bk<cAL, cAK.a> interfaceC4732bk = this.f;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public cAL d(InterfaceC4732bk<cAL, cAK.a> interfaceC4732bk) {
        h();
        this.f = interfaceC4732bk;
        return this;
    }

    @Override // o.cAK, o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, cAK.a aVar) {
        InterfaceC4573bh<cAL, cAK.a> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.d(f, f2, i, i2, aVar);
    }

    @Override // o.cAM
    /* renamed from: e */
    public cAL b(C9935zP c9935zP) {
        h();
        ((cAK) this).b = c9935zP;
        return this;
    }

    @Override // o.cAM
    /* renamed from: c */
    public cAL b(C5528cAt c5528cAt) {
        h();
        ((cAK) this).d = c5528cAt;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cAL e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.cAM
    /* renamed from: d */
    public cAL e(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public cAL a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public cAL a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public cAK.a b(ViewParent viewParent) {
        return new cAK.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cAL) && super.equals(obj)) {
            cAL cal = (cAL) obj;
            if ((this.h == null) != (cal.h == null)) {
                return false;
            }
            if ((this.g == null) != (cal.g == null)) {
                return false;
            }
            if ((this.f == null) != (cal.f == null)) {
                return false;
            }
            if ((this.j == null) != (cal.j == null)) {
                return false;
            }
            if ((((cAK) this).b == null) != (((cAK) cal).b == null)) {
                return false;
            }
            C5528cAt c5528cAt = ((cAK) this).d;
            C5528cAt c5528cAt2 = ((cAK) cal).d;
            return c5528cAt == null ? c5528cAt2 == null : c5528cAt.equals(c5528cAt2);
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.h != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.f != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        int i5 = ((cAK) this).b == null ? 0 : 1;
        C5528cAt c5528cAt = ((cAK) this).d;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (c5528cAt != null ? c5528cAt.hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PostPlayPreviewsVideoModel_{eventBusFactory=" + ((cAK) this).b + ", previewVideoInfo=" + ((cAK) this).d + "}" + super.toString();
    }
}
