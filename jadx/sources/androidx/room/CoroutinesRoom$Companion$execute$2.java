package androidx.room;

import java.util.concurrent.Callable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes5.dex */
final class CoroutinesRoom$Companion$execute$2<R> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super R>, Object> {
    final /* synthetic */ Callable<R> $callable;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable<R> callable, InterfaceC8585dra<? super CoroutinesRoom$Companion$execute$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CoroutinesRoom$Companion$execute$2(this.$callable, interfaceC8585dra);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return ((CoroutinesRoom$Companion$execute$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            return this.$callable.call();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
