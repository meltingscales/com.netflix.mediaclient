package o;

/* renamed from: o.cjM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6756cjM extends C9941zV {
    public /* synthetic */ AbstractC6756cjM(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.cjM$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6756cjM {
        public static final c d = new c();

        private c() {
            super(null);
        }
    }

    private AbstractC6756cjM() {
    }

    /* renamed from: o.cjM$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC6756cjM {
        public static final h c = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: o.cjM$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6756cjM {
        public static final b c = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cjM$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6756cjM {
        public static final e e = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.cjM$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC6756cjM {
        public static final f e = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: o.cjM$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6756cjM {
        private final boolean d;

        public final boolean a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.d == ((d) obj).d;
        }

        public int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public String toString() {
            boolean z = this.d;
            return "ResendCode(isBlockingUma=" + z + ")";
        }

        public d(boolean z) {
            super(null);
            this.d = z;
        }
    }

    /* renamed from: o.cjM$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC6756cjM {
        private final String a;
        private final boolean c;

        public final String a() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && this.c == gVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.a;
            boolean z = this.c;
            return "VerifyPinUpdated(pin=" + str + ", isBlockingUma=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = z;
        }
    }

    /* renamed from: o.cjM$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6756cjM {
        private final String e;

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
            return "LinkCopied(link=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.e = str;
        }
    }
}
