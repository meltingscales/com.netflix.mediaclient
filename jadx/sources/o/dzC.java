package o;

/* loaded from: classes5.dex */
public final class dzC<T> implements dyQ<T> {
    private final dyQ<T> b;
    private final drX<dyQ<? super T>, InterfaceC8585dra<? super dpR>, Object> e;

    @Override // o.dyQ
    public Object emit(T t, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return this.b.emit(t, interfaceC8585dra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dzC(dyQ<? super T> dyq, drX<? super dyQ<? super T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
        this.b = dyq;
        this.e = drx;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            o.C8556dpz.d(r7)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.d
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.e
            o.dzC r4 = (o.dzC) r4
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L40
            goto L61
        L40:
            r7 = move-exception
            goto L82
        L42:
            o.C8556dpz.d(r7)
            o.dyQ<T> r7 = r6.b
            o.dqZ r2 = r0.getContext()
            kotlinx.coroutines.flow.internal.SafeCollector r5 = new kotlinx.coroutines.flow.internal.SafeCollector
            r5.<init>(r7, r2)
            o.drX<o.dyQ<? super T>, o.dra<? super o.dpR>, java.lang.Object> r7 = r6.e     // Catch: java.lang.Throwable -> L80
            r0.e = r6     // Catch: java.lang.Throwable -> L80
            r0.d = r5     // Catch: java.lang.Throwable -> L80
            r0.b = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
            r2 = r5
        L61:
            r2.releaseIntercepted()
            o.dyQ<T> r7 = r4.b
            boolean r2 = r7 instanceof o.dzC
            if (r2 == 0) goto L7d
            o.dzC r7 = (o.dzC) r7
            r2 = 0
            r0.e = r2
            r0.d = r2
            r0.b = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            o.dpR r7 = o.dpR.c
            return r7
        L7d:
            o.dpR r7 = o.dpR.c
            return r7
        L80:
            r7 = move-exception
            r2 = r5
        L82:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dzC.b(o.dra):java.lang.Object");
    }
}
