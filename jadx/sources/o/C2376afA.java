package o;

import j$.time.Instant;
import java.util.List;

/* renamed from: o.afA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2376afA implements InterfaceC9037hy {
    private final String d;
    private final List<c> e;

    public final List<c> a() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2376afA) {
            C2376afA c2376afA = (C2376afA) obj;
            return C8632dsu.c((Object) this.d, (Object) c2376afA.d) && C8632dsu.c(this.e, c2376afA.e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        List<c> list = this.e;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.d;
        List<c> list = this.e;
        return "LiveEventArtwork(__typename=" + str + ", liveArtwork=" + list + ")";
    }

    public C2376afA(String str, List<c> list) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = list;
    }

    /* renamed from: o.afA$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final d c;
        private final e e;

        public final d b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final e d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.a, (Object) cVar.a) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c(this.e, cVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            d dVar = this.c;
            int hashCode2 = dVar == null ? 0 : dVar.hashCode();
            e eVar = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            d dVar = this.c;
            e eVar = this.e;
            return "LiveArtwork(__typename=" + str + ", timeRange=" + dVar + ", image=" + eVar + ")";
        }

        public c(String str, d dVar, e eVar) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.c = dVar;
            this.e = eVar;
        }
    }

    /* renamed from: o.afA$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final Instant c;
        private final String d;
        private final Instant e;

        public final String a() {
            return this.d;
        }

        public final Instant b() {
            return this.c;
        }

        public final Instant c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.c, dVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Instant instant = this.e;
            int hashCode2 = instant == null ? 0 : instant.hashCode();
            Instant instant2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            Instant instant = this.e;
            Instant instant2 = this.c;
            return "TimeRange(__typename=" + str + ", startTime=" + instant + ", endTime=" + instant2 + ")";
        }

        public d(String str, Instant instant, Instant instant2) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = instant;
            this.c = instant2;
        }
    }

    /* renamed from: o.afA$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final String c;
        private final String d;
        private final String e;

        public final String a() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c((Object) this.c, (Object) eVar.c) && C8632dsu.c((Object) this.e, (Object) eVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.c;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.d;
            String str2 = this.c;
            String str3 = this.e;
            return "Image(__typename=" + str + ", key=" + str2 + ", url=" + str3 + ")";
        }

        public e(String str, String str2, String str3) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.c = str2;
            this.e = str3;
        }
    }
}
