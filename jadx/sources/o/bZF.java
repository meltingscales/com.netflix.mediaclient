package o;

import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import j$.time.Instant;

/* loaded from: classes4.dex */
public abstract class bZF {
    private final bZC a;
    private final Instant b;
    private final int c;
    private final Instant d;

    public /* synthetic */ bZF(Instant instant, Instant instant2, int i, bZC bzc, C8627dsp c8627dsp) {
        this(instant, instant2, i, bzc);
    }

    public Instant a() {
        return this.b;
    }

    public bZC b() {
        return this.a;
    }

    public Instant c() {
        return this.d;
    }

    private bZF(Instant instant, Instant instant2, int i, bZC bzc) {
        this.d = instant;
        this.b = instant2;
        this.c = i;
        this.a = bzc;
    }

    /* loaded from: classes4.dex */
    public static final class b extends bZF {
        private final Instant a;
        private final Instant b;
        private final int c;
        private final int d;
        private final bZC e;

        @Override // o.bZF
        public Instant a() {
            return this.b;
        }

        @Override // o.bZF
        public bZC b() {
            return this.e;
        }

        @Override // o.bZF
        public Instant c() {
            return this.a;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.b, bVar.b) && this.c == bVar.c && C8632dsu.c(this.e, bVar.e) && this.d == bVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            Instant instant = this.a;
            Instant instant2 = this.b;
            int i = this.c;
            bZC bzc = this.e;
            int i2 = this.d;
            return "Episode(startTime=" + instant + ", endTime=" + instant2 + ", videoId=" + i + ", boxArtUrls=" + bzc + ", episodeNumber=" + i2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Instant instant, Instant instant2, int i, bZC bzc, int i2) {
            super(instant, instant2, i, bzc, null);
            C8632dsu.c((Object) instant, "");
            C8632dsu.c((Object) instant2, "");
            C8632dsu.c((Object) bzc, "");
            this.a = instant;
            this.b = instant2;
            this.c = i;
            this.e = bzc;
            this.d = i2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends bZF {
        private final Instant a;
        private final bZC b;
        private final int c;
        private final Instant e;

        @Override // o.bZF
        public Instant a() {
            return this.a;
        }

        @Override // o.bZF
        public bZC b() {
            return this.b;
        }

        @Override // o.bZF
        public Instant c() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.a, eVar.a) && this.c == eVar.c && C8632dsu.c(this.b, eVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.b.hashCode();
        }

        public String toString() {
            Instant instant = this.e;
            Instant instant2 = this.a;
            int i = this.c;
            bZC bzc = this.b;
            return "Movie(startTime=" + instant + ", endTime=" + instant2 + ", videoId=" + i + ", boxArtUrls=" + bzc + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Instant instant, Instant instant2, int i, bZC bzc) {
            super(instant, instant2, i, bzc, null);
            C8632dsu.c((Object) instant, "");
            C8632dsu.c((Object) instant2, "");
            C8632dsu.c((Object) bzc, "");
            this.e = instant;
            this.a = instant2;
            this.c = i;
            this.b = bzc;
        }
    }

    public final LiveState d(Instant instant) {
        C8632dsu.c((Object) instant, "");
        return instant.e(c()) ? LiveState.c : e(instant) ? LiveState.a : instant.c(a()) ? LiveState.d : LiveState.e;
    }

    private final boolean e(Instant instant) {
        return (instant.c(c()) && instant.e(a())) || C8632dsu.c(instant, c()) || C8632dsu.c(instant, a());
    }
}
