package o;

/* loaded from: classes5.dex */
public final class dCX {
    private final long[] b;
    private final InterfaceC7707dCj c;
    private long e;
    private final drX<InterfaceC7707dCj, Integer, Boolean> i;
    private static final b d = new b(null);
    private static final long[] a = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    public dCX(InterfaceC7707dCj interfaceC7707dCj, drX<? super InterfaceC7707dCj, ? super Integer, Boolean> drx) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) drx, "");
        this.c = interfaceC7707dCj;
        this.i = drx;
        int e = interfaceC7707dCj.e();
        if (e <= 64) {
            this.e = e != 64 ? (-1) << e : 0L;
            this.b = a;
            return;
        }
        this.e = 0L;
        this.b = d(e);
    }

    /* loaded from: classes5.dex */
    static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public final void a(int i) {
        if (i < 64) {
            this.e |= 1 << i;
        } else {
            b(i);
        }
    }

    public final int c() {
        int numberOfTrailingZeros;
        int e = this.c.e();
        do {
            long j = this.e;
            if (j == -1) {
                if (e > 64) {
                    return b();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.e |= 1 << numberOfTrailingZeros;
        } while (!this.i.invoke(this.c, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }

    private final long[] d(int i) {
        int b2;
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            b2 = C8563dqf.b(jArr);
            jArr[b2] = (-1) << i;
        }
        return jArr;
    }

    private final void b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.b;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int b() {
        int length = this.b.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            long j = this.b[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i3 = numberOfTrailingZeros + (i2 * 64);
                if (this.i.invoke(this.c, Integer.valueOf(i3)).booleanValue()) {
                    this.b[i] = j;
                    return i3;
                }
            }
            this.b[i] = j;
            i = i2;
        }
        return -1;
    }
}
