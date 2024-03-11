package o;

/* renamed from: o.ahq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2533ahq implements InterfaceC9037hy {
    private final String d;
    private final b e;

    public final b a() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2533ahq) {
            C2533ahq c2533ahq = (C2533ahq) obj;
            return C8632dsu.c((Object) this.d, (Object) c2533ahq.d) && C8632dsu.c(this.e, c2533ahq.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        b bVar = this.e;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        b bVar = this.e;
        return "NextEpisodeInfo(__typename=" + str + ", onEpisode=" + bVar + ")";
    }

    public C2533ahq(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = bVar;
    }

    /* renamed from: o.ahq$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final c c;

        public final c a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C8632dsu.c(this.c, ((b) obj).c);
        }

        public int hashCode() {
            c cVar = this.c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            c cVar = this.c;
            return "OnEpisode(nextEpisode=" + cVar + ")";
        }

        public b(c cVar) {
            this.c = cVar;
        }
    }

    /* renamed from: o.ahq$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final int a;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.e, (Object) cVar.e) && this.a == cVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            String str = this.e;
            int i = this.a;
            return "NextEpisode(__typename=" + str + ", videoId=" + i + ")";
        }

        public c(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.a = i;
        }
    }
}
