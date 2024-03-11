package o;

import com.fasterxml.jackson.core.JsonFactory;

/* loaded from: classes5.dex */
public final class dFK {
    private static final String[] a;
    private static final byte[] c;

    private static final char b(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    public static final String[] d() {
        return a;
    }

    public static final byte[] e() {
        return c;
    }

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        c = bArr;
    }

    public static final void c(StringBuilder sb, String str) {
        C8632dsu.c((Object) sb, "");
        C8632dsu.c((Object) str, "");
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static final Boolean e(String str) {
        boolean a2;
        boolean a3;
        C8632dsu.c((Object) str, "");
        a2 = C8691duz.a(str, "true", true);
        if (a2) {
            return Boolean.TRUE;
        }
        a3 = C8691duz.a(str, "false", true);
        if (a3) {
            return Boolean.FALSE;
        }
        return null;
    }
}
