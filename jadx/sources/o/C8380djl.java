package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* renamed from: o.djl  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8380djl {
    private final byte[] a;
    private final String b;
    private final int d;
    private final Map<String, String> e;

    public byte[] a() {
        return this.a;
    }

    public Map<String, String> b() {
        return this.e;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.b;
    }

    public C8380djl(String str, Map<String, String> map, int i, byte[] bArr) {
        this.b = str;
        this.e = map;
        this.d = i;
        this.a = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8380djl) {
            C8380djl c8380djl = (C8380djl) obj;
            if (d() != c8380djl.d()) {
                return false;
            }
            String e = e();
            String e2 = c8380djl.e();
            if (e != null ? e.equals(e2) : e2 == null) {
                Map<String, String> b = b();
                Map<String, String> b2 = c8380djl.b();
                if (b != null ? b.equals(b2) : b2 == null) {
                    return Arrays.equals(a(), c8380djl.a());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int d = d();
        String e = e();
        int hashCode = e == null ? 43 : e.hashCode();
        Map<String, String> b = b();
        return ((((((d + 59) * 59) + hashCode) * 59) + (b != null ? b.hashCode() : 43)) * 59) + Arrays.hashCode(a());
    }

    public String toString() {
        return "ApiHttpWrapper(version=" + e() + ", headers=" + b() + ", status=" + d() + ", data=" + Arrays.toString(a()) + ")";
    }

    public String c() {
        return new String(this.a, Charset.forName("UTF-8"));
    }
}
