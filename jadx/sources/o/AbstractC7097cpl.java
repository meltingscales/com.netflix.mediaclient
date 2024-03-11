package o;

/* renamed from: o.cpl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7097cpl extends C9941zV {
    public /* synthetic */ AbstractC7097cpl(C8627dsp c8627dsp) {
        this();
    }

    public abstract String e();

    private AbstractC7097cpl() {
    }

    /* renamed from: o.cpl$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7097cpl {
        private final String d;

        @Override // o.AbstractC7097cpl
        public String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c((Object) this.d, (Object) ((b) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "NegativeChoice(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }

    /* renamed from: o.cpl$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC7097cpl {
        private final String a;

        @Override // o.AbstractC7097cpl
        public String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C8632dsu.c((Object) this.a, (Object) ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "PositiveChoice(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* renamed from: o.cpl$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7097cpl {
        private final String e;

        @Override // o.AbstractC7097cpl
        public String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c((Object) this.e, (Object) ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            String str = this.e;
            return "NeutralChoice(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }
    }

    /* renamed from: o.cpl$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC7097cpl {
        private final String d;

        @Override // o.AbstractC7097cpl
        public String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c((Object) this.d, (Object) ((c) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "OpenNotificationSettings(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }

    /* renamed from: o.cpl$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC7097cpl {
        private final String d;

        @Override // o.AbstractC7097cpl
        public String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C8632dsu.c((Object) this.d, (Object) ((e) obj).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "PositiveChoicePreTiramisu(group=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
        }
    }
}
