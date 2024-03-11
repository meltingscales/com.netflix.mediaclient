package o;

@drN
/* loaded from: classes5.dex */
public final class dpF implements Comparable<dpF> {
    public static final b c = new b(null);
    private final byte a;

    public static byte a(byte b2) {
        return b2;
    }

    public static boolean b(byte b2, Object obj) {
        return (obj instanceof dpF) && b2 == ((dpF) obj).c();
    }

    public static int c(byte b2) {
        return Byte.hashCode(b2);
    }

    public static final /* synthetic */ dpF e(byte b2) {
        return new dpF(b2);
    }

    public final /* synthetic */ byte c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public int hashCode() {
        return c(this.a);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(dpF dpf) {
        return C8632dsu.d(c() & 255, dpf.c() & 255);
    }

    private /* synthetic */ dpF(byte b2) {
        this.a = b2;
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public static String b(byte b2) {
        return String.valueOf(b2 & 255);
    }

    public String toString() {
        return b(this.a);
    }
}
