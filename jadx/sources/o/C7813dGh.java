package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.text.Regex;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: o.dGh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7813dGh {
    private final boolean f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final String k;
    private final String m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13806o;
    public static final d c = new d(null);
    private static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern b = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public final String a() {
        return this.i;
    }

    public final String i() {
        return this.m;
    }

    private C7813dGh(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.i = str;
        this.m = str2;
        this.g = j;
        this.h = str3;
        this.k = str4;
        this.f13806o = z;
        this.f = z2;
        this.n = z3;
        this.j = z4;
    }

    public /* synthetic */ C7813dGh(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C8627dsp c8627dsp) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7813dGh) {
            C7813dGh c7813dGh = (C7813dGh) obj;
            if (C8632dsu.c((Object) c7813dGh.i, (Object) this.i) && C8632dsu.c((Object) c7813dGh.m, (Object) this.m) && c7813dGh.g == this.g && C8632dsu.c((Object) c7813dGh.h, (Object) this.h) && C8632dsu.c((Object) c7813dGh.k, (Object) this.k) && c7813dGh.f13806o == this.f13806o && c7813dGh.f == this.f && c7813dGh.n == this.n && c7813dGh.j == this.j) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int hashCode = this.i.hashCode();
        int hashCode2 = this.m.hashCode();
        int hashCode3 = Long.hashCode(this.g);
        int hashCode4 = this.h.hashCode();
        int hashCode5 = this.k.hashCode();
        int hashCode6 = Boolean.hashCode(this.f13806o);
        int hashCode7 = Boolean.hashCode(this.f);
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + Boolean.hashCode(this.n)) * 31) + Boolean.hashCode(this.j);
    }

    public String toString() {
        return c(false);
    }

    public final String c(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        sb.append('=');
        sb.append(this.m);
        if (this.n) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(dGW.e(new Date(this.g)));
            }
        }
        if (!this.j) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.k);
        if (this.f13806o) {
            sb.append("; secure");
        }
        if (this.f) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C8632dsu.b(sb2, "");
        return sb2;
    }

    /* renamed from: o.dGh$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private String b;
        private boolean c;
        private String d;
        private boolean e;
        private boolean f;
        private String g;
        private boolean i;
        private long a = 253402300799999L;
        private String h = "/";

        public final c a() {
            this.f = true;
            return this;
        }

        public final c c() {
            this.e = true;
            return this;
        }

        public final c e(String str) {
            CharSequence n;
            C8632dsu.d((Object) str, "");
            n = duD.n((CharSequence) str);
            if (C8632dsu.c((Object) n.toString(), (Object) str)) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final c b(String str) {
            CharSequence n;
            C8632dsu.d((Object) str, "");
            n = duD.n((CharSequence) str);
            if (C8632dsu.c((Object) n.toString(), (Object) str)) {
                this.g = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        public final c c(String str) {
            C8632dsu.d((Object) str, "");
            return b(str, false);
        }

        private final c b(String str, boolean z) {
            String a = C7831dGz.a(str);
            if (a != null) {
                this.d = a;
                this.c = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final c a(String str) {
            boolean i;
            C8632dsu.d((Object) str, "");
            i = C8691duz.i(str, "/", false, 2, null);
            if (i) {
                this.h = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final C7813dGh b() {
            String str = this.b;
            if (str != null) {
                String str2 = this.g;
                if (str2 != null) {
                    long j = this.a;
                    String str3 = this.d;
                    if (str3 != null) {
                        return new C7813dGh(str, str2, j, str3, this.h, this.f, this.e, this.i, this.c, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }
    }

    /* renamed from: o.dGh$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private final boolean b(String str, String str2) {
            boolean a;
            if (C8632dsu.c((Object) str, (Object) str2)) {
                return true;
            }
            a = C8691duz.a(str, str2, false, 2, null);
            return a && str.charAt((str.length() - str2.length()) - 1) == '.' && !dGB.b(str);
        }

        public final C7813dGh b(C7818dGm c7818dGm, String str) {
            C8632dsu.d(c7818dGm, "");
            C8632dsu.d((Object) str, "");
            return d(System.currentTimeMillis(), c7818dGm, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
            if (r1 > 253402300799999L) goto L60;
         */
        /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C7813dGh d(long r29, o.C7818dGm r31, java.lang.String r32) {
            /*
                Method dump skipped, instructions count: 377
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C7813dGh.d.d(long, o.dGm, java.lang.String):o.dGh");
        }

        private final long c(String str, int i, int i2) {
            int d;
            int c = c(str, i, i2, false);
            Matcher matcher = C7813dGh.b.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (c < i2) {
                int c2 = c(str, c + 1, i2, true);
                matcher.region(c, c2);
                if (i4 == -1 && matcher.usePattern(C7813dGh.b).matches()) {
                    String group = matcher.group(1);
                    C8632dsu.b(group, "");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C8632dsu.b(group2, "");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C8632dsu.b(group3, "");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(C7813dGh.e).matches()) {
                    String group4 = matcher.group(1);
                    C8632dsu.b(group4, "");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(C7813dGh.d).matches()) {
                    String group5 = matcher.group(1);
                    C8632dsu.b(group5, "");
                    Locale locale = Locale.US;
                    C8632dsu.b(locale, "");
                    if (group5 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = group5.toLowerCase(locale);
                    C8632dsu.b(lowerCase, "");
                    String pattern = C7813dGh.d.pattern();
                    C8632dsu.b(pattern, "");
                    d = duD.d((CharSequence) pattern, lowerCase, 0, false, 6, (Object) null);
                    i6 = d / 4;
                } else if (i3 == -1 && matcher.usePattern(C7813dGh.a).matches()) {
                    String group6 = matcher.group(1);
                    C8632dsu.b(group6, "");
                    i3 = Integer.parseInt(group6);
                }
                c = c(str, c2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 > i5 || 31 < i5) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i4 < 0 || 23 < i4) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i7 < 0 || 59 < i7) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    if (i8 < 0 || 59 < i8) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(dGB.c);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, i3);
                    gregorianCalendar.set(2, i6 - 1);
                    gregorianCalendar.set(5, i5);
                    gregorianCalendar.set(11, i4);
                    gregorianCalendar.set(12, i7);
                    gregorianCalendar.set(13, i8);
                    gregorianCalendar.set(14, 0);
                    return gregorianCalendar.getTimeInMillis();
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final int c(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private final long c(String str) {
            boolean i;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new Regex("-?\\d+").e(str)) {
                    i = C8691duz.i(str, "-", false, 2, null);
                    return i ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        private final String a(String str) {
            boolean a;
            String c;
            a = C8691duz.a(str, ".", false, 2, null);
            if (!(!a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c = duD.c(str, (CharSequence) ".");
            String a2 = C7831dGz.a(c);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException();
        }

        public final List<C7813dGh> b(C7818dGm c7818dGm, C7819dGn c7819dGn) {
            List<C7813dGh> i;
            C8632dsu.d(c7818dGm, "");
            C8632dsu.d(c7819dGn, "");
            List<String> b = c7819dGn.b("Set-Cookie");
            int size = b.size();
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < size; i2++) {
                C7813dGh b2 = b(c7818dGm, b.get(i2));
                if (b2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(b2);
                }
            }
            if (arrayList != null) {
                List<C7813dGh> unmodifiableList = Collections.unmodifiableList(arrayList);
                C8632dsu.b(unmodifiableList, "");
                return unmodifiableList;
            }
            i = C8569dql.i();
            return i;
        }
    }
}
