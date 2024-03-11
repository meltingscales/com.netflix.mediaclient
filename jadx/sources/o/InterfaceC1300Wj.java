package o;

import io.reactivex.Observable;

/* renamed from: o.Wj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1300Wj {
    Observable<bDW> b(String str);

    Observable<bDW> e(d dVar);

    /* renamed from: o.Wj$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final long a;
        private final C1291Wa b;
        private final int c;
        private final int d;
        private final String e;
        private final String h;

        public final C1291Wa a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final int c() {
            return this.d;
        }

        public final long d() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.h, (Object) dVar.h) && this.a == dVar.a && this.c == dVar.c && this.d == dVar.d && C8632dsu.c((Object) this.e, (Object) dVar.e) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public final String f() {
            return this.h;
        }

        public int hashCode() {
            int hashCode = this.h.hashCode();
            int hashCode2 = Long.hashCode(this.a);
            int hashCode3 = Integer.hashCode(this.c);
            int hashCode4 = Integer.hashCode(this.d);
            String str = this.e;
            int hashCode5 = str == null ? 0 : str.hashCode();
            C1291Wa c1291Wa = this.b;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (c1291Wa != null ? c1291Wa.hashCode() : 0);
        }

        public String toString() {
            String str = this.h;
            long j = this.a;
            int i = this.c;
            int i2 = this.d;
            String str2 = this.e;
            C1291Wa c1291Wa = this.b;
            return "FetchEpisodeListData(seasonId=" + str + ", requestId=" + j + ", episodeStartIndex=" + i + ", episodeEndIndex=" + i2 + ", lastEpisodeCursor=" + str2 + ", seasonDetails=" + c1291Wa + ")";
        }

        public d(String str, long j, int i, int i2, String str2, C1291Wa c1291Wa) {
            C8632dsu.c((Object) str, "");
            this.h = str;
            this.a = j;
            this.c = i;
            this.d = i2;
            this.e = str2;
            this.b = c1291Wa;
        }
    }
}
