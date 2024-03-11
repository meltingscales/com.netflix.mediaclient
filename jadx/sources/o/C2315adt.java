package o;

import j$.time.Instant;

/* renamed from: o.adt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2315adt implements InterfaceC9037hy {
    private final String c;
    private final e d;

    public final e b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2315adt) {
            C2315adt c2315adt = (C2315adt) obj;
            return C8632dsu.c((Object) this.c, (Object) c2315adt.c) && C8632dsu.c(this.d, c2315adt.d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        e eVar = this.d;
        return (hashCode * 31) + (eVar == null ? 0 : eVar.hashCode());
    }

    public String toString() {
        String str = this.c;
        e eVar = this.d;
        return "BroadcastInfo(__typename=" + str + ", broadcastInfo=" + eVar + ")";
    }

    public C2315adt(String str, e eVar) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = eVar;
    }

    /* renamed from: o.adt$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String a;
        private final String c;
        private final Instant e;

        public final Instant a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.a, (Object) eVar.a) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c(this.e, eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Instant instant = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (instant != null ? instant.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.c;
            Instant instant = this.e;
            return "BroadcastInfo(__typename=" + str + ", distributorName=" + str2 + ", releaseDate=" + instant + ")";
        }

        public e(String str, String str2, Instant instant) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = str2;
            this.e = instant;
        }
    }
}
