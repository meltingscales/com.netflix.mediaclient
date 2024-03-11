package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    final /* synthetic */ CombineKt$combineInternal$2.AnonymousClass1.AnonymousClass2<T> b;
    /* synthetic */ Object c;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.AnonymousClass1.AnonymousClass2<? super T> anonymousClass2, InterfaceC8585dra<? super CombineKt$combineInternal$2$1$1$emit$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.b = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
