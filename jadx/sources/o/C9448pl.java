package o;

import com.fasterxml.jackson.core.Version;
import java.util.regex.Pattern;

/* renamed from: o.pl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9448pl {
    private static final Pattern e = Pattern.compile("[-_./;:]");

    protected C9448pl() {
    }

    public static Version a(String str, String str2, String str3) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = e.split(trim);
                return new Version(b(split[0]), split.length > 1 ? b(split[1]) : 0, split.length > 2 ? b(split[2]) : 0, split.length > 3 ? split[3] : null, str2, str3);
            }
        }
        return Version.b();
    }

    protected static int b(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    public static final void e() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
