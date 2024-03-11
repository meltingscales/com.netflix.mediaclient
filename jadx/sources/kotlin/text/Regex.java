package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.C8679dun;
import o.InterfaceC8678dum;
import o.drM;
import o.drO;
import o.dtQ;
import o.dtY;
import o.duD;

/* loaded from: classes.dex */
public final class Regex implements Serializable {
    public static final b d = new b(null);
    private final Pattern e;

    public Regex(Pattern pattern) {
        C8632dsu.c((Object) pattern, "");
        this.e = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            o.C8632dsu.a(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(java.lang.String r3, kotlin.text.RegexOption r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            kotlin.text.Regex$b r1 = kotlin.text.Regex.d
            int r4 = r4.c()
            int r4 = kotlin.text.Regex.b.b(r1, r4)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r4)
            o.C8632dsu.a(r3, r0)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    public final String b() {
        String pattern = this.e.pattern();
        C8632dsu.a(pattern, "");
        return pattern;
    }

    public final boolean e(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return this.e.matcher(charSequence).matches();
    }

    public final boolean d(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        return this.e.matcher(charSequence).find();
    }

    public static /* synthetic */ InterfaceC8678dum a(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.b(charSequence, i);
    }

    public final InterfaceC8678dum b(CharSequence charSequence, int i) {
        C8632dsu.c((Object) charSequence, "");
        Matcher matcher = this.e.matcher(charSequence);
        C8632dsu.a(matcher, "");
        return C8679dun.b(matcher, i, charSequence);
    }

    public static /* synthetic */ dtQ d(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.d(charSequence, i);
    }

    public final dtQ<InterfaceC8678dum> d(final CharSequence charSequence, final int i) {
        dtQ<InterfaceC8678dum> d2;
        C8632dsu.c((Object) charSequence, "");
        if (i < 0 || i > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
        }
        d2 = dtY.d(new drO<InterfaceC8678dum>() { // from class: kotlin.text.Regex$findAll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final InterfaceC8678dum invoke() {
                return Regex.this.b(charSequence, i);
            }
        }, Regex$findAll$2.e);
        return d2;
    }

    public final InterfaceC8678dum b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        Matcher matcher = this.e.matcher(charSequence);
        C8632dsu.a(matcher, "");
        return C8679dun.e(matcher, charSequence);
    }

    public final String a(CharSequence charSequence, String str) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) str, "");
        String replaceAll = this.e.matcher(charSequence).replaceAll(str);
        C8632dsu.a(replaceAll, "");
        return replaceAll;
    }

    public final String b(CharSequence charSequence, drM<? super InterfaceC8678dum, ? extends CharSequence> drm) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) drm, "");
        int i = 0;
        InterfaceC8678dum a = a(this, charSequence, 0, 2, null);
        if (a == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, a.d().h().intValue());
            sb.append(drm.invoke(a));
            i = a.d().g().intValue() + 1;
            a = a.b();
            if (i >= length) {
                break;
            }
        } while (a != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    public final List<String> c(CharSequence charSequence, int i) {
        List<String> e;
        C8632dsu.c((Object) charSequence, "");
        duD.b(i);
        Matcher matcher = this.e.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            e = C8566dqi.e(charSequence.toString());
            return e;
        }
        ArrayList arrayList = new ArrayList(i > 0 ? C8657dts.i(i, 10) : 10);
        int i2 = i - 1;
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.e.toString();
        C8632dsu.a(pattern, "");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.e.pattern();
        C8632dsu.a(pattern, "");
        return new Serialized(pattern, this.e.flags());
    }

    /* loaded from: classes6.dex */
    static final class Serialized implements Serializable {
        public static final b b = new b(null);
        private static final long serialVersionUID = 0;
        private final int d;
        private final String e;

        /* loaded from: classes6.dex */
        public static final class b {
            public /* synthetic */ b(C8627dsp c8627dsp) {
                this();
            }

            private b() {
            }
        }

        public Serialized(String str, int i) {
            C8632dsu.c((Object) str, "");
            this.e = str;
            this.d = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.e, this.d);
            C8632dsu.a(compile, "");
            return new Regex(compile);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        private b() {
        }
    }
}
