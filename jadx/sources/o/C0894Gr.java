package o;

import androidx.compose.runtime.State;
import java.util.Comparator;
import java.util.Locale;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.FQ;

/* renamed from: o.Gr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0894Gr {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        r7 = o.C8576dqs.c((java.lang.Iterable) r7, (java.util.Comparator) new o.C0894Gr.b());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final o.FQ r25, final com.netflix.hawkins.consumer.tokens.Theme r26, final o.FY r27, final java.lang.String r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0894Gr.c(o.FQ, com.netflix.hawkins.consumer.tokens.Theme, o.FY, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: o.Gr$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((FQ.a) t).c(), ((FQ.a) t2).c());
            return compareValues;
        }
    }

    public static final String d(String str) {
        C8632dsu.c((Object) str, "");
        if (str.length() != 2) {
            return str;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        C8632dsu.a(upperCase, "");
        int codePointAt = Character.codePointAt(upperCase, 0);
        int codePointAt2 = Character.codePointAt(upperCase, 1);
        if (Character.isLetter(upperCase.charAt(0)) && Character.isLetter(upperCase.charAt(1))) {
            char[] chars = Character.toChars(codePointAt + 127397);
            C8632dsu.a(chars, "");
            String str2 = new String(chars);
            char[] chars2 = Character.toChars(codePointAt2 + 127397);
            C8632dsu.a(chars2, "");
            String str3 = new String(chars2);
            return str2 + str3;
        }
        return str;
    }

    private static final String b(State<String> state) {
        return state.getValue();
    }
}
