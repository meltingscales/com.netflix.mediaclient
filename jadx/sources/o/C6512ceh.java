package o;

import android.view.ViewParent;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import o.AbstractC3073as;
import o.AbstractC6516cel;

/* renamed from: o.ceh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6512ceh extends AbstractC6516cel implements InterfaceC1673aK<AbstractC6516cel.e> {
    private InterfaceC4414be<C6512ceh, AbstractC6516cel.e> b;
    private InterfaceC4573bh<C6512ceh, AbstractC6516cel.e> c;
    private InterfaceC4467bf<C6512ceh, AbstractC6516cel.e> d;
    private InterfaceC4732bk<C6512ceh, AbstractC6516cel.e> g;

    @Override // o.InterfaceC1673aK
    public void e(C1511aE c1511aE, AbstractC6516cel.e eVar, int i) {
    }

    @Override // o.InterfaceC1673aK
    /* renamed from: b */
    public void a(AbstractC6516cel.e eVar, int i) {
        InterfaceC4467bf<C6512ceh, AbstractC6516cel.e> interfaceC4467bf = this.d;
        if (interfaceC4467bf != null) {
            interfaceC4467bf.c(this, eVar, i);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(AbstractC6516cel.e eVar) {
        super.b((C6512ceh) eVar);
        InterfaceC4414be<C6512ceh, AbstractC6516cel.e> interfaceC4414be = this.b;
        if (interfaceC4414be != null) {
            interfaceC4414be.d(this, eVar);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, AbstractC6516cel.e eVar) {
        InterfaceC4732bk<C6512ceh, AbstractC6516cel.e> interfaceC4732bk = this.g;
        if (interfaceC4732bk != null) {
            interfaceC4732bk.b(this, eVar, i);
        }
        super.a(i, (int) eVar);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: e */
    public void d(float f, float f2, int i, int i2, AbstractC6516cel.e eVar) {
        InterfaceC4573bh<C6512ceh, AbstractC6516cel.e> interfaceC4573bh = this.c;
        if (interfaceC4573bh != null) {
            interfaceC4573bh.b(this, eVar, f, f2, i, i2);
        }
        super.b(f, f2, i, i2, eVar);
    }

    public C6512ceh b(String str) {
        h();
        super.c(str);
        return this;
    }

    public C6512ceh d(boolean z) {
        h();
        super.c(z);
        return this;
    }

    public C6512ceh c(VideoType videoType) {
        h();
        super.a(videoType);
        return this;
    }

    public C6512ceh b(Integer num) {
        h();
        super.a(num);
        return this;
    }

    public C6512ceh c(TrackingInfoHolder trackingInfoHolder) {
        h();
        super.e(trackingInfoHolder);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6512ceh e(long j) {
        super.e(j);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: c */
    public C6512ceh a(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: b */
    public C6512ceh a(int i) {
        super.a(i);
        return this;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public C6512ceh a(AbstractC3073as.b bVar) {
        super.a(bVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public AbstractC6516cel.e b(ViewParent viewParent) {
        return new AbstractC6516cel.e();
    }

    @Override // o.AbstractC3073as
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6512ceh) && super.equals(obj)) {
            C6512ceh c6512ceh = (C6512ceh) obj;
            if ((this.d == null) != (c6512ceh.d == null)) {
                return false;
            }
            if ((this.b == null) != (c6512ceh.b == null)) {
                return false;
            }
            if ((this.g == null) != (c6512ceh.g == null)) {
                return false;
            }
            if ((this.c == null) != (c6512ceh.c == null)) {
                return false;
            }
            if (l() == null ? c6512ceh.l() == null : l().equals(c6512ceh.l())) {
                if (n() != c6512ceh.n()) {
                    return false;
                }
                if (k() == null ? c6512ceh.k() == null : k().equals(c6512ceh.k())) {
                    if (i() == null ? c6512ceh.i() == null : i().equals(c6512ceh.i())) {
                        return o() == null ? c6512ceh.o() == null : o().equals(c6512ceh.o());
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
        int i2 = this.b != null ? 1 : 0;
        int i3 = this.g != null ? 1 : 0;
        int i4 = this.c == null ? 0 : 1;
        int hashCode2 = l() != null ? l().hashCode() : 0;
        boolean n = n();
        int hashCode3 = k() != null ? k().hashCode() : 0;
        return (((((((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode2) * 31) + (n ? 1 : 0)) * 31) + hashCode3) * 31) + (i() != null ? i().hashCode() : 0)) * 31) + (o() != null ? o().hashCode() : 0);
    }

    @Override // o.AbstractC3073as
    public String toString() {
        return "CwDialogDownloadRowModel_{playableIdForDownload=" + l() + ", playableForDownload=" + n() + ", downloadVideoType=" + k() + ", buttonTextStringId=" + i() + ", trackingInfoHolder=" + o() + "}" + super.toString();
    }
}
