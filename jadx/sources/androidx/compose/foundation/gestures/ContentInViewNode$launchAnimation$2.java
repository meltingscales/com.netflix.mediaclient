package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;
import o.dxD;
import o.dxG;
import o.dxK;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, InterfaceC8585dra<? super ContentInViewNode$launchAnimation$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = contentInViewNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, interfaceC8585dra);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ContentInViewNode$launchAnimation$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        ScrollableState scrollableState;
        e = C8586drb.e();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C8556dpz.d(obj);
                    dxD e2 = dxG.e(((dwU) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollableState = this.this$0.scrollState;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, e2, null);
                    this.label = 1;
                    if (ScrollableState.scroll$default(scrollableState, null, anonymousClass1, this, 1, null) == e) {
                        return e;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C8556dpz.d(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return dpR.c;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<ScrollScope, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ dxD $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentInViewNode contentInViewNode, dxD dxd, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.this$0 = contentInViewNode;
            this.$animationJob = dxd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$animationJob, interfaceC8585dra);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        public final Object invoke(ScrollScope scrollScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(scrollScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            UpdatableAnimationState updatableAnimationState;
            float calculateScrollDelta;
            UpdatableAnimationState updatableAnimationState2;
            e = C8586drb.e();
            int i = this.label;
            if (i == 0) {
                C8556dpz.d(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
                updatableAnimationState2 = this.this$0.animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                final dxD dxd = this.$animationJob;
                drM<Float, dpR> drm = new drM<Float, dpR>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Float f) {
                        invoke(f.floatValue());
                        return dpR.c;
                    }

                    public final void invoke(float f) {
                        boolean z;
                        z = ContentInViewNode.this.reverseDirection;
                        float f2 = z ? 1.0f : -1.0f;
                        float scrollBy = f2 * scrollScope.scrollBy(f2 * f);
                        if (Math.abs(scrollBy) < Math.abs(f)) {
                            dxD dxd2 = dxd;
                            dxK.e(dxd2, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + ')', null, 2, null);
                        }
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                drO<dpR> dro = new drO<dpR>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    {
                        super(0);
                    }

                    @Override // o.drO
                    public /* bridge */ /* synthetic */ dpR invoke() {
                        invoke2();
                        return dpR.c;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
                        r2 = r1.getFocusedChildBounds();
                     */
                    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke2() {
                        /*
                            r9 = this;
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue r0 = androidx.compose.foundation.gestures.ContentInViewNode.access$getBringIntoViewRequests$p(r0)
                            androidx.compose.foundation.gestures.ContentInViewNode r7 = androidx.compose.foundation.gestures.ContentInViewNode.this
                        L8:
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            boolean r1 = r1.isNotEmpty()
                            r8 = 1
                            if (r1 == 0) goto L59
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            java.lang.Object r1 = r1.last()
                            androidx.compose.foundation.gestures.ContentInViewNode$Request r1 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r1
                            o.drO r1 = r1.getCurrentBounds()
                            java.lang.Object r1 = r1.invoke()
                            r2 = r1
                            androidx.compose.ui.geometry.Rect r2 = (androidx.compose.ui.geometry.Rect) r2
                            if (r2 != 0) goto L2b
                            goto L36
                        L2b:
                            r3 = 0
                            r5 = 1
                            r6 = 0
                            r1 = r7
                            boolean r1 = androidx.compose.foundation.gestures.ContentInViewNode.m157isMaxVisibleO0kMr_c$default(r1, r2, r3, r5, r6)
                            if (r1 == 0) goto L59
                        L36:
                            androidx.compose.runtime.collection.MutableVector r1 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            androidx.compose.runtime.collection.MutableVector r2 = androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue.access$getRequests$p(r0)
                            int r2 = r2.getSize()
                            int r2 = r2 - r8
                            java.lang.Object r1 = r1.removeAt(r2)
                            androidx.compose.foundation.gestures.ContentInViewNode$Request r1 = (androidx.compose.foundation.gestures.ContentInViewNode.Request) r1
                            o.dwx r1 = r1.getContinuation()
                            o.dpR r2 = o.dpR.c
                            kotlin.Result$c r3 = kotlin.Result.e
                            java.lang.Object r2 = kotlin.Result.e(r2)
                            r1.resumeWith(r2)
                            goto L8
                        L59:
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            boolean r0 = androidx.compose.foundation.gestures.ContentInViewNode.access$getTrackingFocusedChild$p(r0)
                            if (r0 == 0) goto L7b
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.ui.geometry.Rect r2 = androidx.compose.foundation.gestures.ContentInViewNode.access$getFocusedChildBounds(r0)
                            if (r2 == 0) goto L7b
                            androidx.compose.foundation.gestures.ContentInViewNode r1 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            r3 = 0
                            r5 = 1
                            r6 = 0
                            boolean r0 = androidx.compose.foundation.gestures.ContentInViewNode.m157isMaxVisibleO0kMr_c$default(r1, r2, r3, r5, r6)
                            if (r0 != r8) goto L7b
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            r1 = 0
                            androidx.compose.foundation.gestures.ContentInViewNode.access$setTrackingFocusedChild$p(r0, r1)
                        L7b:
                            androidx.compose.foundation.gestures.ContentInViewNode r0 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            androidx.compose.foundation.gestures.UpdatableAnimationState r0 = androidx.compose.foundation.gestures.ContentInViewNode.access$getAnimationState$p(r0)
                            androidx.compose.foundation.gestures.ContentInViewNode r1 = androidx.compose.foundation.gestures.ContentInViewNode.this
                            float r1 = androidx.compose.foundation.gestures.ContentInViewNode.access$calculateScrollDelta(r1)
                            r0.setValue(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1.AnonymousClass2.invoke2():void");
                    }
                };
                this.label = 1;
                if (updatableAnimationState2.animateToZero(drm, dro, this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            return dpR.c;
        }
    }
}
