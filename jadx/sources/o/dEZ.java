package o;

/* loaded from: classes5.dex */
public final class dEZ {
    public static final String a(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final byte e(char c) {
        if (c < '~') {
            return C7786dFh.c[c];
        }
        return (byte) 0;
    }

    public static final char c(int i) {
        if (i < 117) {
            return C7786dFh.a[i];
        }
        return (char) 0;
    }
}
