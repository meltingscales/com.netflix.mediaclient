package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super T>, Object> {
    final /* synthetic */ T $curData;
    final /* synthetic */ drX<T, InterfaceC8585dra<? super T>, Object> $transform;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(drX<? super T, ? super InterfaceC8585dra<? super T>, ? extends Object> drx, T t, InterfaceC8585dra<? super SingleProcessDataStore$transformAndWrite$newData$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$transform = drx;
        this.$curData = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, interfaceC8585dra);
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            drX<T, InterfaceC8585dra<? super T>, Object> drx = this.$transform;
            T t = this.$curData;
            this.label = 1;
            obj = drx.invoke(t, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
