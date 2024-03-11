package o;

import android.view.View;
import android.view.ViewParent;
import java.util.List;
import o.AbstractC3073as;
import o.AbstractC7259cso;

/* renamed from: o.csl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7256csl extends AbstractC7259cso implements InterfaceC1673aK<AbstractC7259cso.b> {
    private InterfaceC4414be<C7256csl, AbstractC7259cso.b> h;
    private InterfaceC4467bf<C7256csl, AbstractC7259cso.b> i;
    private InterfaceC4573bh<C7256csl, AbstractC7259cso.b> j;
    private InterfaceC4732bk<C7256csl, AbstractC7259cso.b> l;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC7259cso.b bVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: e */
    public void a(AbstractC7259cso.b bVar, int i) {
        InterfaceC4467bf<C7256csl, AbstractC7259cso.b> interfaceC4467bf = this.i;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, bVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(AbstractC7259cso.b bVar) {
        super.b((C7256csl) bVar);
        InterfaceC4414be<C7256csl, AbstractC7259cso.b> interfaceC4414be = this.h;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, bVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void c(int i, AbstractC7259cso.b bVar) {
        InterfaceC4732bk<C7256csl, AbstractC7259cso.b> interfaceC4732bk = this.l;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, bVar, i);
        }
        super.a(i, (int) bVar);
    }

    @Override // o.AbstractC3336ax
    public void d(float f, float f2, int i, int i2, AbstractC7259cso.b bVar) {
        InterfaceC4573bh<C7256csl, AbstractC7259cso.b> interfaceC4573bh = this.j;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, bVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, (int) bVar);
    }

    public C7256csl i(String str) {
        h();
        ((AbstractC7259cso) this).f = str;
        return this;
    }

    public C7256csl d(String str) {
        h();
        ((AbstractC7259cso) this).g = str;
        return this;
    }

    public C7256csl a(List<AbstractC7259cso.e> list) {
        h();
        ((AbstractC7259cso) this).b = list;
        return this;
    }

    public C7256csl b(String str) {
        h();
        super.c(str);
        return this;
    }

    public C7256csl d(InterfaceC4308bc<C7256csl, AbstractC7259cso.b> interfaceC4308bc) {
        h();
        if (interfaceC4308bc == null) {
            super.a((View.OnClickListener) null);
        } else {
            super.a((View.OnClickListener) new View$OnClickListenerC4818bn(interfaceC4308bc));
        }
        return this;
    }

    public C7256csl b(InterfaceC4361bd<C7256csl, AbstractC7259cso.b> interfaceC4361bd) {
        h();
        if (interfaceC4361bd == null) {
            super.d((View.OnLongClickListener) null);
        } else {
            super.d((View.OnLongClickListener) new View$OnClickListenerC4818bn(interfaceC4361bd));
        }
        return this;
    }

    public C7256csl b(CharSequence charSequence) {
        h();
        super.e(charSequence);
        return this;
    }

    public C7256csl a(String str) {
        h();
        super.e(str);
        return this;
    }

    public C7256csl d(long j) {
        h();
        super.c(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C7256csl e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C7256csl a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C7256csl a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: e */
    public C7256csl a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public AbstractC7259cso.b b(ViewParent viewParent) {
        return new AbstractC7259cso.b();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7256csl) && super.equals(obj)) {
            C7256csl c7256csl = (C7256csl) obj;
            if ((this.i == null) != (c7256csl.i == null)) {
                return false;
            }
            if ((this.h == null) != (c7256csl.h == null)) {
                return false;
            }
            if ((this.l == null) != (c7256csl.l == null)) {
                return false;
            }
            if ((this.j == null) != (c7256csl.j == null)) {
                return false;
            }
            String str = ((AbstractC7259cso) this).f;
            if (str == null ? ((AbstractC7259cso) c7256csl).f == null : str.equals(((AbstractC7259cso) c7256csl).f)) {
                String str2 = ((AbstractC7259cso) this).g;
                if (str2 == null ? ((AbstractC7259cso) c7256csl).g == null : str2.equals(((AbstractC7259cso) c7256csl).g)) {
                    List<AbstractC7259cso.e> list = ((AbstractC7259cso) this).b;
                    if (list == null ? ((AbstractC7259cso) c7256csl).b == null : list.equals(((AbstractC7259cso) c7256csl).b)) {
                        if (o() == null ? c7256csl.o() == null : o().equals(c7256csl.o())) {
                            if ((l() == null) != (c7256csl.l() == null)) {
                                return false;
                            }
                            if ((r() == null) != (c7256csl.r() == null)) {
                                return false;
                            }
                            if (n() == null ? c7256csl.n() == null : n().equals(c7256csl.n())) {
                                if (i() == null ? c7256csl.i() == null : i().equals(c7256csl.i())) {
                                    return m() == c7256csl.m() && K() == c7256csl.K() && N() == c7256csl.N();
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
            return false;
        }
        return false;
    }

    @Override // o.AbstractC3073as
    public int hashCode() {
        int hashCode = super.hashCode();
        int i = this.i != null ? 1 : 0;
        int i2 = this.h != null ? 1 : 0;
        int i3 = this.l != null ? 1 : 0;
        int i4 = this.j != null ? 1 : 0;
        String str = ((AbstractC7259cso) this).f;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = ((AbstractC7259cso) this).g;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        List<AbstractC7259cso.e> list = ((AbstractC7259cso) this).b;
        int hashCode4 = list != null ? list.hashCode() : 0;
        int hashCode5 = o() != null ? o().hashCode() : 0;
        int i5 = l() != null ? 1 : 0;
        int i6 = r() == null ? 0 : 1;
        return (((((((((((((((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i5) * 31) + i6) * 31) + (n() != null ? n().hashCode() : 0)) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + ((int) (m() ^ (m() >>> 32)))) * 31) + (K() ? 1 : 0)) * 31) + (N() ? 1 : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "DownloadedShowModel_{showId=" + ((AbstractC7259cso) this).f + ", profileId=" + ((AbstractC7259cso) this).g + ", episodeInfos=" + ((AbstractC7259cso) this).b + ", certification=" + o() + ", clickListener=" + l() + ", longClickListener=" + r() + ", title=" + ((Object) n()) + ", boxShotUrl=" + i() + ", currentSize=" + m() + ", selectable=" + K() + ", selected=" + N() + "}" + super.toString();
    }
}
