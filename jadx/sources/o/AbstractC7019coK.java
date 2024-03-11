package o;

/* renamed from: o.coK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7019coK extends C9941zV {
    public /* synthetic */ AbstractC7019coK(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC7019coK() {
    }

    /* renamed from: o.coK$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7019coK {
        private final String d;
        private final Long e;

        public final String a() {
            return this.d;
        }

        public final Long b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.d, (Object) aVar.d) && C8632dsu.c(this.e, aVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            Long l = this.e;
            return (hashCode * 31) + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            String str = this.d;
            Long l = this.e;
            return "ShowVideoDetail(videoId=" + str + ", sessionId=" + l + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Long l) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = str;
            this.e = l;
        }
    }
}
