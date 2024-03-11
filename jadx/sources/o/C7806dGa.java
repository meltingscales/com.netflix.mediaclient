package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.dGa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7806dGa {
    private String a;
    private final boolean c;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13802o;
    private final int q;
    public static final b d = new b(null);
    public static final C7806dGa e = new e().d().e();
    public static final C7806dGa b = new e().c().d(Integer.MAX_VALUE, TimeUnit.SECONDS).e();

    public final int a() {
        return this.f;
    }

    public final int b() {
        return this.h;
    }

    public final boolean c() {
        return this.i;
    }

    public final boolean d() {
        return this.j;
    }

    public final int e() {
        return this.g;
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean h() {
        return this.n;
    }

    public final boolean i() {
        return this.m;
    }

    public final boolean j() {
        return this.f13802o;
    }

    private C7806dGa(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.n = z;
        this.k = z2;
        this.h = i;
        this.q = i2;
        this.i = z3;
        this.j = z4;
        this.m = z5;
        this.f = i3;
        this.g = i4;
        this.f13802o = z6;
        this.l = z7;
        this.c = z8;
        this.a = str;
    }

    public /* synthetic */ C7806dGa(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C8627dsp c8627dsp) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public String toString() {
        String str = this.a;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.n) {
                sb.append("no-cache, ");
            }
            if (this.k) {
                sb.append("no-store, ");
            }
            if (this.h != -1) {
                sb.append("max-age=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.q != -1) {
                sb.append("s-maxage=");
                sb.append(this.q);
                sb.append(", ");
            }
            if (this.i) {
                sb.append("private, ");
            }
            if (this.j) {
                sb.append("public, ");
            }
            if (this.m) {
                sb.append("must-revalidate, ");
            }
            if (this.f != -1) {
                sb.append("max-stale=");
                sb.append(this.f);
                sb.append(", ");
            }
            if (this.g != -1) {
                sb.append("min-fresh=");
                sb.append(this.g);
                sb.append(", ");
            }
            if (this.f13802o) {
                sb.append("only-if-cached, ");
            }
            if (this.l) {
                sb.append("no-transform, ");
            }
            if (this.c) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            C8632dsu.b(sb2, "");
            this.a = sb2;
            return sb2;
        }
        return str;
    }

    /* renamed from: o.dGa$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private boolean a;
        private boolean b;
        private boolean h;
        private boolean i;
        private boolean j;
        private int e = -1;
        private int d = -1;
        private int c = -1;

        private final int d(long j) {
            if (j > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final e c() {
            this.j = true;
            return this;
        }

        public final e d() {
            this.a = true;
            return this;
        }

        public final e d(int i, TimeUnit timeUnit) {
            C8632dsu.d(timeUnit, "");
            if (i < 0) {
                throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
            }
            this.d = d(timeUnit.toSeconds(i));
            return this;
        }

        public final C7806dGa e() {
            return new C7806dGa(this.a, this.i, this.e, -1, false, false, false, this.d, this.c, this.j, this.h, this.b, null, null);
        }
    }

    /* renamed from: o.dGa$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C7806dGa c(o.C7819dGn r31) {
            /*
                Method dump skipped, instructions count: 391
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7806dGa.b.c(o.dGn):o.dGa");
        }

        private final int d(String str, String str2, int i) {
            boolean a;
            int length = str.length();
            while (i < length) {
                a = duD.a((CharSequence) str2, str.charAt(i), false, 2, (Object) null);
                if (a) {
                    return i;
                }
                i++;
            }
            return str.length();
        }
    }
}
