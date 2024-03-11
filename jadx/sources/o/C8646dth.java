package o;

/* renamed from: o.dth  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8646dth implements Iterable<Integer>, dsK {
    public static final a c = new a(null);
    private final int a;
    private final int b;
    private final int e;

    public final int a() {
        return this.e;
    }

    public boolean b() {
        return this.e <= 0 ? this.b < this.a : this.b > this.a;
    }

    public final int d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public C8646dth(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.b = i;
        this.a = C8603drs.c(i, i2, i3);
        this.e = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: c */
    public dqB iterator() {
        return new C8647dti(this.b, this.a, this.e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8646dth) {
            if (!b() || !((C8646dth) obj).b()) {
                C8646dth c8646dth = (C8646dth) obj;
                if (this.b != c8646dth.b || this.a != c8646dth.a || this.e != c8646dth.e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.b * 31) + this.a) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.e > 0) {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append("..");
            sb.append(this.a);
            sb.append(" step ");
            i = this.e;
        } else {
            sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" downTo ");
            sb.append(this.a);
            sb.append(" step ");
            i = -this.e;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: o.dth$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C8646dth a(int i, int i2, int i3) {
            return new C8646dth(i, i2, i3);
        }
    }
}
