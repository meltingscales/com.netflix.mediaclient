package androidx.compose.compiler.plugins.kotlin.analysis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import o.C8569dql;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C8671duf;
import o.InterfaceC8678dum;
import o.duB;
import o.duD;
import o.duF;

/* loaded from: classes5.dex */
public final class FqNameMatcher {
    private final String key;
    private final int mask;
    private final String pattern;
    private final Regex regex;
    public static final Companion Companion = new Companion(null);
    private static final Regex validPatternMatcher = new Regex("((\\w+\\*{0,2}|\\*{1,2})\\.)*((\\w+(<?(?<genericmask>([*|_],)*[*|_])>)+)|(\\w+\\*{0,2}|\\*{1,2}))");
    private static final Regex singleWildcardSuffix = new Regex("\\w+");
    private static final Regex multiWildcardSuffix = new Regex("[\\w\\.]+");

    public FqNameMatcher(String str) {
        Regex regex;
        List<String> d;
        int d2;
        Character d3;
        this.pattern = str;
        InterfaceC8678dum b = validPatternMatcher.b(str);
        if (b == null) {
            throw new IllegalStateException((str + " is not a valid pattern").toString());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < this.pattern.length() && !z) {
            char charAt = this.pattern.charAt(i);
            if (charAt == '*') {
                int i2 = i + 1;
                d3 = duB.d((CharSequence) this.pattern, i2);
                if (d3 != null && d3.charValue() == '*') {
                    sb.append("[\\w\\.]+");
                    i = i2;
                } else {
                    sb.append("\\w+");
                }
                z2 = true;
            } else if (charAt == '.') {
                if (z2) {
                    sb.append("\\.");
                } else {
                    sb2.append('.');
                }
            } else if (charAt == '<') {
                z = true;
            } else if (z2) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
            i++;
            z = z;
            z2 = z2;
        }
        if (sb.length() > 0) {
            String sb3 = sb.toString();
            regex = singleWildcardSuffix;
            if (!C8632dsu.c((Object) sb3, (Object) regex.b())) {
                regex = multiWildcardSuffix;
                if (!C8632dsu.c((Object) sb3, (Object) regex.b())) {
                    regex = new Regex(sb3);
                }
            }
        } else {
            regex = null;
        }
        this.regex = regex;
        C8671duf a = duF.a(b.e(), "genericmask");
        if (a == null) {
            this.key = sb2.toString();
            this.mask = -1;
            return;
        }
        d = duD.d((CharSequence) a.a(), new String[]{","}, false, 0, 6, (Object) null);
        d2 = C8572dqo.d(d, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (String str2 : d) {
            arrayList.add(Integer.valueOf(C8632dsu.c((Object) str2, (Object) "*") ? 1 : 0));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        int i3 = 1;
        Integer num = it.next();
        while (it.hasNext()) {
            if (i3 < 0) {
                C8569dql.h();
            }
            i3++;
            num = Integer.valueOf(((Number) num).intValue() | (((Number) it.next()).intValue() << i3));
        }
        this.mask = ((Number) num).intValue();
        this.key = sb2.subSequence(0, a.c().d() - 1).toString();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
