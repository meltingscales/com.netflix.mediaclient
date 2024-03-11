package o;

/* renamed from: o.bNs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3870bNs {
    public /* synthetic */ AbstractC3870bNs(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.bNs$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3870bNs {
        public static final a c = new a();

        private a() {
            super(null);
        }
    }

    private AbstractC3870bNs() {
    }

    /* renamed from: o.bNs$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3870bNs {
        private final String c;

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c((Object) this.c, (Object) ((b) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            String str = this.c;
            return "NavigateToGameController(beaconCode=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* renamed from: o.bNs$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3870bNs {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }
}
