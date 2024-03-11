package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {
    /* synthetic */ Object c;
    int d;
    final /* synthetic */ StartedLazily$command$1.AnonymousClass1<T> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.AnonymousClass1<? super T> anonymousClass1, InterfaceC8585dra<? super StartedLazily$command$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.e = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
