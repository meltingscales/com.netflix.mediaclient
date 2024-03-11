package o;

import com.netflix.hawkins.consumer.tokens.Token;

/* loaded from: classes2.dex */
public final class FC {
    private final Token.Color a;
    private final e b;
    private final Token.Color c;
    private final a d;
    private final b e;
    private final FR<b> h;

    public final Token.Color a() {
        return this.a;
    }

    public final a b() {
        return this.d;
    }

    public final e c() {
        return this.b;
    }

    public final b d() {
        return this.e;
    }

    public final Token.Color e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FC) {
            FC fc = (FC) obj;
            return C8632dsu.c(this.e, fc.e) && C8632dsu.c(this.h, fc.h) && C8632dsu.c(this.c, fc.c) && C8632dsu.c(this.a, fc.a) && C8632dsu.c(this.b, fc.b) && C8632dsu.c(this.d, fc.d);
        }
        return false;
    }

    public int hashCode() {
        b bVar = this.e;
        int hashCode = bVar == null ? 0 : bVar.hashCode();
        FR<b> fr = this.h;
        int hashCode2 = fr == null ? 0 : fr.hashCode();
        Token.Color color = this.c;
        int hashCode3 = color == null ? 0 : color.hashCode();
        Token.Color color2 = this.a;
        int hashCode4 = color2 == null ? 0 : color2.hashCode();
        e eVar = this.b;
        int hashCode5 = eVar == null ? 0 : eVar.hashCode();
        a aVar = this.d;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (aVar != null ? aVar.hashCode() : 0);
    }

    public final FR<b> j() {
        return this.h;
    }

    public String toString() {
        b bVar = this.e;
        FR<b> fr = this.h;
        Token.Color color = this.c;
        Token.Color color2 = this.a;
        e eVar = this.b;
        a aVar = this.d;
        return "ContainerStyle(padding=" + bVar + ", paddingResponsive=" + fr + ", backgroundColor=" + color + ", borderColor=" + color2 + ", borderWidth=" + eVar + ", borderRadius=" + aVar + ")";
    }

    public FC(b bVar, FR<b> fr, Token.Color color, Token.Color color2, e eVar, a aVar) {
        this.e = bVar;
        this.h = fr;
        this.c = color;
        this.a = color2;
        this.b = eVar;
        this.d = aVar;
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final Integer a;
        private final Integer c;
        private final Integer d;
        private final Integer e;

        public final Integer a() {
            return this.c;
        }

        public final Integer c() {
            return this.e;
        }

        public final Integer d() {
            return this.d;
        }

        public final Integer e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.c;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.a;
            int hashCode2 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.d;
            int hashCode3 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.e;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.c;
            Integer num2 = this.a;
            Integer num3 = this.d;
            Integer num4 = this.e;
            return "Padding(top=" + num + ", bottom=" + num2 + ", start=" + num3 + ", end=" + num4 + ")";
        }

        public b(Integer num, Integer num2, Integer num3, Integer num4) {
            this.c = num;
            this.a = num2;
            this.d = num3;
            this.e = num4;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        private final Integer b;
        private final Integer c;
        private final Integer d;
        private final Integer e;

        public final Integer b() {
            return this.c;
        }

        public final Integer c() {
            return this.e;
        }

        public final Integer d() {
            return this.b;
        }

        public final Integer e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.c, eVar.c) && C8632dsu.c(this.e, eVar.e) && C8632dsu.c(this.b, eVar.b) && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.c;
            int hashCode = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            int hashCode2 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.b;
            int hashCode3 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
        }

        public String toString() {
            Integer num = this.c;
            Integer num2 = this.e;
            Integer num3 = this.b;
            Integer num4 = this.d;
            return "BorderWidth(top=" + num + ", bottom=" + num2 + ", start=" + num3 + ", end=" + num4 + ")";
        }

        public e(Integer num, Integer num2, Integer num3, Integer num4) {
            this.c = num;
            this.e = num2;
            this.b = num3;
            this.d = num4;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.c;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b == aVar.b && this.e == aVar.e && this.c == aVar.c && this.d == aVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.b) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.b;
            int i2 = this.e;
            int i3 = this.c;
            int i4 = this.d;
            return "BorderRadius(topStart=" + i + ", topEnd=" + i2 + ", bottomStart=" + i3 + ", bottomEnd=" + i4 + ")";
        }

        public a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.e = i2;
            this.c = i3;
            this.d = i4;
        }
    }
}
