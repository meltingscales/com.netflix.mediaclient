package o;

/* renamed from: o.cJk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5816cJk {

    /* renamed from: o.cJk$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5816cJk {
        private final float a;

        public final float b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Float.compare(this.a, ((e) obj).a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.a);
        }

        public String toString() {
            float f = this.a;
            return "Visible(playbackSpeed=" + f + ")";
        }

        public e(float f) {
            this.a = f;
        }
    }

    /* renamed from: o.cJk$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5816cJk {
        public static final c c = new c();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1129541658;
        }

        public String toString() {
            return "Gone";
        }

        private c() {
        }
    }
}
