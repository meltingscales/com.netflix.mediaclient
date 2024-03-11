package o;

/* renamed from: o.bwU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5316bwU extends C9941zV {
    public /* synthetic */ AbstractC5316bwU(C8627dsp c8627dsp) {
        this();
    }

    public abstract String e();

    private AbstractC5316bwU() {
    }

    /* renamed from: o.bwU$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5316bwU {
        private final String e;

        @Override // o.AbstractC5316bwU
        public String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.e, (Object) ((d) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "CloseUpSellDialog(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }
    }

    /* renamed from: o.bwU$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5316bwU {
        private final String c;
        private final CharSequence e;

        @Override // o.AbstractC5316bwU
        public String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.e, aVar.e) && C8632dsu.c((Object) this.c, (Object) aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.e;
            String str = this.c;
            return "LinkCopied(link=" + ((Object) charSequence) + ", group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence, String str) {
            super(null);
            C8632dsu.c((Object) charSequence, "");
            C8632dsu.c((Object) str, "");
            this.e = charSequence;
            this.c = str;
        }
    }

    /* renamed from: o.bwU$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC5316bwU {
        private final String b;

        @Override // o.AbstractC5316bwU
        public String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c((Object) this.b, (Object) ((e) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "AcknowledgeDowngrade(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }
}
