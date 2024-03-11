package com.slack.circuit.retained;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8487dnk;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class ProduceRetainedStateKt$produceRetainedState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<ProduceStateScope<T>, InterfaceC8585dra<? super dpR>, Object> a;
    private /* synthetic */ Object b;
    int d;
    final /* synthetic */ MutableState<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProduceRetainedStateKt$produceRetainedState$1(drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, MutableState<T> mutableState, InterfaceC8585dra<? super ProduceRetainedStateKt$produceRetainedState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = drx;
        this.e = mutableState;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ProduceRetainedStateKt$produceRetainedState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ProduceRetainedStateKt$produceRetainedState$1 produceRetainedStateKt$produceRetainedState$1 = new ProduceRetainedStateKt$produceRetainedState$1(this.a, this.e, interfaceC8585dra);
        produceRetainedStateKt$produceRetainedState$1.b = obj;
        return produceRetainedStateKt$produceRetainedState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            drX<ProduceStateScope<T>, InterfaceC8585dra<? super dpR>, Object> drx = this.a;
            C8487dnk c8487dnk = new C8487dnk(this.e, ((dwU) this.b).getCoroutineContext());
            this.d = 1;
            if (drx.invoke(c8487dnk, this) == e) {
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
