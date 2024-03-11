package androidx.room;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes5.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super R>, Object> {
    final /* synthetic */ drM<InterfaceC8585dra<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super RoomDatabaseKt$withTransaction$transactionBlock$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$this_withTransaction = roomDatabase;
        this.$block = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, interfaceC8585dra);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // o.drX
    public /* bridge */ /* synthetic */ Object invoke(dwU dwu, Object obj) {
        return invoke(dwu, (InterfaceC8585dra) ((InterfaceC8585dra) obj));
    }

    public final Object invoke(dwU dwu, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        TransactionElement transactionElement;
        TransactionElement transactionElement2;
        Throwable th;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            dqZ.b bVar = ((dwU) this.L$0).getCoroutineContext().get(TransactionElement.Key);
            C8632dsu.d(bVar);
            transactionElement = (TransactionElement) bVar;
            transactionElement.acquire();
            try {
                this.$this_withTransaction.beginTransaction();
                try {
                    drM<InterfaceC8585dra<? super R>, Object> drm = this.$block;
                    this.L$0 = transactionElement;
                    this.label = 1;
                    Object invoke = drm.invoke(this);
                    if (invoke == e) {
                        return e;
                    }
                    transactionElement2 = transactionElement;
                    obj = invoke;
                } catch (Throwable th2) {
                    th = th2;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                transactionElement.release();
                throw th;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            transactionElement2 = (TransactionElement) this.L$0;
            try {
                C8556dpz.d(obj);
            } catch (Throwable th4) {
                TransactionElement transactionElement3 = transactionElement2;
                th = th4;
                transactionElement = transactionElement3;
                try {
                    this.$this_withTransaction.endTransaction();
                    throw th;
                } catch (Throwable th5) {
                    transactionElement2 = transactionElement;
                    th = th5;
                    TransactionElement transactionElement4 = transactionElement2;
                    th = th;
                    transactionElement = transactionElement4;
                    transactionElement.release();
                    throw th;
                }
            }
        }
        this.$this_withTransaction.setTransactionSuccessful();
        try {
            this.$this_withTransaction.endTransaction();
            transactionElement2.release();
            return obj;
        } catch (Throwable th6) {
            th = th6;
            TransactionElement transactionElement42 = transactionElement2;
            th = th;
            transactionElement = transactionElement42;
            transactionElement.release();
            throw th;
        }
    }
}
