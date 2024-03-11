package o;

import java.io.File;

/* renamed from: o.lF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9204lF implements drO<C9229le> {
    private final String a;
    private final InterfaceC9200lB b;
    private C9229le d;
    private final File e;

    public final C9229le a() {
        return this.d;
    }

    public final void d() {
        this.d = null;
    }

    public C9204lF(File file, String str, InterfaceC9200lB interfaceC9200lB) {
        this.e = file;
        this.a = str;
        this.b = interfaceC9200lB;
    }

    @Override // o.drO
    /* renamed from: e */
    public C9229le invoke() {
        C9229le c9229le = this.d;
        if (c9229le == null) {
            C9229le c = c();
            this.d = c;
            return c;
        }
        return c9229le;
    }

    private final C9229le c() {
        return new C9229le(new C9188kq(this.b).d(C9264mM.b.b(this.e), this.a), this.b);
    }
}
