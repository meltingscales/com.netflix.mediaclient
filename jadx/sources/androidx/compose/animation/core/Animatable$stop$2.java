package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Animatable$stop$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super dpR>, Object> {
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable<T, V> animatable, InterfaceC8585dra<? super Animatable$stop$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.this$0 = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new Animatable$stop$2(this.this$0, interfaceC8585dra);
    }

    @Override // o.drM
    public final Object invoke(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((Animatable$stop$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            this.this$0.endAnimation();
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
