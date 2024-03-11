package o;

/* renamed from: o.dHt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7852dHt {
    public static final a e = new a(null);
    private int a;
    private final int[] b = new int[10];

    public final boolean c(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int d() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final C7852dHt d(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public final int d(int i) {
        return this.b[i];
    }

    public final int e() {
        return Integer.bitCount(this.a);
    }

    public final int c() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int b(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    public final void a(C7852dHt c7852dHt) {
        C8632dsu.d(c7852dHt, "");
        for (int i = 0; i < 10; i++) {
            if (c7852dHt.c(i)) {
                d(i, c7852dHt.d(i));
            }
        }
    }

    /* renamed from: o.dHt$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }
    }
}
