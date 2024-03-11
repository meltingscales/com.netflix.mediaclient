package o;

/* loaded from: classes4.dex */
public interface cJY {

    /* loaded from: classes4.dex */
    public static final class d implements cJY {
        public static final d e = new d();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -282926566;
        }

        public String toString() {
            return "Unavailable";
        }

        private d() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements cJY {
        private final float d;

        public final float a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.d, ((b) obj).d) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.d);
        }

        public String toString() {
            float f = this.d;
            return "Available(value=" + f + ")";
        }

        public b(float f) {
            this.d = f;
        }
    }
}
