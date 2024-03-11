package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class doO {
    private final char b;
    private final char d;
    private final char e;
    private final char h;
    public static final doO c = new doO('0', '+', '-', '.');
    private static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);

    private doO(char c2, char c3, char c4, char c5) {
        this.h = c2;
        this.b = c3;
        this.e = c4;
        this.d = c5;
    }

    public char b() {
        return this.d;
    }

    public char c() {
        return this.b;
    }

    public int c(char c2) {
        int i = c2 - this.h;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public char d() {
        return this.e;
    }

    public char e() {
        return this.h;
    }

    public String e(String str) {
        char c2 = this.h;
        if (c2 == '0') {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + (c2 - '0'));
        }
        return new String(charArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof doO) {
            doO doo = (doO) obj;
            return this.h == doo.h && this.b == doo.b && this.e == doo.e && this.d == doo.d;
        }
        return false;
    }

    public int hashCode() {
        return this.h + this.b + this.e + this.d;
    }

    public String toString() {
        char c2 = this.h;
        char c3 = this.b;
        char c4 = this.e;
        char c5 = this.d;
        return "DecimalStyle[" + c2 + c3 + c4 + c5 + "]";
    }
}
