package o;

import com.netflix.android.org.json.HTTP;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import o.C8632dsu;
import o.C8654dtp;
import o.dpD;
import o.duD;

/* loaded from: classes.dex */
public class duD extends C8691duz {
    public static final CharSequence e(CharSequence charSequence, int i, char c) {
        C8632dsu.c((Object) charSequence, "");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            dqB it = new C8654dtp(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.nextInt();
                sb.append(c);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String b(String str, int i, char c) {
        C8632dsu.c((Object) str, "");
        return e(str, i, c).toString();
    }

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8568dqk {
        final /* synthetic */ CharSequence b;
        private int c;

        a(CharSequence charSequence) {
            this.b = charSequence;
        }

        @Override // o.AbstractC8568dqk
        public char a() {
            CharSequence charSequence = this.b;
            int i = this.c;
            this.c = i + 1;
            return charSequence.charAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c < this.b.length();
        }
    }

    public static final AbstractC8568dqk k(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return new a(charSequence);
    }

    public static final C8654dtp h(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return new C8654dtp(0, charSequence.length() - 1);
    }

    public static int l(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return charSequence.length() - 1;
    }

    public static final String c(CharSequence charSequence, C8654dtp c8654dtp) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) c8654dtp, "");
        return charSequence.subSequence(c8654dtp.h().intValue(), c8654dtp.g().intValue() + 1).toString();
    }

    public static /* synthetic */ String g(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return d(str, c, str2);
    }

    public static final String d(String str, char c, String str2) {
        int b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        b = b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String a(String str, String str2, String str3, int i, Object obj) {
        String d;
        if ((i & 2) != 0) {
            str3 = str;
        }
        d = d(str, str2, str3);
        return d;
    }

    public static String d(String str, String str2, String str3) {
        int d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        d = d((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (d == -1) {
            return str3;
        }
        String substring = str.substring(0, d);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String d(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return e(str, c, str2);
    }

    public static final String e(String str, char c, String str2) {
        int b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        b = b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return b(str, str2, str3);
    }

    public static final String b(String str, String str2, String str3) {
        int d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        d = d((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (d == -1) {
            return str3;
        }
        String substring = str.substring(d + str2.length(), str.length());
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String h(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return a(str, c, str2);
    }

    public static final String a(String str, char c, String str2) {
        int c2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        c2 = c((CharSequence) str, c, 0, false, 6, (Object) null);
        if (c2 == -1) {
            return str2;
        }
        String substring = str.substring(0, c2);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String g(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return a(str, str2, str3);
    }

    public static final String a(String str, String str2, String str3) {
        int c;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        c = c((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (c == -1) {
            return str3;
        }
        String substring = str.substring(0, c);
        C8632dsu.a(substring, "");
        return substring;
    }

    public static /* synthetic */ String f(String str, char c, String str2, int i, Object obj) {
        String c2;
        if ((i & 2) != 0) {
            str2 = str;
        }
        c2 = c(str, c, str2);
        return c2;
    }

    public static String c(String str, char c, String str2) {
        int c2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        c2 = c((CharSequence) str, c, 0, false, 6, (Object) null);
        if (c2 == -1) {
            return str2;
        }
        String substring = str.substring(c2 + 1, str.length());
        C8632dsu.a(substring, "");
        return substring;
    }

    public static CharSequence c(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        C8632dsu.a(sb, "");
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        C8632dsu.a(sb, "");
        return sb;
    }

    public static CharSequence b(CharSequence charSequence, C8654dtp c8654dtp, CharSequence charSequence2) {
        CharSequence c;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) c8654dtp, "");
        C8632dsu.c((Object) charSequence2, "");
        c = c(charSequence, c8654dtp.h().intValue(), c8654dtp.g().intValue() + 1, charSequence2);
        return c;
    }

    public static String c(String str, CharSequence charSequence) {
        boolean f;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charSequence, "");
        f = f((CharSequence) str, charSequence, false, 2, (Object) null);
        if (f) {
            String substring = str.substring(charSequence.length());
            C8632dsu.a(substring, "");
            return substring;
        }
        return str;
    }

    public static String b(String str, CharSequence charSequence) {
        boolean b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charSequence, "");
        b = b((CharSequence) str, charSequence, false, 2, (Object) null);
        if (b) {
            String substring = str.substring(0, str.length() - charSequence.length());
            C8632dsu.a(substring, "");
            return substring;
        }
        return str;
    }

    public static final String d(String str, CharSequence charSequence, CharSequence charSequence2) {
        boolean f;
        boolean b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            f = f((CharSequence) str, charSequence, false, 2, (Object) null);
            if (f) {
                b = b((CharSequence) str, charSequence2, false, 2, (Object) null);
                if (b) {
                    String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                    C8632dsu.a(substring, "");
                    return substring;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static String j(String str, CharSequence charSequence) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) charSequence, "");
        return d(str, charSequence, charSequence);
    }

    public static final boolean d(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C8675duj.c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean e(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, c, z);
    }

    public static final boolean b(CharSequence charSequence, char c, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        return charSequence.length() > 0 && C8675duj.c(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean f(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return j(charSequence, charSequence2, z);
    }

    public static final boolean j(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean i;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            i = C8691duz.i((String) charSequence, (String) charSequence2, false, 2, null);
            return i;
        }
        return d(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean a2;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            a2 = C8691duz.a((String) charSequence, (String) charSequence2, false, 2, null);
            return a2;
        }
        return d(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int b;
        int l;
        char e;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            e = C8563dqf.e(cArr);
            return ((String) charSequence).indexOf(e, i);
        }
        b = C8657dts.b(i, 0);
        l = l(charSequence);
        dqB it = new C8654dtp(b, l).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            for (char c : cArr) {
                if (C8675duj.c(c, charAt, z)) {
                    return nextInt;
                }
            }
        }
        return -1;
    }

    public static final int c(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int l;
        int i2;
        char e;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            e = C8563dqf.e(cArr);
            return ((String) charSequence).lastIndexOf(e, i);
        }
        l = l(charSequence);
        for (i2 = C8657dts.i(i, l); -1 < i2; i2--) {
            char charAt = charSequence.charAt(i2);
            for (char c : cArr) {
                if (C8675duj.c(c, charAt, z)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return c(charSequence, charSequence2, i, i2, z, z2);
    }

    private static final int c(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int l;
        int i3;
        int b;
        C8646dth j;
        boolean d;
        int b2;
        int i4;
        if (!z2) {
            b2 = C8657dts.b(i, 0);
            i4 = C8657dts.i(i2, charSequence.length());
            j = new C8654dtp(b2, i4);
        } else {
            l = l(charSequence);
            i3 = C8657dts.i(i, l);
            b = C8657dts.b(i2, 0);
            j = C8657dts.j(i3, b);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int d2 = j.d();
            int e = j.e();
            int a2 = j.a();
            if ((a2 <= 0 || d2 > e) && (a2 >= 0 || e > d2)) {
                return -1;
            }
            while (true) {
                d = C8691duz.d((String) charSequence2, 0, (String) charSequence, d2, charSequence2.length(), z);
                if (d) {
                    return d2;
                }
                if (d2 == e) {
                    return -1;
                }
                d2 += a2;
            }
        } else {
            int d3 = j.d();
            int e2 = j.e();
            int a3 = j.a();
            if ((a3 <= 0 || d3 > e2) && (a3 >= 0 || e2 > d3)) {
                return -1;
            }
            while (!d(charSequence2, 0, charSequence, d3, charSequence2.length(), z)) {
                if (d3 == e2) {
                    return -1;
                }
                d3 += a3;
            }
            return d3;
        }
    }

    public static final Pair<Integer, String> c(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int l;
        int i2;
        C8646dth j;
        Object obj;
        Object obj2;
        boolean d;
        int b;
        Object K;
        if (!z && collection.size() == 1) {
            K = C8576dqs.K(collection);
            String str = (String) K;
            int d2 = !z2 ? d(charSequence, str, i, false, 4, (Object) null) : c(charSequence, str, i, false, 4, (Object) null);
            if (d2 < 0) {
                return null;
            }
            return dpD.a(Integer.valueOf(d2), str);
        }
        if (z2) {
            l = l(charSequence);
            i2 = C8657dts.i(i, l);
            j = C8657dts.j(i2, 0);
        } else {
            b = C8657dts.b(i, 0);
            j = new C8654dtp(b, charSequence.length());
        }
        if (charSequence instanceof String) {
            int d3 = j.d();
            int e = j.e();
            int a2 = j.a();
            if ((a2 > 0 && d3 <= e) || (a2 < 0 && e <= d3)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        d = C8691duz.d(str2, 0, (String) charSequence, d3, str2.length(), z);
                        if (d) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (d3 == e) {
                            break;
                        }
                        d3 += a2;
                    } else {
                        return dpD.a(Integer.valueOf(d3), str3);
                    }
                }
            }
        } else {
            int d4 = j.d();
            int e2 = j.e();
            int a3 = j.a();
            if ((a3 > 0 && d4 <= e2) || (a3 < 0 && e2 <= d4)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (d(str4, 0, charSequence, d4, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (d4 == e2) {
                            break;
                        }
                        d4 += a3;
                    } else {
                        return dpD.a(Integer.valueOf(d4), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ int b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return d(charSequence, c, i, z);
    }

    public static final int d(CharSequence charSequence, char c, int i, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        if (z || !(charSequence instanceof String)) {
            return a(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int d(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c(charSequence, str, i, z);
    }

    public static final int c(CharSequence charSequence, String str, int i, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) str, "");
        if (z || !(charSequence instanceof String)) {
            return a(charSequence, str, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int c(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = l(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e(charSequence, c, i, z);
    }

    public static final int e(CharSequence charSequence, char c, int i, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        if (z || !(charSequence instanceof String)) {
            return c(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int c(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = l(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b(charSequence, str, i, z);
    }

    public static final int b(CharSequence charSequence, String str, int i, boolean z) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) str, "");
        if (z || !(charSequence instanceof String)) {
            return c(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean e;
        if ((i & 2) != 0) {
            z = false;
        }
        e = e(charSequence, charSequence2, z);
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r8, r0)
            o.C8632dsu.c(r9, r0)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L1b
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r4 = r10
            int r8 = o.C8684dus.b(r1, r2, r3, r4, r5, r6)
            if (r8 < 0) goto L2f
            goto L2d
        L1b:
            r2 = 0
            int r3 = r8.length()
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            int r8 = a(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L2f
        L2d:
            r8 = 1
            goto L30
        L2f:
            r8 = 0
        L30:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.duD.e(java.lang.CharSequence, java.lang.CharSequence, boolean):boolean");
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(charSequence, c, z);
    }

    public static final boolean a(CharSequence charSequence, char c, boolean z) {
        int b;
        C8632dsu.c((Object) charSequence, "");
        b = b(charSequence, c, 0, z, 2, (Object) null);
        return b >= 0;
    }

    static /* synthetic */ dtQ b(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return d(charSequence, cArr, i, z, i2);
    }

    private static final dtQ<C8654dtp> d(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        b(i2);
        return new C8673duh(charSequence, i, i2, new drX<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return c(charSequence2, num.intValue());
            }

            public final Pair<Integer, Integer> c(CharSequence charSequence2, int i3) {
                C8632dsu.c((Object) charSequence2, "");
                int a2 = duD.a(charSequence2, cArr, i3, z);
                if (a2 < 0) {
                    return null;
                }
                return dpD.a(Integer.valueOf(a2), 1);
            }
        });
    }

    static /* synthetic */ dtQ b(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return e(charSequence, strArr, i, z, i2);
    }

    private static final dtQ<C8654dtp> e(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        final List p;
        b(i2);
        p = C8564dqg.p(strArr);
        return new C8673duh(charSequence, i, i2, new drX<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>>() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final Pair<Integer, Integer> d(CharSequence charSequence2, int i3) {
                Pair c;
                C8632dsu.c((Object) charSequence2, "");
                c = duD.c(charSequence2, p, i3, z, false);
                if (c != null) {
                    return dpD.a(c.d(), Integer.valueOf(((String) c.a()).length()));
                }
                return null;
            }

            @Override // o.drX
            public /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence2, Integer num) {
                return d(charSequence2, num.intValue());
            }
        });
    }

    public static final void b(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static /* synthetic */ dtQ b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return e(charSequence, strArr, z, i);
    }

    public static final dtQ<String> e(final CharSequence charSequence, String[] strArr, boolean z, int i) {
        dtQ<String> k;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) strArr, "");
        k = C8670due.k(b(charSequence, strArr, 0, z, i, 2, (Object) null), new drM<C8654dtp, String>() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final String invoke(C8654dtp c8654dtp) {
                C8632dsu.c((Object) c8654dtp, "");
                return duD.c(charSequence, c8654dtp);
            }
        });
        return k;
    }

    public static /* synthetic */ List d(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(charSequence, strArr, z, i);
    }

    public static final List<String> a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Iterable<C8654dtp> o2;
        int d;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) strArr, "");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return d(charSequence, str, z, i);
            }
        }
        o2 = C8670due.o(b(charSequence, strArr, 0, z, i, 2, (Object) null));
        d = C8572dqo.d(o2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C8654dtp c8654dtp : o2) {
            arrayList.add(c(charSequence, c8654dtp));
        }
        return arrayList;
    }

    public static /* synthetic */ List b(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(charSequence, cArr, z, i);
    }

    public static final List<String> a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        Iterable<C8654dtp> o2;
        int d;
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) cArr, "");
        if (cArr.length == 1) {
            return d(charSequence, String.valueOf(cArr[0]), z, i);
        }
        o2 = C8670due.o(b(charSequence, cArr, 0, z, i, 2, (Object) null));
        d = C8572dqo.d(o2, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C8654dtp c8654dtp : o2) {
            arrayList.add(c(charSequence, c8654dtp));
        }
        return arrayList;
    }

    private static final List<String> d(CharSequence charSequence, String str, boolean z, int i) {
        List<String> e;
        b(i);
        int i2 = 0;
        int c = c(charSequence, str, 0, z);
        if (c == -1 || i == 1) {
            e = C8566dqi.e(charSequence.toString());
            return e;
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? C8657dts.i(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i2, c).toString());
            i2 = str.length() + c;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            c = c(charSequence, str, i2, z);
        } while (c != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final dtQ<String> m(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return b(charSequence, new String[]{HTTP.CRLF, "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static List<String> o(CharSequence charSequence) {
        List<String> q;
        C8632dsu.c((Object) charSequence, "");
        q = C8670due.q(m(charSequence));
        return q;
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2) {
        boolean a2;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            a2 = C8691duz.a((String) charSequence, (String) charSequence2, true);
            return a2;
        } else if (charSequence == charSequence2) {
            return true;
        } else {
            if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
                return false;
            }
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (!C8675duj.c(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C8632dsu.c(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static Boolean k(String str) {
        C8632dsu.c((Object) str, "");
        if (C8632dsu.c((Object) str, (Object) "true")) {
            return Boolean.TRUE;
        }
        if (C8632dsu.c((Object) str, (Object) "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String c(String str, char... cArr) {
        boolean c;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cArr, "");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            c = C8563dqf.c(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence n(CharSequence charSequence) {
        boolean c;
        C8632dsu.c((Object) charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            c = C8672dug.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence r(CharSequence charSequence) {
        boolean c;
        C8632dsu.c((Object) charSequence, "");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            c = C8672dug.c(charSequence.charAt(length));
            if (!c) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }
}
