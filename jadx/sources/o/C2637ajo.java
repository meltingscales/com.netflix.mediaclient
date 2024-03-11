package o;

import java.util.List;

/* renamed from: o.ajo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2637ajo implements InterfaceC9037hy {
    private final Integer a;
    private final String b;
    private final List<d> c;
    private final Integer d;
    private final Integer e;
    private final Integer j;

    public final Integer a() {
        return this.a;
    }

    public final List<d> b() {
        return this.c;
    }

    public final Integer c() {
        return this.d;
    }

    public final Integer d() {
        return this.j;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2637ajo) {
            C2637ajo c2637ajo = (C2637ajo) obj;
            return C8632dsu.c((Object) this.b, (Object) c2637ajo.b) && C8632dsu.c(this.d, c2637ajo.d) && C8632dsu.c(this.j, c2637ajo.j) && C8632dsu.c(this.e, c2637ajo.e) && C8632dsu.c(this.a, c2637ajo.a) && C8632dsu.c(this.c, c2637ajo.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        Integer num = this.d;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.j;
        int hashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.e;
        int hashCode4 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.a;
        int hashCode5 = num4 == null ? 0 : num4.hashCode();
        List<d> list = this.c;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String j() {
        return this.b;
    }

    public String toString() {
        String str = this.b;
        Integer num = this.d;
        Integer num2 = this.j;
        Integer num3 = this.e;
        Integer num4 = this.a;
        List<d> list = this.c;
        return "VideoTimeCodes(__typename=" + str + ", startCreditOffsetSec=" + num + ", startRecapOffsetSec=" + num2 + ", endCreditOffsetSec=" + num3 + ", endRecapOffsetSec=" + num4 + ", skipContentTimeCodes=" + list + ")";
    }

    public C2637ajo(String str, Integer num, Integer num2, Integer num3, Integer num4, List<d> list) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.d = num;
        this.j = num2;
        this.e = num3;
        this.a = num4;
        this.c = list;
    }

    /* renamed from: o.ajo$d */
    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final Integer c;
        private final String d;
        private final Integer e;

        public final String b() {
            return this.d;
        }

        public final Integer c() {
            return this.c;
        }

        public final Integer d() {
            return this.e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c((Object) this.d, (Object) dVar.d) && C8632dsu.c(this.c, dVar.c) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            String str = this.d;
            int hashCode2 = str == null ? 0 : str.hashCode();
            Integer num = this.c;
            int hashCode3 = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.d;
            Integer num = this.c;
            Integer num2 = this.e;
            return "SkipContentTimeCode(__typename=" + str + ", label=" + str2 + ", startSec=" + num + ", endSec=" + num2 + ")";
        }

        public d(String str, String str2, Integer num, Integer num2) {
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.d = str2;
            this.c = num;
            this.e = num2;
        }
    }
}
