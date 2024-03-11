package o;

import com.google.gson.annotations.SerializedName;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: o.dhy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8313dhy {
    private Locale a;
    @SerializedName("languageDescription")
    private String b;
    private String c;
    private String d;
    @SerializedName("language")
    private String e;

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public Locale c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }

    public C8313dhy(String str) {
        c(str, "raw");
        this.c = str.trim();
        i();
        g();
    }

    public C8313dhy(String str, String str2, String str3) {
        c(str, "language");
        this.e = str.trim().toLowerCase();
        this.d = str2;
        if (str2 != null) {
            this.d = str2.trim().toUpperCase();
        }
        if (str3 != null) {
            this.b = str3.trim();
        }
        f();
        g();
    }

    private void i() {
        StringTokenizer stringTokenizer = new StringTokenizer(this.c, "-");
        if (stringTokenizer.countTokens() < 1 || stringTokenizer.countTokens() > 3) {
            throw new IllegalArgumentException("Invalid format of raw: " + this.c);
        }
        int countTokens = stringTokenizer.countTokens();
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (i == 0) {
                this.e = nextToken.toLowerCase();
            } else if (i == 1) {
                if (countTokens == 3) {
                    this.e += "-" + nextToken;
                } else {
                    this.d = nextToken.toUpperCase();
                }
            } else if (i == 2 && countTokens == 3) {
                this.d = nextToken.toUpperCase();
            } else {
                C1044Mm.j("nf_user_locale", "Unexpected token in given preferred language. Token " + i + ": " + nextToken);
            }
            i++;
        }
    }

    private void f() {
        StringBuilder sb = new StringBuilder(5);
        sb.append(this.e);
        if (this.d != null) {
            sb.append("-");
            sb.append(this.d);
        }
        this.c = sb.toString();
    }

    private void g() {
        String str = this.d;
        if (str == null || "".equals(str)) {
            this.a = new Locale(this.e);
        } else {
            this.a = new Locale(this.e, this.d);
        }
    }

    private void c(String str, String str2) {
        if (str == null || "".equals(str.trim())) {
            throw new IllegalArgumentException(str2 + " argument can not be empty!");
        }
    }

    public String toString() {
        return "UserLocale [language=" + this.e + ", languageDescription=" + this.b + ", locale=" + this.a + ", raw=" + this.c + ", region=" + this.d + "]";
    }

    public int hashCode() {
        String str = this.c;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C8313dhy)) {
            C8313dhy c8313dhy = (C8313dhy) obj;
            String str = this.c;
            if (str == null) {
                if (c8313dhy.c != null) {
                    return false;
                }
            } else if (!str.equals(c8313dhy.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean d(C8313dhy c8313dhy) {
        if (c8313dhy == null) {
            return false;
        }
        String str = this.e;
        return str == null ? c8313dhy.e == null : str.equalsIgnoreCase(c8313dhy.e);
    }
}
