package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;

/* renamed from: o.dGq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7822dGq {
    private final String d;
    private final String[] e;
    private final String h;
    private final String i;
    public static final c b = new c(null);
    private static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public String toString() {
        return this.d;
    }

    private C7822dGq(String str, String str2, String str3, String[] strArr) {
        this.d = str;
        this.i = str2;
        this.h = str3;
        this.e = strArr;
    }

    public /* synthetic */ C7822dGq(String str, String str2, String str3, String[] strArr, C8627dsp c8627dsp) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset c(C7822dGq c7822dGq, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return c7822dGq.e(charset);
    }

    public final Charset e(Charset charset) {
        String a2 = a("charset");
        if (a2 != null) {
            try {
                return Charset.forName(a2);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            o.C8632dsu.d(r6, r0)
            java.lang.String[] r0 = r5.e
            o.dtp r0 = o.C8561dqd.h(r0)
            r1 = 2
            o.dth r0 = o.C8653dto.a(r0, r1)
            int r1 = r0.d()
            int r2 = r0.e()
            int r0 = r0.a()
            if (r0 < 0) goto L21
            if (r1 > r2) goto L38
            goto L23
        L21:
            if (r1 < r2) goto L38
        L23:
            java.lang.String[] r3 = r5.e
            r3 = r3[r1]
            r4 = 1
            boolean r3 = o.C8684dus.e(r3, r6, r4)
            if (r3 == 0) goto L34
            java.lang.String[] r6 = r5.e
            int r1 = r1 + r4
            r6 = r6[r1]
            return r6
        L34:
            if (r1 == r2) goto L38
            int r1 = r1 + r0
            goto L23
        L38:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7822dGq.a(java.lang.String):java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7822dGq) && C8632dsu.c((Object) ((C7822dGq) obj).d, (Object) this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    /* renamed from: o.dGq$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public final C7822dGq d(String str) {
            boolean i;
            boolean a;
            C8632dsu.d((Object) str, "");
            Matcher matcher = C7822dGq.a.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
            }
            String group = matcher.group(1);
            C8632dsu.b(group, "");
            Locale locale = Locale.US;
            C8632dsu.b(locale, "");
            if (group == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = group.toLowerCase(locale);
            C8632dsu.b(lowerCase, "");
            String group2 = matcher.group(2);
            C8632dsu.b(group2, "");
            C8632dsu.b(locale, "");
            if (group2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = group2.toLowerCase(locale);
            C8632dsu.b(lowerCase2, "");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C7822dGq.c.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    C8632dsu.b(substring, "");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else {
                        i = C8691duz.i(group4, "'", false, 2, null);
                        if (i) {
                            a = C8691duz.a(group4, "'", false, 2, null);
                            if (a && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C8632dsu.b(group4, "");
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C7822dGq(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final C7822dGq e(String str) {
            C8632dsu.d((Object) str, "");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }
}
