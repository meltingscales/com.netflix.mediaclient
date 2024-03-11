package o;

/* renamed from: o.cBf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5595cBf extends cBA {
    public /* synthetic */ AbstractC5595cBf(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC5595cBf() {
        super(null);
    }

    /* renamed from: o.cBf$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5595cBf {
        private final int e;

        public final int d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.e == ((d) obj).e;
        }

        public int hashCode() {
            return Integer.hashCode(this.e);
        }

        public String toString() {
            int i = this.e;
            return "PlayerInLiveWaitingRoom(videoId=" + i + ")";
        }

        public d(int i) {
            super(null);
            this.e = i;
        }
    }

    /* renamed from: o.cBf$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC5595cBf {
        public static final b c = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cBf$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5595cBf {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: o.cBf$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC5595cBf {
        private final int a;

        public final int e() {
            return this.a;
        }

        public e(int i) {
            super(null);
            this.a = i;
        }
    }

    /* renamed from: o.cBf$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5595cBf {
        private final boolean e;

        public final boolean c() {
            return this.e;
        }

        public a(boolean z) {
            super(null);
            this.e = z;
        }
    }

    /* renamed from: o.cBf$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC5595cBf {
        public static final g b = new g();

        private g() {
            super(null);
        }
    }
}
