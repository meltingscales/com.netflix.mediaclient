package o;

import android.view.View;
import android.view.ViewParent;
import o.AbstractC3073as;
import o.AbstractC3758bJo;

/* renamed from: o.bJu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3764bJu extends AbstractC3758bJo implements InterfaceC1673aK<AbstractC3758bJo.e>, InterfaceC3767bJx {
    private InterfaceC4467bf<C3764bJu, AbstractC3758bJo.e> d;
    private InterfaceC4414be<C3764bJu, AbstractC3758bJo.e> g;
    private InterfaceC4732bk<C3764bJu, AbstractC3758bJo.e> i;
    private InterfaceC4573bh<C3764bJu, AbstractC3758bJo.e> j;

    @Override // o.InterfaceC1673aK
    /* renamed from: d */
    public void e(C1511aE c1511aE, AbstractC3758bJo.e eVar, int i) {
    }

    @Override // o.InterfaceC3767bJx
    public /* synthetic */ InterfaceC3767bJx b(drX drx) {
        return a((drX<? super View, ? super CharSequence, dpR>) drx);
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: c */
    public void a(AbstractC3758bJo.e eVar, int i) {
        InterfaceC4467bf<C3764bJu, AbstractC3758bJo.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3758bJo, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC3758bJo.e eVar) {
        super.e(eVar);
        InterfaceC4414be<C3764bJu, AbstractC3758bJo.e> interfaceC4414be = this.g;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC3758bJo.e eVar) {
        InterfaceC4732bk<C3764bJu, AbstractC3758bJo.e> interfaceC4732bk = this.i;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void d(float f, float f2, int i, int i2, AbstractC3758bJo.e eVar) {
        InterfaceC4573bh<C3764bJu, AbstractC3758bJo.e> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    @Override // o.InterfaceC3767bJx
    /* renamed from: j */
    public C3764bJu b(CharSequence charSequence) {
        h();
        ((AbstractC3758bJo) this).b = charSequence;
        return this;
    }

    @Override // o.InterfaceC3767bJx
    /* renamed from: h */
    public C3764bJu d(CharSequence charSequence) {
        h();
        this.c = charSequence;
        return this;
    }

    @Override // o.InterfaceC3767bJx
    /* renamed from: g */
    public C3764bJu e(CharSequence charSequence) {
        h();
        super.u_(charSequence);
        return this;
    }

    public C3764bJu a(drX<? super View, ? super CharSequence, dpR> drx) {
        h();
        super.e(drx);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: a */
    public C3764bJu e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.InterfaceC3767bJx
    /* renamed from: i */
    public C3764bJu c(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.InterfaceC3767bJx
    /* renamed from: c */
    public C3764bJu e(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C3764bJu a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC3758bJo.e b(ViewParent viewParent) {
        return new AbstractC3758bJo.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C3764bJu) && super.equals(obj)) {
            C3764bJu c3764bJu = (C3764bJu) obj;
            if ((this.d == null) != (c3764bJu.d == null)) {
                return false;
            }
            if ((this.g == null) != (c3764bJu.g == null)) {
                return false;
            }
            if ((this.i == null) != (c3764bJu.i == null)) {
                return false;
            }
            if ((this.j == null) != (c3764bJu.j == null)) {
                return false;
            }
            CharSequence charSequence = ((AbstractC3758bJo) this).b;
            if (charSequence == null ? ((AbstractC3758bJo) c3764bJu).b == null : charSequence.equals(((AbstractC3758bJo) c3764bJu).b)) {
                if (k() == null ? c3764bJu.k() == null : k().equals(c3764bJu.k())) {
                    CharSequence charSequence2 = this.c;
                    if (charSequence2 == null ? c3764bJu.c == null : charSequence2.equals(c3764bJu.c)) {
                        if (i() == null ? c3764bJu.i() == null : i().equals(c3764bJu.i())) {
                            if (m() != c3764bJu.m()) {
                                return false;
                            }
                            return (o() == null) == (c3764bJu.o() == null);
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
        int i = this.d != null ? 1 : 0;
        int i2 = this.g != null ? 1 : 0;
        int i3 = this.i != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        CharSequence charSequence = ((AbstractC3758bJo) this).b;
        int hashCode2 = charSequence != null ? charSequence.hashCode() : 0;
        int hashCode3 = k() != null ? k().hashCode() : 0;
        CharSequence charSequence2 = this.c;
        int hashCode4 = charSequence2 != null ? charSequence2.hashCode() : 0;
        return (((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (m() ? 1 : 0)) * 31) + (o() != null ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CopyLinkModel_{linkText=" + ((Object) ((AbstractC3758bJo) this).b) + ", tokenText=" + ((Object) k()) + ", linkToCopy=" + ((Object) this.c) + ", label=" + ((Object) i()) + ", showCopiedMessages=" + m() + "}" + super.toString();
    }
}
