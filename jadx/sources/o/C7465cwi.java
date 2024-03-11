package o;

/* renamed from: o.cwi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7465cwi {
    private final String a;
    private final String b;
    public static final d e = new d(null);
    private static final C7465cwi c = new C7465cwi("", "");

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7465cwi) {
            C7465cwi c7465cwi = (C7465cwi) obj;
            return C8632dsu.c((Object) this.a, (Object) c7465cwi.a) && C8632dsu.c((Object) this.b, (Object) c7465cwi.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return "PauseAdsData(adUrl=" + str + ", adContentDescription=" + str2 + ")";
    }

    public C7465cwi(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.a = str;
        this.b = str2;
    }

    /* renamed from: o.cwi$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C7465cwi b() {
            return C7465cwi.c;
        }
    }
}
