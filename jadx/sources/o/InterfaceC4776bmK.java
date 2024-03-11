package o;

import java.util.List;

/* renamed from: o.bmK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4776bmK {
    e a(String str);

    /* renamed from: o.bmK$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final List<b> b;
        private final b c;

        public final List<b> c() {
            return this.b;
        }

        public final b e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            b bVar = this.c;
            return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            b bVar = this.c;
            List<b> list = this.b;
            return "AllPlaySessionStat(lastClosedSession=" + bVar + ", otherSessionStatList=" + list + ")";
        }

        public e(b bVar, List<b> list) {
            C8632dsu.c((Object) list, "");
            this.c = bVar;
            this.b = list;
        }
    }

    /* renamed from: o.bmK$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Long a;
        private final String d;
        private final long e;

        public final String a() {
            return this.d;
        }

        public final long b() {
            return this.e;
        }

        public final Long c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && this.e == bVar.e && C8632dsu.c(this.a, bVar.a);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = Long.hashCode(this.e);
            Long l = this.a;
            return (((hashCode * 31) + hashCode2) * 31) + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            String str = this.d;
            long j = this.e;
            Long l = this.a;
            return "PlaySessionStat(pxId=" + str + ", ageInMs=" + j + ", sessionCloseTime=" + l + ")";
        }

        public b(String str, long j, Long l) {
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = j;
            this.a = l;
        }
    }
}
