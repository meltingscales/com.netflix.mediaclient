package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import java.util.Map;
import o.InterfaceC8612dsa;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(final androidx.compose.ui.Modifier r34, final androidx.compose.foundation.lazy.LazyListState r35, final androidx.compose.foundation.layout.PaddingValues r36, final boolean r37, final boolean r38, final androidx.compose.foundation.gestures.FlingBehavior r39, final boolean r40, int r41, androidx.compose.ui.Alignment.Horizontal r42, androidx.compose.foundation.layout.Arrangement.Vertical r43, androidx.compose.ui.Alignment.Vertical r44, androidx.compose.foundation.layout.Arrangement.Horizontal r45, final o.drM<? super androidx.compose.foundation.lazy.LazyListScope, o.dpR> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, o.drM, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final drX<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final drO<? extends LazyListItemProvider> dro, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(183156450);
        final Alignment.Horizontal horizontal3 = (i3 & 64) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i3 & 128) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i3 & JSONzip.end) != 0 ? null : horizontal2;
        Arrangement.Vertical vertical4 = (i3 & 512) == 0 ? vertical2 : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        boolean z3 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            z3 |= composer.changed(objArr[i4]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            final Arrangement.Vertical vertical5 = vertical4;
            final Arrangement.Horizontal horizontal5 = horizontal4;
            rememberedValue = new drX<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m332invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m2478unboximpl());
                }

                /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                public final LazyListMeasureResult m332invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int mo187roundToPx0680j_4;
                    int mo187roundToPx0680j_42;
                    float mo233getSpacingD9Ej5fM;
                    int m2473getMaxWidthimpl;
                    long IntOffset;
                    float scrollToBeConsumed$foundation_release;
                    boolean z4 = LazyListState.this.getHasLookaheadPassOccurred$foundation_release() || lazyLayoutMeasureScope.isLookingAhead();
                    CheckScrollableContainerConstraintsKt.m125checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        mo187roundToPx0680j_4 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(paddingValues.mo249calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        mo187roundToPx0680j_4 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        mo187roundToPx0680j_42 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(paddingValues.mo250calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        mo187roundToPx0680j_42 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int mo187roundToPx0680j_43 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(paddingValues.mo251calculateTopPaddingD9Ej5fM());
                    int mo187roundToPx0680j_44 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(paddingValues.mo248calculateBottomPaddingD9Ej5fM());
                    final int i5 = mo187roundToPx0680j_43 + mo187roundToPx0680j_44;
                    final int i6 = mo187roundToPx0680j_4 + mo187roundToPx0680j_42;
                    boolean z5 = z2;
                    int i7 = z5 ? i5 : i6;
                    int i8 = (!z5 || z) ? (z5 && z) ? mo187roundToPx0680j_44 : (z5 || z) ? mo187roundToPx0680j_42 : mo187roundToPx0680j_4 : mo187roundToPx0680j_43;
                    final int i9 = i7 - i8;
                    final long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(j, -i6, -i5);
                    LazyListState.this.setDensity$foundation_release(lazyLayoutMeasureScope);
                    final LazyListItemProvider invoke = dro.invoke();
                    invoke.getItemScope().setMaxSize(Constraints.m2473getMaxWidthimpl(m2488offsetNN6EwU), Constraints.m2472getMaxHeightimpl(m2488offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical6 = vertical5;
                        if (vertical6 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        mo233getSpacingD9Ej5fM = vertical6.mo233getSpacingD9Ej5fM();
                    } else {
                        Arrangement.Horizontal horizontal6 = horizontal5;
                        if (horizontal6 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        mo233getSpacingD9Ej5fM = horizontal6.mo233getSpacingD9Ej5fM();
                    }
                    final int mo187roundToPx0680j_45 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(mo233getSpacingD9Ej5fM);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m2473getMaxWidthimpl = Constraints.m2472getMaxHeightimpl(j) - i5;
                    } else {
                        m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j) - i6;
                    }
                    int i10 = m2473getMaxWidthimpl;
                    if (!z || i10 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(mo187roundToPx0680j_4, mo187roundToPx0680j_43);
                    } else {
                        boolean z6 = z2;
                        if (!z6) {
                            mo187roundToPx0680j_4 += i10;
                        }
                        if (z6) {
                            mo187roundToPx0680j_43 += i10;
                        }
                        IntOffset = IntOffsetKt.IntOffset(mo187roundToPx0680j_4, mo187roundToPx0680j_43);
                    }
                    final long j2 = IntOffset;
                    final boolean z7 = z2;
                    final Alignment.Horizontal horizontal7 = horizontal3;
                    final Alignment.Vertical vertical7 = vertical3;
                    final boolean z8 = z;
                    final LazyListState lazyListState2 = LazyListState.this;
                    final int i11 = i8;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m2488offsetNN6EwU, z7, invoke, lazyLayoutMeasureScope, itemCount, mo187roundToPx0680j_45, horizontal7, vertical7, z8, i11, i9, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.$isVertical = z7;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = mo187roundToPx0680j_45;
                            this.$horizontalAlignment = horizontal7;
                            this.$verticalAlignment = vertical7;
                            this.$reverseLayout = z8;
                            this.$beforeContentPadding = i11;
                            this.$afterContentPadding = i9;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        public LazyListMeasuredItem createItem(int i12, Object obj, Object obj2, List<? extends Placeable> list) {
                            return new LazyListMeasuredItem(i12, list, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i12 == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, obj, obj2, this.$state.getItemAnimator$foundation_release(), null);
                        }
                    };
                    LazyListState.this.m338setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m336getChildConstraintsmsEJaDk());
                    Snapshot.Companion companion = Snapshot.Companion;
                    LazyListState lazyListState3 = LazyListState.this;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState3.getFirstVisibleItemIndex());
                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                        dpR dpr = dpR.c;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        createNonObservableSnapshot.dispose();
                        List<Integer> calculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, LazyListState.this.getPinnedItems$foundation_release(), LazyListState.this.getBeyondBoundsInfo$foundation_release());
                        if (lazyLayoutMeasureScope.isLookingAhead() || !z4) {
                            scrollToBeConsumed$foundation_release = LazyListState.this.getScrollToBeConsumed$foundation_release();
                        } else {
                            scrollToBeConsumed$foundation_release = LazyListState.this.getScrollDeltaBetweenPasses$foundation_release();
                        }
                        float f = scrollToBeConsumed$foundation_release;
                        boolean z9 = z2;
                        List<Integer> headerIndexes = invoke.getHeaderIndexes();
                        Arrangement.Vertical vertical8 = vertical5;
                        Arrangement.Horizontal horizontal8 = horizontal5;
                        boolean z10 = z;
                        LazyListItemAnimator itemAnimator$foundation_release = LazyListState.this.getItemAnimator$foundation_release();
                        int i12 = i;
                        boolean isLookingAhead = lazyLayoutMeasureScope.isLookingAhead();
                        LazyListMeasureResult postLookaheadLayoutInfo$foundation_release = LazyListState.this.getPostLookaheadLayoutInfo$foundation_release();
                        dwU coroutineScope$foundation_release = LazyListState.this.getCoroutineScope$foundation_release();
                        if (coroutineScope$foundation_release != null) {
                            LazyListMeasureResult m333measureLazyList5IMabDg = LazyListMeasureKt.m333measureLazyList5IMabDg(itemCount, lazyListMeasuredItemProvider, i10, i8, i9, mo187roundToPx0680j_45, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, m2488offsetNN6EwU, z9, headerIndexes, vertical8, horizontal8, z10, lazyLayoutMeasureScope, itemAnimator$foundation_release, i12, calculateLazyLayoutPinnedIndices, z4, isLookingAhead, postLookaheadLayoutInfo$foundation_release, coroutineScope$foundation_release, LazyListState.this.m337getPlacementScopeInvalidatorzYiylxw$foundation_release(), new InterfaceC8612dsa<Integer, Integer, drM<? super Placeable.PlacementScope, ? extends dpR>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // o.InterfaceC8612dsa
                                public /* synthetic */ MeasureResult invoke(Integer num, Integer num2, drM<? super Placeable.PlacementScope, ? extends dpR> drm) {
                                    return invoke(num.intValue(), num2.intValue(), (drM<? super Placeable.PlacementScope, dpR>) drm);
                                }

                                public final MeasureResult invoke(int i13, int i14, drM<? super Placeable.PlacementScope, dpR> drm) {
                                    Map<AlignmentLine, Integer> d;
                                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = LazyLayoutMeasureScope.this;
                                    int m2486constrainWidthK40F9xA = ConstraintsKt.m2486constrainWidthK40F9xA(j, i13 + i6);
                                    int m2485constrainHeightK40F9xA = ConstraintsKt.m2485constrainHeightK40F9xA(j, i14 + i5);
                                    d = dqE.d();
                                    return lazyLayoutMeasureScope2.layout(m2486constrainWidthK40F9xA, m2485constrainHeightK40F9xA, d, drm);
                                }
                            });
                            LazyListState.applyMeasureResult$foundation_release$default(LazyListState.this, m333measureLazyList5IMabDg, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                            return m333measureLazyList5IMabDg;
                        }
                        throw new IllegalArgumentException("coroutineScope should be not null".toString());
                    } catch (Throwable th) {
                        createNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        drX<LazyLayoutMeasureScope, Constraints, MeasureResult> drx = (drX) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drx;
    }
}
