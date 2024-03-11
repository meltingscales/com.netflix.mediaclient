package o;

/* renamed from: o.aef  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2354aef implements InterfaceC9037hy {
    private final d c;
    private final String d;

    public final d a() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2354aef) {
            C2354aef c2354aef = (C2354aef) obj;
            return C8632dsu.c((Object) this.d, (Object) c2354aef.d) && C8632dsu.c(this.c, c2354aef.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        d dVar = this.c;
        return (hashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.d;
        d dVar = this.c;
        return "DownloadsForYouShow(__typename=" + str + ", currentEpisode=" + dVar + ")";
    }

    public C2354aef(String str, d dVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.c = dVar;
    }

    /* renamed from: o.aef$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Boolean b;
        private final int d;
        private final String e;

        public final int a() {
            return this.d;
        }

        public final Boolean c() {
            return this.b;
        }

        public final String d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.e, (Object) dVar.e) && this.d == dVar.d && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = Integer.hashCode(this.d);
            Boolean bool = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            String str = this.e;
            int i = this.d;
            Boolean bool = this.b;
            return "CurrentEpisode(__typename=" + str + ", videoId=" + i + ", isAvailableForDownload=" + bool + ")";
        }

        public d(String str, int i, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = i;
            this.b = bool;
        }
    }
}
