package o;

/* renamed from: o.Ll  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1018Ll {

    /* renamed from: o.Ll$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1018Ll {
        private final String a;

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c((Object) this.a, (Object) ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Plain(string=" + str + ")";
        }
    }

    public /* synthetic */ AbstractC1018Ll(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC1018Ll() {
    }

    /* renamed from: o.Ll$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC1018Ll {
        private final String d;

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.d, (Object) ((d) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "Formatted(markdown=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }
}
