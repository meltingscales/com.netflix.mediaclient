package o;

import androidx.compose.runtime.MutableState;
import com.netflix.clcs.models.ItemAlignment;
import com.netflix.clcs.models.Layout;
import com.netflix.clcs.models.StackContentJustification;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* renamed from: o.Gk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0887Gk {

    /* renamed from: o.Gk$e */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[StackContentJustification.values().length];
            try {
                iArr[StackContentJustification.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackContentJustification.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StackContentJustification.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StackContentJustification.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StackContentJustification.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            e = iArr;
            int[] iArr2 = new int[ItemAlignment.values().length];
            try {
                iArr2[ItemAlignment.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ItemAlignment.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ItemAlignment.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ItemAlignment.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ItemAlignment.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            c = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e5, code lost:
        if (r5 == null) goto L353;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final com.netflix.clcs.models.Layout r33, final com.netflix.hawkins.consumer.tokens.Theme r34, final java.lang.String r35, final o.FY r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0887Gk.a(com.netflix.clcs.models.Layout, com.netflix.hawkins.consumer.tokens.Theme, java.lang.String, o.FY, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: o.Gk$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int c;
            int compareValues;
            Layout.Template template = (Layout.Template) ((Pair) t).c();
            Layout.Template.Flexible flexible = template instanceof Layout.Template.Flexible ? (Layout.Template.Flexible) template : null;
            int i = 0;
            if (flexible != null) {
                c = flexible.b();
            } else {
                Layout.Template.a aVar = template instanceof Layout.Template.a ? (Layout.Template.a) template : null;
                c = aVar != null ? aVar.c() : 0;
            }
            Layout.Template template2 = (Layout.Template) ((Pair) t2).c();
            Layout.Template.Flexible flexible2 = template2 instanceof Layout.Template.Flexible ? (Layout.Template.Flexible) template2 : null;
            if (flexible2 != null) {
                i = flexible2.b();
            } else {
                Layout.Template.a aVar2 = template2 instanceof Layout.Template.a ? (Layout.Template.a) template2 : null;
                if (aVar2 != null) {
                    i = aVar2.c();
                }
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(c), Integer.valueOf(i));
            return compareValues;
        }
    }

    /* renamed from: o.Gk$d */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int c;
            int compareValues;
            Layout.Template template = (Layout.Template) ((Pair) t).c();
            Layout.Template.Flexible flexible = template instanceof Layout.Template.Flexible ? (Layout.Template.Flexible) template : null;
            int i = 0;
            if (flexible != null) {
                c = flexible.b();
            } else {
                Layout.Template.a aVar = template instanceof Layout.Template.a ? (Layout.Template.a) template : null;
                c = aVar != null ? aVar.c() : 0;
            }
            Layout.Template template2 = (Layout.Template) ((Pair) t2).c();
            Layout.Template.Flexible flexible2 = template2 instanceof Layout.Template.Flexible ? (Layout.Template.Flexible) template2 : null;
            if (flexible2 != null) {
                i = flexible2.b();
            } else {
                Layout.Template.a aVar2 = template2 instanceof Layout.Template.a ? (Layout.Template.a) template2 : null;
                if (aVar2 != null) {
                    i = aVar2.c();
                }
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(c), Integer.valueOf(i));
            return compareValues;
        }
    }

    private static final int c(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }
}
