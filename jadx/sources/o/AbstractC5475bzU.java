package o;

/* renamed from: o.bzU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5475bzU extends C9941zV {
    public /* synthetic */ AbstractC5475bzU(C8627dsp c8627dsp) {
        this();
    }

    /* renamed from: o.bzU$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC5475bzU {
        private final AbstractC3498bAb c;
        private final AbstractC3498bAb d;

        public final AbstractC3498bAb b() {
            return this.c;
        }

        public final AbstractC3498bAb c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return C8632dsu.c(this.c, iVar.c) && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            AbstractC3498bAb abstractC3498bAb = this.c;
            AbstractC3498bAb abstractC3498bAb2 = this.d;
            return "ScreenChanged(oldScreen=" + abstractC3498bAb + ", newScreen=" + abstractC3498bAb2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AbstractC3498bAb abstractC3498bAb, AbstractC3498bAb abstractC3498bAb2) {
            super(null);
            C8632dsu.c((Object) abstractC3498bAb, "");
            C8632dsu.c((Object) abstractC3498bAb2, "");
            this.c = abstractC3498bAb;
            this.d = abstractC3498bAb2;
        }
    }

    private AbstractC5475bzU() {
    }

    /* renamed from: o.bzU$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5475bzU {
        private final String c;

        public final String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c((Object) this.c, (Object) ((c) obj).c);
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            String str = this.c;
            return "PhoneNumberUpdated(phoneNumber=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.c = str;
        }
    }

    /* renamed from: o.bzU$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC5475bzU {
        private final String b;

        public final String a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && C8632dsu.c((Object) this.b, (Object) ((l) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            String str = this.b;
            return "VerifyPinUpdated(pin=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
        }
    }

    /* renamed from: o.bzU$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5475bzU {
        public static final d e = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.bzU$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC5475bzU {
        public static final j b = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: o.bzU$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC5475bzU {
        public static final f b = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: o.bzU$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5475bzU {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.bzU$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC5475bzU {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.bzU$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC5475bzU {
        public static final g d = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: o.bzU$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC5475bzU {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: o.bzU$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC5475bzU {
        public static final e c = new e();

        private e() {
            super(null);
        }
    }
}
