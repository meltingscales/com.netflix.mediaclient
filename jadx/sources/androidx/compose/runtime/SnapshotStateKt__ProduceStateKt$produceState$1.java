package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drX<ProduceStateScope<T>, InterfaceC8585dra<? super dpR>, Object> $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__ProduceStateKt$produceState$1(drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, MutableState<T> mutableState, InterfaceC8585dra<? super SnapshotStateKt__ProduceStateKt$produceState$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$producer = drx;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SnapshotStateKt__ProduceStateKt$produceState$1 snapshotStateKt__ProduceStateKt$produceState$1 = new SnapshotStateKt__ProduceStateKt$produceState$1(this.$producer, this.$result, interfaceC8585dra);
        snapshotStateKt__ProduceStateKt$produceState$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1;
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            drX<ProduceStateScope<T>, InterfaceC8585dra<? super dpR>, Object> drx = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, ((dwU) this.L$0).getCoroutineContext());
            this.label = 1;
            if (drx.invoke(produceStateScopeImpl, this) == e) {
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
