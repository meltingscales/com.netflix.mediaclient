package o;

/* renamed from: o.dcd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8027dcd extends C9941zV {
    public /* synthetic */ AbstractC8027dcd(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.dcd$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC8027dcd {
        private final C7969dbY a;

        public final C7969dbY c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C7969dbY c7969dbY = this.a;
            return "Open(userMark=" + c7969dbY + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7969dbY c7969dbY) {
            super(null);
            C8632dsu.c((Object) c7969dbY, "");
            this.a = c7969dbY;
        }
    }

    private AbstractC8027dcd() {
    }

    /* renamed from: o.dcd$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC8027dcd {
        private final C7969dbY b;

        public final C7969dbY d() {
            return this.b;
        }

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
            C7969dbY c7969dbY = this.b;
            return "Select(userMark=" + c7969dbY + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C7969dbY c7969dbY) {
            super(null);
            C8632dsu.c((Object) c7969dbY, "");
            this.b = c7969dbY;
        }
    }

    /* renamed from: o.dcd$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC8027dcd {
        private final C7969dbY c;

        public final C7969dbY e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c(this.c, ((e) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            C7969dbY c7969dbY = this.c;
            return "Remove(userMark=" + c7969dbY + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7969dbY c7969dbY) {
            super(null);
            C8632dsu.c((Object) c7969dbY, "");
            this.c = c7969dbY;
        }
    }

    /* renamed from: o.dcd$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC8027dcd {
        private final C7969dbY a;

        public final C7969dbY e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            C7969dbY c7969dbY = this.a;
            return "Share(userMark=" + c7969dbY + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7969dbY c7969dbY) {
            super(null);
            C8632dsu.c((Object) c7969dbY, "");
            this.a = c7969dbY;
        }
    }
}
