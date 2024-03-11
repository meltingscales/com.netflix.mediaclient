package o;

import com.fasterxml.jackson.core.Base64Variant;

/* renamed from: o.nR  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9322nR {
    public static final Base64Variant a;
    public static final Base64Variant b;
    public static final Base64Variant c;
    public static final Base64Variant d;

    public static Base64Variant e() {
        return d;
    }

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        b = base64Variant;
        d = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        a = new Base64Variant(base64Variant, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        c = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static Base64Variant d(String str) {
        String str2;
        Base64Variant base64Variant = b;
        if (base64Variant.b.equals(str)) {
            return base64Variant;
        }
        Base64Variant base64Variant2 = d;
        if (base64Variant2.b.equals(str)) {
            return base64Variant2;
        }
        Base64Variant base64Variant3 = a;
        if (base64Variant3.b.equals(str)) {
            return base64Variant3;
        }
        Base64Variant base64Variant4 = c;
        if (base64Variant4.b.equals(str)) {
            return base64Variant4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
