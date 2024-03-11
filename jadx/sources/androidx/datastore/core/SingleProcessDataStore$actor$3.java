package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$actor$3<T> extends SuspendLambda implements drX<SingleProcessDataStore.Message<T>, InterfaceC8585dra<? super dpR>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, InterfaceC8585dra<? super SingleProcessDataStore$actor$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, interfaceC8585dra);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    public final Object invoke(SingleProcessDataStore.Message<T> message, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SingleProcessDataStore$actor$3) create(message, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(Object obj, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return invoke((SingleProcessDataStore.Message) ((SingleProcessDataStore.Message) obj), interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Object handleUpdate;
        Object handleRead;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            SingleProcessDataStore.Message message = (SingleProcessDataStore.Message) this.L$0;
            if (message instanceof SingleProcessDataStore.Message.Read) {
                this.label = 1;
                handleRead = this.this$0.handleRead((SingleProcessDataStore.Message.Read) message, this);
                if (handleRead == e) {
                    return e;
                }
            } else if (message instanceof SingleProcessDataStore.Message.Update) {
                this.label = 2;
                handleUpdate = this.this$0.handleUpdate((SingleProcessDataStore.Message.Update) message, this);
                if (handleUpdate == e) {
                    return e;
                }
            }
        } else if (i == 1 || i == 2) {
            C8556dpz.d(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dpR.c;
    }
}
