package o;

import android.view.ViewParent;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import io.reactivex.subjects.BehaviorSubject;
import o.AbstractC3073as;
import o.AbstractC6229cYq;

/* renamed from: o.cYr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6230cYr extends AbstractC6229cYq implements InterfaceC1673aK<AbstractC6229cYq.e>, InterfaceC6227cYo {
    private InterfaceC4467bf<C6230cYr, AbstractC6229cYq.e> d;
    private InterfaceC4573bh<C6230cYr, AbstractC6229cYq.e> f;
    private InterfaceC4732bk<C6230cYr, AbstractC6229cYq.e> h;
    private InterfaceC4414be<C6230cYr, AbstractC6229cYq.e> i;

    @Override // o.InterfaceC1673aK
    /* renamed from: a */
    public void e(C1511aE c1511aE, AbstractC6229cYq.e eVar, int i) {
    }

    @Override // o.InterfaceC6227cYo
    public /* synthetic */ InterfaceC6227cYo a(BehaviorSubject behaviorSubject) {
        return d((BehaviorSubject<Integer>) behaviorSubject);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC6229cYq.e eVar, int i) {
        InterfaceC4467bf<C6230cYr, AbstractC6229cYq.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC6229cYq, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(AbstractC6229cYq.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C6230cYr, AbstractC6229cYq.e> interfaceC4414be = this.i;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void c(int i, AbstractC6229cYq.e eVar) {
        InterfaceC4732bk<C6230cYr, AbstractC6229cYq.e> interfaceC4732bk = this.h;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6229cYq.e eVar) {
        InterfaceC4573bh<C6230cYr, AbstractC6229cYq.e> interfaceC4573bh = this.f;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC6227cYo
    /* renamed from: a */
    public C6230cYr d(MembershipProductChoice membershipProductChoice) {
        h();
        this.c = membershipProductChoice;
        return this;
    }

    public C6230cYr d(BehaviorSubject<Integer> behaviorSubject) {
        h();
        ((AbstractC6229cYq) this).b = behaviorSubject;
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6230cYr e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC6227cYo
    /* renamed from: b */
    public C6230cYr d(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6230cYr a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6230cYr a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public AbstractC6229cYq.e b(ViewParent viewParent) {
        return new AbstractC6229cYq.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6230cYr) && super.equals(obj)) {
            C6230cYr c6230cYr = (C6230cYr) obj;
            if ((this.d == null) != (c6230cYr.d == null)) {
                return false;
            }
            if ((this.i == null) != (c6230cYr.i == null)) {
                return false;
            }
            if ((this.h == null) != (c6230cYr.h == null)) {
                return false;
            }
            if ((this.f == null) != (c6230cYr.f == null)) {
                return false;
            }
            MembershipProductChoice membershipProductChoice = this.c;
            if (membershipProductChoice == null ? c6230cYr.c == null : membershipProductChoice.equals(c6230cYr.c)) {
                return (((AbstractC6229cYq) this).b == null) == (((AbstractC6229cYq) c6230cYr).b == null);
            }
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.d != null ? 1 : 0;
        int i2 = this.i != null ? 1 : 0;
        int i3 = this.h != null ? 1 : 0;
        int i4 = this.f != null ? 1 : 0;
        MembershipProductChoice membershipProductChoice = this.c;
        return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (membershipProductChoice != null ? membershipProductChoice.hashCode() : 0)) * 31) + (((AbstractC6229cYq) this).b != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "ProductChoiceModel_{productChoiceModel=" + this.c + ", planSelectionClicks=" + ((AbstractC6229cYq) this).b + "}" + super.toString();
    }
}
