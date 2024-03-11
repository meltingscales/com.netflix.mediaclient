package o;

import android.view.View;
import android.view.ViewParent;
import com.netflix.cl.model.TrackingInfo;
import o.AbstractC3073as;
import o.bJG;

/* renamed from: o.bKx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3794bKx extends AbstractC3792bKv implements InterfaceC1673aK<bJG.a>, InterfaceC3790bKt {
    private InterfaceC4414be<C3794bKx, bJG.a> c;
    private InterfaceC4467bf<C3794bKx, bJG.a> d;
    private InterfaceC4573bh<C3794bKx, bJG.a> h;
    private InterfaceC4732bk<C3794bKx, bJG.a> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, bJG.a aVar, int i) {
    }

    @Override // o.InterfaceC3790bKt
    public /* synthetic */ InterfaceC3790bKt a(InterfaceC4732bk interfaceC4732bk) {
        return c((InterfaceC4732bk<C3794bKx, bJG.a>) interfaceC4732bk);
    }

    @Override // o.InterfaceC3790bKt
    public /* synthetic */ InterfaceC3790bKt c(drO dro) {
        return e((drO<? extends TrackingInfo>) dro);
    }

    @Override // o.InterfaceC1673aK
    public void a(bJG.a aVar, int i) {
        InterfaceC4467bf<C3794bKx, bJG.a> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, aVar, i);
        }
    }

    @Override // o.bJG, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(bJG.a aVar) {
        super.e(aVar);
        InterfaceC4414be<C3794bKx, bJG.a> interfaceC4414be = this.c;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, aVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void c(int i, bJG.a aVar) {
        InterfaceC4732bk<C3794bKx, bJG.a> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, aVar, i);
        }
        super.a(i, (int) aVar);
    }

    public C3794bKx c(InterfaceC4732bk<C3794bKx, bJG.a> interfaceC4732bk) {
        h();
        this.i = interfaceC4732bk;
        return this;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void d(float f, float f2, int i, int i2, bJG.a aVar) {
        InterfaceC4573bh<C3794bKx, bJG.a> interfaceC4573bh = this.h;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, aVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, aVar);
    }

    public C3794bKx e(drO<? extends TrackingInfo> dro) {
        h();
        ((AbstractC3792bKv) this).b = dro;
        return this;
    }

    @Override // o.InterfaceC3790bKt
    /* renamed from: i */
    public C3794bKx c(CharSequence charSequence) {
        h();
        super.w_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3790bKt
    /* renamed from: h */
    public C3794bKx e(CharSequence charSequence) {
        h();
        super.x_(charSequence);
        return this;
    }

    @Override // o.InterfaceC3790bKt
    /* renamed from: e */
    public C3794bKx d(View.OnClickListener onClickListener) {
        h();
        super.c(onClickListener);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3794bKx e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3790bKt
    /* renamed from: g */
    public C3794bKx b(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C3794bKx a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.InterfaceC3790bKt
    /* renamed from: e */
    public C3794bKx c(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public bJG.a b(ViewParent viewParent) {
        return new bJG.a();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3794bKx) && super.equals(obj)) {
            C3794bKx c3794bKx = (C3794bKx) obj;
            if ((this.d == null) != (c3794bKx.d == null)) {
                return false;
            }
            if ((this.c == null) != (c3794bKx.c == null)) {
                return false;
            }
            if ((this.i == null) != (c3794bKx.i == null)) {
                return false;
            }
            if ((this.h == null) != (c3794bKx.h == null)) {
                return false;
            }
            if ((((AbstractC3792bKv) this).b == null) == (((AbstractC3792bKv) c3794bKx).b == null) && l() == c3794bKx.l()) {
                if (o() == null ? c3794bKx.o() == null : o().equals(c3794bKx.o())) {
                    if (t() == null ? c3794bKx.t() == null : t().equals(c3794bKx.t())) {
                        return (k() == null) == (c3794bKx.k() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.c != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.h != null ? 1 : 0;
        int i5 = ((AbstractC3792bKv) this).b != null ? 1 : 0;
        boolean l = l();
        int hashCode2 = o() != null ? o().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (l ? 1 : 0)) * 31) + hashCode2) * 31) + (t() != null ? t().hashCode() : 0)) * 31) + (k() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "PresentableErrorModel_{lightTheme=" + l() + ", message=" + ((Object) o()) + ", retryLabel=" + ((Object) t()) + ", onRetryClick=" + k() + "}" + super.toString();
    }
}
