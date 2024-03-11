package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class GF {
    private static final c a;
    private static GE b;
    public static final GF e = new GF();

    /* loaded from: classes.dex */
    public static final class c implements GE {
        private final dwQ b = C8752dxf.b();
        private final dxN a = C8752dxf.d();
        private final dwQ d = C8752dxf.a();

        @Override // o.GE
        public dwQ a() {
            return this.d;
        }

        @Override // o.GE
        public dxN b() {
            return this.a;
        }

        @Override // o.GE
        public dwQ e() {
            return this.b;
        }

        c() {
        }
    }

    private GF() {
    }

    static {
        c cVar = new c();
        a = cVar;
        b = cVar;
    }

    public static final dwQ c() {
        return b.e();
    }

    public static final dxN e() {
        return b.b();
    }

    public static final dwQ d() {
        return b.a();
    }

    public final dwQ e(Context context) {
        C8632dsu.c((Object) context, "");
        return b.e();
    }

    public final dxN d(Context context) {
        C8632dsu.c((Object) context, "");
        return b.b();
    }

    public final dwQ a(Context context) {
        C8632dsu.c((Object) context, "");
        return b.a();
    }
}
