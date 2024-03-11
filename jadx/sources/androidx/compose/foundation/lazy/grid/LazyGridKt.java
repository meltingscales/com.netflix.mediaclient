package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.InterfaceC8612dsa;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyGrid(androidx.compose.ui.Modifier r30, final androidx.compose.foundation.lazy.grid.LazyGridState r31, final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, final boolean r35, androidx.compose.foundation.gestures.FlingBehavior r36, final boolean r37, final androidx.compose.foundation.layout.Arrangement.Vertical r38, final androidx.compose.foundation.layout.Arrangement.Horizontal r39, final o.drM<? super androidx.compose.foundation.lazy.grid.LazyGridScope, o.dpR> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, o.drM, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final drX<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final drO<? extends LazyGridItemProvider> dro, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, final boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final dwU dwu, Composer composer, int i) {
        composer.startReplaceableGroup(-2068958445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068958445, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        Object[] objArr = {lazyGridState, lazyGridSlotsProvider, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal, vertical};
        composer.startReplaceableGroup(-568225417);
        boolean z3 = false;
        for (int i2 = 0; i2 < 7; i2++) {
            z3 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drX<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m350invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m2478unboximpl());
                }

                /* JADX WARN: Type inference failed for: r34v0, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                public final LazyGridMeasureResult m350invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int mo187roundToPx0680j_4;
                    int mo187roundToPx0680j_42;
                    float mo233getSpacingD9Ej5fM;
                    int m2473getMaxWidthimpl;
                    long IntOffset;
                    int firstVisibleItemScrollOffset;
                    int i3;
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
                    final int i4 = mo187roundToPx0680j_43 + mo187roundToPx0680j_44;
                    final int i5 = mo187roundToPx0680j_4 + mo187roundToPx0680j_42;
                    boolean z4 = z2;
                    int i6 = z4 ? i4 : i5;
                    int i7 = (!z4 || z) ? (z4 && z) ? mo187roundToPx0680j_44 : (z4 || z) ? mo187roundToPx0680j_42 : mo187roundToPx0680j_4 : mo187roundToPx0680j_43;
                    final int i8 = i6 - i7;
                    long m2488offsetNN6EwU = ConstraintsKt.m2488offsetNN6EwU(j, -i5, -i4);
                    final LazyGridItemProvider invoke = dro.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
                    final LazyGridSlots mo346invoke0kLqBqw = lazyGridSlotsProvider.mo346invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    int length = mo346invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(length);
                    if (z2) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        mo233getSpacingD9Ej5fM = vertical2.mo233getSpacingD9Ej5fM();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        mo233getSpacingD9Ej5fM = horizontal2.mo233getSpacingD9Ej5fM();
                    }
                    final int mo187roundToPx0680j_45 = lazyLayoutMeasureScope.mo187roundToPx0680j_4(mo233getSpacingD9Ej5fM);
                    final int itemCount = invoke.getItemCount();
                    if (z2) {
                        m2473getMaxWidthimpl = Constraints.m2472getMaxHeightimpl(j) - i4;
                    } else {
                        m2473getMaxWidthimpl = Constraints.m2473getMaxWidthimpl(j) - i5;
                    }
                    int i9 = m2473getMaxWidthimpl;
                    if (!z || i9 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(mo187roundToPx0680j_4, mo187roundToPx0680j_43);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            mo187roundToPx0680j_4 += i9;
                        }
                        if (z5) {
                            mo187roundToPx0680j_43 += i9;
                        }
                        IntOffset = IntOffsetKt.IntOffset(mo187roundToPx0680j_4, mo187roundToPx0680j_43);
                    }
                    final long j2 = IntOffset;
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final int i10 = i7;
                    final ?? r34 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, mo187roundToPx0680j_45, lazyGridState2, z6, z7, i10, i8, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z6;
                            this.$reverseLayout = z7;
                            this.$beforeContentPadding = i10;
                            this.$afterContentPadding = i8;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        public LazyGridMeasuredItem createItem(int i11, Object obj, Object obj2, int i12, int i13, List<? extends Placeable> list) {
                            return new LazyGridMeasuredItem(i11, obj, this.$isVertical, i12, i13, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, list, this.$visualItemOffset, obj2, this.$state.getPlacementAnimator$foundation_release(), null);
                        }
                    };
                    final boolean z8 = z2;
                    final ?? r9 = new LazyGridMeasuredLineProvider(z8, mo346invoke0kLqBqw, itemCount, mo187roundToPx0680j_45, r34, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z8, mo346invoke0kLqBqw, itemCount, mo187roundToPx0680j_45, r34, spanLayoutProvider);
                            this.$isVertical = z8;
                            this.$resolvedSlots = mo346invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public LazyGridMeasuredLine createLine(int i11, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i12) {
                            return new LazyGridMeasuredLine(i11, lazyGridMeasuredItemArr, this.$resolvedSlots, list, this.$isVertical, i12);
                        }
                    };
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new drM<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i11) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i11);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r9;
                            int size = spans.size();
                            int i12 = 0;
                            for (int i13 = 0; i13 < size; i13++) {
                                int m342getCurrentLineSpanimpl = GridItemSpan.m342getCurrentLineSpanimpl(spans.get(i13).m345unboximpl());
                                arrayList.add(dpD.a(Integer.valueOf(firstItemIndex), Constraints.m2461boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m355childConstraintsJhjzzOo$foundation_release(i12, m342getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i12 += m342getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.Companion;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState3.getFirstVisibleItemIndex());
                        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                            i3 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                            firstVisibleItemScrollOffset = 0;
                            dpR dpr = dpR.c;
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                            createNonObservableSnapshot.dispose();
                            LazyGridMeasureResult m351measureLazyGridW2FL7xs = LazyGridMeasureKt.m351measureLazyGridW2FL7xs(itemCount, r9, r34, i9, i7, i8, mo187roundToPx0680j_45, i3, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed$foundation_release(), m2488offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope, lazyGridState.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, lazyGridState.getPinnedItems$foundation_release(), lazyGridState.getBeyondBoundsInfo$foundation_release()), dwu, lazyGridState.m357getPlacementScopeInvalidatorzYiylxw$foundation_release(), new InterfaceC8612dsa<Integer, Integer, drM<? super Placeable.PlacementScope, ? extends dpR>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // o.InterfaceC8612dsa
                                public /* synthetic */ MeasureResult invoke(Integer num, Integer num2, drM<? super Placeable.PlacementScope, ? extends dpR> drm) {
                                    return invoke(num.intValue(), num2.intValue(), (drM<? super Placeable.PlacementScope, dpR>) drm);
                                }

                                public final MeasureResult invoke(int i11, int i12, drM<? super Placeable.PlacementScope, dpR> drm) {
                                    Map<AlignmentLine, Integer> d;
                                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = LazyLayoutMeasureScope.this;
                                    int m2486constrainWidthK40F9xA = ConstraintsKt.m2486constrainWidthK40F9xA(j, i11 + i5);
                                    int m2485constrainHeightK40F9xA = ConstraintsKt.m2485constrainHeightK40F9xA(j, i12 + i4);
                                    d = dqE.d();
                                    return lazyLayoutMeasureScope2.layout(m2486constrainWidthK40F9xA, m2485constrainHeightK40F9xA, d, drm);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, m351measureLazyGridW2FL7xs, false, 2, null);
                            return m351measureLazyGridW2FL7xs;
                        }
                        int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                        firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        i3 = lineIndexOfItem;
                        dpR dpr2 = dpR.c;
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        createNonObservableSnapshot.dispose();
                        LazyGridMeasureResult m351measureLazyGridW2FL7xs2 = LazyGridMeasureKt.m351measureLazyGridW2FL7xs(itemCount, r9, r34, i9, i7, i8, mo187roundToPx0680j_45, i3, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed$foundation_release(), m2488offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope, lazyGridState.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, lazyGridState.getPinnedItems$foundation_release(), lazyGridState.getBeyondBoundsInfo$foundation_release()), dwu, lazyGridState.m357getPlacementScopeInvalidatorzYiylxw$foundation_release(), new InterfaceC8612dsa<Integer, Integer, drM<? super Placeable.PlacementScope, ? extends dpR>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // o.InterfaceC8612dsa
                            public /* synthetic */ MeasureResult invoke(Integer num, Integer num2, drM<? super Placeable.PlacementScope, ? extends dpR> drm) {
                                return invoke(num.intValue(), num2.intValue(), (drM<? super Placeable.PlacementScope, dpR>) drm);
                            }

                            public final MeasureResult invoke(int i11, int i12, drM<? super Placeable.PlacementScope, dpR> drm) {
                                Map<AlignmentLine, Integer> d;
                                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = LazyLayoutMeasureScope.this;
                                int m2486constrainWidthK40F9xA = ConstraintsKt.m2486constrainWidthK40F9xA(j, i11 + i5);
                                int m2485constrainHeightK40F9xA = ConstraintsKt.m2485constrainHeightK40F9xA(j, i12 + i4);
                                d = dqE.d();
                                return lazyLayoutMeasureScope2.layout(m2486constrainWidthK40F9xA, m2485constrainHeightK40F9xA, d, drm);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, m351measureLazyGridW2FL7xs2, false, 2, null);
                        return m351measureLazyGridW2FL7xs2;
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
