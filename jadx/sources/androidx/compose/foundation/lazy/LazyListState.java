package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8586drb;
import o.C8626dso;
import o.C8627dsp;
import o.C8654dtp;
import o.C8737dwr;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dsT;
import o.dwU;

/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(new drX<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // o.drX
        public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
            List<Integer> j;
            j = C8569dql.j(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
            return j;
        }
    }, new drM<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // o.drM
        public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final LazyListState invoke2(List<Integer> list) {
            return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;
    private final LazyListAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private dwU coroutineScope;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private boolean hasLookaheadPassOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final LazyListItemAnimator itemAnimator;
    private final MutableState<LazyListMeasureResult> layoutInfoState;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<dpR> placementScopeInvalidator;
    private LazyListMeasureResult postLookaheadLayoutInfo;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private boolean wasScrollingForward;

    public LazyListState() {
        this(0, 0, 3, null);
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final dwU getCoroutineScope$foundation_release() {
        return this.coroutineScope;
    }

    public final boolean getHasLookaheadPassOccurred$foundation_release() {
        return this.hasLookaheadPassOccurred;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final LazyListItemAnimator getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release  reason: not valid java name */
    public final MutableState<dpR> m337getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final LazyListMeasureResult getPostLookaheadLayoutInfo$foundation_release() {
        return this.postLookaheadLayoutInfo;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final void setCoroutineScope$foundation_release(dwU dwu) {
        this.coroutineScope = dwu;
    }

    public final void setDensity$foundation_release(Density density) {
        this.density = density;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release  reason: not valid java name */
    public final void m338setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints = j;
    }

    public LazyListState(int i, int i2) {
        LazyListMeasureResult lazyListMeasureResult;
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AnimationState<Float, AnimationVector1D> AnimationState;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i, i2);
        this.scrollPosition = lazyListScrollPosition;
        this.animateScrollScope = new LazyListAnimateScrollScope(this);
        lazyListMeasureResult = LazyListStateKt.EmptyLazyListMeasureResult;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(lazyListMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.scrollableState = ScrollableStateKt.ScrollableState(new drM<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final Float invoke(float f) {
                return Float.valueOf(-LazyListState.this.onScroll$foundation_release(-f));
            }

            @Override // o.drM
            public /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyListState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyListItemAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default2;
        this.placementScopeInvalidator = ObservableScopeInvalidator.m382constructorimpl$default(null, 1, null);
        this.prefetchState = new LazyLayoutPrefetchState();
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C8626dso.e);
        Float valueOf = Float.valueOf(0.0f);
        AnimationState = AnimationStateKt.AnimationState(vectorConverter, valueOf, valueOf, (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
        this._scrollDeltaBetweenPasses = AnimationState;
    }

    public /* synthetic */ LazyListState(int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final C8654dtp getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i, int i2, InterfaceC8585dra interfaceC8585dra, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyListState.scrollToItem(i, i2, interfaceC8585dra);
    }

    public final Object scrollToItem(int i, int i2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$scrollToItem$2(this, i, i2, null), interfaceC8585dra, 1, null);
        e = C8586drb.e();
        return scroll$default == e ? scroll$default : dpR.c;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.scrollPosition.requestPosition(i, i2);
        this.itemAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, o.drX<? super androidx.compose.foundation.gestures.ScrollScope, ? super o.InterfaceC8585dra<? super o.dpR>, ? extends java.lang.Object> r7, o.InterfaceC8585dra<? super o.dpR> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            o.drX r7 = (o.drX) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            o.C8556dpz.d(r8)
            goto L5a
        L45:
            o.C8556dpz.d(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, o.drX, o.dra):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        int e;
        if ((f >= 0.0f || getCanScrollForward()) && (f <= 0.0f || getCanScrollBackward())) {
            if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
            }
            float f2 = this.scrollToBeConsumed + f;
            this.scrollToBeConsumed = f2;
            if (Math.abs(f2) > 0.5f) {
                LazyListMeasureResult value = this.layoutInfoState.getValue();
                float f3 = this.scrollToBeConsumed;
                e = dsT.e(f3);
                LazyListMeasureResult lazyListMeasureResult = this.postLookaheadLayoutInfo;
                boolean tryToApplyScrollWithoutRemeasure = value.tryToApplyScrollWithoutRemeasure(e, !this.hasLookaheadPassOccurred);
                if (tryToApplyScrollWithoutRemeasure && lazyListMeasureResult != null) {
                    tryToApplyScrollWithoutRemeasure = lazyListMeasureResult.tryToApplyScrollWithoutRemeasure(e, true);
                }
                if (tryToApplyScrollWithoutRemeasure) {
                    applyMeasureResult$foundation_release(value, this.hasLookaheadPassOccurred, true);
                    ObservableScopeInvalidator.m385invalidateScopeimpl(this.placementScopeInvalidator);
                    notifyPrefetch(f3 - this.scrollToBeConsumed, value);
                } else {
                    Remeasurement remeasurement = this.remeasurement;
                    if (remeasurement != null) {
                        remeasurement.forceRemeasure();
                    }
                    notifyPrefetch$default(this, f3 - this.scrollToBeConsumed, null, 2, null);
                }
            }
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                return f;
            }
            float f4 = this.scrollToBeConsumed;
            this.scrollToBeConsumed = 0.0f;
            return f - f4;
        }
        return 0.0f;
    }

    static /* synthetic */ void notifyPrefetch$default(LazyListState lazyListState, float f, LazyListLayoutInfo lazyListLayoutInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            lazyListLayoutInfo = lazyListState.getLayoutInfo();
        }
        lazyListState.notifyPrefetch(f, lazyListLayoutInfo);
    }

    private final void notifyPrefetch(float f, LazyListLayoutInfo lazyListLayoutInfo) {
        Object y;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        Object B;
        if (this.prefetchingEnabled && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            boolean z = f < 0.0f;
            if (z) {
                B = C8576dqs.B((List<? extends Object>) lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) B).getIndex() + 1;
            } else {
                y = C8576dqs.y(lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) y).getIndex() - 1;
            }
            if (index == this.indexToPrefetch || index < 0 || index >= lazyListLayoutInfo.getTotalItemsCount()) {
                return;
            }
            if (this.wasScrollingForward != z && (prefetchHandle = this.currentPrefetchHandle) != null) {
                prefetchHandle.cancel();
            }
            this.wasScrollingForward = z;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = this.prefetchState.m377schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyListLayoutInfo lazyListLayoutInfo) {
        Object y;
        int index;
        Object B;
        if (this.indexToPrefetch == -1 || !(!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            B = C8576dqs.B((List<? extends Object>) lazyListLayoutInfo.getVisibleItemsInfo());
            index = ((LazyListItemInfo) B).getIndex() + 1;
        } else {
            y = C8576dqs.y(lazyListLayoutInfo.getVisibleItemsInfo());
            index = ((LazyListItemInfo) y).getIndex() - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResult, z, z2);
    }

    public final void applyMeasureResult$foundation_release(LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2) {
        if (!z && this.hasLookaheadPassOccurred) {
            this.postLookaheadLayoutInfo = lazyListMeasureResult;
            return;
        }
        if (z) {
            this.hasLookaheadPassOccurred = true;
        }
        if (z2) {
            this.scrollPosition.updateScrollOffset(lazyListMeasureResult.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyListMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyListMeasureResult);
        }
        setCanScrollBackward(lazyListMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyListMeasureResult.getCanScrollForward());
        this.scrollToBeConsumed -= lazyListMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z) {
            updateScrollDeltaForPostLookahead(lazyListMeasureResult.getScrollBackAmount());
        }
        this.numMeasurePasses++;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    private final void updateScrollDeltaForPostLookahead(float f) {
        float f2;
        Density density = this.density;
        f2 = LazyListStateKt.DeltaThresholdForScrollAnimation;
        if (f <= density.mo193toPx0680j_4(f2)) {
            return;
        }
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            float floatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, floatValue - f, 0.0f, 0L, 0L, false, 30, (Object) null);
                dwU dwu = this.coroutineScope;
                if (dwu != null) {
                    C8737dwr.c(dwu, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, null), 3, null);
                }
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(C8626dso.e), Float.valueOf(-f), null, 0L, 0L, false, 60, null);
                dwU dwu2 = this.coroutineScope;
                if (dwu2 != null) {
                    C8737dwr.c(dwu2, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, null), 3, null);
                }
            }
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyListItemProvider lazyListItemProvider, int i) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider, i);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    private void setCanScrollForward(boolean z) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean z) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z));
    }
}
