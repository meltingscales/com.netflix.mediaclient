package o;

/* renamed from: o.Ld  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1010Ld {
    public /* synthetic */ AbstractC1010Ld(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.Ld$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1010Ld {
        public static final int d = 0;
        private final int c;

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.c == ((d) obj).c;
        }

        public int hashCode() {
            return Integer.hashCode(this.c);
        }

        public String toString() {
            int i = this.c;
            return "Determinate(progress=" + i + ")";
        }

        public d(int i) {
            super(null);
            this.c = i;
        }
    }

    private AbstractC1010Ld() {
    }

    /* renamed from: o.Ld$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC1010Ld {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }
}
