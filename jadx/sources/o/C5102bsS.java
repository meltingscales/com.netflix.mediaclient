package o;

import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;

/* renamed from: o.bsS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5102bsS {
    public static final b d = new b(null);
    private final boolean a;
    private final long b;
    private final boolean c;
    private final long e;
    private final PlayerPrefetchSource i;

    public final boolean a() {
        return this.c;
    }

    public final PlayerPrefetchSource b() {
        return this.i;
    }

    public final boolean c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5102bsS) {
            C5102bsS c5102bsS = (C5102bsS) obj;
            return this.e == c5102bsS.e && this.b == c5102bsS.b && this.i == c5102bsS.i && this.a == c5102bsS.a && this.c == c5102bsS.c;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.e) * 31) + Long.hashCode(this.b)) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        long j = this.e;
        long j2 = this.b;
        PlayerPrefetchSource playerPrefetchSource = this.i;
        boolean z = this.a;
        boolean z2 = this.c;
        return "PlayerPrepareRequest(playableId=" + j + ", bookmarkMs=" + j2 + ", prefetchSource=" + playerPrefetchSource + ", isBranching=" + z + ", isLive=" + z2 + ")";
    }

    public C5102bsS(long j, long j2, PlayerPrefetchSource playerPrefetchSource, boolean z, boolean z2) {
        C8632dsu.c((Object) playerPrefetchSource, "");
        this.e = j;
        this.b = j2;
        this.i = playerPrefetchSource;
        this.a = z;
        this.c = z2;
    }

    /* renamed from: o.bsS$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public static /* synthetic */ C5102bsS d(b bVar, String str, long j, PlayerPrefetchSource playerPrefetchSource, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            return bVar.a(str, j, playerPrefetchSource, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }

        public final C5102bsS a(String str, long j, PlayerPrefetchSource playerPrefetchSource, boolean z, boolean z2) {
            C8632dsu.c((Object) playerPrefetchSource, "");
            if (str == null) {
                return null;
            }
            try {
                return new C5102bsS(Long.parseLong(str), j, playerPrefetchSource, z, z2);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }
}
