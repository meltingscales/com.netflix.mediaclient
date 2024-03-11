package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aNA {
    public static final d b = new d(null);
    private final InterfaceC1773aNs a;
    private final Map<String, aNB> e;

    public aNA(InterfaceC1773aNs interfaceC1773aNs) {
        C8632dsu.c((Object) interfaceC1773aNs, "");
        this.a = interfaceC1773aNs;
        this.e = new HashMap();
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("nf_cdx_logger");
        }
    }

    public final void d(int i, String str) {
        C8632dsu.c((Object) str, "");
        aNB anb = this.e.get(str);
        if (anb == null) {
            anb = new aNB(this.a, str);
            this.e.put(str, anb);
        }
        anb.c(i);
    }

    public final void c(int i, String str) {
        C8632dsu.c((Object) str, "");
        aNB anb = this.e.get(str);
        if (anb == null) {
            return;
        }
        anb.e(i);
    }
}
