package o;

import com.netflix.mediaclient.android.app.Status;

/* renamed from: o.cgh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6618cgh {
    public /* synthetic */ AbstractC6618cgh(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6618cgh() {
    }

    /* renamed from: o.cgh$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6618cgh {
        private final InterfaceC5227bul a;
        private final String b;
        private final InterfaceC5194buE e;

        public final String a() {
            return this.b;
        }

        public final InterfaceC5194buE d() {
            return this.e;
        }

        public final InterfaceC5227bul e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((this.b.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.b;
            InterfaceC5194buE interfaceC5194buE = this.e;
            InterfaceC5227bul interfaceC5227bul = this.a;
            return "Episode(uuid=" + str + ", showDetails=" + interfaceC5194buE + ", episodeDetails=" + interfaceC5227bul + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC5194buE interfaceC5194buE, InterfaceC5227bul interfaceC5227bul) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC5194buE, "");
            C8632dsu.c((Object) interfaceC5227bul, "");
            this.b = str;
            this.e = interfaceC5194buE;
            this.a = interfaceC5227bul;
        }
    }

    /* renamed from: o.cgh$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6618cgh {
        private final InterfaceC5238buw a;
        private final String d;

        public final InterfaceC5238buw a() {
            return this.a;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.d, (Object) eVar.d) && C8632dsu.c(this.a, eVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.d;
            InterfaceC5238buw interfaceC5238buw = this.a;
            return "Movie(uuid=" + str + ", movieDetails=" + interfaceC5238buw + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC5238buw interfaceC5238buw) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC5238buw, "");
            this.d = str;
            this.a = interfaceC5238buw;
        }
    }

    /* renamed from: o.cgh$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6618cgh {
        private final String b;
        private final InterfaceC5227bul d;

        public final InterfaceC5227bul a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.d, cVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            String str = this.b;
            InterfaceC5227bul interfaceC5227bul = this.d;
            return "NextEpisode(uuid=" + str + ", episodeDetails=" + interfaceC5227bul + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC5227bul interfaceC5227bul) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) interfaceC5227bul, "");
            this.b = str;
            this.d = interfaceC5227bul;
        }
    }

    /* renamed from: o.cgh$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6618cgh {
        private final String a;
        private final String b;
        private final Status c;

        public final Status b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.b, (Object) bVar.b) && C8632dsu.c(this.c, bVar.c) && C8632dsu.c((Object) this.a, (Object) bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            Status status = this.c;
            int hashCode2 = status == null ? 0 : status.hashCode();
            String str = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.b;
            Status status = this.c;
            String str2 = this.a;
            return "Error(uuid=" + str + ", res=" + status + ", message=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Status status, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.c = status;
            this.a = str2;
        }

        public /* synthetic */ b(String str, Status status, String str2, int i, C8627dsp c8627dsp) {
            this(str, (i & 2) != 0 ? null : status, (i & 4) != 0 ? null : str2);
        }
    }
}
