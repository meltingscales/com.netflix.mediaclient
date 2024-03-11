package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$animatePlacementDelta$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$animatePlacementDelta$1(LazyLayoutAnimation lazyLayoutAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j, InterfaceC8585dra<? super LazyLayoutAnimation$animatePlacementDelta$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new LazyLayoutAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((LazyLayoutAnimation$animatePlacementDelta$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Animatable animatable;
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            animatable = this.this$0.placementDeltaAnimation;
            if (animatable.isRunning()) {
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec3 = this.$spec;
                if (finiteAnimationSpec3 instanceof SpringSpec) {
                    finiteAnimationSpec = (SpringSpec) finiteAnimationSpec3;
                } else {
                    finiteAnimationSpec = LazyLayoutAnimationKt.InterruptionSpec;
                }
            } else {
                finiteAnimationSpec = this.$spec;
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                IntOffset m2525boximpl = IntOffset.m2525boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec2;
                this.label = 1;
                if (animatable3.snapTo(m2525boximpl, this) == e) {
                    return e;
                }
            }
        } else if (i != 1) {
            if (i == 2) {
                C8556dpz.d(obj);
                this.this$0.setPlacementAnimationInProgress(false);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            finiteAnimationSpec2 = (FiniteAnimationSpec) this.L$0;
            C8556dpz.d(obj);
        }
        FiniteAnimationSpec finiteAnimationSpec4 = finiteAnimationSpec2;
        animatable4 = this.this$0.placementDeltaAnimation;
        long m2537unboximpl = ((IntOffset) animatable4.getValue()).m2537unboximpl();
        long j = this.$totalDelta;
        final long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2537unboximpl) - IntOffset.m2533getXimpl(j), IntOffset.m2534getYimpl(m2537unboximpl) - IntOffset.m2534getYimpl(j));
        animatable5 = this.this$0.placementDeltaAnimation;
        IntOffset m2525boximpl2 = IntOffset.m2525boximpl(IntOffset);
        final LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
        drM<Animatable<IntOffset, AnimationVector2D>, dpR> drm = new drM<Animatable<IntOffset, AnimationVector2D>, dpR>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Animatable<IntOffset, AnimationVector2D> animatable6) {
                invoke2(animatable6);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Animatable<IntOffset, AnimationVector2D> animatable6) {
                LazyLayoutAnimation lazyLayoutAnimation2 = LazyLayoutAnimation.this;
                long m2537unboximpl2 = animatable6.getValue().m2537unboximpl();
                long j2 = IntOffset;
                lazyLayoutAnimation2.m359setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m2533getXimpl(m2537unboximpl2) - IntOffset.m2533getXimpl(j2), IntOffset.m2534getYimpl(m2537unboximpl2) - IntOffset.m2534getYimpl(j2)));
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, m2525boximpl2, finiteAnimationSpec4, null, drm, this, 4, null) == e) {
            return e;
        }
        this.this$0.setPlacementAnimationInProgress(false);
        return dpR.c;
    }
}
