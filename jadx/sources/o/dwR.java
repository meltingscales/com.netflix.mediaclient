package o;

import o.dqZ;

/* loaded from: classes5.dex */
public final class dwR extends dqT {
    public static final b e = new b(null);
    private final String a;

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwR) && C8632dsu.c((Object) this.a, (Object) ((dwR) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public dwR(String str) {
        super(e);
        this.a = str;
    }

    /* loaded from: classes5.dex */
    public static final class b implements dqZ.d<dwR> {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    public String toString() {
        return "CoroutineName(" + this.a + ')';
    }
}
