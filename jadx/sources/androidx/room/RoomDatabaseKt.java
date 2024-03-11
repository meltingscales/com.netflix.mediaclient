package androidx.room;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8632dsu;
import o.C8738dws;
import o.C8741dwv;
import o.C8774dya;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;
import o.dpR;
import o.dqY;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes5.dex */
public final class RoomDatabaseKt {
    public static final <R> Object withTransaction(RoomDatabase roomDatabase, drM<? super InterfaceC8585dra<? super R>, ? extends Object> drm, InterfaceC8585dra<? super R> interfaceC8585dra) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, drm, null);
        TransactionElement transactionElement = (TransactionElement) interfaceC8585dra.getContext().get(TransactionElement.Key);
        dqY transactionDispatcher$room_ktx_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_ktx_release() : null;
        if (transactionDispatcher$room_ktx_release != null) {
            return C8738dws.c(transactionDispatcher$room_ktx_release, roomDatabaseKt$withTransaction$transactionBlock$1, interfaceC8585dra);
        }
        return startTransactionCoroutine(roomDatabase, interfaceC8585dra.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dqZ createTransactionContext(RoomDatabase roomDatabase, dqY dqy) {
        TransactionElement transactionElement = new TransactionElement(dqy);
        return dqy.plus(transactionElement).plus(C8774dya.b(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    private static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final dqZ dqz, final drX<? super dwU, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super R> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1  reason: invalid class name */
                /* loaded from: classes5.dex */
                static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ InterfaceC8743dwx<R> $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ drX<dwU, InterfaceC8585dra<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(RoomDatabase roomDatabase, InterfaceC8743dwx<? super R> interfaceC8743dwx, drX<? super dwU, ? super InterfaceC8585dra<? super R>, ? extends Object> drx, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = interfaceC8743dwx;
                        this.$transactionBlock = drx;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, interfaceC8585dra);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        dqZ createTransactionContext;
                        InterfaceC8585dra interfaceC8585dra;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            dqZ.b bVar = ((dwU) this.L$0).getCoroutineContext().get(dqY.d);
                            C8632dsu.d(bVar);
                            createTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (dqY) bVar);
                            InterfaceC8585dra interfaceC8585dra2 = this.$continuation;
                            Result.c cVar = Result.e;
                            drX<dwU, InterfaceC8585dra<? super R>, Object> drx = this.$transactionBlock;
                            this.L$0 = interfaceC8585dra2;
                            this.label = 1;
                            obj = C8738dws.c(createTransactionContext, drx, this);
                            if (obj == e) {
                                return e;
                            }
                            interfaceC8585dra = interfaceC8585dra2;
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            interfaceC8585dra = (InterfaceC8585dra) this.L$0;
                            C8556dpz.d(obj);
                        }
                        interfaceC8585dra.resumeWith(Result.e(obj));
                        return dpR.c;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C8738dws.e(dqZ.this.minusKey(dqY.d), new AnonymousClass1(roomDatabase, c8741dwv, drx, null));
                    } catch (Throwable th) {
                        c8741dwv.c(th);
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            c8741dwv.c((Throwable) new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
