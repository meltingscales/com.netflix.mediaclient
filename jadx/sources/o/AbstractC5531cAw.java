package o;

/* renamed from: o.cAw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5531cAw {
    public /* synthetic */ AbstractC5531cAw(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC5531cAw() {
    }

    /* renamed from: o.cAw$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC5531cAw {
        private final String a;
        private final String c;
        private final int e;

        public final int b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.e == bVar.e && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.e);
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = this.e;
            String str = this.a;
            String str2 = this.c;
            return "PostPlayLiveEventEndData(autoExitTimerSeconds=" + i + ", requestId=" + str + ", uuid=" + str2 + ")";
        }

        public b(int i, String str, String str2) {
            super(null);
            this.e = i;
            this.a = str;
            this.c = str2;
        }
    }
}
