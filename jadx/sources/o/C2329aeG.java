package o;

/* renamed from: o.aeG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2329aeG implements InterfaceC9037hy {
    private final String b;
    private final b c;

    public final b d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2329aeG) {
            C2329aeG c2329aeG = (C2329aeG) obj;
            return C8632dsu.c((Object) this.b, (Object) c2329aeG.b) && C8632dsu.c(this.c, c2329aeG.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        b bVar = this.c;
        return (hashCode * 31) + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.b;
        b bVar = this.c;
        return "FullDpLiveEventViewable(__typename=" + str + ", liveEvent=" + bVar + ")";
    }

    public C2329aeG(String str, b bVar) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.c = bVar;
    }

    /* renamed from: o.aeG$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C2436afz b;
        private final String c;

        public final String d() {
            return this.c;
        }

        public final C2436afz e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.c;
            C2436afz c2436afz = this.b;
            return "LiveEvent(__typename=" + str + ", liveEventData=" + c2436afz + ")";
        }

        public b(String str, C2436afz c2436afz) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c2436afz, "");
            this.c = str;
            this.b = c2436afz;
        }
    }
}
