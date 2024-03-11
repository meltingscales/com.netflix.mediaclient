package o;

/* renamed from: o.dtd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8642dtd implements Iterable<Character>, dsK {
    public static final e a = new e(null);
    private final char b;
    private final char c;
    private final int e;

    public final char d() {
        return this.b;
    }

    public final char e() {
        return this.c;
    }

    public C8642dtd(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.c = c;
        this.b = (char) C8603drs.c(c, c2, i);
        this.e = i;
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public AbstractC8568dqk iterator() {
        return new C8643dte(this.c, this.b, this.e);
    }

    public boolean a() {
        return this.e <= 0 ? C8632dsu.d(this.c, this.b) < 0 : C8632dsu.d(this.c, this.b) > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8642dtd) {
            if (!a() || !((C8642dtd) obj).a()) {
                C8642dtd c8642dtd = (C8642dtd) obj;
                if (this.c != c8642dtd.c || this.b != c8642dtd.b || this.e != c8642dtd.e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.c * 31) + this.b) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.e > 0) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.e;
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.e;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: o.dtd$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
