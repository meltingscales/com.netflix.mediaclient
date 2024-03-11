package o;

/* loaded from: classes2.dex */
public abstract class FZ {
    public /* synthetic */ FZ(C8627dsp c8627dsp) {
        this();
    }

    public abstract String b();

    private FZ() {
    }

    /* loaded from: classes2.dex */
    public static final class c extends FZ {
        private final Integer c;
        private final Integer d;
        private final String e;

        public final Integer a() {
            return this.d;
        }

        @Override // o.FZ
        public String b() {
            return this.e;
        }

        public final Integer d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.d, cVar.d) && C8632dsu.c(this.c, cVar.c) && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.d;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.c;
            return (((hashCode * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.e.hashCode();
        }

        public String toString() {
            Integer num = this.d;
            Integer num2 = this.c;
            String str = this.e;
            return "Length(minLength=" + num + ", maxLength=" + num2 + ", errorMessage=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Integer num, Integer num2, String str) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.d = num;
            this.c = num2;
            this.e = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends FZ {
        private final String a;
        private final String e;

        @Override // o.FZ
        public String b() {
            return this.e;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.e, (Object) dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            String str2 = this.e;
            return "Pattern(pattern=" + str + ", errorMessage=" + str2 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.a = str;
            this.e = str2;
        }
    }
}
