package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC5456bzB;

/* renamed from: o.bzG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5461bzG extends AbstractC5456bzB implements InterfaceC1673aK<AbstractC5456bzB.a>, InterfaceC5455bzA {
    private InterfaceC4573bh<C5461bzG, AbstractC5456bzB.a> b;
    private InterfaceC4467bf<C5461bzG, AbstractC5456bzB.a> c;
    private InterfaceC4414be<C5461bzG, AbstractC5456bzB.a> d;
    private InterfaceC4732bk<C5461bzG, AbstractC5456bzB.a> g;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC5456bzB.a aVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC5456bzB.a aVar, int i) {
        InterfaceC4467bf<C5461bzG, AbstractC5456bzB.a> interfaceC4467bf = this.c;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC5456bzB.a aVar) {
        super.b((C5461bzG) aVar);
        InterfaceC4414be<C5461bzG, AbstractC5456bzB.a> interfaceC4414be = this.d;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, AbstractC5456bzB.a aVar) {
        InterfaceC4732bk<C5461bzG, AbstractC5456bzB.a> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC5456bzB.a aVar) {
        InterfaceC4573bh<C5461bzG, AbstractC5456bzB.a> interfaceC4573bh = this.b;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) aVar);
    }

    @Override // o.InterfaceC5455bzA
    /* renamed from: a */
    public C5461bzG b(View.OnClickListener onClickListener) {
        h();
        super.e(onClickListener);
        return this;
    }

    @Override // o.InterfaceC5455bzA
    /* renamed from: b */
    public C5461bzG e(String str) {
        h();
        super.d(str);
        return this;
    }

    @Override // o.InterfaceC5455bzA
    /* renamed from: f */
    public C5461bzG c(String str) {
        h();
        super.a(str);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5461bzG e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC5455bzA
    /* renamed from: c */
    public C5461bzG d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C5461bzG a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C5461bzG a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC5456bzB.a b(ViewParent viewParent) {
        return new AbstractC5456bzB.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C5461bzG) && super.equals(obj)) {
            C5461bzG c5461bzG = (C5461bzG) obj;
            if ((this.c == null) != (c5461bzG.c == null)) {
                return false;
            }
            if ((this.d == null) != (c5461bzG.d == null)) {
                return false;
            }
            if ((this.g == null) != (c5461bzG.g == null)) {
                return false;
            }
            if ((this.b == null) != (c5461bzG.b == null)) {
                return false;
            }
            if ((k() == null) != (c5461bzG.k() == null)) {
                return false;
            }
            if (i() == null ? c5461bzG.i() == null : i().equals(c5461bzG.i())) {
                return o() == null ? c5461bzG.o() == null : o().equals(c5461bzG.o());
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
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.b != null ? 1 : 0;
        int i5 = k() == null ? 0 : 1;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "FieldEntryModel_{onClick=" + k() + ", displayText=" + i() + ", hint=" + o() + "}" + super.toString();
    }
}
