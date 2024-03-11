package o;

/* loaded from: classes4.dex */
public interface cIW {

    /* loaded from: classes4.dex */
    public static final class c implements cIW {
        private final String a;

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C8632dsu.c((Object) this.a, (Object) ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            String str = this.a;
            return "Visible(imageUrl=" + str + ")";
        }

        public c(String str) {
            C8632dsu.c((Object) str, "");
            this.a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements cIW {
        public static final e b = new e();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 839624761;
        }

        public String toString() {
            return "Gone";
        }

        private e() {
        }
    }
}
