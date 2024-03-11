package o;

/* renamed from: o.we  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9791we {
    public /* synthetic */ AbstractC9791we(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC9791we() {
    }

    /* renamed from: o.we$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC9791we {
        public static final h c = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: o.we$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC9791we {
        public static final i d = new i();

        private i() {
            super(null);
        }
    }

    /* renamed from: o.we$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC9791we {
        public static final j c = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: o.we$s */
    /* loaded from: classes2.dex */
    public static final class s extends AbstractC9791we {
        public static final s c = new s();

        private s() {
            super(null);
        }
    }

    /* renamed from: o.we$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC9791we {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: o.we$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC9791we {
        private final int c;

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.c == ((n) obj).c;
        }

        public int hashCode() {
            return Integer.hashCode(this.c);
        }

        public String toString() {
            int i = this.c;
            return "Seeking(positionSeconds=" + i + ")";
        }

        public n(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.we$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC9791we {
        public static final l b = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: o.we$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC9791we {
        private final int c;

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.c == ((m) obj).c;
        }

        public int hashCode() {
            return Integer.hashCode(this.c);
        }

        public String toString() {
            int i = this.c;
            return "SeekConfirmed(positionSeconds=" + i + ")";
        }

        public m(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.we$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC9791we {
        private final int c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.c == ((q) obj).c;
        }

        public int hashCode() {
            return Integer.hashCode(this.c);
        }

        public String toString() {
            int i = this.c;
            return "SkipTapped(tapCountSoFar=" + i + ")";
        }

        public q(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.we$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC9791we {
        private final int a;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.a == kVar.a && this.d == kVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.a;
            int i2 = this.d;
            return "SkipConfirmed(tapCount=" + i + ", secondsAmount=" + i2 + ")";
        }

        public k(int i, int i2) {
            super(null);
            this.a = i;
            this.d = i2;
        }
    }

    /* renamed from: o.we$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC9791we {
        public static final e c = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.we$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC9791we {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    /* renamed from: o.we$p */
    /* loaded from: classes2.dex */
    public static final class p extends AbstractC9791we {
        private final Object a;

        public final Object d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && C8632dsu.c(this.a, ((p) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            Object obj = this.a;
            return "SubtitlesClick(language=" + obj + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj) {
            super(null);
            C8632dsu.c(obj, "");
            this.a = obj;
        }
    }

    /* renamed from: o.we$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC9791we {
        private final String d;
        private final String e;

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.e, (Object) bVar.e) && C8632dsu.c((Object) this.d, (Object) bVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.e;
            String str2 = this.d;
            return "EpisodesClick(showId=" + str + ", episodeId=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.d = str2;
        }
    }

    /* renamed from: o.we$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC9791we {
        public static final a e = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o.we$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC9791we {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: o.we$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC9791we {
        private final String a;
        private final boolean b;
        private final String e;

        public final String c() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.a, (Object) gVar.a) && C8632dsu.c((Object) this.e, (Object) gVar.e) && this.b == gVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            boolean z = this.b;
            return "PostPlayNextEpisodeClick(episodeId=" + str + ", showId=" + str2 + ", previewProtected=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, boolean z) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
            this.b = z;
        }
    }

    /* renamed from: o.we$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC9791we {
        private final String d;

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && C8632dsu.c((Object) this.d, (Object) ((o) obj).d);
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.d;
            return "SkipIntroClick(skipIntroType=" + str + ")";
        }

        public o(String str) {
            super(null);
            this.d = str;
        }
    }
}
