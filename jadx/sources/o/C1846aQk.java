package o;

import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: o.aQk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1846aQk {
    private final String a;
    private final boolean b;
    private final String d;
    private final String e;

    public String a() {
        return this.d;
    }

    public boolean c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aQk$a */
    /* loaded from: classes3.dex */
    public static class a {
        private static String d = "isWidevine";
        private static String c = ":";
        private static String e = "systemId";
        private static String a = "deviceId";
        private static String f = "wveaVersion";
        private static final Pattern b = Pattern.compile("^" + d + "=(false|true)" + c + e + "=([0-9]+)" + c + a + "=([A-F0-9]+)(?:" + c + f + "=([0-9]+))?$");

        static String d(C1846aQk c1846aQk) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append("=");
            sb.append(c1846aQk.c() ? "true" : "false");
            sb.append(c);
            sb.append(e);
            sb.append("=");
            sb.append(c1846aQk.d());
            sb.append(c);
            sb.append(a);
            sb.append("=");
            sb.append(c1846aQk.a());
            sb.append(c);
            sb.append(f);
            sb.append("=");
            sb.append(c1846aQk.e());
            return sb.toString();
        }
    }

    public C1846aQk(boolean z, String str, String str2, String str3) {
        this.b = z;
        this.a = str;
        this.d = str2;
        this.e = str3;
    }

    public C1846aQk(String str, String str2) {
        this(false, str, str2, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1846aQk c1846aQk = (C1846aQk) obj;
        return this.b == c1846aQk.b && Objects.equals(this.a, c1846aQk.a) && Objects.equals(this.d, c1846aQk.d) && Objects.equals(this.e, c1846aQk.e);
    }

    public int hashCode() {
        boolean z = this.b;
        return Objects.hash(Boolean.valueOf(z), this.a, this.d, this.e);
    }

    public String b() {
        return a.d(this);
    }

    public String toString() {
        return b();
    }
}
