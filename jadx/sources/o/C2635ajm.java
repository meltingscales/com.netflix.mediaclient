package o;

import java.util.List;

/* renamed from: o.ajm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2635ajm implements InterfaceC9037hy {
    private final List<d> b;
    private final String c;

    public final List<d> a() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2635ajm) {
            C2635ajm c2635ajm = (C2635ajm) obj;
            return C8632dsu.c((Object) this.c, (Object) c2635ajm.c) && C8632dsu.c(this.b, c2635ajm.b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        List<d> list = this.b;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.c;
        List<d> list = this.b;
        return "VideoTags(__typename=" + str + ", tags=" + list + ")";
    }

    public C2635ajm(String str, List<d> list) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.b = list;
    }

    /* renamed from: o.ajm$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final String d;
        private final Boolean e;

        public final Boolean b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Boolean bool = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            Boolean bool = this.e;
            return "Tag(__typename=" + str + ", displayName=" + str2 + ", isDisplayable=" + bool + ")";
        }

        public d(String str, String str2, Boolean bool) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
            this.e = bool;
        }
    }
}
