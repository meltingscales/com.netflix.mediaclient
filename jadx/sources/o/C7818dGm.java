package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.text.Regex;

/* renamed from: o.dGm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7818dGm {
    public static final a a = new a(null);
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String b;
    private final String c;
    private final boolean d;
    private final List<String> f;
    private final List<String> g;
    private final String h;
    private final String i;
    private final int j;
    private final String k;
    private final String l;

    public final String f() {
        return this.b;
    }

    public final boolean i() {
        return this.d;
    }

    public final String l() {
        return this.i;
    }

    public final int n() {
        return this.j;
    }

    public String toString() {
        return this.k;
    }

    public C7818dGm(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C8632dsu.d((Object) str, "");
        C8632dsu.d((Object) str2, "");
        C8632dsu.d((Object) str3, "");
        C8632dsu.d((Object) str4, "");
        C8632dsu.d(list, "");
        C8632dsu.d((Object) str6, "");
        this.i = str;
        this.l = str2;
        this.h = str3;
        this.b = str4;
        this.j = i;
        this.f = list;
        this.g = list2;
        this.c = str5;
        this.k = str6;
        this.d = C8632dsu.c((Object) str, (Object) "https");
    }

    public final URL t() {
        try {
            return new URL(this.k);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final URI k() {
        String bVar = h().a().toString();
        try {
            return new URI(bVar);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").a(bVar, ""));
                C8632dsu.b(create, "");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final String j() {
        if (this.l.length() == 0) {
            return "";
        }
        int length = this.i.length() + 3;
        String str = this.k;
        int b2 = dGB.b(str, ":@", length, str.length());
        String str2 = this.k;
        if (str2 != null) {
            String substring = str2.substring(length, b2);
            C8632dsu.b(substring, "");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String e() {
        int b2;
        int b3;
        if (this.h.length() == 0) {
            return "";
        }
        b2 = duD.b((CharSequence) this.k, ':', this.i.length() + 3, false, 4, (Object) null);
        b3 = duD.b((CharSequence) this.k, '@', 0, false, 6, (Object) null);
        String str = this.k;
        if (str != null) {
            String substring = str.substring(b2 + 1, b3);
            C8632dsu.b(substring, "");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        int b2;
        b2 = duD.b((CharSequence) this.k, '/', this.i.length() + 3, false, 4, (Object) null);
        String str = this.k;
        int b3 = dGB.b(str, "?#", b2, str.length());
        String str2 = this.k;
        if (str2 != null) {
            String substring = str2.substring(b2, b3);
            C8632dsu.b(substring, "");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> c() {
        int b2;
        b2 = duD.b((CharSequence) this.k, '/', this.i.length() + 3, false, 4, (Object) null);
        String str = this.k;
        int b3 = dGB.b(str, "?#", b2, str.length());
        ArrayList arrayList = new ArrayList();
        while (b2 < b3) {
            int i = b2 + 1;
            int b4 = dGB.b(this.k, '/', i, b3);
            String str2 = this.k;
            if (str2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i, b4);
            C8632dsu.b(substring, "");
            arrayList.add(substring);
            b2 = b4;
        }
        return arrayList;
    }

    public final String g() {
        int b2;
        if (this.g == null) {
            return null;
        }
        b2 = duD.b((CharSequence) this.k, '?', 0, false, 6, (Object) null);
        int i = b2 + 1;
        String str = this.k;
        int b3 = dGB.b(str, '#', i, str.length());
        String str2 = this.k;
        if (str2 != null) {
            String substring = str2.substring(i, b3);
            C8632dsu.b(substring, "");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String o() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a.c(this.g, sb);
        return sb.toString();
    }

    public final String d() {
        int b2;
        if (this.c == null) {
            return null;
        }
        b2 = duD.b((CharSequence) this.k, '#', 0, false, 6, (Object) null);
        String str = this.k;
        if (str != null) {
            String substring = str.substring(b2 + 1);
            C8632dsu.b(substring, "");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String m() {
        b a2 = a("/...");
        if (a2 == null) {
            C8632dsu.e();
        }
        return a2.i("").d("").b().toString();
    }

    public final C7818dGm d(String str) {
        C8632dsu.d((Object) str, "");
        b a2 = a(str);
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    public final b h() {
        b bVar = new b();
        bVar.f(this.i);
        bVar.j(j());
        bVar.h(e());
        bVar.g(this.b);
        bVar.b(this.j != a.e(this.i) ? this.j : -1);
        bVar.d().clear();
        bVar.d().addAll(c());
        bVar.c(g());
        bVar.a(d());
        return bVar;
    }

    public final b a(String str) {
        C8632dsu.d((Object) str, "");
        try {
            return new b().e(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7818dGm) && C8632dsu.c((Object) ((C7818dGm) obj).k, (Object) this.k);
    }

    public int hashCode() {
        return this.k.hashCode();
    }

    /* renamed from: o.dGm$b */
    /* loaded from: classes5.dex */
    public static final class b {
        public static final e c = new e(null);
        private String a;
        private List<String> b;
        private final List<String> d;
        private String h;
        private String j;
        private String i = "";
        private String e = "";
        private int g = -1;

        public final void a(String str) {
            this.a = str;
        }

        public final void b(int i) {
            this.g = i;
        }

        public final List<String> d() {
            return this.d;
        }

        public final void f(String str) {
            this.h = str;
        }

        public final void g(String str) {
            this.j = str;
        }

        public final void h(String str) {
            C8632dsu.d((Object) str, "");
            this.e = str;
        }

        public final void j(String str) {
            C8632dsu.d((Object) str, "");
            this.i = str;
        }

        public b() {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            arrayList.add("");
        }

        public final b e(String str) {
            boolean a;
            boolean a2;
            C8632dsu.d((Object) str, "");
            a = C8691duz.a(str, "http", true);
            if (a) {
                this.h = "http";
            } else {
                a2 = C8691duz.a(str, "https", true);
                if (a2) {
                    this.h = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            return this;
        }

        public final b i(String str) {
            C8632dsu.d((Object) str, "");
            this.i = a.b(C7818dGm.a, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final b d(String str) {
            C8632dsu.d((Object) str, "");
            this.e = a.b(C7818dGm.a, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final b b(String str) {
            C8632dsu.d((Object) str, "");
            String a = C7831dGz.a(a.b(C7818dGm.a, str, 0, 0, false, 7, null));
            if (a != null) {
                this.j = a;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final b d(int i) {
            if (1 <= i && 65535 >= i) {
                this.g = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        private final int c() {
            int i = this.g;
            if (i != -1) {
                return i;
            }
            a aVar = C7818dGm.a;
            String str = this.h;
            if (str == null) {
                C8632dsu.e();
            }
            return aVar.e(str);
        }

        public final b c(String str) {
            List<String> list;
            if (str != null) {
                a aVar = C7818dGm.a;
                String b = a.b(aVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b != null) {
                    list = aVar.a(b);
                    this.b = list;
                    return this;
                }
            }
            list = null;
            this.b = list;
            return this;
        }

        public final b a() {
            String str = this.j;
            this.j = str != null ? new Regex("[\"<>^`{|}]").a(str, "") : null;
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.d;
                list.set(i, a.b(C7818dGm.a, list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? a.b(C7818dGm.a, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.a;
            this.a = str3 != null ? a.b(C7818dGm.a, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final C7818dGm b() {
            int d;
            ArrayList arrayList;
            int d2;
            String str = this.h;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            a aVar = C7818dGm.a;
            String b = a.b(aVar, this.i, 0, 0, false, 7, null);
            String b2 = a.b(aVar, this.e, 0, 0, false, 7, null);
            String str2 = this.j;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int c2 = c();
            List<String> list = this.d;
            d = C8572dqo.d(list, 10);
            ArrayList arrayList2 = new ArrayList(d);
            for (String str3 : list) {
                arrayList2.add(a.b(C7818dGm.a, str3, 0, 0, false, 7, null));
            }
            List<String> list2 = this.b;
            if (list2 != null) {
                d2 = C8572dqo.d(list2, 10);
                arrayList = new ArrayList(d2);
                for (String str4 : list2) {
                    arrayList.add(str4 != null ? a.b(C7818dGm.a, str4, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.a;
            return new C7818dGm(str, b, b2, str2, c2, arrayList2, arrayList, str5 != null ? a.b(C7818dGm.a, str5, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
            if (r1 != r4.e(r3)) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.h
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.i
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.e
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.i
                r0.append(r1)
                java.lang.String r1 = r6.e
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.e
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.j
                if (r1 == 0) goto L6b
                if (r1 != 0) goto L4d
                o.C8632dsu.e()
            L4d:
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = o.C8684dus.d(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L66
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.j
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L6b
            L66:
                java.lang.String r1 = r6.j
                r0.append(r1)
            L6b:
                int r1 = r6.g
                r3 = -1
                if (r1 != r3) goto L74
                java.lang.String r1 = r6.h
                if (r1 == 0) goto L8f
            L74:
                int r1 = r6.c()
                java.lang.String r3 = r6.h
                if (r3 == 0) goto L89
                o.dGm$a r4 = o.C7818dGm.a
                if (r3 != 0) goto L83
                o.C8632dsu.e()
            L83:
                int r3 = r4.e(r3)
                if (r1 == r3) goto L8f
            L89:
                r0.append(r2)
                r0.append(r1)
            L8f:
                o.dGm$a r1 = o.C7818dGm.a
                java.util.List<java.lang.String> r2 = r6.d
                r1.d(r2, r0)
                java.util.List<java.lang.String> r2 = r6.b
                if (r2 == 0) goto La9
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.b
                if (r2 != 0) goto La6
                o.C8632dsu.e()
            La6:
                r1.c(r2, r0)
            La9:
                java.lang.String r1 = r6.a
                if (r1 == 0) goto Lb7
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.a
                r0.append(r1)
            Lb7:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = ""
                o.C8632dsu.b(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7818dGm.b.toString():java.lang.String");
        }

        public final b e(C7818dGm c7818dGm, String str) {
            int b;
            int i;
            int i2;
            int i3;
            boolean a;
            boolean a2;
            C8632dsu.d((Object) str, "");
            int b2 = dGB.b(str, 0, 0, 3, null);
            int a3 = dGB.a(str, b2, 0, 2, null);
            e eVar = c;
            int b3 = eVar.b(str, b2, a3);
            char c2 = 65535;
            if (b3 != -1) {
                a = C8691duz.a(str, "https:", b2, true);
                if (a) {
                    this.h = "https";
                    b2 += 6;
                } else {
                    a2 = C8691duz.a(str, "http:", b2, true);
                    if (!a2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str.substring(0, b3);
                        C8632dsu.b(substring, "");
                        sb.append(substring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.h = "http";
                    b2 += 5;
                }
            } else if (c7818dGm != null) {
                this.h = c7818dGm.l();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int e2 = eVar.e(str, b2, a3);
            char c3 = '?';
            char c4 = '#';
            if (e2 < 2 && c7818dGm != null && !(!C8632dsu.c((Object) c7818dGm.l(), (Object) this.h))) {
                this.i = c7818dGm.j();
                this.e = c7818dGm.e();
                this.j = c7818dGm.f();
                this.g = c7818dGm.n();
                this.d.clear();
                this.d.addAll(c7818dGm.c());
                if (b2 == a3 || str.charAt(b2) == '#') {
                    c(c7818dGm.g());
                }
                i = a3;
            } else {
                boolean z = false;
                boolean z2 = false;
                int i4 = b2 + e2;
                while (true) {
                    b = dGB.b(str, "@/\\?#", i4, a3);
                    char charAt = b != a3 ? str.charAt(b) : c2;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        break;
                    }
                    if (charAt != '@') {
                        i2 = a3;
                    } else {
                        if (!z) {
                            int b4 = dGB.b(str, ':', i4, b);
                            a aVar = C7818dGm.a;
                            i2 = a3;
                            String b5 = a.b(aVar, str, i4, b4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z2) {
                                b5 = this.i + "%40" + b5;
                            }
                            this.i = b5;
                            if (b4 != b) {
                                this.e = a.b(aVar, str, b4 + 1, b, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            }
                            i3 = b;
                            z2 = true;
                        } else {
                            i2 = a3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.e);
                            sb2.append("%40");
                            i3 = b;
                            sb2.append(a.b(C7818dGm.a, str, i4, b, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.e = sb2.toString();
                        }
                        i4 = i3 + 1;
                    }
                    a3 = i2;
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                i = a3;
                e eVar2 = c;
                int a4 = eVar2.a(str, i4, b);
                int i5 = a4 + 1;
                if (i5 < b) {
                    this.j = C7831dGz.a(a.b(C7818dGm.a, str, i4, a4, false, 4, null));
                    int d = eVar2.d(str, i5, b);
                    this.g = d;
                    if (d == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = str.substring(i5, b);
                        C8632dsu.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    a aVar2 = C7818dGm.a;
                    this.j = C7831dGz.a(a.b(aVar2, str, i4, a4, false, 4, null));
                    String str2 = this.h;
                    if (str2 == null) {
                        C8632dsu.e();
                    }
                    this.g = aVar2.e(str2);
                }
                if (this.j == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = str.substring(i4, a4);
                    C8632dsu.b(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                b2 = b;
            }
            int i6 = i;
            int b6 = dGB.b(str, "?#", b2, i6);
            a(str, b2, b6);
            if (b6 < i6 && str.charAt(b6) == '?') {
                int b7 = dGB.b(str, '#', b6, i6);
                a aVar3 = C7818dGm.a;
                this.b = aVar3.a(a.b(aVar3, str, b6 + 1, b7, " \"'<>#", true, false, true, false, null, 208, null));
                b6 = b7;
            }
            if (b6 < i6 && str.charAt(b6) == '#') {
                this.a = a.b(C7818dGm.a, str, 1 + b6, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:12:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.d
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.d
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.d
                r0.add(r2)
            L28:
                int r12 = r12 + r3
            L29:
                r6 = r12
                if (r6 >= r13) goto L42
                java.lang.String r12 = "/\\"
                int r12 = o.dGB.b(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.e(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
                goto L28
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7818dGm.b.a(java.lang.String, int, int):void");
        }

        private final void e(String str, int i, int i2, boolean z, boolean z2) {
            String b = a.b(C7818dGm.a, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (k(b)) {
                return;
            }
            if (m(b)) {
                e();
                return;
            }
            List<String> list = this.d;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.d;
                list2.set(list2.size() - 1, b);
            } else {
                this.d.add(b);
            }
            if (z) {
                this.d.add("");
            }
        }

        private final boolean k(String str) {
            boolean a;
            if (C8632dsu.c((Object) str, (Object) ".")) {
                return true;
            }
            a = C8691duz.a(str, "%2e", true);
            return a;
        }

        private final boolean m(String str) {
            boolean a;
            boolean a2;
            boolean a3;
            if (C8632dsu.c((Object) str, (Object) "..")) {
                return true;
            }
            a = C8691duz.a(str, "%2e.", true);
            if (a) {
                return true;
            }
            a2 = C8691duz.a(str, ".%2e", true);
            if (a2) {
                return true;
            }
            a3 = C8691duz.a(str, "%2e%2e", true);
            return a3;
        }

        private final void e() {
            List<String> list = this.d;
            if (list.remove(list.size() - 1).length() == 0 && (!this.d.isEmpty())) {
                List<String> list2 = this.d;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.d.add("");
        }

        /* renamed from: o.dGm$b$e */
        /* loaded from: classes5.dex */
        public static final class e {
            private e() {
            }

            public /* synthetic */ e(C8627dsp c8627dsp) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int b(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int a(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int d(String str, int i, int i2) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(a.b(C7818dGm.a, str, i, i2, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 <= parseInt && 65535 >= parseInt) {
                    return parseInt;
                }
                return -1;
            }
        }
    }

    /* renamed from: o.dGm$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public final int e(String str) {
            C8632dsu.d((Object) str, "");
            int hashCode = str.hashCode();
            if (hashCode == 3213448) {
                if (str.equals("http")) {
                    return 80;
                }
            } else if (hashCode == 99617003 && str.equals("https")) {
                return 443;
            }
            return -1;
        }

        public final void d(List<String> list, StringBuilder sb) {
            C8632dsu.d(list, "");
            C8632dsu.d(sb, "");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final void c(List<String> list, StringBuilder sb) {
            C8654dtp g;
            C8646dth d;
            C8632dsu.d(list, "");
            C8632dsu.d(sb, "");
            g = C8657dts.g(0, list.size());
            d = C8657dts.d(g, 2);
            int d2 = d.d();
            int e = d.e();
            int a = d.a();
            if (a >= 0) {
                if (d2 > e) {
                    return;
                }
            } else if (d2 < e) {
                return;
            }
            while (true) {
                String str = list.get(d2);
                String str2 = list.get(d2 + 1);
                if (d2 > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (d2 == e) {
                    return;
                }
                d2 += a;
            }
        }

        public final List<String> a(String str) {
            int b;
            int b2;
            C8632dsu.d((Object) str, "");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                b = duD.b((CharSequence) str, '&', i, false, 4, (Object) null);
                if (b == -1) {
                    b = str.length();
                }
                int i2 = b;
                b2 = duD.b((CharSequence) str, '=', i, false, 4, (Object) null);
                if (b2 == -1 || b2 > i2) {
                    String substring = str.substring(i, i2);
                    C8632dsu.b(substring, "");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i, b2);
                    C8632dsu.b(substring2, "");
                    arrayList.add(substring2);
                    String substring3 = str.substring(b2 + 1, i2);
                    C8632dsu.b(substring3, "");
                    arrayList.add(substring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final C7818dGm c(String str) {
            C8632dsu.d((Object) str, "");
            return new b().e(null, str).b();
        }

        public static /* synthetic */ String b(a aVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return aVar.b(str, i, i2, z);
        }

        public final String b(String str, int i, int i2, boolean z) {
            C8632dsu.d((Object) str, "");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C7872dIo c7872dIo = new C7872dIo();
                    c7872dIo.c(str, i, i3);
                    b(c7872dIo, str, i3, i2, z);
                    return c7872dIo.v();
                }
            }
            String substring = str.substring(i, i2);
            C8632dsu.b(substring, "");
            return substring;
        }

        private final void b(C7872dIo c7872dIo, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt == 37 && (i3 = i + 2) < i2) {
                        int c = dGB.c(str.charAt(i + 1));
                        int c2 = dGB.c(str.charAt(i3));
                        if (c != -1 && c2 != -1) {
                            c7872dIo.c((c << 4) + c2);
                            i = Character.charCount(codePointAt) + i3;
                        }
                        c7872dIo.g(codePointAt);
                        i += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            c7872dIo.c(32);
                            i++;
                        }
                        c7872dIo.g(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        private final boolean b(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && dGB.c(str.charAt(i + 1)) != -1 && dGB.c(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String b(a aVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return aVar.e(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        public final String e(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            boolean a;
            C8632dsu.d((Object) str, "");
            C8632dsu.d((Object) str2, "");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                    a = duD.a((CharSequence) str2, (char) codePointAt, false, 2, (Object) null);
                    if (!a) {
                        if (codePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!b(str, i3, i2)) {
                                        C7872dIo c7872dIo = new C7872dIo();
                                        c7872dIo.c(str, i, i3);
                                        a(c7872dIo, str, i3, i2, str2, z, z2, z3, z4, charset);
                                        return c7872dIo.v();
                                    }
                                    if (codePointAt != 43 && z3) {
                                        C7872dIo c7872dIo2 = new C7872dIo();
                                        c7872dIo2.c(str, i, i3);
                                        a(c7872dIo2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                        return c7872dIo2.v();
                                    }
                                    i3 += Character.charCount(codePointAt);
                                }
                            }
                        }
                        if (codePointAt != 43) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                C7872dIo c7872dIo22 = new C7872dIo();
                c7872dIo22.c(str, i, i3);
                a(c7872dIo22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return c7872dIo22.v();
            }
            String substring = str.substring(i, i2);
            C8632dsu.b(substring, "");
            return substring;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
            if (b(r16, r5, r18) == false) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a(o.C7872dIo r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lc3
                if (r1 == 0) goto Lba
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L25
                r8 = 9
                if (r7 == r8) goto L35
                r8 = 10
                if (r7 == r8) goto L35
                r8 = 12
                if (r7 == r8) goto L35
                r8 = 13
                if (r7 == r8) goto L35
            L25:
                r8 = 43
                if (r7 != r8) goto L3a
                if (r22 == 0) goto L3a
                if (r20 == 0) goto L30
                java.lang.String r8 = "+"
                goto L32
            L30:
                java.lang.String r8 = "%2B"
            L32:
                r15.b(r8)
            L35:
                r8 = r14
                r12 = r19
                goto Lb3
            L3a:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L6a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L6a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4a
                if (r23 == 0) goto L6a
            L4a:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = o.C8684dus.d(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L68
                if (r7 != r9) goto L63
                if (r20 == 0) goto L68
                if (r21 == 0) goto L63
                r8 = r14
                boolean r10 = r14.b(r1, r5, r2)
                if (r10 != 0) goto L64
                goto L6d
            L63:
                r8 = r14
            L64:
                r15.g(r7)
                goto Lb3
            L68:
                r8 = r14
                goto L6d
            L6a:
                r8 = r14
                r12 = r19
            L6d:
                if (r6 != 0) goto L74
                o.dIo r6 = new o.dIo
                r6.<init>()
            L74:
                if (r3 == 0) goto L88
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = o.C8632dsu.c(r3, r10)
                if (r10 == 0) goto L7f
                goto L88
            L7f:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.e(r1, r5, r10, r3)
                goto L8b
            L88:
                r6.g(r7)
            L8b:
                boolean r10 = r6.m()
                if (r10 != 0) goto Lb3
                byte r10 = r6.l()
                r15.c(r9)
                char[] r11 = o.C7818dGm.a()
                r13 = r10 & 255(0xff, float:3.57E-43)
                int r13 = r13 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.c(r11)
                char[] r11 = o.C7818dGm.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.c(r10)
                goto L8b
            Lb3:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lba:
                r8 = r14
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            Lc3:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7818dGm.a.a(o.dIo, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }
    }
}
