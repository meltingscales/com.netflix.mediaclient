package o;

import java.util.ArrayList;
import java.util.List;
import o.C4768bmC;

/* renamed from: o.bmH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4773bmH implements InterfaceC4766bmA {
    public static final c e = new c(null);
    private final List<C4768bmC> a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final InterfaceC4766bmA g;

    public final void e() {
        this.b = !this.d;
    }

    public C4773bmH(InterfaceC4766bmA interfaceC4766bmA) {
        C8632dsu.c((Object) interfaceC4766bmA, "");
        this.g = interfaceC4766bmA;
        this.a = new ArrayList();
    }

    @Override // o.InterfaceC4766bmA
    public void a(C4768bmC c4768bmC, boolean z) {
        C8632dsu.c((Object) c4768bmC, "");
        if (this.b && c4768bmC.a() == C4768bmC.c.c.d()) {
            this.b = false;
            b();
        }
        if (this.b) {
            if (z) {
                return;
            }
            this.a.add(c4768bmC);
            return;
        }
        this.d = true;
        e(c4768bmC);
        this.g.a(c4768bmC, z);
    }

    public final void d(boolean z) {
        this.c = !z;
        this.b = false;
        b();
    }

    private final void b() {
        for (C4768bmC c4768bmC : this.a) {
            e(c4768bmC);
            this.g.a(c4768bmC, false);
        }
        this.a.clear();
    }

    private final void e(C4768bmC c4768bmC) {
        c4768bmC.c.a(this.c);
    }

    /* renamed from: o.bmH$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_pds");
        }
    }
}
