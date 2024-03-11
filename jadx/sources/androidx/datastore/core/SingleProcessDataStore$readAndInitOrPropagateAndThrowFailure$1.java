package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC8585dra;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC8585dra<? super SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1> interfaceC8585dra) {
        super(interfaceC8585dra);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readAndInitOrPropagateAndThrowFailure;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readAndInitOrPropagateAndThrowFailure = this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        return readAndInitOrPropagateAndThrowFailure;
    }
}
