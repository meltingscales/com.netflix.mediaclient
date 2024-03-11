package o;

import o.duH;

/* loaded from: classes6.dex */
public interface duQ {
    public static final d d = d.e;

    /* loaded from: classes6.dex */
    public static final class e implements duP {
        public static final e b = new e();

        private e() {
        }

        public long b() {
            return duN.e.c();
        }

        public String toString() {
            return duN.e.toString();
        }

        @drN
        /* loaded from: classes6.dex */
        public static final class b implements duH {
            private final long a;

            public static long a(long j) {
                return j;
            }

            public static int b(long j) {
                return Long.hashCode(j);
            }

            public static boolean b(long j, Object obj) {
                return (obj instanceof b) && j == ((b) obj).d();
            }

            public static String c(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            public final /* synthetic */ long d() {
                return this.a;
            }

            public boolean equals(Object obj) {
                return b(this.a, obj);
            }

            public int hashCode() {
                return b(this.a);
            }

            public String toString() {
                return c(this.a);
            }

            @Override // java.lang.Comparable
            /* renamed from: c */
            public int compareTo(duH duh) {
                return duH.b.d(this, duh);
            }

            public static long e(long j) {
                return duN.e.a(j);
            }

            @Override // o.duH
            public long d(duH duh) {
                C8632dsu.c((Object) duh, "");
                return b(this.a, duh);
            }

            public static long b(long j, duH duh) {
                C8632dsu.c((Object) duh, "");
                if (!(duh instanceof b)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) c(j)) + " and " + duh);
                }
                return c(j, ((b) duh).d());
            }

            public static final long c(long j, long j2) {
                return duN.e.a(j, j2);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d {
        static final /* synthetic */ d e = new d();

        private d() {
        }
    }
}
