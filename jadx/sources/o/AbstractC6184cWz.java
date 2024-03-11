package o;

import java.util.List;

/* renamed from: o.cWz  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6184cWz extends C9941zV {
    public /* synthetic */ AbstractC6184cWz(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6184cWz() {
    }

    /* renamed from: o.cWz$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC6184cWz {
        private final String b;
        private final boolean c;

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.b, (Object) aVar.b) && this.c == aVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.c;
            return "CheckDevice(uuid=" + str + ", checked=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = z;
        }
    }

    /* renamed from: o.cWz$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC6184cWz {
        private final int b;
        private final String e;

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.b == cVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            String str = this.e;
            int i = this.b;
            return "UpdateStatus(uuid=" + str + ", status=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.b = i;
        }
    }

    /* renamed from: o.cWz$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC6184cWz {
        public static final b d = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cWz$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC6184cWz {
        public static final e e = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.cWz$d */
    /* loaded from: classes6.dex */
    public static abstract class d extends AbstractC6184cWz {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        public boolean equals(Object obj) {
            return this == obj;
        }

        private d() {
            super(null);
        }

        public int hashCode() {
            return getClass().getName().hashCode();
        }

        /* renamed from: o.cWz$d$e */
        /* loaded from: classes6.dex */
        public static final class e extends d {
            public static final e c = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: o.cWz$d$c */
        /* loaded from: classes6.dex */
        public static final class c extends d {
            public static final c d = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: o.cWz$d$j */
        /* loaded from: classes6.dex */
        public static final class j extends d {
            public static final j e = new j();

            private j() {
                super(null);
            }
        }

        /* renamed from: o.cWz$d$d  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0111d extends d {
            public static final C0111d c = new C0111d();

            private C0111d() {
                super(null);
            }
        }

        /* renamed from: o.cWz$d$b */
        /* loaded from: classes6.dex */
        public static final class b extends d {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: o.cWz$d$h */
        /* loaded from: classes6.dex */
        public static final class h extends d {
            private final List<cVQ> b;

            public final List<cVQ> d() {
                return this.b;
            }

            @Override // o.AbstractC6184cWz.d
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && C8632dsu.c(this.b, ((h) obj).b);
            }

            @Override // o.AbstractC6184cWz.d
            public int hashCode() {
                return this.b.hashCode();
            }

            public String toString() {
                List<cVQ> list = this.b;
                return "ShowDevices(devices=" + list + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(List<cVQ> list) {
                super(null);
                C8632dsu.c((Object) list, "");
                this.b = list;
            }
        }

        /* renamed from: o.cWz$d$a */
        /* loaded from: classes6.dex */
        public static final class a extends d {
            public static final a b = new a();

            private a() {
                super(null);
            }
        }
    }
}
