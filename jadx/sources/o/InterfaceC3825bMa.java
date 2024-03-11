package o;

/* renamed from: o.bMa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3825bMa extends InterfaceC3830bMf {
    a n();

    /* renamed from: o.bMa$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private String a;
        private Integer d;
        private String e;

        public a() {
            this(null, null, null, 7, null);
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.a, (Object) aVar.a) && C8632dsu.c((Object) this.e, (Object) aVar.e) && C8632dsu.c(this.d, aVar.d);
            }
            return false;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            Integer num = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            Integer num = this.d;
            return "ImpressionInfo(listId=" + str + ", requestId=" + str2 + ", trackId=" + num + ")";
        }

        public a(String str, String str2, Integer num) {
            this.a = str;
            this.e = str2;
            this.d = num;
        }

        public /* synthetic */ a(String str, String str2, Integer num, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
        }
    }
}
