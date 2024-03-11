package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Chain {
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r7 == 2) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r7 == 2) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5 = true;
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        r16 = r15;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.solver.LinearSystem r38, int r39, int r40, androidx.constraintlayout.solver.widgets.ChainHead r41) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}
