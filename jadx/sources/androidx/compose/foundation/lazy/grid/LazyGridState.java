package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.Pair;
import o.C8569dql;
import o.C8576dqs;
import o.C8586drb;
import o.C8627dsp;
import o.C8654dtp;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dsT;

/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new drX<SaverScope, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // o.drX
        public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
            List<Integer> j;
            j = C8569dql.j(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
            return j;
        }
    }, new drM<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // o.drM
        public /* bridge */ /* synthetic */ LazyGridState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final LazyGridState invoke2(List<Integer> list) {
            return new LazyGridState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private final LazyGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private Density density;
    private final MutableInteractionSource internalInteractionSource;
    private boolean isVertical;
    private final MutableState<LazyGridMeasureResult> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final MutableState<dpR> placementScopeInvalidator;
    private final MutableState prefetchInfoRetriever$delegate;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    private final MutableIntState slotsPerLine$delegate;
    private boolean wasScrollingForward;

    public LazyGridState() {
        this(0, 0, 3, null);
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release  reason: not valid java name */
    public final MutableState<dpR> m357getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
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

    public final void setDensity$foundation_release(Density density) {
        this.density = density;
    }

    public final void setRemeasurement$foundation_release(Remeasurement remeasurement) {
        this.remeasurement = remeasurement;
    }

    public final void setVertical$foundation_release(boolean z) {
        this.isVertical = z;
    }

    public LazyGridState(int i, int i2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i, i2);
        this.scrollPosition = lazyGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyGridStateKt.access$getEmptyLazyGridLayoutInfo$p(), SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.isVertical = true;
        this.scrollableState = ScrollableStateKt.ScrollableState(new drM<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final Float invoke(float f) {
                return Float.valueOf(-LazyGridState.this.onScroll$foundation_release(-f));
            }

            @Override // o.drM
            public /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                LazyGridState.this.setRemeasurement$foundation_release(remeasurement);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new drM<Integer, List<? extends Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchInfoRetriever$2
            @Override // o.drM
            public /* synthetic */ List<? extends Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final List<Pair<Integer, Constraints>> invoke(int i3) {
                List<Pair<Integer, Constraints>> i4;
                i4 = C8569dql.i();
                return i4;
            }
        }, null, 2, null);
        this.prefetchInfoRetriever$delegate = mutableStateOf$default;
        this.placementAnimator = new LazyGridItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m382constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default3;
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public /* synthetic */ LazyGridState(int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final C8654dtp getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i, int i2, InterfaceC8585dra interfaceC8585dra, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lazyGridState.scrollToItem(i, i2, interfaceC8585dra);
    }

    public final Object scrollToItem(int i, int i2, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i, i2, null), interfaceC8585dra, 1, null);
        e = C8586drb.e();
        return scroll$default == e ? scroll$default : dpR.c;
    }

    public final void snapToItemIndexInternal$foundation_release(int i, int i2) {
        this.scrollPosition.requestPosition(i, i2);
        this.placementAnimator.reset();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
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
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, o.drX, o.dra):java.lang.Object");
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
                LazyGridMeasureResult value = this.layoutInfoState.getValue();
                float f3 = this.scrollToBeConsumed;
                e = dsT.e(f3);
                if (value.tryToApplyScrollWithoutRemeasure(e)) {
                    applyMeasureResult$foundation_release(value, true);
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

    static /* synthetic */ void notifyPrefetch$default(LazyGridState lazyGridState, float f, LazyGridLayoutInfo lazyGridLayoutInfo, int i, Object obj) {
        if ((i & 2) != 0) {
            lazyGridLayoutInfo = lazyGridState.layoutInfoState.getValue();
        }
        lazyGridState.notifyPrefetch(f, lazyGridLayoutInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2 A[LOOP:1: B:35:0x00b0->B:36:0x00b2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void notifyPrefetch(float r8, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo r9) {
        /*
            r7 = this;
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState r0 = r7.prefetchState
            boolean r1 = r7.prefetchingEnabled
            if (r1 != 0) goto L7
            return
        L7:
            java.util.List r1 = r9.getVisibleItemsInfo()
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto Ld8
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r1 = 0
            if (r8 >= 0) goto L1b
            r8 = r2
            goto L1c
        L1b:
            r8 = r1
        L1c:
            if (r8 == 0) goto L46
            java.util.List r3 = r9.getVisibleItemsInfo()
            java.lang.Object r3 = o.C8570dqm.g(r3)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r3 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r3
            boolean r4 = r7.isVertical
            if (r4 == 0) goto L31
            int r3 = r3.getRow()
            goto L35
        L31:
            int r3 = r3.getColumn()
        L35:
            int r3 = r3 + r2
            java.util.List r4 = r9.getVisibleItemsInfo()
            java.lang.Object r4 = o.C8570dqm.g(r4)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r4 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r4
            int r4 = r4.getIndex()
            int r4 = r4 + r2
            goto L6e
        L46:
            java.util.List r3 = r9.getVisibleItemsInfo()
            java.lang.Object r3 = o.C8570dqm.b(r3)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r3 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r3
            boolean r4 = r7.isVertical
            if (r4 == 0) goto L59
            int r3 = r3.getRow()
            goto L5d
        L59:
            int r3 = r3.getColumn()
        L5d:
            int r3 = r3 + (-1)
            java.util.List r4 = r9.getVisibleItemsInfo()
            java.lang.Object r4 = o.C8570dqm.b(r4)
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo r4 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) r4
            int r4 = r4.getIndex()
            int r4 = r4 - r2
        L6e:
            int r5 = r7.lineToPrefetch
            if (r3 == r5) goto Ld8
            if (r4 < 0) goto Ld8
            int r9 = r9.getTotalItemsCount()
            if (r4 >= r9) goto Ld8
            boolean r9 = r7.wasScrollingForward
            if (r9 == r8) goto L95
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r9 = r7.currentLinePrefetchHandles
            int r4 = r9.getSize()
            if (r4 <= 0) goto L95
            java.lang.Object[] r9 = r9.getContent()
            r5 = r1
        L8b:
            r6 = r9[r5]
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r6 = (androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle) r6
            r6.cancel()
            int r5 = r5 + r2
            if (r5 < r4) goto L8b
        L95:
            r7.wasScrollingForward = r8
            r7.lineToPrefetch = r3
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r8 = r7.currentLinePrefetchHandles
            r8.clear()
            o.drM r8 = r7.getPrefetchInfoRetriever$foundation_release()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Object r8 = r8.invoke(r9)
            java.util.List r8 = (java.util.List) r8
            int r9 = r8.size()
        Lb0:
            if (r1 >= r9) goto Ld8
            java.lang.Object r2 = r8.get(r1)
            kotlin.Pair r2 = (kotlin.Pair) r2
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle> r3 = r7.currentLinePrefetchHandles
            java.lang.Object r4 = r2.d()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r2 = r2.a()
            androidx.compose.ui.unit.Constraints r2 = (androidx.compose.ui.unit.Constraints) r2
            long r5 = r2.m2478unboximpl()
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle r2 = r0.m377schedulePrefetch0kLqBqw(r4, r5)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lb0
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.notifyPrefetch(float, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo):void");
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo lazyGridLayoutInfo) {
        Object y;
        int row;
        Object B;
        if (this.lineToPrefetch == -1 || !(!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            return;
        }
        if (this.wasScrollingForward) {
            B = C8576dqs.B((List<? extends Object>) lazyGridLayoutInfo.getVisibleItemsInfo());
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) B;
            row = (this.isVertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            y = C8576dqs.y(lazyGridLayoutInfo.getVisibleItemsInfo());
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) y;
            row = (this.isVertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            int size = mutableVector.getSize();
            if (size <= 0) {
                this.currentLinePrefetchHandles.clear();
            }
            LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].cancel();
                i++;
            } while (i < size);
            this.currentLinePrefetchHandles.clear();
        }
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult lazyGridMeasureResult, boolean z) {
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        if (z) {
            this.scrollPosition.updateScrollOffset(lazyGridMeasureResult.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyGridMeasureResult);
        }
        setCanScrollBackward(lazyGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
        this.numMeasurePasses++;
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider lazyGridItemProvider, int i) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider, i);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }

    public final void setSlotsPerLine$foundation_release(int i) {
        this.slotsPerLine$delegate.setIntValue(i);
    }

    public final drM<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (drM) this.prefetchInfoRetriever$delegate.getValue();
    }

    public final void setPrefetchInfoRetriever$foundation_release(drM<? super Integer, ? extends List<Pair<Integer, Constraints>>> drm) {
        this.prefetchInfoRetriever$delegate.setValue(drm);
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
