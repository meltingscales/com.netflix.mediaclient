package o;

import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.bOB;

/* renamed from: o.bOz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3904bOz extends bOB implements InterfaceC1673aK<bOB.d>, InterfaceC3903bOy {
    private InterfaceC4467bf<C3904bOz, bOB.d> c;
    private InterfaceC4414be<C3904bOz, bOB.d> d;
    private InterfaceC4573bh<C3904bOz, bOB.d> g;
    private InterfaceC4732bk<C3904bOz, bOB.d> h;

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void e(C1511aE c1511aE, bOB.d dVar, int i) {
    }

    @Override // o.InterfaceC3903bOy
    public /* synthetic */ InterfaceC3903bOy a(List list) {
        return e((List<String>) list);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(bOB.d dVar, int i) {
        InterfaceC4467bf<C3904bOz, bOB.d> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, dVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(bOB.d dVar) {
        super.b((C3904bOz) dVar);
        InterfaceC4414be<C3904bOz, bOB.d> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, dVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void c(int i, bOB.d dVar) {
        InterfaceC4732bk<C3904bOz, bOB.d> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, dVar, i);
        }
        super.a(i, (int) dVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, bOB.d dVar) {
        InterfaceC4573bh<C3904bOz, bOB.d> interfaceC4573bh = this.g;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, dVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, dVar);
    }

    public C3904bOz e(List<String> list) {
        h();
        super.b_(list);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3904bOz e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3904bOz a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3904bOz a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C3904bOz a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bOB.d b(ViewParent viewParent) {
        return new bOB.d();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3904bOz) && super.equals(obj)) {
            C3904bOz c3904bOz = (C3904bOz) obj;
            if ((this.c == null) != (c3904bOz.c == null)) {
                return false;
            }
            if ((this.d == null) != (c3904bOz.d == null)) {
                return false;
            }
            if ((this.h == null) != (c3904bOz.h == null)) {
                return false;
            }
            if ((this.g == null) != (c3904bOz.g == null)) {
                return false;
            }
            return i() == null ? c3904bOz.i() == null : i().equals(c3904bOz.i());
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.c != null ? 1 : 0;
        int i2 = this.d != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (this.g == null ? 0 : 1)) * 31) + (i() != null ? i().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "GameBillboardTagsModel_{tags=" + i() + "}" + super.toString();
    }
}
