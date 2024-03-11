package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.util.concurrent.Callable;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8627dsp;
import o.C8737dwr;
import o.C8738dws;
import o.C8741dwv;
import o.C8769dxw;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqY;
import o.drM;
import o.dxD;

/* loaded from: classes5.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return Companion.execute(roomDatabase, z, cancellationSignal, callable, interfaceC8585dra);
    }

    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, InterfaceC8585dra<? super R> interfaceC8585dra) {
        return Companion.execute(roomDatabase, z, callable, interfaceC8585dra);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, InterfaceC8585dra<? super R> interfaceC8585dra) {
            dqY transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) interfaceC8585dra.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return C8738dws.c(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), interfaceC8585dra);
        }

        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, final CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC8585dra<? super R> interfaceC8585dra) {
            dqY transactionDispatcher;
            InterfaceC8585dra b;
            final dxD c;
            Object e;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) interfaceC8585dra.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            dqY dqy = transactionDispatcher;
            b = C8590drf.b(interfaceC8585dra);
            C8741dwv c8741dwv = new C8741dwv(b, 1);
            c8741dwv.h();
            c = C8737dwr.c(C8769dxw.e, dqy, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c8741dwv, null), 2, null);
            c8741dwv.a((drM<? super Throwable, dpR>) new drM<Throwable, dpR>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(Throwable th) {
                    invoke2(th);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    if (cancellationSignal2 != null) {
                        SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal2);
                    }
                    dxD.b.b(c, null, 1, null);
                }
            });
            Object b2 = c8741dwv.b();
            e = C8586drb.e();
            if (b2 == e) {
                C8592drh.c(interfaceC8585dra);
            }
            return b2;
        }
    }
}
