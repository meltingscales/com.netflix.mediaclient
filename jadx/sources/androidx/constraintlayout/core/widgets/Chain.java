package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == 2) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r7 == 2) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = true;
        r17 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        r17 = r16;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0514 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.core.LinearSystem r38, int r39, int r40, androidx.constraintlayout.core.widgets.ChainHead r41) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
