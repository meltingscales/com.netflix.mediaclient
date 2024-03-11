package kotlinx.coroutines.rx2;

import io.reactivex.ObservableEmitter;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyS;

/* loaded from: classes5.dex */
public final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ ObservableEmitter<T> b;
    int c;
    final /* synthetic */ dyS<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxConvertKt$asObservable$1$job$1(dyS<? extends T> dys, ObservableEmitter<T> observableEmitter, InterfaceC8585dra<? super RxConvertKt$asObservable$1$job$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = dys;
        this.b = observableEmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.e, this.b, interfaceC8585dra);
        rxConvertKt$asObservable$1$job$1.a = obj;
        return rxConvertKt$asObservable$1$job$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((RxConvertKt$asObservable$1$job$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r6.a
            o.dwU r0 = (o.dwU) r0
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L13
            goto L39
        L13:
            r7 = move-exception
            goto L43
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            o.C8556dpz.d(r7)
            java.lang.Object r7 = r6.a
            o.dwU r7 = (o.dwU) r7
            o.dyS<T> r1 = r6.e     // Catch: java.lang.Throwable -> L3f
            kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$2 r3 = new kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$2     // Catch: java.lang.Throwable -> L3f
            io.reactivex.ObservableEmitter<T> r4 = r6.b     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            r6.a = r7     // Catch: java.lang.Throwable -> L3f
            r6.c = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.collect(r3, r6)     // Catch: java.lang.Throwable -> L3f
            if (r1 != r0) goto L38
            return r0
        L38:
            r0 = r7
        L39:
            io.reactivex.ObservableEmitter<T> r7 = r6.b     // Catch: java.lang.Throwable -> L13
            r7.onComplete()     // Catch: java.lang.Throwable -> L13
            goto L5c
        L3f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L43:
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L57
            io.reactivex.ObservableEmitter<T> r1 = r6.b
            boolean r1 = r1.tryOnError(r7)
            if (r1 != 0) goto L5c
            o.dqZ r0 = r0.getCoroutineContext()
            o.dAX.e(r7, r0)
            goto L5c
        L57:
            io.reactivex.ObservableEmitter<T> r7 = r6.b
            r7.onComplete()
        L5c:
            o.dpR r7 = o.dpR.c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
