package o;

/* loaded from: classes3.dex */
public abstract class TY {
    public /* synthetic */ TY(C8627dsp c8627dsp) {
        this();
    }

    /* loaded from: classes3.dex */
    public static final class a extends TY {
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c((Object) this.d, (Object) ((a) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "Success(token=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }

    private TY() {
    }

    /* loaded from: classes3.dex */
    public static final class d extends TY {
        private final Exception b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            Exception exc = this.b;
            return "Error(exception=" + exc + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(null);
            C8632dsu.c((Object) exc, "");
            this.b = exc;
        }
    }
}
