package o;

@drN
/* loaded from: classes5.dex */
public final class dpJ implements Comparable<dpJ> {
    public static final a b = new a(null);
    private final int d;

    public static final /* synthetic */ dpJ a(int i) {
        return new dpJ(i);
    }

    public static int b(int i) {
        return Integer.hashCode(i);
    }

    public static boolean b(int i, Object obj) {
        return (obj instanceof dpJ) && i == ((dpJ) obj).a();
    }

    public static int c(int i) {
        return i;
    }

    public final /* synthetic */ int a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return b(this.d, obj);
    }

    public int hashCode() {
        return b(this.d);
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(dpJ dpj) {
        return dpS.c(a(), dpj.a());
    }

    private /* synthetic */ dpJ(int i) {
        this.d = i;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public static String e(int i) {
        return String.valueOf(i & 4294967295L);
    }

    public String toString() {
        return e(this.d);
    }
}
