package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import o.C8632dsu;
import o.dqE;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyListItemAnimator {
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyListMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToEndBound = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0239, code lost:
        if (r12.isPlacementAnimationInProgress() != r8) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023c, code lost:
        r14 = r14 + 1;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0240, code lost:
        if (r7 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0246, code lost:
        if (r2 != r7.getIndex(r1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0248, code lost:
        r19.keyToItemInfoMap.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0250, code lost:
        if (r2 >= r19.firstVisibleIndex) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
        r19.movingAwayToStartBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0258, code lost:
        r19.movingAwayToEndBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025e, code lost:
        r0 = r19.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0265, code lost:
        if (r0.size() <= 1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0267, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortByDescending$2(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026f, code lost:
        r0 = r19.movingAwayToStartBound;
        r1 = r0.size();
        r2 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0277, code lost:
        if (r14 >= r1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0279, code lost:
        r3 = r0.get(r14);
        r2 = r2 + r3.getSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0284, code lost:
        if (r26 == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0286, code lost:
        r4 = o.C8576dqs.y(r23);
        r4 = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) r4).getOffset() - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0292, code lost:
        r4 = 0 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0294, code lost:
        r3.position(r4, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x029b, code lost:
        if (r15 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x029d, code lost:
        startPlacementAnimationsIfNeeded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a0, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a3, code lost:
        r0 = r19.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ae, code lost:
        if (r0.size() <= 1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b0, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortBy$2(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b8, code lost:
        r0 = r19.movingAwayToEndBound;
        r1 = r0.size();
        r2 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c0, code lost:
        if (r14 >= r1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c2, code lost:
        r3 = r0.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = r19.firstVisibleIndex;
        r3 = o.C8576dqs.x(r23);
        r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c8, code lost:
        if (r26 == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ca, code lost:
        r4 = o.C8576dqs.B((java.util.List<? extends java.lang.Object>) r23);
        r4 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r4;
        r8 = (r4.getOffset() + r4.getSizeWithSpacings()) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02db, code lost:
        r8 = r13 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:
        r2 = r2 + r3.getSizeWithSpacings();
        r3.position(r8, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02e5, code lost:
        if (r15 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e7, code lost:
        startPlacementAnimationsIfNeeded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ea, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ed, code lost:
        r0 = r19.movingAwayToStartBound;
        o.C8580dqw.u((java.util.List) r0);
        r1 = o.dpR.c;
        r23.addAll(0, r0);
        r23.addAll(r19.movingAwayToEndBound);
        r19.movingInFromStartBound.clear();
        r19.movingInFromEndBound.clear();
        r19.movingAwayToStartBound.clear();
        r19.movingAwayToEndBound.clear();
        r19.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0318, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r3 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        r3 = r3.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        r19.firstVisibleIndex = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r25 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        r13 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r25 == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        r3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        r3 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r20, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r26 != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r27 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        r19.movingAwayKeys.addAll(r19.keyToItemInfoMap.keySet());
        r0 = r23.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r5 >= r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r12 = r9.get(r5);
        r27 = r0;
        r19.movingAwayKeys.remove(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (getHasAnimations(r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        r0 = r19.keyToItemInfoMap.get(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        r0 = new androidx.compose.foundation.lazy.LazyListItemAnimator.ItemInfo();
        r0.updateAnimation(r12, r1);
        r19.keyToItemInfoMap.put(r12.getKey(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r10 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r9 = r10.getIndex(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
        if (r12.getIndex() == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r9 == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r9 >= r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r19.movingInFromStartBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        r19.movingInFromEndBound.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r17 = r12.m335getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        if (r12.isVertical() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
        r14 = androidx.compose.ui.unit.IntOffset.m2534getYimpl(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
        r14 = androidx.compose.ui.unit.IntOffset.m2533getXimpl(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
        initializeAnimation(r12, r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
        if (r9 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r0 = r0.getAnimations();
        r9 = r0.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if (r14 >= r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r12 = r0[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
        if (r12 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r12.animateAppearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
        if (r15 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
        r0.updateAnimation(r12, r1);
        r0 = r0.getAnimations();
        r9 = r0.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
        if (r14 >= r9) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010e, code lost:
        r1 = r0[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0112, code lost:
        r18 = r9;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
        if (androidx.compose.ui.unit.IntOffset.m2532equalsimpl0(r1.m363getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.Companion.m366getNotInitializednOccac()) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
        r7 = r1.m363getRawOffsetnOccac();
        r1.m365setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m2533getXimpl(r7) + androidx.compose.ui.unit.IntOffset.m2533getXimpl(r3), androidx.compose.ui.unit.IntOffset.m2534getYimpl(r7) + androidx.compose.ui.unit.IntOffset.m2534getYimpl(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
        r18 = r9;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
        r14 = r14 + 1;
        r10 = r17;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0155, code lost:
        r17 = r10;
        startPlacementAnimationsIfNeeded(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:
        r17 = r10;
        r19.keyToItemInfoMap.remove(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
        r5 = r5 + 1;
        r9 = r23;
        r0 = r27;
        r1 = r28;
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (r15 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017e, code lost:
        if (r17 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0180, code lost:
        r0 = r19.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
        if (r0.size() <= 1) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0189, code lost:
        r7 = r17;
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortByDescending$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0194, code lost:
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0196, code lost:
        r8 = r19.movingInFromStartBound;
        r9 = r8.size();
        r0 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019e, code lost:
        if (r14 >= r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a0, code lost:
        r10 = r8.get(r14);
        r12 = r0 + r10.getSizeWithSpacings();
        initializeAnimation$default(r19, r10, 0 - r12, null, 4, null);
        startPlacementAnimationsIfNeeded(r10);
        r14 = r14 + 1;
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r0 = r19.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
        if (r0.size() <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortBy$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d0, code lost:
        r8 = r19.movingInFromEndBound;
        r9 = r8.size();
        r10 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d8, code lost:
        if (r14 >= r9) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01da, code lost:
        r12 = r8.get(r14);
        r16 = r12.getSizeWithSpacings();
        initializeAnimation$default(r19, r12, r13 + r10, null, 4, null);
        startPlacementAnimationsIfNeeded(r12);
        r14 = r14 + 1;
        r10 = r10 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f8, code lost:
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01fa, code lost:
        r0 = r19.movingAwayKeys.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0204, code lost:
        if (r0.hasNext() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0206, code lost:
        r1 = r0.next();
        r2 = r11.getIndex(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020f, code lost:
        if (r2 != (-1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0211, code lost:
        r19.keyToItemInfoMap.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0217, code lost:
        r5 = r24.getAndMeasure(r2);
        r8 = true;
        r5.setNonScrollableItem(true);
        r9 = o.dqE.e(r19.keyToItemInfoMap, r1);
        r9 = ((androidx.compose.foundation.lazy.LazyListItemAnimator.ItemInfo) r9).getAnimations();
        r10 = r9.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
        if (r14 >= r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
        r12 = r9[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0233, code lost:
        if (r12 == null) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r20, int r21, int r22, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> r23, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r24, boolean r25, boolean r26, boolean r27, o.dwU r28) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, boolean, boolean, boolean, o.dwU):void");
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }

    static /* synthetic */ void initializeAnimation$default(LazyListItemAnimator lazyListItemAnimator, LazyListMeasuredItem lazyListMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        Object e;
        if ((i2 & 4) != 0) {
            e = dqE.e(lazyListItemAnimator.keyToItemInfoMap, lazyListMeasuredItem.getKey());
            itemInfo = (ItemInfo) e;
        }
        lazyListItemAnimator.initializeAnimation(lazyListMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(LazyListMeasuredItem lazyListMeasuredItem, int i, ItemInfo itemInfo) {
        long m2530copyiSbpLlY$default;
        int i2 = 0;
        long m335getOffsetBjo55l4 = lazyListMeasuredItem.m335getOffsetBjo55l4(0);
        if (lazyListMeasuredItem.isVertical()) {
            m2530copyiSbpLlY$default = IntOffset.m2530copyiSbpLlY$default(m335getOffsetBjo55l4, 0, i, 1, null);
        } else {
            m2530copyiSbpLlY$default = IntOffset.m2530copyiSbpLlY$default(m335getOffsetBjo55l4, i, 0, 2, null);
        }
        LazyLayoutAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutAnimation lazyLayoutAnimation = animations[i2];
            if (lazyLayoutAnimation != null) {
                long m335getOffsetBjo55l42 = lazyListMeasuredItem.m335getOffsetBjo55l4(i3);
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m335getOffsetBjo55l42) - IntOffset.m2533getXimpl(m335getOffsetBjo55l4), IntOffset.m2534getYimpl(m335getOffsetBjo55l42) - IntOffset.m2534getYimpl(m335getOffsetBjo55l4));
                lazyLayoutAnimation.m365setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2530copyiSbpLlY$default) + IntOffset.m2533getXimpl(IntOffset), IntOffset.m2534getYimpl(m2530copyiSbpLlY$default) + IntOffset.m2534getYimpl(IntOffset)));
            }
            i2++;
            i3++;
        }
    }

    private final void startPlacementAnimationsIfNeeded(LazyListMeasuredItem lazyListMeasuredItem) {
        Object e;
        e = dqE.e(this.keyToItemInfoMap, lazyListMeasuredItem.getKey());
        LazyLayoutAnimation[] animations = ((ItemInfo) e).getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutAnimation lazyLayoutAnimation = animations[i];
            if (lazyLayoutAnimation != null) {
                long m335getOffsetBjo55l4 = lazyListMeasuredItem.m335getOffsetBjo55l4(i2);
                long m363getRawOffsetnOccac = lazyLayoutAnimation.m363getRawOffsetnOccac();
                if (!IntOffset.m2532equalsimpl0(m363getRawOffsetnOccac, LazyLayoutAnimation.Companion.m366getNotInitializednOccac()) && !IntOffset.m2532equalsimpl0(m363getRawOffsetnOccac, m335getOffsetBjo55l4)) {
                    lazyLayoutAnimation.m360animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m335getOffsetBjo55l4) - IntOffset.m2533getXimpl(m363getRawOffsetnOccac), IntOffset.m2534getYimpl(m335getOffsetBjo55l4) - IntOffset.m2534getYimpl(m363getRawOffsetnOccac)));
                }
                lazyLayoutAnimation.m365setRawOffsetgyyYBs(m335getOffsetBjo55l4);
            }
            i++;
            i2++;
        }
    }

    public final LazyLayoutAnimation getAnimation(Object obj, int i) {
        LazyLayoutAnimation[] animations;
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i];
    }

    private final boolean getHasAnimations(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyListItemAnimatorKt.access$getSpecs(lazyListMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ItemInfo {
        private LazyLayoutAnimation[] animations = LazyListItemAnimatorKt.access$getEmptyArray$p();

        public final LazyLayoutAnimation[] getAnimations() {
            return this.animations;
        }

        public final void updateAnimation(LazyListMeasuredItem lazyListMeasuredItem, dwU dwu) {
            int length = this.animations.length;
            for (int placeablesCount = lazyListMeasuredItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutAnimation lazyLayoutAnimation = this.animations[placeablesCount];
                if (lazyLayoutAnimation != null) {
                    lazyLayoutAnimation.stopAnimations();
                }
            }
            if (this.animations.length != lazyListMeasuredItem.getPlaceablesCount()) {
                Object[] copyOf = Arrays.copyOf(this.animations, lazyListMeasuredItem.getPlaceablesCount());
                C8632dsu.a(copyOf, "");
                this.animations = (LazyLayoutAnimation[]) copyOf;
            }
            int placeablesCount2 = lazyListMeasuredItem.getPlaceablesCount();
            for (int i = 0; i < placeablesCount2; i++) {
                LazyLayoutAnimationSpecsNode access$getSpecs = LazyListItemAnimatorKt.access$getSpecs(lazyListMeasuredItem.getParentData(i));
                if (access$getSpecs == null) {
                    LazyLayoutAnimation lazyLayoutAnimation2 = this.animations[i];
                    if (lazyLayoutAnimation2 != null) {
                        lazyLayoutAnimation2.stopAnimations();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutAnimation lazyLayoutAnimation3 = this.animations[i];
                    if (lazyLayoutAnimation3 == null) {
                        lazyLayoutAnimation3 = new LazyLayoutAnimation(dwu);
                        this.animations[i] = lazyLayoutAnimation3;
                    }
                    lazyLayoutAnimation3.setAppearanceSpec(access$getSpecs.getAppearanceSpec());
                    lazyLayoutAnimation3.setPlacementSpec(access$getSpecs.getPlacementSpec());
                }
            }
        }
    }
}
