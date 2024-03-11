package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements drX<ScrollScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j, InterfaceC8585dra<? super ScrollingLogic$doFlingAnimation$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, interfaceC8585dra);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // o.drX
    public final Object invoke(ScrollScope scrollScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        ScrollingLogic scrollingLogic;
        FlingBehavior flingBehavior;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            final drM<Offset, Offset> drm = new drM<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ Offset invoke(Offset offset) {
                    return Offset.m1126boximpl(m214invokeMKHz9U(offset.m1146unboximpl()));
                }

                /* renamed from: invoke-MK-Hz9U  reason: not valid java name */
                public final long m214invokeMKHz9U(long j2) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.m206reverseIfNeededMKHz9U(scrollingLogic4.m202dispatchScroll3eAAhYA(scrollScope, scrollingLogic4.m206reverseIfNeededMKHz9U(j2), NestedScrollSource.Companion.m1681getFlingWNlRxjI()));
                }
            };
            final ScrollingLogic scrollingLogic4 = this.this$0;
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f) {
                    ScrollingLogic scrollingLogic5 = ScrollingLogic.this;
                    return scrollingLogic5.m210toFloatk4lQ0M(drm.invoke(Offset.m1126boximpl(scrollingLogic5.m211toOffsettuRUvjQ(f))).m1146unboximpl());
                }
            };
            scrollingLogic = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j2 = this.$available;
            flingBehavior = scrollingLogic.flingBehavior;
            long j3 = longRef2.a;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m209toFloatTH1AsA0(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope2, reverseIfNeeded, this);
            if (obj == e) {
                return e;
            }
            longRef = longRef2;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            j = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            C8556dpz.d(obj);
        }
        longRef.a = scrollingLogic.m212updateQWom1Mo(j, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return dpR.c;
    }
}
