package o;

/* renamed from: o.cKc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5835cKc {

    /* renamed from: o.cKc$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC5835cKc {
        private final Integer a;
        private final boolean b;
        private final boolean c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final boolean b() {
            return this.c;
        }

        public final Integer c() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.a, aVar.a) && this.c == aVar.c && this.b == aVar.b;
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = str == null ? 0 : str.hashCode();
            Integer num = this.a;
            return (((((hashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            Integer num = this.a;
            boolean z = this.c;
            boolean z2 = this.b;
            return "NextEpisodeSeamless(backgroundImageUrl=" + str + ", autoPlayCountdownInSeconds=" + num + ", endOfPlay=" + z + ", useLegacyIgnoreTapContainer=" + z2 + ")";
        }

        public a(String str, Integer num, boolean z, boolean z2) {
            this.d = str;
            this.a = num;
            this.c = z;
            this.b = z2;
        }
    }

    /* renamed from: o.cKc$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC5835cKc {
        private final int b;

        public final int c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b);
        }

        public String toString() {
            int i = this.b;
            return "LiveEventEnd(autoExitTimerSeconds=" + i + ")";
        }

        public b(int i) {
            this.b = i;
        }
    }
}
