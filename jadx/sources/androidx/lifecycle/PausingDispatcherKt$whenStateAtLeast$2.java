package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8738dws;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dxD;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super T>, Object> {
    final /* synthetic */ drX<dwU, InterfaceC8585dra<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, drX<? super dwU, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, InterfaceC8585dra<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC8585dra);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        LifecycleController lifecycleController;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dxD dxd = (dxD) ((dwU) this.L$0).getCoroutineContext().get(dxD.b);
            if (dxd == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, dxd);
            try {
                drX<dwU, InterfaceC8585dra<? super T>, Object> drx = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = C8738dws.c(pausingDispatcher, drx, this);
                if (obj == e) {
                    return e;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            lifecycleController = (LifecycleController) this.L$0;
            try {
                C8556dpz.d(obj);
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.finish();
                throw th;
            }
        }
        lifecycleController.finish();
        return obj;
    }
}
