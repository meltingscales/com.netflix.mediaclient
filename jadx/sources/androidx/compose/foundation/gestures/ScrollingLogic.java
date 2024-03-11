package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic {
    private FlingBehavior flingBehavior;
    private final MutableState<Boolean> isNestedFlinging;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    public ScrollingLogic(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        MutableState<Boolean> mutableStateOf$default;
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isNestedFlinging = mutableStateOf$default;
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m211toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m1149getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: singleAxisOffset-MK-Hz9U  reason: not valid java name */
    public final long m207singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m1131copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m1131copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m210toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m1137getXimpl(j) : Offset.m1138getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m209toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m2586getXimpl(j) : Velocity.m2587getYimpl(j);
    }

    /* renamed from: singleAxisVelocity-AH228Gc  reason: not valid java name */
    public final long m208singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m2583copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m2583copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m212updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m2583copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m2583copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U  reason: not valid java name */
    public final long m206reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m1143timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-3eAAhYA  reason: not valid java name */
    public final long m202dispatchScroll3eAAhYA(final ScrollScope scrollScope, long j, final int i) {
        drM<Offset, Offset> drm = new drM<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Offset invoke(Offset offset) {
                return Offset.m1126boximpl(m213invokeMKHz9U(offset.m1146unboximpl()));
            }

            /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
            public final long m213invokeMKHz9U(long j2) {
                NestedScrollDispatcher nestedScrollDispatcher;
                NestedScrollDispatcher nestedScrollDispatcher2;
                nestedScrollDispatcher = ScrollingLogic.this.nestedScrollDispatcher;
                long m1673dispatchPreScrollOzD1aCk = nestedScrollDispatcher.m1673dispatchPreScrollOzD1aCk(j2, i);
                long m1141minusMKHz9U = Offset.m1141minusMKHz9U(j2, m1673dispatchPreScrollOzD1aCk);
                ScrollingLogic scrollingLogic = ScrollingLogic.this;
                float m210toFloatk4lQ0M = scrollingLogic.m210toFloatk4lQ0M(scrollingLogic.m206reverseIfNeededMKHz9U(scrollingLogic.m207singleAxisOffsetMKHz9U(m1141minusMKHz9U)));
                ScrollingLogic scrollingLogic2 = ScrollingLogic.this;
                long m206reverseIfNeededMKHz9U = scrollingLogic2.m206reverseIfNeededMKHz9U(scrollingLogic2.m211toOffsettuRUvjQ(scrollScope.scrollBy(m210toFloatk4lQ0M)));
                long m1141minusMKHz9U2 = Offset.m1141minusMKHz9U(m1141minusMKHz9U, m206reverseIfNeededMKHz9U);
                nestedScrollDispatcher2 = ScrollingLogic.this.nestedScrollDispatcher;
                return Offset.m1142plusMKHz9U(Offset.m1142plusMKHz9U(m1673dispatchPreScrollOzD1aCk, m206reverseIfNeededMKHz9U), nestedScrollDispatcher2.m1671dispatchPostScrollDzOQY0M(m206reverseIfNeededMKHz9U, m1141minusMKHz9U2, i));
            }
        };
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (NestedScrollSource.m1676equalsimpl0(i, NestedScrollSource.Companion.m1682getWheelWNlRxjI())) {
            return drm.invoke(Offset.m1126boximpl(j)).m1146unboximpl();
        }
        if (overscrollEffect != null && getShouldDispatchOverscroll()) {
            return overscrollEffect.mo105applyToScrollRhakbz0(j, i, drm);
        }
        return drm.invoke(Offset.m1126boximpl(j)).m1146unboximpl();
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m205performRawScrollMKHz9U(long j) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m1149getZeroF1C5BW0();
        }
        return m211toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m210toFloatk4lQ0M(j)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* renamed from: onDragStopped-sF-c-tU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m204onDragStoppedsFctU(long r7, o.InterfaceC8585dra<? super o.dpR> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r7 = (androidx.compose.foundation.gestures.ScrollingLogic) r7
            o.C8556dpz.d(r9)
            goto L6e
        L39:
            o.C8556dpz.d(r9)
            r6.registerNestedFling(r4)
            long r7 = r6.m208singleAxisVelocityAH228Gc(r7)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r9 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r9.<init>(r6, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r6.overscrollEffect
            if (r2 == 0) goto L5e
            boolean r5 = r6.getShouldDispatchOverscroll()
            if (r5 == 0) goto L5e
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.mo104applyToFlingBMRW4eQ(r7, r9, r0)
            if (r7 != r1) goto L6d
            return r1
        L5e:
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m2580boximpl(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r9.invoke(r7, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r7 = r6
        L6e:
            r8 = 0
            r7.registerNestedFling(r8)
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m204onDragStoppedsFctU(long, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m203doFlingAnimationQWom1Mo(long r12, o.InterfaceC8585dra<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            r4 = r0
            java.lang.Object r14 = r4.result
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r12 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            o.C8556dpz.d(r14)
            goto L5b
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            o.C8556dpz.d(r14)
            kotlin.jvm.internal.Ref$LongRef r14 = new kotlin.jvm.internal.Ref$LongRef
            r14.<init>()
            r14.a = r12
            androidx.compose.foundation.gestures.ScrollableState r1 = r11.scrollableState
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r3 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r3
            r6 = r11
            r7 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r10)
            r4.L$0 = r14
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5a
            return r0
        L5a:
            r12 = r14
        L5b:
            long r12 = r12.a
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.m2580boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m203doFlingAnimationQWom1Mo(long, o.dra):java.lang.Object");
    }

    public final boolean shouldScrollImmediately() {
        OverscrollEffect overscrollEffect;
        return this.scrollableState.isScrollInProgress() || this.isNestedFlinging.getValue().booleanValue() || ((overscrollEffect = this.overscrollEffect) != null && overscrollEffect.isInProgress());
    }

    public final void registerNestedFling(boolean z) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z));
    }
}
