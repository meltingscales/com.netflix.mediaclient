package o;

import com.netflix.clcs.codegen.type.CLCSSpaceSize;

/* loaded from: classes2.dex */
public final class BV implements InterfaceC9037hy {
    private final d b;
    private final String d;
    private final CLCSSpaceSize e;

    public final CLCSSpaceSize a() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final d e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BV) {
            BV bv = (BV) obj;
            return C8632dsu.c((Object) this.d, (Object) bv.d) && this.e == bv.e && C8632dsu.c(this.b, bv.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        CLCSSpaceSize cLCSSpaceSize = this.e;
        int hashCode2 = cLCSSpaceSize == null ? 0 : cLCSSpaceSize.hashCode();
        d dVar = this.b;
        return (((hashCode * 31) + hashCode2) * 31) + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        CLCSSpaceSize cLCSSpaceSize = this.e;
        d dVar = this.b;
        return "SpacerFragment(__typename=" + str + ", size=" + cLCSSpaceSize + ", designSize=" + dVar + ")";
    }

    public BV(String str, CLCSSpaceSize cLCSSpaceSize, d dVar) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = cLCSSpaceSize;
        this.b = dVar;
    }

    /* loaded from: classes2.dex */
    public static final class d {
        private final String b;
        private final C0747Bc e;

        public final String d() {
            return this.b;
        }

        public final C0747Bc e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.b, (Object) dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.b;
            C0747Bc c0747Bc = this.e;
            return "DesignSize(__typename=" + str + ", designSpaceSizeFragment=" + c0747Bc + ")";
        }

        public d(String str, C0747Bc c0747Bc) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) c0747Bc, "");
            this.b = str;
            this.e = c0747Bc;
        }
    }
}
