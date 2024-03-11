package o;

/* renamed from: o.dtq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8655dtq implements Iterable<Long>, dsK {
    public static final a e = new a(null);
    private final long a;
    private final long b;
    private final long d;

    public final long a() {
        return this.d;
    }

    public boolean c() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.d;
        return j <= 0 ? j2 < j3 : j2 > j3;
    }

    public final long e() {
        return this.b;
    }

    public C8655dtq(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.b = j;
        this.d = C8603drs.a(j, j2, j3);
        this.a = j3;
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public AbstractC8581dqx iterator() {
        return new C8651dtm(this.b, this.d, this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8655dtq) {
            if (!c() || !((C8655dtq) obj).c()) {
                C8655dtq c8655dtq = (C8655dtq) obj;
                if (this.b != c8655dtq.b || this.d != c8655dtq.d || this.a != c8655dtq.a) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        long j = 31;
        long j2 = this.b;
        long j3 = this.d;
        long j4 = this.a;
        return (int) ((j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)))) + ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.a > 0) {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append("..");
            sb.append(this.d);
            sb.append(" step ");
            j = this.a;
        } else {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" downTo ");
            sb.append(this.d);
            sb.append(" step ");
            j = -this.a;
        }
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: o.dtq$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
