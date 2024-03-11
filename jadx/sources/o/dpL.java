package o;

@drN
/* loaded from: classes5.dex */
public final class dpL implements Comparable<dpL> {
    public static final c c = new c(null);
    private final long d;

    public static int a(long j) {
        return Long.hashCode(j);
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof dpL) && j == ((dpL) obj).a();
    }

    public static long b(long j) {
        return j;
    }

    public static final /* synthetic */ dpL e(long j) {
        return new dpL(j);
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public final /* synthetic */ long a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return a(this.d, obj);
    }

    public int hashCode() {
        return a(this.d);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(dpL dpl) {
        return dpS.b(a(), dpl.a());
    }

    private /* synthetic */ dpL(long j) {
        this.d = j;
    }

    /* loaded from: classes5.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public static String c(long j) {
        return dpS.d(j);
    }

    public String toString() {
        return c(this.d);
    }
}
