package o;

/* loaded from: classes5.dex */
public abstract class dyO<T> implements dyP<T> {
    public abstract Object b(dyQ<? super T> dyq, InterfaceC8585dra<? super dpR> interfaceC8585dra);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // o.dyS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(o.dyQ<? super T> r6, o.InterfaceC8585dra<? super o.dpR> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.e
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            o.C8556dpz.d(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            o.dqZ r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.c = r7     // Catch: java.lang.Throwable -> L55
            r0.a = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            o.dpR r6 = o.dpR.c
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dyO.collect(o.dyQ, o.dra):java.lang.Object");
    }
}
