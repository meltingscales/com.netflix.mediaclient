package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ InterfaceC8743dwx<R> $continuation;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, InterfaceC8743dwx<? super R> interfaceC8743dwx, InterfaceC8585dra<? super CoroutinesRoom$Companion$execute$4$job$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$callable = callable;
        this.$continuation = interfaceC8743dwx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, interfaceC8585dra);
    }

    @Override // o.drX
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            try {
                Object call = this.$callable.call();
                InterfaceC8585dra interfaceC8585dra = this.$continuation;
                Result.c cVar = Result.e;
                interfaceC8585dra.resumeWith(Result.e(call));
            } catch (Throwable th) {
                InterfaceC8585dra interfaceC8585dra2 = this.$continuation;
                Result.c cVar2 = Result.e;
                interfaceC8585dra2.resumeWith(Result.e(C8556dpz.a(th)));
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
