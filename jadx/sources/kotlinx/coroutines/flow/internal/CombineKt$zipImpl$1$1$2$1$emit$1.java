package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CombineKt$zipImpl$1$1$2$1$emit$1 extends ContinuationImpl {
    final /* synthetic */ CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass3<T> a;
    /* synthetic */ Object c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$2$1$emit$1(CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass3<? super T> anonymousClass3, InterfaceC8585dra<? super CombineKt$zipImpl$1$1$2$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.a = anonymousClass3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.a.emit(null, this);
    }
}
