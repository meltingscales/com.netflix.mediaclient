package o;

import o.AbstractC7233csO;

/* renamed from: o.crE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7170crE extends AbstractC7233csO {
    private final int a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean j;

    @Override // o.AbstractC7233csO
    public int a() {
        return this.e;
    }

    @Override // o.AbstractC7233csO
    public int b() {
        return this.a;
    }

    @Override // o.AbstractC7233csO
    public int c() {
        return this.c;
    }

    @Override // o.AbstractC7233csO
    public int d() {
        return this.d;
    }

    @Override // o.AbstractC7233csO
    public int e() {
        return this.f;
    }

    @Override // o.AbstractC7233csO
    public boolean h() {
        return this.j;
    }

    public int hashCode() {
        int i = this.c;
        int i2 = this.a;
        int i3 = this.e;
        int i4 = this.f;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ this.d) * 1000003) ^ (this.j ? 1231 : 1237);
    }

    private C7170crE(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.c = i;
        this.a = i2;
        this.e = i3;
        this.f = i4;
        this.d = i5;
        this.j = z;
    }

    public String toString() {
        return "DownloadsSummary{currentActive=" + this.c + ", error=" + this.a + ", completed=" + this.e + ", paused=" + this.f + ", overallProgress=" + this.d + ", wifiOnly=" + this.j + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7233csO) {
            AbstractC7233csO abstractC7233csO = (AbstractC7233csO) obj;
            return this.c == abstractC7233csO.c() && this.a == abstractC7233csO.b() && this.e == abstractC7233csO.a() && this.f == abstractC7233csO.e() && this.d == abstractC7233csO.d() && this.j == abstractC7233csO.h();
        }
        return false;
    }

    /* renamed from: o.crE$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC7233csO.e {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;
        private Integer e;
        private Boolean f;

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e b(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e e(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e a(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO.e e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // o.AbstractC7233csO.e
        public AbstractC7233csO e() {
            String str = "";
            if (this.a == null) {
                str = " currentActive";
            }
            if (this.e == null) {
                str = str + " error";
            }
            if (this.b == null) {
                str = str + " completed";
            }
            if (this.c == null) {
                str = str + " paused";
            }
            if (this.d == null) {
                str = str + " overallProgress";
            }
            if (this.f == null) {
                str = str + " wifiOnly";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C7170crE(this.a.intValue(), this.e.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f.booleanValue());
        }
    }
}
