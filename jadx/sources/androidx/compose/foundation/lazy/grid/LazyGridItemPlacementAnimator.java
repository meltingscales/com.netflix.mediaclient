package androidx.compose.foundation.lazy.grid;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final MutableScatterMap<Object, ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<LazyGridMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }

    static /* synthetic */ void initializeAnimation$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridMeasuredItem lazyGridMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ItemInfo itemInfo2 = lazyGridItemPlacementAnimator.keyToItemInfoMap.get(lazyGridMeasuredItem.getKey());
            C8632dsu.d(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyGridItemPlacementAnimator.initializeAnimation(lazyGridMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(LazyGridMeasuredItem lazyGridMeasuredItem, int i, ItemInfo itemInfo) {
        long m2530copyiSbpLlY$default;
        LazyLayoutAnimation[] animations;
        long mo349getOffsetnOccac = lazyGridMeasuredItem.mo349getOffsetnOccac();
        if (lazyGridMeasuredItem.isVertical()) {
            m2530copyiSbpLlY$default = IntOffset.m2530copyiSbpLlY$default(mo349getOffsetnOccac, 0, i, 1, null);
        } else {
            m2530copyiSbpLlY$default = IntOffset.m2530copyiSbpLlY$default(mo349getOffsetnOccac, i, 0, 2, null);
        }
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo349getOffsetnOccac2 = lazyGridMeasuredItem.mo349getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(mo349getOffsetnOccac2) - IntOffset.m2533getXimpl(mo349getOffsetnOccac), IntOffset.m2534getYimpl(mo349getOffsetnOccac2) - IntOffset.m2534getYimpl(mo349getOffsetnOccac));
                lazyLayoutAnimation.m365setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2530copyiSbpLlY$default) + IntOffset.m2533getXimpl(IntOffset), IntOffset.m2534getYimpl(m2530copyiSbpLlY$default) + IntOffset.m2534getYimpl(IntOffset)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyGridMeasuredItem lazyGridMeasuredItem) {
        LazyLayoutAnimation[] animations;
        ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridMeasuredItem.getKey());
        C8632dsu.d(itemInfo);
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo349getOffsetnOccac = lazyGridMeasuredItem.mo349getOffsetnOccac();
                long m363getRawOffsetnOccac = lazyLayoutAnimation.m363getRawOffsetnOccac();
                if (!IntOffset.m2532equalsimpl0(m363getRawOffsetnOccac, LazyLayoutAnimation.Companion.m366getNotInitializednOccac()) && !IntOffset.m2532equalsimpl0(m363getRawOffsetnOccac, mo349getOffsetnOccac)) {
                    lazyLayoutAnimation.m360animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(mo349getOffsetnOccac) - IntOffset.m2533getXimpl(m363getRawOffsetnOccac), IntOffset.m2534getYimpl(mo349getOffsetnOccac) - IntOffset.m2534getYimpl(m363getRawOffsetnOccac)));
                }
                lazyLayoutAnimation.m365setRawOffsetgyyYBs(mo349getOffsetnOccac);
            }
        }
    }

    public final LazyLayoutAnimation getAnimation(Object obj, int i) {
        ItemInfo itemInfo;
        LazyLayoutAnimation[] animations;
        if (this.keyToItemInfoMap.isEmpty() || (itemInfo = this.keyToItemInfoMap.get(obj)) == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i];
    }

    private final boolean getHasAnimations(LazyGridMeasuredItem lazyGridMeasuredItem) {
        LazyLayoutAnimationSpecsNode specs;
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            specs = LazyGridItemPlacementAnimatorKt.getSpecs(lazyGridMeasuredItem.getParentData(i));
            if (specs != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0267, code lost:
        r24 = r12.getMainAxisSize();
        r15 = r1 + r2;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0270, code lost:
        initializeAnimation$default(r34, r12, r26 + r15, null, 4, null);
        startAnimationsIfNeeded(r12);
        r11 = r11 + 1;
        r0 = r14;
        r1 = r15;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0285, code lost:
        r0 = r34.movingAwayKeys;
        r1 = r0.elements;
        r0 = r0.metadata;
        r2 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x028e, code lost:
        if (r2 < 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0290, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0291, code lost:
        r4 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029b, code lost:
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x029d, code lost:
        r8 = 8 - ((~(r3 - r2)) >>> 31);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a7, code lost:
        if (r10 >= r8) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b1, code lost:
        if ((r4 & 255) >= 128) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b3, code lost:
        r14 = r1[(r3 << 3) + r10];
        r15 = r34.keyToItemInfoMap.get(r14);
        o.C8632dsu.d(r15);
        r15 = r15;
        r11 = r34.keyIndexMap.getIndex(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c9, code lost:
        if (r11 != r9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02cb, code lost:
        r34.keyToItemInfoMap.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d2, code lost:
        if (r41 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d4, code lost:
        r27 = androidx.compose.ui.unit.Constraints.Companion.m2482fixedWidthOenEA2s(r15.getCrossAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02df, code lost:
        r27 = androidx.compose.ui.unit.Constraints.Companion.m2481fixedHeightOenEA2s(r15.getCrossAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e9, code lost:
        r9 = androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider.m353getAndMeasure3p2s80s$default(r39, r11, 0, r27, 2, null);
        r9.setNonScrollableItem(r7);
        r12 = r15.getAnimations();
        r15 = r12.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0302, code lost:
        if (r7 >= r15) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0304, code lost:
        r25 = r12[r7];
        r27 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0308, code lost:
        if (r25 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030a, code lost:
        r0 = r25.isPlacementAnimationInProgress();
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0311, code lost:
        if (r0 != true) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0314, code lost:
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0316, code lost:
        r7 = r7 + 1;
        r1 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
        r27 = r0;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0325, code lost:
        if (r11 != r13.getIndex(r14)) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0327, code lost:
        r34.keyToItemInfoMap.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        r1 = r34.firstVisibleIndex;
        r2 = o.C8576dqs.x(r38);
        r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x032f, code lost:
        if (r11 >= r34.firstVisibleIndex) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0331, code lost:
        r34.movingAwayToStartBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0337, code lost:
        r34.movingAwayToEndBound.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033d, code lost:
        r27 = r0;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0341, code lost:
        r4 = r4 >> 8;
        r10 = r10 + 1;
        r1 = r25;
        r0 = r27;
        r7 = true;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034e, code lost:
        r27 = r0;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0356, code lost:
        if (r8 != 8) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0359, code lost:
        r27 = r0;
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0361, code lost:
        if (r3 == r2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2 == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0363, code lost:
        r3 = r3 + 1;
        r1 = r25;
        r0 = r27;
        r7 = true;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036d, code lost:
        r0 = r34.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0374, code lost:
        if (r0.size() <= 1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0376, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2(r34));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x037e, code lost:
        r0 = r34.movingAwayToStartBound;
        r1 = r0.size();
        r2 = 0;
        r3 = -1;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0388, code lost:
        if (r2 >= r1) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x038a, code lost:
        r7 = r0.get(r2);
        r8 = r40.getLineIndexOfItem(r7.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x039b, code lost:
        if (r8 == (-1)) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x039d, code lost:
        if (r8 != r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x039f, code lost:
        r4 = java.lang.Math.max(r4, r7.getMainAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        r2 = r2.getIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03a8, code lost:
        r5 = r5 + r4;
        r4 = r7.getMainAxisSize();
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03af, code lost:
        r8 = r7.getMainAxisSize();
        r9 = r34.keyToItemInfoMap.get(r7.getKey());
        o.C8632dsu.d(r9);
        r7.position((0 - r5) - r8, r9.getCrossAxisOffset(), r36, r37, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
        r38.add(r7);
        startAnimationsIfNeeded(r7);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e6, code lost:
        r0 = r34.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ef, code lost:
        if (r0.size() <= 1) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03f1, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2(r34));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f9, code lost:
        r0 = r34.movingAwayToEndBound;
        r1 = r0.size();
        r2 = -1;
        r3 = 0;
        r9 = 0;
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0404, code lost:
        if (r9 >= r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0406, code lost:
        r4 = r0.get(r9);
        r5 = r40.getLineIndexOfItem(r4.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0417, code lost:
        if (r5 == (-1)) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0419, code lost:
        if (r5 != r2) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x041b, code lost:
        r3 = java.lang.Math.max(r3, r4.getMainAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0424, code lost:
        r19 = r19 + r3;
        r3 = r4.getMainAxisSize();
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x042c, code lost:
        r5 = r34.keyToItemInfoMap.get(r4.getKey());
        o.C8632dsu.d(r5);
        r4.position(r26 + r19, r5.getCrossAxisOffset(), r36, r37, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
        r38.add(r4);
        startAnimationsIfNeeded(r4);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x045c, code lost:
        r34.movingInFromStartBound.clear();
        r34.movingInFromEndBound.clear();
        r34.movingAwayToStartBound.clear();
        r34.movingAwayToEndBound.clear();
        r34.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0475, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r34.firstVisibleIndex = r2;
        r10 = r34.keyIndexMap;
        r34.keyIndexMap = r39.getKeyIndexMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r41 == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        r11 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        r11 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r41 == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r35, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        r0 = r34.keyToItemInfoMap;
        r4 = r0.keys;
        r0 = r0.metadata;
        r5 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r5 < 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r14 = r0[r12];
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        r9 = 8 - ((~(r12 - r5)) >>> 31);
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
        if (r10 >= r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        if ((r14 & 255) >= 128) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        r25 = r0;
        r24 = r4;
        r34.movingAwayKeys.add(r4[(r12 << 3) + r10]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        r14 = r14 >> 8;
        r10 = r10 + 1;
        r4 = r24;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r9 != 8) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r25 = r0;
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (r12 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r12 = r12 + 1;
        r10 = r13;
        r4 = r24;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r0 = r38.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r4 >= r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
        r5 = r7.get(r4);
        r34.movingAwayKeys.remove(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (getHasAnimations(r5) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e1, code lost:
        r10 = r34.keyToItemInfoMap.get(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
        if (r10 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r10 = new androidx.compose.foundation.lazy.grid.ItemInfo(r5.getCrossAxisSize(), r5.getCrossAxisOffset());
        r10.updateAnimation(r5, r42);
        r34.keyToItemInfoMap.set(r5.getKey(), r10);
        r14 = r13.getIndex(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0112, code lost:
        if (r14 == (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
        if (r5.getIndex() == r14) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (r14 >= r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011c, code lost:
        r34.movingInFromStartBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
        r34.movingInFromEndBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
        r14 = r5.mo349getOffsetnOccac();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0130, code lost:
        if (r5.isVertical() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
        r9 = androidx.compose.ui.unit.IntOffset.m2534getYimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
        r9 = androidx.compose.ui.unit.IntOffset.m2533getXimpl(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
        initializeAnimation(r5, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
        r24 = r0;
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
        r9 = r10.getAnimations();
        r14 = r9.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
        if (r15 >= r14) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
        r24 = r0;
        r0 = r9[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0152, code lost:
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (androidx.compose.ui.unit.IntOffset.m2532equalsimpl0(r0.m363getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.Companion.m366getNotInitializednOccac()) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
        r7 = r0.m363getRawOffsetnOccac();
        r0.m365setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m2533getXimpl(r7) + androidx.compose.ui.unit.IntOffset.m2533getXimpl(r2), androidx.compose.ui.unit.IntOffset.m2534getYimpl(r7) + androidx.compose.ui.unit.IntOffset.m2534getYimpl(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
        r15 = r15 + 1;
        r0 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
        r24 = r0;
        r26 = r11;
        r10.setCrossAxisSize(r5.getCrossAxisSize());
        r10.setCrossAxisOffset(r5.getCrossAxisOffset());
        startAnimationsIfNeeded(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a9, code lost:
        r24 = r0;
        r26 = r11;
        r34.keyToItemInfoMap.remove(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b6, code lost:
        r4 = r4 + 1;
        r7 = r38;
        r0 = r24;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
        r26 = r11;
        r0 = r34.movingInFromStartBound;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cb, code lost:
        if (r0.size() <= 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cd, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d5, code lost:
        r8 = r34.movingInFromStartBound;
        r10 = r8.size();
        r0 = -1;
        r1 = 0;
        r2 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01df, code lost:
        if (r11 >= r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e1, code lost:
        r12 = r8.get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e8, code lost:
        if (r41 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
        r3 = r12.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ef, code lost:
        r3 = r12.getColumn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f3, code lost:
        if (r3 == (-1)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f5, code lost:
        if (r3 != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f7, code lost:
        r14 = r0;
        r15 = r1;
        r24 = java.lang.Math.max(r2, r12.getMainAxisSize());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0204, code lost:
        r24 = r12.getMainAxisSize();
        r15 = r1 + r2;
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020d, code lost:
        initializeAnimation$default(r34, r12, (0 - r15) - r12.getMainAxisSize(), null, 4, null);
        startAnimationsIfNeeded(r12);
        r11 = r11 + 1;
        r0 = r14;
        r1 = r15;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0228, code lost:
        r0 = r34.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022e, code lost:
        if (r0.size() <= 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0230, code lost:
        o.C8575dqr.c(r0, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
        r8 = r34.movingInFromEndBound;
        r10 = r8.size();
        r0 = -1;
        r1 = 0;
        r2 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0242, code lost:
        if (r11 >= r10) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
        r12 = r8.get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024b, code lost:
        if (r41 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x024d, code lost:
        r3 = r12.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0252, code lost:
        r3 = r12.getColumn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0256, code lost:
        if (r3 == (-1)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0258, code lost:
        if (r3 != r0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025a, code lost:
        r14 = r0;
        r15 = r1;
        r24 = java.lang.Math.max(r2, r12.getMainAxisSize());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r35, int r36, int r37, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r38, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r39, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r40, boolean r41, o.dwU r42) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, boolean, o.dwU):void");
    }
}
