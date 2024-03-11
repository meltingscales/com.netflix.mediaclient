package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class bLZ {
    public static final e b = new e(null);
    public static final int c = 8;
    private final Set<InterfaceC3826bMb> a = new LinkedHashSet();
    private final InterfaceC3826bMb d = new b();
    private AbstractC3827bMc e;

    public final InterfaceC3826bMb e() {
        return this.d;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayerSimpleStatusListenerManager");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3826bMb {
        b() {
        }

        @Override // o.InterfaceC3826bMb
        public void c(AbstractC3827bMc abstractC3827bMc) {
            C8632dsu.c((Object) abstractC3827bMc, "");
            Set set = bLZ.this.a;
            bLZ blz = bLZ.this;
            synchronized (set) {
                for (InterfaceC3826bMb interfaceC3826bMb : blz.a) {
                    interfaceC3826bMb.c(abstractC3827bMc);
                }
                blz.e = abstractC3827bMc;
                dpR dpr = dpR.c;
            }
        }
    }

    public final void b(InterfaceC3826bMb interfaceC3826bMb) {
        C8632dsu.c((Object) interfaceC3826bMb, "");
        synchronized (this.a) {
            this.a.add(interfaceC3826bMb);
            AbstractC3827bMc abstractC3827bMc = this.e;
            if (abstractC3827bMc != null) {
                interfaceC3826bMb.c(abstractC3827bMc);
                dpR dpr = dpR.c;
            }
        }
    }

    public final void e(InterfaceC3826bMb interfaceC3826bMb) {
        C8632dsu.c((Object) interfaceC3826bMb, "");
        synchronized (this.a) {
            this.a.remove(interfaceC3826bMb);
        }
    }
}
