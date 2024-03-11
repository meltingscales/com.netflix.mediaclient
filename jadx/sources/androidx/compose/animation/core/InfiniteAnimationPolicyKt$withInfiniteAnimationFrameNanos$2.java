package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes.dex */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2<R> extends SuspendLambda implements drM<InterfaceC8585dra<? super R>, Object> {
    final /* synthetic */ drM<Long, R> $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(drM<? super Long, ? extends R> drm, InterfaceC8585dra<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.$onFrame = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, interfaceC8585dra);
    }

    @Override // o.drM
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(InterfaceC8585dra<? super R> interfaceC8585dra) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            drM<Long, R> drm = this.$onFrame;
            this.label = 1;
            obj = MonotonicFrameClockKt.withFrameNanos(drm, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
