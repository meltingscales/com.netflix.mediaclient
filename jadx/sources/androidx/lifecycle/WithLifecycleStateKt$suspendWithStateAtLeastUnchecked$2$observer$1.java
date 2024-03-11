package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Result;
import o.C8556dpz;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.drO;

/* loaded from: classes5.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements LifecycleEventObserver {
    final /* synthetic */ drO<R> $block;
    final /* synthetic */ InterfaceC8743dwx<R> $co;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX WARN: Multi-variable type inference failed */
    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(Lifecycle.State state, Lifecycle lifecycle, InterfaceC8743dwx<? super R> interfaceC8743dwx, drO<? extends R> dro) {
        this.$state = state;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$co = interfaceC8743dwx;
        this.$block = dro;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Object e;
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) event, "");
        if (event == Lifecycle.Event.Companion.upTo(this.$state)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            InterfaceC8585dra interfaceC8585dra = this.$co;
            drO<R> dro = this.$block;
            try {
                Result.c cVar = Result.e;
                e = Result.e(dro.invoke());
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                e = Result.e(C8556dpz.a(th));
            }
            interfaceC8585dra.resumeWith(e);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            InterfaceC8585dra interfaceC8585dra2 = this.$co;
            Result.c cVar3 = Result.e;
            interfaceC8585dra2.resumeWith(Result.e(C8556dpz.a(new LifecycleDestroyedException())));
        }
    }
}
