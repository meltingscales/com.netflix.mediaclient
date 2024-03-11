package com.apollographql.apollo3.network.ws;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C9110jR;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class WebSocketNetworkTransport$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C9110jR a;
    private /* synthetic */ Object d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$1(C9110jR c9110jR, InterfaceC8585dra<? super WebSocketNetworkTransport$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = c9110jR;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        WebSocketNetworkTransport$1 webSocketNetworkTransport$1 = new WebSocketNetworkTransport$1(this.a, interfaceC8585dra);
        webSocketNetworkTransport$1.d = obj;
        return webSocketNetworkTransport$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((WebSocketNetworkTransport$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.d
            java.io.Closeable r0 = (java.io.Closeable) r0
            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L14
            goto L39
        L14:
            r7 = move-exception
            goto L43
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            o.C8556dpz.d(r7)
            java.lang.Object r7 = r6.d
            o.dwU r7 = (o.dwU) r7
            o.jR r1 = r6.a
            o.jx r1 = o.C9110jR.c(r1)
            o.jR r4 = r6.a
            r6.d = r1     // Catch: java.lang.Throwable -> L45
            r6.e = r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r7 = o.C9110jR.e(r4, r7, r6)     // Catch: java.lang.Throwable -> L45
            if (r7 != r0) goto L38
            return r0
        L38:
            r0 = r1
        L39:
            o.dpR r7 = o.dpR.c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L53
            r0.close()     // Catch: java.lang.Throwable -> L41
            goto L53
        L41:
            r3 = move-exception
            goto L53
        L43:
            r1 = r0
            goto L46
        L45:
            r7 = move-exception
        L46:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r0 = move-exception
            o.C8549dps.e(r7, r0)
        L50:
            r5 = r3
            r3 = r7
            r7 = r5
        L53:
            if (r3 != 0) goto L5b
            o.C8632dsu.d(r7)
            o.dpR r7 = o.dpR.c
            return r7
        L5b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
