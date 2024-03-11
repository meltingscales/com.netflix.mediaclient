package o;

import androidx.compose.runtime.MutableState;
import androidx.navigation.NavHostController;
import com.airbnb.android.showkase.models.ShowkaseCurrentScreen;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes5.dex */
public final class O {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
        r4 = o.C8576dqs.c((java.lang.Iterable) r4, (java.util.Comparator) new o.O.c());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final java.util.Map<java.lang.String, ? extends java.util.List<o.A>> r18, final androidx.compose.runtime.MutableState<o.D> r19, final androidx.navigation.NavHostController r20, androidx.compose.runtime.Composer r21, final int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = ""
            o.C8632dsu.c(r0, r4)
            o.C8632dsu.c(r1, r4)
            o.C8632dsu.c(r2, r4)
            r4 = 1290341081(0x4ce90ad9, float:1.2218132E8)
            r5 = r21
            androidx.compose.runtime.Composer r15 = r5.startRestartGroup(r4)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L28
            r5 = -1
            java.lang.String r6 = "com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreen (ShowkaseColorsInAGroupScreen.kt:32)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r5, r6)
        L28:
            java.lang.Object r4 = r19.getValue()
            o.D r4 = (o.D) r4
            java.lang.String r4 = r4.c()
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L8b
            o.O$c r5 = new o.O$c
            r5.<init>()
            java.util.List r4 = o.C8570dqm.b(r4, r5)
            if (r4 == 0) goto L8b
            java.util.List r4 = d(r4, r1)
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.Companion
            java.lang.String r6 = "ColorsInAGroupList"
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.platform.TestTagKt.testTag(r5, r6)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1 r13 = new com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$1
            r13.<init>()
            r4 = 6
            r16 = 254(0xfe, float:3.56E-43)
            r14 = r15
            r17 = r15
            r15 = r4
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$2 r4 = new com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$2
            r4.<init>()
            r5 = 0
            r6 = r17
            o.G.b(r4, r6, r5)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L7b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L7b:
            androidx.compose.runtime.ScopeUpdateScope r4 = r6.endRestartGroup()
            if (r4 != 0) goto L82
            goto L8a
        L82:
            com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$3 r5 = new com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$3
            r5.<init>()
            r4.updateScope(r5)
        L8a:
            return
        L8b:
            r6 = r15
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L95
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L95:
            androidx.compose.runtime.ScopeUpdateScope r4 = r6.endRestartGroup()
            if (r4 != 0) goto L9c
            goto La4
        L9c:
            com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$groupColorsList$2 r5 = new com.airbnb.android.showkase.ui.ShowkaseColorsInAGroupScreenKt$ShowkaseColorsInAGroupScreen$groupColorsList$2
            r5.<init>()
            r4.updateScope(r5)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.O.e(java.util.Map, androidx.compose.runtime.MutableState, androidx.navigation.NavHostController, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<D> mutableState, NavHostController navHostController) {
        if (mutableState.getValue().h()) {
            H.c(mutableState);
            return;
        }
        H.d(mutableState);
        P.e(navHostController, ShowkaseCurrentScreen.COLOR_GROUPS);
    }

    /* loaded from: classes5.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((A) t).d(), ((A) t2).d());
            return compareValues;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<o.A> d(java.util.List<o.A> r4, androidx.compose.runtime.MutableState<o.D> r5) {
        /*
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            java.lang.Object r0 = r5.getValue()
            o.D r0 = (o.D) r0
            boolean r0 = r0.h()
            if (r0 != 0) goto L15
            goto L65
        L15:
            java.lang.Object r1 = r5.getValue()
            o.D r1 = (o.D) r1
            java.lang.String r1 = r1.e()
            r2 = 1
            if (r1 == 0) goto L2b
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = r2
        L2c:
            r1 = r1 ^ r2
            if (r0 != r1) goto L65
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r4.next()
            r2 = r1
            o.A r2 = (o.A) r2
            java.lang.Object r3 = r5.getValue()
            o.D r3 = (o.D) r3
            java.lang.String r3 = r3.e()
            o.C8632dsu.d(r3)
            java.lang.String r2 = r2.d()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            boolean r2 = o.T.e(r3, r2)
            if (r2 == 0) goto L38
            r0.add(r1)
            goto L38
        L64:
            r4 = r0
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.O.d(java.util.List, androidx.compose.runtime.MutableState):java.util.List");
    }
}
