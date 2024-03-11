package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable<T, V> animatable, T t, InterfaceC8585dra<? super Animatable$snapTo$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = animatable;
        this.$targetValue = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new Animatable$snapTo$2(this.this$0, this.$targetValue, interfaceC8585dra);
    }

    @Override // o.drM
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Animatable$snapTo$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object clampToBounds;
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            this.this$0.endAnimation();
            clampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
            this.this$0.setTargetValue(clampToBounds);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
