package o;

/* renamed from: o.Ic  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0931Ic {
    public static final b a = new b(null);
    private final Integer b;
    private final Long c;
    private final Long e;

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("FalcorMetadata: [");
        boolean z2 = true;
        if (this.c != null) {
            sb.append("expires = ");
            sb.append(this.c.longValue());
            z = true;
        } else {
            z = false;
        }
        if (this.e != null) {
            if (z) {
                sb.append(", ");
            }
            sb.append("timestamp = ");
            sb.append(this.e.longValue());
        } else {
            z2 = z;
        }
        if (this.b != null) {
            if (z2) {
                sb.append(", ");
            }
            sb.append("size = ");
            sb.append(this.b.intValue());
        }
        sb.append("]");
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* renamed from: o.Ic$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public final boolean a(long j, long j2, long j3) {
            int i;
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            return i2 == 0 || (j != 1 && (i <= 0 ? i2 >= 0 || j2 - j3 > (-j) : j2 > j));
        }

        private b() {
        }
    }
}
