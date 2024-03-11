package o;

@drN
/* loaded from: classes5.dex */
public final class dpO implements Comparable<dpO> {
    public static final d d = new d(null);
    private final short a;

    public static final /* synthetic */ dpO a(short s) {
        return new dpO(s);
    }

    public static int b(short s) {
        return Short.hashCode(s);
    }

    public static boolean b(short s, Object obj) {
        return (obj instanceof dpO) && s == ((dpO) obj).c();
    }

    public static short c(short s) {
        return s;
    }

    public final /* synthetic */ short c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return b(this.a, obj);
    }

    public int hashCode() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(dpO dpo) {
        return C8632dsu.d(c() & 65535, dpo.c() & 65535);
    }

    private /* synthetic */ dpO(short s) {
        this.a = s;
    }

    /* loaded from: classes5.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    public static String d(short s) {
        return String.valueOf(s & 65535);
    }

    public String toString() {
        return d(this.a);
    }
}
