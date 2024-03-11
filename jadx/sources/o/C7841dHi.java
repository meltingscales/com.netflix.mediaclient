package o;

import o.C7819dGn;

/* renamed from: o.dHi  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7841dHi {
    public static final b a = new b(null);
    private final InterfaceC7871dIn b;
    private long d;

    public C7841dHi(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.d(interfaceC7871dIn, "");
        this.b = interfaceC7871dIn;
        this.d = 262144;
    }

    public final String d() {
        String d = this.b.d(this.d);
        this.d -= d.length();
        return d;
    }

    public final C7819dGn c() {
        C7819dGn.d dVar = new C7819dGn.d();
        while (true) {
            String d = d();
            if (d.length() != 0) {
                dVar.c(d);
            } else {
                return dVar.b();
            }
        }
    }

    /* renamed from: o.dHi$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }
    }
}
