package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import kotlin.time.DurationUnit;

@drN
/* loaded from: classes5.dex */
public final class duI implements Comparable<duI> {
    private static final long a;
    private static final long e;
    private final long b;
    public static final b d = new b(null);
    private static final long c = a(0);

    public static boolean b(long j, Object obj) {
        return (obj instanceof duI) && j == ((duI) obj).c();
    }

    public static final /* synthetic */ duI e(long j) {
        return new duI(j);
    }

    public static final boolean l(long j) {
        return j == a || j == e;
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static final boolean t(long j) {
        return j < 0;
    }

    private static final boolean u(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean v(long j) {
        return (((int) j) & 1) == 0;
    }

    private static final long y(long j) {
        return j >> 1;
    }

    public final /* synthetic */ long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return b(this.b, obj);
    }

    public int hashCode() {
        return m(this.b);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(duI dui) {
        return p(dui.c());
    }

    private /* synthetic */ duI(long j) {
        this.b = j;
    }

    private static final DurationUnit x(long j) {
        return v(j) ? DurationUnit.j : DurationUnit.a;
    }

    public static long a(long j) {
        if (duE.a()) {
            if (v(j)) {
                if (!new C8652dtn(-4611686018426999999L, 4611686018426999999L).e(y(j))) {
                    throw new AssertionError(y(j) + " ns is out of nanoseconds range");
                }
            } else if (!new C8652dtn(-4611686018427387903L, 4611686018427387903L).e(y(j))) {
                throw new AssertionError(y(j) + " ms is out of milliseconds range");
            } else if (new C8652dtn(-4611686018426L, 4611686018426L).e(y(j))) {
                throw new AssertionError(y(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final long b() {
            return duI.c;
        }

        public final long a() {
            return duI.a;
        }

        public final long d() {
            return duI.e;
        }

        public final long e(String str) {
            long d;
            C8632dsu.c((Object) str, "");
            try {
                d = duM.d(str, false);
                return d;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e);
            }
        }

        public final long d(String str) {
            long d;
            C8632dsu.c((Object) str, "");
            try {
                d = duM.d(str, true);
                return d;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }
    }

    static {
        long g;
        long g2;
        g = duM.g(4611686018427387903L);
        a = g;
        g2 = duM.g(-4611686018427387903L);
        e = g2;
    }

    public static final long q(long j) {
        long e2;
        e2 = duM.e(-y(j), ((int) j) & 1);
        return e2;
    }

    public static final long a(long j, long j2) {
        long i;
        long j3;
        if (l(j)) {
            if (k(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (l(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long y = y(j) + y(j2);
                if (v(j)) {
                    j3 = duM.j(y);
                    return j3;
                }
                i = duM.i(y);
                return i;
            } else if (u(j)) {
                return b(j, y(j), y(j2));
            } else {
                return b(j, y(j2), y(j));
            }
        }
    }

    private static final long b(long j, long j2, long j3) {
        long n;
        long b2;
        long g;
        long m;
        long m2;
        long f;
        n = duM.n(j3);
        long j4 = j2 + n;
        if (new C8652dtn(-4611686018426L, 4611686018426L).e(j4)) {
            m = duM.m(n);
            m2 = duM.m(j4);
            f = duM.f(m2 + (j3 - m));
            return f;
        }
        b2 = C8657dts.b(j4, -4611686018427387903L, 4611686018427387903L);
        g = duM.g(b2);
        return g;
    }

    public static final boolean k(long j) {
        return !l(j);
    }

    public static final long d(long j) {
        return t(j) ? q(j) : j;
    }

    public int p(long j) {
        return d(this.b, j);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return C8632dsu.a(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return t(j) ? -i : i;
    }

    public static final int c(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (f(j) % 24);
    }

    public static final int g(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (j(j) % 60);
    }

    public static final int o(long j) {
        if (l(j)) {
            return 0;
        }
        return (int) (i(j) % 60);
    }

    public static final int n(long j) {
        long y;
        if (l(j)) {
            return 0;
        }
        if (u(j)) {
            y = duM.m(y(j) % 1000);
        } else {
            y = y(j) % ((long) Prefetch.NANOSECONDS_PER_SECOND);
        }
        return (int) y;
    }

    public static final long c(long j, DurationUnit durationUnit) {
        C8632dsu.c((Object) durationUnit, "");
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == e) {
            return Long.MIN_VALUE;
        }
        return duJ.b(y(j), x(j), durationUnit);
    }

    public static final int b(long j, DurationUnit durationUnit) {
        long b2;
        C8632dsu.c((Object) durationUnit, "");
        b2 = C8657dts.b(c(j, durationUnit), -2147483648L, 2147483647L);
        return (int) b2;
    }

    public static final long b(long j) {
        return c(j, DurationUnit.b);
    }

    public static final long f(long j) {
        return c(j, DurationUnit.d);
    }

    public static final long j(long j) {
        return c(j, DurationUnit.c);
    }

    public static final long i(long j) {
        return c(j, DurationUnit.f);
    }

    public static final long h(long j) {
        return (u(j) && k(j)) ? y(j) : c(j, DurationUnit.a);
    }

    public String toString() {
        return r(this.b);
    }

    public static String r(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == e) {
            return "-Infinity";
        }
        boolean t = t(j);
        StringBuilder sb = new StringBuilder();
        if (t) {
            sb.append('-');
        }
        long d2 = d(j);
        long b2 = b(d2);
        int c2 = c(d2);
        int g = g(d2);
        int o2 = o(d2);
        int n = n(d2);
        int i = 0;
        boolean z = b2 != 0;
        boolean z2 = c2 != 0;
        boolean z3 = g != 0;
        boolean z4 = (o2 == 0 && n == 0) ? false : true;
        if (z) {
            sb.append(b2);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(c2);
            sb.append('h');
            i++;
        }
        if (z3 || (z4 && (z2 || z))) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(g);
            sb.append('m');
            i++;
        }
        if (z4) {
            if (i > 0) {
                sb.append(' ');
            }
            if (o2 != 0 || z || z2 || z3) {
                d(j, sb, o2, n, 9, "s", false);
            } else if (n >= 1000000) {
                d(j, sb, n / Prefetch.NANOSECONDS_PER_MILLISECOND, n % Prefetch.NANOSECONDS_PER_MILLISECOND, 6, "ms", false);
            } else if (n >= 1000) {
                d(j, sb, n / 1000, n % 1000, 3, SignupConstants.Field.REGION_US, false);
            } else {
                sb.append(n);
                sb.append("ns");
            }
            i++;
        }
        if (t && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    private static final void d(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        String b2;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            b2 = duD.b(String.valueOf(i2), i3, '0');
            int length = b2.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i4 = length - 1;
                    if (b2.charAt(length) != '0') {
                        break;
                    } else if (i4 < 0) {
                        break;
                    } else {
                        length = i4;
                    }
                }
            }
            length = -1;
            int i5 = length + 1;
            if (!z && i5 < 3) {
                sb.append((CharSequence) b2, 0, i5);
                C8632dsu.a(sb, "");
            } else {
                sb.append((CharSequence) b2, 0, ((length + 3) / 3) * 3);
                C8632dsu.a(sb, "");
            }
        }
        sb.append(str);
    }

    public static final String s(long j) {
        StringBuilder sb = new StringBuilder();
        if (t(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long d2 = d(j);
        long f = f(d2);
        int g = g(d2);
        int o2 = o(d2);
        int n = n(d2);
        if (l(j)) {
            f = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = f != 0;
        boolean z3 = (o2 == 0 && n == 0) ? false : true;
        if (g == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(f);
            sb.append('H');
        }
        if (z) {
            sb.append(g);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            d(j, sb, o2, n, 9, "S", true);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
