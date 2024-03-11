package o;

import o.AbstractC5079brw;

/* renamed from: o.brl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5068brl extends AbstractC5079brw {
    private final float a;
    private final long b;
    private final float c;
    private final float d;
    private final long e;
    private final long f;
    private final String g;
    private final float h;
    private final long i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;

    /* renamed from: o  reason: collision with root package name */
    private final float f13628o;
    private final String p;
    private final long q;
    private final float r;
    private final int s;
    private final long t;
    private final float u;
    private final float y;

    @Override // o.AbstractC5079brw
    public long a() {
        return this.e;
    }

    @Override // o.AbstractC5079brw
    public float b() {
        return this.c;
    }

    @Override // o.AbstractC5079brw
    public float c() {
        return this.d;
    }

    @Override // o.AbstractC5079brw
    public long d() {
        return this.b;
    }

    @Override // o.AbstractC5079brw
    public float e() {
        return this.a;
    }

    @Override // o.AbstractC5079brw
    public float f() {
        return this.h;
    }

    @Override // o.AbstractC5079brw
    public String g() {
        return this.g;
    }

    @Override // o.AbstractC5079brw
    public float h() {
        return this.j;
    }

    @Override // o.AbstractC5079brw
    public long i() {
        return this.f;
    }

    @Override // o.AbstractC5079brw
    public long j() {
        return this.i;
    }

    @Override // o.AbstractC5079brw
    public float k() {
        return this.n;
    }

    @Override // o.AbstractC5079brw
    public float l() {
        return this.f13628o;
    }

    @Override // o.AbstractC5079brw
    public float m() {
        return this.l;
    }

    @Override // o.AbstractC5079brw
    public float n() {
        return this.k;
    }

    @Override // o.AbstractC5079brw
    public float o() {
        return this.m;
    }

    @Override // o.AbstractC5079brw
    public int p() {
        return this.s;
    }

    @Override // o.AbstractC5079brw
    public String q() {
        return this.p;
    }

    @Override // o.AbstractC5079brw
    public long r() {
        return this.q;
    }

    @Override // o.AbstractC5079brw
    public float s() {
        return this.r;
    }

    @Override // o.AbstractC5079brw
    public long t() {
        return this.t;
    }

    @Override // o.AbstractC5079brw
    public float u() {
        return this.y;
    }

    @Override // o.AbstractC5079brw
    public float v() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5068brl(String str, String str2, int i, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, long j5, long j6, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.p = str;
        this.g = str2;
        this.s = i;
        this.h = f;
        this.y = f2;
        this.t = j;
        this.q = j2;
        this.e = j3;
        this.b = j4;
        this.u = f3;
        this.r = f4;
        this.i = j5;
        this.f = j6;
        this.c = f5;
        this.l = f6;
        this.j = f7;
        this.d = f8;
        this.n = f9;
        this.f13628o = f10;
        this.a = f11;
        this.k = f12;
        this.m = f13;
    }

    public String toString() {
        return "VoipCallStatistics{sdk=" + this.p + ", codec=" + this.g + ", rate=" + this.s + ", downloadBw=" + this.h + ", uploadBw=" + this.y + ", packetsSent=" + this.t + ", packetsReceived=" + this.q + ", bytesSent=" + this.e + ", bytesReceived=" + this.b + ", sendLossRate=" + this.u + ", recvLossRate=" + this.r + ", incomingTooLate=" + this.i + ", incomingPacketsLost=" + this.f + ", averageJitterRx=" + this.c + ", minJitterRx=" + this.l + ", maxJitterRx=" + this.j + ", averageJitterTx=" + this.d + ", minJitterTx=" + this.n + ", maxJitterTx=" + this.f13628o + ", averageRtt=" + this.a + ", minRtt=" + this.k + ", maxRtt=" + this.m + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5079brw) {
            AbstractC5079brw abstractC5079brw = (AbstractC5079brw) obj;
            String str = this.p;
            if (str != null ? str.equals(abstractC5079brw.q()) : abstractC5079brw.q() == null) {
                String str2 = this.g;
                if (str2 != null ? str2.equals(abstractC5079brw.g()) : abstractC5079brw.g() == null) {
                    if (this.s == abstractC5079brw.p() && Float.floatToIntBits(this.h) == Float.floatToIntBits(abstractC5079brw.f()) && Float.floatToIntBits(this.y) == Float.floatToIntBits(abstractC5079brw.u()) && this.t == abstractC5079brw.t() && this.q == abstractC5079brw.r() && this.e == abstractC5079brw.a() && this.b == abstractC5079brw.d() && Float.floatToIntBits(this.u) == Float.floatToIntBits(abstractC5079brw.v()) && Float.floatToIntBits(this.r) == Float.floatToIntBits(abstractC5079brw.s()) && this.i == abstractC5079brw.j() && this.f == abstractC5079brw.i() && Float.floatToIntBits(this.c) == Float.floatToIntBits(abstractC5079brw.b()) && Float.floatToIntBits(this.l) == Float.floatToIntBits(abstractC5079brw.m()) && Float.floatToIntBits(this.j) == Float.floatToIntBits(abstractC5079brw.h()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(abstractC5079brw.c()) && Float.floatToIntBits(this.n) == Float.floatToIntBits(abstractC5079brw.k()) && Float.floatToIntBits(this.f13628o) == Float.floatToIntBits(abstractC5079brw.l()) && Float.floatToIntBits(this.a) == Float.floatToIntBits(abstractC5079brw.e()) && Float.floatToIntBits(this.k) == Float.floatToIntBits(abstractC5079brw.n()) && Float.floatToIntBits(this.m) == Float.floatToIntBits(abstractC5079brw.o())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.p;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = this.s;
        int floatToIntBits = Float.floatToIntBits(this.h);
        int floatToIntBits2 = Float.floatToIntBits(this.y);
        long j = this.t;
        long j2 = this.q;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.e;
        long j4 = this.b;
        int floatToIntBits3 = Float.floatToIntBits(this.u);
        int floatToIntBits4 = Float.floatToIntBits(this.r);
        long j5 = this.i;
        long j6 = this.f;
        int i3 = (int) (j6 ^ (j6 >>> 32));
        int floatToIntBits5 = Float.floatToIntBits(this.c);
        int floatToIntBits6 = Float.floatToIntBits(this.l);
        int floatToIntBits7 = Float.floatToIntBits(this.j);
        int floatToIntBits8 = Float.floatToIntBits(this.d);
        int floatToIntBits9 = Float.floatToIntBits(this.n);
        int floatToIntBits10 = Float.floatToIntBits(this.f13628o);
        return ((((((((((((((((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ floatToIntBits) * 1000003) ^ floatToIntBits2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ floatToIntBits3) * 1000003) ^ floatToIntBits4) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ i3) * 1000003) ^ floatToIntBits5) * 1000003) ^ floatToIntBits6) * 1000003) ^ floatToIntBits7) * 1000003) ^ floatToIntBits8) * 1000003) ^ floatToIntBits9) * 1000003) ^ floatToIntBits10) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ Float.floatToIntBits(this.k)) * 1000003) ^ Float.floatToIntBits(this.m);
    }

    /* renamed from: o.brl$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC5079brw.d {
        private Float a;
        private Long b;
        private Long c;
        private Float d;
        private Float e;
        private Long f;
        private Float g;
        private String h;
        private Float i;
        private Long j;
        private Float k;
        private Float l;
        private Float m;
        private Float n;

        /* renamed from: o  reason: collision with root package name */
        private Float f13629o;
        private Long p;
        private String q;
        private Float r;
        private Integer s;
        private Long t;
        private Float u;
        private Float x;

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d a(String str) {
            this.h = str;
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d c(String str) {
            this.q = str;
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d c(int i) {
            this.s = Integer.valueOf(i);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d a(float f) {
            this.i = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d n(float f) {
            this.u = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d h(long j) {
            this.p = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d a(long j) {
            this.t = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d e(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d l(float f) {
            this.x = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d o(float f) {
            this.r = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d c(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d d(long j) {
            this.j = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d b(float f) {
            this.d = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d j(float f) {
            this.n = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d d(float f) {
            this.g = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d c(float f) {
            this.e = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d i(float f) {
            this.f13629o = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d f(float f) {
            this.m = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d e(float f) {
            this.a = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d h(float f) {
            this.k = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw.d g(float f) {
            this.l = Float.valueOf(f);
            return this;
        }

        @Override // o.AbstractC5079brw.d
        public AbstractC5079brw d() {
            String str = "";
            if (this.s == null) {
                str = " rate";
            }
            if (this.i == null) {
                str = str + " downloadBw";
            }
            if (this.u == null) {
                str = str + " uploadBw";
            }
            if (this.p == null) {
                str = str + " packetsSent";
            }
            if (this.t == null) {
                str = str + " packetsReceived";
            }
            if (this.b == null) {
                str = str + " bytesSent";
            }
            if (this.c == null) {
                str = str + " bytesReceived";
            }
            if (this.x == null) {
                str = str + " sendLossRate";
            }
            if (this.r == null) {
                str = str + " recvLossRate";
            }
            if (this.f == null) {
                str = str + " incomingTooLate";
            }
            if (this.j == null) {
                str = str + " incomingPacketsLost";
            }
            if (this.d == null) {
                str = str + " averageJitterRx";
            }
            if (this.n == null) {
                str = str + " minJitterRx";
            }
            if (this.g == null) {
                str = str + " maxJitterRx";
            }
            if (this.e == null) {
                str = str + " averageJitterTx";
            }
            if (this.f13629o == null) {
                str = str + " minJitterTx";
            }
            if (this.m == null) {
                str = str + " maxJitterTx";
            }
            if (this.a == null) {
                str = str + " averageRtt";
            }
            if (this.k == null) {
                str = str + " minRtt";
            }
            if (this.l == null) {
                str = str + " maxRtt";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new C5070brn(this.q, this.h, this.s.intValue(), this.i.floatValue(), this.u.floatValue(), this.p.longValue(), this.t.longValue(), this.b.longValue(), this.c.longValue(), this.x.floatValue(), this.r.floatValue(), this.f.longValue(), this.j.longValue(), this.d.floatValue(), this.n.floatValue(), this.g.floatValue(), this.e.floatValue(), this.f13629o.floatValue(), this.m.floatValue(), this.a.floatValue(), this.k.floatValue(), this.l.floatValue());
        }
    }
}
