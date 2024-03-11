package o;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class FO implements FD {
    private final b a;
    private final FR<b> c;
    private final String d;
    private final String e;

    public final FR<b> a() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final b e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FO) {
            FO fo = (FO) obj;
            return C8632dsu.c((Object) this.d, (Object) fo.d) && C8632dsu.c((Object) this.e, (Object) fo.e) && C8632dsu.c(this.a, fo.a) && C8632dsu.c(this.c, fo.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        String str = this.e;
        int hashCode2 = str == null ? 0 : str.hashCode();
        b bVar = this.a;
        int hashCode3 = bVar == null ? 0 : bVar.hashCode();
        FR<b> fr = this.c;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (fr != null ? fr.hashCode() : 0);
    }

    public String toString() {
        String str = this.d;
        String str2 = this.e;
        b bVar = this.a;
        FR<b> fr = this.c;
        return "Image(key=" + str + ", accessibilityDescription=" + str2 + ", properties=" + bVar + ", propertiesResponsive=" + fr + ")";
    }

    public FO(String str, String str2, b bVar, FR<b> fr) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        this.e = str2;
        this.a = bVar;
        this.c = fr;
    }

    /* loaded from: classes2.dex */
    public static final class b {
        private final Integer b;
        private final Uri c;
        private final Integer d;

        public final Integer a() {
            return this.b;
        }

        public final Uri d() {
            return this.c;
        }

        public final Integer e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.c, bVar.c) && C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.b, bVar.b);
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.c;
            int hashCode = uri == null ? 0 : uri.hashCode();
            Integer num = this.d;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            Uri uri = this.c;
            Integer num = this.d;
            Integer num2 = this.b;
            return "Properties(url=" + uri + ", width=" + num + ", height=" + num2 + ")";
        }

        public b(Uri uri, Integer num, Integer num2) {
            this.c = uri;
            this.d = num;
            this.b = num2;
        }
    }
}
